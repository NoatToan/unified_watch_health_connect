package com.linecorp.linesdk.a.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineApiResponseCode;
import com.loopj.android.http.AsyncHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes18.dex */
public final class a {
    private static final byte[] e = new byte[0];

    @NonNull
    private final e a;

    @NonNull
    private final d b;
    private int c;
    private int d;

    public a(@NonNull Context context, @NonNull String str) {
        this(new e(context, str));
    }

    @NonNull
    @VisibleForTesting
    private static HttpURLConnection c(@NonNull Uri uri) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
        if (!(uRLConnection instanceof HttpsURLConnection)) {
            throw new IllegalArgumentException("The scheme of the server url must be https." + uri);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return (HttpURLConnection) uRLConnection;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setSSLSocketFactory(new com.linecorp.a.a.a(httpsURLConnection.getSSLSocketFactory()));
        return httpsURLConnection;
    }

    private static void d(@NonNull HttpURLConnection httpURLConnection, @NonNull Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    @NonNull
    private static byte[] e(@NonNull Map<String, String> map) {
        if (map.isEmpty()) {
            return e;
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        try {
            return builder.build().getEncodedQuery().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @NonNull
    @WorkerThread
    public final <T> LineApiResponse<T> a(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, @NonNull c<T> cVar) {
        byte[] bArrE = e(map2);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                int length = bArrE.length;
                HttpURLConnection httpURLConnectionC = c(uri);
                httpURLConnectionC.setInstanceFollowRedirects(true);
                httpURLConnectionC.setRequestProperty("User-Agent", this.a.b());
                httpURLConnectionC.setRequestProperty("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                httpURLConnectionC.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnectionC.setRequestProperty("Content-Length", String.valueOf(length));
                httpURLConnectionC.setConnectTimeout(this.c);
                httpURLConnectionC.setReadTimeout(this.d);
                httpURLConnectionC.setRequestMethod("POST");
                httpURLConnectionC.setDoOutput(true);
                try {
                    d(httpURLConnectionC, map);
                    httpURLConnectionC.connect();
                    OutputStream outputStream = httpURLConnectionC.getOutputStream();
                    outputStream.write(bArrE);
                    outputStream.flush();
                    LineApiResponse<T> lineApiResponseB = b(httpURLConnectionC, cVar, this.b);
                    httpURLConnectionC.disconnect();
                    return lineApiResponseB;
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = httpURLConnectionC;
                    LineApiResponse<T> lineApiResponseCreateAsError = LineApiResponse.createAsError(LineApiResponseCode.NETWORK_ERROR, new LineApiError(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return lineApiResponseCreateAsError;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionC;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    @NonNull
    @WorkerThread
    public final <T> LineApiResponse<T> b(@NonNull Uri uri, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, @NonNull c<T> cVar) throws Throwable {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionC = c(builderBuildUpon.build());
                httpURLConnectionC.setInstanceFollowRedirects(true);
                httpURLConnectionC.setRequestProperty("User-Agent", this.a.b());
                httpURLConnectionC.setRequestProperty("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                httpURLConnectionC.setConnectTimeout(this.c);
                httpURLConnectionC.setReadTimeout(this.d);
                httpURLConnectionC.setRequestMethod("GET");
                try {
                    d(httpURLConnectionC, map);
                    httpURLConnectionC.connect();
                    LineApiResponse<T> lineApiResponseB = b(httpURLConnectionC, cVar, this.b);
                    httpURLConnectionC.disconnect();
                    return lineApiResponseB;
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = httpURLConnectionC;
                    LineApiResponse<T> lineApiResponseCreateAsError = LineApiResponse.createAsError(LineApiResponseCode.NETWORK_ERROR, new LineApiError(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return lineApiResponseCreateAsError;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionC;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    @VisibleForTesting
    private a(@NonNull e eVar) {
        this.a = eVar;
        this.b = new d("UTF-8");
        this.c = 90000;
        this.d = 90000;
    }

    @NonNull
    private static <T> LineApiResponse<T> b(@NonNull HttpURLConnection httpURLConnection, @NonNull c<T> cVar, @NonNull c<String> cVar2) throws IOException {
        InputStream errorStream;
        if (httpURLConnection.getResponseCode() < 400) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equalsIgnoreCase(AsyncHttpClient.ENCODING_GZIP)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            errorStream = new GZIPInputStream(errorStream);
        }
        int responseCode = httpURLConnection.getResponseCode();
        try {
            if (responseCode != 200) {
                return LineApiResponse.createAsError(LineApiResponseCode.SERVER_ERROR, new LineApiError(responseCode, cVar2.a(errorStream)));
            }
            return LineApiResponse.createAsSuccess(cVar.a(errorStream));
        } catch (IOException e2) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError(responseCode, e2));
        }
    }
}
