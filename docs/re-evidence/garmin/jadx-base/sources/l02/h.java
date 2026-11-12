package l02;

import c2.q;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.f0;
import e2.i0;
import e2.k0;
import e23.p;
import gl1.y;
import h2.j0;
import h4.r;
import o4.r1;
import p005kotlin.Unit;
import p3.l0;
import p3.m1;
import p3.n;
import p3.n1;
import p3.p0;
import p3.x1;
import p5.v;
import w02.b0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107960a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f107962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f107963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f107964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.k f107966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f107967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f107968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f107969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r1 f107970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f107971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f107972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f107973n;

    public /* synthetic */ h(r rVar, j0 j0Var, int i14, int i15, long j8, long j14, float f14, float f15, float f16, float f17, r1 r1Var, s1.k kVar, int i16) {
        this.f107967h = rVar;
        this.f107973n = j0Var;
        this.f107961b = i14;
        this.f107962c = i15;
        this.f107971l = j8;
        this.f107972m = j14;
        this.f107963d = f14;
        this.f107964e = f15;
        this.f107968i = f16;
        this.f107969j = f17;
        this.f107970k = r1Var;
        this.f107966g = kVar;
        this.f107965f = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m.a.C2565a c2565a;
        Object aVar;
        int i14 = this.f107960a;
        Object obj3 = this.f107973n;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                k.b(this.f107967h, (j0) obj3, this.f107961b, this.f107962c, this.f107971l, this.f107972m, this.f107963d, this.f107964e, this.f107968i, this.f107969j, this.f107970k, this.f107966g, (p3.m) obj, p0.t(this.f107965f | 1));
                break;
            default:
                p pVar = (p) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    i0 i0VarA = k0.a(0, 0, 3, mVar);
                    int i15 = this.f107961b;
                    final int i16 = this.f107962c;
                    int iMin = Math.min(i15, i16);
                    g6.f.a aVar2 = g6.f.f75994b;
                    final float f14 = this.f107963d;
                    float f15 = this.f107964e;
                    float fMax = Math.max(0, ((iMin - 1) * f15) + (iMin * f14));
                    float fG = b0.g(f14 + f15, mVar);
                    final int i17 = this.f107965f;
                    String strP = y.P(R.string.page_indicator_content_description, new Object[]{Integer.valueOf(i17 + 1), Integer.valueOf(i16)}, mVar);
                    Object[] objArr = new Object[0];
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ == c2565a2) {
                        objQ = new l01.b(10);
                        mVar.K(objQ);
                    }
                    m1 m1Var = (m1) d4.a.e(objArr, (e23.a) objQ, mVar, 48);
                    Object[] objArr2 = new Object[0];
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a2) {
                        objQ2 = new l01.b(11);
                        mVar.K(objQ2);
                    }
                    final n1 n1Var = (n1) d4.a.e(objArr2, (e23.a) objQ2, mVar, 48);
                    Object[] objArr3 = new Object[0];
                    boolean zK = mVar.k(iMin);
                    Object objQ3 = mVar.q();
                    if (zK || objQ3 == c2565a2) {
                        objQ3 = new a51.c(iMin, 6);
                        mVar.K(objQ3);
                    }
                    final n1 n1Var2 = (n1) d4.a.e(objArr3, (e23.a) objQ3, mVar, 0);
                    Integer numValueOf = Integer.valueOf(i17);
                    Integer numValueOf2 = Integer.valueOf(i16);
                    boolean zK2 = mVar.k(i17) | mVar.B(n1Var2) | mVar.k(i16) | mVar.B(n1Var) | mVar.B(m1Var) | mVar.i(fG) | mVar.B(i0VarA);
                    s1.k kVar = this.f107966g;
                    boolean zR = zK2 | mVar.r(kVar);
                    Object objQ4 = mVar.q();
                    if (zR || objQ4 == c2565a2) {
                        c2565a = c2565a2;
                        aVar = new k.a(i17, i16, fG, i0VarA, kVar, n1Var2, n1Var, m1Var, null);
                        i16 = i16;
                        mVar.K(aVar);
                    } else {
                        aVar = objQ4;
                        c2565a = c2565a2;
                    }
                    l0.f(numValueOf, numValueOf2, (p) aVar, mVar);
                    r rVarU = x2.u(this.f107967h, fMax);
                    boolean zB = mVar.B(pVar) | mVar.k(i17) | mVar.k(i16) | mVar.B(strP);
                    Object objQ5 = mVar.q();
                    if (zB || objQ5 == c2565a) {
                        objQ5 = new a11.e(strP, pVar, i17, i16);
                        mVar.K(objQ5);
                    }
                    r rVarC = v.c((e23.l) objQ5, rVarU, false);
                    c2.j.f22691a.getClass();
                    c2.j.i iVarI = c2.j.i(f15);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    boolean zK3 = mVar.k(i16) | mVar.k(i17) | mVar.B(n1Var) | mVar.B(n1Var2) | mVar.i(f14);
                    final float f16 = this.f107968i;
                    boolean zI = zK3 | mVar.i(f16);
                    final float f17 = this.f107969j;
                    boolean zI2 = zI | mVar.i(f17);
                    final r1 r1Var = this.f107970k;
                    boolean zB2 = zI2 | mVar.B(r1Var);
                    final long j8 = this.f107971l;
                    boolean zL = zB2 | mVar.l(j8);
                    final long j14 = this.f107972m;
                    boolean zL2 = zL | mVar.l(j14);
                    Object objQ6 = mVar.q();
                    if (zL2 || objQ6 == c2565a) {
                        e23.l lVar = new e23.l() { // from class: l02.j
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                f0 f0Var = (f0) obj4;
                                f0Var.getClass();
                                final int i18 = i17;
                                final int i19 = i16;
                                final float f18 = f14;
                                final float f19 = f16;
                                final float f22 = f17;
                                final r1 r1Var2 = r1Var;
                                final long j15 = j8;
                                final long j16 = j14;
                                final n1 n1Var3 = n1Var;
                                final n1 n1Var4 = n1Var2;
                                f0.f(f0Var, i19, null, new z3.e(1025606854, true, new e23.r() { // from class: l02.g
                                    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
                                    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
                                    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
                                    @Override // e23.r
                                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                        boolean z14;
                                        float f24;
                                        float f25;
                                        long j17;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        p3.m mVar2 = (p3.m) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        ((e2.d) obj5).getClass();
                                        if ((iIntValue3 & 48) == 0) {
                                            iIntValue3 |= mVar2.k(iIntValue2) ? 32 : 16;
                                        }
                                        if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                            x1 x1Var2 = n.f135158a;
                                            boolean z15 = iIntValue2 == i18;
                                            if (z15) {
                                                z14 = false;
                                            } else {
                                                int intValue = n1Var3.getIntValue() + 1;
                                                if ((iIntValue2 < n1Var4.getIntValue() && intValue <= iIntValue2) || iIntValue2 == 0 || iIntValue2 == i19 - 1) {
                                                    z14 = false;
                                                } else {
                                                    z14 = true;
                                                }
                                            }
                                            boolean z16 = (z15 || z14) ? false : true;
                                            float f26 = f18;
                                            if (z14) {
                                                f25 = f26 - f19;
                                                g6.f.a aVar3 = g6.f.f75994b;
                                            } else {
                                                if (z16) {
                                                    f25 = f26 - f22;
                                                    g6.f.a aVar4 = g6.f.f75994b;
                                                } else {
                                                    f24 = 0;
                                                    g6.f.a aVar5 = g6.f.f75994b;
                                                }
                                                r rVarB = l4.k.b(c2.l.y(x2.q(r.S, f26), ((g6.f) s1.f.a(f24, null, "Animated padding", mVar2, 384, 10).getF182175a()).f75997a), r1Var2);
                                                if (z15) {
                                                    j17 = j15;
                                                } else {
                                                    j17 = j16;
                                                }
                                                q.a(u1.n.e(rVarB, j17, o4.m1.f128891a), mVar2, 0);
                                            }
                                            f24 = f25 / 2;
                                            r rVarB2 = l4.k.b(c2.l.y(x2.q(r.S, f26), ((g6.f) s1.f.a(f24, null, "Animated padding", mVar2, 384, 10).getF182175a()).f75997a), r1Var2);
                                            if (z15) {
                                                j17 = j15;
                                            } else {
                                                j17 = j16;
                                            }
                                            q.a(u1.n.e(rVarB2, j17, o4.m1.f128891a), mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 6);
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(lVar);
                        objQ6 = lVar;
                    }
                    e2.c.c(rVarC, i0VarA, null, iVarI, bVar, null, false, null, (e23.l) objQ6, mVar, 12779520, 332);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(int i14, int i15, float f14, float f15, int i16, s1.k kVar, r rVar, p pVar, float f16, float f17, r1 r1Var, long j8, long j14) {
        this.f107961b = i14;
        this.f107962c = i15;
        this.f107963d = f14;
        this.f107964e = f15;
        this.f107965f = i16;
        this.f107966g = kVar;
        this.f107967h = rVar;
        this.f107973n = pVar;
        this.f107968i = f16;
        this.f107969j = f17;
        this.f107970k = r1Var;
        this.f107971l = j8;
        this.f107972m = j14;
    }
}
