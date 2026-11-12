package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public class p extends AsyncTask<Object, Void, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ZipCompressListener f21968c;
    private WeakReference<Context> d;
    private String e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Integer num) {
        super.onPostExecute(num);
        com.huawei.phoneservice.faq.base.util.g.a("ZipCompressTask", "integer:" + num);
        this.f21968c.zipCompressFinished(num.intValue(), this.f21966a, this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Integer doInBackground(Object... objArr) {
        File file;
        StringBuilder sb;
        String str;
        String str2;
        String str3;
        int iFileToZip = -1;
        try {
            String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_LOG_PATH);
            Context context = this.d.get();
            if (context == null) {
                return -1;
            }
            if (TextUtils.isEmpty(sdk) || sdk.startsWith(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                file = new File(FeedbackWebConstants.getLogPath(context));
            } else {
                file = new File(FeedbackWebConstants.getLogPath(context) + File.separator + sdk);
            }
            com.huawei.phoneservice.faq.base.util.g.c("ZipCompressTask", "  logPath: " + file.getCanonicalPath());
            if (file.exists()) {
                String sdk2 = com.huawei.phoneservice.faq.base.util.i.d().getSdk("model");
                String sdk3 = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SOFT_VERSION);
                String sdk4 = com.huawei.phoneservice.faq.base.util.i.d().getSdk("romVersion");
                String sdk5 = com.huawei.phoneservice.faq.base.util.i.d().getSdk("appVersion");
                String string = "";
                if (!TextUtils.isEmpty(sdk2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(sdk2);
                    sb2.append("_");
                    if (TextUtils.isEmpty(sdk3)) {
                        str2 = "";
                    } else {
                        str2 = sdk3 + "_";
                    }
                    sb2.append(str2);
                    if (TextUtils.isEmpty(sdk4)) {
                        str3 = "";
                    } else {
                        str3 = sdk4 + "_";
                    }
                    sb2.append(str3);
                    sb2.append(UUID.randomUUID());
                    sb2.append("_app-");
                    sb2.append(context.getPackageName());
                    if (!TextUtils.isEmpty(sdk5)) {
                        string = "_" + sdk5;
                    }
                    sb2.append(string);
                    string = sb2.toString();
                }
                this.e = string;
                this.f21966a = FeedbackWebConstants.getZipFilePath(context);
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    sb = new StringBuilder();
                    sb.append(file.getCanonicalPath());
                    str = " FOLDER IS EMPTY";
                } else {
                    iFileToZip = ZipUtil.fileToZip(file.getCanonicalPath(), this.f21966a, this.e, this.f21967b);
                }
                return Integer.valueOf(iFileToZip);
            }
            sb = new StringBuilder();
            sb.append(file.getCanonicalPath());
            str = " FILE NOT EXISTS";
            sb.append(str);
            com.huawei.phoneservice.faq.base.util.g.a("ZipCompressTask", sb.toString());
            return Integer.valueOf(iFileToZip);
        } catch (Exception e) {
            com.huawei.phoneservice.faq.base.util.g.c("ZipCompressTask", e.getMessage());
        }
    }

    public p(Context context, ZipCompressListener zipCompressListener) {
        this.f21968c = zipCompressListener;
        this.d = new WeakReference<>(context);
    }

    public p(Context context, long j, ZipCompressListener zipCompressListener) {
        this.f21967b = j;
        this.f21968c = zipCompressListener;
        this.d = new WeakReference<>(context);
    }
}
