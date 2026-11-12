package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRateRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.aa;
import com.huawei.phoneservice.feedbackcommon.entity.ac;
import com.huawei.phoneservice.feedbackcommon.entity.r;
import com.huawei.phoneservice.feedbackcommon.network.FaqDownloadManager;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackUploadApi;
import com.huawei.phoneservice.feedbackcommon.network.ProblemApi;
import com.huawei.phoneservice.feedbackcommon.network.ProblemSuggestApi;
import defpackage.zcp;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements IFeedbackCommonManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f21899b = new c();

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public Submit<ResponseBody> uploadFile(Context context, File file, String str, String str2, Callback<ResponseBody> callback) {
        zcp.c(context, "");
        zcp.c(file, "");
        zcp.c(callback, "");
        ProblemSuggestApi problemSuggestApiA = ProblemSuggestApi.e.a(context);
        zcp.e(problemSuggestApiA);
        return problemSuggestApiA.a(file, str, str2, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit updateFeedBackInfo(Context context, ac acVar, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(acVar, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.e(acVar, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit setRead(Context context, String str, String str2, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(callback, "");
        aa aaVar = new aa(str, str2);
        ProblemApi problemApiD = ProblemApi.f21882a.d(context);
        zcp.e(problemApiD);
        return problemApiD.e(aaVar, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit queryNotice(Context context, String str, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.d(str, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit queryIsoLanguage(Context context, String str, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.e(str, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit queryForHD(Context context, long j, String str, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(str, "");
        zcp.c(callback, "");
        com.huawei.phoneservice.feedbackcommon.entity.k kVar = new com.huawei.phoneservice.feedbackcommon.entity.k();
        kVar.e(j);
        kVar.a(str);
        ProblemSuggestApi problemSuggestApiA = ProblemSuggestApi.e.a(context);
        zcp.e(problemSuggestApiA);
        return problemSuggestApiA.b(kVar, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit postRate(Context context, FeedBackRateRequest feedBackRateRequest, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(feedBackRateRequest, "");
        zcp.c(callback, "");
        ProblemSuggestApi problemSuggestApiA = ProblemSuggestApi.e.a(context);
        zcp.e(problemSuggestApiA);
        return problemSuggestApiA.c(feedBackRateRequest, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getUploadInfo(Context context, Map<String, String> map, String str, String str2, String str3, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(map, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.a(map, str, str2, str3, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getUnread(Context context, r rVar, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(rVar, "");
        zcp.c(callback, "");
        ProblemApi problemApiD = ProblemApi.f21882a.d(context);
        zcp.e(problemApiD);
        return problemApiD.e(rVar, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getServerDomain(Context context, Map<String, String> map, String str, String str2, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.e(map, str, str2, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getNotifyUploadSucc(Context context, Map<String, String> map, String str, String str2, String str3, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(map, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.b(map, str, str2, str3, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getNewUploadInfo(Context context, Map<String, String> map, String str, String str2, String str3) {
        zcp.c(context, "");
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.b(map, str, str2, str3);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getFileUploadToService(Context context, String str, Map<String, String> map, File file, String str2, String str3) {
        zcp.c(context, "");
        zcp.c(str, "");
        zcp.c(map, "");
        zcp.c(file, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.a(str, map, file, str2, str3);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getFeedbackUploadInfo(Context context, Map<String, String> map, String str, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.a(map, str, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getFeedbackNewUploadInfo(Context context, Map<String, String> map, String str, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.e(map, str, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getFeedBackList(Context context, FeedBackRequest feedBackRequest, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(feedBackRequest, "");
        zcp.c(callback, "");
        ProblemSuggestApi problemSuggestApiA = ProblemSuggestApi.e.a(context);
        zcp.e(problemSuggestApiA);
        return problemSuggestApiA.b(feedBackRequest, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit getDataFromDetail(Context context, FeedBackRequest feedBackRequest, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(feedBackRequest, "");
        zcp.c(callback, "");
        ProblemSuggestApi problemSuggestApiA = ProblemSuggestApi.e.a(context);
        zcp.e(problemSuggestApiA);
        return problemSuggestApiA.e(feedBackRequest, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit feedbackNotifySuccess(Context context, Map<String, String> map, String str, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(map, "");
        zcp.c(str, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.b(map, str, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit downloadFile(Context context, String str, String str2, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(callback, "");
        FaqDownloadManager faqDownloadManagerE = FaqDownloadManager.f21877b.e(context);
        zcp.e(faqDownloadManagerE);
        return faqDownloadManagerE.d(str, str2, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit deleteHistory(Context context, com.huawei.phoneservice.feedbackcommon.entity.e eVar, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(eVar, "");
        zcp.c(callback, "");
        ProblemSuggestApi problemSuggestApiA = ProblemSuggestApi.e.a(context);
        zcp.e(problemSuggestApiA);
        return problemSuggestApiA.a(eVar, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit callService(Context context, String str, String str2, String str3, String str4, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.d(str, str2, str3, str4, callback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IFeedbackCommonManager
    public com.huawei.hms.framework.network.restclient.hwhttp.Submit callFeedBackService(Context context, ac acVar, com.huawei.hms.framework.network.restclient.hwhttp.Callback callback) {
        zcp.c(context, "");
        zcp.c(acVar, "");
        zcp.c(callback, "");
        FeedbackUploadApi feedbackUploadApiA = FeedbackUploadApi.f21879a.a(context);
        zcp.e(feedbackUploadApiA);
        return feedbackUploadApiA.c(acVar, callback);
    }

    private c() {
    }
}
