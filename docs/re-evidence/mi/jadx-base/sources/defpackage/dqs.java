package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class dqs extends qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15824a;
    public boolean c;
    public boolean e;
    public boolean g;
    public boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15826k;
    public boolean m;
    public boolean o;
    public boolean q;
    public boolean s;
    public boolean u;
    public boolean w;
    public boolean y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15825b = 0;
    public long d = 0;
    public String f = "";
    public String h = "";
    public String j = "";
    public String l = "";
    public String n = "";
    public int p = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15827r = 0;
    public int t = 0;
    public String v = "";
    public long x = 0;
    public long z = 0;
    public int A = -1;

    public dqs A(long j) {
        this.y = true;
        this.z = j;
        return this;
    }

    public dqs B(String str) {
        this.i = true;
        this.j = str;
        return this;
    }

    public String C() {
        return this.j;
    }

    public boolean D() {
        return this.e;
    }

    public int E() {
        return this.p;
    }

    public dqs F(int i) {
        this.s = true;
        this.t = i;
        return this;
    }

    public dqs G(String str) {
        this.f15826k = true;
        this.l = str;
        return this;
    }

    public String H() {
        return this.l;
    }

    public boolean I() {
        return this.g;
    }

    public int J() {
        return this.f15827r;
    }

    public dqs K(String str) {
        this.m = true;
        this.n = str;
        return this;
    }

    public String L() {
        return this.n;
    }

    public boolean M() {
        return this.i;
    }

    public int N() {
        return this.t;
    }

    public dqs O(String str) {
        this.u = true;
        this.v = str;
        return this;
    }

    public String P() {
        return this.v;
    }

    public boolean Q() {
        return this.f15826k;
    }

    public boolean R() {
        return this.m;
    }

    public boolean S() {
        return this.o;
    }

    public boolean T() {
        return this.q;
    }

    public boolean U() {
        return this.s;
    }

    public boolean V() {
        return this.u;
    }

    public boolean W() {
        return this.w;
    }

    public boolean X() {
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
        if (q()) {
            cVar.t(1, x());
        }
        if (w()) {
            cVar.N(2, j());
        }
        if (D()) {
            cVar.x(3, p());
        }
        if (I()) {
            cVar.x(4, v());
        }
        if (M()) {
            cVar.x(5, C());
        }
        if (Q()) {
            cVar.x(6, H());
        }
        if (R()) {
            cVar.x(7, L());
        }
        if (S()) {
            cVar.t(8, E());
        }
        if (T()) {
            cVar.t(9, J());
        }
        if (U()) {
            cVar.t(10, N());
        }
        if (V()) {
            cVar.x(11, P());
        }
        if (W()) {
            cVar.N(12, r());
        }
        if (X()) {
            cVar.N(13, y());
        }
    }

    @Override // defpackage.qns
    public int i() {
        int iC = q() ? c.c(1, x()) : 0;
        if (w()) {
            iC += c.I(2, j());
        }
        if (D()) {
            iC += c.g(3, p());
        }
        if (I()) {
            iC += c.g(4, v());
        }
        if (M()) {
            iC += c.g(5, C());
        }
        if (Q()) {
            iC += c.g(6, H());
        }
        if (R()) {
            iC += c.g(7, L());
        }
        if (S()) {
            iC += c.c(8, E());
        }
        if (T()) {
            iC += c.c(9, J());
        }
        if (U()) {
            iC += c.c(10, N());
        }
        if (V()) {
            iC += c.g(11, P());
        }
        if (W()) {
            iC += c.I(12, r());
        }
        if (X()) {
            iC += c.I(13, y());
        }
        this.A = iC;
        return iC;
    }

    public long j() {
        return this.d;
    }

    public dqs k() {
        this.f15826k = false;
        this.l = "";
        return this;
    }

    public dqs l(int i) {
        this.f15824a = true;
        this.f15825b = i;
        return this;
    }

    public dqs m(long j) {
        this.c = true;
        this.d = j;
        return this;
    }

    @Override // defpackage.qns
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dqs b(cas casVar) throws d {
        while (true) {
            int iB = casVar.b();
            switch (iB) {
                case 0:
                    return this;
                case 8:
                    l(casVar.p());
                    break;
                case 16:
                    m(casVar.q());
                    break;
                case 26:
                    o(casVar.h());
                    break;
                case 34:
                    u(casVar.h());
                    break;
                case 42:
                    B(casVar.h());
                    break;
                case 50:
                    G(casVar.h());
                    break;
                case 58:
                    K(casVar.h());
                    break;
                case 64:
                    s(casVar.p());
                    break;
                case 72:
                    z(casVar.p());
                    break;
                case 80:
                    F(casVar.p());
                    break;
                case 90:
                    O(casVar.h());
                    break;
                case 96:
                    t(casVar.q());
                    break;
                case 104:
                    A(casVar.q());
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

    public dqs o(String str) {
        this.e = true;
        this.f = str;
        return this;
    }

    public String p() {
        return this.f;
    }

    public boolean q() {
        return this.f15824a;
    }

    public long r() {
        return this.x;
    }

    public dqs s(int i) {
        this.o = true;
        this.p = i;
        return this;
    }

    public dqs t(long j) {
        this.w = true;
        this.x = j;
        return this;
    }

    public dqs u(String str) {
        this.g = true;
        this.h = str;
        return this;
    }

    public String v() {
        return this.h;
    }

    public boolean w() {
        return this.c;
    }

    public int x() {
        return this.f15825b;
    }

    public long y() {
        return this.z;
    }

    public dqs z(int i) {
        this.q = true;
        this.f15827r = i;
        return this;
    }
}
