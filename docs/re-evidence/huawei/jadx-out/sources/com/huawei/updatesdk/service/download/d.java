package com.huawei.updatesdk.service.download;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.j2;
import java.io.File;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes20.dex */
public class d {
    public HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnectionA = com.huawei.updatesdk.sdk.foundation.https.b.a(str, com.huawei.updatesdk.sdk.service.app.a.c().a());
        httpURLConnectionA.setConnectTimeout(7000);
        httpURLConnectionA.setReadTimeout(10000);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setDoInput(true);
        httpURLConnectionA.setRequestProperty(j2.v, "identity");
        httpURLConnectionA.setInstanceFollowRedirects(true);
        return httpURLConnectionA;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f29956a = new d();
    }

    public static String b() {
        String strB = com.huawei.updatesdk.sdk.service.app.a.c().b();
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        String str = strB + "/updatesdk";
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : "";
    }

    public static d a() {
        return a.f29956a;
    }
}
