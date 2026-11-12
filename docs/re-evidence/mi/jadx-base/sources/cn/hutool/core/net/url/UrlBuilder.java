package cn.hutool.core.net.url;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.au3;
import defpackage.d8q;
import defpackage.ndq;
import defpackage.pdq;
import defpackage.qk1;
import defpackage.tt3;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class UrlBuilder implements Serializable {
    private static final String DEFAULT_SCHEME = "http";
    private static final long serialVersionUID = 1;
    private Charset charset;
    private String fragment;
    private String host;
    private ndq path;
    private int port;
    private pdq query;
    private String scheme;

    public UrlBuilder() {
        this.port = -1;
        this.charset = au3.f3449b;
    }

    public static UrlBuilder create() {
        return new UrlBuilder();
    }

    public static UrlBuilder of(URI uri, Charset charset) {
        return of(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getRawQuery(), uri.getFragment(), charset);
    }

    public static UrlBuilder ofHttp(String str) {
        return ofHttp(str, au3.f3449b);
    }

    public static UrlBuilder ofHttpWithoutEncode(String str) {
        return ofHttp(str, null);
    }

    public UrlBuilder addPath(String str) {
        if (tt3.F(str)) {
            return this;
        }
        if (this.path == null) {
            this.path = new ndq();
        }
        this.path.a(str);
        return this;
    }

    public UrlBuilder addQuery(String str, String str2) {
        if (tt3.G(str)) {
            return this;
        }
        if (this.query == null) {
            this.query = new pdq();
        }
        this.query.a(str, str2);
        return this;
    }

    public UrlBuilder appendPath(CharSequence charSequence) {
        if (tt3.G(charSequence)) {
            return this;
        }
        if (this.path == null) {
            this.path = new ndq();
        }
        this.path.a(charSequence);
        return this;
    }

    public String build() {
        return toURL().toString();
    }

    public String getAuthority() {
        if (this.port < 0) {
            return this.host;
        }
        return this.host + ":" + this.port;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getFragment() {
        return this.fragment;
    }

    public String getFragmentEncoded() {
        return d8q.e(this.fragment, this.charset);
    }

    public String getHost() {
        return this.host;
    }

    public ndq getPath() {
        return this.path;
    }

    public String getPathStr() {
        ndq ndqVar = this.path;
        return ndqVar == null ? "/" : ndqVar.c(this.charset);
    }

    public int getPort() {
        return this.port;
    }

    public pdq getQuery() {
        return this.query;
    }

    public String getQueryStr() {
        pdq pdqVar = this.query;
        if (pdqVar == null) {
            return null;
        }
        return pdqVar.d(this.charset);
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getSchemeWithDefault() {
        return tt3.p(this.scheme, DEFAULT_SCHEME);
    }

    public UrlBuilder setCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    public UrlBuilder setFragment(String str) {
        if (tt3.G(str)) {
            this.fragment = null;
        }
        this.fragment = tt3.Q(str, PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
        return this;
    }

    public UrlBuilder setHost(String str) {
        this.host = str;
        return this;
    }

    public UrlBuilder setPath(ndq ndqVar) {
        this.path = ndqVar;
        return this;
    }

    public UrlBuilder setPort(int i) {
        this.port = i;
        return this;
    }

    public UrlBuilder setQuery(pdq pdqVar) {
        this.query = pdqVar;
        return this;
    }

    public UrlBuilder setScheme(String str) {
        this.scheme = str;
        return this;
    }

    public String toString() {
        return build();
    }

    public URI toURI() {
        try {
            return new URI(getSchemeWithDefault(), getAuthority(), getPathStr(), getQueryStr(), getFragmentEncoded());
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public URL toURL() {
        return toURL(null);
    }

    public static UrlBuilder of(String str) {
        return of(str, au3.f3449b);
    }

    public static UrlBuilder ofHttp(String str, Charset charset) {
        qk1.p(str, "Http url must be not blank!", new Object[0]);
        if (str.indexOf("://") < 0) {
            str = "http://" + str.trim();
        }
        return of(str, charset);
    }

    public URL toURL(URLStreamHandler uRLStreamHandler) {
        StringBuilder sb = new StringBuilder();
        sb.append(tt3.e(getPathStr(), "/"));
        String queryStr = getQueryStr();
        if (tt3.H(queryStr)) {
            sb.append('?');
            sb.append(queryStr);
        }
        if (tt3.H(this.fragment)) {
            sb.append('#');
            sb.append(getFragmentEncoded());
        }
        try {
            return new URL(getSchemeWithDefault(), this.host, this.port, sb.toString(), uRLStreamHandler);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public static UrlBuilder of(String str, Charset charset) {
        qk1.p(str, "Url must be not blank!", new Object[0]);
        return of(d8q.n(str.trim()), charset);
    }

    public UrlBuilder(String str, String str2, int i, ndq ndqVar, pdq pdqVar, String str3, Charset charset) {
        this.charset = charset;
        this.scheme = str;
        this.host = str2;
        this.port = i;
        this.path = ndqVar;
        this.query = pdqVar;
        setFragment(str3);
    }

    public static UrlBuilder of(URL url, Charset charset) {
        return of(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef(), charset);
    }

    public static UrlBuilder of(String str, String str2, int i, String str3, String str4, String str5, Charset charset) {
        return of(str, str2, i, ndq.e(str3, charset), pdq.e(str4, charset, false), str5, charset);
    }

    public static UrlBuilder of(String str, String str2, int i, ndq ndqVar, pdq pdqVar, String str3, Charset charset) {
        return new UrlBuilder(str, str2, i, ndqVar, pdqVar, str3, charset);
    }
}
