package com.huawei.openalliance.ad.download;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.ds;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class g {
    public static HttpConnection b(c cVar) {
        if (cVar == null) {
            return null;
        }
        HttpConnection httpConnectionD = cVar.d();
        httpConnectionD.a("dl-from", cVar.a("dl-from"));
        return httpConnectionD;
    }

    private static boolean a(DownloadTask downloadTask, String str) {
        String str2;
        File file = new File(str);
        if (!ai.d(file)) {
            str2 = "isFileValid - dst file not exist";
        } else {
            if (!downloadTask.z() || ai.a(downloadTask.c(), file)) {
                return true;
            }
            str2 = "isFileValid - dst file not valid";
        }
        hw.c("DownloadUtil", str2);
        return false;
    }

    static boolean a(Context context, DownloadTask downloadTask) throws Throwable {
        String str;
        String str2;
        hw.b("DownloadUtil", "isDownloadedFileValid " + ds.a(downloadTask.n()));
        String strD = downloadTask.d();
        String strC = dn.i(strD) ? dk.a(context, "normal").c(strD) : strD;
        if (TextUtils.isEmpty(strC)) {
            str = "isDownloadedFileValid - real path is empty";
        } else {
            if (a(downloadTask, strC)) {
                a(context, strD);
                return true;
            }
            str = "isDownloadedFileValid - real file is invalid";
        }
        hw.b("DownloadUtil", str);
        hw.b("DownloadUtil", "check tmp file");
        String strE = downloadTask.e();
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        File file = new File(strE);
        if (a(downloadTask, strE)) {
            if (ai.a(context, file, strD, downloadTask.A(), "normal")) {
                return true;
            }
            str2 = "isDownloadedFileValid - tmp file rename failed";
        } else {
            if (file.length() < downloadTask.f() || downloadTask.f() <= 0) {
                return false;
            }
            str2 = "isDownloadedFileValid - tmp file invalid";
        }
        hw.b("DownloadUtil", str2);
        ai.a(context, strE);
        return false;
    }

    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18623a;

        public String a() {
            return this.f18623a;
        }

        public a(String str) {
            super("Url is redirected!");
            this.f18623a = str;
        }
    }

    private static void a(Context context, String str) throws Throwable {
        if (dn.i(str)) {
            dk.a(context, "normal").h(str);
        } else {
            ai.c(new File(str));
        }
    }

    public static long a(String str) {
        long j = -1;
        if (!dg.b(str) && str.startsWith("bytes")) {
            int iIndexOf = str.indexOf(47);
            if (-1 != iIndexOf) {
                try {
                    j = Long.parseLong(str.substring(iIndexOf + 1));
                    if (hw.a()) {
                        hw.a("DownloadUtil", "get new filelength by Content-Range:%d", Long.valueOf(j));
                    }
                    return j;
                } catch (NumberFormatException unused) {
                    hw.d("DownloadUtil", "getEntityLegth NumberFormatException");
                    return j;
                }
            }
            hw.d("DownloadUtil", "getEntityLegth failed Content-Range");
        }
        return -1L;
    }

    public static long a(c cVar) {
        int iB = cVar.b();
        hw.a("DownloadUtil", "responseCode:%d", Integer.valueOf(iB));
        if (206 == iB) {
            return a(cVar.a("Content-Range"));
        }
        if (200 == iB) {
            return cVar.c();
        }
        if (302 != iB) {
            return 0L;
        }
        throw new a(cVar.a("Location"));
    }
}
