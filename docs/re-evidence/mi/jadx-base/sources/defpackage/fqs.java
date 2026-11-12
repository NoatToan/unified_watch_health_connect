package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class fqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18099a;
    public boolean c;
    public boolean e;
    public boolean g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18100b = false;
    public int d = 0;
    public int f = 0;
    public int h = 0;
    public int i = -1;

    public static fqs m(byte[] bArr) {
        return (fqs) new fqs().c(bArr);
    }

    @Override // defpackage.qns
    public int a() {
        if (this.i < 0) {
            i();
        }
        return this.i;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (p()) {
            cVar.y(1, n());
        }
        if (s()) {
            cVar.t(3, q());
        }
        if (u()) {
            cVar.t(4, t());
        }
        if (w()) {
            cVar.t(5, v());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iH = p() ? c.h(1, n()) : 0;
        if (s()) {
            iH += c.c(3, q());
        }
        if (u()) {
            iH += c.c(4, t());
        }
        if (w()) {
            iH += c.c(5, v());
        }
        this.i = iH;
        return iH;
    }

    public fqs j(int i) {
        this.c = true;
        this.d = i;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public fqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            if (iB == 0) {
                return this;
            }
            if (iB == 8) {
                l(casVar.l());
            } else if (iB == 24) {
                j(casVar.p());
            } else if (iB == 32) {
                o(casVar.p());
            } else if (iB == 40) {
                r(casVar.p());
            } else if (!g(casVar, iB)) {
                return this;
            }
        }
    }

    public fqs l(boolean z) {
        this.f18099a = true;
        this.f18100b = z;
        return this;
    }

    public boolean n() {
        return this.f18100b;
    }

    public fqs o(int i) {
        this.e = true;
        this.f = i;
        return this;
    }

    public boolean p() {
        return this.f18099a;
    }

    public int q() {
        return this.d;
    }

    public fqs r(int i) {
        this.g = true;
        this.h = i;
        return this;
    }

    public boolean s() {
        return this.c;
    }

    public int t() {
        return this.f;
    }

    public boolean u() {
        return this.e;
    }

    public int v() {
        return this.h;
    }

    public boolean w() {
        return this.g;
    }
}
