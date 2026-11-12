package au0;

import c2.h2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import kotlin.m3;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.q f12916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f12924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m3 f12925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.l f12926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p1 f12928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p1 f12929o;

    public /* synthetic */ h(m4.q qVar, String str, boolean z14, boolean z15, boolean z16, String str2, boolean z17, boolean z18, boolean z19, m3 m3Var, e23.l lVar, int i14, p1 p1Var, p1 p1Var2, int i15) {
        this.f12915a = i15;
        this.f12916b = qVar;
        this.f12917c = str;
        this.f12918d = z14;
        this.f12919e = z15;
        this.f12920f = z16;
        this.f12921g = str2;
        this.f12922h = z17;
        this.f12923i = z18;
        this.f12924j = z19;
        this.f12925k = m3Var;
        this.f12926l = lVar;
        this.f12927m = i14;
        this.f12928n = p1Var;
        this.f12929o = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final boolean z14;
        m3 m3Var;
        boolean z15;
        m3 m3Var2;
        int i14 = this.f12915a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = this.f12927m;
        switch (i14) {
            case 0:
                h2 h2Var = (h2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                h2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(h2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarP = c2.l.p(c2.l.x(u1.n.e(x2.d(aVar2, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a), h2Var));
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = tn.k.c(mVar);
                    }
                    a2.j jVar = (a2.j) objQ;
                    final m4.q qVar = this.f12916b;
                    boolean zR = mVar.r(qVar);
                    Object objQ2 = mVar.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new j(qVar, 0);
                        mVar.K(objQ2);
                    }
                    h4.r rVarB = u1.w.b(rVarP, jVar, null, false, null, null, (e23.a) objQ2, 28);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.u uVar = c2.u.f22885a;
                    final p1 p1Var = this.f12928n;
                    String str = (String) p1Var.getF182175a();
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new a11.m(p1Var, 2);
                        mVar.K(objQ3);
                    }
                    e23.l lVar = (e23.l) objQ3;
                    boolean z16 = this.f12919e;
                    boolean zH = mVar.h(z16);
                    final m3 m3Var3 = this.f12925k;
                    boolean zB = zH | mVar.B(m3Var3) | mVar.r(qVar);
                    Object objQ4 = mVar.q();
                    if (zB || objQ4 == c2565a) {
                        final int i16 = 0;
                        final p1 p1Var2 = this.f12929o;
                        z14 = z16;
                        objQ4 = new e23.l() { // from class: au0.k
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                Boolean bool = (Boolean) obj4;
                                switch (i16) {
                                    case 0:
                                        boolean zBooleanValue = bool.booleanValue();
                                        p1Var2.setValue(bool);
                                        if (zBooleanValue && !z14) {
                                            m3 m3Var4 = m3Var3;
                                            if (m3Var4 != null) {
                                                m3Var4.hide();
                                            }
                                        } else if (!zBooleanValue) {
                                            qVar.y(false);
                                        }
                                        break;
                                    default:
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        p1Var2.setValue(bool);
                                        if (zBooleanValue2 && !z14) {
                                            m3 m3Var5 = m3Var3;
                                            if (m3Var5 != null) {
                                                m3Var5.hide();
                                            }
                                        } else if (!zBooleanValue2) {
                                            qVar.y(false);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        m3Var = m3Var3;
                        mVar.K(objQ4);
                    } else {
                        z14 = z16;
                        m3Var = m3Var3;
                    }
                    e23.l lVar2 = (e23.l) objQ4;
                    boolean zB2 = mVar.B(m3Var);
                    Object objQ5 = mVar.q();
                    if (zB2 || objQ5 == c2565a) {
                        objQ5 = new l(m3Var, 0);
                        mVar.K(objQ5);
                    }
                    e23.a aVar4 = (e23.a) objQ5;
                    String str2 = this.f12917c;
                    final boolean z17 = this.f12918d;
                    boolean z18 = this.f12920f;
                    String str3 = this.f12921g;
                    boolean z19 = this.f12922h;
                    boolean z24 = this.f12923i;
                    final boolean z25 = this.f12924j;
                    p.b(str, str2, z17, z14, z18, str3, z19, z24, z25, lVar, lVar2, aVar4, mVar, 805502976);
                    String strQ = gl1.y.Q(mVar, z19 ? R.string.lbl_calibrate_and_save : R.string.lbl_continue);
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_skip_button);
                    boolean z26 = ((String) p1Var.getF182175a()).length() > 0 && !(z24 && z19);
                    final e23.l lVar3 = this.f12926l;
                    boolean zB3 = mVar.B(lVar3) | mVar.k(i15);
                    Object objQ6 = mVar.q();
                    if (zB3 || objQ6 == c2565a) {
                        objQ6 = new m(lVar3, i15, 0);
                        mVar.K(objQ6);
                    }
                    e23.a aVar5 = (e23.a) objQ6;
                    boolean zB4 = mVar.B(lVar3) | mVar.h(z17) | mVar.h(z25);
                    Object objQ7 = mVar.q();
                    if (zB4 || objQ7 == c2565a) {
                        final int i17 = 0;
                        e23.a aVar6 = new e23.a() { // from class: au0.n
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        lVar3.invoke(Integer.valueOf(p.f((String) p1Var.getF182175a(), z17, z25)));
                                        break;
                                    default:
                                        lVar3.invoke(Integer.valueOf(wg2.d.f((String) p1Var.getF182175a(), z17, z25)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(aVar6);
                        objQ7 = aVar6;
                    }
                    p.a(0, aVar5, (e23.a) objQ7, uVar.c(aVar2, h4.d.a.f81531i), strQ2, strQ, mVar, z26);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                h2 h2Var2 = (h2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                h2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(h2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    h4.r rVarP2 = c2.l.p(c2.l.x(u1.n.e(x2.d(aVar7, 1.0f), tn.k.a(d92.b.f58623a, mVar2), m1.f128891a), h2Var2));
                    Object objQ8 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ8 == c2565a2) {
                        objQ8 = tn.k.c(mVar2);
                    }
                    a2.j jVar2 = (a2.j) objQ8;
                    final m4.q qVar2 = this.f12916b;
                    boolean zR2 = mVar2.r(qVar2);
                    Object objQ9 = mVar2.q();
                    if (zR2 || objQ9 == c2565a2) {
                        objQ9 = new j(qVar2, 2);
                        mVar2.K(objQ9);
                    }
                    h4.r rVarB2 = u1.w.b(rVarP2, jVar2, null, false, null, null, (e23.a) objQ9, 28);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarB2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.u uVar2 = c2.u.f22885a;
                    final p1 p1Var3 = this.f12928n;
                    String str4 = (String) p1Var3.getF182175a();
                    Object objQ10 = mVar2.q();
                    if (objQ10 == c2565a2) {
                        objQ10 = new vd0.d(p1Var3, 21);
                        mVar2.K(objQ10);
                    }
                    e23.l lVar4 = (e23.l) objQ10;
                    final boolean z27 = this.f12919e;
                    boolean zH2 = mVar2.h(z27);
                    final m3 m3Var4 = this.f12925k;
                    boolean zB5 = zH2 | mVar2.B(m3Var4) | mVar2.r(qVar2);
                    Object objQ11 = mVar2.q();
                    if (zB5 || objQ11 == c2565a2) {
                        final int i18 = 1;
                        final p1 p1Var4 = this.f12929o;
                        objQ11 = new e23.l() { // from class: au0.k
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                Boolean bool = (Boolean) obj4;
                                switch (i18) {
                                    case 0:
                                        boolean zBooleanValue = bool.booleanValue();
                                        p1Var4.setValue(bool);
                                        if (zBooleanValue && !z27) {
                                            m3 m3Var5 = m3Var4;
                                            if (m3Var5 != null) {
                                                m3Var5.hide();
                                            }
                                        } else if (!zBooleanValue) {
                                            qVar2.y(false);
                                        }
                                        break;
                                    default:
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        p1Var4.setValue(bool);
                                        if (zBooleanValue2 && !z27) {
                                            m3 m3Var6 = m3Var4;
                                            if (m3Var6 != null) {
                                                m3Var6.hide();
                                            }
                                        } else if (!zBooleanValue2) {
                                            qVar2.y(false);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        z15 = z27;
                        m3Var2 = m3Var4;
                        mVar2.K(objQ11);
                    } else {
                        z15 = z27;
                        m3Var2 = m3Var4;
                    }
                    e23.l lVar5 = (e23.l) objQ11;
                    boolean zB6 = mVar2.B(m3Var2);
                    Object objQ12 = mVar2.q();
                    if (zB6 || objQ12 == c2565a2) {
                        objQ12 = new l(m3Var2, 2);
                        mVar2.K(objQ12);
                    }
                    e23.a aVar9 = (e23.a) objQ12;
                    String str5 = this.f12917c;
                    final boolean z28 = this.f12918d;
                    boolean z29 = this.f12920f;
                    String str6 = this.f12921g;
                    boolean z34 = this.f12922h;
                    boolean z35 = this.f12923i;
                    final boolean z36 = this.f12924j;
                    wg2.d.b(str4, str5, z28, z15, z29, str6, z34, z35, z36, lVar4, lVar5, aVar9, mVar2, 805502976);
                    String strQ3 = gl1.y.Q(mVar2, z34 ? R.string.lbl_calibrate_and_save : R.string.lbl_continue);
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_skip_button);
                    boolean z37 = ((String) p1Var3.getF182175a()).length() > 0 && !(z35 && z34);
                    final e23.l lVar6 = this.f12926l;
                    boolean zB7 = mVar2.B(lVar6) | mVar2.k(i15);
                    Object objQ13 = mVar2.q();
                    if (zB7 || objQ13 == c2565a2) {
                        objQ13 = new m(lVar6, i15, 18);
                        mVar2.K(objQ13);
                    }
                    e23.a aVar10 = (e23.a) objQ13;
                    boolean zB8 = mVar2.B(lVar6) | mVar2.h(z28) | mVar2.h(z36);
                    Object objQ14 = mVar2.q();
                    if (zB8 || objQ14 == c2565a2) {
                        final int i19 = 1;
                        e23.a aVar11 = new e23.a() { // from class: au0.n
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        lVar6.invoke(Integer.valueOf(p.f((String) p1Var3.getF182175a(), z28, z36)));
                                        break;
                                    default:
                                        lVar6.invoke(Integer.valueOf(wg2.d.f((String) p1Var3.getF182175a(), z28, z36)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar11);
                        objQ14 = aVar11;
                    }
                    wg2.d.a(0, aVar10, (e23.a) objQ14, uVar2.c(aVar7, h4.d.a.f81531i), strQ4, strQ3, mVar2, z37);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
