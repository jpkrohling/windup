package org.jboss.windup.config.operation.ruleelement;

import java.io.File;

import org.jboss.windup.config.GraphRewrite;
import org.jboss.windup.graph.GraphUtil;
import org.jboss.windup.graph.model.ApplicationReferenceModel;
import org.jboss.windup.graph.model.ArchiveModel;
import org.jboss.windup.graph.model.resource.FileModel;
import org.ocpsoft.rewrite.context.EvaluationContext;

public class AddArchiveReferenceInformation extends AbstractIterationOperator<FileModel>
{
    public AddArchiveReferenceInformation(String variableName)
    {
        super(FileModel.class, variableName);
    }

    public static AddArchiveReferenceInformation addReferenceInformation(String variableName)
    {
        return new AddArchiveReferenceInformation(variableName);
    }

    @Override
    public void perform(GraphRewrite event, EvaluationContext context, FileModel fileResourceModel)
    {
        File file = new File(fileResourceModel.getFilePath());
        ArchiveModel archiveResourceModel = GraphUtil.addTypeToModel(event.getGraphContext(),
                    fileResourceModel, ArchiveModel.class);

        archiveResourceModel.setArchiveName(file.getName());

        ApplicationReferenceModel appRefModel = event.getGraphContext().getFramed()
                    .addVertex(null, ApplicationReferenceModel.class);
        appRefModel.setArchive(archiveResourceModel);
    }
}
