package com.huawei.hms.network.embedded;

import androidx.webkit.ProxyConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes34.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7 f15180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f7 f15181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SocketFactory f15182c;
    public final q6 d;
    public final List<r7> e;
    public final List<a7> f;
    public final ProxySelector g;

    @Nullable
    public final Proxy h;

    @Nullable
    public final SSLSocketFactory i;

    @Nullable
    public final HostnameVerifier j;

    @Nullable
    public final v6 k;
    public String l;

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f15180a.h());
        sb.append(":");
        sb.append(this.f15180a.n());
        if (this.h != null) {
            sb.append(", proxy=");
            obj = this.h;
        } else {
            sb.append(", proxySelector=");
            obj = this.g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public m7 l() {
        return this.f15180a;
    }

    @Nullable
    public SSLSocketFactory k() {
        return this.i;
    }

    public SocketFactory j() {
        return this.f15182c;
    }

    public ProxySelector i() {
        return this.g;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f15180a.hashCode() + 527) * 31) + this.f15181b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.k);
    }

    public q6 h() {
        return this.d;
    }

    @Nullable
    public Proxy g() {
        return this.h;
    }

    public List<r7> f() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return this.f15180a.equals(p6Var.f15180a) && a(p6Var);
    }

    @Nullable
    public HostnameVerifier e() {
        return this.j;
    }

    public String d() {
        return this.l;
    }

    public f7 c() {
        return this.f15181b;
    }

    public List<a7> b() {
        return this.f;
    }

    public boolean a(p6 p6Var) {
        return this.f15181b.equals(p6Var.f15181b) && this.d.equals(p6Var.d) && this.e.equals(p6Var.e) && this.f.equals(p6Var.f) && this.g.equals(p6Var.g) && Objects.equals(this.h, p6Var.h) && Objects.equals(this.i, p6Var.i) && Objects.equals(this.j, p6Var.j) && Objects.equals(this.k, p6Var.k) && l().n() == p6Var.l().n();
    }

    public void a(String str) {
        this.l = str;
    }

    @Nullable
    public v6 a() {
        return this.k;
    }

    public p6(String str, int i, f7 f7Var, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable v6 v6Var, q6 q6Var, @Nullable Proxy proxy, List<r7> list, List<a7> list2, ProxySelector proxySelector) {
        this.f15180a = new m7.a().p(sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : "http").k(str).a(i).a();
        if (f7Var == null) {
            throw new NullPointerException("dns == null");
        }
        this.f15181b = f7Var;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f15182c = socketFactory;
        if (q6Var == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = q6Var;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = f8.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = f8.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = v6Var;
        this.l = null;
    }
}
