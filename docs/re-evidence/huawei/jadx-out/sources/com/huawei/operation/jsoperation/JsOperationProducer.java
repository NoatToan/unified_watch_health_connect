package com.huawei.operation.jsoperation;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class JsOperationProducer {
    private static final Map<String, JsCommand> REQUEST;

    static {
        HashMap map = new HashMap(2);
        REQUEST = map;
        map.put(JsUtil.ServiceType.STRESS, new StressService());
        map.put(JsUtil.ServiceType.DATA, new DataService());
    }

    private JsOperationProducer() {
    }

    public static JsCommand produceRequest(String str) {
        return REQUEST.get(str);
    }
}
