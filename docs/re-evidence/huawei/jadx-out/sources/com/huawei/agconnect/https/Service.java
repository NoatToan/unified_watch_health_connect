package com.huawei.agconnect.https;

import com.huawei.hmf.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public interface Service {
    Task<HttpsResult> execute(Method method);

    public static class Factory {
        public static Service get(HttpsKit httpsKit) {
            return new HttpsService(httpsKit.client(), httpsKit.executor());
        }
    }
}
