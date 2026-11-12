package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class iqs extends qns {
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22004a;
    public boolean c;
    public boolean e;
    public boolean g;
    public boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22006k;
    public boolean m;
    public boolean o;
    public boolean q;
    public boolean s;
    public boolean u;
    public l3s v;
    public boolean w;
    public l3s x;
    public boolean y;
    public int z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22005b = 0;
    public String d = "";
    public String f = "";
    public String h = "";
    public int j = 0;
    public String l = "";
    public String n = "";
    public String p = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public fqs f22007r = null;
    public int t = 0;

    public iqs() {
        l3s l3sVar = l3s.c;
        this.v = l3sVar;
        this.x = l3sVar;
        this.z = 0;
        this.A = -1;
    }

    public iqs A(String str) {
        this.g = true;
        this.h = str;
        return this;
    }

    public String B() {
        return this.h;
    }

    public boolean C() {
        return this.e;
    }

    public int D() {
        return this.j;
    }

    public iqs E(int i) {
        this.y = true;
        this.z = i;
        return this;
    }

    public iqs F(String str) {
        this.f22006k = true;
        this.l = str;
        return this;
    }

    public String G() {
        return this.l;
    }

    public boolean H() {
        return this.g;
    }

    public int I() {
        return this.t;
    }

    public iqs J(String str) {
        this.m = true;
        this.n = str;
        return this;
    }

    public String K() {
        return this.n;
    }

    public boolean L() {
        return this.i;
    }

    public int M() {
        return this.z;
    }

    public iqs N(String str) {
        this.o = true;
        this.p = str;
        return this;
    }

    public String O() {
        return this.p;
    }

    public boolean P() {
        return this.f22006k;
    }

    public boolean Q() {
        return this.m;
    }

    public boolean R() {
        return this.o;
    }

    public boolean S() {
        return this.q;
    }

    public boolean T() {
        return this.s;
    }

    public boolean U() {
        return this.u;
    }

    public boolean V() {
        return this.w;
    }

    public boolean W() {
        return this.y;
    }

    @Override // defpackage.qns
    public int a() {
        if (this.A < 0) {
            i();
        }
        return this.A;
    }

    @Override // defpackage.qns
    public void e(c cVar) throws IOException {
        if (r()) {
            cVar.M(1, y());
        }
        if (x()) {
            cVar.x(2, q());
        }
        if (C()) {
            cVar.x(3, w());
        }
        if (H()) {
            cVar.x(4, B());
        }
        if (L()) {
            cVar.t(5, D());
        }
        if (P()) {
            cVar.x(6, G());
        }
        if (Q()) {
            cVar.x(7, K());
        }
        if (R()) {
            cVar.x(8, O());
        }
        if (S()) {
            cVar.w(9, k());
        }
        if (T()) {
            cVar.t(10, I());
        }
        if (U()) {
            cVar.v(11, j());
        }
        if (V()) {
            cVar.v(12, s());
        }
        if (W()) {
            cVar.t(13, M());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iH = r() ? c.H(1, y()) : 0;
        if (x()) {
            iH += c.g(2, q());
        }
        if (C()) {
            iH += c.g(3, w());
        }
        if (H()) {
            iH += c.g(4, B());
        }
        if (L()) {
            iH += c.c(5, D());
        }
        if (P()) {
            iH += c.g(6, G());
        }
        if (Q()) {
            iH += c.g(7, K());
        }
        if (R()) {
            iH += c.g(8, O());
        }
        if (S()) {
            iH += c.f(9, k());
        }
        if (T()) {
            iH += c.c(10, I());
        }
        if (U()) {
            iH += c.e(11, j());
        }
        if (V()) {
            iH += c.e(12, s());
        }
        if (W()) {
            iH += c.c(13, M());
        }
        this.A = iH;
        return iH;
    }

    public l3s j() {
        return this.v;
    }

    public fqs k() {
        return this.f22007r;
    }

    public iqs l(int i) {
        this.f22004a = true;
        this.f22005b = i;
        return this;
    }

    public iqs m(l3s l3sVar) {
        this.u = true;
        this.v = l3sVar;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public iqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            switch (iB) {
                case 0:
                    return this;
                case 8:
                    l(casVar.u());
                    break;
                case 18:
                    p(casVar.h());
                    break;
                case 26:
                    v(casVar.h());
                    break;
                case 34:
                    A(casVar.h());
                    break;
                case 40:
                    t(casVar.p());
                    break;
                case 50:
                    F(casVar.h());
                    break;
                case 58:
                    J(casVar.h());
                    break;
                case 66:
                    N(casVar.h());
                    break;
                case 74:
                    fqs fqsVar = new fqs();
                    casVar.k(fqsVar);
                    o(fqsVar);
                    break;
                case 80:
                    z(casVar.p());
                    break;
                case 90:
                    m(casVar.e());
                    break;
                case 98:
                    u(casVar.e());
                    break;
                case 104:
                    E(casVar.p());
                    break;
                default:
                    if (!g(casVar, iB)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    public iqs o(fqs fqsVar) {
        fqsVar.getClass();
        this.q = true;
        this.f22007r = fqsVar;
        return this;
    }

    public iqs p(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public String q() {
        return this.d;
    }

    public boolean r() {
        return this.f22004a;
    }

    public l3s s() {
        return this.x;
    }

    public iqs t(int i) {
        this.i = true;
        this.j = i;
        return this;
    }

    public iqs u(l3s l3sVar) {
        this.w = true;
        this.x = l3sVar;
        return this;
    }

    public iqs v(String str) {
        this.e = true;
        this.f = str;
        return this;
    }

    public String w() {
        return this.f;
    }

    public boolean x() {
        return this.c;
    }

    public int y() {
        return this.f22005b;
    }

    public iqs z(int i) {
        this.s = true;
        this.t = i;
        return this;
    }
}
