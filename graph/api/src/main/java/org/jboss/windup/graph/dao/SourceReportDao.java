package org.jboss.windup.graph.dao;

import org.jboss.windup.graph.model.meta.report.SourceReportModel;
import org.jboss.windup.graph.model.resource.FileModel;
import org.jboss.windup.graph.model.resource.ResourceModel;

public interface SourceReportDao extends BaseDao<SourceReportModel>
{
    public boolean hasSourceReport(ResourceModel resource);

    public FileModel getResourceReport(ResourceModel resource);
}
