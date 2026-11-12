package com.liulishuo.filedownloader.connection;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadUrlConnection implements FileDownloadConnection {
    public URLConnection mConnection;

    public static class Configuration {
        private Proxy a;
        private Integer b;
        private Integer c;

        public Configuration connectTimeout(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public Configuration proxy(Proxy proxy) {
            this.a = proxy;
            return this;
        }

        public Configuration readTimeout(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    public static class Creator implements FileDownloadHelper.ConnectionCreator {
        private final Configuration a;

        public Creator() {
            this(null);
        }

        public FileDownloadConnection a(URL url) throws IOException {
            return new FileDownloadUrlConnection(url, this.a);
        }

        @Override // com.liulishuo.filedownloader.util.FileDownloadHelper.ConnectionCreator
        public FileDownloadConnection create(String str) throws IOException {
            return new FileDownloadUrlConnection(str, this.a);
        }

        public Creator(Configuration configuration) {
            this.a = configuration;
        }
    }

    public FileDownloadUrlConnection(String str, Configuration configuration) throws IOException {
        this(new URL(str), configuration);
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public void addHeader(String str, String str2) {
        this.mConnection.addRequestProperty(str, str2);
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public boolean dispatchAddResumeOffset(String str, long j) {
        return false;
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public void ending() {
        try {
            this.mConnection.getInputStream().close();
        } catch (IOException unused) {
        }
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public void execute() throws IOException {
        this.mConnection.connect();
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public InputStream getInputStream() throws IOException {
        return this.mConnection.getInputStream();
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public Map<String, List<String>> getRequestHeaderFields() {
        return this.mConnection.getRequestProperties();
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public int getResponseCode() throws IOException {
        URLConnection uRLConnection = this.mConnection;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public String getResponseHeaderField(String str) {
        return this.mConnection.getHeaderField(str);
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public Map<String, List<String>> getResponseHeaderFields() {
        return this.mConnection.getHeaderFields();
    }

    @Override // com.liulishuo.filedownloader.connection.FileDownloadConnection
    public boolean setRequestMethod(String str) throws ProtocolException {
        URLConnection uRLConnection = this.mConnection;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }

    public FileDownloadUrlConnection(URL url, Configuration configuration) throws IOException {
        if (configuration == null || configuration.a == null) {
            this.mConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        } else {
            this.mConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(configuration.a));
        }
        if (configuration != null) {
            if (configuration.b != null) {
                this.mConnection.setReadTimeout(configuration.b.intValue());
            }
            if (configuration.c != null) {
                this.mConnection.setConnectTimeout(configuration.c.intValue());
            }
        }
    }

    public FileDownloadUrlConnection(String str) throws IOException {
        this(str, (Configuration) null);
    }
}
