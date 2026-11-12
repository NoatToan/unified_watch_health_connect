package y40;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
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
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f194406b;

    public /* synthetic */ f(h hVar, int i14) {
        this.f194405a = i14;
        this.f194406b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:50:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f194405a;
        final h hVar = this.f194406b;
        final int i15 = 2;
        Object[] objArr = 0;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                h.b bVar = h.f194409c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1712265529, new f(hVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                h.b bVar2 = h.f194409c;
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
                    e0.a aVar = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_view_details);
                    boolean zR = mVar2.r(hVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: y40.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (objArr2) {
                                    case 0:
                                        h hVar2 = hVar;
                                        h.a aVar3 = hVar2.f194410a;
                                        if (aVar3 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.d0();
                                        hVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        h hVar3 = hVar;
                                        h.a aVar4 = hVar3.f194410a;
                                        if (aVar4 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.V3();
                                        hVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        h hVar4 = hVar;
                                        h.a aVar5 = hVar4.f194410a;
                                        if (aVar5 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.x2();
                                        hVar4.dismiss();
                                        return Unit.INSTANCE;
                                    case 3:
                                        h hVar5 = hVar;
                                        h.a aVar6 = hVar5.f194410a;
                                        if (aVar6 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.w7();
                                        hVar5.dismiss();
                                        return Unit.INSTANCE;
                                    case 4:
                                        h hVar6 = hVar;
                                        h.a aVar7 = hVar6.f194410a;
                                        if (aVar7 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar7.b1();
                                        hVar6.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        h hVar7 = hVar;
                                        h.a aVar8 = hVar7.f194410a;
                                        if (aVar8 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar8.d();
                                        hVar7.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: y40.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr3) {
                                        case 0:
                                            h hVar2 = hVar;
                                            h.a aVar3 = hVar2.f194410a;
                                            if (aVar3 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.d0();
                                            hVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            h hVar3 = hVar;
                                            h.a aVar4 = hVar3.f194410a;
                                            if (aVar4 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.V3();
                                            hVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            h hVar4 = hVar;
                                            h.a aVar5 = hVar4.f194410a;
                                            if (aVar5 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.x2();
                                            hVar4.dismiss();
                                            return Unit.INSTANCE;
                                        case 3:
                                            h hVar5 = hVar;
                                            h.a aVar6 = hVar5.f194410a;
                                            if (aVar6 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.w7();
                                            hVar5.dismiss();
                                            return Unit.INSTANCE;
                                        case 4:
                                            h hVar6 = hVar;
                                            h.a aVar7 = hVar6.f194410a;
                                            if (aVar7 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar7.b1();
                                            hVar6.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            h hVar7 = hVar;
                                            h.a aVar8 = hVar7.f194410a;
                                            if (aVar8 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar8.d();
                                            hVar7.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ, mVar2, 0, 254);
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_courses_add_course_point);
                    boolean zR2 = mVar2.r(hVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: y40.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        h hVar2 = hVar;
                                        h.a aVar3 = hVar2.f194410a;
                                        if (aVar3 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.d0();
                                        hVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        h hVar3 = hVar;
                                        h.a aVar4 = hVar3.f194410a;
                                        if (aVar4 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.V3();
                                        hVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        h hVar4 = hVar;
                                        h.a aVar5 = hVar4.f194410a;
                                        if (aVar5 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.x2();
                                        hVar4.dismiss();
                                        return Unit.INSTANCE;
                                    case 3:
                                        h hVar5 = hVar;
                                        h.a aVar6 = hVar5.f194410a;
                                        if (aVar6 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.w7();
                                        hVar5.dismiss();
                                        return Unit.INSTANCE;
                                    case 4:
                                        h hVar6 = hVar;
                                        h.a aVar7 = hVar6.f194410a;
                                        if (aVar7 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar7.b1();
                                        hVar6.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        h hVar7 = hVar;
                                        h.a aVar8 = hVar7.f194410a;
                                        if (aVar8 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar8.d();
                                        hVar7.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: y40.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            h hVar2 = hVar;
                                            h.a aVar3 = hVar2.f194410a;
                                            if (aVar3 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.d0();
                                            hVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            h hVar3 = hVar;
                                            h.a aVar4 = hVar3.f194410a;
                                            if (aVar4 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.V3();
                                            hVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            h hVar4 = hVar;
                                            h.a aVar5 = hVar4.f194410a;
                                            if (aVar5 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.x2();
                                            hVar4.dismiss();
                                            return Unit.INSTANCE;
                                        case 3:
                                            h hVar5 = hVar;
                                            h.a aVar6 = hVar5.f194410a;
                                            if (aVar6 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.w7();
                                            hVar5.dismiss();
                                            return Unit.INSTANCE;
                                        case 4:
                                            h hVar6 = hVar;
                                            h.a aVar7 = hVar6.f194410a;
                                            if (aVar7 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar7.b1();
                                            hVar6.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            h hVar7 = hVar;
                                            h.a aVar8 = hVar7.f194410a;
                                            if (aVar8 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar8.d();
                                            hVar7.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    p2Var.g(strQ2, null, null, null, null, false, false, (e23.a) objQ2, mVar2, 0, 254);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_reverse_direction);
                    boolean z14 = hVar.f194411b != 1;
                    boolean zR3 = mVar2.r(hVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: y40.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        h hVar2 = hVar;
                                        h.a aVar3 = hVar2.f194410a;
                                        if (aVar3 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.d0();
                                        hVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        h hVar3 = hVar;
                                        h.a aVar4 = hVar3.f194410a;
                                        if (aVar4 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.V3();
                                        hVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        h hVar4 = hVar;
                                        h.a aVar5 = hVar4.f194410a;
                                        if (aVar5 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.x2();
                                        hVar4.dismiss();
                                        return Unit.INSTANCE;
                                    case 3:
                                        h hVar5 = hVar;
                                        h.a aVar6 = hVar5.f194410a;
                                        if (aVar6 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.w7();
                                        hVar5.dismiss();
                                        return Unit.INSTANCE;
                                    case 4:
                                        h hVar6 = hVar;
                                        h.a aVar7 = hVar6.f194410a;
                                        if (aVar7 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar7.b1();
                                        hVar6.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        h hVar7 = hVar;
                                        h.a aVar8 = hVar7.f194410a;
                                        if (aVar8 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar8.d();
                                        hVar7.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: y40.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            h hVar2 = hVar;
                                            h.a aVar3 = hVar2.f194410a;
                                            if (aVar3 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.d0();
                                            hVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            h hVar3 = hVar;
                                            h.a aVar4 = hVar3.f194410a;
                                            if (aVar4 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.V3();
                                            hVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            h hVar4 = hVar;
                                            h.a aVar5 = hVar4.f194410a;
                                            if (aVar5 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.x2();
                                            hVar4.dismiss();
                                            return Unit.INSTANCE;
                                        case 3:
                                            h hVar5 = hVar;
                                            h.a aVar6 = hVar5.f194410a;
                                            if (aVar6 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.w7();
                                            hVar5.dismiss();
                                            return Unit.INSTANCE;
                                        case 4:
                                            h hVar6 = hVar;
                                            h.a aVar7 = hVar6.f194410a;
                                            if (aVar7 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar7.b1();
                                            hVar6.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            h hVar7 = hVar;
                                            h.a aVar8 = hVar7.f194410a;
                                            if (aVar8 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar8.d();
                                            hVar7.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    p2Var.g(strQ3, null, null, null, null, z14, false, (e23.a) objQ3, mVar2, 0, 222);
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_out_and_back);
                    long j8 = hVar.f194411b;
                    boolean z15 = (j8 == 2 || j8 == 1) ? false : true;
                    boolean zR4 = mVar2.r(hVar);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        final int i17 = 3;
                        objQ4 = new e23.a() { // from class: y40.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        h hVar2 = hVar;
                                        h.a aVar3 = hVar2.f194410a;
                                        if (aVar3 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.d0();
                                        hVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        h hVar3 = hVar;
                                        h.a aVar4 = hVar3.f194410a;
                                        if (aVar4 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.V3();
                                        hVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        h hVar4 = hVar;
                                        h.a aVar5 = hVar4.f194410a;
                                        if (aVar5 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.x2();
                                        hVar4.dismiss();
                                        return Unit.INSTANCE;
                                    case 3:
                                        h hVar5 = hVar;
                                        h.a aVar6 = hVar5.f194410a;
                                        if (aVar6 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.w7();
                                        hVar5.dismiss();
                                        return Unit.INSTANCE;
                                    case 4:
                                        h hVar6 = hVar;
                                        h.a aVar7 = hVar6.f194410a;
                                        if (aVar7 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar7.b1();
                                        hVar6.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        h hVar7 = hVar;
                                        h.a aVar8 = hVar7.f194410a;
                                        if (aVar8 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar8.d();
                                        hVar7.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i18 = 3;
                            objQ4 = new e23.a() { // from class: y40.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            h hVar2 = hVar;
                                            h.a aVar3 = hVar2.f194410a;
                                            if (aVar3 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.d0();
                                            hVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            h hVar3 = hVar;
                                            h.a aVar4 = hVar3.f194410a;
                                            if (aVar4 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.V3();
                                            hVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            h hVar4 = hVar;
                                            h.a aVar5 = hVar4.f194410a;
                                            if (aVar5 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.x2();
                                            hVar4.dismiss();
                                            return Unit.INSTANCE;
                                        case 3:
                                            h hVar5 = hVar;
                                            h.a aVar6 = hVar5.f194410a;
                                            if (aVar6 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.w7();
                                            hVar5.dismiss();
                                            return Unit.INSTANCE;
                                        case 4:
                                            h hVar6 = hVar;
                                            h.a aVar7 = hVar6.f194410a;
                                            if (aVar7 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar7.b1();
                                            hVar6.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            h hVar7 = hVar;
                                            h.a aVar8 = hVar7.f194410a;
                                            if (aVar8 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar8.d();
                                            hVar7.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    p2Var.g(strQ4, null, null, null, null, z15, false, (e23.a) objQ4, mVar2, 0, 222);
                    String strQ5 = gl1.y.Q(mVar2, R.string.lbl_loop_to_start);
                    long j14 = hVar.f194411b;
                    boolean z16 = (j14 == 2 || j14 == 1) ? false : true;
                    boolean zR5 = mVar2.r(hVar);
                    Object objQ5 = mVar2.q();
                    if (zR5) {
                        final int i19 = 4;
                        objQ5 = new e23.a() { // from class: y40.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        h hVar2 = hVar;
                                        h.a aVar3 = hVar2.f194410a;
                                        if (aVar3 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.d0();
                                        hVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        h hVar3 = hVar;
                                        h.a aVar4 = hVar3.f194410a;
                                        if (aVar4 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.V3();
                                        hVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        h hVar4 = hVar;
                                        h.a aVar5 = hVar4.f194410a;
                                        if (aVar5 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.x2();
                                        hVar4.dismiss();
                                        return Unit.INSTANCE;
                                    case 3:
                                        h hVar5 = hVar;
                                        h.a aVar6 = hVar5.f194410a;
                                        if (aVar6 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.w7();
                                        hVar5.dismiss();
                                        return Unit.INSTANCE;
                                    case 4:
                                        h hVar6 = hVar;
                                        h.a aVar7 = hVar6.f194410a;
                                        if (aVar7 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar7.b1();
                                        hVar6.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        h hVar7 = hVar;
                                        h.a aVar8 = hVar7.f194410a;
                                        if (aVar8 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar8.d();
                                        hVar7.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            final int i110 = 4;
                            objQ5 = new e23.a() { // from class: y40.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i110) {
                                        case 0:
                                            h hVar2 = hVar;
                                            h.a aVar3 = hVar2.f194410a;
                                            if (aVar3 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.d0();
                                            hVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            h hVar3 = hVar;
                                            h.a aVar4 = hVar3.f194410a;
                                            if (aVar4 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.V3();
                                            hVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            h hVar4 = hVar;
                                            h.a aVar5 = hVar4.f194410a;
                                            if (aVar5 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.x2();
                                            hVar4.dismiss();
                                            return Unit.INSTANCE;
                                        case 3:
                                            h hVar5 = hVar;
                                            h.a aVar6 = hVar5.f194410a;
                                            if (aVar6 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.w7();
                                            hVar5.dismiss();
                                            return Unit.INSTANCE;
                                        case 4:
                                            h hVar6 = hVar;
                                            h.a aVar7 = hVar6.f194410a;
                                            if (aVar7 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar7.b1();
                                            hVar6.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            h hVar7 = hVar;
                                            h.a aVar8 = hVar7.f194410a;
                                            if (aVar8 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar8.d();
                                            hVar7.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ5);
                        }
                    }
                    p2Var.g(strQ5, null, null, null, null, z16, false, (e23.a) objQ5, mVar2, 0, 222);
                    String strQ6 = gl1.y.Q(mVar2, R.string.lbl_help);
                    boolean zR6 = mVar2.r(hVar);
                    Object objQ6 = mVar2.q();
                    if (zR6) {
                        final int i24 = 5;
                        objQ6 = new e23.a() { // from class: y40.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        h hVar2 = hVar;
                                        h.a aVar3 = hVar2.f194410a;
                                        if (aVar3 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.d0();
                                        hVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        h hVar3 = hVar;
                                        h.a aVar4 = hVar3.f194410a;
                                        if (aVar4 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.V3();
                                        hVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        h hVar4 = hVar;
                                        h.a aVar5 = hVar4.f194410a;
                                        if (aVar5 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.x2();
                                        hVar4.dismiss();
                                        return Unit.INSTANCE;
                                    case 3:
                                        h hVar5 = hVar;
                                        h.a aVar6 = hVar5.f194410a;
                                        if (aVar6 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.w7();
                                        hVar5.dismiss();
                                        return Unit.INSTANCE;
                                    case 4:
                                        h hVar6 = hVar;
                                        h.a aVar7 = hVar6.f194410a;
                                        if (aVar7 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar7.b1();
                                        hVar6.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        h hVar7 = hVar;
                                        h.a aVar8 = hVar7.f194410a;
                                        if (aVar8 == null) {
                                            s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar8.d();
                                        hVar7.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            final int i25 = 5;
                            objQ6 = new e23.a() { // from class: y40.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            h hVar2 = hVar;
                                            h.a aVar3 = hVar2.f194410a;
                                            if (aVar3 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.d0();
                                            hVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            h hVar3 = hVar;
                                            h.a aVar4 = hVar3.f194410a;
                                            if (aVar4 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.V3();
                                            hVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            h hVar4 = hVar;
                                            h.a aVar5 = hVar4.f194410a;
                                            if (aVar5 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.x2();
                                            hVar4.dismiss();
                                            return Unit.INSTANCE;
                                        case 3:
                                            h hVar5 = hVar;
                                            h.a aVar6 = hVar5.f194410a;
                                            if (aVar6 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.w7();
                                            hVar5.dismiss();
                                            return Unit.INSTANCE;
                                        case 4:
                                            h hVar6 = hVar;
                                            h.a aVar7 = hVar6.f194410a;
                                            if (aVar7 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar7.b1();
                                            hVar6.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            h hVar7 = hVar;
                                            h.a aVar8 = hVar7.f194410a;
                                            if (aVar8 == null) {
                                                s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar8.d();
                                            hVar7.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ6);
                        }
                    }
                    p2Var.g(strQ6, null, null, null, null, false, false, (e23.a) objQ6, mVar2, 0, 254);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
