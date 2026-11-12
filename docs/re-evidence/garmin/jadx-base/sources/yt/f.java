package yt;

import a03.r0;
import am.x0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.TrimmableActivityTypesActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.o1;
import kotlin.w3;
import lc.u0;
import o53.c2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import p006l2.m2;
import p006l2.n0;
import p006l2.o0;
import p1.m0;
import p1.q0;
import p3.m1;
import p3.n1;
import p3.p1;
import r53.p2;
import z2.i0;
import z2.j0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f199298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f199299c;

    public /* synthetic */ f(z2.m mVar, m0 m0Var, z2.b0 b0Var) {
        this.f199297a = 2;
        this.f199298b = m0Var;
        this.f199299c = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        fg0.j eventCustomization;
        fg0.j eventCustomization2;
        fg0.j eventCustomization3;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH;
        int i14 = this.f199297a;
        int i15 = 8;
        final int i16 = 2;
        int i17 = 6;
        final byte b14 = 0;
        final int i18 = 1;
        Object[] objArr = 0;
        Object obj2 = this.f199299c;
        Object obj3 = this.f199298b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj;
                int i19 = h.f199301x;
                ((m1) obj3).i(0.0f);
                num.getClass();
                ((n1) obj2).t(num.intValue());
                return Unit.INSTANCE;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                yv1.b.a aVar = yv1.b.f199840d;
                com.garmin.android.apps.connectmobile.workouts.data.model.c cVarB = com.garmin.android.apps.connectmobile.workouts.data.model.c.b((com.garmin.android.apps.connectmobile.workouts.data.model.c) obj3, Integer.valueOf((int) jLongValue));
                p2 p2Var = ((xv1.d) ((yv1.b) obj2).f199841a.getValue()).I;
                fg0.k kVar = (fg0.k) p2Var.getValue();
                ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.c> arrayList = (kVar == null || (eventCustomization3 = kVar.getEventCustomization()) == null || (listH = eventCustomization3.h()) == null) ? new ArrayList() : new ArrayList(listH);
                y0.a(arrayList).remove((kVar == null || (eventCustomization2 = kVar.getEventCustomization()) == null) ? null : eventCustomization2.g(Integer.valueOf(cVarB.getLegIndex())));
                arrayList.add(cVarB);
                if (arrayList.size() > 1) {
                    p13.c0.u(arrayList, new xv1.c());
                }
                double dIntValue = 0.0d;
                for (com.garmin.android.apps.connectmobile.workouts.data.model.c cVar : arrayList) {
                    og0.a aVar2 = og0.a.f131967a;
                    Double value = cVar.getValue();
                    double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
                    gg0.i unit = cVar.getUnit();
                    if (unit == null) {
                        unit = gg0.i.SECOND;
                    }
                    aVar2.getClass();
                    double dJ = og0.a.j(dDoubleValue, unit) + dIntValue;
                    Integer transitionOutDurationSeconds = cVar.getTransitionOutDurationSeconds();
                    dIntValue = (transitionOutDurationSeconds != null ? transitionOutDurationSeconds.intValue() : 0.0d) + dJ;
                }
                fg0.j jVarB = (kVar == null || (eventCustomization = kVar.getEventCustomization()) == null) ? null : fg0.j.b(eventCustomization, new fg0.d(Double.valueOf(dIntValue), gg0.i.SECOND, gg0.h.TIME), arrayList, null, null, null, null, 8188);
                if (kVar != null) {
                    p2Var.k(null, fg0.k.d(kVar, null, null, null, null, null, null, jVarB, -16777217));
                }
                return Unit.INSTANCE;
            case 2:
                z2.z zVar = (z2.z) obj;
                z2.m.m((m0) obj3, (z2.b0) obj2, zVar, 0, zVar.f201853f.f157280a.f157265a.f157138b.length());
                return Unit.INSTANCE;
            case 3:
                ge1.b.T((o53.b0) obj3, null, o53.d0.UNDISPATCHED, new j0((o1) obj2, (s5.c) obj, null), 1);
                return Unit.INSTANCE;
            case 4:
                z2.b0 b0Var = (z2.b0) obj;
                ((z2.o1) obj3).o(b0Var);
                ((e23.l) obj2).invoke(b0Var);
                return Unit.INSTANCE;
            case 5:
                z2.o1 o1Var = (z2.o1) obj3;
                x1.k kVar2 = (x1.k) obj2;
                x1.i iVar = (x1.i) obj;
                m2 m2Var = m2.f108657e;
                boolean zJ = o1Var.j();
                i0 i0Var = new i0(o1Var, 5);
                if (zJ) {
                    x1.i.b(iVar, new n0(m2Var), null, new o0(i0Var, kVar2), 14);
                }
                Unit unit2 = Unit.INSTANCE;
                m2 m2Var2 = m2.f108659g;
                boolean zH = o1Var.h();
                i0 i0Var2 = new i0(o1Var, i17);
                if (!zH) {
                    x1.i.b(iVar, new n0(m2Var2), null, new o0(i0Var2, kVar2), 14);
                }
                p13.x.k(unit2, unit2);
                return unit2;
            case 6:
                z2.o1 o1Var2 = (z2.o1) obj3;
                Context context = (Context) obj2;
                n2.a aVar3 = (n2.a) obj;
                aVar3.a();
                q0<o2.b> q0Var = aVar3.f122353a;
                m2 m2Var3 = m2.f108657e;
                boolean zJ2 = o1Var2.j();
                i0 i0Var3 = new i0(o1Var2, 7);
                Resources resources = context.getResources();
                d52.m mVar = new d52.m(i0Var3, objArr == true ? 1 : 0, i17);
                if (zJ2) {
                    q0Var.g(new o2.e(m2Var3.f108662a, resources.getString(m2Var3.f108663b), m2Var3.f108664c, mVar));
                }
                m2 m2Var4 = m2.f108659g;
                boolean zH2 = o1Var2.h();
                i0 i0Var4 = new i0(o1Var2, i15);
                i0 i0Var5 = new i0(o1Var2, 9);
                Resources resources2 = context.getResources();
                d52.m mVar2 = new d52.m(i0Var5, i0Var4, i17);
                if (!zH2) {
                    q0Var.g(new o2.e(m2Var4.f108662a, resources2.getString(m2Var4.f108663b), m2Var4.f108664c, mVar2));
                }
                aVar3.a();
                return Unit.INSTANCE;
            case 7:
                ((e23.l) obj3).invoke(((w01.f) obj2).f181052d.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 8:
                ((e23.l) obj3).invoke(((w01.a) obj2).f181007d.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 9:
                ((z53.b) obj3).e(((z53.b.a) obj2).f202556b);
                return Unit.INSTANCE;
            case 10:
                ud.a aVar4 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.persistence.a.b bVar = com.garmin.android.apps.connectmobile.persistence.a.f40315c;
                aVar4.getClass();
                ((com.garmin.android.apps.connectmobile.persistence.a) obj3).f40317b.c(aVar4, (List) obj2);
                return Unit.INSTANCE;
            case 11:
                DeviceDetailsActivity deviceDetailsActivity = (DeviceDetailsActivity) obj3;
                uc0.a aVar5 = (uc0.a) obj2;
                Fragment fragment = (Fragment) obj;
                int i24 = DeviceDetailsActivity.f33804q;
                if (fragment != null) {
                    androidx.fragment.app.v supportFragmentManager = deviceDetailsActivity.getSupportFragmentManager();
                    n23.j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, "DeviceSettingFragment").s(true, true);
                    deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
                    deviceDetailsActivity.hideProgressOverlay();
                } else {
                    deviceDetailsActivity.hideProgressOverlay();
                    aVar5.b(deviceDetailsActivity);
                    deviceDetailsActivity.finish();
                }
                return null;
            case 12:
                DeviceDetailsActivity deviceDetailsActivity2 = (DeviceDetailsActivity) obj3;
                String str = (String) obj2;
                int i25 = DeviceDetailsActivity.f33804q;
                if (((Boolean) obj).booleanValue()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str);
                    if (deviceDetailsActivity2.f33808h.d0() != null) {
                        arrayList2.add(deviceDetailsActivity2.f33808h.d0());
                    }
                    if (deviceDetailsActivity2.f33808h.Q() != null) {
                        arrayList2.add(deviceDetailsActivity2.f33808h.Q());
                    }
                    HashSet hashSet = new HashSet(arrayList2);
                    ej1.a aVar6 = deviceDetailsActivity2.f33811k;
                    aVar6.getClass();
                    aVar6.f64404a.X1("key_removed_device_info", hashSet);
                    Intent intent = new Intent();
                    intent.putExtra("device_removed", deviceDetailsActivity2.f33808h);
                    deviceDetailsActivity2.setResult(-1, intent);
                }
                deviceDetailsActivity2.finish();
                return null;
            case 13:
                ud.a aVar7 = (ud.a) obj;
                zd2.c.b bVar2 = zd2.c.f204229c;
                aVar7.getClass();
                ((zd2.c) obj3).f204231b.d(aVar7, (be2.e) obj2);
                return Unit.INSTANCE;
            case 14:
                ud.a aVar8 = (ud.a) obj;
                zd2.e.b bVar3 = zd2.e.f204232d;
                aVar8.getClass();
                ((zd2.e) obj3).f204234b.d(aVar8, (be2.f) obj2);
                return Unit.INSTANCE;
            case 15:
                uj1.e0 e0Var = (uj1.e0) obj2;
                List list = (List) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.a aVar9 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.f43936b;
                g22.e.f((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g) obj3);
                e0Var.t(list != null ? pj1.d0.d(list) : null);
                return Unit.INSTANCE;
            case 16:
                final zo.d dVar = (zo.d) obj3;
                View view2 = (View) obj2;
                final vo.a aVar10 = (vo.a) obj;
                g22.e.f(dVar);
                if (aVar10 != null) {
                    dVar.A6().setOnClickListener(new View.OnClickListener() { // from class: zo.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            switch (b14) {
                                case 0:
                                    vo.a aVar11 = aVar10;
                                    dVar.F6(aVar11.f178987c, aVar11.f178986b);
                                    break;
                                default:
                                    x0 x0Var = aVar10.f178988d;
                                    d dVar2 = dVar;
                                    Intent intent2 = new Intent(dVar2.requireContext(), (Class<?>) TrimmableActivityTypesActivity.class);
                                    intent2.putExtra("GCM_extra_activity_type", x0Var.f4358a);
                                    intent2.putExtra("EXTRA_IS_EDIT_MODE", true);
                                    dVar2.f206027j.a(intent2, null);
                                    break;
                            }
                        }
                    });
                    GCMComplexTwoLineButton gCMComplexTwoLineButton = dVar.f206020c;
                    if (gCMComplexTwoLineButton == null) {
                        p005kotlin.jvm.internal.s.m("activityTypeButton");
                        throw null;
                    }
                    gCMComplexTwoLineButton.setButtonBottomLeftLabel(dh.b.B(dVar, aVar10.f178988d.f4360c));
                    GCMComplexTwoLineButton gCMComplexTwoLineButton2 = dVar.f206020c;
                    if (gCMComplexTwoLineButton2 == null) {
                        p005kotlin.jvm.internal.s.m("activityTypeButton");
                        throw null;
                    }
                    gCMComplexTwoLineButton2.setOnClickListener(new View.OnClickListener() { // from class: zo.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            switch (i18) {
                                case 0:
                                    vo.a aVar11 = aVar10;
                                    dVar.F6(aVar11.f178987c, aVar11.f178986b);
                                    break;
                                default:
                                    x0 x0Var = aVar10.f178988d;
                                    d dVar2 = dVar;
                                    Intent intent2 = new Intent(dVar2.requireContext(), (Class<?>) TrimmableActivityTypesActivity.class);
                                    intent2.putExtra("GCM_extra_activity_type", x0Var.f4358a);
                                    intent2.putExtra("EXTRA_IS_EDIT_MODE", true);
                                    dVar2.f206027j.a(intent2, null);
                                    break;
                            }
                        }
                    });
                    dVar.y6().setCustomValueFormatter(new e23.l() { // from class: zo.c
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            Integer num2 = (Integer) obj4;
                            switch (b14) {
                                case 0:
                                    return dVar.v6(num2.intValue());
                                case 1:
                                    int iIntValue = num2.intValue();
                                    i2.a aVar11 = i2.f36769a;
                                    aVar11.getClass();
                                    i2.a.a(a2.ACTIVITIES, "Progress: " + iIntValue);
                                    d dVar2 = dVar;
                                    dVar2.A6().setButtonBottomLeftLabel(dVar2.v6(iIntValue));
                                    dVar2.G6(iIntValue);
                                    return Unit.INSTANCE;
                                default:
                                    num2.intValue();
                                    d dVar3 = dVar;
                                    ap.d dVarE6 = dVar3.E6();
                                    int i26 = dVar3.f206024g;
                                    LinkedHashMap linkedHashMap = dVarE6.f11595g;
                                    linkedHashMap.put(Integer.valueOf(i26), num2);
                                    dVarE6.f11594f.j(linkedHashMap);
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                    dVar.y6().setProgressChangedCallback(new e23.l() { // from class: zo.c
                        @Override // e23.l
                        public final Object invoke(Object obj4) {
                            Integer num2 = (Integer) obj4;
                            switch (i18) {
                                case 0:
                                    return dVar.v6(num2.intValue());
                                case 1:
                                    int iIntValue = num2.intValue();
                                    i2.a aVar11 = i2.f36769a;
                                    aVar11.getClass();
                                    i2.a.a(a2.ACTIVITIES, "Progress: " + iIntValue);
                                    d dVar2 = dVar;
                                    dVar2.A6().setButtonBottomLeftLabel(dVar2.v6(iIntValue));
                                    dVar2.G6(iIntValue);
                                    return Unit.INSTANCE;
                                default:
                                    num2.intValue();
                                    d dVar3 = dVar;
                                    ap.d dVarE6 = dVar3.E6();
                                    int i26 = dVar3.f206024g;
                                    LinkedHashMap linkedHashMap = dVarE6.f11595g;
                                    linkedHashMap.put(Integer.valueOf(i26), num2);
                                    dVarE6.f11594f.j(linkedHashMap);
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                    GCMComplexTwoLineButton gCMComplexTwoLineButtonA6 = dVar.A6();
                    int i26 = aVar10.f178987c;
                    gCMComplexTwoLineButtonA6.setButtonBottomLeftLabel(dVar.v6(i26));
                    LabelledValuesRangeProgressBar labelledValuesRangeProgressBarY6 = dVar.y6();
                    int i27 = aVar10.f178985a;
                    int i28 = aVar10.f178986b;
                    labelledValuesRangeProgressBarY6.l(i27, i28, Integer.valueOf(j23.t.e(i26, i27, i28)));
                    dVar.y6().setCoroutineScope(g22.f.b(dVar));
                    dVar.u6(aVar10);
                    View viewFindViewById = view2.findViewById(R.id.chart_legend_container);
                    viewFindViewById.getClass();
                    LinearLayout linearLayout = (LinearLayout) viewFindViewById;
                    zm.p pVar = aVar10.f178990f;
                    if (pVar != null) {
                        FrameLayout frameLayout = dVar.f206025h;
                        if (frameLayout == null) {
                            p005kotlin.jvm.internal.s.m("chartView");
                            throw null;
                        }
                        frameLayout.removeAllViews();
                        androidx.fragment.app.m mVarRequireActivity = dVar.requireActivity();
                        mVarRequireActivity.getClass();
                        wo.e eVar = new wo.e(mVarRequireActivity, pVar, aVar10.f178991g, aVar10.f178989e, dVar.w6(), false);
                        dVar.f206026i = eVar;
                        eVar.f205210i = linearLayout;
                        FrameLayout frameLayout2 = dVar.f206025h;
                        if (frameLayout2 == null) {
                            p005kotlin.jvm.internal.s.m("chartView");
                            throw null;
                        }
                        frameLayout2.addView(eVar.d(frameLayout2));
                        float fE = j23.t.e(aVar10.f178991g, i27, i28);
                        wo.e eVar2 = dVar.f206026i;
                        if (eVar2 != null) {
                            eVar2.R(fE);
                        }
                    }
                    wo.a aVarY4 = dVar.E6().y4(dVar.f206024g);
                    if (aVarY4 != null) {
                        boolean zIsEmpty = aVarY4.f186398b.isEmpty();
                        FrameLayout frameLayout3 = dVar.f206025h;
                        if (zIsEmpty) {
                            if (frameLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("chartView");
                                throw null;
                            }
                            frameLayout3.setVisibility(8);
                            dVar.C6().setVisibility(8);
                        } else {
                            if (frameLayout3 == null) {
                                p005kotlin.jvm.internal.s.m("chartView");
                                throw null;
                            }
                            frameLayout3.setVisibility(0);
                            dVar.C6().setVisibility(0);
                            dVar.C6().setAdapter(new wo.d(aVarY4, new e23.l() { // from class: zo.c
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    Integer num2 = (Integer) obj4;
                                    switch (i16) {
                                        case 0:
                                            return dVar.v6(num2.intValue());
                                        case 1:
                                            int iIntValue = num2.intValue();
                                            i2.a aVar11 = i2.f36769a;
                                            aVar11.getClass();
                                            i2.a.a(a2.ACTIVITIES, "Progress: " + iIntValue);
                                            d dVar2 = dVar;
                                            dVar2.A6().setButtonBottomLeftLabel(dVar2.v6(iIntValue));
                                            dVar2.G6(iIntValue);
                                            return Unit.INSTANCE;
                                        default:
                                            num2.intValue();
                                            d dVar3 = dVar;
                                            ap.d dVarE6 = dVar3.E6();
                                            int i29 = dVar3.f206024g;
                                            LinkedHashMap linkedHashMap = dVarE6.f11595g;
                                            linkedHashMap.put(Integer.valueOf(i29), num2);
                                            dVarE6.f11594f.j(linkedHashMap);
                                            return Unit.INSTANCE;
                                    }
                                }
                            }));
                            dVar.C6().setLayoutManager(new LinearLayoutManager(dVar.requireContext(), 0, false));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 17:
                e23.a aVar11 = (e23.a) obj3;
                zo1.q qVar = (zo1.q) obj2;
                f.a aVar12 = (f.a) obj;
                aVar12.getClass();
                if (aVar12.f67585a == -1 && aVar12.f67586b != null) {
                    if (aVar11 != null) {
                        aVar11.invoke();
                    } else {
                        qVar.getClass();
                        ge1.b.T(v1.a(qVar), null, null, new zo1.s(qVar, null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 18:
                ((zp2.b) obj3).f206601a.remove((c2) obj2);
                return Unit.INSTANCE;
            case 19:
                ((Boolean) obj).booleanValue();
                ((e23.l) obj3).invoke((pt1.t) obj2);
                return Unit.INSTANCE;
            case 20:
                zu1.i iVar2 = (zu1.i) obj3;
                ComposeView composeView = (ComposeView) obj2;
                g3 g3Var = (g3) obj;
                zu1.i.b bVar4 = zu1.i.f207108c;
                int i29 = zu1.i.c.f207113a[g3Var.f35300a.ordinal()];
                if (i29 == 1) {
                    g22.e.f(iVar2);
                    jv1.c0 c0Var = (jv1.c0) g3Var.f35301b;
                    if (c0Var != null) {
                        iVar2.requireActivity().setTitle(Html.fromHtml(c0Var.getArticleNavBar(), 63).toString());
                        composeView.setViewCompositionStrategy(w3.d.f91628b);
                        composeView.setContent(new z3.e(-626474738, true, new zu1.g(iVar2, c0Var, b14, b14)));
                    } else {
                        g22.e.a(iVar2, null);
                        Unit unit3 = Unit.INSTANCE;
                    }
                } else if (i29 == 2) {
                    g22.e.f(iVar2);
                    Unit unit4 = Unit.INSTANCE;
                } else {
                    if (i29 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.l(iVar2);
                    Unit unit5 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 21:
                Context context2 = (Context) obj3;
                Context context3 = (Context) obj;
                zu1.i.b bVar5 = zu1.i.f207108c;
                context3.getClass();
                i03.f fVar = new i03.f(context2);
                j03.p pVar2 = new j03.p();
                ArrayList arrayList3 = fVar.f86931b;
                arrayList3.add(pVar2);
                arrayList3.add(new zu1.i.a(context2));
                i03.h hVarA = fVar.a();
                TextView textView = new TextView(context3);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                textView.setTextAppearance(R.style.Text_Body1_Secondary);
                hVarA.a(textView, ((jv1.c0) obj2).getArticleBody());
                return textView;
            case 22:
                ((Boolean) obj).getClass();
                zu1.k.a aVar13 = zu1.k.f207122d;
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachPremiumContentFilter");
                ((p1) obj3).setValue((hv1.c) obj2);
                return Unit.INSTANCE;
            case 23:
                a03.p pVar3 = (a03.p) obj3;
                o53.b0 b0Var2 = (o53.b0) obj2;
                a03.y yVar = (a03.y) obj;
                b0Var2.getClass();
                yVar.getClass();
                pVar3.getClass();
                r0<a03.y> r0Var = pVar3.f158i;
                z53.b bVar6 = r0Var.f174e.f75b;
                boolean zF = bVar6.f();
                if (zF) {
                    try {
                        r0Var.g(yVar);
                        bVar6.e(null);
                    } catch (Throwable th3) {
                        bVar6.e(null);
                        throw th3;
                    }
                }
                if (!zF) {
                    ge1.b.T(b0Var2, null, null, new zz2.z(pVar3, yVar, null), 3);
                }
                return Unit.INSTANCE;
            default:
                p1 p1Var = (p1) obj2;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p1Var.getClass();
                if (!((a03.p) obj3).f156g) {
                    p1Var.setValue(bool);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f199297a = i14;
        this.f199298b = obj;
        this.f199299c = obj2;
    }
}
