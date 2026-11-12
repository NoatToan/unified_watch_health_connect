package q81;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u81.a f143302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f143303c;

    public /* synthetic */ b(int i14, d dVar, u81.a aVar) {
        this.f143301a = i14;
        this.f143302b = aVar;
        this.f143303c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x031d  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x0250  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        String strQ;
        e23.a aVar;
        int i15;
        String strQ2;
        e23.a aVar2;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        int i16 = this.f143301a;
        final d dVar = this.f143303c;
        final u81.a aVar3 = this.f143302b;
        final int i17 = 0;
        final int i18 = 1;
        switch (i16) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(2069593538, new b(i18, dVar, aVar3), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                Context context = dVar.f143308b;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar4 = r.S;
                    r rVarE = u1.n.e(aVar4, tn.k.a(d92.b.f58623a, mVar2), m1.f128891a);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = c2.l.y(rVarE, eVar.f97920e);
                    c2.j jVar = c2.j.f22691a;
                    float f14 = eVar.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarI, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(rVarY, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    e23.a aVar6 = null;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    r rVarC2 = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                    String strQ3 = gl1.y.Q(mVar2, R.string.tr_factors);
                    z5.b.f202439b.getClass();
                    String strB = l0.b(strQ3, z5.b.a.a());
                    d92.b.f58624b.getClass();
                    mh.c(strB, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                    String strQ4 = gl1.y.Q(mVar2, R.string.no_value);
                    Integer num = aVar3.f169463e;
                    Double d14 = aVar3.f169464f;
                    Integer num2 = aVar3.f169462d;
                    String str = (num == null || (strValueOf3 = String.valueOf(num.intValue())) == null) ? strQ4 : strValueOf3;
                    if (num == null) {
                        mVar2.C(-1234470268);
                        mVar2.f();
                        strQ = null;
                    } else {
                        mVar2.C(-1234470267);
                        int iIntValue3 = num.intValue();
                        j.f143327a.getClass();
                        if (iIntValue3 < 0 || iIntValue3 >= 30) {
                            i14 = (30 > iIntValue3 || iIntValue3 >= 70) ? R.string.hill_strength_endurance_score_high : R.string.hill_strength_endurance_score_moderate;
                        } else {
                            i14 = R.string.hill_strength_endurance_score_low;
                        }
                        strQ = gl1.y.Q(mVar2, i14);
                        mVar2.f();
                    }
                    if (strQ == null) {
                        strQ = strQ4;
                    }
                    String strQ5 = gl1.y.Q(mVar2, R.string.lbl_hill_endurance);
                    p3.m.a aVar7 = p3.m.f135153a;
                    if (num == null) {
                        mVar2.C(-1234009949);
                        mVar2.f();
                        aVar = null;
                    } else {
                        mVar2.C(-1234009948);
                        boolean zR = mVar2.r(dVar) | mVar2.r(aVar3);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new e23.a() { // from class: q81.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            dVar.f143307a.invoke(o81.f.HILL_ENDURANCE, aVar3);
                                            break;
                                        case 1:
                                            dVar.f143307a.invoke(o81.f.HILL_STRENGTH, aVar3);
                                            break;
                                        default:
                                            dVar.f143307a.invoke(o81.f.VO2_MAX, aVar3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        } else {
                            aVar7.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e23.a() { // from class: q81.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                dVar.f143307a.invoke(o81.f.HILL_ENDURANCE, aVar3);
                                                break;
                                            case 1:
                                                dVar.f143307a.invoke(o81.f.HILL_STRENGTH, aVar3);
                                                break;
                                            default:
                                                dVar.f143307a.invoke(o81.f.VO2_MAX, aVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ);
                            }
                        }
                        aVar = (e23.a) objQ;
                        mVar2.f();
                    }
                    e.a(0, 2, aVar, strQ5, null, str, strQ, mVar2);
                    String str2 = (num2 == null || (strValueOf2 = String.valueOf(num2.intValue())) == null) ? strQ4 : strValueOf2;
                    if (num2 == null) {
                        mVar2.C(-1233572508);
                        mVar2.f();
                        strQ2 = null;
                    } else {
                        mVar2.C(-1233572507);
                        int iIntValue4 = num2.intValue();
                        j.f143327a.getClass();
                        if (iIntValue4 < 0 || iIntValue4 >= 30) {
                            i15 = (30 > iIntValue4 || iIntValue4 >= 70) ? R.string.hill_strength_endurance_score_high : R.string.hill_strength_endurance_score_moderate;
                        } else {
                            i15 = R.string.hill_strength_endurance_score_low;
                        }
                        strQ2 = gl1.y.Q(mVar2, i15);
                        mVar2.f();
                    }
                    String str3 = strQ2 == null ? strQ4 : strQ2;
                    String strQ6 = gl1.y.Q(mVar2, R.string.lbl_hill_strength);
                    if (num2 == null) {
                        mVar2.C(-1233116188);
                        mVar2.f();
                        aVar2 = null;
                    } else {
                        mVar2.C(-1233116187);
                        boolean zR2 = mVar2.r(dVar) | mVar2.r(aVar3);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: q81.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            dVar.f143307a.invoke(o81.f.HILL_ENDURANCE, aVar3);
                                            break;
                                        case 1:
                                            dVar.f143307a.invoke(o81.f.HILL_STRENGTH, aVar3);
                                            break;
                                        default:
                                            dVar.f143307a.invoke(o81.f.VO2_MAX, aVar3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        } else {
                            aVar7.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: q81.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                dVar.f143307a.invoke(o81.f.HILL_ENDURANCE, aVar3);
                                                break;
                                            case 1:
                                                dVar.f143307a.invoke(o81.f.HILL_STRENGTH, aVar3);
                                                break;
                                            default:
                                                dVar.f143307a.invoke(o81.f.VO2_MAX, aVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ2);
                            }
                        }
                        mVar2.f();
                        aVar2 = (e23.a) objQ2;
                    }
                    e.a(0, 2, aVar2, strQ6, null, str2, str3, mVar2);
                    f12.l.f68084a.getClass();
                    boolean z14 = TextUtils.isEmpty(f12.l.a.a().w()) || f12.l.a.a().w().equals("MALE");
                    a61.e eVar2 = a61.e.f1563a;
                    int iU = f12.l.a.a().u();
                    eVar2.getClass();
                    double[] dArrH = a61.e.h(iU, z14);
                    l22.a aVar8 = new l22.a(context);
                    Resources resources = context.getResources();
                    resources.getClass();
                    x61.s sVar = new x61.s(aVar8, resources);
                    String str4 = (d14 == null || (strValueOf = String.valueOf((int) d14.doubleValue())) == null) ? strQ4 : strValueOf;
                    if (d14 != null) {
                        double dDoubleValue = d14.doubleValue();
                        dArrH.getClass();
                        eVar2.getClass();
                        q71.a aVarB = a61.e.b(dDoubleValue, dArrH);
                        q71.a aVar9 = q71.a.POOR;
                        l22.b bVar2 = sVar.f189280a;
                        strQ4 = aVarB == aVar9 ? bVar2.getString(R.string.lbl_poor) : bVar2.getString(aVarB.f143227a);
                    }
                    String str5 = strQ4;
                    String strQ7 = gl1.y.Q(mVar2, R.string.lbl_vo2_max);
                    String strQ8 = gl1.y.Q(mVar2, R.string.lbl_max_oxygen_rate);
                    if (d14 == null) {
                        mVar2.C(-1231776182);
                        mVar2.f();
                    } else {
                        mVar2.C(-1231776181);
                        boolean zR3 = mVar2.r(dVar) | mVar2.r(aVar3);
                        Object objQ3 = mVar2.q();
                        if (zR3) {
                            final int i19 = 2;
                            objQ3 = new e23.a() { // from class: q81.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            dVar.f143307a.invoke(o81.f.HILL_ENDURANCE, aVar3);
                                            break;
                                        case 1:
                                            dVar.f143307a.invoke(o81.f.HILL_STRENGTH, aVar3);
                                            break;
                                        default:
                                            dVar.f143307a.invoke(o81.f.VO2_MAX, aVar3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        } else {
                            aVar7.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                final int i110 = 2;
                                objQ3 = new e23.a() { // from class: q81.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i110) {
                                            case 0:
                                                dVar.f143307a.invoke(o81.f.HILL_ENDURANCE, aVar3);
                                                break;
                                            case 1:
                                                dVar.f143307a.invoke(o81.f.HILL_STRENGTH, aVar3);
                                                break;
                                            default:
                                                dVar.f143307a.invoke(o81.f.VO2_MAX, aVar3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ3);
                            }
                        }
                        aVar6 = (e23.a) objQ3;
                        mVar2.f();
                    }
                    e.a(0, 0, aVar6, strQ7, strQ8, str4, str5, mVar2);
                    c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar2);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
