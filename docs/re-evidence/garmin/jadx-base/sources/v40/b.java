package v40;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import e23.p;
import h4.r;
import h5.e0;
import java.util.List;
import k30.k;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import tn2.s0;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f175543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f175544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f175545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f175546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f175547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f175548g;

    public /* synthetic */ b(k kVar, boolean z14, boolean z15, boolean z16, i iVar, d dVar, int i14) {
        this.f175542a = i14;
        this.f175543b = kVar;
        this.f175544c = z14;
        this.f175545d = z15;
        this.f175546e = z16;
        this.f175547f = iVar;
        this.f175548g = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List listK;
        switch (this.f175542a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d.a aVar = d.f175552h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(412059624, new b(this.f175543b, this.f175544c, this.f175545d, this.f175546e, this.f175547f, this.f175548g, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d.a aVar2 = d.f175552h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Object objQ = mVar2.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    k kVar = this.f175543b;
                    if (objQ == c2565a) {
                        objQ = p0.n(kVar);
                        mVar2.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(Boolean.valueOf(this.f175544c));
                        mVar2.K(objQ2);
                    }
                    final p1 p1Var2 = (p1) objQ2;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.valueOf(this.f175545d));
                        mVar2.K(objQ3);
                    }
                    final p1 p1Var3 = (p1) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = p0.n(Boolean.valueOf(this.f175546e));
                        mVar2.K(objQ4);
                    }
                    final p1 p1Var4 = (p1) objQ4;
                    r.a aVar3 = r.S;
                    j.f22691a.getClass();
                    j.k kVar2 = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    l.f(x2.h(aVar3, eVar.f97920e), mVar2);
                    k kVar3 = (k) p1Var.getF182175a();
                    k.f102555d.getClass();
                    i iVar = this.f175547f;
                    iVar.getClass();
                    if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).c()) {
                        listK = iVar.c() ? x.k(k.POPULARITY, k.FOLLOW_ROADS, k.MIN_ASCENT, k.FREE_FLOW, k.FREEHAND) : x.k(k.POPULARITY, k.FOLLOW_ROADS, k.MIN_ASCENT, k.FREEHAND);
                    } else {
                        listK = x.k(k.POPULARITY, k.FOLLOW_ROADS, k.FREEHAND);
                    }
                    i53.f fVarJ = i53.a.j(listK);
                    final d dVar = this.f175548g;
                    boolean zR = mVar2.r(dVar) | mVar2.k(kVar.ordinal());
                    Object objQ5 = mVar2.q();
                    if (zR || objQ5 == c2565a) {
                        objQ5 = new s0(p1Var, 11, dVar, kVar);
                        mVar2.K(objQ5);
                    }
                    e.a(kVar3, fVarJ, (e23.l) objQ5, mVar2, 0);
                    l.f(x2.h(aVar3, eVar.f97920e), mVar2);
                    if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                        mVar2.C(1248432694);
                        if (iVar.c()) {
                            mVar2.C(1248481984);
                            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                            boolean zBooleanValue3 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                            boolean zR2 = mVar2.r(dVar);
                            Object objQ6 = mVar2.q();
                            if (zR2 || objQ6 == c2565a) {
                                final int i14 = 0;
                                objQ6 = new e23.l() { // from class: v40.c
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        int i15 = i14;
                                        d dVar2 = dVar;
                                        p1 p1Var5 = p1Var2;
                                        Boolean bool = (Boolean) obj3;
                                        switch (i15) {
                                            case 0:
                                                boolean zBooleanValue4 = bool.booleanValue();
                                                d.a aVar5 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar = dVar2.f175553g;
                                                if (lVar != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity = lVar.f188713a;
                                                    a50.c.r0 r0Var = new a50.c.r0(zBooleanValue4);
                                                    CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity.ha(r0Var);
                                                }
                                                break;
                                            case 1:
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                d.a aVar7 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar2 = dVar2.f175553g;
                                                if (lVar2 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity2 = lVar2.f188713a;
                                                    a50.c.q0 q0Var = new a50.c.q0(zBooleanValue5);
                                                    CreateCustomCourseActivity.a aVar8 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity2.ha(q0Var);
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue6 = bool.booleanValue();
                                                d.a aVar9 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar3 = dVar2.f175553g;
                                                if (lVar3 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity3 = lVar3.f188713a;
                                                    a50.c.s0 s0Var = new a50.c.s0(zBooleanValue6);
                                                    CreateCustomCourseActivity.a aVar10 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity3.ha(s0Var);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ6);
                            }
                            e23.l lVar = (e23.l) objQ6;
                            boolean zR3 = mVar2.r(dVar);
                            Object objQ7 = mVar2.q();
                            if (zR3 || objQ7 == c2565a) {
                                final int i15 = 1;
                                objQ7 = new e23.l() { // from class: v40.c
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        int i16 = i15;
                                        d dVar2 = dVar;
                                        p1 p1Var5 = p1Var3;
                                        Boolean bool = (Boolean) obj3;
                                        switch (i16) {
                                            case 0:
                                                boolean zBooleanValue4 = bool.booleanValue();
                                                d.a aVar5 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar2 = dVar2.f175553g;
                                                if (lVar2 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity = lVar2.f188713a;
                                                    a50.c.r0 r0Var = new a50.c.r0(zBooleanValue4);
                                                    CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity.ha(r0Var);
                                                }
                                                break;
                                            case 1:
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                d.a aVar7 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar3 = dVar2.f175553g;
                                                if (lVar3 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity2 = lVar3.f188713a;
                                                    a50.c.q0 q0Var = new a50.c.q0(zBooleanValue5);
                                                    CreateCustomCourseActivity.a aVar8 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity2.ha(q0Var);
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue6 = bool.booleanValue();
                                                d.a aVar9 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar4 = dVar2.f175553g;
                                                if (lVar4 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity3 = lVar4.f188713a;
                                                    a50.c.s0 s0Var = new a50.c.s0(zBooleanValue6);
                                                    CreateCustomCourseActivity.a aVar10 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity3.ha(s0Var);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            }
                            e23.l lVar2 = (e23.l) objQ7;
                            boolean zR4 = mVar2.r(dVar);
                            Object objQ8 = mVar2.q();
                            if (zR4 || objQ8 == c2565a) {
                                final int i16 = 2;
                                objQ8 = new e23.l() { // from class: v40.c
                                    @Override // e23.l
                                    public final Object invoke(Object obj3) {
                                        int i17 = i16;
                                        d dVar2 = dVar;
                                        p1 p1Var5 = p1Var4;
                                        Boolean bool = (Boolean) obj3;
                                        switch (i17) {
                                            case 0:
                                                boolean zBooleanValue4 = bool.booleanValue();
                                                d.a aVar5 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar3 = dVar2.f175553g;
                                                if (lVar3 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity = lVar3.f188713a;
                                                    a50.c.r0 r0Var = new a50.c.r0(zBooleanValue4);
                                                    CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity.ha(r0Var);
                                                }
                                                break;
                                            case 1:
                                                boolean zBooleanValue5 = bool.booleanValue();
                                                d.a aVar7 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar4 = dVar2.f175553g;
                                                if (lVar4 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity2 = lVar4.f188713a;
                                                    a50.c.q0 q0Var = new a50.c.q0(zBooleanValue5);
                                                    CreateCustomCourseActivity.a aVar8 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity2.ha(q0Var);
                                                }
                                                break;
                                            default:
                                                boolean zBooleanValue6 = bool.booleanValue();
                                                d.a aVar9 = d.f175552h;
                                                p1Var5.setValue(bool);
                                                x40.l lVar5 = dVar2.f175553g;
                                                if (lVar5 != null) {
                                                    CreateCustomCourseActivity createCustomCourseActivity3 = lVar5.f188713a;
                                                    a50.c.s0 s0Var = new a50.c.s0(zBooleanValue6);
                                                    CreateCustomCourseActivity.a aVar10 = CreateCustomCourseActivity.f33013f;
                                                    createCustomCourseActivity3.ha(s0Var);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ8);
                            }
                            g.a(zBooleanValue, zBooleanValue2, zBooleanValue3, lVar, lVar2, (e23.l) objQ8, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(1249562148);
                            mVar2.f();
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(1249583972);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
