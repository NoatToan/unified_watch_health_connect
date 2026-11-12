package okhttp3;

import com.alipay.sdk.m.u.i;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes23.dex */
public final class Address {
    public final HttpUrl a;
    public final Dns b;
    public final SocketFactory c;
    public final Authenticator d;
    public final List<Protocol> e;
    public final List<ConnectionSpec> f;
    public final ProxySelector g;

    @Nullable
    public final Proxy h;

    @Nullable
    public final SSLSocketFactory i;

    @Nullable
    public final HostnameVerifier j;

    @Nullable
    public final CertificatePinner k;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, Authenticator authenticator, @Nullable Proxy proxy, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        this.a = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        Objects.requireNonNull(dns, "dns == null");
        this.b = dns;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.c = socketFactory;
        Objects.requireNonNull(authenticator, "proxyAuthenticator == null");
        this.d = authenticator;
        Objects.requireNonNull(list, "protocols == null");
        this.e = Util.immutableList(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f = Util.immutableList(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = certificatePinner;
    }

    public boolean a(Address address) {
        return this.b.equals(address.b) && this.d.equals(address.d) && this.e.equals(address.e) && this.f.equals(address.f) && this.g.equals(address.g) && Util.equal(this.h, address.h) && Util.equal(this.i, address.i) && Util.equal(this.j, address.j) && Util.equal(this.k, address.k) && url().port() == address.url().port();
    }

    @Nullable
    public CertificatePinner certificatePinner() {
        return this.k;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.f;
    }

    public Dns dns() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (this.a.equals(address.a) && a(address)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        CertificatePinner certificatePinner = this.k;
        return iHashCode4 + (certificatePinner != null ? certificatePinner.hashCode() : 0);
    }

    @Nullable
    public HostnameVerifier hostnameVerifier() {
        return this.j;
    }

    public List<Protocol> protocols() {
        return this.e;
    }

    @Nullable
    public Proxy proxy() {
        return this.h;
    }

    public Authenticator proxyAuthenticator() {
        return this.d;
    }

    public ProxySelector proxySelector() {
        return this.g;
    }

    public SocketFactory socketFactory() {
        return this.c;
    }

    @Nullable
    public SSLSocketFactory sslSocketFactory() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.host());
        sb.append(":");
        sb.append(this.a.port());
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append(i.d);
        return sb.toString();
    }

    public HttpUrl url() {
        return this.a;
    }
}
