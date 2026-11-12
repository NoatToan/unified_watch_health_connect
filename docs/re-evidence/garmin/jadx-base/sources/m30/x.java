package m30;

import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f116411b;

    public /* synthetic */ x(z zVar, int i14) {
        this.f116410a = i14;
        this.f116411b = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x012c  */
    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f116410a;
        final z zVar = this.f116411b;
        final int i15 = 2;
        Object[] objArr = 0;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                z.b bVar = z.f116414c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-653834179, new x(zVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                z.b bVar2 = z.f116414c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar2);
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
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_view_details);
                    boolean zR = mVar2.r(zVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: m30.y
                            @Override // e23.a
                            public final Object invoke() {
                                switch (objArr2) {
                                    case 0:
                                        z zVar2 = zVar;
                                        z.a aVar3 = zVar2.f116415a;
                                        if (aVar3 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.L5();
                                        zVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        z zVar3 = zVar;
                                        z.a aVar4 = zVar3.f116415a;
                                        if (aVar4 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.b2();
                                        zVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        z zVar4 = zVar;
                                        z.a aVar5 = zVar4.f116415a;
                                        if (aVar5 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.Y1();
                                        zVar4.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        z zVar5 = zVar;
                                        z.a aVar6 = zVar5.f116415a;
                                        if (aVar6 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.d();
                                        zVar5.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: m30.y
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (objArr3) {
                                        case 0:
                                            z zVar2 = zVar;
                                            z.a aVar3 = zVar2.f116415a;
                                            if (aVar3 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.L5();
                                            zVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            z zVar3 = zVar;
                                            z.a aVar4 = zVar3.f116415a;
                                            if (aVar4 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.b2();
                                            zVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            z zVar4 = zVar;
                                            z.a aVar5 = zVar4.f116415a;
                                            if (aVar5 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.Y1();
                                            zVar4.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            z zVar5 = zVar;
                                            z.a aVar6 = zVar5.f116415a;
                                            if (aVar6 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.d();
                                            zVar5.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ, mVar2, 0, 254);
                    if (zVar.f116416b) {
                        mVar2.C(233236635);
                        mVar2.f();
                    } else {
                        mVar2.C(232934881);
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_re_route);
                        boolean zR2 = mVar2.r(zVar);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: m30.y
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            z zVar2 = zVar;
                                            z.a aVar3 = zVar2.f116415a;
                                            if (aVar3 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.L5();
                                            zVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            z zVar3 = zVar;
                                            z.a aVar4 = zVar3.f116415a;
                                            if (aVar4 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.b2();
                                            zVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            z zVar4 = zVar;
                                            z.a aVar5 = zVar4.f116415a;
                                            if (aVar5 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.Y1();
                                            zVar4.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            z zVar5 = zVar;
                                            z.a aVar6 = zVar5.f116415a;
                                            if (aVar6 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.d();
                                            zVar5.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: m30.y
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i16) {
                                            case 0:
                                                z zVar2 = zVar;
                                                z.a aVar3 = zVar2.f116415a;
                                                if (aVar3 == null) {
                                                    p005kotlin.jvm.internal.s.m("actionsListener");
                                                    throw null;
                                                }
                                                aVar3.L5();
                                                zVar2.dismiss();
                                                return Unit.INSTANCE;
                                            case 1:
                                                z zVar3 = zVar;
                                                z.a aVar4 = zVar3.f116415a;
                                                if (aVar4 == null) {
                                                    p005kotlin.jvm.internal.s.m("actionsListener");
                                                    throw null;
                                                }
                                                aVar4.b2();
                                                zVar3.dismiss();
                                                return Unit.INSTANCE;
                                            case 2:
                                                z zVar4 = zVar;
                                                z.a aVar5 = zVar4.f116415a;
                                                if (aVar5 == null) {
                                                    p005kotlin.jvm.internal.s.m("actionsListener");
                                                    throw null;
                                                }
                                                aVar5.Y1();
                                                zVar4.dismiss();
                                                return Unit.INSTANCE;
                                            default:
                                                z zVar5 = zVar;
                                                z.a aVar6 = zVar5.f116415a;
                                                if (aVar6 == null) {
                                                    p005kotlin.jvm.internal.s.m("actionsListener");
                                                    throw null;
                                                }
                                                aVar6.d();
                                                zVar5.dismiss();
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                mVar2.K(objQ2);
                            }
                        }
                        p2Var.g(strQ2, null, null, null, null, false, false, (e23.a) objQ2, mVar2, 0, 254);
                        mVar2.f();
                    }
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_courses_add_course_point);
                    boolean zR3 = mVar2.r(zVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: m30.y
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        z zVar2 = zVar;
                                        z.a aVar3 = zVar2.f116415a;
                                        if (aVar3 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.L5();
                                        zVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        z zVar3 = zVar;
                                        z.a aVar4 = zVar3.f116415a;
                                        if (aVar4 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.b2();
                                        zVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        z zVar4 = zVar;
                                        z.a aVar5 = zVar4.f116415a;
                                        if (aVar5 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.Y1();
                                        zVar4.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        z zVar5 = zVar;
                                        z.a aVar6 = zVar5.f116415a;
                                        if (aVar6 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.d();
                                        zVar5.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: m30.y
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            z zVar2 = zVar;
                                            z.a aVar3 = zVar2.f116415a;
                                            if (aVar3 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.L5();
                                            zVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            z zVar3 = zVar;
                                            z.a aVar4 = zVar3.f116415a;
                                            if (aVar4 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.b2();
                                            zVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            z zVar4 = zVar;
                                            z.a aVar5 = zVar4.f116415a;
                                            if (aVar5 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.Y1();
                                            zVar4.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            z zVar5 = zVar;
                                            z.a aVar6 = zVar5.f116415a;
                                            if (aVar6 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.d();
                                            zVar5.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    p2Var.g(strQ3, null, null, null, null, false, false, (e23.a) objQ3, mVar2, 0, 254);
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_help);
                    boolean zR4 = mVar2.r(zVar);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        final int i17 = 3;
                        objQ4 = new e23.a() { // from class: m30.y
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        z zVar2 = zVar;
                                        z.a aVar3 = zVar2.f116415a;
                                        if (aVar3 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar3.L5();
                                        zVar2.dismiss();
                                        return Unit.INSTANCE;
                                    case 1:
                                        z zVar3 = zVar;
                                        z.a aVar4 = zVar3.f116415a;
                                        if (aVar4 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar4.b2();
                                        zVar3.dismiss();
                                        return Unit.INSTANCE;
                                    case 2:
                                        z zVar4 = zVar;
                                        z.a aVar5 = zVar4.f116415a;
                                        if (aVar5 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar5.Y1();
                                        zVar4.dismiss();
                                        return Unit.INSTANCE;
                                    default:
                                        z zVar5 = zVar;
                                        z.a aVar6 = zVar5.f116415a;
                                        if (aVar6 == null) {
                                            p005kotlin.jvm.internal.s.m("actionsListener");
                                            throw null;
                                        }
                                        aVar6.d();
                                        zVar5.dismiss();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i18 = 3;
                            objQ4 = new e23.a() { // from class: m30.y
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            z zVar2 = zVar;
                                            z.a aVar3 = zVar2.f116415a;
                                            if (aVar3 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar3.L5();
                                            zVar2.dismiss();
                                            return Unit.INSTANCE;
                                        case 1:
                                            z zVar3 = zVar;
                                            z.a aVar4 = zVar3.f116415a;
                                            if (aVar4 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar4.b2();
                                            zVar3.dismiss();
                                            return Unit.INSTANCE;
                                        case 2:
                                            z zVar4 = zVar;
                                            z.a aVar5 = zVar4.f116415a;
                                            if (aVar5 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar5.Y1();
                                            zVar4.dismiss();
                                            return Unit.INSTANCE;
                                        default:
                                            z zVar5 = zVar;
                                            z.a aVar6 = zVar5.f116415a;
                                            if (aVar6 == null) {
                                                p005kotlin.jvm.internal.s.m("actionsListener");
                                                throw null;
                                            }
                                            aVar6.d();
                                            zVar5.dismiss();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    p2Var.g(strQ4, null, null, null, null, false, false, (e23.a) objQ4, mVar2, 0, 254);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
