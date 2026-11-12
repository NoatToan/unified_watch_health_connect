package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class InstrHttpURLConnection extends HttpURLConnection {
    private final InstrURLConnectionBase delegate;

    public InstrHttpURLConnection(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpURLConnection.getURL());
        this.delegate = new InstrURLConnectionBase(httpURLConnection, timer, networkRequestMetricBuilder);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.delegate.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.delegate.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.delegate.disconnect();
    }

    public boolean equals(Object obj) {
        return this.delegate.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.delegate.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.delegate.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.delegate.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.delegate.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.delegate.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.delegate.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.delegate.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.delegate.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.delegate.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.delegate.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.delegate.getErrorStream();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.delegate.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i14) {
        return this.delegate.getHeaderField(i14);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j8) {
        return this.delegate.getHeaderFieldDate(str, j8);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i14) {
        return this.delegate.getHeaderFieldInt(str, i14);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i14) {
        return this.delegate.getHeaderFieldKey(i14);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j8) {
        return this.delegate.getHeaderFieldLong(str, j8);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.delegate.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.delegate.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.delegate.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.delegate.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.delegate.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.delegate.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.delegate.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.delegate.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.delegate.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.delegate.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.delegate.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.delegate.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.delegate.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.delegate.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.delegate.getUseCaches();
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z14) {
        this.delegate.setAllowUserInteraction(z14);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i14) {
        this.delegate.setChunkedStreamingMode(i14);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i14) {
        this.delegate.setConnectTimeout(i14);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z14) {
        this.delegate.setDefaultUseCaches(z14);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z14) {
        this.delegate.setDoInput(z14);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z14) {
        this.delegate.setDoOutput(z14);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i14) {
        this.delegate.setFixedLengthStreamingMode(i14);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j8) {
        this.delegate.setIfModifiedSince(j8);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z14) {
        this.delegate.setInstanceFollowRedirects(z14);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i14) {
        this.delegate.setReadTimeout(i14);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.delegate.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.delegate.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z14) {
        this.delegate.setUseCaches(z14);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.delegate.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.delegate.usingProxy();
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j8) {
        this.delegate.setFixedLengthStreamingMode(j8);
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.delegate.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.delegate.getHeaderField(str);
    }
}
