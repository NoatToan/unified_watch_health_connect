package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes34.dex */
public abstract class f0 implements Runnable {
    public static final String g = "DnRsv";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f14745c;
    public a d;
    public s0 e;
    public String f;

    public interface a {
        void a(String str, m0 m0Var);

        void a(String str, Throwable th);
    }

    public abstract m0 c();

    @Override // java.lang.Runnable
    public void run() {
        this.e.a();
        if (TextUtils.isEmpty(this.f14743a)) {
            this.e.a(new Exception("domain == null"));
            return;
        }
        a(c());
        if (!y.b(this.f14745c)) {
            this.e.a(this.f14745c);
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(this.f14743a, this.f14745c);
                return;
            }
            return;
        }
        Logger.i(g, t.m().a(this.f14744b) + " query failed, dnsResult is null, domain:" + this.f14743a);
        StringBuilder sb = new StringBuilder("query failed, dnsResult is null, domain:");
        sb.append(this.f14743a);
        Exception exc = new Exception(sb.toString());
        this.e.a(exc);
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.a(this.f14743a, exc);
        }
    }

    public String b() {
        return this.f;
    }

    public void a(m0 m0Var) {
        this.f14745c = m0Var;
    }

    public static final class b implements a {
        @Override // com.huawei.hms.network.embedded.f0.a
        public void a(String str, Throwable th) {
        }

        @Override // com.huawei.hms.network.embedded.f0.a
        public void a(String str, m0 m0Var) {
            a0.a(str, m0Var);
        }
    }

    public m0 a() {
        return this.f14745c;
    }

    public f0(String str, int i, String str2, a aVar) {
        this.f14743a = str;
        this.f14744b = i;
        this.f = str2;
        this.e = t.m().d().a(this);
        this.d = aVar;
    }

    public f0(String str, int i, String str2) {
        this.f14743a = str;
        this.f14744b = i;
        this.f = str2;
        this.d = null;
        this.e = t.m().d().a(this);
    }
}
