package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class oqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29402a;
    public boolean c;
    public boolean e;
    public boolean g;
    public boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29404k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29403b = "";
    public String d = "";
    public long f = 0;
    public long h = 0;
    public boolean j = false;
    public int l = 0;
    public int m = -1;

    public static oqs p(byte[] bArr) {
        return (oqs) new oqs().c(bArr);
    }

    public boolean A() {
        return this.j;
    }

    public boolean B() {
        return this.i;
    }

    public boolean C() {
        return this.f29404k;
    }

    @Override // defpackage.qns
    public int a() {
        if (this.m < 0) {
            i();
        }
        return this.m;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (r()) {
            cVar.x(1, q());
        }
        if (w()) {
            cVar.x(2, v());
        }
        if (y()) {
            cVar.u(3, j());
        }
        if (z()) {
            cVar.u(4, s());
        }
        if (B()) {
            cVar.y(5, A());
        }
        if (C()) {
            cVar.t(6, x());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iG = r() ? c.g(1, q()) : 0;
        if (w()) {
            iG += c.g(2, v());
        }
        if (y()) {
            iG += c.d(3, j());
        }
        if (z()) {
            iG += c.d(4, s());
        }
        if (B()) {
            iG += c.h(5, A());
        }
        if (C()) {
            iG += c.c(6, x());
        }
        this.m = iG;
        return iG;
    }

    public long j() {
        return this.f;
    }

    public oqs k(int i) {
        this.f29404k = true;
        this.l = i;
        return this;
    }

    public oqs l(long j) {
        this.e = true;
        this.f = j;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public oqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 10) {
                n(casVar.h());
            } else if (iB == 18) {
                u(casVar.h());
            } else if (iB == 24) {
                l(casVar.d());
            } else if (iB == 32) {
                t(casVar.d());
            } else if (iB == 40) {
                o(casVar.l());
            } else if (iB == 48) {
                k(casVar.p());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public oqs n(String str) {
        this.f29402a = true;
        this.f29403b = str;
        return this;
    }

    public oqs o(boolean z) {
        this.i = true;
        this.j = z;
        return this;
    }

    public String q() {
        return this.f29403b;
    }

    public boolean r() {
        return this.f29402a;
    }

    public long s() {
        return this.h;
    }

    public oqs t(long j) {
        this.g = true;
        this.h = j;
        return this;
    }

    public oqs u(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public String v() {
        return this.d;
    }

    public boolean w() {
        return this.c;
    }

    public int x() {
        return this.l;
    }

    public boolean y() {
        return this.e;
    }

    public boolean z() {
        return this.g;
    }
}
