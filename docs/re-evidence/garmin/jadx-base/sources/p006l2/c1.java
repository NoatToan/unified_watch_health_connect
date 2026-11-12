package p006l2;

import d6.p;
import e23.l;
import f4.f;
import f5.a1;
import f5.b1;
import f5.w;
import f5.x;
import f5.y0;
import f5.z0;
import g6.a;
import g6.b;
import g6.c;
import g6.m;
import g6.o;
import j23.t;
import java.util.List;
import o13.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;
import s5.p0;
import s5.q0;
import s5.x0;
import s5.y;
import vb.h;
import w5.q;
import x5.c0;
import x5.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll2/c1;", "Lf5/z0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f108423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<q0, Unit> f108424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f108425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f108426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f108427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f108428f;

    /* JADX WARN: Multi-variable type inference failed */
    public c1(b2 b2Var, l<? super q0, Unit> lVar, l0 l0Var, c0 c0Var, c cVar, int i14) {
        this.f108423a = b2Var;
        this.f108424b = lVar;
        this.f108425c = l0Var;
        this.f108426d = c0Var;
        this.f108427e = cVar;
        this.f108428f = i14;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x0202  */
    /* JADX WARN: Code duplicated, block: B:76:0x0206  */
    /* JADX WARN: Code duplicated, block: B:78:0x0225  */
    /* JADX WARN: Code duplicated, block: B:81:0x022d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [f5.c0] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        q0 q0Var;
        n2 n2Var;
        i3 i3Var;
        a1 a1Var;
        q0 q0Var2;
        q0 q0Var3;
        q0 q0Var4;
        int i14;
        c1 c1Var;
        int iA;
        ?? r14;
        int iJ;
        int i15;
        f.a aVar = f.f68735e;
        b2 b2Var = this.f108423a;
        aVar.getClass();
        f fVarA = f.a.a();
        l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68799i() : null;
        f fVarB = f.a.b(fVarA);
        try {
            i3 i3VarD = b2Var.d();
            f.a.e(fVarA, fVarB, f68799i);
            q0 q0Var5 = i3VarD != null ? i3VarD.f108575a : null;
            t2.a aVar2 = t2.f108797a;
            n2 n2Var2 = b2Var.f108391a;
            o f68910b = b1Var.getF68910b();
            aVar2.getClass();
            int i16 = n2Var2.f108679f;
            boolean z14 = n2Var2.f108678e;
            int i17 = n2Var2.f108676c;
            if (q0Var5 != null) {
                p0 p0Var = q0Var5.f157280a;
                s5.o oVar = q0Var5.f157281b;
                s5.c cVar = n2Var2.f108674a;
                x0 x0Var = n2Var2.f108675b;
                a1Var = null;
                List<s5.c.d<y>> list2 = n2Var2.f108682i;
                c cVar2 = n2Var2.f108680g;
                q.b bVar = n2Var2.f108681h;
                q0Var = q0Var5;
                if (oVar.f157252a.b()) {
                    n2Var = n2Var2;
                    i3Var = i3VarD;
                } else {
                    s5.c cVar3 = p0Var.f157265a;
                    long j14 = p0Var.f157274j;
                    if (s.g(cVar3, cVar) && p0Var.f157266b.d(x0Var) && s.g(p0Var.f157267c, list2) && p0Var.f157268d == i17 && p0Var.f157269e == z14) {
                        int i18 = p0Var.f157270f;
                        p.a aVar3 = p.f57793b;
                        if (i18 == i16 && s.g(p0Var.f157271g, cVar2) && p0Var.f157272h == f68910b && s.g(p0Var.f157273i, bVar) && a.l(j8) == a.l(j14)) {
                            if (!z14) {
                                p.f57793b.getClass();
                                if (i16 == p.f57795d) {
                                    if (a.j(j8) == a.j(j14) || a.i(j8) != a.i(j14)) {
                                    }
                                }
                                q0Var3 = q0Var;
                                p0 p0Var2 = new p0(p0Var.f157265a, n2Var2.f108675b, p0Var.f157267c, p0Var.f157268d, p0Var.f157269e, p0Var.f157270f, p0Var.f157271g, p0Var.f157272h, p0Var.f157273i, j8, (j) null);
                                long jA = (((long) o2.a(oVar.f157255d)) << 32) | (((long) o2.a(oVar.f157256e)) & 4294967295L);
                                m.a aVar4 = m.f76012b;
                                i3Var = i3VarD;
                                q0Var2 = new q0(p0Var2, q0Var3.f157281b, b.d(j8, jA), null);
                            } else if (a.j(j8) == a.j(j14)) {
                            }
                            long j15 = q0Var2.f157282c;
                            u uVar = new u(Integer.valueOf((int) (j15 >> 32)), Integer.valueOf((int) (j15 & 4294967295L)), q0Var2);
                            int iIntValue = ((Number) uVar.f128605a).intValue();
                            int iIntValue2 = ((Number) uVar.f128606b).intValue();
                            q0Var4 = (q0) uVar.f128607c;
                            if (s.g(q0Var3, q0Var4)) {
                                i14 = 0;
                                c1Var = this;
                            } else {
                                if (i3Var != null) {
                                    r14 = i3Var.f108577c;
                                } else {
                                    r14 = a1Var;
                                }
                                b2Var.f108399i.setValue(new i3(q0Var4, null, r14, 2, null));
                                i14 = 0;
                                b2Var.f108406p = false;
                                c1Var = this;
                                c1Var.f108424b.invoke(q0Var4);
                                h1.f(b2Var, c1Var.f108425c, c1Var.f108426d);
                            }
                            if (c1Var.f108428f == 1) {
                                iA = o2.a(q0Var4.f157281b.b(i14));
                            } else {
                                iA = i14;
                            }
                            b2Var.f108397g.setValue(g6.f.a(c1Var.f108427e.c1(iA)));
                            return b1Var.H1(iIntValue, iIntValue2, u0.e(new o13.p(f5.b.f68892a, Integer.valueOf(Math.round(q0Var4.f157283d))), new o13.p(f5.b.f68893b, Integer.valueOf(Math.round(q0Var4.f157284e)))), new kn1.m(23));
                        }
                    }
                    i3Var = i3VarD;
                    n2Var = n2Var2;
                }
            } else {
                q0Var = q0Var5;
                n2Var = n2Var2;
                i3Var = i3VarD;
                a1Var = null;
            }
            n2Var.a(f68910b);
            int iL = a.l(j8);
            if (!z14) {
                p.f57793b.getClass();
                if (i16 != p.f57795d) {
                    iJ = Integer.MAX_VALUE;
                } else if (a.f(j8)) {
                    iJ = a.j(j8);
                } else {
                    iJ = Integer.MAX_VALUE;
                }
            } else if (a.f(j8)) {
                iJ = a.j(j8);
            } else {
                iJ = Integer.MAX_VALUE;
            }
            if (z14) {
                i15 = i17;
            } else {
                p.f57793b.getClass();
                if (i16 == p.f57795d) {
                    i15 = 1;
                } else {
                    i15 = i17;
                }
            }
            if (iL != iJ) {
                s5.q qVar = n2Var.f108683j;
                if (qVar == null) {
                    h.z("layoutIntrinsics must be called first");
                    return a1Var;
                }
                iJ = t.e(o2.a(qVar.a()), iL, iJ);
            }
            s5.q qVar2 = n2Var.f108683j;
            if (qVar2 == null) {
                h.z("layoutIntrinsics must be called first");
                return a1Var;
            }
            a.C1525a c1525a = a.f75987b;
            int i19 = a.i(j8);
            c1525a.getClass();
            s5.o oVar2 = new s5.o(qVar2, a.C1525a.b(0, iJ, 0, i19), i15, n2Var.f108679f, (j) null);
            long jA2 = (((long) o2.a(oVar2.f157256e)) & 4294967295L) | (((long) o2.a(oVar2.f157255d)) << 32);
            m.a aVar5 = m.f76012b;
            long jD = b.d(j8, jA2);
            s5.c cVar4 = n2Var.f108674a;
            x0 x0Var2 = n2Var.f108675b;
            List<s5.c.d<y>> list3 = n2Var.f108682i;
            int i24 = n2Var.f108676c;
            boolean z15 = n2Var.f108678e;
            int i25 = n2Var.f108679f;
            c cVar5 = n2Var.f108680g;
            q.b bVar2 = n2Var.f108681h;
            q0Var3 = q0Var;
            q0Var2 = new q0(new p0(cVar4, x0Var2, list3, i24, z15, i25, cVar5, f68910b, bVar2, j8, (j) null), oVar2, jD, null);
            long j16 = q0Var2.f157282c;
            u uVar2 = new u(Integer.valueOf((int) (j16 >> 32)), Integer.valueOf((int) (j16 & 4294967295L)), q0Var2);
            int iIntValue3 = ((Number) uVar2.f128605a).intValue();
            int iIntValue4 = ((Number) uVar2.f128606b).intValue();
            q0Var4 = (q0) uVar2.f128607c;
            if (s.g(q0Var3, q0Var4)) {
                if (i3Var != null) {
                    r14 = i3Var.f108577c;
                } else {
                    r14 = a1Var;
                }
                b2Var.f108399i.setValue(new i3(q0Var4, null, r14, 2, null));
                i14 = 0;
                b2Var.f108406p = false;
                c1Var = this;
                c1Var.f108424b.invoke(q0Var4);
                h1.f(b2Var, c1Var.f108425c, c1Var.f108426d);
            } else {
                i14 = 0;
                c1Var = this;
            }
            if (c1Var.f108428f == 1) {
                iA = o2.a(q0Var4.f157281b.b(i14));
            } else {
                iA = i14;
            }
            b2Var.f108397g.setValue(g6.f.a(c1Var.f108427e.c1(iA)));
            return b1Var.H1(iIntValue3, iIntValue4, u0.e(new o13.p(f5.b.f68892a, Integer.valueOf(Math.round(q0Var4.f157283d))), new o13.p(f5.b.f68893b, Integer.valueOf(Math.round(q0Var4.f157284e)))), new kn1.m(23));
        } catch (Throwable th3) {
            f.a.e(fVarA, fVarB, f68799i);
            throw th3;
        }
    }

    @Override // f5.z0
    public final int i(x xVar, List<? extends w> list, int i14) {
        b2 b2Var = this.f108423a;
        b2Var.f108391a.a(xVar.getF68910b());
        s5.q qVar = b2Var.f108391a.f108683j;
        if (qVar != null) {
            return o2.a(qVar.a());
        }
        h.z("layoutIntrinsics must be called first");
        return 0;
    }
}
