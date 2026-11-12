package b82;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.text.format.DateFormat;
import b21.a5;
import b21.d7;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightActivity;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import i3.d6;
import i3.e5;
import i3.mc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l72.i3;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.x3;
import r1.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16661h;

    public /* synthetic */ l0(e23.a aVar, p3.p1 p1Var, lc.m0 m0Var, Context context, e23.a aVar2, c.q qVar, Long l14) {
        this.f16654a = 9;
        this.f16655b = aVar;
        this.f16658e = p1Var;
        this.f16656c = m0Var;
        this.f16657d = context;
        this.f16659f = aVar2;
        this.f16660g = qVar;
        this.f16661h = l14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj) {
        tn2.r0 r0Var = (tn2.r0) this.f16655b;
        String str = (String) this.f16657d;
        String str2 = (String) this.f16658e;
        String str3 = (String) this.f16659f;
        String str4 = (String) this.f16660g;
        e23.l lVar = (e23.l) this.f16656c;
        String str5 = (String) this.f16661h;
        c83.a0 a0Var = (c83.a0) obj;
        Logger logger = tn2.r0.f165631n;
        a0Var.getClass();
        T t7 = a0Var.f25746b;
        t7.getClass();
        pn2.p pVar = (pn2.p) t7;
        rn2.d dVar = (rn2.d) pVar.d();
        String recoveryType = dVar != null ? dVar.getRecoveryType() : null;
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k(recoveryType, r0Var, str5);
        int i14 = w03.b.f181178a;
        z03.o oVar = new z03.o(new z03.d(kVar), new tn2.k0(new a5(a0Var, r0Var, str2, str4, pVar, recoveryType, str3, lVar, 11), 29));
        pn2.a.f138690a.getClass();
        return oVar.c(new tn2.r0.c(r0Var, str2, str3, pn2.a.e().f138762b, str4, new tn2.l0(r0Var, str2, str4, recoveryType, str3, lVar, 3), new tn2.n0(r0Var, 2), lVar).c(a0Var, str));
    }

    private final Object b(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f16660g;
        p3.p1 p1Var = (p3.p1) this.f16658e;
        Context context = (Context) this.f16655b;
        AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) this.f16656c;
        x3 x3Var = (x3) this.f16657d;
        p3.p1 p1Var2 = (p3.p1) this.f16659f;
        p3.p1 p1Var3 = (p3.p1) this.f16661h;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        p1Var.setValue(bool);
        if (zBooleanValue) {
            ge1.b.T(b0Var, null, null, new yy1.t(context, addTIEventViewModel, x3Var, p1Var2, null), 3);
            yy1.v.e(p1Var3, false);
        } else {
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.TRAINING_INITIATIVE;
            aVar.getClass();
            i2.a.f(a2Var, "TILocationScreen", "Location permission not granted");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:270:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:271:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a88  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.github.mikephil.chartingv2.data.Entry, java.lang.Object] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        x5.l0 l0Var;
        double d14;
        String strG;
        String strI4;
        double dDoubleValue;
        double dDoubleValue2;
        Object obj2;
        String str;
        float f14;
        LineChart lineChart;
        int i14 = this.f16654a;
        int i15 = 10;
        int i16 = 6;
        int i17 = 3;
        Object obj3 = this.f16658e;
        Object obj4 = this.f16661h;
        Object obj5 = this.f16660g;
        Object obj6 = this.f16656c;
        Object obj7 = this.f16659f;
        Object obj8 = this.f16657d;
        Object obj9 = this.f16655b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj9;
                e23.l lVar = (e23.l) obj6;
                e23.l lVar2 = (e23.l) obj8;
                p3.p1 p1Var = (p3.p1) obj3;
                o53.b0 b0Var = (o53.b0) obj5;
                p3.p1 p1Var2 = (p3.p1) obj7;
                i2.a aVar = (i2.a) obj4;
                x5.l0 l0Var2 = (x5.l0) obj;
                t0 t0Var = t0.f16792a;
                l0Var2.getClass();
                if ((num == null || (l0Var2.f188878a.f157138b.length() <= num.intValue() && num.intValue() > 0)) && (l0Var = (x5.l0) lVar.invoke(l0Var2)) != null) {
                    lVar2.invoke(l0Var.f188878a.f157138b);
                    p1Var.setValue(l0Var);
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        ge1.b.T(b0Var, null, null, new t0.d(aVar, null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                c50.f fVar = (c50.f) obj9;
                lc.m0 m0Var = (lc.m0) obj6;
                ca0.o1 o1Var = (ca0.o1) obj8;
                e23.a aVar2 = (e23.a) obj3;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                c63.n nVar = new c63.n(24);
                c63.n nVar2 = new c63.n(25);
                c63.n nVar3 = new c63.n(26);
                c63.n nVar4 = new c63.n(27);
                z3.e eVar = new z3.e(536595470, true, new a42.d0((Object) fVar, (Object) m0Var, (Object) o1Var, aVar2, 4));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var2.b(ca0.j.b.class), k0Var2, j0Var, nVar, nVar2, nVar3, nVar4, eVar);
                ca0.j.Companion.getClass();
                nc.n.a(k0Var, t0Var2.b(ca0.j.c.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(g90.a.class), new ca0.i(n63.b.f123892d))), j0Var, null, null, null, null, new z3.e(1481360887, true, new ca0.e((ca0.u0) obj7, o1Var, (e23.a) obj5, m0Var, fVar, (e23.a) obj4, aVar2)));
                return Unit.INSTANCE;
            case 2:
                ca0.s1 s1Var = (ca0.s1) obj9;
                ca0.o0 o0Var = (ca0.o0) obj8;
                lc.m0 m0Var2 = (lc.m0) obj3;
                final e23.l lVar3 = (e23.l) obj6;
                final aa2.f fVar2 = (aa2.f) obj5;
                lc.k0 k0Var3 = (lc.k0) obj;
                k0Var3.getClass();
                ca0.n1.Companion.getClass();
                Map mapA = ca0.n1.a.a();
                z3.e eVar2 = new z3.e(-2064667945, true, new aa2.r(s1Var, i15, o0Var, m0Var2));
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.b.class), mapA, j0Var2, null, null, null, null, eVar2);
                ge1.b.U(k0Var3, t0Var3.b(ca0.n1.c.class), ca0.n1.d.INSTANCE, ca0.n1.a.a(), new am.e1(o0Var, (d7) obj7, m0Var2, lVar3, s1Var, 6));
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.f.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(1163071296, true, new ca0.k1(s1Var, o0Var, m0Var2, lVar3)));
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.j.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(2033892895, true, new a42.d0(fVar2, (ca0.o1) obj4, m0Var2, false, lVar3, 7)));
                final int i18 = 0;
                final int i19 = 1;
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.l.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(-1390252802, true, new e23.r() { // from class: ca0.l1
                    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00ac  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0043  */
                    @Override // e23.r
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                        int i24 = i18;
                        p3.m.a aVar3 = p3.m.f135153a;
                        aa2.f fVar3 = fVar2;
                        r1.l lVar4 = (r1.l) obj10;
                        lc.v vVar = (lc.v) obj11;
                        p3.m mVar = (p3.m) obj12;
                        ((Integer) obj13).getClass();
                        switch (i24) {
                            case 0:
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                n1.l lVar5 = (n1.l) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(n1.l.class));
                                boolean zB = mVar.B(fVar3) | mVar.r(lVar5);
                                Object objQ = mVar.q();
                                if (zB) {
                                    objQ = new j1(0, fVar3, lVar5);
                                    mVar.K(objQ);
                                } else {
                                    aVar3.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new j1(0, fVar3, lVar5);
                                        mVar.K(objQ);
                                    }
                                }
                                c.w.a(0, 1, (e23.a) objQ, mVar, false);
                                q90.c cVar = lVar5.f26378a;
                                String str2 = lVar5.f26379b;
                                boolean zR = mVar.r(lVar5) | mVar.B(fVar3);
                                Object objQ2 = mVar.q();
                                if (zR) {
                                    objQ2 = new bp.h(21, lVar5, fVar3);
                                    mVar.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new bp.h(21, lVar5, fVar3);
                                        mVar.K(objQ2);
                                    }
                                }
                                ya0.h0.c(cVar, str2, (e23.l) objQ2, lVar3, mVar, 0);
                                break;
                            default:
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                n1.k kVar = (n1.k) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(n1.k.class));
                                boolean zB2 = mVar.B(fVar3) | mVar.r(kVar);
                                Object objQ3 = mVar.q();
                                if (zB2) {
                                    objQ3 = new j1(1, fVar3, kVar);
                                    mVar.K(objQ3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new j1(1, fVar3, kVar);
                                        mVar.K(objQ3);
                                    }
                                }
                                c.w.a(0, 1, (e23.a) objQ3, mVar, false);
                                q90.c cVar2 = kVar.f26374a;
                                String str3 = kVar.f26375b;
                                boolean zR2 = mVar.r(kVar) | mVar.B(fVar3);
                                Object objQ4 = mVar.q();
                                if (zR2) {
                                    objQ4 = new bp.h(22, kVar, fVar3);
                                    mVar.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new bp.h(22, kVar, fVar3);
                                        mVar.K(objQ4);
                                    }
                                }
                                ya0.h0.b(cVar2, str3, (e23.l) objQ4, lVar3, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.k.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(-519431203, true, new e23.r() { // from class: ca0.l1
                    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x00ac  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0043  */
                    @Override // e23.r
                    public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                        int i24 = i19;
                        p3.m.a aVar3 = p3.m.f135153a;
                        aa2.f fVar3 = fVar2;
                        r1.l lVar4 = (r1.l) obj10;
                        lc.v vVar = (lc.v) obj11;
                        p3.m mVar = (p3.m) obj12;
                        ((Integer) obj13).getClass();
                        switch (i24) {
                            case 0:
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var = p3.n.f135158a;
                                n1.l lVar5 = (n1.l) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(n1.l.class));
                                boolean zB = mVar.B(fVar3) | mVar.r(lVar5);
                                Object objQ = mVar.q();
                                if (zB) {
                                    objQ = new j1(0, fVar3, lVar5);
                                    mVar.K(objQ);
                                } else {
                                    aVar3.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new j1(0, fVar3, lVar5);
                                        mVar.K(objQ);
                                    }
                                }
                                c.w.a(0, 1, (e23.a) objQ, mVar, false);
                                q90.c cVar = lVar5.f26378a;
                                String str2 = lVar5.f26379b;
                                boolean zR = mVar.r(lVar5) | mVar.B(fVar3);
                                Object objQ2 = mVar.q();
                                if (zR) {
                                    objQ2 = new bp.h(21, lVar5, fVar3);
                                    mVar.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new bp.h(21, lVar5, fVar3);
                                        mVar.K(objQ2);
                                    }
                                }
                                ya0.h0.c(cVar, str2, (e23.l) objQ2, lVar3, mVar, 0);
                                break;
                            default:
                                lVar4.getClass();
                                vVar.getClass();
                                p3.x1 x1Var2 = p3.n.f135158a;
                                n1.k kVar = (n1.k) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(n1.k.class));
                                boolean zB2 = mVar.B(fVar3) | mVar.r(kVar);
                                Object objQ3 = mVar.q();
                                if (zB2) {
                                    objQ3 = new j1(1, fVar3, kVar);
                                    mVar.K(objQ3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new j1(1, fVar3, kVar);
                                        mVar.K(objQ3);
                                    }
                                }
                                c.w.a(0, 1, (e23.a) objQ3, mVar, false);
                                q90.c cVar2 = kVar.f26374a;
                                String str3 = kVar.f26375b;
                                boolean zR2 = mVar.r(kVar) | mVar.B(fVar3);
                                Object objQ4 = mVar.q();
                                if (zR2) {
                                    objQ4 = new bp.h(22, kVar, fVar3);
                                    mVar.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new bp.h(22, kVar, fVar3);
                                        mVar.K(objQ4);
                                    }
                                }
                                ya0.h0.b(cVar2, str3, (e23.l) objQ4, lVar3, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.h.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(351390396, true, new ca0.k1(o0Var, s1Var, m0Var2, lVar3)));
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.i.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(1222211995, true, new ao1.f(i16, o0Var, lVar3)));
                nc.n.a(k0Var3, t0Var3.b(ca0.n1.g.class), ca0.n1.a.a(), j0Var2, null, null, null, null, new z3.e(2093033594, true, new aa2.r(m0Var2, 11, o0Var, lVar3)));
                return Unit.INSTANCE;
            case 3:
                bt1.u uVar = (bt1.u) obj9;
                bt1.u uVar2 = (bt1.u) obj6;
                p3.p1 p1Var3 = (p3.p1) obj3;
                f4.s sVar = (f4.s) obj8;
                f4.s sVar2 = (f4.s) obj7;
                f4.s sVar3 = (f4.s) obj5;
                f4.s sVar4 = (f4.s) obj4;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "menu_item_reset_all")) {
                    uVar.g(uVar.f21148a, true, null);
                    uVar2.g(uVar2.f21148a, true, null);
                    p1Var3.setValue(Boolean.TRUE);
                    sVar.clear();
                    sVar2.clear();
                    sVar3.clear();
                    sVar4.clear();
                }
                return Unit.INSTANCE;
            case 4:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj9;
                gz1.a aVar3 = (gz1.a) obj6;
                p3.p1 p1Var4 = (p3.p1) obj3;
                Context context = (Context) obj8;
                p3.p1 p1Var5 = (p3.p1) obj7;
                p3.p1 p1Var6 = (p3.p1) obj5;
                p3.p1 p1Var7 = (p3.p1) obj4;
                t0.a aVar4 = (t0.a) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                aVar4.getClass();
                int i24 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.C0890b.f45999a[aVar4.ordinal()];
                if (i24 != 1) {
                    if (i24 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    if (zf.b.D(aVar3.f80417j)) {
                        p1Var6.setValue(og0.a.i(og0.a.f131967a, aVar3.f80417j.doubleValue()));
                    }
                    bVar.F6().E.k(null, gz1.a.a(aVar3, null, null, null, null, (String) p1Var6.getF182175a(), null, null, null, 0L, null, null, 0.0d, 0L, 8175));
                } else if (g22.n.d((String) p1Var6.getF182175a())) {
                    bg0.a.f17827a.getClass();
                    gg0.i iVarD = bg0.a.C0255a.d();
                    Context contextRequireContext = bVar.requireContext();
                    contextRequireContext.getClass();
                    String strC = iVarD.c(contextRequireContext);
                    p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                    lz1.f.a aVar6 = lz1.f.f115404a;
                    double dA = c22.b1.a((String) p1Var6.getF182175a());
                    aVar6.getClass();
                    String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(lz1.f.a.o(dA, 2))}, 1));
                    Double d15 = aVar3.f80417j;
                    Double d16 = aVar3.f80415h;
                    if (Double.parseDouble(d53.u.v(str2, ",", ".", false)) == 0.0d) {
                        p1Var7.setValue(Boolean.TRUE);
                        gg0.i iVarD2 = bg0.a.C0255a.d();
                        Context contextRequireContext2 = bVar.requireContext();
                        contextRequireContext2.getClass();
                        String string = bVar.getString(R.string.goal_distance_min_error, "0", iVarD2.a(contextRequireContext2));
                        string.getClass();
                        p1Var4.setValue(string);
                        p1Var5.setValue(Boolean.FALSE);
                        d14 = 0.0d;
                    } else {
                        d14 = 0.0d;
                        double dA2 = c22.b1.a(str2);
                        if (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.G6(dA2, bg0.a.C0255a.e())) {
                            p1Var4.setValue(bVar.E6(context));
                            p1Var7.setValue(Boolean.FALSE);
                            p1Var5.setValue(Boolean.TRUE);
                            og0.a aVar7 = og0.a.f131967a;
                            gg0.i iVar = bVar.f45997b ? gg0.i.KILOMETER : gg0.i.MILE;
                            aVar7.getClass();
                            double dG = og0.a.g(dA2, iVar);
                            Double dValueOf = Double.valueOf(dG);
                            if (bVar.F6().C4()) {
                                bVar.F6();
                                strI4 = fz1.k.I4(context, d16 != null ? d16.doubleValue() : 0.0d, dG);
                                d15 = dValueOf;
                                strG = null;
                            } else {
                                String strB = og0.a.b(d16 != null ? d16.doubleValue() : 0.0d, dG);
                                Context contextRequireContext3 = bVar.requireContext();
                                contextRequireContext3.getClass();
                                strG = e5.g(strB, StringUtils.SPACE, bg0.a.C0255a.b(contextRequireContext3));
                                d15 = dValueOf;
                                strI4 = null;
                            }
                        } else {
                            p1Var4.setValue(bVar.C6(context));
                            p1Var7.setValue(Boolean.TRUE);
                            p1Var5.setValue(Boolean.FALSE);
                        }
                        p1Var6.setValue(str2 + StringUtils.SPACE + strC);
                        fz1.k kVarF6 = bVar.F6();
                        String str3 = (String) p1Var6.getF182175a();
                        if (d15 != null) {
                            dDoubleValue = d15.doubleValue();
                        } else {
                            dDoubleValue = d14;
                        }
                        if (d16 != null) {
                            dDoubleValue2 = d16.doubleValue();
                        } else {
                            dDoubleValue2 = d14;
                        }
                        kVarF6.E.k(null, gz1.a.a(aVar3, null, null, null, null, str3, strI4, strG, null, 0L, d15, null, dDoubleValue / dDoubleValue2, 0L, 5519));
                    }
                    strG = "";
                    strI4 = null;
                    p1Var6.setValue(str2 + StringUtils.SPACE + strC);
                    fz1.k kVarF7 = bVar.F6();
                    String str4 = (String) p1Var6.getF182175a();
                    if (d15 != null) {
                        dDoubleValue = d15.doubleValue();
                    } else {
                        dDoubleValue = d14;
                    }
                    if (d16 != null) {
                        dDoubleValue2 = d16.doubleValue();
                    } else {
                        dDoubleValue2 = d14;
                    }
                    kVarF7.E.k(null, gz1.a.a(aVar3, null, null, null, null, str4, strI4, strG, null, 0L, d15, null, dDoubleValue / dDoubleValue2, 0L, 5519));
                } else {
                    bVar.F6().E.k(null, gz1.a.a(aVar3, null, null, null, null, "", null, null, null, 0L, Double.valueOf(0.0d), null, 0.0d, 0L, 7663));
                }
                return Unit.INSTANCE;
            case 5:
                mi0.f.c cVar = (mi0.f.c) obj9;
                zc.d dVar = (zc.d) obj6;
                li0.f fVar3 = (li0.f) obj8;
                c.q qVar = (c.q) obj3;
                gi0.a aVar8 = (gi0.a) obj7;
                Context context2 = (Context) obj5;
                li0.f fVar4 = (li0.f) obj4;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                ii0.d.f93571a.getClass();
                e2.f0.b(f0Var, null, ii0.d.f93572b, 3);
                Integer num2 = cVar.f118785a;
                if ((num2 != null && num2.intValue() == 1) || (num2 != null && num2.intValue() == 2)) {
                    e2.f0.b(f0Var, null, ii0.d.f93573c, 3);
                    List<li0.d0> list = cVar.f118786b;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            e2.f0.b(f0Var, null, new z3.e(617243415, true, new hv0.d(5, (li0.d0) it.next(), fVar3)), 3);
                        }
                    }
                    if (dVar.b() > 0) {
                        ii0.d.f93571a.getClass();
                        e2.f0.b(f0Var, null, ii0.d.f93574d, 3);
                    }
                } else {
                    j23.l lVar4 = new j23.l(3, Integer.MAX_VALUE);
                    if (num2 == null || !lVar4.d(num2.intValue())) {
                        e2.f0.b(f0Var, null, ii0.d.f93576f, 3);
                    } else {
                        e2.f0.b(f0Var, null, new z3.e(2142372015, true, new fb0.b(cVar, qVar, aVar8, context2, 12)), 3);
                        e2.f0.b(f0Var, null, ii0.d.f93575e, 3);
                    }
                }
                e2.f0.f(f0Var, dVar.b(), new zc.a(new ig2.d(6), dVar), new z3.e(1813947388, true, new ii0.v(dVar, fVar4, 0)), 4);
                return Unit.INSTANCE;
            case 6:
                li0.f fVar5 = (li0.f) obj8;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                boolean zBooleanValue = ((Boolean) ((x3) obj7).getF182175a()).booleanValue();
                Boolean bool = (Boolean) ((p3.p1) obj3).getF182175a();
                bool.booleanValue();
                p003ji0.o.a(f0Var2, (zc.d) obj9, zBooleanValue, (u2.h) obj6, fVar5, bool, new gw1.d((zc.d) obj5, 19, fVar5, (String) obj4));
                return Unit.INSTANCE;
            case 7:
                u4.d dVar2 = (u4.d) obj9;
                String str5 = (String) obj6;
                String str6 = (String) obj8;
                String str7 = (String) obj3;
                e23.a aVar9 = (e23.a) obj7;
                e23.a aVar10 = (e23.a) obj5;
                e23.a aVar11 = (e23.a) obj4;
                p5.k0 k0Var4 = (p5.k0) obj;
                k0Var4.getClass();
                q13.b bVarB = p13.w.b();
                if (dVar2 != null && str5 != null) {
                    bVarB.add(new p5.g(str5, new ii0.h(aVar9, 11)));
                }
                if (str6 != null) {
                    bVarB.add(new p5.g(str6, new ii0.h(aVar10, 12)));
                }
                if (str7 != null) {
                    bVarB.add(new p5.g(str7, new ii0.h(aVar11, 13)));
                }
                p5.h0.p(k0Var4, p13.w.a(bVarB));
                return Unit.INSTANCE;
            case 8:
                o53.b0 b0Var2 = (o53.b0) obj5;
                p3.p1 p1Var8 = (p3.p1) obj3;
                km1.v vVar = (km1.v) obj9;
                sm1.s sVar5 = (sm1.s) obj6;
                DateTime dateTime = (DateTime) obj8;
                mc mcVar = (mc) obj4;
                p3.p1 p1Var9 = (p3.p1) obj7;
                if (((Boolean) obj).booleanValue()) {
                    ge1.b.T(b0Var2, null, null, new in1.f.b(mcVar, null), 3);
                    sn.a.o(f12.l.f68084a, true);
                    p1Var9.setValue(Boolean.TRUE);
                    p1Var8.setValue(vVar);
                    sVar5.f160192l.i(new o82.a(g22.k.z(dateTime).b(), null, 2, null), true);
                }
                return Unit.INSTANCE;
            case 9:
                e23.a aVar12 = (e23.a) obj9;
                p3.p1 p1Var10 = (p3.p1) obj3;
                lc.m0 m0Var3 = (lc.m0) obj6;
                Context context3 = (Context) obj8;
                c.q qVar2 = (c.q) obj5;
                Long l14 = (Long) obj4;
                lc.k0 k0Var5 = (lc.k0) obj;
                k0Var5.getClass();
                k62.j jVar = new k62.j(m0Var3, 0);
                k62.j jVar2 = new k62.j(m0Var3, 1);
                gp.h hVar = new gp.h((e23.a) obj7, context3);
                aVar12.getClass();
                z3.e eVar3 = new z3.e(1657740684, true, new a42.d0(aVar12, (Object) jVar, (Object) jVar2, (e23.a) hVar, 25));
                p13.k0 k0Var6 = p13.k0.f134949a;
                k0Var6.getClass();
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var5, t0Var4.b(k62.n.class), k0Var6, j0Var3, null, null, null, null, eVar3);
                nc.n.a(k0Var5, t0Var4.b(k62.m.class), k0Var6, j0Var3, null, null, null, null, new z3.e(937196553, true, new ca0.r(aVar12, i17)));
                k62.k kVar = new k62.k(qVar2, 0, context3, l14);
                fv0.d dVar3 = new fv0.d(qVar2, context3, 5);
                d6 d6Var = new d6(qVar2, 26, context3, l14);
                p1Var10.getClass();
                nc.n.a(k0Var5, t0Var4.b(k62.o.class), k0Var6, j0Var3, null, null, null, null, new z3.e(1829684860, true, new a42.c0(p1Var10, aVar12, kVar, dVar3, d6Var)));
                return Unit.INSTANCE;
            case 10:
                n82.f fVar6 = (n82.f) obj9;
                b63.o oVar = (b63.o) obj7;
                b63.o oVar2 = (b63.o) obj5;
                b63.o oVar3 = (b63.o) obj4;
                e23.l lVar5 = (e23.l) obj6;
                o82.g gVar = (o82.g) ((i53.f) obj8).get(((Integer) obj).intValue());
                fVar6.d(gVar);
                fVar6.f(p005kotlin.jvm.internal.s.g((ry0.m) obj3, ry0.m.a.f155176a) ? new o82.a(gVar.f130862a.b(oVar, oVar2), oVar2) : ky0.i0.b(oVar, oVar3, fVar6.f124961b.a()));
                lVar5.invoke(gVar);
                return Unit.INSTANCE;
            case 11:
                nj2.a aVar13 = (nj2.a) obj9;
                x3 x3Var = (x3) obj6;
                p3.p1 p1Var11 = (p3.p1) obj3;
                p3.p1 p1Var12 = (p3.p1) obj7;
                p3.p1 p1Var13 = (p3.p1) obj8;
                p3.p1 p1Var14 = (p3.p1) obj5;
                p3.p1 p1Var15 = (p3.p1) obj4;
                String str8 = (String) obj;
                androidx.lifecycle.y0<List<fj2.i>> y0Var = aVar13.f126272z;
                List<fj2.i> list2 = p13.j0.f134944a;
                y0Var.m(list2);
                nj2.a.b bVar2 = nj2.a.b.COUNTY_OR_DISTRICT;
                aVar13.L4(bVar2, false);
                lj2.f.i(p1Var11, false);
                nj2.a.b bVar3 = nj2.a.b.CITY;
                aVar13.L4(bVar3, false);
                aVar13.y4(bVar2);
                aVar13.y4(bVar3);
                if (str8 != null) {
                    aVar13.O4(nj2.a.b.STATE_OR_PROVINCE, str8);
                    p1Var12.setValue(str8);
                }
                ge1.b.T(androidx.lifecycle.v1.a(aVar13), null, null, new nj2.k(aVar13, null), 3);
                List<fj2.i> list3 = (List) aVar13.f126268v.d();
                if (list3 != null) {
                    list2 = list3;
                }
                p1Var13.setValue(list2);
                p1Var14.setValue("---");
                p1Var15.setValue("---");
                if (((List) p1Var13.getF182175a()).isEmpty()) {
                    p1Var11.setValue(Boolean.TRUE);
                    aVar13.L4(bVar3, true);
                } else {
                    aVar13.L4(bVar2, true);
                }
                Iterator it3 = ((Iterable) x3Var.getF182175a()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        if (p005kotlin.jvm.internal.s.g(((o13.p) next).f128594a, str8)) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                o13.p pVar = (o13.p) obj2;
                if (pVar != null && (str = (String) pVar.f128595b) != null) {
                    aVar13.Q4(nj2.a.b.STATE_OR_PROVINCE, str);
                }
                return Unit.INSTANCE;
            case 12:
                p1.o0 o0Var2 = (p1.o0) obj9;
                nc.e eVar4 = (nc.e) obj7;
                e23.l lVar6 = (e23.l) obj6;
                e23.l lVar7 = (e23.l) obj8;
                e23.l lVar8 = (e23.l) obj5;
                p3.p1 p1Var16 = (p3.p1) obj3;
                r1.n nVar5 = (r1.n) obj;
                if (!((List) ((x3) obj4).getF182175a()).contains(nVar5.c())) {
                    r1.u1.f149287a.getClass();
                    r1.v1 v1Var = r1.u1.f149288b;
                    r1.w1.f149304a.getClass();
                    return r1.b.c(v1Var, r1.w1.f149305b);
                }
                String str9 = ((lc.v) nVar5.c()).f111886f;
                int iA = o0Var2.a(str9);
                if (iA >= 0) {
                    f14 = o0Var2.f134864c[iA];
                } else {
                    o0Var2.f(str9, 0.0f);
                    f14 = 0.0f;
                }
                if (!p005kotlin.jvm.internal.s.g(((lc.v) nVar5.f()).f111886f, ((lc.v) nVar5.c()).f111886f)) {
                    f14 = (((Boolean) eVar4.f125265c.getF182175a()).booleanValue() || ((Boolean) p1Var16.getF182175a()).booleanValue()) ? f14 - 1.0f : f14 + 1.0f;
                }
                o0Var2.f(((lc.v) nVar5.f()).f111886f, f14);
                return new r1.l0((r1.u1) lVar6.invoke(nVar5), (r1.w1) lVar7.invoke(nVar5), f14, (j2) lVar8.invoke(nVar5));
            case 13:
                i53.c cVar2 = (i53.c) obj9;
                i53.f fVar7 = (i53.f) obj6;
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar4 = (com.garmin.android.apps.connectmobile.activities.manual.eventType.b) obj8;
                Context context4 = (Context) obj5;
                p3.p1 p1Var17 = (p3.p1) obj3;
                p3.p1 p1Var18 = (p3.p1) obj7;
                p3.p1 p1Var19 = (p3.p1) obj4;
                e2.f0 f0Var3 = (e2.f0) obj;
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar14 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                f0Var3.getClass();
                ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<E> it4 = cVar2.iterator();
                while (it4.hasNext()) {
                    e2.f0.b(f0Var3, null, new z3.e(-198379384, true, new bv0.e((qs.g) it4.next(), fVar7, bVar4, context4, p1Var17, p1Var18, p1Var19, 5)), 3);
                    arrayList.add(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 14:
                Map map = (Map) obj6;
                fy0.e eVar5 = (fy0.e) obj8;
                Set set = (Set) obj5;
                Set set2 = (Set) obj4;
                p3.p1 p1Var20 = (p3.p1) obj3;
                p3.p1 p1Var21 = (p3.p1) obj7;
                e2.f0 f0Var4 = (e2.f0) obj;
                f0Var4.getClass();
                for (sy0.p pVar2 : (i53.f) obj9) {
                    String str10 = pVar2.f161272a;
                    b63.o oVar4 = pVar2.f161273b;
                    i53.c<sy0.q> cVar3 = pVar2.f161274c;
                    cy0.l lVar9 = pVar2.f161275d;
                    if (str10 != null) {
                        e2.f0.b(f0Var4, null, new z3.e(-882405330, true, new a11.l(lVar9, oVar4, map, str10, cVar3, eVar5, set, set2, p1Var20, p1Var21)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 15:
                q42.y yVar = (q42.y) obj6;
                Context context5 = (Context) obj8;
                c.q qVar3 = (c.q) obj3;
                e23.a aVar15 = (e23.a) obj7;
                o53.b0 b0Var3 = (o53.b0) obj5;
                mc mcVar2 = (mc) obj4;
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                LocalDate localDateH = g22.l.h(((n82.f) obj9).b().f130843a);
                String str11 = i3Var2.f111063a;
                switch (str11.hashCode()) {
                    case -1964133237:
                        if (str11.equals("MENU_ITEM_KILOGRAMS_ID")) {
                            yVar.x4(0);
                        }
                        break;
                    case -1831822152:
                        if (str11.equals("MENU_ITEM_ADD_WEIGHT_ID")) {
                            AddWeightActivity.f48007c.getClass();
                            qVar3.a(AddWeightActivity.a.a(context5, localDateH), null);
                        }
                        break;
                    case -612137216:
                        if (str11.equals("MENU_ITEM_STONES_ID")) {
                            yVar.x4(2);
                        }
                        break;
                    case 188049246:
                        if (str11.equals("MENU_ITEM_EDIT_GOAL_ID")) {
                            aVar15.invoke();
                        }
                        break;
                    case 1420273063:
                        if (str11.equals("MENU_ITEM_POUNDS_ID")) {
                            yVar.x4(1);
                        }
                        break;
                    case 1442674829:
                        if (str11.equals("MENU_ITEM_HELP_ID")) {
                            ot.c cVar4 = new ot.c(context5, 6);
                            yVar.getClass();
                            ed0.a.d(new q42.c0(cVar4));
                        }
                        break;
                    case 1537090426:
                        if (str11.equals("MENU_ITEM_DELETE_WEIGHT_ID")) {
                            k42.b.f102880a.getClass();
                            if (k42.b.r()) {
                                ge1.b.T(b0Var3, null, null, new q42.x.c(mcVar2, null), 3);
                            } else {
                                yVar.A4(null);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            case 16:
                x3 x3Var2 = (x3) obj9;
                x3 x3Var3 = (x3) obj6;
                p3.p1 p1Var22 = (p3.p1) obj3;
                i53.d dVar4 = (i53.d) obj8;
                p3.p1 p1Var23 = (p3.p1) obj7;
                p3.p1 p1Var24 = (p3.p1) obj5;
                p3.p1 p1Var25 = (p3.p1) obj4;
                e2.f0 f0Var5 = (e2.f0) obj;
                f0Var5.getClass();
                if (!((i53.c) x3Var2.getF182175a()).isEmpty()) {
                    List list4 = (List) x3Var2.getF182175a();
                    f0Var5.a(list4.size(), new qk0.r.e(new qc.c(9), list4), new qk0.r.f(qk0.r.d.f145133a, list4), new z3.e(802480018, true, new qk0.r.g(list4, dVar4, p1Var23, p1Var24, p1Var25)));
                } else if (((Boolean) x3Var3.getF182175a()).booleanValue() || p13.h0.L((Iterable) p1Var22.getF182175a())) {
                    qk0.b.f145078a.getClass();
                    e2.f0.b(f0Var5, null, qk0.b.f145079b, 3);
                } else {
                    qk0.b.f145078a.getClass();
                    e2.f0.b(f0Var5, null, qk0.b.f145080c, 3);
                }
                return Unit.INSTANCE;
            case 17:
                pr0.e eVar6 = (pr0.e) obj9;
                pr0.d dVar5 = (pr0.d) obj8;
                hz.b bVar5 = (hz.b) obj3;
                hz.f fVar8 = (hz.f) obj7;
                ArrayList arrayList2 = (ArrayList) obj5;
                List<gs1.k> list5 = (List) obj4;
                BaseLineChart baseLineChart = (BaseLineChart) obj;
                baseLineChart.getClass();
                eVar6.l(baseLineChart);
                baseLineChart.setMarkerView(new pr0.i((Context) obj6));
                Context context6 = eVar6.f134441a;
                int i25 = eVar6.f139614h;
                list5.getClass();
                LineChart lineChart2 = eVar6.f134442b;
                if (lineChart2 != null) {
                    List<hz.d> list6 = dVar5.f139609a;
                    float f15 = dVar5.f139612d;
                    hz.d dVar6 = (hz.d) p13.h0.d0(list6);
                    int iA2 = nz.a.a(dVar6 != null ? dVar6.f86388a : null, bVar5.f86379b, bVar5.f86381d, i25);
                    hz.b bVarC = nz.a.c(bVar5, iA2);
                    DateTime dateTime2 = bVarC.f86378a;
                    DateTime dateTime3 = bVarC.f86379b;
                    DateTime dateTime4 = bVarC.f86380c;
                    eVar6.w();
                    YAxis axisLeft = lineChart2.getAxisLeft();
                    axisLeft.getClass();
                    eVar6.x(axisLeft, dVar5.f139610b, dVar5.f139611c, f15);
                    ArrayList arrayList3 = new ArrayList();
                    if (dateTime2 == null || dateTime4 == null) {
                        lineChart = lineChart2;
                        arrayList3.add(eVar6.o(p13.j0.f134944a, false));
                    } else {
                        hz.e eVarP = eVar6.p(dVar5, dateTime2, dateTime4, dateTime2);
                        int entryCount = eVarP.getEntryCount();
                        int i26 = 0;
                        while (i26 < entryCount) {
                            ?? entryForIndex = eVarP.getEntryForIndex(i26);
                            entryForIndex.getClass();
                            LineChart lineChart3 = lineChart2;
                            DateTime dateTimePlusMinutes = dateTime2.plusMinutes(entryForIndex.getXIndex() * i25);
                            int i27 = entryCount;
                            jz.a aVar16 = eVar6.f139615i;
                            int i28 = i26;
                            DateTime dateTimeMinusMinutes = dateTimePlusMinutes.minusMinutes(i25);
                            dateTimeMinusMinutes.getClass();
                            entryForIndex.setData(new pr0.h(null, aVar16.c(dateTimeMinusMinutes, dateTimePlusMinutes, DateFormat.is24HourFormat(context6)), eVar6.f139600f.b(Integer.valueOf((int) entryForIndex.getVal())), Integer.valueOf(R.color.gcm_chart_intensity_minutes_data_set), null, 17, null));
                            i26 = i28 + 1;
                            entryCount = i27;
                            lineChart2 = lineChart3;
                            i25 = i25;
                        }
                        lineChart = lineChart2;
                        arrayList3.add(eVarP);
                    }
                    if (dateTime2 != null && dateTime3 != null) {
                        arrayList3.add(eVar6.q(f15, dateTime2, dateTime3, dateTime2));
                    }
                    eVar6.j(new LineData((List<String>) eVar6.u(iA2, dateTime2, dateTime3), arrayList3));
                    XAxis xAxis = lineChart.getXAxis();
                    xAxis.getClass();
                    xAxis.removeAllLimitLines();
                    LineChart lineChart4 = eVar6.f134442b;
                    XAxisRenderer rendererXAxis = lineChart4 != null ? lineChart4.getRendererXAxis() : null;
                    if ((rendererXAxis instanceof gm1.b) && dateTime2 != null && dateTime3 != null) {
                        gm1.b bVar6 = (gm1.b) rendererXAxis;
                        int hours = Hours.hoursBetween(dateTime2, dateTime3).getHours() % 4;
                        int i29 = hours > 0 ? 4 - hours : 0;
                        if (i29 >= 0) {
                            bVar6.f121637l = i29;
                        }
                        ArrayList<pr0.c> arrayList4 = new ArrayList();
                        for (Object obj10 : arrayList2) {
                            if (((pr0.c) obj10).f139605b) {
                                arrayList4.add(obj10);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            for (pr0.c cVar5 : arrayList4) {
                                LayerDrawable layerDrawableA = zx0.g.a(1, cVar5.f139604a, context6);
                                DateTime dateTime5 = cVar5.f139608e;
                                layerDrawableA.getClass();
                                bVar6.b(context6, dateTime5, dateTime2, dateTime3, layerDrawableA);
                            }
                        }
                        List<pr0.c> listZ0 = p13.h0.z0(arrayList2, arrayList4);
                        if (!listZ0.isEmpty()) {
                            for (pr0.c cVar6 : listZ0) {
                                LayerDrawable layerDrawableA2 = zx0.g.a(0, cVar6.f139604a, context6);
                                DateTime dateTime6 = cVar6.f139608e;
                                layerDrawableA2.getClass();
                                bVar6.b(context6, dateTime6, dateTime2, dateTime3, layerDrawableA2);
                            }
                        }
                        bVar6.e(context6, dateTime2, dateTime3, fVar8);
                        if (!list5.isEmpty()) {
                            for (gs1.k kVar2 : list5) {
                                LayerDrawable layerDrawableF = zx0.m.f(context6);
                                if (layerDrawableF != null) {
                                    LocalDate localDate = dateTime2.toLocalDate();
                                    localDate.getClass();
                                    bVar6.b(context6, kVar2.d(localDate), dateTime2, dateTime3, layerDrawableF);
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 18:
                e23.l lVar10 = (e23.l) obj6;
                tn2.r0 r0Var = (tn2.r0) obj9;
                String str12 = (String) obj3;
                String str13 = (String) obj7;
                String str14 = (String) obj5;
                String str15 = (String) obj4;
                e23.l lVar11 = (e23.l) obj8;
                c83.a0 a0Var = (c83.a0) obj;
                Logger logger = tn2.r0.f165631n;
                a0Var.getClass();
                lVar10.invoke(17);
                pn2.p pVar3 = (pn2.p) a0Var.f25746b;
                rn2.c cVar7 = pVar3 != null ? (rn2.c) pVar3.d() : null;
                if (cVar7 != null) {
                    r0Var.f165642k.a(cVar7.getCardInfo(), qs2.f.ERROR, null);
                }
                pn2.a.f138690a.getClass();
                return new tn2.r0.e(r0Var, str13, str14, pn2.a.e().f138762b, str15, new aa2.p(lVar10, r0Var, str13, str15, str14, lVar11), new tn2.m(r0Var, 20), lVar11).c(a0Var, str12);
            case 19:
                return a(obj);
            case 20:
                return b(obj);
            default:
                x3 x3Var4 = (x3) obj9;
                e2.f0 f0Var6 = (e2.f0) obj;
                f0Var6.getClass();
                e2.f0.f(f0Var6, ((List) x3Var4.getF182175a()).size(), null, new z3.e(-245459531, true, new ca0.e((zo1.q) obj8, (Context) obj7, (e23.l) obj6, (c.q) obj5, x3Var4, (x3) obj4, (p3.p1) obj3, 8)), 6);
                zo1.f.f206295a.getClass();
                e2.f0.b(f0Var6, null, zo1.f.f206296b, 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l0(ca0.s1 s1Var, ca0.o0 o0Var, lc.m0 m0Var, d7 d7Var, e23.l lVar, aa2.f fVar, ca0.o1 o1Var) {
        this.f16654a = 2;
        this.f16655b = s1Var;
        this.f16657d = o0Var;
        this.f16658e = m0Var;
        this.f16659f = d7Var;
        this.f16656c = lVar;
        this.f16660g = fVar;
        this.f16661h = o1Var;
    }

    public /* synthetic */ l0(e23.l lVar, tn2.r0 r0Var, String str, String str2, String str3, String str4, e23.l lVar2) {
        this.f16654a = 18;
        this.f16656c = lVar;
        this.f16655b = r0Var;
        this.f16658e = str;
        this.f16659f = str2;
        this.f16660g = str3;
        this.f16661h = str4;
        this.f16657d = lVar2;
    }

    public /* synthetic */ l0(i53.c cVar, i53.f fVar, com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar, Context context, p3.p1 p1Var, p3.p1 p1Var2, p3.p1 p1Var3) {
        this.f16654a = 13;
        this.f16655b = cVar;
        this.f16656c = fVar;
        this.f16657d = bVar;
        this.f16660g = context;
        this.f16658e = p1Var;
        this.f16659f = p1Var2;
        this.f16661h = p1Var3;
    }

    public /* synthetic */ l0(i53.f fVar, Map map, fy0.e eVar, Set set, Set set2, p3.p1 p1Var, p3.p1 p1Var2) {
        this.f16654a = 14;
        this.f16655b = fVar;
        this.f16656c = map;
        this.f16657d = eVar;
        this.f16660g = set;
        this.f16661h = set2;
        this.f16658e = p1Var;
        this.f16659f = p1Var2;
    }

    public /* synthetic */ l0(Integer num, e23.l lVar, e23.l lVar2, p3.p1 p1Var, o53.b0 b0Var, p3.p1 p1Var2, i2.a aVar) {
        this.f16654a = 0;
        this.f16655b = num;
        this.f16656c = lVar;
        this.f16657d = lVar2;
        this.f16658e = p1Var;
        this.f16660g = b0Var;
        this.f16659f = p1Var2;
        this.f16661h = aVar;
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i14) {
        this.f16654a = i14;
        this.f16655b = obj;
        this.f16656c = obj2;
        this.f16657d = obj3;
        this.f16658e = obj4;
        this.f16659f = obj5;
        this.f16660g = obj6;
        this.f16661h = obj7;
    }

    public /* synthetic */ l0(Object obj, Object obj2, p3.p1 p1Var, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f16654a = i14;
        this.f16655b = obj;
        this.f16656c = obj2;
        this.f16658e = p1Var;
        this.f16657d = obj3;
        this.f16659f = obj4;
        this.f16660g = obj5;
        this.f16661h = obj6;
    }

    public /* synthetic */ l0(n82.f fVar, i53.f fVar2, ry0.m mVar, b63.o oVar, b63.o oVar2, b63.o oVar3, e23.l lVar) {
        this.f16654a = 10;
        this.f16655b = fVar;
        this.f16657d = fVar2;
        this.f16658e = mVar;
        this.f16659f = oVar;
        this.f16660g = oVar2;
        this.f16661h = oVar3;
        this.f16656c = lVar;
    }

    public /* synthetic */ l0(nj2.a aVar, x3 x3Var, p3.p1 p1Var, p3.p1 p1Var2, p3.p1 p1Var3, p3.p1 p1Var4, p3.p1 p1Var5) {
        this.f16654a = 11;
        this.f16655b = aVar;
        this.f16656c = x3Var;
        this.f16658e = p1Var;
        this.f16659f = p1Var2;
        this.f16657d = p1Var3;
        this.f16660g = p1Var4;
        this.f16661h = p1Var5;
    }

    public /* synthetic */ l0(o53.b0 b0Var, p3.p1 p1Var, Context context, AddTIEventViewModel addTIEventViewModel, p3.p1 p1Var2, p3.p1 p1Var3, p3.p1 p1Var4) {
        this.f16654a = 20;
        this.f16660g = b0Var;
        this.f16658e = p1Var;
        this.f16655b = context;
        this.f16656c = addTIEventViewModel;
        this.f16657d = p1Var2;
        this.f16659f = p1Var3;
        this.f16661h = p1Var4;
    }

    public /* synthetic */ l0(o53.b0 b0Var, p3.p1 p1Var, km1.v vVar, sm1.s sVar, DateTime dateTime, mc mcVar, p3.p1 p1Var2) {
        this.f16654a = 8;
        this.f16660g = b0Var;
        this.f16658e = p1Var;
        this.f16655b = vVar;
        this.f16656c = sVar;
        this.f16657d = dateTime;
        this.f16661h = mcVar;
        this.f16659f = p1Var2;
    }

    public /* synthetic */ l0(p1.o0 o0Var, nc.e eVar, e23.l lVar, e23.l lVar2, e23.l lVar3, x3 x3Var, p3.p1 p1Var) {
        this.f16654a = 12;
        this.f16655b = o0Var;
        this.f16659f = eVar;
        this.f16656c = lVar;
        this.f16657d = lVar2;
        this.f16660g = lVar3;
        this.f16661h = x3Var;
        this.f16658e = p1Var;
    }

    public /* synthetic */ l0(x3 x3Var, zo1.q qVar, Context context, e23.l lVar, c.q qVar2, x3 x3Var2, p3.p1 p1Var) {
        this.f16654a = 21;
        this.f16655b = x3Var;
        this.f16657d = qVar;
        this.f16659f = context;
        this.f16656c = lVar;
        this.f16660g = qVar2;
        this.f16661h = x3Var2;
        this.f16658e = p1Var;
    }

    public /* synthetic */ l0(tn2.r0 r0Var, String str, String str2, String str3, String str4, e23.l lVar, String str5) {
        this.f16654a = 19;
        this.f16655b = r0Var;
        this.f16657d = str;
        this.f16658e = str2;
        this.f16659f = str3;
        this.f16660g = str4;
        this.f16656c = lVar;
        this.f16661h = str5;
    }

    public /* synthetic */ l0(zc.d dVar, u2.h hVar, li0.f fVar, p3.p1 p1Var, p3.p1 p1Var2, zc.d dVar2, String str) {
        this.f16654a = 6;
        this.f16655b = dVar;
        this.f16656c = hVar;
        this.f16657d = fVar;
        this.f16659f = p1Var;
        this.f16658e = p1Var2;
        this.f16660g = dVar2;
        this.f16661h = str;
    }
}
