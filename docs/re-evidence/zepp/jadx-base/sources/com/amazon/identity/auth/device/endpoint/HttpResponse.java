package com.amazon.identity.auth.device.endpoint;

import android.text.TextUtils;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class HttpResponse {
    private static final String LOG_TAG = "HttpResponse";
    private final String responseBody;
    private final int responseCode;
    private final Map<String, String> responseHeaders;

    private HttpResponse(int i, String str, Map<String, String> map) {
        this.responseCode = i;
        this.responseBody = str;
        this.responseHeaders = map;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static String readInputStreamToString(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        IOException e;
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                    MAPLog.e(LOG_TAG, "Cannot close BufferedReader", e2);
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            MAPLog.e(LOG_TAG, "Cannot parse response stream", e);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e4) {
                                    MAPLog.e(LOG_TAG, "Cannot close BufferedReader", e4);
                                }
                            }
                            inputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e5) {
                                MAPLog.e(LOG_TAG, "Cannot close BufferedReader", e5);
                            }
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            MAPLog.e(LOG_TAG, "Cannot close response stream", e6);
                            throw th;
                        }
                    }
                }
                bufferedReader.close();
                inputStream.close();
            } catch (IOException e7) {
                MAPLog.e(LOG_TAG, "Cannot close response stream", e7);
            }
        } catch (IOException e8) {
            bufferedReader = null;
            e = e8;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            inputStream.close();
            throw th;
        }
        return sb.toString();
    }

    public static HttpResponse readResponse(HttpsURLConnection httpsURLConnection) throws IOException {
        try {
            return new HttpResponse(httpsURLConnection.getResponseCode(), retrieveResponseBody(httpsURLConnection), retrieveResponseHeaders(httpsURLConnection));
        } finally {
            httpsURLConnection.disconnect();
        }
    }

    private static String retrieveResponseBody(HttpsURLConnection httpsURLConnection) throws Throwable {
        InputStream errorStream;
        try {
            errorStream = httpsURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpsURLConnection.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        String inputStreamToString = readInputStreamToString(errorStream);
        MAPLog.pii(LOG_TAG, "Response received", String.format("Request to %s received response %s", httpsURLConnection.getURL().toString(), inputStreamToString));
        return inputStreamToString;
    }

    private static Map<String, String> retrieveResponseHeaders(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String strJoin = TextUtils.join(", ", entry.getValue());
            map.put(entry.getKey(), strJoin);
            MAPLog.pii(LOG_TAG, "Header from response: name=" + entry.getKey(), "val=" + strJoin);
        }
        return map;
    }

    public String getRedirectLocation() {
        return this.responseHeaders.get("Location");
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }
}
