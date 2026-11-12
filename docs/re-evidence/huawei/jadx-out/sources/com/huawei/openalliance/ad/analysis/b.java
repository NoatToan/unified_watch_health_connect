package com.huawei.openalliance.ad.analysis;

import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.q;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public class b extends BaseAnalysisInfo {
    private int D;
    private int E;
    private Integer L;
    private Integer M;
    private Integer R;
    private long aA;
    private String aB;
    private String aC;
    private String aD;
    private String aE;
    private Boolean aF;
    private Boolean aG;
    private Boolean aH;
    private Boolean aI;
    private String ad;
    private String ae;
    private Integer af;
    private Integer ag;
    private String ah;
    private String ai;
    private Double aj;
    private Double ak;
    private String al;
    private Integer am;
    private Integer an;
    private String ap;
    private String aq;
    private String ar;
    private Long as;
    private String at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private String ay;
    private long az;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18225a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18226b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18227c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";
    private String m = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private Integer t = -1;
    private String u = "";
    private String v = "";
    private String w = "";
    private String x = "";
    private String y = "";
    private String z = "";
    private String A = "";
    private String B = "";
    private String C = "";
    private String F = "";
    private String G = "";
    private String H = "";
    private String I = "";
    private String J = "";
    private String K = "";
    private String N = "";
    private String O = "";
    private String P = "";
    private String Q = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";
    private String aa = "";
    private String ab = "";
    private String ac = "";
    private int ao = 0;
    private int aJ = 8;

    public void z(String str) {
        this.A = str;
    }

    public String z() {
        return this.z;
    }

    public void y(String str) {
        this.z = str;
    }

    public String y() {
        return this.y;
    }

    public void x(String str) {
        this.y = str;
    }

    public String x() {
        return this.x;
    }

    public void w(String str) {
        this.x = str;
    }

    public String w() {
        return this.w;
    }

    public void v(String str) {
        this.w = str;
    }

    public String v() {
        return this.v;
    }

    public void u(String str) {
        this.v = str;
    }

    public String u() {
        return this.u;
    }

    public String toString() {
        return "AnalysisInfo{analysisType='" + this.analysisType + "', adtype=" + this.t + '}';
    }

    public void t(String str) {
        this.u = str;
    }

    public Integer t() {
        return this.t;
    }

    public void s(String str) {
        this.s = str;
    }

    public String s() {
        return this.s;
    }

    public void r(String str) {
        this.r = str;
    }

    public String r() {
        return this.r;
    }

    public void q(String str) {
        this.q = str;
    }

    public String q() {
        return this.q;
    }

    public void p(String str) {
        this.p = str;
    }

    public String p() {
        return this.p;
    }

    public void o(String str) {
        this.o = str;
    }

    public String o() {
        return this.o;
    }

    public void n(String str) {
        this.n = str;
    }

    public String n() {
        return this.n;
    }

    public void m(String str) {
        this.m = str;
    }

    public String m() {
        return this.m;
    }

    public void l(String str) {
        this.l = str;
    }

    public String l() {
        return this.l;
    }

    public void k(String str) {
        this.k = str;
    }

    public String k() {
        return this.k;
    }

    public void j(String str) {
        this.j = str;
    }

    public String j() {
        return this.j;
    }

    public void i(String str) {
        this.i = str;
    }

    public String i() {
        return this.i;
    }

    public void h(String str) {
        this.h = str;
    }

    public String h() {
        return this.h;
    }

    public void g(String str) {
        this.g = str;
    }

    public String g() {
        return this.g;
    }

    public void f(String str) {
        this.f = str;
    }

    public void f(Integer num) {
        this.an = num;
    }

    public String f() {
        return this.f;
    }

    public void e(String str) {
        this.e = str;
    }

    public void e(Integer num) {
        this.ag = num;
    }

    public void e(int i) {
        this.aJ = i;
    }

    public String e() {
        return this.e;
    }

    public void d(boolean z) {
        this.aI = Boolean.valueOf(z);
    }

    public void d(String str) {
        this.d = str;
    }

    public void d(Integer num) {
        this.af = num;
    }

    public void d(int i) {
        this.ao = i;
    }

    public String d() {
        return this.d;
    }

    public void c(boolean z) {
        this.aH = Boolean.valueOf(z);
    }

    public void c(String str) {
        this.f18227c = str;
    }

    public void c(Integer num) {
        this.R = num;
    }

    public void c(int i) {
        this.E = i;
    }

    public String c() {
        return this.f18227c;
    }

    public void b(boolean z) {
        this.aG = Boolean.valueOf(z);
    }

    public void b(String str) {
        this.f18226b = str;
    }

    public void b(Integer num) {
        this.M = num;
    }

    public void b(Double d) {
        this.ak = d;
    }

    public void b(long j) {
        this.aA = j;
    }

    public void b(int i) {
        this.D = i;
    }

    public String b() {
        return this.f18226b;
    }

    public String az() {
        return this.aB;
    }

    public long ay() {
        return this.aA;
    }

    public long ax() {
        return this.az;
    }

    public String aw() {
        return this.ay;
    }

    public String av() {
        return this.ax;
    }

    public String au() {
        return this.aw;
    }

    public String at() {
        return this.av;
    }

    public String as() {
        return this.au;
    }

    public String ar() {
        return this.at;
    }

    public Long aq() {
        return this.as;
    }

    public String ap() {
        return this.ar;
    }

    public String ao() {
        return this.aq;
    }

    public String an() {
        return this.ap;
    }

    public String am() {
        return this.al;
    }

    public Integer al() {
        return this.an;
    }

    public Integer ak() {
        return this.am;
    }

    public void aj(String str) {
        this.ad = str;
    }

    public Double aj() {
        return this.ak;
    }

    public void ai(String str) {
        this.aE = str;
    }

    public Double ai() {
        return this.aj;
    }

    public void ah(String str) {
        this.aD = str;
    }

    public String ah() {
        return this.ai;
    }

    public void ag(String str) {
        this.aC = str;
    }

    public String ag() {
        return this.ah;
    }

    public void af(String str) {
        this.aB = str;
    }

    public Integer af() {
        return this.ag;
    }

    public void ae(String str) {
        this.ay = str;
    }

    public Integer ae() {
        return this.af;
    }

    public void ad(String str) {
        this.ax = str;
    }

    public String ad() {
        return this.ae;
    }

    public void ac(String str) {
        this.aw = str;
    }

    public String ac() {
        return this.ac;
    }

    public void ab(String str) {
        this.av = str;
    }

    public String ab() {
        return this.ab;
    }

    public void aa(String str) {
        this.au = str;
    }

    public String aa() {
        return this.aa;
    }

    public boolean aM() {
        Integer num = this.M;
        if (num == null || num.intValue() != 0) {
            return ("65".equals(this.analysisType) && this.E == 200) || "86".equals(this.analysisType) || "6".equals(this.analysisType);
        }
        return false;
    }

    public String aL() {
        return "dt:" + this.duration + ", e1:" + this.extraTime1 + ", e2:" + this.extraTime2 + ", e3:" + this.extraTime3 + ", e4:" + this.extraTime4 + ", e10:" + this.extraTime10 + ", e11:" + this.extraTime11 + ", cd:" + this.p;
    }

    public String aK() {
        return "duration: " + this.duration + " extraTime1: " + this.extraTime1 + " extraTime2: " + this.extraTime2 + " extraTime3: " + this.extraTime3 + " extraTime4: " + this.extraTime4 + " extraTime5: " + this.extraTime5 + " extraTime6: " + this.extraTime6 + " extraTime7: " + this.extraTime7 + " extraTime8: " + this.extraTime8 + " extraTime9: " + this.extraTime9;
    }

    public String aJ() {
        hw.a("AnalysisInfo", "AnalysisInfo TrackVersion is %s ", aI());
        try {
            return q.a((aN() + "|" + a() + "|" + av(b()) + "|" + c() + "|" + av(d()) + "|" + av(e()) + "|" + av(f()) + "|" + av(g()) + "|" + av(h()) + "|" + dg.f(i()) + "|" + av(j()) + "|" + k() + "|" + l() + "|" + o() + "|" + p() + "|" + q() + "|" + av(r()) + "|" + s() + "|" + t() + "|" + u() + "|" + v() + "|" + aw(w()) + "|" + x() + "|" + aO() + "|" + y() + "|" + aZ() + "|" + ba() + "|" + aP() + "|" + aQ() + "|" + aw(aR()) + "|" + z() + "|" + A() + "|" + B() + "|" + C() + "|" + D() + "|" + E() + "|" + aw(F()) + "|" + av(G()) + "|" + av(H()) + "|" + aw(m()) + "|" + aw(n()) + "|" + I() + "|" + av(J()) + "|" + aw(K()) + "|" + g(L()) + "|" + g(M()) + "|" + aw(aS()) + "|" + aw(aT()) + "|" + aw(aU()) + "|" + aw(aV()) + "|" + aw(aW()) + "|" + aw(aX()) + "|" + aw(aY()) + "|" + bb() + "|" + bc() + "|" + bd() + "|" + be() + "|" + bf() + "|" + bg() + "|" + bh() + "|" + bi() + "|" + bj() + "|" + bk() + "|" + bl() + "|" + bm() + "|" + bn() + "|" + aw(O()) + "|" + aw(P()) + "|" + aw(Q()) + "|" + g(R()) + "|" + aw(S()) + "|" + aw(T()) + "|" + aw(U()) + "|" + aw(V()) + "|" + aw(W()) + "|" + aw(X()) + "|" + aw(Y()) + "|" + aw(Z()) + "|" + aw(aa()) + "|" + aw(ab()) + "|" + aw(ac()) + "|" + aw(ad()) + "|" + g(ae()) + "|" + g(af()) + "|" + aw(ag()) + "|" + aw(ah()) + "|" + a((Object) ai()) + "|" + a((Object) aj()) + "|" + aw(am()) + "|" + g(ak()) + "|" + g(al()) + "|" + aw(an()) + "|" + aw(ao()) + "|" + aw(ap()) + "|" + a((Object) aq()) + "|" + aw(ar()) + "|" + N() + "|" + aw(as()) + "|" + aw(at()) + "|" + aw(au()) + "|" + aw(av()) + "|" + aw(aw()) + "|" + ax() + "|" + ay() + "|" + aw(az()) + "|" + aw(aA()) + "|" + aw(aB()) + "|" + aw(aC()) + "|" + a(aD()) + "|" + a(aE()) + "|" + a(aF()) + "|" + a(aG()) + "|" + aH() + "|" + aw(aI())).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            hw.c("AnalysisInfo", "toExceptionString Exception");
            return null;
        }
    }

    public String aI() {
        return this.ad;
    }

    public int aH() {
        return this.aJ;
    }

    public Boolean aG() {
        return this.aI;
    }

    public Boolean aF() {
        return this.aH;
    }

    public Boolean aE() {
        return this.aG;
    }

    public Boolean aD() {
        return this.aF;
    }

    public String aC() {
        return this.aE;
    }

    public String aB() {
        return this.aD;
    }

    public String aA() {
        return this.aC;
    }

    public void a(boolean z) {
        this.aF = Boolean.valueOf(z);
    }

    public void a(String str) {
        this.f18225a = str;
    }

    public void a(Long l) {
        this.as = l;
    }

    public void a(Integer num) {
        this.L = num;
    }

    public void a(Double d) {
        this.aj = d;
    }

    public void a(long j) {
        this.az = j;
    }

    public void a(int i) {
        this.t = Integer.valueOf(i);
    }

    public String a() {
        return this.f18225a;
    }

    public void Z(String str) {
        this.at = str;
    }

    public String Z() {
        return this.Z;
    }

    public void Y(String str) {
        this.ar = str;
    }

    public String Y() {
        return this.Y;
    }

    public void X(String str) {
        this.aq = str;
    }

    public String X() {
        return this.X;
    }

    public void W(String str) {
        this.ap = str;
    }

    public String W() {
        return this.W;
    }

    public void V(String str) {
        this.ah = str;
    }

    public String V() {
        return this.V;
    }

    public void U(String str) {
        this.ae = str;
    }

    public String U() {
        return this.U;
    }

    public void T(String str) {
        this.ac = str;
    }

    public String T() {
        return this.T;
    }

    public void S(String str) {
        this.ab = str;
    }

    public String S() {
        return this.S;
    }

    public void R(String str) {
        this.aa = str;
    }

    public Integer R() {
        return this.R;
    }

    public void Q(String str) {
        this.Z = str;
    }

    public String Q() {
        return this.Q;
    }

    public void P(String str) {
        this.Y = str;
    }

    public String P() {
        return this.P;
    }

    public void O(String str) {
        this.X = str;
    }

    public String O() {
        return this.N;
    }

    public void N(String str) {
        this.W = str;
    }

    public int N() {
        return this.ao;
    }

    public void M(String str) {
        this.V = str;
    }

    public Integer M() {
        return this.M;
    }

    public void L(String str) {
        this.U = str;
    }

    public Integer L() {
        return this.L;
    }

    public void K(String str) {
        this.S = str;
    }

    public String K() {
        return this.K;
    }

    public void J(String str) {
        this.Q = str;
    }

    public String J() {
        return this.J;
    }

    public void I(String str) {
        this.P = str;
    }

    public String I() {
        return this.I;
    }

    public void H(String str) {
        this.K = str;
    }

    public String H() {
        return this.H;
    }

    public void G(String str) {
        this.J = str;
    }

    public String G() {
        return this.G;
    }

    public void F(String str) {
        this.I = str;
    }

    public String F() {
        return this.F;
    }

    public void E(String str) {
        this.H = str;
    }

    public int E() {
        return this.E;
    }

    public void D(String str) {
        this.G = str;
    }

    public int D() {
        return this.D;
    }

    public void C(String str) {
        this.F = str;
    }

    public String C() {
        return this.C;
    }

    public void B(String str) {
        this.C = str;
    }

    public String B() {
        return this.B;
    }

    public void A(String str) {
        this.B = str;
    }

    public String A() {
        return this.A;
    }

    private String g(Integer num) {
        return num == null ? "" : String.valueOf(num);
    }

    private String aw(String str) {
        return dg.b(str) ? "" : str;
    }

    private String av(String str) {
        return dg.b(str) ? str : str.replaceAll("\\|", "");
    }

    private String a(Object obj) {
        return obj == null ? "" : String.valueOf(obj);
    }
}
