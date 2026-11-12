package com.huawei.hms.network.embedded;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6 f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f15602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f15603c;

    public String toString() {
        return "Route{" + this.f15603c + "}";
    }

    public int hashCode() {
        return ((((this.f15601a.hashCode() + 527) * 31) + this.f15602b.hashCode()) * 31) + this.f15603c.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        return x7Var.f15601a.equals(this.f15601a) && x7Var.f15602b.equals(this.f15602b) && x7Var.f15603c.equals(this.f15603c);
    }

    public InetSocketAddress d() {
        return this.f15603c;
    }

    public boolean c() {
        return this.f15601a.i != null && this.f15602b.type() == Proxy.Type.HTTP;
    }

    public Proxy b() {
        return this.f15602b;
    }

    public p6 a() {
        return this.f15601a;
    }

    public x7(p6 p6Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (p6Var == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f15601a = p6Var;
        this.f15602b = proxy;
        this.f15603c = inetSocketAddress;
    }
}
