package tn2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.charts.ScatterChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.CombinedData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.github.mikephil.chartingv2.data.ScatterData;
import com.github.mikephil.chartingv2.data.ScatterDataSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l72.i3;
import o72.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p006l2.l1;
import p006l2.m2;
import p008y1.b2;
import p3.c2;
import p3.p1;
import p3.x3;
import r53.p2;
import v2.g2;
import v2.u1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f165664d;

    public /* synthetic */ s0(r0.d dVar, String str, String str2) {
        this.f165661a = 1;
        this.f165663c = dVar;
        this.f165662b = str;
        this.f165664d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList] */
    private final Object a(Object obj) {
        ?? arrayList;
        Object next;
        Boolean enabled;
        List<Integer> listH;
        b63.v vVarA;
        qd1.a aVar;
        Integer num;
        Object next2;
        Object next3;
        b63.v vVarF;
        s21.c cVar;
        v01.b1 b1Var = (v01.b1) this.f165663c;
        l01.e eVar = (l01.e) this.f165664d;
        List<g01.x> list = (List) this.f165662b;
        pd1.c cVar2 = (pd1.c) obj;
        cVar2.getClass();
        s01.a aVar2 = b1Var.f174234c;
        b63.v vVar = new b63.v(0, 0, 0, 0, 12, null);
        qd1.b bVar = new qd1.b(p13.x.k(new qd1.a(true, f01.f.DAILY.f67700a, vVar, null, 8, null), new qd1.a(false, f01.f.BREAKFAST.f67700a, vVar, null, 8, null), new qd1.a(false, f01.f.LUNCH.f67700a, vVar, null, 8, null), new qd1.a(false, f01.f.DINNER.f67700a, vVar, null, 8, null), new qd1.a(false, f01.f.CUSTOM_MEAL_1.f67700a, vVar, null, 8, null), new qd1.a(false, f01.f.CUSTOM_MEAL_2.f67700a, vVar, null, 8, null), new qd1.a(false, f01.f.CUSTOM_MEAL_3.f67700a, vVar, null, 8, null)), pd1.a.GCNT, Integer.valueOf(aVar2.f155443a.getUserProfilePk()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = bVar.f144479a.iterator();
        while (true) {
            q01.g gVar = null;
            qd1.a aVarA = null;
            pd1.a aVarA2 = null;
            if (!it.hasNext()) {
                List<pd1.b> listF = cVar2.f();
                if (listF != null) {
                    ArrayList<pd1.b> arrayListZ = p13.h0.Z(listF);
                    arrayList = new ArrayList();
                    for (pd1.b bVar2 : arrayListZ) {
                        Iterator it3 = list.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!d53.u.q(((g01.x) next).f74284k, bVar2.getReminderText(), true));
                        if (((g01.x) next) == null) {
                            f01.f.a aVar3 = f01.f.f67690b;
                            String reminderText = bVar2.getReminderText();
                            aVar3.getClass();
                            if (f01.f.a.b(reminderText)) {
                                enabled = bVar2.getEnabled();
                                String reminderText2 = bVar2.getReminderText();
                                listH = bVar2.h();
                                if (listH != null || (num = (Integer) p13.h0.K0(listH)) == null) {
                                    vVarA = null;
                                } else {
                                    int iIntValue = num.intValue();
                                    b63.v.Companion companion = b63.v.INSTANCE;
                                    l3.f23124b.getClass();
                                    int iY = l3.a.y(0, iIntValue, 0);
                                    companion.getClass();
                                    vVarA = b63.v.Companion.a(iY);
                                }
                                if (enabled != null || reminderText2 == null || vVarA == null) {
                                    aVar = null;
                                } else {
                                    aVar = new qd1.a(enabled.booleanValue(), reminderText2, vVarA, bVar2.getUserReminderId());
                                }
                            } else {
                                aVar = null;
                            }
                        } else {
                            enabled = bVar2.getEnabled();
                            String reminderText3 = bVar2.getReminderText();
                            listH = bVar2.h();
                            if (listH != null) {
                                vVarA = null;
                            } else {
                                vVarA = null;
                            }
                            if (enabled != null) {
                                aVar = null;
                            } else {
                                aVar = null;
                            }
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                } else {
                    arrayList = p13.j0.f134944a;
                }
                int iA = p13.t0.a(p13.y.r(list, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (g01.x xVar : list) {
                    String str = xVar.f74284k;
                    Integer num2 = xVar.f74277d;
                    o13.p pVar = new o13.p(str, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
                    linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                }
                ArrayList arrayListC0 = p13.h0.C0((Collection) arrayList, arrayList2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayListC0) {
                    if (hashSet.add(((qd1.a) obj2).f144476b)) {
                        arrayList3.add(obj2);
                    }
                }
                List listN0 = p13.h0.N0(arrayList3, new v01.a1(new v01.z0(), linkedHashMap));
                Map<String, q01.j> mapR = og2.k.R(list);
                if (listN0.isEmpty()) {
                    listN0 = null;
                }
                if (listN0 != null) {
                    String reminderType = cVar2.getReminderType();
                    if (reminderType != null) {
                        pd1.a.f137369b.getClass();
                        aVarA2 = pd1.a.C2601a.a(reminderType);
                    }
                    gVar = new q01.g(new qd1.b(listN0, aVarA2, Integer.valueOf(b1Var.f174235d.getUserProfilePk())), mapR);
                }
                b1Var.f174236e.o(mapR);
                return gVar;
            }
            qd1.a aVar4 = (qd1.a) it.next();
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!d53.u.q(((g01.x) next2).f74284k, aVar4.f144476b, true));
            g01.x xVar2 = (g01.x) next2;
            f01.f.a aVar5 = f01.f.f67690b;
            String str2 = aVar4.f144476b;
            aVar5.getClass();
            boolean zB = f01.f.a.b(str2);
            if (zB || xVar2 != null) {
                if (zB) {
                    int i14 = l01.e.b.f107852a[eVar.ordinal()];
                    if (i14 == 1) {
                        cVar = s21.c.TIMELINE;
                    } else {
                        if (i14 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        cVar = s21.c.CLASSIC;
                    }
                    if (cVar != s21.c.TIMELINE) {
                        vVarF = v21.d.f175320x;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            b63.v vVar2 = ((g01.x) it5.next()).f74279f;
                            if (vVar2 != null) {
                                arrayList4.add(vVar2);
                            }
                        }
                        b63.v vVar3 = (b63.v) p13.h0.o0(arrayList4);
                        if (vVar3 == null) {
                            vVarF = v21.d.f175320x;
                        } else {
                            v21.f.f175333a.getClass();
                            vVarF = new b63.v(v21.f.x(vVar3).f16219a.getHour(), 0, 0, 0, 12, null);
                        }
                    }
                } else {
                    String str3 = aVar4.f144476b;
                    Iterator it6 = list.iterator();
                    do {
                        if (!it6.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it6.next();
                    } while (!p005kotlin.jvm.internal.s.g(((g01.x) next3).f74284k, str3));
                    g01.x xVar3 = (g01.x) next3;
                    b63.v vVar4 = xVar3 != null ? xVar3.f74279f : null;
                    if (vVar4 != null) {
                        v21.f.f175333a.getClass();
                        vVarF = v21.f.x(vVar4);
                    } else {
                        vVarF = g22.l.f(b63.v.INSTANCE);
                    }
                }
                aVarA = qd1.a.a(aVar4, false, null, vVarF, 11);
            }
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
        }
    }

    private final Object b(Object obj) {
        n4.d dVarG;
        w02.r rVar = (w02.r) this.f165663c;
        n4.d dVar = (n4.d) this.f165664d;
        e23.l lVar = (e23.l) this.f165662b;
        e2.n nVar = (e2.n) obj;
        nVar.getClass();
        if (rVar.g() == b2.Vertical) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(nVar.getF62574p())) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.g() >> 32));
            float size = nVar.getF62575q();
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(size)) & 4294967295L;
            n4.g.a aVar2 = n4.g.f123559b;
            dVarG = g8.i.g(jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
        } else {
            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(nVar.getF62574p())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            n4.c.a aVar3 = n4.c.f123541b;
            float size2 = nVar.getF62575q();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.g() & 4294967295L));
            long jFloatToRawIntBits5 = Float.floatToRawIntBits(size2);
            long jFloatToRawIntBits6 = ((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
            n4.g.a aVar4 = n4.g.f123559b;
            dVarG = g8.i.g(jFloatToRawIntBits4, jFloatToRawIntBits6 | (jFloatToRawIntBits5 << 32));
        }
        return Boolean.valueOf(dVar.a(dVarG.f()) && rVar.f181133l.contains(nVar.getF62570l()) && ((Boolean) lVar.invoke(nVar)).booleanValue());
    }

    private final Object c(Object obj) {
        long jW;
        p005kotlin.jvm.internal.q0 q0Var = (p005kotlin.jvm.internal.q0) this.f165663c;
        w2.n nVar = (w2.n) this.f165664d;
        p005kotlin.jvm.internal.q0 q0Var2 = (p005kotlin.jvm.internal.q0) this.f165662b;
        q0Var.f105808a = z2.x0.a(nVar.p().c());
        n4.c.a aVar = n4.c.f123541b;
        aVar.getClass();
        q0Var2.f105808a = 0L;
        nVar.f181378n.setValue(Boolean.TRUE);
        f5.c0 c0VarV = nVar.v();
        if (c0VarV != null) {
            aVar.getClass();
            jW = c0VarV.W(0L);
        } else {
            aVar.getClass();
            jW = n4.c.f123543d;
        }
        nVar.f181381q.setValue(n4.c.a(jW));
        nVar.G(l1.Cursor, q0Var.f105808a);
        return Unit.INSTANCE;
    }

    private final Object d(Object obj) {
        e23.a aVar = (e23.a) this.f165663c;
        w2.n nVar = (w2.n) this.f165664d;
        u1 u1Var = (u1) this.f165662b;
        n4.c cVar = (n4.c) obj;
        aVar.invoke();
        boolean z14 = nVar.f181374j;
        g2 g2Var = nVar.f181366b;
        if (z14 && nVar.f181368d) {
            if (!nVar.f181375k) {
                u1Var.invoke();
                if (nVar.f181365a.d().f167839c.length() > 0) {
                    nVar.C(true);
                }
            }
            nVar.D(w2.j0.None);
            nVar.A(v2.i.e(g2Var, g2Var.a(cVar.f123544a)));
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj) {
        w2.n nVar = (w2.n) this.f165663c;
        o53.b0 b0Var = (o53.b0) this.f165664d;
        Context context = (Context) this.f165662b;
        n2.a aVar = (n2.a) obj;
        aVar.a();
        p1.q0<o2.b> q0Var = aVar.f122353a;
        m2 m2Var = m2.f108656d;
        boolean zF = nVar.f();
        Object obj2 = null;
        w2.c0 c0Var = new w2.c0(b0Var, new w2.d0(nVar, null), 0);
        w2.j0 j0Var = w2.j0.None;
        Resources resources = context.getResources();
        t42.l lVar = new t42.l(c0Var, obj2, nVar, j0Var, 23);
        if (zF) {
            q0Var.g(new o2.e(m2Var.f108662a, resources.getString(m2Var.f108663b), m2Var.f108664c, lVar));
        }
        m2 m2Var2 = m2.f108657e;
        boolean zE = nVar.e();
        w2.c0 c0Var2 = new w2.c0(b0Var, new w2.e0(nVar, null), 0);
        Resources resources2 = context.getResources();
        t42.l lVar2 = new t42.l(c0Var2, obj2, nVar, j0Var, 23);
        if (zE) {
            q0Var.g(new o2.e(m2Var2.f108662a, resources2.getString(m2Var2.f108663b), m2Var2.f108664c, lVar2));
        }
        m2 m2Var3 = m2.f108658f;
        boolean zG = nVar.g();
        w2.c0 c0Var3 = new w2.c0(b0Var, new w2.f0(nVar, null), 0);
        Resources resources3 = context.getResources();
        t42.l lVar3 = new t42.l(c0Var3, obj2, nVar, j0Var, 23);
        if (zG) {
            q0Var.g(new o2.e(m2Var3.f108662a, resources3.getString(m2Var3.f108663b), m2Var3.f108664c, lVar3));
        }
        m2 m2Var4 = m2.f108659g;
        boolean zH = nVar.h();
        w2.j0 j0Var2 = w2.j0.Selection;
        p006l2.m mVar = new p006l2.m(nVar, 7);
        p006l2.m mVar2 = new p006l2.m(nVar, 8);
        Resources resources4 = context.getResources();
        t42.l lVar4 = new t42.l(mVar2, mVar, nVar, j0Var2, 23);
        if (zH) {
            q0Var.g(new o2.e(m2Var4.f108662a, resources4.getString(m2Var4.f108663b), m2Var4.f108664c, lVar4));
        }
        m2 m2Var5 = m2.f108660h;
        boolean zD = nVar.d();
        p006l2.m mVar3 = new p006l2.m(nVar, 9);
        Resources resources5 = context.getResources();
        t42.l lVar5 = new t42.l(mVar3, obj2, nVar, j0Var, 23);
        if (zD) {
            q0Var.g(new o2.e(m2Var5.f108662a, resources5.getString(m2Var5.f108663b), m2Var5.f108664c, lVar5));
        }
        aVar.a();
        return Unit.INSTANCE;
    }

    private final Object f(Object obj) {
        w51.h0 h0Var = (w51.h0) this.f165663c;
        Context context = (Context) this.f165664d;
        p1 p1Var = (p1) this.f165662b;
        i3 i3Var = (i3) obj;
        i3Var.getClass();
        String str = i3Var.f111063a;
        if (p005kotlin.jvm.internal.s.g(str, "SAVE_ALL")) {
            h0Var.getClass();
            ge1.b.T(v1.a(h0Var), null, null, new w51.x(h0Var, context, null), 3);
        } else if (p005kotlin.jvm.internal.s.g(str, "DISCARD_ALL")) {
            p1Var.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj) {
        lc.m0 m0Var = (lc.m0) this.f165663c;
        PromotionsDevMenuActivity promotionsDevMenuActivity = (PromotionsDevMenuActivity) this.f165664d;
        zd0.q0 q0Var = (zd0.q0) this.f165662b;
        lc.k0 k0Var = (lc.k0) obj;
        int i14 = PromotionsDevMenuActivity.f41027b;
        k0Var.getClass();
        nc.n.b(k0Var, "promoConditionsRoute", null, null, null, null, null, null, new z3.e(-243972795, true, new wb1.n(m0Var, promotionsDevMenuActivity)), 254);
        nc.n.b(k0Var, "promoManageCacheRoute", null, null, null, null, null, null, new z3.e(-266071364, true, new m1(19, m0Var, q0Var)), 254);
        nc.n.b(k0Var, "promoListRoute", null, null, null, null, null, null, new z3.e(-1176951107, true, new wb1.n(promotionsDevMenuActivity, m0Var)), 254);
        z3.e eVar = new z3.e(-1077164803, true, new b21.m(m0Var, 12));
        p13.k0 k0Var2 = p13.k0.f134949a;
        k0Var2.getClass();
        nc.n.a(k0Var, p005kotlin.jvm.internal.s0.f105811a.b(wb1.a.class), k0Var2, p13.j0.f134944a, null, null, null, null, eVar);
        return Unit.INSTANCE;
    }

    private final Object h(Object obj) {
        RunningEconomyReportsActivity runningEconomyReportsActivity = (RunningEconomyReportsActivity) this.f165663c;
        lc.m0 m0Var = (lc.m0) this.f165664d;
        Boolean bool = (Boolean) this.f165662b;
        lc.k0 k0Var = (lc.k0) obj;
        RunningEconomyReportsActivity.a aVar = RunningEconomyReportsActivity.f41149c;
        k0Var.getClass();
        nc.n.b(k0Var, com.garmin.android.apps.connectmobile.running_economy.presentation.a.c.f41159b.f41156a, null, null, null, null, null, null, new z3.e(-626116467, true, new ul.a(runningEconomyReportsActivity, m0Var, bool, 8)), 254);
        String str = com.garmin.android.apps.connectmobile.running_economy.presentation.a.b.f41158b.f41156a;
        str.getClass();
        lc.a.b bVar = new lc.a.b(k0Var.f111792h);
        bVar.f111717g = HelpActivity.a.b(HelpActivity.f36653a, runningEconomyReportsActivity, ro0.l.RUNNING_ECONOMY, null, 12);
        bVar.l(str);
        k0Var.f111797m.add(bVar);
        nc.n.b(k0Var, com.garmin.android.apps.connectmobile.running_economy.presentation.a.C0780a.f41157b.f41156a, null, null, null, null, null, null, new z3.e(-1860957180, true, new b21.m(m0Var, 13)), 254);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        sw.a aVarA;
        oz.a aVar;
        int iC;
        int i14;
        LineData lineData;
        CombinedData combinedData;
        Boolean isShareable;
        e23.a<Unit> aVar2;
        String str;
        String[] strArrKeys;
        Object value;
        int i15 = this.f165661a;
        int i16 = 9;
        int i17 = 3;
        int i18 = 10;
        int i19 = 0;
        int i24 = 4;
        Object obj2 = this.f165662b;
        Object obj3 = this.f165664d;
        Object obj4 = this.f165663c;
        switch (i15) {
            case 0:
                pn2.p pVar = (pn2.p) obj3;
                w.f fVar = (w.f) obj;
                fVar.getClass();
                f fVar2 = f.f165551a;
                byte[] bArr = fVar.f165723e;
                bArr.getClass();
                fVar2.getClass();
                return ((r0.c) obj4).b(pVar.getHeader().getNextAccessToken(), ((rn2.q) pVar.d()).getResultConfirmId(), f.a(bArr), (String) obj2);
            case 1:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                q03.r rVar = (q03.r) ((r0.d) obj4).f165652e.invoke(new r0.b((String) obj2, (String) obj3));
                p0 p0Var = new p0(new u0(th3, 0), 13);
                rVar.getClass();
                int i25 = w03.b.f181178a;
                return new e13.k(rVar, p0Var);
            case 2:
                sp1.a aVar3 = (sp1.a) obj4;
                xp1.b bVar = (xp1.b) obj3;
                String str2 = (String) obj2;
                ((CustomLineChart) obj).getClass();
                qz.a.b(aVar3, bVar, bVar == null ? str2 : null, 4);
                return Unit.INSTANCE;
            case 3:
                sw.f fVar3 = (sw.f) obj4;
                List<pw.a> list = (List) obj3;
                kw.m mVar = (kw.m) obj2;
                ((oz.a) obj).getClass();
                oz.a aVar4 = fVar3.f161049d;
                aVar4.clear();
                fVar3.f161050e = new r22.a(fVar3, 15);
                aVar4.setDrawOrder(new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.SCATTER});
                aVar4.setDescription(null);
                YAxis axisLeft = aVar4.getAxisLeft();
                int i26 = fVar3.f161052g;
                axisLeft.setTextColor(i26);
                axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
                axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", aVar4.getContext()));
                axisLeft.setTextSize(10.0f);
                axisLeft.setDrawGridLines(false);
                axisLeft.setDrawAxisLine(false);
                axisLeft.setDrawLimitLinesBehindData(false);
                XAxis xAxis = aVar4.getXAxis();
                xAxis.setTextSize(10.0f);
                xAxis.setTextColor(i26);
                xAxis.setLabelsToSkip(9);
                xAxis.setYOffset(10.0f);
                xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", aVar4.getContext()));
                xAxis.setDrawGridLines(false);
                xAxis.setDrawLabels(true);
                aVar4.setTouchEnabled(false);
                aVar4.setPinchZoom(false);
                aVar4.setScaleEnabled(false);
                aVar4.setDoubleTapToZoomEnabled(false);
                aVar4.setScaleYEnabled(false);
                aVar4.setScaleXEnabled(false);
                aVar4.setHighlightPerDragEnabled(false);
                aVar4.setHighlightPerTapEnabled(false);
                aVar4.getAxisRight().setEnabled(false);
                aVar4.getLegend().setEnabled(false);
                oz.a aVar5 = fVar3.f161049d;
                list.getClass();
                if (list.isEmpty()) {
                    v22.e.j(aVar5);
                } else {
                    kw.m mVar2 = new sw.c(mVar).f161048a;
                    Map<kw.b, kw.f> map = mVar2.f106878b;
                    kw.b bVar2 = kw.b.ONE;
                    kw.f fVar4 = map.get(bVar2);
                    int i27 = fVar4 != null ? fVar4.f106838c : -1;
                    kw.f fVar5 = map.get(bVar2);
                    int i28 = fVar5 != null ? fVar5.f106841f : -1;
                    kw.b bVar3 = kw.b.THREE;
                    kw.f fVar6 = map.get(bVar3);
                    int i29 = fVar6 != null ? fVar6.f106838c : -1;
                    kw.f fVar7 = map.get(bVar3);
                    int i30 = fVar7 != null ? fVar7.f106841f : -1;
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator it = list.iterator();
                    while (true) {
                        double dDoubleValue = 0.0d;
                        if (it.hasNext()) {
                            Double systolic = ((pw.a) it.next()).getSystolic();
                            if (systolic != null) {
                                dDoubleValue = systolic.doubleValue();
                            }
                            arrayList.add(Integer.valueOf((int) dDoubleValue));
                            i27 = i27;
                        } else {
                            int i34 = i27;
                            List listN0 = p13.h0.N0(arrayList, new sw.d());
                            ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                Double diastolic = ((pw.a) it3.next()).getDiastolic();
                                arrayList2.add(Integer.valueOf((int) (diastolic != null ? diastolic.doubleValue() : 0.0d)));
                                i18 = i18;
                            }
                            List listN1 = p13.h0.N0(arrayList2, new sw.e());
                            int iIntValue = ((Number) p13.h0.m0(listN0)).intValue();
                            float f14 = iIntValue + 2.0f;
                            fz.a aVar6 = fz.a.f73959a;
                            aVar6.getClass();
                            if (f14 > ((int) fz.a.h(iIntValue))) {
                                iIntValue += 10;
                            }
                            int iMax = Math.max(iIntValue, i29 + 40);
                            int i35 = i34 - 20;
                            int iIntValue2 = ((Number) p13.h0.b0(listN0)).intValue();
                            float f15 = iIntValue2 - 2.0f;
                            aVar6.getClass();
                            if (f15 < ((int) fz.a.g(iIntValue2))) {
                                iIntValue2 -= 10;
                            }
                            int iMin = Math.min(i35, iIntValue2);
                            int iIntValue3 = ((Number) p13.h0.m0(listN1)).intValue();
                            float f16 = iIntValue3 + 2.0f;
                            aVar6.getClass();
                            if (f16 > ((int) fz.a.h(iIntValue3))) {
                                iIntValue3 += 10;
                            }
                            int iMax2 = Math.max(iIntValue3, i30 + 20);
                            int i36 = i28 - 10;
                            int iIntValue4 = ((Number) p13.h0.b0(listN1)).intValue();
                            float f17 = iIntValue4 - 2.0f;
                            aVar6.getClass();
                            if (f17 < ((int) fz.a.g(iIntValue4))) {
                                iIntValue4 -= 10;
                            }
                            int iMin2 = Math.min(i36, iIntValue4);
                            aVar6.getClass();
                            double dH = ((int) fz.a.h(iMax)) - ((int) fz.a.g(iMin));
                            double d14 = dH / ((double) 8);
                            int iG = (int) fz.a.g(d14);
                            if (dH / ((double) iG) > 9.0d) {
                                iG = (int) fz.a.h(d14);
                            }
                            sw.a aVar7 = new sw.a(iMin2, iMax2, iMin, iMax, iG, 10);
                            if (aVar7.b(mVar2)) {
                                kw.b bVar4 = kw.b.FOUR;
                                kw.f fVar8 = map.get(bVar4);
                                int i37 = fVar8 != null ? fVar8.f106838c : 0;
                                kw.f fVar9 = map.get(bVar4);
                                int i38 = fVar9 != null ? fVar9.f106841f : 0;
                                int i39 = aVar7.f161043d - i37;
                                int i44 = aVar7.f161044e;
                                int iCeil = i39 <= 0 ? 0 : (int) Math.ceil(((double) i39) / ((double) i44));
                                int i45 = aVar7.f161041b - i38;
                                int i46 = aVar7.f161045f;
                                int iCeil2 = i45 <= 0 ? 0 : (int) Math.ceil(((double) i45) / ((double) i46));
                                if (iCeil != 0) {
                                    i44 *= iCeil;
                                }
                                int i47 = i37 + i44;
                                if (iCeil2 != 0) {
                                    i46 *= iCeil2;
                                }
                                aVarA = sw.a.a(aVar7, 0, i38 + i46, 0, i47, 53);
                            } else {
                                aVarA = aVar7;
                            }
                            double d15 = aVarA.f161043d;
                            double d16 = aVarA.f161044e;
                            int iMin3 = Math.min((int) (Math.ceil(d15 / d16) * d16), 300);
                            int iMax3 = Math.max((int) (Math.floor(((double) aVarA.f161042c) / d16) * d16), 40);
                            double d17 = aVarA.f161041b;
                            double d18 = aVarA.f161045f;
                            sw.a aVarA2 = sw.a.a(aVarA, Math.max((int) (Math.floor(((double) aVarA.f161040a) / d18) * d18), 30), Math.min((int) (Math.ceil(d17 / d18) * d18), 200), iMax3, iMin3, 48);
                            fVar3.f161051f = p13.h0.b1(new j23.l(aVarA2.f161040a, aVarA2.f161041b));
                            XAxis xAxis2 = aVar5.getXAxis();
                            ArrayList arrayList3 = new ArrayList();
                            List<Integer> list2 = fVar3.f161051f;
                            if (list2 == null) {
                                p005kotlin.jvm.internal.s.m("xValues");
                                throw null;
                            }
                            Iterator<T> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(String.valueOf(((Number) it4.next()).intValue()));
                            }
                            xAxis2.setValues(arrayList3);
                            List<Integer> list3 = fVar3.f161051f;
                            if (list3 == null) {
                                p005kotlin.jvm.internal.s.m("xValues");
                                throw null;
                            }
                            int size = list3.size();
                            float f18 = size <= 151 ? 10.0f : size <= 161 ? 9.5f : 9.0f;
                            aVar5.getAxisLeft().setTextSize(f18);
                            aVar5.getXAxis().setTextSize(f18);
                            float f19 = aVarA2.f161043d;
                            float f22 = aVarA2.f161042c;
                            aVar5.getAxisLeft().setAxisMaxValue(f19);
                            aVar5.getAxisLeft().setAxisMinValue(f22);
                            aVar5.getAxisLeft().setLabelCount(((int) Math.ceil((f19 - f22) / aVarA2.f161044e)) + 1, false);
                            CombinedData combinedData2 = new CombinedData(aVar5.getXAxis().getValues());
                            ArrayList arrayList4 = new ArrayList();
                            for (pw.a aVar8 : list) {
                                Double systolic2 = aVar8.getSystolic();
                                float fDoubleValue = systolic2 != null ? (float) systolic2.doubleValue() : 0.0f;
                                if (fDoubleValue < 0.0f) {
                                    fDoubleValue = 40.0f;
                                }
                                Double diastolic2 = aVar8.getDiastolic();
                                arrayList4.add(new Entry(fDoubleValue, fVar3.c(diastolic2 != null ? (int) diastolic2.doubleValue() : 0)));
                            }
                            ScatterDataSet scatterDataSet = new ScatterDataSet(arrayList4, "");
                            scatterDataSet.setHighlightEnabled(false);
                            scatterDataSet.setScatterShapeHoleRadius(4.0f);
                            scatterDataSet.setScatterShapeHoleColor(fVar3.f161053h);
                            scatterDataSet.setScatterShapeSize(8.0f);
                            scatterDataSet.setDrawValues(false);
                            scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
                            ScatterData scatterData = new ScatterData();
                            scatterData.addDataSet(scatterDataSet);
                            combinedData2.setData(scatterData);
                            int i48 = fVar3.f161054i;
                            Context context = fVar3.f80356a;
                            Map<kw.b, kw.f> map2 = mVar.f106878b;
                            kw.f fVar10 = map2.get(kw.b.ONE);
                            if (fVar10 == null) {
                                lineData = new LineData();
                            } else {
                                int i49 = fVar10.f106844i;
                                int i54 = fVar10.f106839d;
                                kw.f fVar11 = map2.get(kw.b.TWO);
                                if (fVar11 == null) {
                                    lineData = new LineData();
                                } else {
                                    int i55 = fVar11.f106844i;
                                    int i56 = fVar11.f106839d;
                                    kw.f fVar12 = map2.get(kw.b.THREE);
                                    if (fVar12 == null) {
                                        lineData = new LineData();
                                    } else {
                                        int i57 = fVar12.f106844i;
                                        aVar = aVar5;
                                        int i58 = fVar12.f106839d;
                                        kw.f fVar13 = map2.get(kw.b.FOUR);
                                        if (fVar13 == null) {
                                            lineData = new LineData();
                                            combinedData = combinedData2;
                                            i14 = 0;
                                        } else {
                                            int i59 = fVar13.f106844i;
                                            kw.f fVar14 = map2.get(kw.b.FIVE);
                                            LineData lineData2 = new LineData();
                                            if (aVarA2.b(mVar)) {
                                                float f24 = aVar.getAxisLeft().mAxisMaximum;
                                                List<Integer> list4 = fVar3.f161051f;
                                                if (list4 == null) {
                                                    p005kotlin.jvm.internal.s.m("xValues");
                                                    throw null;
                                                }
                                                int iC2 = fVar3.c(((Number) p13.h0.m0(list4)).intValue());
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(new Entry(0.0f, iC2));
                                                arrayList5.add(new Entry(f24, iC2));
                                                LineDataSet lineDataSetD = sw.f.d(arrayList5);
                                                if (fVar14 != null) {
                                                    Unit unit = Unit.INSTANCE;
                                                    lineDataSetD.setColor(a7.b.getColor(context, fVar14.f106844i));
                                                    lineDataSetD.setFillAlpha(127);
                                                }
                                                ArrayList arrayList6 = new ArrayList();
                                                arrayList6.add(new Entry(f24, 0));
                                                arrayList6.add(new Entry(f24, iC2));
                                                LineDataSet lineDataSetD2 = sw.f.d(arrayList6);
                                                lineDataSetD2.setColor(i48);
                                                lineDataSetD2.setFillColor(i48);
                                                lineDataSetD2.setFillAlpha(255);
                                                r22.a aVar9 = fVar3.f161050e;
                                                if (aVar9 == null) {
                                                    p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                    throw null;
                                                }
                                                lineDataSetD2.setFillFormatter(aVar9);
                                                LineDataSet lineDataSetD3 = sw.f.d(arrayList6);
                                                if (fVar14 != null) {
                                                    int i64 = fVar14.f106844i;
                                                    lineDataSetD3.setColor(a7.b.getColor(context, i64));
                                                    lineDataSetD3.setFillColor(context.getColor(i64));
                                                    lineDataSetD3.setFillAlpha(127);
                                                    r22.a aVar10 = fVar3.f161050e;
                                                    if (aVar10 == null) {
                                                        p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                        throw null;
                                                    }
                                                    lineDataSetD3.setFillFormatter(aVar10);
                                                }
                                                lineData2.addDataSet(lineDataSetD2);
                                                lineData2.addDataSet(lineDataSetD);
                                                lineData2.addDataSet(lineDataSetD3);
                                            }
                                            ArrayList arrayList7 = new ArrayList();
                                            float f25 = aVarA2.b(mVar) ? fVar13.f106839d : aVar.getAxisLeft().mAxisMaximum;
                                            if (aVarA2.b(mVar)) {
                                                iC = fVar3.c(fVar13.f106842g);
                                            } else {
                                                List<Integer> list5 = fVar3.f161051f;
                                                if (list5 == null) {
                                                    p005kotlin.jvm.internal.s.m("xValues");
                                                    throw null;
                                                }
                                                iC = fVar3.c(((Number) p13.h0.m0(list5)).intValue());
                                            }
                                            arrayList7.add(new Entry(0.0f, iC));
                                            arrayList7.add(new Entry(f25, iC));
                                            LineDataSet lineDataSetD4 = sw.f.d(arrayList7);
                                            lineDataSetD4.setColor(a7.b.getColor(context, i59));
                                            lineDataSetD4.setFillAlpha(127);
                                            ArrayList arrayList8 = new ArrayList();
                                            arrayList8.add(new Entry(f25, 0));
                                            arrayList8.add(new Entry(f25, iC));
                                            LineDataSet lineDataSetD5 = sw.f.d(arrayList8);
                                            lineDataSetD5.setColor(i48);
                                            lineDataSetD5.setFillColor(i48);
                                            lineDataSetD5.setFillAlpha(255);
                                            r22.a aVar11 = fVar3.f161050e;
                                            if (aVar11 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD5.setFillFormatter(aVar11);
                                            LineDataSet lineDataSetD6 = sw.f.d(arrayList8);
                                            lineDataSetD6.setColor(a7.b.getColor(context, i59));
                                            lineDataSetD6.setFillColor(context.getColor(i59));
                                            lineDataSetD6.setFillAlpha(127);
                                            r22.a aVar12 = fVar3.f161050e;
                                            if (aVar12 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD6.setFillFormatter(aVar12);
                                            lineData2.addDataSet(lineDataSetD5);
                                            lineData2.addDataSet(lineDataSetD4);
                                            lineData2.addDataSet(lineDataSetD6);
                                            int iC3 = fVar3.c(fVar12.f106842g);
                                            ArrayList arrayList9 = new ArrayList();
                                            arrayList9.add(new Entry(0.0f, iC3));
                                            float f26 = i58;
                                            arrayList9.add(new Entry(f26, iC3));
                                            LineDataSet lineDataSetD7 = sw.f.d(arrayList9);
                                            lineDataSetD7.setColor(a7.b.getColor(context, i57));
                                            lineDataSetD7.setFillAlpha(127);
                                            ArrayList arrayList10 = new ArrayList();
                                            arrayList10.add(new Entry(f26, 0));
                                            arrayList10.add(new Entry(f26, iC3));
                                            LineDataSet lineDataSetD8 = sw.f.d(arrayList10);
                                            lineDataSetD8.setColor(i48);
                                            lineDataSetD8.setFillColor(i48);
                                            lineDataSetD8.setFillAlpha(255);
                                            r22.a aVar13 = fVar3.f161050e;
                                            if (aVar13 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD8.setFillFormatter(aVar13);
                                            LineDataSet lineDataSetD9 = sw.f.d(arrayList10);
                                            lineDataSetD9.setColor(a7.b.getColor(context, i57));
                                            lineDataSetD9.setFillColor(context.getColor(i57));
                                            lineDataSetD9.setFillAlpha(127);
                                            r22.a aVar14 = fVar3.f161050e;
                                            if (aVar14 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD9.setFillFormatter(aVar14);
                                            lineData2.addDataSet(lineDataSetD8);
                                            lineData2.addDataSet(lineDataSetD7);
                                            lineData2.addDataSet(lineDataSetD9);
                                            int iC4 = fVar3.c(fVar11.f106842g);
                                            ArrayList arrayList11 = new ArrayList();
                                            float f27 = i56;
                                            arrayList11.add(new Entry(f27, 0));
                                            arrayList11.add(new Entry(f27, iC4));
                                            LineDataSet lineDataSetD10 = sw.f.d(arrayList11);
                                            lineDataSetD10.setColor(i48);
                                            lineDataSetD10.setFillColor(i48);
                                            lineDataSetD10.setFillAlpha(255);
                                            r22.a aVar15 = fVar3.f161050e;
                                            if (aVar15 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD10.setFillFormatter(aVar15);
                                            LineDataSet lineDataSetD11 = sw.f.d(arrayList11);
                                            lineDataSetD11.setColor(a7.b.getColor(context, i55));
                                            lineDataSetD11.setFillColor(context.getColor(i55));
                                            lineDataSetD11.setFillAlpha(127);
                                            r22.a aVar16 = fVar3.f161050e;
                                            if (aVar16 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD11.setFillFormatter(aVar16);
                                            ArrayList arrayList12 = new ArrayList();
                                            arrayList12.add(new Entry(0.0f, iC4));
                                            arrayList12.add(new Entry(f27, iC4));
                                            LineDataSet lineDataSetD12 = sw.f.d(arrayList12);
                                            lineDataSetD12.setColor(a7.b.getColor(context, i55));
                                            lineDataSetD12.setFillAlpha(127);
                                            lineData2.addDataSet(lineDataSetD10);
                                            lineData2.addDataSet(lineDataSetD12);
                                            lineData2.addDataSet(lineDataSetD11);
                                            int iC5 = fVar3.c(fVar10.f106842g);
                                            ArrayList arrayList13 = new ArrayList();
                                            float f28 = i54;
                                            arrayList13.add(new Entry(f28, 0));
                                            arrayList13.add(new Entry(f28, iC5));
                                            LineDataSet lineDataSetD13 = sw.f.d(arrayList13);
                                            lineDataSetD13.setColor(i48);
                                            lineDataSetD13.setFillColor(i48);
                                            lineDataSetD13.setFillAlpha(255);
                                            r22.a aVar17 = fVar3.f161050e;
                                            if (aVar17 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD13.setFillFormatter(aVar17);
                                            LineDataSet lineDataSetD14 = sw.f.d(arrayList13);
                                            lineDataSetD14.setColor(a7.b.getColor(context, i49));
                                            lineDataSetD14.setFillColor(context.getColor(i49));
                                            lineDataSetD14.setFillAlpha(127);
                                            r22.a aVar18 = fVar3.f161050e;
                                            if (aVar18 == null) {
                                                p005kotlin.jvm.internal.s.m("fillFormatterX");
                                                throw null;
                                            }
                                            lineDataSetD14.setFillFormatter(aVar18);
                                            ArrayList arrayList14 = new ArrayList();
                                            arrayList14.add(new Entry(0.0f, iC5));
                                            arrayList14.add(new Entry(f28, iC5));
                                            LineDataSet lineDataSetD15 = sw.f.d(arrayList14);
                                            lineDataSetD15.setColor(a7.b.getColor(context, i49));
                                            lineDataSetD15.setFillAlpha(127);
                                            lineData2.addDataSet(lineDataSetD13);
                                            lineData2.addDataSet(lineDataSetD14);
                                            lineData2.addDataSet(lineDataSetD15);
                                            i14 = 0;
                                            lineData2.setDrawValues(false);
                                            lineData = lineData2;
                                            combinedData = combinedData2;
                                        }
                                    }
                                    combinedData.setData(lineData);
                                    oz.a aVar19 = aVar;
                                    aVar19.setData(combinedData);
                                    aVar19.notifyDataSetChanged();
                                    aVar19.invalidate();
                                    aVar19.setVisibility(i14);
                                }
                            }
                            aVar = aVar5;
                            combinedData = combinedData2;
                            i14 = 0;
                            combinedData.setData(lineData);
                            oz.a aVar110 = aVar;
                            aVar110.setData(combinedData);
                            aVar110.notifyDataSetChanged();
                            aVar110.invalidate();
                            aVar110.setVisibility(i14);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 4:
                fg0.k kVar = (fg0.k) obj4;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar20 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a) obj3;
                ww1.g gVar = (ww1.g) obj;
                rt1.q qVar = rt1.q.f154552a;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list6 = aVar20.z6().J1;
                qVar.getClass();
                if (!rt1.q.a(kVar, list6) || gVar == null) {
                    boolean z14 = (gVar == null || !gVar.f187763a || gVar.f187767e == null) ? false : true;
                    fg0.k kVar2 = aVar20.K0;
                    if (kVar2 != null) {
                        Integer num = (Integer) ((androidx.lifecycle.s0) aVar20.z6().f121691l1.getValue()).d();
                        int iIntValue5 = num != null ? num.intValue() : 0;
                        CalendarItemDTO calendarItemDTO = new CalendarItemDTO();
                        fg0.c eventPrivacy = kVar2.getEventPrivacy();
                        calendarItemDTO.I1 = (eventPrivacy == null || (isShareable = eventPrivacy.getIsShareable()) == null) ? false : isShareable.booleanValue();
                        calendarItemDTO.H1 = kVar2.getShareableEventUuid();
                        Long l14 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        calendarItemDTO.f30967a = l14 != null ? (int) l14.longValue() : 0;
                        androidx.fragment.app.m activity = aVar20.getActivity();
                        if (activity != null) {
                            EventGoalActivity.a aVar21 = EventGoalActivity.f45976e;
                            Context contextRequireContext = aVar20.requireContext();
                            contextRequireContext.getClass();
                            aVar21.getClass();
                            activity.startActivityForResult(EventGoalActivity.a.a(contextRequireContext, kVar2, calendarItemDTO, iIntValue5, z14, null), 123);
                        }
                    }
                } else {
                    androidx.fragment.app.m activity2 = aVar20.getActivity();
                    if (activity2 != null) {
                        EventTrainingPlanIntegrationActivity.a aVar22 = EventTrainingPlanIntegrationActivity.f46267e;
                        Integer num2 = (Integer) ((androidx.lifecycle.s0) aVar20.z6().f121691l1.getValue()).d();
                        int iIntValue6 = num2 != null ? num2.intValue() : 0;
                        aVar22.getClass();
                        EventTrainingPlanIntegrationActivity.a.a(activity2, kVar, gVar, iIntValue6, false);
                    } else {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("EventDetailsFragment", "Error in getting activity for launching Training plan flow");
                    }
                }
                return Unit.INSTANCE;
            case 5:
                fg0.k kVar3 = (fg0.k) obj3;
                long jLongValue = ((Long) obj).longValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar23 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                mg0.b.d(kVar3, com.garmin.android.apps.connectmobile.workouts.data.model.c.b((com.garmin.android.apps.connectmobile.workouts.data.model.c) obj4, Integer.valueOf((int) jLongValue)));
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.e) obj2).w6().M5(kVar3);
                return Unit.INSTANCE;
            case 6:
                ((p3.l1) obj2).u(u42.b.b(true, ((Boolean) ((p1) obj4).getF182175a()).booleanValue(), ((Boolean) ((p1) obj3).getF182175a()).booleanValue(), ((Double) obj).doubleValue()));
                return Unit.INSTANCE;
            case 7:
                RaceTimePredictionActivity raceTimePredictionActivity = (RaceTimePredictionActivity) obj3;
                lc.k0 k0Var = (lc.k0) obj;
                RaceTimePredictionActivity.a aVar24 = RaceTimePredictionActivity.f41078b;
                k0Var.getClass();
                nc.n.b(k0Var, com.garmin.android.apps.connectmobile.race_time_prediction.presentation.a.b.f41086b.f41084a, null, null, null, null, null, null, new z3.e(434817200, true, new i91.e((fg0.k) obj4, 29, raceTimePredictionActivity, (lc.m0) obj2)), 254);
                String str3 = com.garmin.android.apps.connectmobile.race_time_prediction.presentation.a.C0777a.f41085b.f41084a;
                str3.getClass();
                lc.a.b bVar5 = new lc.a.b(k0Var.f111792h);
                bVar5.f111717g = HelpActivity.a.b(HelpActivity.f36653a, raceTimePredictionActivity, ro0.l.RACE_TIME_PREDICTION, null, 12);
                bVar5.l(str3);
                k0Var.f111797m.add(bVar5);
                return Unit.INSTANCE;
            case 8:
                zl.b bVar6 = (zl.b) obj4;
                Activity activity3 = (Activity) obj3;
                lc.k0 k0Var2 = (lc.k0) obj;
                k0Var2.getClass();
                z3.e eVar = new z3.e(-851050494, true, new ul.a(bVar6, i19, activity3, (lc.m0) obj2));
                p13.k0 k0Var3 = p13.k0.f134949a;
                k0Var3.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var2, t0Var.b(vl.a.c.class), k0Var3, j0Var, null, null, null, null, eVar);
                lc.f0 f0Var = new lc.f0();
                f0Var.f111765d = "connect://dailyPulseOxAcclimationReport";
                f0Var.f111766e = "android.intent.action.VIEW";
                Unit unit2 = Unit.INSTANCE;
                lc.d0.a aVar25 = f0Var.f111762a;
                aVar25.getClass();
                aVar25.f111748a = "connect://dailyPulseOxAcclimationReport";
                String str4 = f0Var.f111766e;
                if (str4 != null) {
                    aVar25.b(str4);
                }
                nc.n.a(k0Var2, t0Var.b(vl.a.b.class), k0Var3, p13.w.c(aVar25.a()), null, null, null, null, new z3.e(-831248391, true, new m1(i16, bVar6, activity3)));
                return Unit.INSTANCE;
            case 9:
                dy1.r rVar2 = (dy1.r) obj4;
                p1 p1Var = (p1) obj3;
                p1 p1Var2 = (p1) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str5 = i3Var.f111063a;
                int iHashCode = str5.hashCode();
                if (iHashCode != 2213697) {
                    if (iHashCode != 298400537) {
                        if (iHashCode == 1888846340 && str5.equals("REMOVE_PLAN")) {
                            p1Var.setValue(Boolean.TRUE);
                        }
                    } else if (str5.equals("QUIT_PLAN")) {
                        p1Var2.setValue(Boolean.TRUE);
                    }
                } else if (str5.equals("HELP") && rVar2 != null && (aVar2 = rVar2.f61630v) != null) {
                    aVar2.invoke();
                }
                return Unit.INSTANCE;
            case 10:
                return a(obj);
            case 11:
                k30.k kVar4 = (k30.k) obj2;
                k30.k kVar5 = (k30.k) obj;
                v40.d.a aVar26 = v40.d.f175552h;
                kVar5.getClass();
                ((p1) obj4).setValue(kVar5);
                x40.l lVar = ((v40.d) obj3).f175553g;
                if (lVar != null) {
                    CreateCustomCourseActivity createCustomCourseActivity = lVar.f188713a;
                    a50.c.p0 p0Var2 = new a50.c.p0(kVar5);
                    CreateCustomCourseActivity.a aVar27 = CreateCustomCourseActivity.f33013f;
                    createCustomCourseActivity.ha(p0Var2);
                }
                Bundle bundle = new Bundle(2);
                int i65 = v40.d.b.f175554a[kVar4.ordinal()];
                if (i65 == 1) {
                    str = "Popularity";
                } else if (i65 == 2) {
                    str = "FollowRoads";
                } else if (i65 == 3) {
                    str = "MinAscent";
                } else if (i65 == 4) {
                    str = "FreeFlow";
                } else {
                    if (i65 != 5) {
                        lc.u0.r();
                        return null;
                    }
                    str = "Freehand";
                }
                bundle.putString("Screen", "Courses");
                bundle.putString("Selection", str);
                ht.a.f85464a.getClass();
                ht.a.a(bundle, "SelectCourseRoutingOption");
                return Unit.INSTANCE;
            case 12:
                lc.m0 m0Var = (lc.m0) obj4;
                ((p3.i0) obj).getClass();
                nf0.c cVar = new nf0.c(i17, (e23.l) obj3, (com.garmin.android.apps.connectmobile.dashboard.presentation.d) obj2);
                m0Var.a(cVar);
                return new v70.c.a(m0Var, cVar);
            case 13:
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                List list7 = (List) ((x3) obj4).getF182175a();
                f0Var2.a(list7.size(), null, new v72.c.e(v72.c.d.f176191a, list7), new z3.e(802480018, true, new v72.c.f(list7, (Context) obj3, (lc.m0) obj2)));
                return Unit.INSTANCE;
            case 14:
                v92.r rVar3 = (v92.r) obj4;
                q92.x xVar = (q92.x) obj3;
                s92.g gVar2 = (s92.g) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i66 = v92.r.f176465l;
                if (zBooleanValue) {
                    rVar3.I4(xVar, q92.y.OPT_OUT, gVar2, null);
                }
                return Unit.INSTANCE;
            case 15:
                zc.d dVar = (zc.d) obj4;
                oe0.g gVar3 = (oe0.g) obj3;
                Context context2 = (Context) obj2;
                e2.f0 f0Var3 = (e2.f0) obj;
                f0Var3.getClass();
                if (dVar.b() == 0 && (dVar.d().f196385a instanceof yc.z0.c)) {
                    vd0.n0.f177333a.getClass();
                    e2.f0.b(f0Var3, null, vd0.n0.f177334b, 3);
                } else {
                    e2.f0.f(f0Var3, dVar.b(), new zc.a(new vb1.d(i18), dVar), new z3.e(88693269, true, new ul.a(dVar, i24, gVar3, context2)), 4);
                    if (dVar.d().f196387c instanceof yc.z0.b) {
                        vd0.n0.f177333a.getClass();
                        e2.f0.b(f0Var3, null, vd0.n0.f177335c, 3);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                androidx.appcompat.app.e.a aVar28 = (androidx.appcompat.app.e.a) obj;
                Logger logger = vn2.b0.f178864c;
                aVar28.getClass();
                aVar28.setTitle(R.string.wallet_remove_card);
                aVar28.setMessage(R.string.wallet_suica_message_remove_card_error);
                aVar28.setPositiveButton(R.string.lbl_ok, new bi2.k((vn2.b0) obj4, 28, (e23.a) obj3, (e23.a) obj2));
                return Unit.INSTANCE;
            case 17:
                Logger logger2 = vr2.c.f179562o;
                ((wr2.q.b) obj).getClass();
                ((vr2.c) obj4).f179573k.m(Boolean.FALSE);
                return Unit.INSTANCE;
            case 18:
                lc.m0 m0Var2 = (lc.m0) obj4;
                ((p3.i0) obj).getClass();
                nf0.c cVar2 = new nf0.c(i24, (e23.l) obj3, (e23.l) obj2);
                m0Var2.a(cVar2);
                return new com.garmin.android.apps.connectmobile.navigation.more.c.a(m0Var2, cVar2);
            case 19:
                vy2.b bVar7 = (vy2.b) obj4;
                vy2.i iVar = (vy2.i) obj3;
                obj.getClass();
                vy2.a aVar29 = new vy2.a((xy2.d) obj2, i19);
                uy2.j jVar = (uy2.j) iVar.f180851c.getAnnotation(uy2.j.class);
                if (jVar == null || (strArrKeys = jVar.keys()) == null) {
                    strArrKeys = new String[0];
                }
                int length = strArrKeys.length;
                int i67 = 0;
                while (i67 < length) {
                    String str6 = strArrKeys[i67];
                    vy2.h hVar = (vy2.h) iVar.a(vy2.h.f180846c);
                    hVar.getClass();
                    str6.getClass();
                    LinkedHashMap linkedHashMap = hVar.f180847b;
                    Object aVar30 = linkedHashMap.get(str6);
                    if (aVar30 == null) {
                        aVar30 = new m13.a();
                        linkedHashMap.put(str6, aVar30);
                    }
                    d13.v vVarG = ((m13.a) aVar30).g(l13.a.f108327b);
                    vy2.a aVar31 = aVar29;
                    vVarG.e(new vn2.t0(new t42.l(iVar, obj, bVar7, aVar31, 17), i18), w03.a.f181173d, w03.a.f181171b, w03.a.f181172c);
                    i67++;
                    aVar29 = aVar31;
                }
                return Unit.INSTANCE;
            case 20:
                DateTime dateTime = (DateTime) obj4;
                DateTime dateTime2 = (DateTime) obj3;
                zm1.s sVar = (zm1.s) obj2;
                View view2 = (View) obj;
                if (view2 instanceof CustomCombinedChart) {
                    CustomCombinedChart customCombinedChart = (CustomCombinedChart) view2;
                    dateTime.getClass();
                    LocalDate localDate = dateTime.toLocalDate();
                    localDate.getClass();
                    dateTime2.getClass();
                    LocalDate localDate2 = dateTime2.toLocalDate();
                    localDate2.getClass();
                    zm1.p pVar2 = new zm1.p(customCombinedChart, localDate, localDate2, true, zm1.o.SLEEP_SCORE, null, true, false, 32, null);
                    Context context3 = customCombinedChart.getContext();
                    context3.getClass();
                    pVar2.b(null);
                    String string = context3.getString(R.string.msg_no_sleep_score_data);
                    string.getClass();
                    uz.a.a(pVar2, sVar, g22.n.a(string), 4);
                }
                return Unit.INSTANCE;
            case 21:
                return b(obj);
            case 22:
                String str7 = (String) obj;
                str7.getClass();
                ((c2) obj2).setValue(str7);
                ((e23.l) obj4).invoke(new com.garmin.android.apps.connectmobile.userprofile.presentation.f.d(((m12.s.b) obj3).f115860a, str7));
                return Unit.INSTANCE;
            case 23:
                return c(obj);
            case 24:
                return d(obj);
            case 25:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                return g(obj);
            case 28:
                return h(obj);
            default:
                wi2.e eVar2 = (wi2.e) obj4;
                e23.l lVar2 = (e23.l) obj3;
                e23.l lVar3 = (e23.l) obj2;
                f.a aVar32 = (f.a) obj;
                aVar32.getClass();
                int i68 = aVar32.f67585a;
                if (i68 == -1) {
                    Intent intent = aVar32.f67586b;
                    String stringExtra = intent != null ? intent.getStringExtra("auto.login.uri.val") : null;
                    if (stringExtra == null || d53.w.J(stringExtra)) {
                        lVar2.invoke(ti2.c.h.f164613a);
                    } else {
                        eVar2.getClass();
                        p2 p2Var = eVar2.f185648i;
                        do {
                            value = p2Var.getValue();
                            ((wi2.d) value).getClass();
                        } while (!p2Var.b(value, new wi2.d(stringExtra)));
                    }
                } else if (i68 != 0) {
                    lVar2.invoke(ti2.c.h.f164613a);
                } else {
                    lVar3.invoke(ti2.b.i.f164604a);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ s0(Object obj, int i14, Object obj2, Object obj3) {
        this.f165661a = i14;
        this.f165663c = obj;
        this.f165664d = obj2;
        this.f165662b = obj3;
    }
}
