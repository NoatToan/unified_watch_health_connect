package com.tekartik.sqflite.operation;

import com.tekartik.sqflite.SqlCommand;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes18.dex */
public class ExecuteOperation extends BaseReadOperation {
    private final SqlCommand a;
    private final MethodChannel.Result b;
    private final Boolean c;

    public ExecuteOperation(MethodChannel.Result result, SqlCommand sqlCommand, Boolean bool) {
        this.b = result;
        this.a = sqlCommand;
        this.c = bool;
    }

    @Override // com.tekartik.sqflite.operation.OperationResult
    public void error(String str, String str2, Object obj) {
        this.b.error(str, str2, obj);
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public <T> T getArgument(String str) {
        return null;
    }

    @Override // com.tekartik.sqflite.operation.BaseReadOperation, com.tekartik.sqflite.operation.Operation
    public Boolean getInTransaction() {
        return this.c;
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public String getMethod() {
        return null;
    }

    @Override // com.tekartik.sqflite.operation.BaseReadOperation
    public OperationResult getOperationResult() {
        return null;
    }

    @Override // com.tekartik.sqflite.operation.BaseReadOperation, com.tekartik.sqflite.operation.Operation
    public SqlCommand getSqlCommand() {
        return this.a;
    }

    @Override // com.tekartik.sqflite.operation.OperationResult
    public void success(Object obj) {
        this.b.success(obj);
    }
}
