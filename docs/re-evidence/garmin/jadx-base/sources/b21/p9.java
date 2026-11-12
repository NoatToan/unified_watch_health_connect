package b21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import i3.fe;
import i3.mh;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p9 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15150d;

    public /* synthetic */ p9(Object obj, Object obj2, boolean z14, int i14) {
        this.f15147a = i14;
        this.f15149c = obj;
        this.f15150d = obj2;
        this.f15148b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0371  */
    /* JADX WARN: Code duplicated, block: B:13:0x0081  */
    /* JADX WARN: Code duplicated, block: B:146:0x0432  */
    /* JADX WARN: Code duplicated, block: B:205:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:219:0x0653  */
    /* JADX WARN: Code duplicated, block: B:245:0x0784  */
    /* JADX WARN: Code duplicated, block: B:310:0x0956  */
    /* JADX WARN: Code duplicated, block: B:315:0x0973  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:69:0x0268  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15;
        int i16;
        int i17;
        Object objC;
        int i18;
        int i19;
        Object obj4;
        float f14;
        float f15;
        String string;
        int i24 = this.f15147a;
        int i25 = 8;
        int i26 = 24;
        boolean z14 = this.f15148b;
        p3.m.a aVar = p3.m.f135153a;
        boolean z15 = false;
        Object obj5 = this.f15150d;
        Object obj6 = this.f15149c;
        final int i27 = 1;
        switch (i24) {
            case 0:
                final u21.j0 j0Var = (u21.j0) obj6;
                p3.p1 p1Var = (p3.p1) obj5;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    s21.u uVar = (s21.u) p1Var.getF182175a();
                    boolean zR = mVar.r(j0Var);
                    Object objQ = mVar.q();
                    if (zR) {
                        final int i28 = z15 ? 1 : 0;
                        objQ = new e23.l() { // from class: b21.x8
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i28) {
                                    case 0:
                                        l01.d dVar = (l01.d) obj7;
                                        dVar.getClass();
                                        r53.p2 p2Var = j0Var.f168016d;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s21.u.a((s21.u) value, false, false, null, null, null, dVar, null, 191)));
                                        String str = ((s21.u) p2Var.getValue()).f156181f.get(dVar.f107846c);
                                        do {
                                            value2 = p2Var.getValue();
                                        } while (!p2Var.b(value2, s21.u.a((s21.u) value2, false, false, str, str, null, null, null, 231)));
                                        break;
                                    default:
                                        String str2 = (String) obj7;
                                        str2.getClass();
                                        r53.p2 p2Var2 = j0Var.f168016d;
                                        do {
                                            value3 = p2Var2.getValue();
                                        } while (!p2Var2.b(value3, s21.u.a((s21.u) value3, false, false, str2, null, null, null, null, 247)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i29 = z15 ? 1 : 0;
                            objQ = new e23.l() { // from class: b21.x8
                                @Override // e23.l
                                public final Object invoke(Object obj7) {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i29) {
                                        case 0:
                                            l01.d dVar = (l01.d) obj7;
                                            dVar.getClass();
                                            r53.p2 p2Var = j0Var.f168016d;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s21.u.a((s21.u) value, false, false, null, null, null, dVar, null, 191)));
                                            String str = ((s21.u) p2Var.getValue()).f156181f.get(dVar.f107846c);
                                            do {
                                                value2 = p2Var.getValue();
                                            } while (!p2Var.b(value2, s21.u.a((s21.u) value2, false, false, str, str, null, null, null, 231)));
                                            break;
                                        default:
                                            String str2 = (String) obj7;
                                            str2.getClass();
                                            r53.p2 p2Var2 = j0Var.f168016d;
                                            do {
                                                value3 = p2Var2.getValue();
                                            } while (!p2Var2.b(value3, s21.u.a((s21.u) value3, false, false, str2, null, null, null, null, 247)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR2 = mVar.r(j0Var);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new e23.l() { // from class: b21.x8
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i27) {
                                    case 0:
                                        l01.d dVar = (l01.d) obj7;
                                        dVar.getClass();
                                        r53.p2 p2Var = j0Var.f168016d;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s21.u.a((s21.u) value, false, false, null, null, null, dVar, null, 191)));
                                        String str = ((s21.u) p2Var.getValue()).f156181f.get(dVar.f107846c);
                                        do {
                                            value2 = p2Var.getValue();
                                        } while (!p2Var.b(value2, s21.u.a((s21.u) value2, false, false, str, str, null, null, null, 231)));
                                        break;
                                    default:
                                        String str2 = (String) obj7;
                                        str2.getClass();
                                        r53.p2 p2Var2 = j0Var.f168016d;
                                        do {
                                            value3 = p2Var2.getValue();
                                        } while (!p2Var2.b(value3, s21.u.a((s21.u) value3, false, false, str2, null, null, null, null, 247)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.l() { // from class: b21.x8
                                @Override // e23.l
                                public final Object invoke(Object obj7) {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i27) {
                                        case 0:
                                            l01.d dVar = (l01.d) obj7;
                                            dVar.getClass();
                                            r53.p2 p2Var = j0Var.f168016d;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s21.u.a((s21.u) value, false, false, null, null, null, dVar, null, 191)));
                                            String str = ((s21.u) p2Var.getValue()).f156181f.get(dVar.f107846c);
                                            do {
                                                value2 = p2Var.getValue();
                                            } while (!p2Var.b(value2, s21.u.a((s21.u) value2, false, false, str, str, null, null, null, 231)));
                                            break;
                                        default:
                                            String str2 = (String) obj7;
                                            str2.getClass();
                                            r53.p2 p2Var2 = j0Var.f168016d;
                                            do {
                                                value3 = p2Var2.getValue();
                                            } while (!p2Var2.b(value3, s21.u.a((s21.u) value3, false, false, str2, null, null, null, null, 247)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        }
                    }
                    t21.w0.a(this.f15148b, uVar, lVar, (e23.l) objQ2, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ep.e eVar = (ep.e) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                Float f16 = (Float) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(f16) ? 4 : 2;
                }
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    if (f16 == null) {
                        mVar2.C(-1428514462);
                        mVar2.f();
                    } else {
                        mVar2.C(-1428514461);
                        int iFloatValue = (int) f16.floatValue();
                        m92.h0.e.a aVar2 = (m92.h0.e.a) p13.h0.e0(iFloatValue, eVar.f64812a);
                        ep.b bVar = (ep.b) p13.h0.e0(iFloatValue, eVar.f64813b);
                        boolean z16 = this.f15148b;
                        if (aVar2 != null && bVar != null) {
                            mVar2.C(-1755372072);
                            String str = (String) p13.h0.e0(iFloatValue, arrayList);
                            String str2 = str == null ? "" : str;
                            String strA = ep.f.a(aVar2.f117347b, z16);
                            String strA2 = ep.f.a(bVar.f64801a.f117347b, z16);
                            String strQ = gl1.y.Q(mVar2, R.string.lbl_this_activity);
                            String strB = c22.j0.b(bVar.f64802b, "MMM d, yyyy", null);
                            cr.x.c(str2, strA, strA2, strQ, strB == null ? "" : strB, eVar.f64814c, eVar.f64815d, z16, mVar2, 0);
                            mVar2.f();
                        } else if (aVar2 != null) {
                            mVar2.C(-1754305858);
                            String str3 = (String) p13.h0.e0(iFloatValue, arrayList);
                            cr.x.b(str3 == null ? "" : str3, ep.f.a(aVar2.f117347b, z16), gl1.y.Q(mVar2, R.string.lbl_this_activity), eVar.f64814c, z16, mVar2, 0);
                            mVar2.f();
                        } else if (bVar != null) {
                            mVar2.C(-1753736388);
                            String str4 = (String) p13.h0.e0(iFloatValue, arrayList);
                            String str5 = str4 == null ? "" : str4;
                            String strA3 = ep.f.a(bVar.f64801a.f117347b, z16);
                            String strB2 = c22.j0.b(bVar.f64802b, "MMM d, yyyy", null);
                            cr.x.b(str5, strA3, strB2 == null ? "" : strB2, eVar.f64815d, z16, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(-1753065889);
                            mVar2.f();
                        }
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ge2.b bVar2 = (ge2.b) obj6;
                p3.p1 p1Var2 = (p3.p1) obj5;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarB = u1.a2.b(aVar3, u1.a2.a(mVar3), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    p3.i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    p3.b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strQ2 = gl1.y.Q(mVar3, R.string.lbl_select_privacy_level);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97932i, mVar3);
                    long jB = d92.b.a(mVar3).c().b();
                    o4.m1.a aVar5 = o4.m1.f128891a;
                    h4.r rVarE = u1.n.e(aVar3, jB, aVar5);
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    mh.c(strQ2, c2.l.y(rVarE, eVar2.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 131068);
                    boolean zB = mVar3.B(p1Var2);
                    Object objQ3 = mVar3.q();
                    if (zB) {
                        objQ3 = new a11.m(p1Var2, i25);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new a11.m(p1Var2, i25);
                            mVar3.K(objQ3);
                        }
                    }
                    cv0.g.a(bVar2, z14, (e23.l) objQ3, mVar3, 0);
                    mh.c(gl1.y.Q(mVar3, R.string.lbl_recipients_will_be_notified), c2.l.y(u1.n.e(aVar3, d92.b.a(mVar3).c().b(), aVar5), eVar2.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131068);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.p pVar = (e23.p) obj6;
                pt1.p pVar2 = (pt1.p) obj5;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar4, R.string.lbl_send_to_device);
                    boolean zB2 = mVar4.B(pVar) | mVar4.B(pVar2);
                    Object objQ4 = mVar4.q();
                    if (zB2) {
                        objQ4 = new gp.f(5, pVar, pVar2);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new gp.f(5, pVar, pVar2);
                            mVar4.K(objQ4);
                        }
                    }
                    gt1.h.a(null, strQ3, R.drawable.send_to_device_wearable_icon, this.f15148b, true, false, (e23.a) objQ4, mVar4, 24576, 33);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.l lVar2 = (e23.l) obj6;
                pt1.p pVar3 = (pt1.p) obj5;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar5, R.string.trail_detail_customize_trail);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = v62.f2.a(t62.b.f162798a);
                    boolean zB3 = mVar5.B(lVar2) | mVar5.B(pVar3);
                    Object objQ5 = mVar5.q();
                    if (zB3) {
                        objQ5 = new gt1.m(lVar2, pVar3, 1);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new gt1.m(lVar2, pVar3, 1);
                            mVar5.K(objQ5);
                        }
                    }
                    gt1.h.b(null, strQ4, dVarA, this.f15148b, false, false, (e23.a) objQ5, mVar5, 0, 49);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                f5.b1 b1Var = (f5.b1) obj;
                f5.y0 y0Var = (f5.y0) obj2;
                g6.a aVar6 = (g6.a) obj3;
                long j8 = aVar6.f75988a;
                int i30 = i3.h6.f88295a;
                int iG = g6.b.g(((p3.n1) obj6).getIntValue(), j8);
                long j14 = aVar6.f75988a;
                int iF = g6.b.f(((p3.n1) obj5).getIntValue(), j14);
                int iL = z14 ? iG : g6.a.l(j14);
                if (!z14) {
                    iG = g6.a.j(j14);
                }
                f5.v1 v1VarQ = y0Var.Q(g6.a.c(iL, iG, 0, iF, 4, aVar6.f75988a));
                return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 12));
            case 6:
                Context context = (Context) obj6;
                ic1.i iVar = (ic1.i) obj5;
                h82.r rVar = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ic1.i.a aVar7 = ic1.i.f92620g;
                rVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    if (z14) {
                        i14 = -335950651;
                        i15 = R.string.onboarding_pulse_ox_tracking_jpn;
                    } else {
                        i14 = -335948639;
                        i15 = R.string.onboarding_pulse_ox_tracking;
                    }
                    String strH = sn.a.h(mVar6, i14, i15, mVar6);
                    int i34 = (iIntValue6 << 6) & 896;
                    rVar.E(strH, mVar6, i34);
                    if (z14) {
                        i16 = -335945507;
                        i17 = R.string.pulse_ox_sleep_help1_jpn;
                    } else {
                        i16 = -335943751;
                        i17 = R.string.pulse_ox_sleep_help1;
                    }
                    rVar.m(i34, 2, sn.a.h(mVar6, i16, i17, mVar6), null, mVar6);
                    rVar.c(mVar6, iIntValue6 & 14);
                    int i35 = ((iIntValue6 << 3) & 112) | 6;
                    rVar.j(z3.f.c(-182475693, new ic1.f(context, rVar, z14, iVar), mVar6), mVar6, i35);
                    rVar.j(z3.f.c(-860648452, new am.i1(rVar, z14, context, 19), mVar6), mVar6, i35);
                    rVar.j(z3.f.c(-1897658853, new ic1.f(rVar, z14, context, iVar), mVar6), mVar6, i35);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                sy0.d dVar = (sy0.d) obj6;
                l22.a aVar8 = (l22.a) obj5;
                c2.t2 t2Var = (c2.t2) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(t2Var) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    if (dVar != null) {
                        i53.d<String, am.i2> dVar2 = dVar.f161208b;
                        ky0.d2 d2Var = ky0.d2.f107276a;
                        ls.e eVar3 = ls.e.TOTAL_DISTANCE;
                        d2Var.getClass();
                        am.i2 i2Var = dVar2.get(ky0.d2.a(eVar3));
                        if (i2Var != null) {
                            objC = ky0.d2.c(eVar3, i2Var);
                        } else {
                            objC = null;
                        }
                    } else {
                        objC = null;
                    }
                    String strB3 = ss.k.b(ls.e.TOTAL_DISTANCE, aVar8, objC, 16);
                    if (strB3 == null) {
                        strB3 = sn.a.h(mVar7, -1267574718, R.string.no_value, mVar7);
                    } else {
                        mVar7.C(-1267577663);
                        mVar7.f();
                    }
                    String str6 = strB3;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String strQ5 = gl1.y.Q(mVar7, R.string.lbl_distance);
                    if (z14) {
                        i18 = -1267569156;
                        i19 = R.string.f28709km;
                    } else {
                        i18 = -1267568100;
                        i19 = R.string.f28711mi;
                    }
                    x0Var.f((iIntValue7 & 14) | (l72.x0.f111348c << 24), 116, null, t2Var, null, null, str6, strQ5, sn.a.h(mVar7, i18, i19, mVar7), null, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                p006l2.f3 f3Var = (p006l2.f3) obj6;
                p3.c2 c2Var = f3Var.f108485f;
                a2.j jVar = (a2.j) obj5;
                p3.m mVar8 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                mVar8.C(-2137546592);
                p3.x1 x1Var8 = p3.n.f135158a;
                boolean z17 = ((p008y1.b2) c2Var.getF182175a()) == p008y1.b2.Vertical || !(mVar8.A(kotlin.t1.f91496n) == g6.o.Rtl);
                boolean zB4 = mVar8.B(f3Var);
                Object objQ6 = mVar8.q();
                if (zB4) {
                    obj4 = objQ6;
                    kp2.a aVar9 = new kp2.a(f3Var, 5);
                    mVar8.K(aVar9);
                    obj4 = aVar9;
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        obj4 = objQ6;
                        kp2.a aVar10 = new kp2.a(f3Var, 5);
                        mVar8.K(aVar10);
                        obj4 = aVar10;
                    }
                }
                obj4 = objQ6;
                p3.p1 p1VarQ = p3.p0.q((e23.l) obj4, mVar8);
                Object objQ7 = mVar8.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ7 == c2565a) {
                    p008y1.c0 c0Var = new p008y1.c0(new xq1.c(p1VarQ, 3));
                    mVar8.K(c0Var);
                    objQ7 = c0Var;
                }
                p008y1.e3 e3Var = (p008y1.e3) objQ7;
                boolean zB5 = mVar8.B(e3Var) | mVar8.B(f3Var);
                Object objQ8 = mVar8.q();
                if (zB5 || objQ8 == c2565a) {
                    objQ8 = new p006l2.e3(e3Var, f3Var);
                    mVar8.K(objQ8);
                }
                h4.r rVarB2 = p008y1.t2.b(h4.r.S, (p006l2.e3) objQ8, (p008y1.b2) c2Var.getF182175a(), z14 && f3Var.f108481b.getFloatValue() != 0.0f, z17, jVar, SyslogConstants.LOG_LOCAL4);
                mVar8.f();
                return rVarB2;
            case 9:
                m21.e eVar4 = (m21.e) obj6;
                e23.l lVar3 = (e23.l) obj5;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar9.n(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    if (eVar4.b()) {
                        mVar9.C(-1479171914);
                        List<b11.l> list = eVar4.f116100q;
                        b11.l lVar4 = eVar4.f116101r;
                        Long lValueOf = lVar4 != null ? Long.valueOf(lVar4.f14331a) : null;
                        h4.r.a aVar11 = h4.r.S;
                        if (z14) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f14 = j92.b.f97899b.f97920e;
                        } else {
                            f14 = 0;
                            g6.f.a aVar12 = g6.f.f75994b;
                        }
                        float f17 = f14;
                        if (z14) {
                            f15 = 0;
                            g6.f.a aVar13 = g6.f.f75994b;
                        } else {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f15 = j92.b.f97899b.f97920e;
                        }
                        y01.l.a(c2.l.C(aVar11, 0.0f, f17, 0.0f, f15, 5), list, lValueOf, lVar3, mVar9, 0, 0);
                        mVar9.f();
                    } else {
                        mVar9.C(-1478405191);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                a2.j jVar2 = (a2.j) obj6;
                e23.a aVar14 = (e23.a) obj5;
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                l72.s sVar = l72.s.f111232a;
                rVar2.getClass();
                mVar10.C(318163426);
                p3.x1 x1Var10 = p3.n.f135158a;
                i3.gb gbVarA = i3.fb.a(0.0f, 6, 0L, true);
                boolean zB6 = mVar10.B(aVar14);
                Object objQ9 = mVar10.q();
                if (zB6) {
                    objQ9 = new ku1.a(aVar14, 28);
                    mVar10.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new ku1.a(aVar14, 28);
                        mVar10.K(objQ9);
                    }
                }
                h4.r rVarB3 = u1.w.b(rVar2, jVar2, gbVarA, this.f15148b, null, null, (e23.a) objQ9, 24);
                mVar10.f();
                return rVarB3;
            case 11:
                String str7 = (String) obj6;
                e23.a aVar15 = (e23.a) obj5;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c2.t2) obj).getClass();
                if (mVar11.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    String upperCase = str7.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarE = d92.c.e(j92.f.f97933j);
                    long jE = ds.e0.e(mVar11);
                    boolean z18 = this.f15148b;
                    long jC = o4.d0.c(z18 ? 1.0f : 0.5f, jE, 14);
                    g6.f.a aVar16 = g6.f.f75994b;
                    h4.r rVarC2 = c2.l.C(h4.r.S, 0.0f, 0.0f, 16, 0.0f, 11);
                    boolean zB7 = mVar11.B(aVar15);
                    Object objQ10 = mVar11.q();
                    if (zB7) {
                        objQ10 = new l72.t(aVar15, 8);
                        mVar11.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new l72.t(aVar15, 8);
                            mVar11.K(objQ10);
                        }
                    }
                    mh.c(upperCase, u1.w.d(rVarC2, z18, null, null, (e23.a) objQ10, 14), jC, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, mVar11, 0, 0, 131064);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                l22.b bVar4 = ((y30.a) obj6).f194362a;
                ClimbDTO climbDTO = (ClimbDTO) obj5;
                c2.t2 t2Var2 = (c2.t2) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar12.B(t2Var2) ? 4 : 2;
                }
                if (mVar12.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    boolean z19 = this.f15148b;
                    String strQ6 = gl1.y.Q(mVar12, z19 ? R.string.lbl_km : R.string.lbl_mile);
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    double distance = climbDTO.getDistance();
                    if (zf.b.D(Double.valueOf(distance))) {
                        c22.m3 m3Var = z19 ? c22.m3.KILOMETER : c22.m3.MILE;
                        c22.l3.a aVar17 = c22.l3.f23124b;
                        DecimalFormat decimalFormat = c22.l3.f23125c;
                        aVar17.getClass();
                        string = c22.l3.a.R(bVar4, distance, m3Var, decimalFormat, false, null);
                    } else {
                        string = bVar4.getString(R.string.no_value);
                    }
                    String str8 = string;
                    String strQ7 = gl1.y.Q(mVar12, R.string.lbl_distance);
                    int i36 = (iIntValue10 & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i36, 116, null, t2Var2, null, null, str8, strQ7, strQ6, null, mVar12);
                    c22.l3.a aVar18 = c22.l3.f23124b;
                    p3.y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context2 = (Context) mVar12.A(y3Var);
                    double elevationGain = climbDTO.getElevationGain();
                    aVar18.getClass();
                    x0Var2.a(i36, 116, null, t2Var2, null, null, c22.l3.a.c0(context2, elevationGain, z19, false, false), gl1.y.Q(mVar12, R.string.lbl_total_ascent), c22.l3.a.H1((Context) mVar12.A(y3Var), z19), null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                l90.k kVar2 = (l90.k) obj6;
                e23.l lVar5 = (e23.l) obj5;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    l72.p2 p2Var = l72.p2.f111205a;
                    String str9 = kVar2.f111582f.f111521f;
                    z3.e eVarC = z3.f.c(807462069, new s5.a(kVar2, i26), mVar13);
                    z3.e eVarC2 = z3.f.c(-1925262060, new ap2.f(z14, kVar2, 21), mVar13);
                    boolean zB8 = mVar13.B(lVar5) | mVar13.r(kVar2);
                    Object objQ11 = mVar13.q();
                    if (zB8) {
                        objQ11 = new s70.j1(29, lVar5, kVar2);
                        mVar13.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new s70.j1(29, lVar5, kVar2);
                            mVar13.K(objQ11);
                        }
                    }
                    p2Var.g(str9, null, null, eVarC, eVarC2, false, false, (e23.a) objQ11, mVar13, 27648, 230);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p9(Object obj, boolean z14, Object obj2, int i14) {
        this.f15147a = i14;
        this.f15149c = obj;
        this.f15148b = z14;
        this.f15150d = obj2;
    }

    public /* synthetic */ p9(boolean z14, Object obj, Object obj2, int i14) {
        this.f15147a = i14;
        this.f15148b = z14;
        this.f15149c = obj;
        this.f15150d = obj2;
    }
}
