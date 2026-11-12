package com.xmlywind.sdk.base.common;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xmlywind.logger.SigmobLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes22.dex */
public class z extends AsyncTask<String, Void, String> {
    private final a a;

    public interface a {
        void a(String str);

        void a(String str, Throwable th);
    }

    private z(a aVar) {
        this.a = aVar;
    }

    private static String a(String str, HttpURLConnection httpURLConnection) throws URISyntaxException, IOException {
        URI uri = new URI(str);
        int responseCode = httpURLConnection.getResponseCode();
        String headerField = httpURLConnection.getHeaderField("Location");
        if (responseCode < 300 || responseCode >= 400) {
            return null;
        }
        try {
            return uri.resolve(headerField).toString();
        } catch (IllegalArgumentException unused) {
            SigmobLog.e("Invalid URL redirection. baseUrl=" + str + "\n redirectUrl=" + headerField);
            throw new URISyntaxException(headerField, "Unable to parse invalid URL");
        } catch (Throwable th) {
            SigmobLog.e("Invalid URL redirection. baseUrl=" + str + "\n redirectUrl=" + headerField);
            throw th;
        }
    }

    public static void a(String str, a aVar) {
        try {
            new z(aVar).executeOnExecutor(com.xmlywind.sdk.common.b.c.a.b().a(), str);
        } catch (Throwable th) {
            aVar.a("Failed to resolve url", th);
        }
    }

    private String b(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.addRequestProperty(com.xmlywind.sdk.common.e.i.USER_AGENT.a(), com.xmlywind.sdk.common.e.f.c());
                String strA = a(str, httpURLConnection);
                InputStream inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                        SigmobLog.d("IOException when closing httpUrlConnection. Ignoring.");
                    }
                }
                httpURLConnection.disconnect();
                return strA;
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection != null) {
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable unused2) {
                            SigmobLog.d("IOException when closing httpUrlConnection. Ignoring.");
                        }
                    }
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) throws Throwable {
        Throwable th;
        String str = null;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        String strB = strArr[0];
        while (strB != null) {
            try {
                if (!x.OPEN_WITH_BROWSER.a(Uri.parse(strB))) {
                    return strB;
                }
                try {
                    str = strB;
                    strB = b(strB);
                } catch (Throwable th2) {
                    th = th2;
                    SigmobLog.w(th.getMessage());
                    return strB;
                }
            } catch (Throwable th3) {
                String str2 = str;
                th = th3;
                strB = str2;
            }
        }
        return str;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        if (isCancelled() || str == null) {
            onCancelled();
        } else {
            this.a.a(str);
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        this.a.a("Task for resolving url was cancelled", null);
    }
}
