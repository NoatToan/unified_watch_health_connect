package com.sensetime.senseid.sdk.liveness.silent.common.network;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.sensetime.senseid.sdk.liveness.silent.common.type.ResultCode;
import com.sensetime.senseid.sdk.liveness.silent.common.util.StringUtil;
import com.twitter.sdk.android.core.internal.oauth.OAuthConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractHttpUtils {
    private a a = null;

    public class a extends AsyncTask<String, Void, HttpResult> {
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private AbstractContentType g;
        private String[] h;
        private HttpListener i;

        public a(HttpListener httpListener, String str, String str2, String str3, String str4, String str5, AbstractContentType abstractContentType, String... strArr) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = abstractContentType;
            this.h = strArr;
            this.i = httpListener;
        }

        private HttpResult a() {
            ResultCode resultCode;
            try {
                Uri.Builder builderEncodedAuthority = new Uri.Builder().scheme("https").encodedAuthority(AbstractHttpUtils.this.getHost());
                for (String str : this.h) {
                    builderEncodedAuthority.appendPath(str);
                }
                HttpURLConnection httpURLConnectionA = AbstractHttpUtils.this.a(new URL(builderEncodedAuthority.build().toString()), this.d, this.e, this.b, this.c, this.f);
                if (httpURLConnectionA == null) {
                    return new HttpResult(ResultCode.STID_E_SERVER_ACCESS, this.g);
                }
                if (isCancelled()) {
                    httpURLConnectionA.disconnect();
                    return new HttpResult(ResultCode.STID_E_SERVER_ACCESS, this.g);
                }
                OutputStream outputStream = httpURLConnectionA.getOutputStream();
                outputStream.write(this.f.getBytes());
                outputStream.flush();
                outputStream.close();
                if (isCancelled()) {
                    httpURLConnectionA.disconnect();
                    return new HttpResult(ResultCode.STID_E_SERVER_ACCESS, this.g);
                }
                int responseCode = httpURLConnectionA.getResponseCode();
                InputStream inputStream = responseCode == 200 ? httpURLConnectionA.getInputStream() : httpURLConnectionA.getErrorStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null || this.i == null) {
                        break;
                    }
                    if (isCancelled()) {
                        httpURLConnectionA.disconnect();
                        return new HttpResult(ResultCode.STID_E_SERVER_ACCESS, this.g);
                    }
                    sb.append(line);
                    sb.append("\n");
                }
                inputStream.close();
                String string = sb.toString();
                if (responseCode == 200) {
                    resultCode = ResultCode.OK;
                } else if (responseCode != 401) {
                    resultCode = responseCode != 408 ? ResultCode.STID_E_SERVER_ACCESS : ResultCode.STID_E_SERVER_TIMEOUT;
                } else {
                    resultCode = ResultCode.STID_E_API_KEY_INVALID;
                }
                httpURLConnectionA.disconnect();
                return new HttpResult(resultCode, string, httpURLConnectionA.getHeaderFields(), this.g);
            } catch (IOException e) {
                e = e;
                e.printStackTrace();
                return new HttpResult(ResultCode.STID_E_SERVER_ACCESS, this.g);
            } catch (NullPointerException e2) {
                e = e2;
                e.printStackTrace();
                return new HttpResult(ResultCode.STID_E_SERVER_ACCESS, this.g);
            } catch (SecurityException e3) {
                e = e3;
                e.printStackTrace();
                return new HttpResult(ResultCode.STID_E_SERVER_ACCESS, this.g);
            } catch (SocketTimeoutException e4) {
                e4.printStackTrace();
                return new HttpResult(ResultCode.STID_E_SERVER_TIMEOUT, this.g);
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ HttpResult doInBackground(String[] strArr) {
            return a();
        }

        @Override // android.os.AsyncTask
        public final void onCancelled() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            super.onCancelled();
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(HttpResult httpResult) {
            HttpResult httpResult2 = httpResult;
            HttpListener httpListener = this.i;
            if (httpListener != null) {
                httpListener.onFinished(httpResult2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HttpURLConnection a(URL url, String str, String str2, String str3, String str4, String str5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strReplace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        String signature = getSignature(String.valueOf(jCurrentTimeMillis), StringUtil.md5(str5), strReplace, str3, str4);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", OAuthConstants.AUTHORIZATION_BASIC);
            httpURLConnection.setRequestProperty("X-SenseTime-Api-Key", str3);
            httpURLConnection.setRequestProperty("X-SenseTime-Timestamp", String.valueOf(jCurrentTimeMillis));
            httpURLConnection.setRequestProperty("X-SenseTime-Nonce", strReplace);
            httpURLConnection.setRequestProperty("X-SenseTime-Signature", signature);
            httpURLConnection.setRequestProperty("X-SenseTime-Client-Source", getBundleId());
            httpURLConnection.setRequestProperty("X-SenseTime-Sdkversion", str2);
            httpURLConnection.setRequestProperty("X-SenseTime-Sysversion", Build.VERSION.RELEASE);
            httpURLConnection.setRequestProperty("X-SenseTime-Network", str);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (IOException e) {
            cancel();
            e.printStackTrace();
            return null;
        }
    }

    public void cancel() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.cancel(true);
            this.a = null;
        }
    }

    public abstract String getBundleId();

    public abstract String getHost();

    public abstract String getSignature(String str, String str2, String str3, String str4, String str5);

    public void sendRequestAsync(String str, String str2, String str3, String str4, String str5, AbstractContentType abstractContentType, String... strArr) {
        new a(null, str, str2, str3, str4, str5, abstractContentType, strArr).execute(new String[0]);
    }

    public void sendRequestSync(HttpListener httpListener, String str, String str2, String str3, String str4, String str5, AbstractContentType abstractContentType, String... strArr) {
        a aVar = new a(httpListener, str, str2, str3, str4, str5, abstractContentType, strArr);
        this.a = aVar;
        aVar.execute(new String[0]);
    }
}
