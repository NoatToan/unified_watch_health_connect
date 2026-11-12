package t42;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.s0;
import c83.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import e2.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l72.i3;
import lc.m0;
import lc.u0;
import o53.b0;
import o72.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p006l2.j2;
import p006l2.m2;
import p13.h0;
import p13.j0;
import p13.w;
import p3.n1;
import p3.p1;
import p3.x3;
import qs.y;
import t21.v0;
import ta0.e1;
import tn2.k0;
import tn2.l0;
import tn2.r0;
import vd0.b2;
import vd0.c2;
import vd0.d2;
import vd0.e2;
import vd0.t1;
import vd0.u1;
import vd0.v1;
import vd0.w1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f162355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f162356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f162357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f162358e;

    public /* synthetic */ l(Context context, e23.l lVar, p1 p1Var, p1 p1Var2) {
        this.f162354a = 21;
        this.f162357d = context;
        this.f162355b = lVar;
        this.f162356c = p1Var;
        this.f162358e = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String strName;
        gg0.i unit;
        Double value;
        uy2.b bVar;
        wu2.e eVar;
        int i14 = this.f162354a;
        int i15 = 12;
        String str = "";
        int i16 = 8;
        Object obj2 = this.f162358e;
        Object obj3 = this.f162357d;
        Object obj4 = this.f162356c;
        Object obj5 = this.f162355b;
        switch (i14) {
            case 0:
                sz.a aVar = (sz.a) obj5;
                q42.g gVar = (q42.g) obj4;
                Context context = (Context) obj3;
                l42.d dVar = (l42.d) obj2;
                ((CustomCombinedChart) obj).getClass();
                aVar.c();
                l42.k kVar = gVar.f142641a;
                qz.a.b(aVar, kVar != null ? new s42.c(kVar, w.c(dVar), gVar.f142642b) : null, context.getString(R.string.common_no_data), 4);
                return Unit.INSTANCE;
            case 1:
                e23.l lVar = (e23.l) obj4;
                String str2 = (String) obj3;
                l90.b bVar2 = (l90.b) obj2;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) h0.e0(((Integer) obj).intValue(), ((va0.a) ((p1) obj5).getF182175a()).f176568b);
                if (bluetoothDevice != null) {
                    lVar.invoke(new q90.d.b(bluetoothDevice, str2, bVar2));
                }
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj5;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0Var.a(list.size(), new e1.f(new t52.c(12), list), new e1.g(e1.e.f163302a, list), new z3.e(802480018, true, new e1.h(list, (e23.l) obj4, (e23.l) obj3)));
                f0.b(f0Var, null, new z3.e(-1024369451, true, new ak0.p((e23.a) obj2, 20)), 3);
                return Unit.INSTANCE;
            case 3:
                hv.a aVar2 = (hv.a) obj5;
                p1 p1Var = (p1) obj4;
                n1 n1Var = (n1) obj3;
                p1 p1Var2 = (p1) obj2;
                int iIntValue = ((Integer) obj).intValue();
                String strB = aVar2.b(0, iIntValue);
                if (strB != null) {
                    p1Var.setValue(strB);
                }
                Drawable drawableA = aVar2.a(0, iIntValue);
                n1Var.t(iIntValue);
                p1Var2.setValue(Boolean.valueOf(aVar2.d(0, iIntValue) && drawableA != null));
                return Unit.INSTANCE;
            case 4:
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                List<sg1.c> list2 = ((sg1.d) obj5).f159213c;
                f0Var2.a(list2.size(), null, new tg1.c(tg1.b.f164503a, list2), new z3.e(802480018, true, new tg1.d(list2, (pg1.d) obj4, (e23.l) obj3, (b0) obj2)));
                return Unit.INSTANCE;
            case 5:
                tn.m mVar = (tn.m) obj5;
                Context context2 = (Context) obj3;
                p1 p1Var3 = (p1) obj4;
                p1 p1Var4 = (p1) obj2;
                String str3 = (String) obj;
                int i17 = tn.m.f165476e;
                str3.getClass();
                mVar.f165480d = str3;
                p1Var3.setValue(str3);
                String str4 = (String) p1Var3.getF182175a();
                String str5 = mVar.f165477a;
                if (!p005kotlin.jvm.internal.s.g(str4, str5) && (str5 != null || !p005kotlin.jvm.internal.s.g(mVar.f165480d, ""))) {
                    p1Var4.setValue(mVar.b(context2));
                }
                if (p005kotlin.jvm.internal.s.g((String) p1Var3.getF182175a(), str5)) {
                    p1Var4.setValue(null);
                }
                return Unit.INSTANCE;
            case 6:
                r0 r0Var = (r0) obj5;
                String str6 = (String) obj2;
                r0.b bVar3 = (r0.b) obj;
                Logger logger = r0.f165631n;
                bVar3.getClass();
                String str7 = bVar3.f165645a;
                String str8 = bVar3.f165646b;
                pn2.n nVar = r0Var.f165637f;
                nVar.getClass();
                qn2.t tVarB = nVar.b((String) obj4, (String) obj3, str8);
                r0Var.f165638g.getClass();
                pn2.m<qn2.t, rn2.e> mVar2 = new pn2.m<>(tVarB, new rn2.e(str7));
                mn2.b bVar4 = r0Var.f165633b;
                String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
                Logger logger2 = mn2.j.f119822a;
                bVar4.getClass();
                strValueOf.getClass();
                q03.r<a0<pn2.p<rn2.r>>> rVarF = bVar4.f(strValueOf, str6, mVar2);
                mn2.e eVar2 = new mn2.e(new mn2.f(bVar4, strValueOf, str6, mVar2, 2), 6);
                rVarF.getClass();
                int i18 = w03.b.f181178a;
                return new e13.j(rVarF, eVar2);
            case 7:
                r0 r0Var2 = (r0) obj5;
                String str9 = (String) obj4;
                String str10 = (String) obj3;
                e23.l lVar2 = (e23.l) obj2;
                tn2.w.f fVar = (tn2.w.f) obj;
                Logger logger3 = r0.f165631n;
                fVar.getClass();
                tn2.f fVar2 = tn2.f.f165551a;
                byte[] bArr = fVar.f165719a;
                bArr.getClass();
                fVar2.getClass();
                String strA = tn2.f.a(bArr);
                Byte b14 = fVar.f165725g;
                b14.getClass();
                String strA2 = tn2.f.a(new byte[]{b14.byteValue()});
                byte[] bArr2 = fVar.f165723e;
                bArr2.getClass();
                String strA3 = tn2.f.a(bArr2);
                String strB2 = qn2.u.f145900a.b();
                pn2.n nVar2 = r0Var2.f165637f;
                nVar2.getClass();
                qn2.t tVarB2 = nVar2.b(strB2, strA2, null);
                r0Var2.f165638g.getClass();
                str9.getClass();
                str10.getClass();
                pn2.m<qn2.t, qn2.e> mVar3 = new pn2.m<>(tVarB2, new qn2.e(str9, new pn2.r(null, null, new pn2.l(str10), null, null)));
                mn2.b bVar5 = r0Var2.f165633b;
                String strValueOf2 = String.valueOf(r0Var2.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str11 = pn2.a.e().f138762b;
                Logger logger4 = mn2.j.f119822a;
                bVar5.getClass();
                strValueOf2.getClass();
                str11.getClass();
                q03.r<a0<pn2.p<rn2.e>>> rVarB = bVar5.b(strValueOf2, strA, str11, mVar3);
                mn2.e eVar3 = new mn2.e(new mn2.d(lVar2, bVar5, strValueOf2, strA, str11, mVar3, 10), 20);
                rVarB.getClass();
                int i19 = w03.b.f181178a;
                return new e13.r(new e13.j(new e13.j(rVarB, eVar3), new k0(new l0(r0Var2, strA3, strB2, strA, strA2, lVar2, 2), 19)), new k0(new tn2.h0(r0Var2, str9, 9), 20));
            case 8:
                fg0.k kVar2 = (fg0.k) obj5;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a0) obj4;
                CalendarItemDTO calendarItemDTO = (CalendarItemDTO) obj3;
                e23.a aVar3 = (e23.a) obj2;
                ww1.g gVar2 = (ww1.g) obj;
                rt1.q qVar = rt1.q.f154552a;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                List list3 = (List) ((s0) a0Var.F6().R0.getValue()).d();
                if (list3 == null) {
                    list3 = j0.f134944a;
                }
                qVar.getClass();
                if (!rt1.q.a(kVar2, list3) || gVar2 == null) {
                    boolean z14 = (gVar2 == null || !gVar2.f187763a || gVar2.f187767e == null) ? false : true;
                    EventGoalActivity.a aVar5 = EventGoalActivity.f45976e;
                    Context contextRequireContext = a0Var.requireContext();
                    contextRequireContext.getClass();
                    ArrayList arrayList = a0Var.F6().I;
                    int size = arrayList != null ? arrayList.size() : 0;
                    aVar5.getClass();
                    a0Var.startActivity(EventGoalActivity.a.a(contextRequireContext, kVar2, calendarItemDTO, size, z14, null));
                } else {
                    androidx.fragment.app.m activity = a0Var.getActivity();
                    if (activity != null) {
                        EventTrainingPlanIntegrationActivity.a aVar6 = EventTrainingPlanIntegrationActivity.f46267e;
                        ArrayList arrayList2 = a0Var.F6().I;
                        int size2 = arrayList2 != null ? arrayList2.size() : 0;
                        aVar6.getClass();
                        EventTrainingPlanIntegrationActivity.a.a(activity, kVar2, gVar2, size2, true);
                    }
                }
                aVar3.invoke();
                return Unit.INSTANCE;
            case 9:
                String str12 = (String) obj5;
                vc0.u uVar = (vc0.u) obj4;
                String str13 = (String) obj3;
                gj1.c cVar = (gj1.c) obj2;
                vm2.h hVar = (vm2.h) obj;
                Logger logger5 = vc0.u.f177013l;
                kh2.g.f104792a.getClass();
                kh2.g.a.b();
                if (hVar != null && hVar.f178831a) {
                    new Handler(Looper.getMainLooper()).post(new uj2.b(uVar, 5, str13, cVar));
                    return Unit.INSTANCE;
                }
                kh2.j jVar = vc0.u.f177014m;
                if (jVar != null) {
                    jVar.a(str12);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("deviceRemovalOperationDelegate");
                throw null;
            case 10:
                e23.a aVar7 = (e23.a) obj5;
                e23.a aVar8 = (e23.a) obj4;
                x3 x3Var = (x3) obj3;
                p1 p1Var5 = (p1) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str14 = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str14, "ADD_DOG")) {
                    i53.c cVar2 = (i53.c) x3Var.getF182175a();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : cVar2) {
                        if (((pe0.h) obj6).f137444c == je0.j.ACTIVE) {
                            arrayList3.add(obj6);
                        }
                    }
                    if (arrayList3.size() >= 10) {
                        p1Var5.setValue(Boolean.TRUE);
                    } else {
                        aVar7.invoke();
                    }
                } else if (p005kotlin.jvm.internal.s.g(str14, "HELP")) {
                    aVar8.invoke();
                }
                return Unit.INSTANCE;
            case 11:
                pe0.f fVar3 = (pe0.f) obj5;
                e23.a aVar9 = (e23.a) obj4;
                p1 p1Var6 = (p1) obj3;
                p1 p1Var7 = (p1) obj2;
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                String str15 = i3Var2.f111063a;
                if (p005kotlin.jvm.internal.s.g(str15, "retire")) {
                    if (fVar3.f137427h == je0.j.ACTIVE) {
                        p1Var6.setValue(Boolean.TRUE);
                    } else {
                        aVar9.invoke();
                    }
                } else if (p005kotlin.jvm.internal.s.g(str15, "remove")) {
                    p1Var7.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 12:
                List listC0 = (List) obj5;
                i53.c cVar3 = (i53.c) obj3;
                p1 p1Var8 = (p1) obj2;
                f0 f0Var3 = (f0) obj;
                f0Var3.getClass();
                if (((String) ((p1) obj4).getF182175a()).length() == 0) {
                    listC0 = h0.C0(w.c(null), listC0);
                }
                f0Var3.a(listC0.size(), new u1(new vb1.d(15), listC0), new v1(t1.f177388a, listC0), new z3.e(802480018, true, new w1(listC0, cVar3, p1Var8)));
                return Unit.INSTANCE;
            case 13:
                List listC1 = (List) obj5;
                pe0.d dVar2 = (pe0.d) obj3;
                p1 p1Var9 = (p1) obj2;
                f0 f0Var4 = (f0) obj;
                f0Var4.getClass();
                if (((String) ((p1) obj4).getF182175a()).length() == 0) {
                    listC1 = h0.C0(w.c(null), listC1);
                }
                f0Var4.a(listC1.size(), new c2(new vb1.d(16), listC1), new d2(b2.f177176a, listC1), new z3.e(802480018, true, new e2(listC1, dVar2, p1Var9)));
                return Unit.INSTANCE;
            case 14:
                vv2.e eVar4 = (vv2.e) obj5;
                dx2.c cVar4 = (dx2.c) obj4;
                Map<String, ? extends Object> map = (Map) obj3;
                vv2.d dVar3 = (vv2.d) obj2;
                cx2.h hVar2 = vv2.e.f180551f;
                eVar4.j(cVar4, map, null);
                StyledTextView styledTextView = eVar4.f180552a;
                String strB3 = dVar3.b(dx2.c.M4(map));
                if (strB3.length() == 0) {
                    vv2.e.f180551f.d(null, "Did not find the translation for Row ID: " + map.get(gw2.i.ROW_ID.f79975a));
                    eVar4.f180555d.setVisibility(8);
                }
                styledTextView.setText(strB3);
                cx2.g.g(eVar4.f180553b, dVar3.e(cVar4, map));
                ImageView imageView = eVar4.f180554c;
                kv2.d dVarN4 = cVar4.N4(map);
                if (dVarN4 != null && h0.R(dVarN4.f106815a, map.get(gw2.i.INDEX.f79975a))) {
                    i16 = 0;
                }
                imageView.setVisibility(i16);
                return Unit.INSTANCE;
            case 15:
                m0 m0Var = (m0) obj5;
                vy0.t tVar = (vy0.t) obj4;
                e23.a aVar10 = (e23.a) obj3;
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                z3.e eVar5 = new z3.e(1394303894, true, new ul.a(m0Var, tVar, aVar10));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                j0 j0Var = j0.f134944a;
                t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                nc.n.a(k0Var, t0Var.b(MoreNavigationRoute.MoreScreen.class), k0Var2, j0Var, null, null, null, null, eVar5);
                nc.n.a(k0Var, t0Var.b(MoreNavigationRoute.BaseFeatureScreen.class), k0Var2, j0Var, null, null, null, null, new z3.e(840753343, true, new qw.b(tVar, (ty0.b) obj2, m0Var, aVar10, 9)));
                nc.n.a(k0Var, t0Var.b(MoreNavigationRoute.SettingsScreen.class), k0Var2, j0Var, null, null, null, null, new z3.e(1286290654, true, new m1(14, tVar, aVar10)));
                return Unit.INSTANCE;
            case 16:
                vy1.e eVar6 = (vy1.e) obj5;
                fg0.k kVar3 = (fg0.k) obj4;
                fg0.o oVar = (fg0.o) obj3;
                CalendarItemDTO calendarItemDTO2 = (CalendarItemDTO) obj2;
                fw.m mVar4 = (fw.m) obj;
                vy1.e.a aVar11 = vy1.e.T;
                fw.p pVar = mVar4.f73769b;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list4 = (List) mVar4.f73770c;
                int i24 = vy1.e.b.f180827b[pVar.ordinal()];
                if (i24 == 1) {
                    g22.e.l(eVar6);
                } else if (i24 == 2) {
                    g22.e.f(eVar6);
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(eVar6);
                    if (list4 != null) {
                        fg0.d completionTarget = kVar3.getCompletionTarget();
                        AddTIEventViewModel addTIEventViewModelC6 = eVar6.C6();
                        double dDoubleValue = (completionTarget == null || (value = completionTarget.getValue()) == null) ? 0.0d : value.doubleValue();
                        y.a aVar12 = y.f147222b;
                        if (completionTarget == null || (unit = completionTarget.getUnit()) == null || (strName = unit.name()) == null) {
                            strName = y.UNIT_DISTANCE_KILOMETER.f147239a;
                        }
                        aVar12.getClass();
                        y yVarA = y.a.a(strName);
                        if (yVarA == null) {
                            yVarA = y.UNIT_DISTANCE_KILOMETER;
                        }
                        addTIEventViewModelC6.f6(list4, dDoubleValue, yVarA);
                        com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD = eVar6.C6().V5().d();
                        oVar.t(fVarD != null ? fVarD.f() : null);
                        eVar6.G6(calendarItemDTO2, oVar, kVar3);
                    }
                }
                return Unit.INSTANCE;
            case 17:
                vy2.i iVar = (vy2.i) obj5;
                vy2.b bVar6 = (vy2.b) obj3;
                vy2.a aVar13 = (vy2.a) obj2;
                uy2.s0 s0Var = (uy2.s0) iVar.f180851c.getAnnotation(uy2.s0.class);
                if (s0Var != null && (bVar = (uy2.b) l23.f.a(p005kotlin.jvm.internal.s0.f105811a.b(s0Var.providerClass()))) != null) {
                    bVar.a(obj4, iVar.f180852d);
                }
                bVar6.b(obj4, (uy2.c) aVar13.invoke());
                return Unit.INSTANCE;
            case 18:
                DateTime dateTime = (DateTime) obj5;
                DateTime dateTime2 = (DateTime) obj4;
                Context context3 = (Context) obj3;
                a71.e eVar7 = (a71.e) obj2;
                View view2 = (View) obj;
                o13.p pVar2 = new o13.p(dateTime != null ? dateTime.toLocalDate() : null, dateTime2 != null ? dateTime2.toLocalDate() : null);
                LocalDate localDate = (LocalDate) pVar2.f128594a;
                LocalDate localDate2 = (LocalDate) pVar2.f128595b;
                if (localDate != null && localDate2 != null) {
                    DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                    DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
                    View viewFindViewById = view2.findViewById(R.id.acute_load_summary_chart);
                    viewFindViewById.getClass();
                    CustomLineChart customLineChart = (CustomLineChart) viewFindViewById;
                    View viewFindViewById2 = view2.findViewById(R.id.view_custom_legend);
                    String string = context3.getString(R.string.tr_factor_acute_load);
                    string.getClass();
                    ((CustomLegendView) viewFindViewById2).setChartTitle(string);
                    viewFindViewById2.getClass();
                    Context context4 = view2.getContext();
                    context4.getClass();
                    dateTimeAtStartOfDay.getClass();
                    dateTimeAtStartOfDay2.getClass();
                    tz.a aVar14 = new tz.a(customLineChart, new b71.f(context4, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, null, 8, null), new b71.g(customLineChart, dateTimeAtStartOfDay, dateTimeAtStartOfDay2), new k00.m(customLineChart), null, (CustomLegendView) viewFindViewById2, 16, null);
                    aVar14.c();
                    String string2 = context3.getString(R.string.txt_empty_page_no_data);
                    string2.getClass();
                    qz.a.b(aVar14, eVar7, string2, 4);
                }
                return Unit.INSTANCE;
            case 19:
                z31.b bVar7 = (z31.b) obj5;
                b41.b bVar8 = (b41.b) obj4;
                String str16 = (String) obj3;
                x3 x3Var2 = (x3) obj2;
                ((CustomCombinedChart) obj).getClass();
                if (bVar7 != null) {
                    bVar7.f202147i = ((o41.b) x3Var2.getF182175a()).f129072a != null;
                }
                if (bVar8 != null) {
                    qz.a.b(bVar8, bVar7, str16, 4);
                }
                return Unit.INSTANCE;
            case 20:
                ((p1) obj4).setValue(Boolean.TRUE);
                ge1.b.T((b0) obj5, null, null, new w02.e((w02.r) obj3, obj2, null), 3);
                return Unit.INSTANCE;
            case 21:
                e23.l lVar3 = (e23.l) obj5;
                p1 p1Var10 = (p1) obj4;
                p1 p1Var11 = (p1) obj2;
                ((f.a) obj).getClass();
                boolean z15 = a7.g.a((Context) obj3, "android.permission.CAMERA") == 0;
                lVar3.invoke(Boolean.valueOf(z15));
                if (z15) {
                    w11.d.c(p1Var10, false);
                    w11.d.d(p1Var11, false);
                } else {
                    w11.d.c(p1Var10, true);
                    w11.d.d(p1Var11, false);
                }
                return Unit.INSTANCE;
            case 22:
                x1.k kVar4 = (x1.k) obj4;
                e23.p pVar3 = (e23.p) obj3;
                w2.n nVar3 = (w2.n) obj2;
                x1.i iVar2 = (x1.i) obj;
                int i25 = ((j2) ((x3) obj5).getF182175a()).f108586a;
                w2.a0.h(iVar2, kVar4, pVar3, nVar3, m2.f108656d, (i25 & 4) == 4);
                w2.a0.h(iVar2, kVar4, pVar3, nVar3, m2.f108657e, (i25 & 1) == 1);
                w2.a0.h(iVar2, kVar4, pVar3, nVar3, m2.f108658f, (i25 & 2) == 2);
                w2.a0.h(iVar2, kVar4, pVar3, nVar3, m2.f108659g, (i25 & 8) == 8);
                w2.a0.h(iVar2, kVar4, pVar3, nVar3, m2.f108660h, (i25 & 16) == 16);
                return Unit.INSTANCE;
            case 23:
                e23.a aVar15 = (e23.a) obj4;
                w2.n nVar4 = (w2.n) obj3;
                w2.j0 j0Var2 = (w2.j0) obj2;
                o2.h hVar3 = (o2.h) obj;
                ((e23.a) obj5).invoke();
                if (aVar15 != null ? ((Boolean) aVar15.invoke()).booleanValue() : true) {
                    hVar3.close();
                }
                nVar4.D(j0Var2);
                return Unit.INSTANCE;
            case 24:
                z31.b bVar9 = (z31.b) obj5;
                b41.b bVar10 = (b41.b) obj4;
                w31.h hVar4 = (w31.h) obj3;
                ((CustomCombinedChart) obj).getClass();
                bVar9.f202147i = ((o41.b) ((x3) obj2).getF182175a()).f129072a != null;
                qz.a.b(bVar10, bVar9, hVar4.f181867i, 4);
                return Unit.INSTANCE;
            case 25:
                w51.h0 h0Var = (w51.h0) obj4;
                Context context5 = (Context) obj3;
                ky0.w wVar = (ky0.w) obj2;
                f0 f0Var5 = (f0) obj;
                f0Var5.getClass();
                Map<b63.o, List<z51.h>> map2 = ((w51.w) ((p1) obj5).getF182175a()).f182449e;
                if (map2 != null) {
                    for (Map.Entry<b63.o, List<z51.h>> entry : map2.entrySet()) {
                        b63.o key = entry.getKey();
                        List<z51.h> value2 = entry.getValue();
                        f0.b(f0Var5, null, new z3.e(-1657163781, true, new v0(key, 17)), 3);
                        f0Var5.a(value2.size(), new w51.s(new w40.d(4), value2), new w51.t(w51.r.f182388a, value2), new z3.e(802480018, true, new w51.u(value2, h0Var, context5, key, wVar)));
                    }
                }
                return Unit.INSTANCE;
            case 26:
                String str17 = (String) obj3;
                String str18 = (String) obj2;
                p5.k0 k0Var3 = (p5.k0) obj;
                k0Var3.getClass();
                if (!p005kotlin.jvm.internal.s.g((String) obj5, ((w51.a) obj4).f182214a)) {
                    str17 = str18;
                }
                p5.h0.n(k0Var3, str17);
                return Unit.INSTANCE;
            case 27:
                e23.p pVar4 = (e23.p) obj5;
                Context context6 = (Context) obj;
                context6.getClass();
                w52.d dVar4 = new w52.d(context6, null, 0, 6, null);
                dVar4.f182494g = new n00.b(context6);
                dVar4.f182492e = new o62.b0(24, pVar4, (com.garmin.android.apps.connectmobile.workouts.data.model.a) obj4);
                dVar4.f182493f = new o62.b0(25, context6, pVar4);
                dVar4.f182495h = new vn2.t0((e23.q) obj3, i15);
                ((p1) obj2).setValue(new w52.b.a(dVar4));
                return dVar4;
            case 28:
                rz.a aVar16 = (rz.a) obj5;
                gs1.t tVar2 = (gs1.t) obj4;
                String str19 = (String) obj3;
                ((CustomBarChart) obj).getClass();
                if (!((Boolean) ((p1) obj2).getF182175a()).booleanValue()) {
                    qz.a.b(aVar16, new gt.a(tVar2, null, null, 6, null), str19, 4);
                }
                return Unit.INSTANCE;
            default:
                wu2.f fVar4 = (wu2.f) obj5;
                dx2.c cVar5 = (dx2.c) obj4;
                Map<String, ? extends Object> map3 = (Map) obj3;
                wu2.g gVar3 = (wu2.g) obj2;
                cx2.h hVar5 = wu2.f.f187344d;
                fVar4.j(cVar5, map3, null);
                StyledTextView styledTextView2 = fVar4.f187345a;
                String strF = gVar3.f(cVar5, map3);
                if (strF.length() == 0) {
                    wu2.f.f187344d.d(null, "Did not find the translation for Row ID: " + map3.get(gw2.i.ROW_ID.f79975a));
                    fVar4.f187347c.setVisibility(8);
                }
                styledTextView2.setText(strF);
                cx2.b.a aVar17 = cx2.b.f56665a;
                Object obj7 = map3.get(gw2.i.ROW_ID.f79975a);
                String string3 = obj7 != null ? obj7.toString() : null;
                aVar17.getClass();
                Object objF = cVar5.f61484a.f(gw2.j.ACTION, map3, cx2.b.a.c(string3));
                try {
                    if (!(objF instanceof wu2.e)) {
                        objF = null;
                    }
                    eVar = (wu2.e) objF;
                    break;
                } catch (ClassCastException unused) {
                    eVar = null;
                }
                tv2.c cVar6 = eVar != null ? eVar.f187343a : null;
                if (cVar6 != null) {
                    String strB4 = gVar3.b(cVar6);
                    if (strB4.length() > 0) {
                        str = strB4;
                    } else {
                        cx2.h hVar6 = gVar3.f187349b;
                        map3.toString();
                        hVar6.getClass();
                    }
                }
                cx2.g.g(fVar4.f187346b, str);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f162354a = i14;
        this.f162355b = obj;
        this.f162356c = obj2;
        this.f162357d = obj3;
        this.f162358e = obj4;
    }

    public /* synthetic */ l(tn.m mVar, Context context, p1 p1Var, p1 p1Var2) {
        this.f162354a = 5;
        this.f162355b = mVar;
        this.f162357d = context;
        this.f162356c = p1Var;
        this.f162358e = p1Var2;
    }
}
