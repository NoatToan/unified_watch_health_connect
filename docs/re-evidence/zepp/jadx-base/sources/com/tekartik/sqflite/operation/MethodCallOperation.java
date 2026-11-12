package com.tekartik.sqflite.operation;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes18.dex */
public class MethodCallOperation extends BaseOperation {
    public final MethodCall a;
    public final a b;

    public class a implements OperationResult {
        public final MethodChannel.Result a;

        public a(MethodChannel.Result result) {
            this.a = result;
        }

        @Override // com.tekartik.sqflite.operation.OperationResult
        public void error(String str, String str2, Object obj) {
            this.a.error(str, str2, obj);
        }

        @Override // com.tekartik.sqflite.operation.OperationResult
        public void success(Object obj) {
            this.a.success(obj);
        }
    }

    public MethodCallOperation(MethodCall methodCall, MethodChannel.Result result) {
        this.a = methodCall;
        this.b = new a(result);
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public <T> T getArgument(String str) {
        return (T) this.a.argument(str);
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public String getMethod() {
        return this.a.method;
    }

    @Override // com.tekartik.sqflite.operation.BaseOperation, com.tekartik.sqflite.operation.BaseReadOperation
    public OperationResult getOperationResult() {
        return this.b;
    }
}
