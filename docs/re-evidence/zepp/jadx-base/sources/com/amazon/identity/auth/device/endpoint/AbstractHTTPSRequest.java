package com.amazon.identity.auth.device.endpoint;

import android.annotation.SuppressLint;
import android.net.SSLCertificateSocketFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.endpoint.Response;
import com.amazon.identity.auth.device.utils.NetworkUtils;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractHTTPSRequest<T extends Response> {
    public static final int HTTPS_TIMEOUT_MILLISECONDS = 30000;
    private static final String LOG_TAG = "com.amazon.identity.auth.device.endpoint.AbstractHTTPSRequest";
    public static final int NUM_RETRY_ATTEMPTS = 3;
    private static final HostnameVerifier TRUST_ALL_HOSTNAME_VERIFIER = getAllTrustingHostNameVerifier();
    private static final SSLSocketFactory TRUST_ALL_HOSTS_SOCKET_FACTORY = getAllTrustingSSLSocketFactory();
    public static final String UTF8 = "UTF-8";
    public final List<Pair<String, String>> headers = new ArrayList();

    private static HostnameVerifier getAllTrustingHostNameVerifier() {
        return new HostnameVerifier() { // from class: com.amazon.identity.auth.device.endpoint.AbstractHTTPSRequest.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        };
    }

    @SuppressLint({"SSLCertificateSocketFactoryGetInsecure"})
    private static SSLSocketFactory getAllTrustingSSLSocketFactory() {
        return SSLCertificateSocketFactory.getInsecure(0, null);
    }

    private void logRequestInfo(HttpsURLConnection httpsURLConnection) {
        String str = LOG_TAG;
        MAPLog.pii(str, "Http request method", httpsURLConnection.getRequestMethod());
        Map requestProperties = httpsURLConnection.getRequestProperties();
        if (requestProperties != null) {
            MAPLog.i(str, "Number of Headers : " + requestProperties.size());
            for (Map.Entry entry : requestProperties.entrySet()) {
                String str2 = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list != null && list.size() > 0) {
                    MAPLog.pii(LOG_TAG, "Header used for request: name=" + str2, "val=" + TextUtils.join(", ", list));
                }
            }
        } else {
            MAPLog.i(str, "No Headers");
        }
        logRequest();
    }

    public abstract T generateResponse(HttpResponse httpResponse);

    public List<Pair<String, String>> getHeaders() {
        return this.headers;
    }

    public abstract String getRequestUrl() throws MalformedURLException;

    public abstract void initializeHeaders();

    public HttpsURLConnection initializeHttp(String str) throws AuthError, IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        setHttpMethod(httpsURLConnection);
        httpsURLConnection.setConnectTimeout(30000);
        writeHeaders(httpsURLConnection);
        return httpsURLConnection;
    }

    public void initializePostParams() throws AuthError {
    }

    public abstract void logRequest();

    public T retryAndGetResponse(HttpsURLConnection httpsURLConnection) throws AuthError, IOException {
        HttpResponse response = null;
        int i = 0;
        while (i < 3) {
            response = HttpResponse.readResponse(httpsURLConnection);
            String str = LOG_TAG;
            MAPLog.pii(str, "Get response.", "Response code: " + response.getResponseCode());
            if (!NetworkUtils.hasReceived500(response.getResponseCode())) {
                break;
            }
            HttpsURLConnection httpsURLConnectionInitializeHttp = initializeHttp(getRequestUrl());
            writeBody(httpsURLConnectionInitializeHttp);
            StringBuilder sb = new StringBuilder();
            sb.append("Received ");
            sb.append(response.getResponseCode());
            sb.append(" error on request attempt ");
            i++;
            sb.append(i);
            sb.append(" of ");
            sb.append(3);
            MAPLog.w(str, sb.toString());
            httpsURLConnection = httpsURLConnectionInitializeHttp;
        }
        return (T) generateResponse(response);
    }

    public abstract void setHttpMethod(HttpsURLConnection httpsURLConnection) throws ProtocolException;

    public final T submit() throws AuthError {
        try {
            initializeHeaders();
            initializePostParams();
            HttpsURLConnection httpsURLConnectionInitializeHttp = initializeHttp(getRequestUrl());
            logRequestInfo(httpsURLConnectionInitializeHttp);
            writeBody(httpsURLConnectionInitializeHttp);
            MAPLog.i(LOG_TAG, "Request url: " + httpsURLConnectionInitializeHttp.getURL());
            return (T) retryAndGetResponse(httpsURLConnectionInitializeHttp);
        } catch (IllegalStateException e) {
            MAPLog.e(LOG_TAG, "Received IllegalStateException error when executing token request:" + e.toString(), e);
            throw new AuthError("Received communication error when executing token request", e, AuthError.ERROR_TYPE.ERROR_COM);
        } catch (MalformedURLException e2) {
            MAPLog.e(LOG_TAG, "Invalid URL", e2);
            throw new AuthError("MalformedURLException", e2, AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
        } catch (IOException e3) {
            MAPLog.e(LOG_TAG, "Received IO error when executing token request:" + e3.toString(), e3);
            throw new AuthError("Received communication error when executing token request", e3, AuthError.ERROR_TYPE.ERROR_IO);
        }
    }

    public void writeBody(HttpsURLConnection httpsURLConnection) throws AuthError, IOException {
    }

    public void writeHeaders(HttpsURLConnection httpsURLConnection) {
        for (Pair<String, String> pair : this.headers) {
            httpsURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }
}
