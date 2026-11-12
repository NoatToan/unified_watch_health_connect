package com.huawei.watchface.mvp.model.thread;

import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.t2;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public abstract class MembershipPostRequest<T> extends t2 {
    public MembershipPostRequest(ResponseListener responseListener, String str, Class cls) {
        a(responseListener, str, cls);
    }

    private LinkedHashMap e() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        addHeaderParams(linkedHashMap);
        return linkedHashMap;
    }

    public abstract void addHeaderParams(LinkedHashMap<String, String> linkedHashMap);

    public abstract String buildRequestParams();

    @Override // com.huawei.watchface.t2
    public String c(String str) {
        return a(str, buildRequestParams(), e());
    }
}
