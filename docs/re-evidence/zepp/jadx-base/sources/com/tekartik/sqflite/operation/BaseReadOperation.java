package com.tekartik.sqflite.operation;

import com.tekartik.sqflite.Constant;
import com.tekartik.sqflite.SqlCommand;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseReadOperation implements Operation {
    private Boolean a(String str) {
        Object argument = getArgument(str);
        if (argument instanceof Boolean) {
            return (Boolean) argument;
        }
        return null;
    }

    private String b() {
        return (String) getArgument(Constant.PARAM_SQL);
    }

    private List<Object> c() {
        return (List) getArgument(Constant.PARAM_SQL_ARGUMENTS);
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public boolean getContinueOnError() {
        return Boolean.TRUE.equals(getArgument(Constant.PARAM_CONTINUE_OR_ERROR));
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public Boolean getInTransaction() {
        return a(Constant.PARAM_IN_TRANSACTION);
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public boolean getNoResult() {
        return Boolean.TRUE.equals(getArgument(Constant.PARAM_NO_RESULT));
    }

    public abstract OperationResult getOperationResult();

    @Override // com.tekartik.sqflite.operation.Operation
    public SqlCommand getSqlCommand() {
        return new SqlCommand(b(), c());
    }
}
