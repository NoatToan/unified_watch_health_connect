package z2;

import android.content.ClipDescription;
import kotlin.q3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.i3;
import p006l2.s3;
import p006l2.u3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz2/h2;", "", "Ll2/s3;", "undoManager", "<init>", "(Ll2/s3;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h2 {
    public final b A;
    public final a B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f201604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x5.c0 f201605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super x5.l0, Unit> f201606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p006l2.b2 f201607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f201608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x5.r0 f201609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e23.a<Unit> f201610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.o1 f201611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o53.b0 f201612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f201613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q3 f201614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w4.a f201615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m4.b0 f201616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p3.c2 f201617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p3.c2 f201618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f201619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s5.w0 f201620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f201621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p3.c2 f201622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p3.c2 f201623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f201624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x5.l0 f201625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v1 f201626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s5.w0 f201627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p3.c2 f201628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r2.q f201629z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z2/h2$a", "Lz2/l;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f201630a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s5.w0 f201631b;

        public a() {
        }

        @Override // z2.l
        public final boolean a(long j8, d0 d0Var, int i14) {
            p006l2.b2 b2Var;
            h2 h2Var = h2.this;
            if (!h2Var.r() || h2Var.u().f188878a.f157138b.length() == 0 || (b2Var = h2Var.f201607d) == null || b2Var.d() == null) {
                return false;
            }
            m4.b0 b0Var = h2Var.f201616m;
            if (b0Var != null) {
                m4.b0.a(b0Var);
            }
            h2Var.f201619p = j8;
            h2Var.f201624u = -1;
            h2Var.n(true);
            long jF = f(h2Var.u(), h2Var.f201619p, true, d0Var);
            if (i14 >= 2) {
                this.f201630a = true;
                this.f201631b = s5.w0.a(jF);
            }
            return true;
        }

        @Override // z2.l
        public final void b() {
            if (this.f201630a) {
                h2.b(h2.this, this.f201631b);
            }
        }

        @Override // z2.l
        public final boolean c(long j8) {
            h2 h2Var = h2.this;
            p006l2.b2 b2Var = h2Var.f201607d;
            if (b2Var == null || b2Var.d() == null || !h2Var.r()) {
                return false;
            }
            h2Var.f201624u = -1;
            m4.b0 b0Var = h2Var.f201616m;
            if (b0Var != null) {
                m4.b0.a(b0Var);
            }
            x5.l0 l0VarU = h2Var.u();
            d0.f201550a.getClass();
            f(l0VarU, j8, false, d0.a.f201552b);
            return true;
        }

        @Override // z2.l
        public final boolean d(long j8, d0 d0Var) {
            p006l2.b2 b2Var;
            h2 h2Var = h2.this;
            if (!h2Var.r() || h2Var.u().f188878a.f157138b.length() == 0 || (b2Var = h2Var.f201607d) == null || b2Var.d() == null) {
                return false;
            }
            f(h2Var.u(), j8, false, d0Var);
            return true;
        }

        @Override // z2.l
        public final boolean e(long j8) {
            p006l2.b2 b2Var;
            h2 h2Var = h2.this;
            if (!h2Var.r() || h2Var.u().f188878a.f157138b.length() == 0 || (b2Var = h2Var.f201607d) == null || b2Var.d() == null) {
                return false;
            }
            x5.l0 l0VarU = h2Var.u();
            d0.f201550a.getClass();
            f(l0VarU, j8, false, d0.a.f201552b);
            return true;
        }

        public final long f(x5.l0 l0Var, long j8, boolean z14, d0 d0Var) {
            long jD = h2.d(h2.this, l0Var, j8, z14, false, d0Var, false);
            if (!s5.w0.c(jD, this.f201631b)) {
                this.f201630a = false;
            }
            h2.this.z(s5.w0.e(jD) ? p006l2.m1.Cursor : p006l2.m1.Selection);
            return jD;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z2/h2$b", "Ll2/p2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p006l2.p2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f201633a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s5.w0 f201634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d0 f201635c;

        public b() {
            d0.f201550a.getClass();
            this.f201635c = d0.a.f201552b;
        }

        @Override // p006l2.p2
        public final void a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p006l2.p2
        public final void b(long j8, d0 d0Var) {
            long j14;
            i3 i3VarD;
            i3 i3VarD2;
            h2 h2Var = h2.this;
            boolean zR = h2Var.r();
            p3.c2 c2Var = h2Var.f201622s;
            if (zR && ((p006l2.l1) c2Var.getF182175a()) == null) {
                c2Var.setValue(p006l2.l1.SelectionEnd);
                h2Var.f201624u = -1;
                this.f201633a = true;
                this.f201635c = d0Var;
                h2Var.v();
                p006l2.b2 b2Var = h2Var.f201607d;
                if (b2Var == null || (i3VarD2 = b2Var.d()) == null || !i3VarD2.c(j8)) {
                    j14 = j8;
                    p006l2.b2 b2Var2 = h2Var.f201607d;
                    if (b2Var2 != null && (i3VarD = b2Var2.d()) != null) {
                        int iA = h2Var.f201605b.a(i3VarD.b(j14, true));
                        x5.l0 l0VarK = h2.k(h2Var.u().f188878a, og.a.l(iA, iA));
                        h2Var.n(false);
                        w4.a aVar = h2Var.f201615l;
                        if (aVar != null) {
                            w4.b.f181904b.getClass();
                            aVar.a(w4.b.a.b());
                        }
                        h2Var.f201606c.invoke(l0VarK);
                        h2Var.f201627x = s5.w0.a(l0VarK.f188879b);
                    }
                    this.f201633a = false;
                } else {
                    if (h2Var.u().f188878a.f157138b.length() == 0) {
                        return;
                    }
                    h2Var.n(false);
                    x5.l0 l0VarU = h2Var.u();
                    s5.w0.f157315b.getClass();
                    long jD = h2.d(h2Var, x5.l0.b(l0VarU, null, s5.w0.f157316c, 5), j8, true, false, this.f201635c, true);
                    j14 = j8;
                    h2Var.f201620q = s5.w0.a(jD);
                    this.f201634b = s5.w0.a(jD);
                }
                h2Var.z(p006l2.m1.None);
                h2Var.f201619p = j14;
                h2Var.f201623t.setValue(n4.c.a(j14));
                n4.c.f123541b.getClass();
                h2Var.f201621r = 0L;
            }
        }

        @Override // p006l2.p2
        public final void c() {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0097  */
        /* JADX WARN: Code duplicated, block: B:23:0x009b  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
        @Override // p006l2.p2
        public final void d(long j8) {
            i3 i3VarD;
            s5.w0 w0Var;
            int iB;
            long jD;
            c0 c0Var;
            h2 h2Var = h2.this;
            if (!h2Var.r() || h2Var.u().f188878a.f157138b.length() == 0) {
                return;
            }
            h2Var.f201621r = n4.c.j(h2Var.f201621r, j8);
            p006l2.b2 b2Var = h2Var.f201607d;
            if (b2Var != null && (i3VarD = b2Var.d()) != null) {
                h2Var.f201623t.setValue(n4.c.a(n4.c.j(h2Var.f201619p, h2Var.f201621r)));
                if (h2Var.f201620q == null) {
                    n4.c cVarP = h2Var.p();
                    cVarP.getClass();
                    if (i3VarD.c(cVarP.f123544a)) {
                        w0Var = h2Var.f201620q;
                        if (w0Var != null) {
                            iB = (int) (w0Var.f157317a >> 32);
                        } else {
                            iB = i3VarD.b(h2Var.f201619p, false);
                        }
                        n4.c cVarP2 = h2Var.p();
                        cVarP2.getClass();
                        int iB2 = i3VarD.b(cVarP2.f123544a, false);
                        if (h2Var.f201620q != null && iB == iB2) {
                            return;
                        }
                        x5.l0 l0VarU = h2Var.u();
                        n4.c cVarP3 = h2Var.p();
                        cVarP3.getClass();
                        jD = h2.d(h2Var, l0VarU, cVarP3.f123544a, false, false, this.f201635c, true);
                    } else {
                        int iA = h2Var.f201605b.a(i3VarD.b(h2Var.f201619p, true));
                        x5.c0 c0Var2 = h2Var.f201605b;
                        n4.c cVarP4 = h2Var.p();
                        cVarP4.getClass();
                        if (iA == c0Var2.a(i3VarD.b(cVarP4.f123544a, true))) {
                            d0.f201550a.getClass();
                            c0Var = d0.a.f201552b;
                        } else {
                            d0.f201550a.getClass();
                            c0Var = d0.a.f201554d;
                        }
                        c0 c0Var3 = c0Var;
                        x5.l0 l0VarU2 = h2Var.u();
                        n4.c cVarP5 = h2Var.p();
                        cVarP5.getClass();
                        jD = h2.d(h2Var, l0VarU2, cVarP5.f123544a, false, false, c0Var3, true);
                    }
                } else {
                    w0Var = h2Var.f201620q;
                    if (w0Var != null) {
                        iB = (int) (w0Var.f157317a >> 32);
                    } else {
                        iB = i3VarD.b(h2Var.f201619p, false);
                    }
                    n4.c cVarP6 = h2Var.p();
                    cVarP6.getClass();
                    int iB3 = i3VarD.b(cVarP6.f123544a, false);
                    if (h2Var.f201620q != null) {
                    }
                    x5.l0 l0VarU3 = h2Var.u();
                    n4.c cVarP7 = h2Var.p();
                    cVarP7.getClass();
                    jD = h2.d(h2Var, l0VarU3, cVarP7.f123544a, false, false, this.f201635c, true);
                }
                this.f201634b = s5.w0.a(jD);
                if (!s5.w0.c(jD, h2Var.f201620q)) {
                    this.f201633a = false;
                }
            }
            h2Var.D(false);
        }

        public final void e() {
            h2 h2Var = h2.this;
            h2.c(h2Var, null);
            h2Var.f201623t.setValue(null);
            d0.f201550a.getClass();
            this.f201635c = d0.a.f201552b;
            h2Var.D(true);
            s5.w0 w0Var = this.f201634b;
            boolean zE = s5.w0.e(w0Var != null ? w0Var.f157317a : h2Var.u().f188879b);
            h2Var.z(zE ? p006l2.m1.Cursor : p006l2.m1.Selection);
            p006l2.b2 b2Var = h2Var.f201607d;
            if (b2Var != null) {
                b2Var.f108403m.setValue(Boolean.valueOf(!zE && r2.a(h2Var, true)));
            }
            p006l2.b2 b2Var2 = h2Var.f201607d;
            if (b2Var2 != null) {
                b2Var2.f108404n.setValue(Boolean.valueOf(!zE && r2.a(h2Var, false)));
            }
            p006l2.b2 b2Var3 = h2Var.f201607d;
            if (b2Var3 != null) {
                b2Var3.f108405o.setValue(Boolean.valueOf(zE && r2.a(h2Var, true)));
            }
            if (this.f201633a) {
                h2.b(h2Var, h2Var.f201620q);
            }
            h2Var.f201620q = null;
        }

        @Override // p006l2.p2
        public final void onCancel() {
            e();
        }

        @Override // p006l2.p2
        public final void onStop() {
            e();
        }
    }

    public h2(s3 s3Var) {
        this.f201604a = s3Var;
        this.f201605b = u3.f108807a;
        this.f201606c = new yq.d(20);
        this.f201608e = p3.p0.n(new x5.l0((String) null, 0L, (s5.w0) null, 7, (p005kotlin.jvm.internal.j) null));
        x5.r0.f188941a.getClass();
        this.f201609f = x5.r0.a.f188943b;
        Boolean bool = Boolean.TRUE;
        this.f201617n = p3.p0.n(bool);
        this.f201618o = p3.p0.n(bool);
        n4.c.f123541b.getClass();
        this.f201619p = 0L;
        this.f201621r = 0L;
        this.f201622s = p3.p0.n(null);
        this.f201623t = p3.p0.n(null);
        this.f201624u = -1;
        this.f201625v = new x5.l0((String) null, 0L, (s5.w0) null, 7, (p005kotlin.jvm.internal.j) null);
        this.f201628y = p3.p0.n(Boolean.FALSE);
        this.f201629z = new r2.q();
        this.A = new b();
        this.B = new a();
    }

    public static final o13.p a(h2 h2Var) {
        String str;
        s5.w0 w0Var;
        s5.c cVarT = h2Var.t();
        if (cVarT == null || (str = cVarT.f157138b) == null || (w0Var = h2Var.f201627x) == null) {
            return null;
        }
        long j8 = w0Var.f157317a;
        return new o13.p(str, s5.w0.a(og.a.l(h2Var.f201605b.b((int) (j8 >> 32)), h2Var.f201605b.b((int) (j8 & 4294967295L)))));
    }

    public static final void b(h2 h2Var, s5.w0 w0Var) {
        s5.c cVarT;
        String str;
        o53.b0 b0Var;
        h2Var.getClass();
        if (w0Var == null) {
            return;
        }
        long j8 = w0Var.f157317a;
        q qVar = h2Var.f201613j;
        if (qVar == null || (cVarT = h2Var.t()) == null || (str = cVarT.f157138b) == null) {
            return;
        }
        x5.c0 c0Var = h2Var.f201605b;
        long jL = og.a.l(c0Var.b((int) (j8 >> 32)), c0Var.b((int) (j8 & 4294967295L)));
        if (str.length() <= 0 || s5.w0.e(jL) || (b0Var = h2Var.f201612i) == null) {
            return;
        }
        ge1.b.T(b0Var, null, null, new g2(qVar, str, jL, w0Var, h2Var, c0Var, null), 3);
    }

    public static final void c(h2 h2Var, p006l2.l1 l1Var) {
        h2Var.f201622s.setValue(l1Var);
    }

    public static final long d(h2 h2Var, x5.l0 l0Var, long j8, boolean z14, boolean z15, d0 d0Var, boolean z16) {
        i3 i3VarD;
        char c14;
        w4.a aVar;
        p006l2.b2 b2Var = h2Var.f201607d;
        if (b2Var == null || (i3VarD = b2Var.d()) == null) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        x5.c0 c0Var = h2Var.f201605b;
        long j14 = l0Var.f188879b;
        s5.c cVar = l0Var.f188878a;
        s5.w0.a aVar2 = s5.w0.f157315b;
        long jL = og.a.l(c0Var.b((int) (j14 >> 32)), h2Var.f201605b.b((int) (j14 & 4294967295L)));
        boolean z17 = false;
        int iB = i3VarD.b(j8, false);
        int i14 = (z15 || z14) ? iB : (int) (jL >> 32);
        int i15 = (!z15 || z14) ? iB : (int) (jL & 4294967295L);
        v1 v1Var = h2Var.f201626w;
        int i16 = -1;
        if (z14 || v1Var == null) {
            c14 = ' ';
        } else {
            c14 = ' ';
            int i17 = h2Var.f201624u;
            if (i17 != -1) {
                i16 = i17;
            }
        }
        v1 v1VarA = a1.a(i3VarD.f108575a, i14, i15, i16, jL, z14, z15);
        if (v1VarA.k(v1Var)) {
            h2Var.f201626w = v1VarA;
            h2Var.f201624u = iB;
            b0 b0VarA = d0Var.a(v1VarA);
            long jL2 = og.a.l(h2Var.f201605b.a(b0VarA.f201523a.f201527b), h2Var.f201605b.a(b0VarA.f201524b.f201527b));
            if (!s5.w0.d(jL2, j14)) {
                boolean z18 = s5.w0.i(jL2) != s5.w0.i(j14) && s5.w0.d(og.a.l((int) (4294967295L & jL2), (int) (jL2 >> c14)), j14);
                boolean z19 = s5.w0.e(jL2) && s5.w0.e(j14);
                if (z16 && cVar.f157138b.length() > 0 && !z18 && !z19 && (aVar = h2Var.f201615l) != null) {
                    w4.b.f181904b.getClass();
                    aVar.a(w4.b.a.b());
                }
                h2Var.f201606c.invoke(k(cVar, jL2));
                h2Var.f201627x = s5.w0.a(jL2);
                if (!z16) {
                    h2Var.D(!s5.w0.e(jL2));
                }
                p006l2.b2 b2Var2 = h2Var.f201607d;
                if (b2Var2 != null) {
                    b2Var2.f108407q.setValue(Boolean.valueOf(z16));
                }
                p006l2.b2 b2Var3 = h2Var.f201607d;
                if (b2Var3 != null) {
                    b2Var3.f108403m.setValue(Boolean.valueOf(!s5.w0.e(jL2) && r2.a(h2Var, true)));
                }
                p006l2.b2 b2Var4 = h2Var.f201607d;
                if (b2Var4 != null) {
                    b2Var4.f108404n.setValue(Boolean.valueOf(!s5.w0.e(jL2) && r2.a(h2Var, false)));
                }
                p006l2.b2 b2Var5 = h2Var.f201607d;
                if (b2Var5 != null) {
                    if (s5.w0.e(jL2) && r2.a(h2Var, true)) {
                        z17 = true;
                    }
                    b2Var5.f108405o.setValue(Boolean.valueOf(z17));
                }
                return jL2;
            }
        }
        return j14;
    }

    public static x5.l0 k(s5.c cVar, long j8) {
        return new x5.l0(cVar, j8, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null);
    }

    public final void A(long j8) {
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var != null) {
            b2Var.A.setValue(s5.w0.a(j8));
        }
        p006l2.b2 b2Var2 = this.f201607d;
        if (b2Var2 != null) {
            s5.w0.f157315b.getClass();
            b2Var2.B.setValue(s5.w0.a(s5.w0.f157316c));
        }
        if (s5.w0.e(j8)) {
            return;
        }
        D(false);
        z(p006l2.m1.None);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        p006l2.b2 b2Var;
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            if (r() && ((b2Var = this.f201607d) == null || ((Boolean) b2Var.f108407q.getF182175a()).booleanValue())) {
                Unit unit = Unit.INSTANCE;
                f4.f.a.e(fVarA, fVarB, f68793s);
                if (u1.g0.f167495b) {
                    this.f201629z.b();
                    return;
                }
                o53.b0 b0Var = this.f201612i;
                if (b0Var != null) {
                    ge1.b.T(b0Var, null, o53.d0.UNDISPATCHED, new k2(this, null), 1);
                    return;
                }
                return;
            }
            f4.f.a.e(fVarA, fVarB, f68793s);
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68793s);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(v13.c cVar) {
        l2 l2Var;
        h2 h2Var;
        if (cVar instanceof l2) {
            l2Var = (l2) cVar;
            int i14 = l2Var.f201682d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l2Var.f201682d = i14 - Integer.MIN_VALUE;
            } else {
                l2Var = new l2(this, cVar);
            }
        } else {
            l2Var = new l2(this, cVar);
        }
        Object objValueOf = l2Var.f201680b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = l2Var.f201682d;
        if (i15 == 0) {
            o13.r.b(objValueOf);
            kotlin.o1 o1Var = this.f201611h;
            if (o1Var != null) {
                l2Var.f201679a = this;
                l2Var.f201682d = 1;
                int i16 = b2.a.f14460a;
                ClipDescription primaryClipDescription = o1Var.b().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
                h2Var = this;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        h2Var = l2Var.f201679a;
        o13.r.b(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        h2Var.f201628y.setValue(bool);
        return Unit.INSTANCE;
    }

    public final void D(boolean z14) {
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var != null) {
            b2Var.f108402l.setValue(Boolean.valueOf(z14));
        }
        if (z14) {
            B();
        } else {
            v();
        }
    }

    public final boolean e() {
        return q() && s5.w0.e(u().f188879b);
    }

    public final boolean f() {
        return (s5.w0.e(u().f188879b) || (this.f201609f instanceof x5.e0) || this.f201611h == null) ? false : true;
    }

    public final boolean g() {
        return (s5.w0.e(u().f188879b) || !q() || (this.f201609f instanceof x5.e0) || this.f201611h == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        return q() && ((Boolean) this.f201628y.getF182175a()).booleanValue() && this.f201611h != null;
    }

    public final boolean i() {
        return s5.w0.f(u().f188879b) != u().f188878a.f157138b.length();
    }

    public final o53.c2 j(boolean z14) {
        o53.b0 b0Var = this.f201612i;
        if (b0Var != null) {
            return ge1.b.T(b0Var, null, o53.d0.UNDISPATCHED, new c2(this, z14, null), 1);
        }
        return null;
    }

    public final void l() {
        o53.b0 b0Var = this.f201612i;
        if (b0Var != null) {
            ge1.b.T(b0Var, null, o53.d0.UNDISPATCHED, new e2(this, null), 1);
        }
    }

    public final void m(n4.c cVar) {
        if (!s5.w0.e(u().f188879b)) {
            p006l2.b2 b2Var = this.f201607d;
            i3 i3VarD = b2Var != null ? b2Var.d() : null;
            int iG = (cVar == null || i3VarD == null) ? s5.w0.g(u().f188879b) : this.f201605b.a(i3VarD.b(cVar.f123544a, true));
            x5.l0 l0VarB = x5.l0.b(u(), null, og.a.l(iG, iG), 5);
            this.f201606c.invoke(l0VarB);
            this.f201627x = s5.w0.a(l0VarB.f188879b);
        }
        z((cVar == null || u().f188878a.f157138b.length() <= 0) ? p006l2.m1.None : p006l2.m1.Cursor);
        D(false);
    }

    public final void n(boolean z14) {
        m4.b0 b0Var;
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var != null && !b2Var.b() && (b0Var = this.f201616m) != null) {
            m4.b0.a(b0Var);
        }
        this.f201625v = u();
        D(z14);
        z(p006l2.m1.Selection);
    }

    public final n4.d o() {
        long jB;
        char c14;
        float fIntBitsToFloat;
        f5.c0 c0VarC;
        s5.q0 q0Var;
        f5.c0 c0VarC2;
        s5.q0 q0Var2;
        f5.c0 c0VarC3;
        f5.c0 c0VarC4;
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var != null) {
            if (b2Var.f108406p) {
                b2Var = null;
            }
            if (b2Var != null) {
                x5.c0 c0Var = this.f201605b;
                long j8 = u().f188879b;
                s5.w0.a aVar = s5.w0.f157315b;
                int iB = c0Var.b((int) (j8 >> 32));
                int iB2 = this.f201605b.b((int) (u().f188879b & 4294967295L));
                p006l2.b2 b2Var2 = this.f201607d;
                long jB2 = 0;
                if (b2Var2 == null || (c0VarC4 = b2Var2.c()) == null) {
                    n4.c.f123541b.getClass();
                    jB = 0;
                } else {
                    jB = c0VarC4.B(s(true));
                }
                p006l2.b2 b2Var3 = this.f201607d;
                if (b2Var3 == null || (c0VarC3 = b2Var3.c()) == null) {
                    n4.c.f123541b.getClass();
                } else {
                    jB2 = c0VarC3.B(s(false));
                }
                p006l2.b2 b2Var4 = this.f201607d;
                float fIntBitsToFloat2 = 0.0f;
                if (b2Var4 == null || (c0VarC2 = b2Var4.c()) == null) {
                    c14 = ' ';
                    fIntBitsToFloat = 0.0f;
                } else {
                    i3 i3VarD = b2Var.d();
                    float f14 = (i3VarD == null || (q0Var2 = i3VarD.f108575a) == null) ? 0.0f : q0Var2.c(iB).f123548b;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    c14 = ' ';
                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f14)) & 4294967295L;
                    n4.c.a aVar2 = n4.c.f123541b;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (c0VarC2.B(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32)) & 4294967295L));
                }
                p006l2.b2 b2Var5 = this.f201607d;
                if (b2Var5 != null && (c0VarC = b2Var5.c()) != null) {
                    i3 i3VarD2 = b2Var.d();
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.0f)) << c14) | (((long) Float.floatToRawIntBits((i3VarD2 == null || (q0Var = i3VarD2.f108575a) == null) ? 0.0f : q0Var.c(iB2).f123548b)) & 4294967295L);
                    n4.c.a aVar3 = n4.c.f123541b;
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0VarC.B(jFloatToRawIntBits3) & 4294967295L));
                }
                int i14 = (int) (jB >> c14);
                int i15 = (int) (jB2 >> c14);
                float fMin = Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
                float fMax = Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
                float fMin2 = Math.min(fIntBitsToFloat, fIntBitsToFloat2);
                float fMax2 = Math.max(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jB2 & 4294967295L)));
                g6.f.a aVar4 = g6.f.f75994b;
                return new n4.d(fMin, fMin2, fMax, (b2Var.f108391a.f108680g.getF75991a() * 25) + fMax2);
            }
        }
        n4.d.f123545e.getClass();
        return n4.d.f123546f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n4.c p() {
        return (n4.c) this.f201623t.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q() {
        return ((Boolean) this.f201617n.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.f201618o.getF182175a()).booleanValue();
    }

    public final long s(boolean z14) {
        i3 i3VarD;
        s5.q0 q0Var;
        long j8;
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var == null || (i3VarD = b2Var.d()) == null || (q0Var = i3VarD.f108575a) == null) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        s5.c cVarT = t();
        if (cVarT == null) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        if (!p005kotlin.jvm.internal.s.g(cVarT.f157138b, q0Var.f157280a.f157265a.f157138b)) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        x5.l0 l0VarU = u();
        if (z14) {
            long j14 = l0VarU.f188879b;
            s5.w0.a aVar = s5.w0.f157315b;
            j8 = j14 >> 32;
        } else {
            long j15 = l0VarU.f188879b;
            s5.w0.a aVar2 = s5.w0.f157315b;
            j8 = j15 & 4294967295L;
        }
        return v2.a(q0Var, this.f201605b.b((int) j8), z14, s5.w0.i(u().f188879b));
    }

    public final s5.c t() {
        p006l2.n2 n2Var;
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var == null || (n2Var = b2Var.f108391a) == null) {
            return null;
        }
        return n2Var.f108674a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x5.l0 u() {
        return (x5.l0) this.f201608e.getF182175a();
    }

    public final void v() {
        q3 q3Var;
        if (u1.g0.f167495b) {
            this.f201629z.a();
            return;
        }
        q3 q3Var2 = this.f201614k;
        if ((q3Var2 != null ? q3Var2.getF91379d() : null) != kotlin.s3.Shown || (q3Var = this.f201614k) == null) {
            return;
        }
        q3Var.hide();
    }

    public final void w() {
        o53.b0 b0Var = this.f201612i;
        if (b0Var != null) {
            ge1.b.T(b0Var, null, o53.d0.UNDISPATCHED, new i2(this, null), 1);
        }
    }

    public final void x() {
        x5.l0 l0VarK = k(u().f188878a, og.a.l(0, u().f188878a.f157138b.length()));
        this.f201606c.invoke(l0VarK);
        long j8 = l0VarK.f188879b;
        this.f201627x = s5.w0.a(j8);
        this.f201625v = x5.l0.b(this.f201625v, null, j8, 5);
        n(true);
    }

    public final void y(long j8) {
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var != null) {
            b2Var.B.setValue(s5.w0.a(j8));
        }
        p006l2.b2 b2Var2 = this.f201607d;
        if (b2Var2 != null) {
            s5.w0.f157315b.getClass();
            b2Var2.A.setValue(s5.w0.a(s5.w0.f157316c));
        }
        if (s5.w0.e(j8)) {
            return;
        }
        D(false);
        z(p006l2.m1.None);
    }

    public final void z(p006l2.m1 m1Var) {
        p006l2.b2 b2Var = this.f201607d;
        if (b2Var != null) {
            if (b2Var.a() == m1Var) {
                b2Var = null;
            }
            if (b2Var != null) {
                b2Var.f108401k.setValue(m1Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ h2(s3 s3Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : s3Var);
    }
}
