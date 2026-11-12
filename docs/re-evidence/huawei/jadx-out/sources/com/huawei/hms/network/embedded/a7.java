package com.huawei.hms.network.embedded;

import com.huawei.operation.utils.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes34.dex */
public final class a7 {
    public static final x6[] e;
    public static final x6[] f;
    public static final a7 g;
    public static final a7 h;
    public static final a7 i;
    public static final a7 j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String[] f14568c;

    @Nullable
    public final String[] d;

    public String toString() {
        if (!this.f14566a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(d(), "[all enabled]") + ", supportsTlsExtensions=" + this.f14567b + Constants.RIGHT_BRACKET_ONLY;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String[] f14570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String[] f14571c;
        public boolean d;

        public a7 c() {
            return new a7(this);
        }

        public a b(String... strArr) {
            if (!this.f14569a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f14571c = (String[]) strArr.clone();
            return this;
        }

        public a b() {
            if (!this.f14569a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.f14571c = null;
            return this;
        }

        public a a(String... strArr) {
            if (!this.f14569a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f14570b = (String[]) strArr.clone();
            return this;
        }

        public a a(y7... y7VarArr) {
            if (!this.f14569a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[y7VarArr.length];
            for (int i = 0; i < y7VarArr.length; i++) {
                strArr[i] = y7VarArr[i].f15631a;
            }
            return b(strArr);
        }

        public a a(x6... x6VarArr) {
            if (!this.f14569a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[x6VarArr.length];
            for (int i = 0; i < x6VarArr.length; i++) {
                strArr[i] = x6VarArr[i].f15600a;
            }
            return a(strArr);
        }

        public a a(boolean z) {
            if (!this.f14569a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.d = z;
            return this;
        }

        public a a() {
            if (!this.f14569a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.f14570b = null;
            return this;
        }

        public a(boolean z) {
            this.f14569a = z;
        }

        public a(a7 a7Var) {
            this.f14569a = a7Var.f14566a;
            this.f14570b = a7Var.f14568c;
            this.f14571c = a7Var.d;
            this.d = a7Var.f14567b;
        }
    }

    public int hashCode() {
        if (this.f14566a) {
            return ((((Arrays.hashCode(this.f14568c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.f14567b ? 1 : 0);
        }
        return 17;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a7)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a7 a7Var = (a7) obj;
        boolean z = this.f14566a;
        if (z != a7Var.f14566a) {
            return false;
        }
        return !z || (Arrays.equals(this.f14568c, a7Var.f14568c) && Arrays.equals(this.d, a7Var.d) && this.f14567b == a7Var.f14567b);
    }

    @Nullable
    public List<y7> d() {
        String[] strArr = this.d;
        if (strArr != null) {
            return y7.a(strArr);
        }
        return null;
    }

    public boolean c() {
        return this.f14567b;
    }

    public boolean b() {
        return this.f14566a;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f14566a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !f8.b(f8.j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f14568c;
        return strArr2 == null || f8.b(x6.f15598b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public void a(SSLSocket sSLSocket, boolean z) {
        a7 a7VarB = b(sSLSocket, z);
        String[] strArr = a7VarB.d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = a7VarB.f14568c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<x6> a() {
        String[] strArr = this.f14568c;
        if (strArr != null) {
            return x6.a(strArr);
        }
        return null;
    }

    private a7 b(SSLSocket sSLSocket, boolean z) {
        String[] strArrA = this.f14568c != null ? f8.a(x6.f15598b, sSLSocket.getEnabledCipherSuites(), this.f14568c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.d != null ? f8.a(f8.j, sSLSocket.getEnabledProtocols(), this.d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = f8.a(x6.f15598b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iA != -1) {
            strArrA = f8.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).c();
    }

    public a7(a aVar) {
        this.f14566a = aVar.f14569a;
        this.f14568c = aVar.f14570b;
        this.d = aVar.f14571c;
        this.f14567b = aVar.d;
    }

    static {
        x6[] x6VarArr = {x6.n1, x6.o1, x6.p1, x6.Z0, x6.d1, x6.a1, x6.e1, x6.k1, x6.j1};
        e = x6VarArr;
        x6[] x6VarArr2 = {x6.n1, x6.o1, x6.p1, x6.Z0, x6.d1, x6.a1, x6.e1, x6.k1, x6.j1, x6.K0, x6.L0, x6.i0, x6.j0, x6.G, x6.K, x6.k};
        f = x6VarArr2;
        g = new a(true).a(x6VarArr).a(y7.TLS_1_3, y7.TLS_1_2).a(true).c();
        h = new a(true).a(x6VarArr2).a(y7.TLS_1_3, y7.TLS_1_2).a(true).c();
        i = new a(true).a(x6VarArr2).a(y7.TLS_1_3, y7.TLS_1_2, y7.TLS_1_1, y7.TLS_1_0).a(true).c();
        j = new a(false).c();
    }
}
