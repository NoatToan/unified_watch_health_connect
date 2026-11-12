package com.huawei.phoneservice.faq.base.network;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.entity.ModuleConfigRequest;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.r;
import defpackage.zcm;
import defpackage.zcp;

/* JADX INFO: loaded from: classes13.dex */
public final class FaqSdkAddressApi extends FaqRestClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f21555c = new d(null);
    private static volatile FaqSdkAddressApi d;
    private static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21557b;
    private Context f;

    public final Submit d(com.huawei.phoneservice.faq.base.entity.e eVar, Callback callback) {
        zcp.c(eVar, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = e;
        String strB = b();
        String json = getGson().toJson(eVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strB, json, callback);
    }

    public final Submit e(ModuleConfigRequest moduleConfigRequest, Callback callback) {
        zcp.c(moduleConfigRequest, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = e;
        String strA = r.a(this.f21556a);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(moduleConfigRequest);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    private final String b() {
        StringBuilder sb;
        String str;
        if (zcp.b((Object) "Y", (Object) i.d().getSdk(FaqConstants.FAQ_USE_OLD_DOMAIN))) {
            sb = new StringBuilder();
            sb.append(r.e());
            str = "/secured/CCPC/EN/";
        } else {
            sb = new StringBuilder();
            sb.append(r.b());
            str = "/forward/ccpc_gateway_sdk/";
        }
        sb.append(str);
        sb.append(this.f21557b);
        sb.append("/1");
        return sb.toString();
    }

    public static final class d {
        public final FaqSdkAddressApi b(Context context) {
            FaqSdkAddressApi.e = context != null ? context.getApplicationContext() : null;
            if (FaqSdkAddressApi.d == null) {
                FaqSdkAddressApi.d = new FaqSdkAddressApi(FaqSdkAddressApi.e);
            }
            return FaqSdkAddressApi.d;
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }

        private d() {
        }
    }

    public FaqSdkAddressApi(Context context) {
        super(context);
        this.f21557b = "ccpc/queryRoutesInfo";
        this.f21556a = "ccpc/queryModuleList";
        this.f = context;
    }
}
