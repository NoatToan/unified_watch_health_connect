package com.baidu.ocr.sdk.utils;

import com.alipay.sdk.m.s.a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public class HttpsClient {

    public static class Call implements Runnable {
        private Callback callback;
        private RequestInfo requestInfo;
        private Thread thread;

        public Call(RequestInfo requestInfo) {
            this.requestInfo = requestInfo;
        }

        private void setHeaders(HttpsURLConnection httpsURLConnection, Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }

        public Call enqueue(Callback callback) {
            this.callback = callback;
            Thread thread = new Thread(this);
            this.thread = thread;
            thread.start();
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestInfo requestInfo = this.requestInfo;
            Exception buildException = requestInfo.getBuildException();
            if (buildException != null) {
                this.callback.onFailure(buildException);
                return;
            }
            HttpsURLConnection httpsURLConnection = null;
            try {
                URL url = requestInfo.getURL();
                byte[] body = requestInfo.getBody();
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                try {
                    setHeaders(httpsURLConnection2, requestInfo.getHeaders());
                    httpsURLConnection2.setRequestMethod("POST");
                    httpsURLConnection2.setConnectTimeout(requestInfo.getConTimeout());
                    httpsURLConnection2.setReadTimeout(requestInfo.getReadTimeout());
                    httpsURLConnection2.setDoOutput(true);
                    httpsURLConnection2.getOutputStream().write(body);
                    writeResp(httpsURLConnection2);
                    httpsURLConnection2.disconnect();
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = httpsURLConnection2;
                    try {
                        th.printStackTrace();
                        this.callback.onFailure(th);
                    } finally {
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public void writeResp(HttpsURLConnection httpsURLConnection) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                StringBuffer stringBuffer = new StringBuffer();
                char[] cArr = new char[512];
                while (true) {
                    int i = bufferedReader.read(cArr);
                    if (i == -1) {
                        this.callback.onResponse(stringBuffer.toString());
                        bufferedReader.close();
                        return;
                    }
                    stringBuffer.append(new String(cArr, 0, i));
                }
            } catch (IOException e) {
                this.callback.onFailure(e);
            }
        }
    }

    public interface Callback {
        void onFailure(Throwable th);

        void onResponse(String str);
    }

    public static class RequestBody {
        private static String UTF8 = "UTF-8";
        private static FileBase64Encoder encoder = new FileBase64Encoder();
        private int paramNumber = 0;
        private StringBuffer stringBuffer = new StringBuffer();

        public byte[] getBytes() {
            byte[] bArr = new byte[0];
            try {
                return String.valueOf(this.stringBuffer).getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return bArr;
            }
        }

        public void setBody(String str) {
            this.stringBuffer.append(str);
        }

        public void setFileParams(Map<String, File> map) {
            StringBuffer stringBuffer = new StringBuffer();
            if (map == null) {
                return;
            }
            for (Map.Entry<String, File> entry : map.entrySet()) {
                if (this.paramNumber > 0) {
                    this.stringBuffer.append(a.l);
                }
                String key = entry.getKey();
                File value = entry.getValue();
                try {
                    String strEncode = URLEncoder.encode(key, UTF8);
                    encoder.setInputFile(value);
                    this.stringBuffer.append(strEncode + SearchCriteria.EQ);
                    while (true) {
                        byte[] bArrEncode = encoder.encode();
                        if (bArrEncode == null) {
                            break;
                        }
                        stringBuffer.append(new String(bArrEncode));
                        this.stringBuffer.append(URLEncoder.encode(new String(bArrEncode), UTF8));
                    }
                    this.paramNumber++;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
        }

        public void setStrParams(Map<String, String> map) {
            if (map == null) {
                return;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (this.paramNumber > 0) {
                    this.stringBuffer.append(a.l);
                }
                String key = entry.getKey();
                String value = entry.getValue();
                try {
                    String strEncode = URLEncoder.encode(key, UTF8);
                    String strEncode2 = URLEncoder.encode(value, UTF8);
                    this.stringBuffer.append(strEncode + SearchCriteria.EQ + strEncode2);
                    this.paramNumber = this.paramNumber + 1;
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class RequestInfo {
        private RequestBody body;
        private URL url;
        private String urlStr;
        private Map<String, String> headers = new HashMap();
        private Exception ex = null;
        private int conTimeout = HttpUtil.getOptions().getConnectionTimeoutInMillis();
        private int readTimeout = HttpUtil.getOptions().getSocketTimeoutInMillis();

        public RequestInfo(String str, RequestBody requestBody) {
            this.urlStr = str;
            this.body = requestBody;
        }

        public void build() {
            try {
                this.url = new URL(this.urlStr);
            } catch (Exception e) {
                this.ex = e;
            }
        }

        public byte[] getBody() {
            return this.body.getBytes();
        }

        public Exception getBuildException() {
            return this.ex;
        }

        public int getConTimeout() {
            return this.conTimeout;
        }

        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public int getReadTimeout() {
            return this.readTimeout;
        }

        public URL getURL() {
            return this.url;
        }

        public void setHeader(String str, String str2) {
            this.headers.put(str, str2);
        }
    }

    public Call newCall(RequestInfo requestInfo) {
        return new Call(requestInfo);
    }
}
