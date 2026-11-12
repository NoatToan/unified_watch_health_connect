package com.huawei.phoneservice.feedbackcommon.network;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.phoneservice.faq.base.network.FaqRestClient;
import defpackage.zcm;
import defpackage.zcp;

/* JADX INFO: loaded from: classes41.dex */
public final class FaqDownloadManager extends FaqRestClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f21876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21877b = new b(null);
    private static volatile FaqDownloadManager d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f21878c;

    public final Submit d(String str, String str2, Callback callback) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(callback, "");
        FaqRestClient faqRestClientInitRestClientAnno = FaqRestClient.Companion.initRestClientAnno(this.f21878c);
        zcp.e(faqRestClientInitRestClientAnno);
        return faqRestClientInitRestClientAnno.downloadFile(f21876a, str, str2, callback);
    }

    public static final class b {
        public final FaqDownloadManager e(Context context) {
            FaqDownloadManager.f21876a = context != null ? context.getApplicationContext() : null;
            if (FaqDownloadManager.d == null) {
                FaqDownloadManager.d = new FaqDownloadManager(FaqDownloadManager.f21876a);
            }
            return FaqDownloadManager.d;
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }

        private b() {
        }
    }

    public FaqDownloadManager(Context context) {
        super(context);
        this.f21878c = context;
    }
}
