package com.huawei.phoneservice.feedbackcommon.network;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.phoneservice.faq.base.network.FaqRestClient;
import com.huawei.phoneservice.faq.base.util.r;
import com.huawei.phoneservice.feedbackcommon.entity.aa;
import defpackage.zcm;
import defpackage.zcp;

/* JADX INFO: loaded from: classes13.dex */
public final class ProblemApi extends FaqRestClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21882a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f21883b;
    private static volatile ProblemApi e;
    private Context d;

    public final Submit e(aa aaVar, Callback callback) {
        zcp.c(aaVar, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21883b;
        String strA = r.a(FeedbackWebConstants.SET_READ_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(aaVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit e(com.huawei.phoneservice.feedbackcommon.entity.r rVar, Callback callback) {
        zcp.c(rVar, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21883b;
        String strA = r.a(FeedbackWebConstants.HISTORY_FEEDBACK_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(rVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public static final class c {
        public final ProblemApi d(Context context) {
            ProblemApi.f21883b = context != null ? context.getApplicationContext() : null;
            if (ProblemApi.e == null) {
                ProblemApi.e = new ProblemApi(ProblemApi.f21883b);
            }
            return ProblemApi.e;
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }

        private c() {
        }
    }

    public ProblemApi(Context context) {
        super(context);
        this.d = context;
    }
}
