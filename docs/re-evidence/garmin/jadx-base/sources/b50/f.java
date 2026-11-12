package b50;

import c2.x2;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import i3.fe;
import java.util.List;
import l72.d3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import r53.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15973b;

    public /* synthetic */ f(CourseDetailsActivity courseDetailsActivity, int i14) {
        this.f15972a = i14;
        this.f15973b = courseDetailsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f15972a;
        CourseDetailsActivity courseDetailsActivity = this.f15973b;
        switch (i14) {
            case 0:
                ((Integer) obj).getClass();
                int iIntValue = ((Integer) obj2).intValue();
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                p pVarIa = courseDetailsActivity.ia();
                pVarIa.getClass();
                pVarIa.z4(new e50.b.o(iIntValue));
                return Unit.INSTANCE;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                p pVarIa2 = courseDetailsActivity.ia();
                pVarIa2.getClass();
                pVarIa2.z4(new e50.b.m(iIntValue2));
                p pVarIa3 = courseDetailsActivity.ia();
                pVarIa3.getClass();
                pVarIa3.z4(new e50.b.g(iIntValue3));
                return Unit.INSTANCE;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                if (mVar.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(237104020, new f(courseDetailsActivity, 5), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj).getClass();
                int iIntValue5 = ((Integer) obj2).intValue();
                CourseDetailsActivity.a aVar4 = CourseDetailsActivity.f33024k;
                p pVarIa4 = courseDetailsActivity.ia();
                pVarIa4.getClass();
                pVarIa4.z4(new e50.b.o(iIntValue5));
                return Unit.INSTANCE;
            case 4:
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                CourseDetailsActivity.a aVar5 = CourseDetailsActivity.f33024k;
                p pVarIa5 = courseDetailsActivity.ia();
                pVarIa5.getClass();
                pVarIa5.z4(new e50.b.m(iIntValue6));
                p pVarIa6 = courseDetailsActivity.ia();
                pVarIa6.getClass();
                pVarIa6.z4(new e50.b.g(iIntValue7));
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                CourseDetailsActivity.a aVar6 = CourseDetailsActivity.f33024k;
                if (mVar2.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(courseDetailsActivity.ia().f16042z, mVar2);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new fe();
                        mVar2.K(objQ);
                    }
                    fe feVar = (fe) objQ;
                    h4.r.a aVar7 = h4.r.S;
                    h4.r rVarD = x2.d(aVar7, 1.0f);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar8);
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
                    e50.d dVar = (e50.d) p1VarC.getF182175a();
                    a2 a2Var = courseDetailsActivity.ia().B;
                    boolean zR = mVar2.r(courseDetailsActivity);
                    Object objQ2 = mVar2.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new j(courseDetailsActivity);
                        mVar2.K(objQ2);
                    }
                    c50.d.a(dVar, a2Var, (e23.l) ((k23.g) objQ2), mVar2, 0);
                    d3.b(feVar, uVar.c(aVar7, h4.d.a.f81531i), mVar2, 6, 0);
                    mVar2.y();
                    Boolean boolValueOf = Boolean.valueOf(((e50.d) p1VarC.getF182175a()).f62989a);
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(courseDetailsActivity);
                    Object objQ3 = mVar2.q();
                    if (zB || objQ3 == c2565a) {
                        objQ3 = new k(courseDetailsActivity, p1VarC, null);
                        mVar2.K(objQ3);
                    }
                    p3.l0.e((e23.p) objQ3, boolValueOf, mVar2);
                    w20.a aVar9 = ((e50.d) p1VarC.getF182175a()).f62992d;
                    List<fn0.a> list = aVar9 != null ? aVar9.f181478c : null;
                    boolean zR2 = mVar2.r(courseDetailsActivity) | mVar2.B(p1VarC);
                    Object objQ4 = mVar2.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new l(courseDetailsActivity, feVar, p1VarC, null);
                        mVar2.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, list, mVar2);
                    Unit unit = Unit.INSTANCE;
                    boolean zR3 = mVar2.r(courseDetailsActivity);
                    Object objQ5 = mVar2.q();
                    if (zR3 || objQ5 == c2565a) {
                        objQ5 = new m(courseDetailsActivity, feVar, null);
                        mVar2.K(objQ5);
                    }
                    p3.l0.e((e23.p) objQ5, unit, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
