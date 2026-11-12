package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends HttpsURLConnection {
    public static final AgentLog def = AgentLogManager.getAgentLog();
    public HttpsURLConnection abc;
    public b bcd;
    public g cde;

    public final class abc implements p0 {
        public final /* synthetic */ b abc;

        public abc(b bVar) {
            this.abc = bVar;
        }

        @Override // com.huawei.agconnect.apms.p0
        public final void abc(o0 o0Var) {
            if (this.abc.b()) {
                return;
            }
            f fVar = f.this;
            b bVar = this.abc;
            fVar.getClass();
            try {
                bVar.cde(fVar.abc.getResponseCode());
            } catch (Throwable th) {
                def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get status code: "), f.def);
            }
            long contentLength = f.this.abc.getContentLength();
            long j = o0Var.abc;
            this.abc.def(contentLength);
            this.abc.abc(j);
            f fVar2 = f.this;
            b bVar2 = this.abc;
            fVar2.getClass();
            f.abc(bVar2);
        }

        @Override // com.huawei.agconnect.apms.p0
        public final void bcd(o0 o0Var) {
            if (!this.abc.b()) {
                this.abc.abc(o0Var.abc);
            }
            f.this.abc(o0Var.bcd);
        }
    }

    public final class bcd implements p0 {
        public final /* synthetic */ b abc;

        public bcd(b bVar) {
            this.abc = bVar;
        }

        @Override // com.huawei.agconnect.apms.p0
        public final void abc(o0 o0Var) {
            if (this.abc.b()) {
                return;
            }
            f fVar = f.this;
            b bVar = this.abc;
            fVar.getClass();
            try {
                bVar.cde(fVar.abc.getResponseCode());
            } catch (Throwable th) {
                def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get status code: "), f.def);
            }
            String requestProperty = f.this.abc.getRequestProperty("Content-length");
            long j = o0Var.abc;
            if (requestProperty != null) {
                try {
                    j = Long.parseLong(requestProperty);
                } catch (Throwable th2) {
                    def.abc(th2, com.huawei.agconnect.apms.abc.abc("failed to get content length: "), f.def);
                }
            }
            this.abc.bcd(j);
            f fVar2 = f.this;
            b bVar2 = this.abc;
            fVar2.getClass();
            f.abc(bVar2);
        }

        @Override // com.huawei.agconnect.apms.p0
        public final void bcd(o0 o0Var) {
            if (!this.abc.b()) {
                this.abc.bcd(o0Var.abc);
            }
            f.this.abc(o0Var.bcd);
        }
    }

    public f(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection.getURL());
        this.cde = null;
        this.abc = httpsURLConnection;
        bcd();
        if (httpsURLConnection.getURL() != null) {
            c.abc(httpsURLConnection.getURL().getHost(), this.bcd);
        }
        if (Agent.isNuwaTracerEnable()) {
            String strBcd = o.bcd();
            String strAbc = o.abc();
            abc(httpsURLConnection, strBcd, strAbc);
            this.bcd.opq(strBcd);
            this.bcd.nop(strAbc);
        }
    }

    public static void abc(b bVar) {
        bVar.k();
        a aVarN = bVar.n();
        if (aVarN == null) {
            return;
        }
        if (bVar.c()) {
            pon.cde.add(new HttpEvent(aVarN, v0.abc()));
        } else {
            pon.cde.add(new HttpEvent(aVarN));
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.abc.addRequestProperty(str, str2);
    }

    public final b bcd() {
        if (this.bcd == null) {
            b bVar = new b();
            this.bcd = bVar;
            HttpsURLConnection httpsURLConnection = this.abc;
            AgentLog agentLog = c.abc;
            if (httpsURLConnection != null && httpsURLConnection.getURL() != null) {
                String string = httpsURLConnection.getURL().toString();
                String requestMethod = httpsURLConnection.getRequestMethod();
                bVar.lmn(string);
                bVar.efg(requestMethod);
            }
        }
        return this.bcd;
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        bcd().ghi = 3;
        try {
            this.abc.connect();
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        b bVar = this.bcd;
        if (bVar != null && !bVar.b()) {
            abc(this.bcd);
        }
        this.abc.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.abc.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.abc.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.abc.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() throws IOException {
        bcd();
        try {
            Object content = this.abc.getContent();
            int contentLength = this.abc.getContentLength();
            if (contentLength >= 0) {
                b bVarBcd = bcd();
                if (!bVarBcd.b()) {
                    bVarBcd.abc(contentLength);
                    abc(bVarBcd);
                }
            }
            return content;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        bcd();
        String contentEncoding = this.abc.getContentEncoding();
        abc();
        return contentEncoding;
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        bcd();
        int contentLength = this.abc.getContentLength();
        abc();
        return contentLength;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        bcd();
        String contentType = this.abc.getContentType();
        abc();
        return contentType;
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        bcd();
        long date = this.abc.getDate();
        abc();
        return date;
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.abc.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.abc.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.abc.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        bcd();
        try {
            g gVar = this.cde;
            if (gVar == null || gVar.available() == 0) {
                if (this.abc.getErrorStream() == null) {
                    def.debug("error stream is null.");
                    return this.abc.getErrorStream();
                }
                this.cde = new g(this.abc.getErrorStream(), true, 0);
            }
            return this.cde;
        } catch (Throwable th) {
            AgentLog agentLog = def;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("failed to get error stream: ");
            sbAbc.append(th.toString());
            agentLog.warn(sbAbc.toString());
            return this.abc.getErrorStream();
        }
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        bcd();
        long expiration = this.abc.getExpiration();
        abc();
        return expiration;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        bcd();
        String headerField = this.abc.getHeaderField(i);
        abc();
        return headerField;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        bcd();
        long headerFieldDate = this.abc.getHeaderFieldDate(str, j);
        abc();
        return headerFieldDate;
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        bcd();
        int headerFieldInt = this.abc.getHeaderFieldInt(str, i);
        abc();
        return headerFieldInt;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        bcd();
        String headerFieldKey = this.abc.getHeaderFieldKey(i);
        abc();
        return headerFieldKey;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        bcd();
        Map<String, List<String>> headerFields = this.abc.getHeaderFields();
        abc();
        return headerFields;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.abc.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        bcd();
        long ifModifiedSince = this.abc.getIfModifiedSince();
        abc();
        return ifModifiedSince;
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        b bVarBcd = bcd();
        try {
            g gVar = new g(this.abc.getInputStream(), false);
            c.abc(bVarBcd, this.abc);
            gVar.bcd.abc(new abc(bVarBcd));
            return gVar;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.abc.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        bcd();
        long lastModified = this.abc.getLastModified();
        abc();
        return lastModified;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.abc.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.abc.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws IOException {
        b bVarBcd = bcd();
        try {
            v vVar = new v(this.abc.getOutputStream());
            String requestProperty = this.abc.getRequestProperty("Content-Type");
            if (requestProperty == null) {
                requestProperty = "";
            }
            bVarBcd.efg = requestProperty;
            vVar.cde.abc(new bcd(bVarBcd));
            return vVar;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.abc.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        return this.abc.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.abc.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.abc.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.abc.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.abc.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        bcd();
        try {
            int responseCode = this.abc.getResponseCode();
            abc();
            return responseCode;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() throws IOException {
        bcd();
        try {
            String responseMessage = this.abc.getResponseMessage();
            abc();
            return responseMessage;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.abc.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        try {
            return this.abc.getServerCertificates();
        } catch (SSLPeerUnverifiedException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.abc.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.abc.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.abc.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.abc.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.abc.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.abc.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.abc.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.abc.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.abc.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.abc.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.abc.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.abc.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.abc.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        try {
            this.abc.setRequestMethod(str);
        } catch (ProtocolException e) {
            abc(e);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.abc.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.abc.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.abc.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.abc.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.abc.usingProxy();
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        bcd();
        String headerField = this.abc.getHeaderField(str);
        abc();
        return headerField;
    }

    public final void abc() {
        if (bcd().b()) {
            return;
        }
        c.abc(bcd(), this.abc);
    }

    public final void abc(Exception exc) {
        b bVarBcd = bcd();
        c.abc(bVarBcd, exc);
        if (bVarBcd.b()) {
            return;
        }
        c.abc(bVarBcd, this.abc);
        bVarBcd.k();
        a aVarN = bVarBcd.n();
        if (aVarN != null) {
            pon.cde.add(new HttpEvent(aVarN));
        }
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) throws IOException {
        bcd();
        try {
            Object content = this.abc.getContent(clsArr);
            abc();
            return content;
        } catch (IOException e) {
            abc(e);
            throw e;
        }
    }

    public static void abc(HttpsURLConnection httpsURLConnection, String str, String str2) {
        if (TextUtils.isEmpty(httpsURLConnection.getRequestProperty("net-msg-id"))) {
            httpsURLConnection.setRequestProperty("net-msg-id", str);
        }
        if (TextUtils.isEmpty(httpsURLConnection.getRequestProperty(HeaderType.X_NUWA_SPAN_ID))) {
            httpsURLConnection.setRequestProperty(HeaderType.X_NUWA_SPAN_ID, str2);
        }
        if (TextUtils.isEmpty(httpsURLConnection.getRequestProperty(HeaderType.X_NUWA_MICROSERVICE_NAME))) {
            httpsURLConnection.setRequestProperty(HeaderType.X_NUWA_MICROSERVICE_NAME, HiAnalyticsManager.APM_EVENT_ID);
        }
    }
}
