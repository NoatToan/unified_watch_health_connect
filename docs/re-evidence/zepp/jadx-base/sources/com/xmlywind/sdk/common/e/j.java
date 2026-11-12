package com.xmlywind.sdk.common.e;

import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.models.ModelBuilderCreator;
import com.xmlywind.sdk.common.models.ssp.pb.SdkConfigRequest;
import com.xmlywind.sdk.common.models.ssp.pb.SdkConfigResponse;
import com.xmlywind.volley.p;

/* JADX INFO: loaded from: classes22.dex */
public class j extends k<SdkConfigResponse> {
    private final a b;
    private final SdkConfigRequest.Builder c;

    public interface a extends com.xmlywind.volley.n.a {
        void a(SdkConfigResponse sdkConfigResponse);
    }

    public j(String str, a aVar) {
        super(str, 1, aVar);
        this.b = aVar;
        a((p) new com.xmlywind.volley.c(10000, 2, 0.0f));
        a(false);
        this.c = ModelBuilderCreator.createSdkConfigRequest();
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public com.xmlywind.volley.n<SdkConfigResponse> a(com.xmlywind.volley.i iVar) {
        try {
            return com.xmlywind.volley.n.a(SdkConfigResponse.ADAPTER.decode(iVar.b), com.xmlywind.volley.toolbox.h.a(iVar));
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            return com.xmlywind.volley.n.a(new com.xmlywind.volley.k(th));
        }
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public String a() {
        return "application/octet-stream";
    }

    @Override // com.xmlywind.volley.l
    public void a(SdkConfigResponse sdkConfigResponse) {
        this.b.a(sdkConfigResponse);
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public byte[] b() {
        if (!TextUtils.isEmpty(com.xmlywind.sdk.common.a.n().X().getCountry())) {
            this.c.country(com.xmlywind.sdk.common.a.n().X().getCountry());
        }
        if (!TextUtils.isEmpty(com.xmlywind.sdk.common.a.n().X().getLanguage())) {
            this.c.language(com.xmlywind.sdk.common.a.n().X().getLanguage().toUpperCase());
        }
        if (!TextUtils.isEmpty(com.xmlywind.sdk.common.a.n().t())) {
            this.c.android_id(com.xmlywind.sdk.common.a.n().t());
        }
        if (!TextUtils.isEmpty(com.xmlywind.sdk.common.a.n().y())) {
            this.c.imei(com.xmlywind.sdk.common.a.n().y());
        }
        this.c.geo(ModelBuilderCreator.createGeo().build());
        this.c.device(ModelBuilderCreator.createDevice().build());
        if (!TextUtils.isEmpty(com.xmlywind.sdk.common.a.n().w())) {
            this.c.gaid(com.xmlywind.sdk.common.a.n().w());
        }
        SdkConfigRequest sdkConfigRequestBuild = this.c.build();
        SigmobLog.d("send SdkConfig Request: " + sdkConfigRequestBuild.toString());
        return sdkConfigRequestBuild.encode();
    }
}
