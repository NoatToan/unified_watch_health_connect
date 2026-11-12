package com.huawei.phoneservice.feedbackcommon.network;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.network.FaqRestClient;
import com.huawei.phoneservice.faq.base.util.r;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.k;
import defpackage.zcm;
import defpackage.zcp;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public final class ProblemSuggestApi extends FaqRestClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f21884a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ProblemSuggestApi f21885c;
    public static final e e = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21886b;

    public final Submit b(FeedBackRequest feedBackRequest, Callback callback) {
        zcp.c(feedBackRequest, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f21886b);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21884a;
        String strA = r.a(FeedbackWebConstants.HISTORY_FEEDBACK_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(feedBackRequest);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final com.huawei.hms.network.httpclient.Submit<ResponseBody> a(File file, String str, String str2, com.huawei.hms.network.httpclient.Callback<ResponseBody> callback) {
        zcp.c(file, "");
        zcp.c(callback, "");
        String str3 = zcp.b((Object) "2", (Object) com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk(FaqConstants.FAQ_UPLOAD_FLAG)) ? FeedbackWebConstants.PROBLEM_SUGGEST_FILES_URL : FeedbackWebConstants.PROBLEM_SUGGEST_FILES_URL_V2;
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f21886b);
        zcp.e(faqRestClientInitRestClientAnno);
        return faqRestClientInitRestClientAnno.uploadAttachs(f21884a, r.h() + str3, str2, str, file, callback);
    }

    public final Submit b(k kVar, Callback callback) {
        zcp.c(kVar, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f21886b);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21884a;
        String strA = r.a(FeedbackWebConstants.QUERY_FEEDBACK_FORHD);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(kVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit a(com.huawei.phoneservice.feedbackcommon.entity.e eVar, Callback callback) {
        zcp.c(eVar, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f21886b);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21884a;
        String strA = r.a(FeedbackWebConstants.DELETE_HISTORY_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(eVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit e(FeedBackRequest feedBackRequest, Callback callback) {
        zcp.c(feedBackRequest, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f21886b);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21884a;
        String strA = r.a(FeedbackWebConstants.FEEDBACK_DETAIL_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(feedBackRequest);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit c(FeedBackRateRequest feedBackRateRequest, Callback callback) {
        zcp.c(feedBackRateRequest, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f21886b);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21884a;
        String strA = r.a(FeedbackWebConstants.RATE_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(feedBackRateRequest);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public static final class e {
        public final ProblemSuggestApi a(Context context) {
            ProblemSuggestApi.f21884a = context != null ? context.getApplicationContext() : null;
            if (ProblemSuggestApi.f21885c == null) {
                ProblemSuggestApi.f21885c = new ProblemSuggestApi(ProblemSuggestApi.f21884a);
            }
            return ProblemSuggestApi.f21885c;
        }

        public /* synthetic */ e(zcm zcmVar) {
            this();
        }

        private e() {
        }
    }

    public ProblemSuggestApi(Context context) {
        super(context);
        this.f21886b = context;
    }
}
