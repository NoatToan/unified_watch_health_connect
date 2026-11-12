package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class i8 implements n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final n8 f14918a;

    @Override // com.huawei.hms.network.embedded.n7
    public v7 intercept(n7.a aVar) throws IOException {
        n8 n8Var = this.f14918a;
        v7 v7VarA = n8Var != null ? n8Var.a(aVar.request()) : null;
        k8 k8VarA = new k8.a(System.currentTimeMillis(), aVar.request(), v7VarA).a();
        t7 t7Var = k8VarA.f15008a;
        v7 v7Var = k8VarA.f15009b;
        n8 n8Var2 = this.f14918a;
        if (n8Var2 != null) {
            n8Var2.a(k8VarA);
        }
        if (v7VarA != null && v7Var == null) {
            f8.a(v7VarA.s());
        }
        if (t7Var == null && v7Var == null) {
            return new v7.a().a(aVar.request()).a(r7.HTTP_1_1).a(504).a("Unsatisfiable Request (only-if-cached)").a(f8.d).b(-1L).a(System.currentTimeMillis()).a();
        }
        if (t7Var == null) {
            return v7Var.D().a(a(v7Var)).a();
        }
        try {
            v7 v7VarA2 = aVar.a(t7Var);
            if (v7VarA2 == null && v7VarA != null) {
                f8.a(v7VarA.s());
            }
            if (v7Var != null) {
                if (v7VarA2.w() == 304) {
                    v7 v7VarA3 = v7Var.D().a(a(v7Var.y(), v7VarA2.y())).b(v7VarA2.I()).a(v7VarA2.G()).a(a(v7Var)).b(a(v7VarA2)).a();
                    v7VarA2.s().close();
                    this.f14918a.a();
                    this.f14918a.a(v7Var, v7VarA3);
                    return v7VarA3;
                }
                f8.a(v7Var.s());
            }
            v7 v7VarA4 = v7VarA2.D().a(a(v7Var)).b(a(v7VarA2)).a();
            if (this.f14918a != null) {
                if (i9.b(v7VarA4) && k8.a(v7VarA4, t7Var)) {
                    return a(this.f14918a.a(v7VarA4), v7VarA4);
                }
                if (j9.a(t7Var.h())) {
                    try {
                        this.f14918a.b(t7Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return v7VarA4;
        } catch (Throwable th) {
            if (v7VarA != null) {
                f8.a(v7VarA.s());
            }
            throw th;
        }
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public class a implements zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ db f14920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j8 f14921c;
        public final /* synthetic */ cb d;

        @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return this.f14920b.timeout();
        }

        @Override // com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws IOException {
            try {
                long j2 = this.f14920b.read(bbVar, j);
                if (j2 != -1) {
                    bbVar.a(this.d.a(), bbVar.B() - j2, j2);
                    this.d.d();
                    return j2;
                }
                if (!this.f14919a) {
                    this.f14919a = true;
                    this.d.close();
                }
                return -1L;
            } catch (IOException e) {
                if (!this.f14919a) {
                    this.f14919a = true;
                    this.f14921c.abort();
                }
                throw e;
            }
        }

        @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
            if (!this.f14919a && !f8.a(this, 100, TimeUnit.MILLISECONDS)) {
                this.f14919a = true;
                this.f14921c.abort();
            }
            this.f14920b.close();
        }

        public a(db dbVar, j8 j8Var, cb cbVar) {
            this.f14920b = dbVar;
            this.f14921c = j8Var;
            this.d = cbVar;
        }
    }

    public static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static v7 a(v7 v7Var) {
        return (v7Var == null || v7Var.s() == null) ? v7Var : v7Var.D().a((w7) null).a();
    }

    private v7 a(j8 j8Var, v7 v7Var) throws IOException {
        yb ybVarA;
        if (j8Var == null || (ybVarA = j8Var.a()) == null) {
            return v7Var;
        }
        return v7Var.D().a(new l9(v7Var.b("Content-Type"), v7Var.s().v(), ob.a(new a(v7Var.s().x(), j8Var, ob.a(ybVarA))))).a();
    }

    public static j7 a(j7 j7Var, j7 j7Var2) {
        j7.a aVar = new j7.a();
        int iD = j7Var.d();
        for (int i = 0; i < iD; i++) {
            String strA = j7Var.a(i);
            String strB = j7Var.b(i);
            if ((!"Warning".equalsIgnoreCase(strA) || !strB.startsWith("1")) && (a(strA) || !b(strA) || j7Var2.a(strA) == null)) {
                c8.f14676a.a(aVar, strA, strB);
            }
        }
        int iD2 = j7Var2.d();
        for (int i2 = 0; i2 < iD2; i2++) {
            String strA2 = j7Var2.a(i2);
            if (!a(strA2) && b(strA2)) {
                c8.f14676a.a(aVar, strA2, j7Var2.b(i2));
            }
        }
        return aVar.a();
    }

    public i8(@Nullable n8 n8Var) {
        this.f14918a = n8Var;
    }
}
