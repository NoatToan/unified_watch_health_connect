package y40;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import h4.r;
import h5.e0;
import l72.p2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f194392b;

    public /* synthetic */ a(c cVar, int i14) {
        this.f194391a = i14;
        this.f194392b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f194391a;
        final c cVar = this.f194392b;
        Object[] objArr = 0;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c.a aVar = c.f194395c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1606408685, new a(cVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c.a aVar2 = c.f194395c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(rVarF, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
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
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_route_here);
                    boolean zR = mVar2.r(cVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: y40.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = objArr2;
                                c cVar2 = cVar;
                                switch (i16) {
                                    case 0:
                                        x40.k kVar2 = cVar2.f194396a;
                                        if (kVar2 != null) {
                                            CreateCustomCourseActivity createCustomCourseActivity = kVar2.f188708a;
                                            a50.c.z zVar = new a50.c.z(kVar2.f188709b, kVar2.f188710c);
                                            CreateCustomCourseActivity.a aVar5 = CreateCustomCourseActivity.f33013f;
                                            createCustomCourseActivity.ha(zVar);
                                        }
                                        cVar2.dismiss();
                                        break;
                                    default:
                                        x40.k kVar3 = cVar2.f194396a;
                                        if (kVar3 != null) {
                                            CreateCustomCourseActivity createCustomCourseActivity2 = kVar3.f188708a;
                                            a50.c.l lVar = new a50.c.l(kVar3.f188709b, kVar3.f188710c);
                                            CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                                            createCustomCourseActivity2.ha(lVar);
                                        }
                                        cVar2.dismiss();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: y40.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = objArr3;
                                    c cVar2 = cVar;
                                    switch (i16) {
                                        case 0:
                                            x40.k kVar2 = cVar2.f194396a;
                                            if (kVar2 != null) {
                                                CreateCustomCourseActivity createCustomCourseActivity = kVar2.f188708a;
                                                a50.c.z zVar = new a50.c.z(kVar2.f188709b, kVar2.f188710c);
                                                CreateCustomCourseActivity.a aVar5 = CreateCustomCourseActivity.f33013f;
                                                createCustomCourseActivity.ha(zVar);
                                            }
                                            cVar2.dismiss();
                                            break;
                                        default:
                                            x40.k kVar3 = cVar2.f194396a;
                                            if (kVar3 != null) {
                                                CreateCustomCourseActivity createCustomCourseActivity2 = kVar3.f188708a;
                                                a50.c.l lVar = new a50.c.l(kVar3.f188709b, kVar3.f188710c);
                                                CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                                                createCustomCourseActivity2.ha(lVar);
                                            }
                                            cVar2.dismiss();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ, mVar2, 0, 254);
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_insert_waypoint);
                    boolean zR2 = mVar2.r(cVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: y40.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = i15;
                                c cVar2 = cVar;
                                switch (i16) {
                                    case 0:
                                        x40.k kVar2 = cVar2.f194396a;
                                        if (kVar2 != null) {
                                            CreateCustomCourseActivity createCustomCourseActivity = kVar2.f188708a;
                                            a50.c.z zVar = new a50.c.z(kVar2.f188709b, kVar2.f188710c);
                                            CreateCustomCourseActivity.a aVar5 = CreateCustomCourseActivity.f33013f;
                                            createCustomCourseActivity.ha(zVar);
                                        }
                                        cVar2.dismiss();
                                        break;
                                    default:
                                        x40.k kVar3 = cVar2.f194396a;
                                        if (kVar3 != null) {
                                            CreateCustomCourseActivity createCustomCourseActivity2 = kVar3.f188708a;
                                            a50.c.l lVar = new a50.c.l(kVar3.f188709b, kVar3.f188710c);
                                            CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                                            createCustomCourseActivity2.ha(lVar);
                                        }
                                        cVar2.dismiss();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: y40.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    c cVar2 = cVar;
                                    switch (i16) {
                                        case 0:
                                            x40.k kVar2 = cVar2.f194396a;
                                            if (kVar2 != null) {
                                                CreateCustomCourseActivity createCustomCourseActivity = kVar2.f188708a;
                                                a50.c.z zVar = new a50.c.z(kVar2.f188709b, kVar2.f188710c);
                                                CreateCustomCourseActivity.a aVar5 = CreateCustomCourseActivity.f33013f;
                                                createCustomCourseActivity.ha(zVar);
                                            }
                                            cVar2.dismiss();
                                            break;
                                        default:
                                            x40.k kVar3 = cVar2.f194396a;
                                            if (kVar3 != null) {
                                                CreateCustomCourseActivity createCustomCourseActivity2 = kVar3.f188708a;
                                                a50.c.l lVar = new a50.c.l(kVar3.f188709b, kVar3.f188710c);
                                                CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                                                createCustomCourseActivity2.ha(lVar);
                                            }
                                            cVar2.dismiss();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    p2Var.g(strQ2, null, null, null, null, false, false, (e23.a) objQ2, mVar2, 0, 254);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
