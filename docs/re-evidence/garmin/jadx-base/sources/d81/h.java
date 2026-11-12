package d81;

import android.os.Bundle;
import androidx.compose.ui.tooling.PreviewActivity;
import c2.l2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import g81.j0;
import g81.m0;
import g81.o0;
import i3.d7;
import i3.h1;
import i3.i7;
import i3.mh;
import java.util.Arrays;
import java.util.ListIterator;
import l72.p2;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.k0;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58329c;

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f58327a = i14;
        this.f58328b = obj;
        this.f58329c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:200:0x068d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0728  */
    /* JADX WARN: Code duplicated, block: B:243:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:248:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:253:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x0166  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m52.k kVar;
        String str;
        String strB;
        f4.z zVar;
        int i14 = this.f58327a;
        String strP = null;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 3;
        boolean z14 = false;
        int i16 = 1;
        Object obj3 = this.f58329c;
        Object obj4 = this.f58328b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.b((h4.r) obj4, (g81.s) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                s.b((h4.r) obj4, (g81.m) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                y.a((i81.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                a0.e((h4.r) obj4, (j0) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                i0.a((h4.r) obj4, (o0) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                i0.c((h4.r) obj4, (m0) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                sh0.a aVar2 = (sh0.a) obj4;
                xh0.c cVar = (xh0.c) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    di0.b.a(aVar2, cVar, mVar, sh0.a.f159271b);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                sh0.e eVar = (sh0.e) obj4;
                xh0.c cVar2 = (xh0.c) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    di0.i.a(eVar, cVar2, mVar2, sh0.e.f159295b);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 8:
                h82.r rVar = (h82.r) obj4;
                final dj0.h hVar = (dj0.h) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i17 = dj0.h.f59916g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR = mVar3.r(hVar);
                    Object objQ = mVar3.q();
                    if (zR) {
                        final int i18 = 0;
                        objQ = new e23.a() { // from class: dj0.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i18;
                                h hVar2 = hVar;
                                switch (i19) {
                                    case 0:
                                        int i24 = h.f59916g;
                                        hVar2.e("READINGS_ACTION");
                                        break;
                                    case 1:
                                        int i25 = h.f59916g;
                                        hVar2.e("INFORMATION_ACTION");
                                        break;
                                    default:
                                        int i26 = h.f59916g;
                                        hVar2.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i19 = 0;
                            objQ = new e23.a() { // from class: dj0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i19;
                                    h hVar2 = hVar;
                                    switch (i110) {
                                        case 0:
                                            int i24 = h.f59916g;
                                            hVar2.e("READINGS_ACTION");
                                            break;
                                        case 1:
                                            int i25 = h.f59916g;
                                            hVar2.e("INFORMATION_ACTION");
                                            break;
                                        default:
                                            int i26 = h.f59916g;
                                            hVar2.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ);
                        }
                    }
                    rVar.B(R.string.lbl_about_your_readings, null, false, (e23.a) objQ, mVar3, 0, 6);
                    boolean zR2 = mVar3.r(hVar);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        final int i24 = 1;
                        objQ2 = new e23.a() { // from class: dj0.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i110 = i24;
                                h hVar2 = hVar;
                                switch (i110) {
                                    case 0:
                                        int i25 = h.f59916g;
                                        hVar2.e("READINGS_ACTION");
                                        break;
                                    case 1:
                                        int i26 = h.f59916g;
                                        hVar2.e("INFORMATION_ACTION");
                                        break;
                                    default:
                                        int i27 = h.f59916g;
                                        hVar2.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i25 = 1;
                            objQ2 = new e23.a() { // from class: dj0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i25;
                                    h hVar2 = hVar;
                                    switch (i110) {
                                        case 0:
                                            int i26 = h.f59916g;
                                            hVar2.e("READINGS_ACTION");
                                            break;
                                        case 1:
                                            int i27 = h.f59916g;
                                            hVar2.e("INFORMATION_ACTION");
                                            break;
                                        default:
                                            int i28 = h.f59916g;
                                            hVar2.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ2);
                        }
                    }
                    rVar.B(R.string.lbl_what_is_ftp, null, false, (e23.a) objQ2, mVar3, 0, 6);
                    boolean zR3 = mVar3.r(hVar);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        final int i26 = 2;
                        objQ3 = new e23.a() { // from class: dj0.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i110 = i26;
                                h hVar2 = hVar;
                                switch (i110) {
                                    case 0:
                                        int i27 = h.f59916g;
                                        hVar2.e("READINGS_ACTION");
                                        break;
                                    case 1:
                                        int i28 = h.f59916g;
                                        hVar2.e("INFORMATION_ACTION");
                                        break;
                                    default:
                                        int i29 = h.f59916g;
                                        hVar2.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            final int i27 = 2;
                            objQ3 = new e23.a() { // from class: dj0.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i110 = i27;
                                    h hVar2 = hVar;
                                    switch (i110) {
                                        case 0:
                                            int i28 = h.f59916g;
                                            hVar2.e("READINGS_ACTION");
                                            break;
                                        case 1:
                                            int i29 = h.f59916g;
                                            hVar2.e("INFORMATION_ACTION");
                                            break;
                                        default:
                                            int i210 = h.f59916g;
                                            hVar2.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ3);
                        }
                    }
                    rVar.B(R.string.lbl_how_to_get_measurement, null, false, (e23.a) objQ3, mVar3, 0, 6);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i28 = dj0.h.f59916g;
                ((dj0.h) obj4).g((yi0.d) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                zc.d dVar = (zc.d) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zR4 = mVar4.r(dVar) | mVar4.B(lVar);
                    Object objQ4 = mVar4.q();
                    if (zR4) {
                        objQ4 = new dl0.e(dVar, lVar, 0);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new dl0.e(dVar, lVar, 0);
                            mVar4.K(objQ4);
                        }
                    }
                    e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ4, mVar4, 0, 511);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                dr.a.a((Integer) obj4, (e23.l) obj3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 12:
                qr.t tVar = (qr.t) obj4;
                x3 x3Var = (x3) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarD = x2.d(aVar3, 1.0f);
                    long jA = tn.k.a(d92.b.f58623a, mVar5);
                    m1.a aVar4 = m1.f128891a;
                    h4.r rVarB = a2.b(u1.n.e(rVarD, jA, aVar4), a2.a(mVar5), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar2, aVar5, mVar5, 0);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar5);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar5);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar5);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarE = u1.n.e(x2.f(aVar3, 1.0f), d92.b.a(mVar5).c().c(), aVar4);
                    c2.z zVarA2 = c2.y.a(kVar2, aVar5, mVar5, 0);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    h4.r rVarC2 = h4.k.c(rVarE, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar2, zVarA2, mVar5);
                    b4.c(c1623g, i2VarX2, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar5);
                    String strQ = gl1.y.Q(mVar5, R.string.lbl_choose_an_aspect_ratio);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), mVar5);
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    mh.c(strQ, c2.l.A(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar5, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar5, R.string.lbl_scale_image_based_on_selection), c2.l.y(aVar3, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar5), mVar5, 0, 0, 131068);
                    mVar5.y();
                    h4.r rVarC3 = c2.l.C(aVar3, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    c2.z zVarA3 = c2.y.a(kVar2, aVar5, mVar5, 0);
                    int iHashCode3 = Long.hashCode(mVar5.getU());
                    i2 i2VarX3 = mVar5.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar2, zVarA3, mVar5);
                    b4.c(c1623g, i2VarX3, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC4, mVar5);
                    mVar5.C(-1064529752);
                    for (ds.n nVar : ds.n.f61016m) {
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                        c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, gl1.y.Q(mVar5, nVar.f61020d));
                        b92.a aVarB = c0235a.b();
                        boolean z15 = ((ds.n) x3Var.getF182175a()) == nVar;
                        p2 p2Var = p2.f111205a;
                        String strQ2 = gl1.y.Q(mVar5, nVar.f61019c);
                        z3.e eVarC = z3.f.c(-773688435, new dh1.a(nVar, 5), mVar5);
                        z3.e eVarC2 = z3.f.c(-1784354482, new an1.i(z15, 14), mVar5);
                        boolean zR5 = mVar5.r(tVar) | mVar5.k(nVar.ordinal());
                        Object objQ5 = mVar5.q();
                        if (zR5) {
                            objQ5 = new dl0.g(3, tVar, nVar);
                            mVar5.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new dl0.g(3, tVar, nVar);
                                mVar5.K(objQ5);
                            }
                        }
                        int i29 = b92.a.f16960b;
                        p2Var.g(strQ2, null, aVarB, eVarC, eVarC2, false, z15, (e23.a) objQ5, mVar5, 27648, 162);
                    }
                    mVar5.f();
                    mVar5.y();
                    mVar5.y();
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 13:
                rd.d dVar2 = (rd.d) obj3;
                obj2.getClass();
                dVar2.getClass();
                k0.f134949a.getClass();
                Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
                new rd.g(bundleA, dVar2).l((tc.a) obj4, obj2);
                return bundleA;
            case 14:
                ((Integer) obj2).getClass();
                e40.h.a((n50.g) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                Object[] objArr = (Object[]) obj4;
                n1 n1Var = (n1) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i30 = PreviewActivity.f6058a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean zR6 = mVar6.r(objArr);
                    Object objQ6 = mVar6.q();
                    if (zR6) {
                        objQ6 = new dl0.g(9, n1Var, objArr);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new dl0.g(9, n1Var, objArr);
                            mVar6.K(objQ6);
                        }
                    }
                    e6.b.f63140a.getClass();
                    d7.a((e23.a) objQ6, null, null, 0L, 0L, null, e6.b.f63141b, mVar6, 12582912);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 16:
                com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj4;
                e23.a aVar7 = (e23.a) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    Integer numValueOf = (h0Var == null || (kVar = h0Var.f48193h) == null) ? null : Integer.valueOf(kVar.f116769e);
                    if (numValueOf == null) {
                        mVar7.C(-1380465141);
                        mVar7.f();
                    } else {
                        mVar7.C(-1380465140);
                        strP = gl1.y.P(R.string.lbl_workout_type_leg, new Object[]{gl1.y.Q(mVar7, numValueOf.intValue())}, mVar7);
                        mVar7.f();
                    }
                    z02.f.c(0, 54, null, aVar7, null, strP, mVar7, null);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ek0.a.a((i53.c) obj4, (dk0.f) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ep.b bVar2 = (ep.b) obj4;
                String str2 = (String) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String str3 = (bVar2 == null || (str = bVar2.f64805e) == null || (strB = c22.j0.b(DateTime.parse(str), "MMM d, yyyy", null)) == null) ? str2 : strB;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, ds.e0.e(mVar8), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar8, 0, 0, 131070);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ep.k.d((h4.r) obj4, (ep.o) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                et.l.b((zs.c) obj4, (bt.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                et.n.b((ys.b) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                pt1.w wVar = (pt1.w) obj4;
                us1.e eVar4 = (us1.e) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    if (wVar.f140999c == eVar4) {
                        mVar9.C(-478657082);
                        i7.a(n5.c.a(R.drawable.ic_check, mVar9, 0), null, null, fb1.c.g(d92.b.f58623a, mVar9), mVar9, 48, 4);
                        mVar9.f();
                    } else {
                        mVar9.C(-478370704);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 23:
                p1 p1Var = (p1) obj4;
                pt1.w wVar2 = (pt1.w) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    g6.f.a aVar8 = g6.f.f75994b;
                    l2 l2VarA = c2.l.a(0);
                    Object objQ7 = mVar10.q();
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new dv0.f(p1Var, 28);
                        mVar10.K(objQ7);
                    }
                    h1.c((e23.a) objQ7, null, false, null, null, null, l2VarA, null, z3.f.c(-586834095, new et1.v(wVar2, i16), mVar10), mVar10, 817889286, 382);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 24:
                p1 p1Var2 = (p1) obj4;
                us1.o oVar = (us1.o) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    g6.f.a aVar9 = g6.f.f75994b;
                    l2 l2VarA2 = c2.l.a(0);
                    boolean zB = mVar11.B(p1Var2);
                    Object objQ8 = mVar11.q();
                    if (zB) {
                        objQ8 = new et1.a2(p1Var2, 1);
                        mVar11.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new et1.a2(p1Var2, 1);
                            mVar11.K(objQ8);
                        }
                    }
                    h1.c((e23.a) objQ8, null, false, null, null, null, l2VarA2, null, z3.f.c(759908487, new et1.v(oVar, i15), mVar11), mVar11, 817889280, 382);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 25:
                us1.o oVar2 = (us1.o) obj4;
                us1.o oVar3 = (us1.o) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    if (oVar2 == oVar3) {
                        mVar12.C(-1056326941);
                        i7.a(n5.c.a(R.drawable.ic_check, mVar12, 0), gl1.y.Q(mVar12, R.string.lbl_selected), null, fb1.c.g(d92.b.f58623a, mVar12), mVar12, 0, 4);
                        mVar12.f();
                    } else {
                        mVar12.C(-1056004045);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 26:
                f4.s sVar = (f4.s) obj4;
                p1 p1Var3 = (p1) obj3;
                eu.h hVar2 = (eu.h) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                eu.c cVar3 = eu.c.f66055a;
                hVar2.getClass();
                ListIterator listIterator = sVar.listIterator();
                int i34 = 0;
                while (true) {
                    f4.z zVar2 = (f4.z) listIterator;
                    if (!zVar2.hasNext()) {
                        i34 = -1;
                    } else if (!((eu.h) zVar2.next()).f66087a.equals(hVar2.f66087a)) {
                        i34++;
                    }
                }
                if (i34 < 0) {
                    return Unit.INSTANCE;
                }
                eu.h hVar3 = (eu.h) sVar.get(i34);
                sVar.set(i34, new eu.h(hVar3.f66087a, hVar3.f66088b, zBooleanValue));
                if (!sVar.isEmpty()) {
                    ListIterator listIterator2 = sVar.listIterator();
                    do {
                        zVar = (f4.z) listIterator2;
                        if (zVar.hasNext()) {
                        }
                    } while (!((eu.h) zVar.next()).f66089c);
                    z14 = true;
                }
                p1Var3.setValue(Boolean.valueOf(z14));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                lg.d.f((e23.a) obj4, (ux1.g) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ew1.r.a aVar10 = ew1.r.f66699d;
                ((ew1.r) obj4).y6((e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ew1.y.b bVar3 = ew1.y.f66842g;
                ((ew1.y) obj4).y6((String) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i14, int i15) {
        this.f58327a = i15;
        this.f58328b = obj;
        this.f58329c = obj2;
    }
}
