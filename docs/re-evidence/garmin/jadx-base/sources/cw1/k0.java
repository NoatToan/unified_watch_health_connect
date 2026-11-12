package cw1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.ebike.EBikePerformanceChartsActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.g3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.m3;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p006l2.c3;
import p006l2.f3;
import p006l2.i3;
import p008y1.b2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56080e;

    public /* synthetic */ k0(int i14, String str, e23.l lVar, com.garmin.feature.garminpay.providers.gpay.snowball.ui.e eVar) {
        this.f56076a = 9;
        this.f56077b = i14;
        this.f56079d = str;
        this.f56078c = lVar;
        this.f56080e = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f56076a;
        int i15 = 10;
        int i16 = 2;
        int i17 = this.f56077b;
        Object obj2 = this.f56080e;
        Object obj3 = this.f56079d;
        Object obj4 = this.f56078c;
        switch (i14) {
            case 0:
                ((Boolean) obj).getClass();
                ((p3.n1) obj2).t(i17);
                ((e23.l) obj4).invoke(((jv1.q) obj3).f101113a);
                return Unit.INSTANCE;
            case 1:
                g81.y yVar = (g81.y) obj4;
                b63.o oVar = (b63.o) obj3;
                b63.o oVar2 = (b63.o) obj2;
                Context context = (Context) obj;
                context.getClass();
                CustomBarChart customBarChart = new CustomBarChart(context);
                g81.w wVar = yVar.f76423d;
                if (wVar != null) {
                    Collection<g81.o> collectionValues = wVar.f76415d.values();
                    ArrayList arrayList = new ArrayList(p13.y.r(collectionValues, 10));
                    Iterator<T> it = collectionValues.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Float.valueOf(((g81.o) it.next()).f76381a));
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            if (((Number) it3.next()).floatValue() > 0.0f) {
                                LocalDate localDateH = g22.l.h(oVar);
                                LocalDate localDateH2 = g22.l.h(oVar2);
                                float f14 = wVar.f76412a;
                                float f15 = wVar.f76413b;
                                i53.d<String, Integer> dVar = wVar.f76416e;
                                int i18 = this.f56077b;
                                qz.a.b(new rz.a(customBarChart, new b81.a(context, localDateH, localDateH2, i18, f14, f15, dVar), new b81.f(customBarChart, g22.l.h(oVar), i18, wVar.f76414c), new b81.d(customBarChart), new b81.e(customBarChart), null, 32, null), yVar.f76423d, context.getString(R.string.common_no_data), 4);
                                return customBarChart;
                            }
                        }
                    }
                }
                return customBarChart;
            case 2:
                g81.a0 a0Var = (g81.a0) obj4;
                b63.o oVar3 = (b63.o) obj3;
                Context context2 = (Context) obj;
                context2.getClass();
                i53.c<t71.a> cVar = a0Var.f76266c.f76427c;
                CustomLineChart customLineChart = new CustomLineChart(context2);
                customLineChart.setNoDataText(context2.getString(R.string.common_no_data));
                LocalDate localDateH3 = g22.l.h(oVar3);
                LocalDate localDateH4 = g22.l.h((b63.o) obj2);
                g81.z zVar = a0Var.f76266c;
                float f16 = zVar.f76425a;
                float f17 = zVar.f76426b;
                int i19 = this.f56077b;
                qz.a.b(new tz.a(customLineChart, new t71.d(context2, localDateH3, localDateH4, i19, f16, f17, R.color.teal_40), new t71.h(customLineChart, g22.l.h(oVar3), i19), new t71.c(customLineChart), null, null, 48, null), cVar, null, 6);
                return customLineChart;
            case 3:
                EBikePerformanceChartsActivity eBikePerformanceChartsActivity = (EBikePerformanceChartsActivity) obj4;
                ArrayList<im.b> arrayList2 = (ArrayList) obj3;
                fz.c cVar2 = (fz.c) obj2;
                EBikePerformanceChartsActivity.a aVar = EBikePerformanceChartsActivity.f29816a;
                LinearLayout linearLayout = (LinearLayout) ((View) obj).findViewById(R.id.activity_stats_chart_container);
                String string = eBikePerformanceChartsActivity.getResources().getString(R.string.no_value);
                string.getClass();
                for (im.b bVar : arrayList2) {
                    View viewInflate = LayoutInflater.from(eBikePerformanceChartsActivity).inflate(R.layout.gcm_chart_list_item, (ViewGroup) linearLayout, false);
                    viewInflate.getClass();
                    com.garmin.android.apps.connectmobile.activities.charts.b bVar2 = new com.garmin.android.apps.connectmobile.activities.charts.b(viewInflate);
                    String strW0 = bVar.getF113511u1();
                    TextView textView = bVar2.f28964c;
                    if (textView != null) {
                        textView.setText(strW0);
                    }
                    switch (bVar.getB1()) {
                        case 58:
                            l22.a aVar2 = new l22.a(eBikePerformanceChartsActivity);
                            l3.a aVar3 = l3.f23124b;
                            double d14 = bVar.d();
                            aVar3.getClass();
                            String strB0 = l3.a.B0(aVar2, d14, 0, string);
                            String strB1 = l3.a.B0(aVar2, bVar.g(), 0, string);
                            bVar2.j(true);
                            bVar2.d(strB0, eBikePerformanceChartsActivity.getString(R.string.lbl_battery_consumed));
                            bVar2.f(strB1, eBikePerformanceChartsActivity.getString(R.string.lbl_battery_remaining));
                            break;
                        case 59:
                        case 60:
                            bVar2.j(false);
                            break;
                    }
                    EBikePerformanceChartsActivity eBikePerformanceChartsActivity2 = eBikePerformanceChartsActivity;
                    ArrayList arrayList3 = arrayList2;
                    fz.c cVar3 = cVar2;
                    bVar2.itemView.setOnClickListener(new ew2.c(bVar, eBikePerformanceChartsActivity2, arrayList2, cVar2, 4));
                    ar.e.f(eBikePerformanceChartsActivity2, bVar2.f28969h, bVar2.f28970i, bVar2.f28971j, bVar, this.f56077b, null, null, false, null, null, fz.c.TIME);
                    if (linearLayout != null) {
                        linearLayout.addView(viewInflate);
                    }
                    eBikePerformanceChartsActivity = eBikePerformanceChartsActivity2;
                    arrayList2 = arrayList3;
                    cVar2 = cVar3;
                }
                return Unit.INSTANCE;
            case 4:
                hq.l lVar = (hq.l) obj3;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                List<hq.n> list = lVar.f85060b;
                f0Var.a(list.size(), null, new hq.t(list), new z3.e(2039820996, true, new hq.u(list, this.f56077b, (e23.l) obj4, lVar, (c2.a0) obj2)));
                return Unit.INSTANCE;
            case 5:
                p006l2.p1 p1Var = (p006l2.p1) obj4;
                f5.b1 b1Var = (f5.b1) obj3;
                f5.v1 v1Var = (f5.v1) obj2;
                f5.v1.a aVar4 = (f5.v1.a) obj;
                int i24 = p1Var.f108700b;
                f3 f3Var = p1Var.f108699a;
                x5.q0 q0Var = p1Var.f108701c;
                i3 i3VarInvoke = p1Var.f108702d.invoke();
                f3Var.a(b2.Horizontal, c3.a(aVar4, i24, q0Var, i3VarInvoke != null ? i3VarInvoke.f108575a : null, b1Var.getF68910b() == g6.o.Rtl, v1Var.f69144a), i17, v1Var.f69144a);
                f5.v1.a.B(aVar4, v1Var, Math.round(-f3Var.f108480a.getFloatValue()), 0);
                return Unit.INSTANCE;
            case 6:
                f5.v1 v1Var2 = (f5.v1) obj4;
                f5.v1 v1Var3 = (f5.v1) obj2;
                f5.v1.a aVar5 = (f5.v1.a) obj;
                aVar5.getClass();
                aVar5.r(v1Var2, ((p005kotlin.jvm.internal.p0) obj3).f105807a, 0, 10.0f);
                aVar5.r(v1Var3, i17 - (v1Var3.n0() / 2), v1Var2.m0(), 20.0f);
                return Unit.INSTANCE;
            case 7:
                z3.g gVar = (z3.g) obj3;
                p1.p0 p0Var = (p1.p0) obj2;
                if (obj == ((p3.d0) obj4)) {
                    vb.h.z("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof f4.g0) {
                    int i25 = gVar.f202099a - i17;
                    int iA = p0Var.a(obj);
                    p0Var.h(obj, Math.min(i25, iA >= 0 ? p0Var.f134875c[iA] : Integer.MAX_VALUE));
                }
                return Unit.INSTANCE;
            case 8:
                ge1.b.T((o53.b0) obj4, null, null, new pn1.e.b(((Boolean) obj).booleanValue(), this.f56077b, (Context) obj3, (p3.p1) obj2, null), 3);
                return Unit.INSTANCE;
            case 9:
                String str = (String) obj3;
                e23.l lVar2 = (e23.l) obj4;
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.e eVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) obj2;
                androidx.appcompat.app.e.a aVar6 = (androidx.appcompat.app.e.a) obj;
                aVar6.getClass();
                aVar6.setTitle(i17);
                if (str != null) {
                    aVar6.setMessage(aVar6.getContext().getString(R.string.wallet_error_contact_garmin_china_support_center) + " (" + str + ")");
                } else {
                    aVar6.setMessage(R.string.wallet_error_contact_garmin_china_support_center);
                }
                aVar6.setCancelable(false);
                aVar6.setPositiveButton(R.string.wallet_call, new pk1.t(i16, lVar2, eVar));
                aVar6.setNegativeButton(R.string.lbl_cancel, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar2, 11));
                return Unit.INSTANCE;
            case 10:
                i63.c cVar4 = (i63.c) obj4;
                Map map = (Map) obj3;
                String str2 = (String) obj2;
                lc.u uVar = (lc.u) obj;
                uVar.getClass();
                lc.t.a aVar7 = uVar.f111877a;
                k63.e eVarH = cVar4.getF158591b().h(i17);
                boolean zB = eVarH.b();
                lc.q0<?> q0VarA = rc.l.a(eVarH, map);
                if (q0VarA == null) {
                    vb.h.s(rc.l.g(str2, eVarH.getF103221c(), cVar4.getF158591b().getF103221c(), map.toString()));
                    return null;
                }
                uVar.b(q0VarA);
                aVar7.f111872b = zB;
                if (cVar4.getF158591b().i(i17)) {
                    aVar7.f111875e = true;
                }
                return Unit.INSTANCE;
            case 11:
                ((Boolean) obj).getClass();
                ((p3.n1) obj2).t(i17);
                ((p3.p1) obj4).setValue(((jv1.q) obj3).f101113a);
                return Unit.INSTANCE;
            case 12:
                List list2 = (List) obj4;
                m3 m3Var = (m3) obj3;
                p3.p1 p1Var2 = (p3.p1) obj2;
                String str3 = (String) obj;
                str3.getClass();
                ArrayList arrayListD1 = p13.h0.d1((List) p1Var2.getF182175a());
                arrayListD1.set(i17, str3);
                p1Var2.setValue(arrayListD1);
                if (str3.length() > 0) {
                    if (i17 < p13.x.j((List) p1Var2.getF182175a())) {
                        m4.b0.a((m4.b0) list2.get(i17 + 1));
                    } else if (m3Var != null) {
                        m3Var.hide();
                    }
                }
                return Unit.INSTANCE;
            case 13:
                tn2.r0 r0Var = (tn2.r0) obj3;
                String str4 = (String) obj2;
                e23.l lVar3 = (e23.l) obj4;
                tn2.w.f fVar = (tn2.w.f) obj;
                Logger logger = tn2.r0.f165631n;
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
                String strB = qn2.u.f145900a.b();
                pn2.n nVar = r0Var.f165637f;
                nVar.getClass();
                qn2.t tVarB = nVar.b(strB, strA2, null);
                r0Var.f165638g.getClass();
                str4.getClass();
                pn2.m mVar = new pn2.m(tVarB, new qn2.f(str4));
                mn2.b bVar3 = r0Var.f165633b;
                String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                e13.j jVarA = mn2.j.a(bVar3, strValueOf, strA, pn2.a.e().f138762b, mVar, lVar3);
                tn2.k0 k0Var = new tn2.k0(new bt1.t(r0Var, strA3, strB, strA, strA2, lVar3, this.f56077b), 22);
                int i26 = w03.b.f181178a;
                return new e13.r(new e13.j(jVarA, k0Var), new tn2.k0(new tn2.h0(r0Var, str4, i15), 23));
            case 14:
                dx2.c cVar5 = (dx2.c) obj4;
                Map map2 = (Map) obj3;
                Fragment fragment = (Fragment) obj2;
                cx2.h hVar = uv2.a.f172960c;
                cVar5.f61488e.j(Boolean.FALSE);
                if (((Boolean) obj).booleanValue()) {
                    int iF = fb1.c.f(map2, gw2.i.MENU_ID.f79975a, cx2.b.f56665a);
                    Integer numValueOf = iF >= 0 ? Integer.valueOf(iF) : null;
                    if (numValueOf == null) {
                        return Unit.INSTANCE;
                    }
                    uv2.a.d(fragment, cVar5, i17, numValueOf.intValue());
                }
                return Unit.INSTANCE;
            case 15:
                com.garmin.android.apps.connectmobile.group.details.invite.b bVar4 = (com.garmin.android.apps.connectmobile.group.details.invite.b) obj4;
                vm0.e eVar2 = (vm0.e) obj3;
                wm0.a aVar8 = (wm0.a) obj2;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar9 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                g3Var.getClass();
                int i27 = com.garmin.android.apps.connectmobile.group.details.invite.b.C0643b.f36371a[g3Var.f35300a.ordinal()];
                if (i27 == 1) {
                    bVar4.d7().C(i17, vm0.e.b(eVar2, null, null, 1983));
                } else if (i27 == 2) {
                    g22.e.c(bVar4);
                    bVar4.d7().C(i17, vm0.e.b(eVar2, null, aVar8, 1983));
                }
                return Unit.INSTANCE;
            case 16:
                c.q qVar = (c.q) obj4;
                c.q qVar2 = (c.q) obj3;
                p3.p1 p1Var3 = (p3.p1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    y22.e.d(i17, qVar, qVar2);
                } else {
                    p1Var3.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            default:
                androidx.appcompat.app.e.a aVar10 = (androidx.appcompat.app.e.a) obj;
                int i28 = yn2.b.G0;
                aVar10.getClass();
                aVar10.setTitle(i17);
                aVar10.setMessage(w5.r.v(R.string.wallet_an_error_was_encountered_with_credit_card_limitation_hint, (String) obj4));
                aVar10.setCancelable(false);
                int i29 = 12;
                aVar10.setPositiveButton(R.string.wallet_visit_faq, new xg1.l((yn2.b) obj3, i29));
                aVar10.setNegativeButton(R.string.lbl_cancel, new c32.a((e23.a) obj2, i29));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k0(int i14, Object obj, Object obj2, Object obj3, int i15) {
        this.f56076a = i15;
        this.f56077b = i14;
        this.f56078c = obj;
        this.f56079d = obj2;
        this.f56080e = obj3;
    }

    public /* synthetic */ k0(int i14, jv1.q qVar, p3.n1 n1Var, p3.p1 p1Var) {
        this.f56076a = 11;
        this.f56077b = i14;
        this.f56079d = qVar;
        this.f56080e = n1Var;
        this.f56078c = p1Var;
    }

    public /* synthetic */ k0(EBikePerformanceChartsActivity eBikePerformanceChartsActivity, ArrayList arrayList, int i14, fz.c cVar) {
        this.f56076a = 3;
        this.f56078c = eBikePerformanceChartsActivity;
        this.f56079d = arrayList;
        this.f56077b = i14;
        this.f56080e = cVar;
    }

    public /* synthetic */ k0(dx2.c cVar, Map map, uv2.a aVar, Fragment fragment, int i14) {
        this.f56076a = 14;
        this.f56078c = cVar;
        this.f56079d = map;
        this.f56080e = fragment;
        this.f56077b = i14;
    }

    public /* synthetic */ k0(hq.l lVar, int i14, e23.l lVar2, c2.a0 a0Var) {
        this.f56076a = 4;
        this.f56079d = lVar;
        this.f56077b = i14;
        this.f56078c = lVar2;
        this.f56080e = a0Var;
    }

    public /* synthetic */ k0(Object obj, int i14, Object obj2, Object obj3, int i15) {
        this.f56076a = i15;
        this.f56078c = obj;
        this.f56077b = i14;
        this.f56079d = obj2;
        this.f56080e = obj3;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f56076a = i15;
        this.f56078c = obj;
        this.f56079d = obj2;
        this.f56080e = obj3;
        this.f56077b = i14;
    }

    public /* synthetic */ k0(tn2.r0 r0Var, String str, e23.l lVar, int i14) {
        this.f56076a = 13;
        this.f56079d = r0Var;
        this.f56080e = str;
        this.f56078c = lVar;
        this.f56077b = i14;
    }
}
