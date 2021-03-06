package org.jboss.windup.rules.apps.java.scan.ast;

public enum ClassCandidateType
{
    IMPORT,
    TYPE,
    METHOD,
    INHERITANCE,
    CONSTRUCTOR_CALL,
    METHOD_CALL,
    METHOD_PARAMETER,
    ANNOTATION,
    RETURN_TYPE,
    INSTANCE_OF,
    THROWS_METHOD_DECLARATION,
    THROW_STATEMENT,
    CATCH_EXCEPTION_STATEMENT,
    FIELD_DECLARATION,
    VARIABLE_DECLARATION,
    IMPLEMENTS_TYPE,
    EXTENDS_TYPE
}
