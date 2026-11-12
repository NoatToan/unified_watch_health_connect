package com.nimbusds.jose.util;

import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class DefaultResourceRetriever extends AbstractRestrictedResourceRetriever implements RestrictedResourceRetriever {
    private boolean disconnectAfterUse;
    private Proxy proxy;
    private final SSLSocketFactory sslSocketFactory;

    public DefaultResourceRetriever(int i14, int i15, int i16, boolean z14) {
        this(i14, i15, i16, z14, null);
    }

    private InputStream getInputStream(URLConnection uRLConnection, int i14) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        return i14 > 0 ? new BoundedInputStream(inputStream, getSizeLimit()) : inputStream;
    }

    public boolean disconnectsAfterUse() {
        return this.disconnectAfterUse;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    @Deprecated
    public HttpURLConnection openConnection(URL url) {
        return openHTTPConnection(url);
    }

    public URLConnection openFileConnection(URL url) {
        return url.openConnection();
    }

    public HttpURLConnection openHTTPConnection(URL url) {
        Proxy proxy = this.proxy;
        return proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
    }

    @Override // com.nimbusds.jose.util.ResourceRetriever
    public Resource retrieveResource(URL url) throws Throwable {
        SSLSocketFactory sSLSocketFactory;
        URLConnection uRLConnection = null;
        try {
            try {
                URLConnection uRLConnectionOpenFileConnection = "file".equals(url.getProtocol()) ? openFileConnection(url) : openConnection(url);
                try {
                    uRLConnectionOpenFileConnection.setConnectTimeout(getConnectTimeout());
                    uRLConnectionOpenFileConnection.setReadTimeout(getReadTimeout());
                    if ((uRLConnectionOpenFileConnection instanceof HttpsURLConnection) && (sSLSocketFactory = this.sslSocketFactory) != null) {
                        ((HttpsURLConnection) uRLConnectionOpenFileConnection).setSSLSocketFactory(sSLSocketFactory);
                    }
                    if ((uRLConnectionOpenFileConnection instanceof HttpURLConnection) && getHeaders() != null && !getHeaders().isEmpty()) {
                        for (Map.Entry<String, List<String>> entry : getHeaders().entrySet()) {
                            Iterator<String> it = entry.getValue().iterator();
                            while (it.hasNext()) {
                                uRLConnectionOpenFileConnection.addRequestProperty(entry.getKey(), it.next());
                            }
                        }
                    }
                    InputStream inputStream = getInputStream(uRLConnectionOpenFileConnection, getSizeLimit());
                    try {
                        String inputStreamToString = IOUtils.readInputStreamToString(inputStream, StandardCharset.UTF_8);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (uRLConnectionOpenFileConnection instanceof HttpURLConnection) {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenFileConnection;
                            int responseCode = httpURLConnection.getResponseCode();
                            String responseMessage = httpURLConnection.getResponseMessage();
                            if (responseCode > 299 || responseCode < 200) {
                                throw new IOException("HTTP " + responseCode + ": " + responseMessage);
                            }
                        }
                        Resource resource = new Resource(inputStreamToString, uRLConnectionOpenFileConnection instanceof HttpURLConnection ? uRLConnectionOpenFileConnection.getContentType() : null);
                        if (this.disconnectAfterUse && (uRLConnectionOpenFileConnection instanceof HttpURLConnection)) {
                            ((HttpURLConnection) uRLConnectionOpenFileConnection).disconnect();
                        }
                        return resource;
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    if (e instanceof IOException) {
                        throw e;
                    }
                    throw new IOException("Couldn't open URL connection: " + e.getMessage(), e);
                } catch (Throwable th5) {
                    uRLConnection = uRLConnectionOpenFileConnection;
                    th = th5;
                    if (this.disconnectAfterUse && (uRLConnection instanceof HttpURLConnection)) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    public void setDisconnectsAfterUse(boolean z14) {
        this.disconnectAfterUse = z14;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public DefaultResourceRetriever(int i14, int i15) {
        this(i14, i15, 0);
    }

    public DefaultResourceRetriever(int i14, int i15, int i16) {
        this(i14, i15, i16, true);
    }

    public DefaultResourceRetriever() {
        this(0, 0);
    }

    public DefaultResourceRetriever(int i14, int i15, int i16, boolean z14, SSLSocketFactory sSLSocketFactory) {
        super(i14, i15, i16);
        this.disconnectAfterUse = z14;
        this.sslSocketFactory = sSLSocketFactory;
    }
}
