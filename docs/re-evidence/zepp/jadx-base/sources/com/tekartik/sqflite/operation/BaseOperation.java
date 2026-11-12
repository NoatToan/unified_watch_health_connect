package com.tekartik.sqflite.operation;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseOperation extends BaseReadOperation {
    @Override // com.tekartik.sqflite.operation.OperationResult
    public void error(String str, String str2, Object obj) {
        getOperationResult().error(str, str2, obj);
    }

    @Override // com.tekartik.sqflite.operation.BaseReadOperation
    public abstract OperationResult getOperationResult();

    @Override // com.tekartik.sqflite.operation.OperationResult
    public void success(Object obj) {
        getOperationResult().success(obj);
    }
}
