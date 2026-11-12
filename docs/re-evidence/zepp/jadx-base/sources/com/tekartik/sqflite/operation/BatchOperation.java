package com.tekartik.sqflite.operation;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class BatchOperation extends BaseOperation {
    public final Map<String, Object> a;
    public final BatchOperationResult b = new BatchOperationResult();
    public final boolean c;

    public class BatchOperationResult implements OperationResult {
        public Object a;
        public String b;
        public String c;
        public Object d;

        public BatchOperationResult() {
        }

        @Override // com.tekartik.sqflite.operation.OperationResult
        public void error(String str, String str2, Object obj) {
            this.b = str;
            this.c = str2;
            this.d = obj;
        }

        @Override // com.tekartik.sqflite.operation.OperationResult
        public void success(Object obj) {
            this.a = obj;
        }
    }

    public BatchOperation(Map<String, Object> map, boolean z) {
        this.a = map;
        this.c = z;
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public <T> T getArgument(String str) {
        return (T) this.a.get(str);
    }

    @Override // com.tekartik.sqflite.operation.Operation
    public String getMethod() {
        return (String) this.a.get("method");
    }

    @Override // com.tekartik.sqflite.operation.BaseReadOperation, com.tekartik.sqflite.operation.Operation
    public boolean getNoResult() {
        return this.c;
    }

    public Map<String, Object> getOperationError() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("code", this.b.b);
        map2.put("message", this.b.c);
        map2.put("data", this.b.d);
        map.put("error", map2);
        return map;
    }

    @Override // com.tekartik.sqflite.operation.BaseOperation, com.tekartik.sqflite.operation.BaseReadOperation
    public OperationResult getOperationResult() {
        return this.b;
    }

    public Map<String, Object> getOperationSuccessResult() {
        HashMap map = new HashMap();
        map.put("result", this.b.a);
        return map;
    }

    public void handleError(MethodChannel.Result result) {
        BatchOperationResult batchOperationResult = this.b;
        result.error(batchOperationResult.b, batchOperationResult.c, batchOperationResult.d);
    }

    public void handleErrorContinue(List<Map<String, Object>> list) {
        if (getNoResult()) {
            return;
        }
        list.add(getOperationError());
    }

    public void handleSuccess(List<Map<String, Object>> list) {
        if (getNoResult()) {
            return;
        }
        list.add(getOperationSuccessResult());
    }
}
