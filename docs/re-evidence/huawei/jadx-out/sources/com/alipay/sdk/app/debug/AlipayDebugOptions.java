package com.alipay.sdk.app.debug;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AlipayDebugOptions {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlipayPayLifeCycle f2082b;

    public interface AlipayPayLifeCycle {
        void onPayEnd(JSONObject jSONObject);
    }

    public AlipayPayLifeCycle e() {
        return this.f2082b;
    }
}
