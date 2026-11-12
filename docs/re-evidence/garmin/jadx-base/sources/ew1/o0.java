package ew1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f66630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f66631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f66632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f66633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f66634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f66635g;

    public /* synthetic */ o0(q0 q0Var, String str, String str2, p005kotlin.jvm.internal.r0 r0Var, p005kotlin.jvm.internal.r0 r0Var2, p005kotlin.jvm.internal.r0 r0Var3, int i14) {
        this.f66629a = i14;
        this.f66630b = q0Var;
        this.f66631c = str;
        this.f66632d = str2;
        this.f66633e = r0Var;
        this.f66634f = r0Var2;
        this.f66635g = r0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x015c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar;
        final p3.p1 p1Var;
        p3.n1 n1Var;
        final q0 q0Var;
        boolean z14;
        final int i14 = 0;
        final int i15 = 1;
        switch (this.f66629a) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                q0.a aVar = q0.f66666g;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-628580106, new o0(this.f66630b, this.f66631c, this.f66632d, this.f66633e, this.f66634f, this.f66635g, 1), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                q0.a aVar2 = q0.f66666g;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.p0.n(this.f66635g.f105810a);
                        mVar3.K(objQ);
                    }
                    final p3.p1 p1Var2 = (p3.p1) objQ;
                    Object objQ2 = mVar3.q();
                    final q0 q0Var2 = this.f66630b;
                    if (objQ2 == c2565a) {
                        p3.a2 a2Var = new p3.a2(q0Var2.w6().F1);
                        mVar3.K(a2Var);
                        objQ2 = a2Var;
                    }
                    p3.n1 n1Var2 = (p3.n1) objQ2;
                    if (((Boolean) q0Var2.f66670e.getF182175a()).booleanValue()) {
                        mVar3.C(27770750);
                        l72.c1 c1Var = l72.c1.f110940a;
                        String strQ = gl1.y.Q(mVar3, R.string.challenging_time_frame);
                        String strQ2 = gl1.y.Q(mVar3, R.string.end_date_too_soon);
                        String strQ3 = gl1.y.Q(mVar3, R.string.change_end_date);
                        String strQ4 = gl1.y.Q(mVar3, R.string.keep_my_date);
                        boolean zR = mVar3.r(q0Var2);
                        Object objQ3 = mVar3.q();
                        if (zR || objQ3 == c2565a) {
                            objQ3 = new e23.a() { // from class: ew1.p0
                                /* JADX WARN: Code duplicated, block: B:19:0x0044  */
                                /* JADX WARN: Code duplicated, block: B:21:0x0052  */
                                /* JADX WARN: Code duplicated, block: B:22:0x0060  */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i14;
                                    p3.p1 p1Var3 = p1Var2;
                                    q0 q0Var3 = q0Var2;
                                    switch (i16) {
                                        case 0:
                                            q0.a aVar3 = q0.f66666g;
                                            q0Var3.f66670e.setValue(Boolean.FALSE);
                                            p1Var3.setValue((LocalDate) q0Var3.f66669d.getValue());
                                            break;
                                        case 1:
                                            q0.a aVar4 = q0.f66666g;
                                            q0Var3.f66670e.setValue(Boolean.FALSE);
                                            q0Var3.y6((LocalDate) p1Var3.getF182175a());
                                            break;
                                        default:
                                            q0.a aVar5 = q0.f66666g;
                                            LocalDate localDate = (LocalDate) p1Var3.getF182175a();
                                            aw1.h hVarW6 = q0Var3.w6();
                                            if (!hVarW6.V6() || !hVarW6.b7() || !hVarW6.N6()) {
                                                aw1.h hVarW7 = q0Var3.w6();
                                                if (!hVarW7.V6() || !hVarW7.O6() || !hVarW7.N6() || !hVarW7.S6()) {
                                                    q0Var3.y6(localDate);
                                                } else if (localDate.isBefore((LocalDate) q0Var3.f66669d.getValue())) {
                                                    q0Var3.f66671f.f(true);
                                                    q0Var3.f66670e.setValue(Boolean.TRUE);
                                                } else {
                                                    q0Var3.y6(localDate);
                                                }
                                            } else if (localDate.isBefore((LocalDate) q0Var3.f66669d.getValue())) {
                                                q0Var3.f66671f.f(true);
                                                q0Var3.f66670e.setValue(Boolean.TRUE);
                                            } else {
                                                q0Var3.y6(localDate);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ3);
                        }
                        e23.a aVar3 = (e23.a) objQ3;
                        boolean zR2 = mVar3.r(q0Var2);
                        Object objQ4 = mVar3.q();
                        if (zR2 || objQ4 == c2565a) {
                            objQ4 = new e23.a() { // from class: ew1.p0
                                /* JADX WARN: Code duplicated, block: B:19:0x0044  */
                                /* JADX WARN: Code duplicated, block: B:21:0x0052  */
                                /* JADX WARN: Code duplicated, block: B:22:0x0060  */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    p3.p1 p1Var3 = p1Var2;
                                    q0 q0Var3 = q0Var2;
                                    switch (i16) {
                                        case 0:
                                            q0.a aVar4 = q0.f66666g;
                                            q0Var3.f66670e.setValue(Boolean.FALSE);
                                            p1Var3.setValue((LocalDate) q0Var3.f66669d.getValue());
                                            break;
                                        case 1:
                                            q0.a aVar5 = q0.f66666g;
                                            q0Var3.f66670e.setValue(Boolean.FALSE);
                                            q0Var3.y6((LocalDate) p1Var3.getF182175a());
                                            break;
                                        default:
                                            q0.a aVar6 = q0.f66666g;
                                            LocalDate localDate = (LocalDate) p1Var3.getF182175a();
                                            aw1.h hVarW6 = q0Var3.w6();
                                            if (!hVarW6.V6() || !hVarW6.b7() || !hVarW6.N6()) {
                                                aw1.h hVarW7 = q0Var3.w6();
                                                if (!hVarW7.V6() || !hVarW7.O6() || !hVarW7.N6() || !hVarW7.S6()) {
                                                    q0Var3.y6(localDate);
                                                } else if (localDate.isBefore((LocalDate) q0Var3.f66669d.getValue())) {
                                                    q0Var3.f66671f.f(true);
                                                    q0Var3.f66670e.setValue(Boolean.TRUE);
                                                } else {
                                                    q0Var3.y6(localDate);
                                                }
                                            } else if (localDate.isBefore((LocalDate) q0Var3.f66669d.getValue())) {
                                                q0Var3.f66671f.f(true);
                                                q0Var3.f66670e.setValue(Boolean.TRUE);
                                            } else {
                                                q0Var3.y6(localDate);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ4);
                        }
                        e23.a aVar4 = (e23.a) objQ4;
                        boolean zR3 = mVar3.r(q0Var2);
                        Object objQ5 = mVar3.q();
                        if (zR3 || objQ5 == c2565a) {
                            objQ5 = new n0(q0Var2, 2);
                            mVar3.K(objQ5);
                        }
                        e23.a aVar5 = (e23.a) objQ5;
                        p1Var = p1Var2;
                        q0Var = q0Var2;
                        n1Var = n1Var2;
                        c1Var.b(false, strQ, strQ2, strQ3, strQ4, null, false, aVar3, aVar4, null, aVar5, mVar3, 0, 0, 10137);
                        mVar = mVar3;
                        mVar.f();
                    } else {
                        mVar = mVar3;
                        p1Var = p1Var2;
                        n1Var = n1Var2;
                        q0Var = q0Var2;
                        mVar.C(28799020);
                        mVar.f();
                    }
                    LocalDate localDate = (LocalDate) this.f66633e.f105810a;
                    LocalDate localDate2 = (LocalDate) this.f66634f.f105810a;
                    LocalDate localDate3 = (LocalDate) q0Var.f66669d.getValue();
                    LocalDate localDate4 = (LocalDate) p1Var.getF182175a();
                    aw1.h hVarW6 = q0Var.w6();
                    Context contextRequireContext = q0Var.requireContext();
                    contextRequireContext.getClass();
                    tu1.i.a aVar6 = tu1.i.f166483a;
                    boolean zZ6 = hVarW6.Z6();
                    jv1.s sVarI6 = hVarW6.i6();
                    if (sVarI6 != null) {
                        vt1.o.a aVar7 = vt1.o.f180174e;
                        vt1.o oVar = sVarI6.f101125d;
                        aVar7.getClass();
                        if (oVar == null || !p13.x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVar)) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                    } else {
                        z14 = false;
                    }
                    aVar6.getClass();
                    i53.c cVarH = tu1.i.a.h(contextRequireContext, zZ6, z14);
                    int intValue = n1Var.getIntValue();
                    boolean zR4 = mVar.r(q0Var);
                    Object objQ6 = mVar.q();
                    if (zR4 || objQ6 == c2565a) {
                        objQ6 = new e52.b(7, q0Var, n1Var);
                        mVar.K(objQ6);
                    }
                    e23.l lVar = (e23.l) objQ6;
                    Object objQ7 = mVar.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new et1.b2(p1Var, 1);
                        mVar.K(objQ7);
                    }
                    e23.l lVar2 = (e23.l) objQ7;
                    boolean zR5 = mVar.r(q0Var);
                    Object objQ8 = mVar.q();
                    if (zR5 || objQ8 == c2565a) {
                        final int i16 = 2;
                        objQ8 = new e23.a() { // from class: ew1.p0
                            /* JADX WARN: Code duplicated, block: B:19:0x0044  */
                            /* JADX WARN: Code duplicated, block: B:21:0x0052  */
                            /* JADX WARN: Code duplicated, block: B:22:0x0060  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                p3.p1 p1Var3 = p1Var;
                                q0 q0Var3 = q0Var;
                                switch (i17) {
                                    case 0:
                                        q0.a aVar8 = q0.f66666g;
                                        q0Var3.f66670e.setValue(Boolean.FALSE);
                                        p1Var3.setValue((LocalDate) q0Var3.f66669d.getValue());
                                        break;
                                    case 1:
                                        q0.a aVar9 = q0.f66666g;
                                        q0Var3.f66670e.setValue(Boolean.FALSE);
                                        q0Var3.y6((LocalDate) p1Var3.getF182175a());
                                        break;
                                    default:
                                        q0.a aVar10 = q0.f66666g;
                                        LocalDate localDate5 = (LocalDate) p1Var3.getF182175a();
                                        aw1.h hVarW7 = q0Var3.w6();
                                        if (!hVarW7.V6() || !hVarW7.b7() || !hVarW7.N6()) {
                                            aw1.h hVarW8 = q0Var3.w6();
                                            if (!hVarW8.V6() || !hVarW8.O6() || !hVarW8.N6() || !hVarW8.S6()) {
                                                q0Var3.y6(localDate5);
                                            } else if (localDate5.isBefore((LocalDate) q0Var3.f66669d.getValue())) {
                                                q0Var3.f66671f.f(true);
                                                q0Var3.f66670e.setValue(Boolean.TRUE);
                                            } else {
                                                q0Var3.y6(localDate5);
                                            }
                                        } else if (localDate5.isBefore((LocalDate) q0Var3.f66669d.getValue())) {
                                            q0Var3.f66671f.f(true);
                                            q0Var3.f66670e.setValue(Boolean.TRUE);
                                        } else {
                                            q0Var3.y6(localDate5);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ8);
                    }
                    cw1.m0.a(null, this.f66631c, this.f66632d, localDate, localDate2, localDate3, localDate4, cVarH, intValue, lVar, lVar2, (e23.a) objQ8, !q0Var.w6().f13385r1, q0Var.w6().C5("FBTGoalDateSelectionFragmentCompose"), q0Var.w6().Y5(), mVar, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
