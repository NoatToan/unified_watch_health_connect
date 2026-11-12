package com.huawei.phoneservice.feedbackcommon.network;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.phoneservice.faq.base.network.FaqRestClient;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.r;
import com.huawei.phoneservice.feedbackcommon.entity.ac;
import com.huawei.phoneservice.feedbackcommon.entity.v;
import com.huawei.phoneservice.feedbackcommon.entity.w;
import com.huawei.phoneservice.feedbackcommon.entity.x;
import defpackage.zcm;
import defpackage.zcp;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedbackUploadApi extends FaqRestClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21879a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile FeedbackUploadApi f21880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f21881c;
    private Context d;

    public final Submit a(Map<String, String> map, String str, Callback callback) {
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(callback, "");
        g.c("XCallback", "getFeedbackUploadInfo header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String str2 = r.h() + FeedbackWebConstants.FEEDBACK_UPLOAD_INFO;
        Headers headersOf = Headers.of(map);
        zcp.b((Object) headersOf, "");
        return faqRestClientInitRestClientAnno.asyncRequestWithJson(context, str2, str, headersOf, callback);
    }

    public final Submit a(Map<String, String> map, String str, String str2, String str3, Callback callback) {
        zcp.c(map, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        zcp.c(callback, "");
        g.c("XCallback", "getUploadInfo header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String str4 = str3 + FeedbackWebConstants.UPLOAD_INFO + str2;
        Headers headersOf = Headers.of(map);
        zcp.b((Object) headersOf, "");
        return faqRestClientInitRestClientAnno.asyncRequestWitHead(context, str4, headersOf, str, callback);
    }

    public final Submit e(Map<String, String> map, String str, Callback callback) {
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(callback, "");
        g.c("XCallback", "getFeedbackNewUploadInfo header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String str2 = r.h() + FeedbackWebConstants.FEEDBACK_NEW_UPLOAD_INFO;
        Headers headersOf = Headers.of(map);
        zcp.b((Object) headersOf, "");
        return faqRestClientInitRestClientAnno.asyncRequestWithJson(context, str2, str, headersOf, callback);
    }

    public final Submit d(String str, Callback callback) {
        zcp.c(callback, "");
        w wVar = new w(i.d().getSdk("country"), str);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String strA = r.a(FeedbackWebConstants.REQUEST_PRIVACY_NOTICE_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(wVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit e(ac acVar, Callback callback) {
        zcp.c(acVar, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String strA = r.a(FeedbackWebConstants.QUESTION_FEEDBACK_SUBMIT_FORHD);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(acVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit b(Map<String, String> map, String str, String str2, String str3, Callback callback) {
        zcp.c(map, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        zcp.c(callback, "");
        g.c("XCallback", "getNotifyUploadSucc header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String str4 = str3 + FeedbackWebConstants.NOTIFY_UPLOAD_SUCC + str2;
        Headers headersOf = Headers.of(map);
        zcp.b((Object) headersOf, "");
        return faqRestClientInitRestClientAnno.asyncRequestWitHead(context, str4, headersOf, str, callback);
    }

    public final Submit b(Map<String, String> map, String str, String str2, String str3) {
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        g.c("XCallback", "getNewUploadInfo header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        return faqRestClientInitRestClientAnno.uploadZipFile(f21881c, str3 + FeedbackWebConstants.NEW_UPLOAD_INFO + str2, map, null, null, str);
    }

    public final Submit e(Map<String, String> map, String str, String str2, Callback callback) {
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(callback, "");
        g.c("XCallback", "getServerDomain header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String str3 = r.a() + FeedbackWebConstants.SERVER_DOMAIN + str2;
        Headers headersOf = Headers.of(map);
        zcp.b((Object) headersOf, "");
        return faqRestClientInitRestClientAnno.asyncRequestWitHead(context, str3, headersOf, str, callback);
    }

    public final Submit b(Map<String, String> map, String str, Callback callback) {
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(callback, "");
        g.c("XCallback", "feedbackNotifySuccess header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String str2 = r.h() + FeedbackWebConstants.FEEDBACK_NOTIFY_SUCCESS;
        Headers headersOf = Headers.of(map);
        zcp.b((Object) headersOf, "");
        return faqRestClientInitRestClientAnno.asyncRequestWithJson(context, str2, str, headersOf, callback);
    }

    public final Submit a(String str, Map<String, String> map, File file, String str2, String str3) {
        zcp.c(str, "");
        zcp.c(map, "");
        zcp.c(file, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        g.c("XCallback", "getFileUploadToService header is : " + map, new Object[0]);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        return faqRestClientInitRestClientAnno.uploadZipFileToService(f21881c, str, map, str3, file, str2);
    }

    public final Submit d(String str, String str2, String str3, String str4, Callback callback) {
        zcp.c(callback, "");
        v vVar = new v(str4, str, str2, str3);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String strA = r.a(FeedbackWebConstants.REQUEST_QUESTION_TYPE_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(vVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit e(String str, Callback callback) {
        zcp.c(callback, "");
        x xVar = new x(str);
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String strA = r.a(FeedbackWebConstants.REQUEST_ISO_LANGUAGE_URL);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(xVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public final Submit c(ac acVar, Callback callback) {
        zcp.c(acVar, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.d);
        zcp.e(faqRestClientInitRestClientAnno);
        Context context = f21881c;
        String strA = r.a(FeedbackWebConstants.QUESTION_FEEDBACK_SUBMIT);
        zcp.b((Object) strA, "");
        String json = getGson().toJson(acVar);
        zcp.b((Object) json, "");
        return faqRestClientInitRestClientAnno.asyncRequest(context, strA, json, callback);
    }

    public static final class a {
        public final FeedbackUploadApi a(Context context) {
            FeedbackUploadApi.f21881c = context != null ? context.getApplicationContext() : null;
            if (FeedbackUploadApi.f21880b == null) {
                FeedbackUploadApi.f21880b = new FeedbackUploadApi(FeedbackUploadApi.f21881c);
            }
            return FeedbackUploadApi.f21880b;
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }

        private a() {
        }
    }

    public FeedbackUploadApi(Context context) {
        super(context);
        this.d = context;
    }
}
