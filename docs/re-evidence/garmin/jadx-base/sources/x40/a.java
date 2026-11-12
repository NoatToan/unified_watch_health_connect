package x40;

import c2.x2;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import i3.fe;
import l72.d3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import r53.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188653b;

    public /* synthetic */ a(CreateCustomCourseActivity createCustomCourseActivity, int i14) {
        this.f188652a = i14;
        this.f188653b = createCustomCourseActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f188652a;
        CreateCustomCourseActivity createCustomCourseActivity = this.f188653b;
        switch (i14) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                double dDoubleValue2 = ((Double) obj2).doubleValue();
                CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.ha(new a50.c.t0(dDoubleValue, dDoubleValue2));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).getClass();
                int iIntValue = ((Integer) obj2).intValue();
                CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().H4(iIntValue);
                return Unit.INSTANCE;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CreateCustomCourseActivity.a aVar3 = CreateCustomCourseActivity.f33013f;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-629959131, new a(createCustomCourseActivity, 4), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                CreateCustomCourseActivity.a aVar4 = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa = createCustomCourseActivity.fa();
                l0VarFa.getClass();
                l0VarFa.D4(new a50.e.z(iIntValue3));
                l0 l0VarFa2 = createCustomCourseActivity.fa();
                l0VarFa2.getClass();
                l0VarFa2.D4(new a50.e.q(iIntValue4));
                return Unit.INSTANCE;
            case 4:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                CreateCustomCourseActivity.a aVar5 = CreateCustomCourseActivity.f33013f;
                if (mVar2.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p3.p1 p1VarC = s9.c.c(createCustomCourseActivity.fa().I, mVar2);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new fe();
                        mVar2.K(objQ);
                    }
                    fe feVar = (fe) objQ;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarD = x2.d(aVar6, 1.0f);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    a50.g gVar = (a50.g) p1VarC.getF182175a();
                    a2 a2Var = createCustomCourseActivity.fa().T;
                    boolean zR = mVar2.r(createCustomCourseActivity);
                    Object objQ2 = mVar2.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new h(createCustomCourseActivity);
                        mVar2.K(objQ2);
                    }
                    y40.l.a(gVar, a2Var, (e23.l) ((k23.g) objQ2), mVar2, 0);
                    d3.b(feVar, uVar.c(aVar6, h4.d.a.f81531i), mVar2, 6, 0);
                    mVar2.y();
                    Boolean boolValueOf = Boolean.valueOf(((a50.g) p1VarC.getF182175a()).f1390a);
                    n50.a aVar8 = ((a50.g) p1VarC.getF182175a()).f1391b;
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(createCustomCourseActivity);
                    Object objQ3 = mVar2.q();
                    if (zB || objQ3 == c2565a) {
                        objQ3 = new i(createCustomCourseActivity, p1VarC, null);
                        mVar2.K(objQ3);
                    }
                    p3.l0.f(boolValueOf, aVar8, (e23.p) objQ3, mVar2);
                    Unit unit = Unit.INSTANCE;
                    boolean zR2 = mVar2.r(createCustomCourseActivity);
                    Object objQ4 = mVar2.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new j(createCustomCourseActivity, feVar, null);
                        mVar2.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, unit, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) obj;
                String str = (String) obj2;
                CreateCustomCourseActivity.a aVar9 = CreateCustomCourseActivity.f33013f;
                pointOfInterestDTO.getClass();
                str.getClass();
                createCustomCourseActivity.ha(new a50.c.d(pointOfInterestDTO, str));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj).getClass();
                int iIntValue6 = ((Integer) obj2).intValue();
                CreateCustomCourseActivity.a aVar10 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().H4(iIntValue6);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj).getClass();
                int iIntValue7 = ((Integer) obj2).intValue();
                CreateCustomCourseActivity.a aVar11 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().H4(iIntValue7);
                return Unit.INSTANCE;
            default:
                int iIntValue8 = ((Integer) obj).intValue();
                int iIntValue9 = ((Integer) obj2).intValue();
                CreateCustomCourseActivity.a aVar12 = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa3 = createCustomCourseActivity.fa();
                l0VarFa3.getClass();
                l0VarFa3.D4(new a50.e.z(iIntValue8));
                l0 l0VarFa4 = createCustomCourseActivity.fa();
                l0VarFa4.getClass();
                l0VarFa4.D4(new a50.e.q(iIntValue9));
                return Unit.INSTANCE;
        }
    }
}
