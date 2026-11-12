package com.datatheorem.android.trustkit.reporting;

import android.os.AsyncTask;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.datatheorem.android.trustkit.pinning.SystemTrustManager;
import com.datatheorem.android.trustkit.utils.TrustKitLog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 16)
class a extends AsyncTask<Object, Void, Integer> {
    private static final SSLSocketFactory a = b();

    private static SSLSocketFactory b() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            if (sSLContext == null) {
                throw new IllegalStateException("Should never happen");
            }
            try {
                sSLContext.init(null, new TrustManager[]{SystemTrustManager.getInstance()}, null);
                return sSLContext.getSocketFactory();
            } catch (KeyManagementException unused) {
                throw new IllegalStateException("Should never happen");
            }
        } catch (NoSuchAlgorithmException unused2) {
            throw new IllegalStateException("Should never happen");
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer doInBackground(Object... objArr) throws Throwable {
        HttpURLConnection httpURLConnection;
        PinningFailureReport pinningFailureReport = (PinningFailureReport) objArr[0];
        HttpURLConnection httpURLConnection2 = null;
        Integer numValueOf = null;
        for (int i = 1; i < objArr.length; i++) {
            URL url = (URL) objArr[i];
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                try {
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/json");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setChunkedStreamingMode(0);
                        if (url.getUserInfo() != null) {
                            httpURLConnection.setRequestProperty("Authorization", "Basic " + new String(Base64.encode(url.getUserInfo().getBytes(), 0)));
                        }
                        if (httpURLConnection instanceof HttpsURLConnection) {
                            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(a);
                        }
                        httpURLConnection.connect();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        bufferedOutputStream.write(pinningFailureReport.c().toString().getBytes("UTF-8"));
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        numValueOf = Integer.valueOf(httpURLConnection.getResponseCode());
                    } catch (IOException e) {
                        e = e;
                        TrustKitLog.i("Background upload - task completed with error:" + e.getMessage());
                        if (httpURLConnection != null) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
            }
            httpURLConnection.disconnect();
        }
        return numValueOf;
    }
}
