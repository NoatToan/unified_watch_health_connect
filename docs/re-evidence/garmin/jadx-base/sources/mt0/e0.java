package mt0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetsActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.github.mikephil.charting.components.YAxis;
import i3.m8;
import i3.mc;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f120580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f120581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f120582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f120583e;

    public /* synthetic */ e0(String str, Object obj, po2.x xVar, po2.o oVar) {
        this.f120579a = 14;
        this.f120580b = str;
        this.f120583e = obj;
        this.f120581c = xVar;
        this.f120582d = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x04c4  */
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
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        i53.f fVarB;
        mm1.a overallStats;
        mm1.a overallStats2;
        List<mm1.c> listB;
        String string;
        List<mm1.g> listB2;
        zm1.q qVar;
        int i14 = this.f120579a;
        int i15 = 8;
        int i16 = 9;
        int i17 = 27;
        int i18 = 2;
        boolean zT = true;
        boolean z14 = true;
        arrayList = null;
        arrayList = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Object obj2 = this.f120582d;
        Object obj3 = this.f120581c;
        Object obj4 = this.f120580b;
        Object obj5 = this.f120583e;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.k) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.k.O0;
                g3Var.getClass();
                fw.p pVar = g3Var.f35300a;
                kVar.hideProgressOverlay();
                int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.k.b.f37635a[pVar.ordinal()];
                if (i19 == 1) {
                    kVar.h7().a(str, str2, str3);
                    kVar.h7().notifyDataSetChanged();
                } else if (i19 != 2) {
                    if (i19 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    kVar.n7();
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.r0 r0Var = (com.garmin.android.apps.connectmobile.leaderboard.challenges.r0) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.r0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.r0.K0;
                g3Var2.getClass();
                int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.r0.e.f37834a[g3Var2.f35300a.ordinal()];
                if (i24 == 1) {
                    r0Var.h7().a(str4, str5, str6);
                    r0Var.h7().notifyDataSetChanged();
                } else if (i24 == 2) {
                    r0Var.n7();
                } else if (i24 != 3) {
                    lc.u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = (com.garmin.android.apps.connectmobile.leaderboard.challenges.w0) obj5;
                String str7 = (String) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                com.garmin.android.apps.connectmobile.g3 g3Var3 = (com.garmin.android.apps.connectmobile.g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                g3Var3.getClass();
                int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.b.f37942a[g3Var3.f35300a.ordinal()];
                if (i25 == 1) {
                    w0Var.h7().a(str7, str8, str9);
                    w0Var.h7().notifyDataSetChanged();
                } else if (i25 == 2) {
                    w0Var.n7();
                } else if (i25 != 3) {
                    lc.u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            case 3:
                gw0.u uVar = (gw0.u) obj4;
                int iIntValue = ((Integer) obj).intValue();
                ge1.b.T((o53.b0) obj5, null, null, new mw0.l((h2.j0) obj2, iIntValue, null), 3);
                mw0.r rVar = (mw0.r) ((w13.a) obj3).get(iIntValue);
                if (rVar != null) {
                    r53.p2 p2Var = uVar.f79771l;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, gw0.h0.a((gw0.h0) value, null, null, rVar, false, false, false, false, false, null, 507)));
                } else {
                    uVar.getClass();
                }
                return Unit.INSTANCE;
            case 4:
                rz.a aVar4 = (rz.a) obj5;
                List list = (List) obj4;
                Integer num = (Integer) obj3;
                Context context = (Context) obj2;
                ((CustomBarChart) obj).getClass();
                qz.a.b(aVar4, list, num != null ? context.getString(num.intValue()) : null, 4);
                return Unit.INSTANCE;
            case 5:
                EditExerciseSetsActivity editExerciseSetsActivity = (EditExerciseSetsActivity) obj5;
                List list2 = (List) obj4;
                RecyclerView recyclerView = (RecyclerView) obj3;
                am.x0 x0Var = (am.x0) obj2;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) obj;
                EditExerciseSetsActivity.a aVar5 = EditExerciseSetsActivity.f29937e;
                editExerciseSetsActivity.hideProgressOverlay();
                if (cVar != null) {
                    nq.e eVar = new nq.e(list2, cVar, new ls0.h(editExerciseSetsActivity, 15, x0Var, cVar));
                    editExerciseSetsActivity.f29938a = eVar;
                    com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = editExerciseSetsActivity.f29940c;
                    if (fVar == null) {
                        p005kotlin.jvm.internal.s.m("activityRoundsDTO");
                        throw null;
                    }
                    eVar.B(fVar.f());
                    nq.e eVar2 = editExerciseSetsActivity.f29938a;
                    if (eVar2 == null) {
                        p005kotlin.jvm.internal.s.m("adapter");
                        throw null;
                    }
                    recyclerView.setAdapter(eVar2);
                } else {
                    editExerciseSetsActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            case 6:
                ((f.a) obj).getClass();
                ge1.b.T((o53.b0) obj5, null, null, new nw1.c.d((lw1.f) obj4, (lc.m0) obj3, (p3.x3) obj2, null), 3);
                return Unit.INSTANCE;
            case 7:
                p5.k0 k0Var = (p5.k0) obj;
                or0.j.a aVar6 = or0.j.f133348g;
                k0Var.getClass();
                p5.h0.n(k0Var, ((x00.a) obj5).a((Integer) obj4, (Integer) obj3, (Integer) obj2));
                return Unit.INSTANCE;
            case 8:
                or0.m mVar = (or0.m) obj5;
                Context context2 = (Context) obj3;
                String str10 = (String) obj4;
                p3.p1 p1Var = (p3.p1) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                if (150 > iIntValue2 || iIntValue2 >= 1000000) {
                    Toast.makeText(context2, str10, 0).show();
                } else {
                    nw0.f fVar2 = new nw0.f(mVar, 19);
                    mVar.getClass();
                    ge1.b.T(androidx.lifecycle.v1.a(mVar), null, null, new or0.n(mVar, iIntValue2, fVar2, null), 3);
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 9:
                ov1.c cVar2 = (ov1.c) obj5;
                p3.p1 p1Var2 = (p3.p1) obj4;
                List list3 = (List) obj;
                ov1.c.a aVar7 = ov1.c.f134143b;
                list3.getClass();
                p1Var2.setValue(new ArrayList(list3));
                Context contextRequireContext = cVar2.requireContext();
                contextRequireContext.getClass();
                o13.p<String, Boolean> pVarV6 = cVar2.v6(contextRequireContext, (List) p1Var2.getF182175a(), 5, 7);
                String str11 = pVarV6.f128594a;
                Boolean bool = pVarV6.f128595b;
                bool.getClass();
                ((p3.p1) obj3).setValue(str11);
                ((p3.p1) obj2).setValue(bool);
                return Unit.INSTANCE;
            case 10:
                ov1.f fVar3 = (ov1.f) obj5;
                p3.p1 p1Var3 = (p3.p1) obj4;
                List list4 = (List) obj;
                ov1.f.a aVar8 = ov1.f.f134159c;
                list4.getClass();
                p1Var3.setValue(new ArrayList(list4));
                Context contextRequireContext2 = fVar3.requireContext();
                contextRequireContext2.getClass();
                o13.p<String, Boolean> pVarW6 = fVar3.w6(contextRequireContext2, (List) p1Var3.getF182175a(), 1, 2);
                String str12 = pVarW6.f128594a;
                Boolean bool2 = pVarW6.f128595b;
                bool2.getClass();
                ((p3.p1) obj3).setValue(str12);
                ((p3.p1) obj2).setValue(bool2);
                return Unit.INSTANCE;
            case 11:
                ov1.w wVar = (ov1.w) obj5;
                p3.p1 p1Var4 = (p3.p1) obj4;
                List list5 = (List) obj;
                ov1.w.a aVar9 = ov1.w.f134236b;
                list5.getClass();
                p1Var4.setValue(new ArrayList(list5));
                Context contextRequireContext3 = wVar.requireContext();
                contextRequireContext3.getClass();
                o13.p<String, Boolean> pVarV7 = wVar.v6(contextRequireContext3, (List) p1Var4.getF182175a(), 1, 2);
                String str13 = pVarV7.f128594a;
                Boolean bool3 = pVarV7.f128595b;
                bool3.getClass();
                ((p3.p1) obj3).setValue(str13);
                ((p3.p1) obj2).setValue(bool3);
                return Unit.INSTANCE;
            case 12:
                com.garmin.realtimesettings.app.presentationlayer.c cVar3 = (com.garmin.realtimesettings.app.presentationlayer.c) obj5;
                ov2.e eVar3 = (ov2.e) obj4;
                dx2.c cVar4 = (dx2.c) obj3;
                Map map = (Map) obj2;
                String str14 = (String) obj;
                str14.getClass();
                cx2.i.f56681a.getClass();
                if (cx2.i.a.a(cVar3)) {
                    ov2.a.f134258b.getClass();
                    eVar3.h(cVar4, map, str14);
                } else {
                    ov2.a.f134258b.getClass();
                }
                cVar3.f52657q = null;
                return Unit.INSTANCE;
            case 13:
                e23.p pVar2 = (e23.p) obj5;
                sy0.q qVar2 = (sy0.q) obj4;
                p3.p1 p1Var5 = (p3.p1) obj3;
                p3.p1 p1Var6 = (p3.p1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    p1Var5.setValue(Boolean.TRUE);
                } else {
                    Boolean bool4 = Boolean.TRUE;
                    pVar2.invoke(qVar2, bool4);
                    p1Var6.setValue(bool4);
                }
                return Unit.INSTANCE;
            case 14:
                androidx.appcompat.app.e.a aVar10 = (androidx.appcompat.app.e.a) obj;
                aVar10.getClass();
                aVar10.setTitle(R.string.wallet_transfer_card);
                aVar10.setMessage(aVar10.getContext().getString(R.string.wallet_transfer_card_hint, (String) obj4, obj5));
                aVar10.setPositiveButton(R.string.wallet_transfer, new ng1.c1((po2.x) obj3, i15));
                aVar10.setNegativeButton(R.string.lbl_cancel, new ng1.c1((po2.o) obj2, i16));
                aVar10.setCancelable(false);
                return Unit.INSTANCE;
            case 15:
                lc.v vVar = (lc.v) obj;
                int i26 = qc.h.B;
                vVar.getClass();
                ((p005kotlin.jvm.internal.m0) obj5).f105804a = true;
                ((qc.h) obj4).a((lc.h0) obj3, (Bundle) obj2, vVar, p13.j0.f134944a);
                return Unit.INSTANCE;
            case 16:
                p3.p1 p1Var7 = (p3.p1) obj4;
                Calendar calendar = (Calendar) obj;
                calendar.getClass();
                p1Var7.setValue(calendar);
                ((p3.p1) obj3).setValue(Boolean.FALSE);
                ge1.b.T((o53.b0) obj5, null, null, new qy0.k.d((e23.l) obj2, p1Var7, null), 3);
                return Unit.INSTANCE;
            case 17:
                e23.p pVar3 = (e23.p) obj5;
                p3.x3 x3Var = (p3.x3) obj4;
                p3.x3 x3Var2 = (p3.x3) obj3;
                p3.p1 p1Var8 = (p3.p1) obj2;
                ((l72.i3) obj).getClass();
                if (((b63.o) x3Var.getF182175a()) != null) {
                    b63.o oVar = (b63.o) x3Var.getF182175a();
                    oVar.getClass();
                    fVarB = i53.a.a(oVar);
                } else if (((i53.f) x3Var2.getF182175a()) != null) {
                    i53.f fVar4 = (i53.f) x3Var2.getF182175a();
                    fVar4.getClass();
                    fVarB = fVar4;
                } else {
                    fVarB = j53.l.b();
                }
                pVar3.invoke(fVarB, (b63.v) p1Var8.getF182175a());
                return Unit.INSTANCE;
            case 18:
                LocalDate localDate = (LocalDate) obj5;
                LocalDate localDate2 = (LocalDate) obj3;
                mm1.b bVar = (mm1.b) obj2;
                String str15 = (String) obj4;
                View view2 = (View) obj;
                CustomLineChart customLineChart = (CustomLineChart) view2.findViewById(R.id.sleep_consistency_chart_view);
                customLineChart.getClass();
                Context context3 = view2.getContext();
                context3.getClass();
                xm1.d dVar = new xm1.d(context3, localDate, localDate2, true, false, 16, null);
                YAxis axisLeft = customLineChart.getAxisLeft();
                axisLeft.getClass();
                tz.a aVar11 = new tz.a(customLineChart, dVar, new xm1.b(customLineChart, customLineChart, axisLeft, new yz.k(true), localDate, localDate2), new k00.m(customLineChart), new k00.g(customLineChart), null, 32, null);
                xm1.c cVar5 = new xm1.c((bVar == null || (listB = bVar.b()) == null) ? null : vm1.a.f(listB), (bVar == null || (overallStats2 = bVar.getOverallStats()) == null) ? null : overallStats2.getAverageLocalSleepEndTime(), (bVar == null || (overallStats = bVar.getOverallStats()) == null) ? null : overallStats.getAverageLocalSleepStartTime());
                List<xm1.e> list6 = cVar5.f191497a;
                if (list6 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj6 : list6) {
                        if (w5.r.s((xm1.e) obj6)) {
                            arrayList2.add(obj6);
                        }
                    }
                }
                qz.a.b(aVar11, new xm1.c(arrayList2, cVar5.f191498b, cVar5.f191499c), str15, 4);
                return Unit.INSTANCE;
            case 19:
                DateTime dateTime = (DateTime) obj5;
                DateTime dateTime2 = (DateTime) obj4;
                zm1.s sVar = (zm1.s) obj3;
                rl1.i iVar = (rl1.i) obj2;
                View view3 = (View) obj;
                if (view3 instanceof CustomCombinedChart) {
                    CustomCombinedChart customCombinedChart = (CustomCombinedChart) view3;
                    LocalDate localDate3 = dateTime.toLocalDate();
                    localDate3.getClass();
                    LocalDate localDate4 = dateTime2.toLocalDate();
                    localDate4.getClass();
                    zm1.u uVar2 = new zm1.u(customCombinedChart, localDate3, localDate4, true, zm1.o.SLEEP_SCORE, null, false, false, 32, null);
                    Context context4 = customCombinedChart.getContext();
                    context4.getClass();
                    if (iVar != null) {
                        uVar2.b(iVar);
                    } else {
                        uVar2.b(null);
                    }
                    String string2 = context4.getString(R.string.msg_no_sleep_score_data);
                    string2.getClass();
                    String strA = g22.n.a(string2);
                    switch (iVar != null ? rn1.l.b.f153665a[iVar.ordinal()] : -1) {
                        case 1:
                            zT = w02.b0.t(sVar);
                            break;
                        case 2:
                            zT = w02.b0.p(sVar);
                            break;
                        case 3:
                            zT = w02.b0.n(sVar);
                            break;
                        case 4:
                            zT = w02.b0.u(sVar);
                            break;
                        case 5:
                            zT = w02.b0.q(sVar);
                            break;
                        case 6:
                        case 7:
                            zT = w02.b0.s(sVar);
                            break;
                        case 8:
                            zT = w02.b0.o(sVar);
                            break;
                    }
                    zm1.s sVar2 = zT ? sVar : null;
                    if (iVar != null) {
                        switch (rn1.l.b.f153665a[iVar.ordinal()]) {
                            case 1:
                                string = context4.getString(R.string.msg_no_resting_heart_rate_data);
                                string.getClass();
                                break;
                            case 2:
                                String string3 = context4.getString(R.string.lbl_overnight_heart_rate);
                                string3.getClass();
                                String lowerCase = string3.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                string = context4.getString(R.string.common_no_certain_data, lowerCase);
                                string.getClass();
                                break;
                            case 3:
                                String string4 = context4.getString(R.string.gcm_body_battery_lbl_body_battery);
                                string4.getClass();
                                string = context4.getString(R.string.common_no_certain_data, string4);
                                string.getClass();
                                break;
                            case 4:
                                string = context4.getString(R.string.lbl_no_skin_temp_data);
                                string.getClass();
                                break;
                            case 5:
                                String string5 = context4.getString(R.string.device_settings_pulse_ox);
                                string5.getClass();
                                string = context4.getString(R.string.common_no_certain_data, string5);
                                string.getClass();
                                break;
                            case 6:
                                String string6 = context4.getString(R.string.lbl_no_respiration_data);
                                string6.getClass();
                                string = g22.n.a(string6);
                                break;
                            case 7:
                            default:
                                string = context4.getString(R.string.common_no_data);
                                string.getClass();
                                break;
                            case 8:
                                string = context4.getString(R.string.msg_no_overnight_hrv_data);
                                string.getClass();
                                break;
                        }
                        strA = string;
                    }
                    uz.a.a(uVar2, sVar2, strA, 4);
                }
                return Unit.INSTANCE;
            case 20:
                LocalDate localDate5 = (LocalDate) obj5;
                LocalDate localDate6 = (LocalDate) obj3;
                mm1.f fVar5 = (mm1.f) obj2;
                String str16 = (String) obj4;
                View view4 = (View) obj;
                if (view4 instanceof CustomCombinedChart) {
                    zm1.u uVar3 = new zm1.u((CustomCombinedChart) view4, localDate5, localDate6, false, zm1.o.SLEEP_SCORE, null, false, false, 32, null);
                    if (fVar5 != null && (listB2 = fVar5.b()) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (mm1.g gVar : listB2) {
                            if (gVar.getWeekStartDate() == null) {
                                gVar = null;
                            } else {
                                mm1.g.a values = gVar.getValues();
                                if ((values != null ? values.getAverageSleepScore() : null) == null) {
                                    gVar = null;
                                }
                            }
                            if (gVar != null) {
                                LocalDate localDateY = gl1.y.y(gVar);
                                mm1.g.a values2 = gVar.getValues();
                                qVar = new zm1.q(localDateY, values2 != null ? values2.getAverageSleepScore() : null);
                            } else {
                                qVar = null;
                            }
                            if (qVar != null) {
                                arrayList3.add(qVar);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            arrayList = arrayList3;
                        }
                    }
                    uz.a.a(uVar3, new zm1.s(arrayList, null, null, null, null, null, null, null, 254, null), str16, 4);
                }
                return Unit.INSTANCE;
            case 21:
                Context context5 = (Context) obj3;
                View view5 = (View) obj;
                View viewFindViewById = view5.findViewById(R.id.chart_chronic_option);
                viewFindViewById.getClass();
                viewFindViewById.setVisibility(8);
                DateTime dateTimeAtStartOfDay = ((LocalDate) obj5).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay2 = ((LocalDate) obj4).toDateTimeAtStartOfDay();
                View viewFindViewById2 = view5.findViewById(R.id.acute_load_summary_chart);
                viewFindViewById2.getClass();
                CustomLineChart customLineChart2 = (CustomLineChart) viewFindViewById2;
                View viewFindViewById3 = view5.findViewById(R.id.view_custom_legend);
                String string7 = context5.getString(R.string.lbl_4w_timeline);
                string7.getClass();
                ((CustomLegendView) viewFindViewById3).setChartTitle(string7);
                viewFindViewById3.getClass();
                Context context6 = view5.getContext();
                context6.getClass();
                dateTimeAtStartOfDay.getClass();
                dateTimeAtStartOfDay2.getClass();
                tz.a aVar12 = new tz.a(customLineChart2, new b71.f(context6, dateTimeAtStartOfDay, dateTimeAtStartOfDay2, null, 8, null), new b71.g(customLineChart2, dateTimeAtStartOfDay, dateTimeAtStartOfDay2), new k00.m(customLineChart2), null, (CustomLegendView) viewFindViewById3, 16, null);
                aVar12.c();
                String string8 = context5.getString(R.string.txt_empty_page_no_data);
                string8.getClass();
                l22.a aVar13 = new l22.a(context5);
                pi0.e eVar4 = new pi0.e(context5);
                ArrayList arrayList4 = new ArrayList();
                for (com.garmin.android.apps.connectmobile.performance.model.c cVar6 : p13.h0.Z(((TrainingStatusReportDTO) obj2).C())) {
                    double dI = cVar6.I();
                    Double D = cVar6.D();
                    double dDoubleValue = D != null ? D.doubleValue() : Double.NaN;
                    double d14 = cVar6.B;
                    boolean z15 = cVar6.f39959r;
                    double d15 = !z15 ? cVar6.f39965z : cVar6.f39946e;
                    double d16 = !z15 ? cVar6.f39964y : cVar6.f39945d;
                    DateTime dateTimeC = cVar6.C();
                    String strA2 = eVar4.a(cVar6.C(), qi0.a.NUMERIC_YEAR_MONTH_DAY);
                    a61.e eVar5 = a61.e.f1563a;
                    double dI2 = cVar6.I();
                    eVar5.getClass();
                    String strC = a61.e.c(aVar13, dI2);
                    Double D2 = cVar6.D();
                    String strC2 = a61.e.c(aVar13, D2 != null ? D2.doubleValue() : Double.NaN);
                    boolean z16 = cVar6.f39957p;
                    String str17 = cVar6.f39961v;
                    String str18 = str17 == null ? "" : str17;
                    String str19 = cVar6.f39962w;
                    arrayList4.add(new a71.d(dI, dDoubleValue, d14, d15, d16, dateTimeC, strA2, strC, strC2, z16, str18, str19 == null ? "" : str19, !cVar6.f39959r, a61.e.d(aVar13, cVar6.I(), cVar6.G(), cVar6.f39957p)));
                }
                if (arrayList4.size() > 1) {
                    p13.c0.u(arrayList4, new rv1.j());
                }
                qz.a.b(aVar12, new a71.e(arrayList4, "", "", null, "", "", "", "", true, false, true, false, null, new rk0.n(i17), false, null, false), string8, 4);
                return Unit.INSTANCE;
            case 22:
                e23.a aVar14 = (e23.a) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ge1.b.T((o53.b0) obj5, null, null, new rx1.h.f((mc) obj3, null), 3).J(new m8((e23.a) obj2, 28));
                if (zBooleanValue) {
                    aVar14.invoke();
                }
                return Unit.INSTANCE;
            case 23:
                s1.b bVar2 = (s1.b) obj5;
                s1.m mVar2 = (s1.m) obj4;
                e23.l lVar = (e23.l) obj3;
                p005kotlin.jvm.internal.m0 m0Var = (p005kotlin.jvm.internal.m0) obj2;
                s1.j jVar = (s1.j) obj;
                s1.q1.i(jVar, bVar2.f155489c);
                p3.c2 c2Var = jVar.f155607e;
                Object objD = bVar2.d(c2Var.getF182175a());
                if (!p005kotlin.jvm.internal.s.g(objD, c2Var.getF182175a())) {
                    bVar2.f155489c.f155628b.setValue(objD);
                    mVar2.f155628b.setValue(objD);
                    if (lVar != null) {
                        lVar.invoke(bVar2);
                    }
                    jVar.a();
                    m0Var.f105804a = true;
                } else if (lVar != null) {
                    lVar.invoke(bVar2);
                }
                return Unit.INSTANCE;
            case 24:
                s1.n0 n0Var = (s1.n0) obj4;
                p005kotlin.jvm.internal.o0 o0Var = (p005kotlin.jvm.internal.o0) obj3;
                o53.b0 b0Var = (o53.b0) obj2;
                long jLongValue = ((Long) obj).longValue();
                p3.x3 x3Var3 = (p3.x3) ((p3.p1) obj5).getF182175a();
                long jLongValue2 = x3Var3 != null ? ((Number) x3Var3.getF182175a()).longValue() : jLongValue;
                long j8 = n0Var.f155646c;
                q3.c<s1.n0.a<?, ?>> cVar7 = n0Var.f155644a;
                if (j8 == Long.MIN_VALUE || o0Var.f105806a != s1.q1.h(b0Var.getF195311f())) {
                    n0Var.f155646c = jLongValue;
                    s1.n0.a<?, ?>[] aVarArr = cVar7.f142356a;
                    int i27 = cVar7.f142358c;
                    for (int i28 = 0; i28 < i27; i28++) {
                        aVarArr[i28].f155655h = true;
                    }
                    o0Var.f105806a = s1.q1.h(b0Var.getF195311f());
                }
                float f14 = o0Var.f105806a;
                if (f14 == 0.0f) {
                    s1.n0.a<?, ?>[] aVarArr2 = cVar7.f142356a;
                    int i29 = cVar7.f142358c;
                    for (int i30 = 0; i30 < i29; i30++) {
                        s1.n0.a<?, ?> aVar15 = aVarArr2[i30];
                        aVar15.f155651d.setValue(aVar15.f155653f.f155727c);
                        aVar15.f155655h = true;
                    }
                } else {
                    long j14 = (long) ((jLongValue2 - n0Var.f155646c) / f14);
                    s1.n0.a<?, ?>[] aVarArr3 = cVar7.f142356a;
                    int i34 = cVar7.f142358c;
                    boolean z17 = true;
                    for (int i35 = 0; i35 < i34; i35++) {
                        s1.n0.a<?, ?> aVar16 = aVarArr3[i35];
                        if (!aVar16.f155654g) {
                            s1.n0.this.f155645b.setValue(Boolean.FALSE);
                            if (aVar16.f155655h) {
                                aVar16.f155655h = false;
                                aVar16.f155656i = j14;
                            }
                            long j15 = j14 - aVar16.f155656i;
                            aVar16.f155651d.setValue(aVar16.f155653f.e(j15));
                            aVar16.f155654g = aVar16.f155653f.c(j15);
                        }
                        if (!aVar16.f155654g) {
                            z17 = false;
                        }
                    }
                    n0Var.f155647d.setValue(Boolean.valueOf(!z17));
                }
                return Unit.INSTANCE;
            case 25:
                Set set = (Set) obj5;
                set.add(obj4);
                return new sc.b(set, obj4, (Set) obj3, (p3.p1) obj2);
            case 26:
                p005kotlin.jvm.internal.r0 r0Var2 = (p005kotlin.jvm.internal.r0) obj5;
                e23.a aVar17 = (e23.a) obj4;
                e23.a aVar18 = (e23.a) obj3;
                e23.l lVar2 = (e23.l) obj2;
                f.a aVar19 = (f.a) obj;
                aVar19.getClass();
                int i36 = aVar19.f67585a;
                if (i36 == -1) {
                    com.garmin.android.apps.connectmobile.i2.a aVar20 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                    aVar20.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ActivationRedirectScreen", "User purchased the subscription successfully.");
                    String str20 = (String) r0Var2.f105810a;
                    if (str20 != null) {
                        lVar2.invoke(str20);
                    }
                } else if (i36 == 0) {
                    com.garmin.android.apps.connectmobile.i2.a aVar21 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                    aVar21.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "ActivationRedirectScreen", "User canceled their subscription purchase.");
                    aVar17.invoke();
                } else if (i36 != 9) {
                    com.garmin.android.apps.connectmobile.i2.a aVar22 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                    aVar22.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "ActivationRedirectScreen", "User failed their subscription purchase.");
                    aVar17.invoke();
                } else {
                    com.garmin.android.apps.connectmobile.i2.a aVar23 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                    aVar23.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "ActivationRedirectScreen", "Purchase failed due to an error in the purchase flow.");
                    aVar18.invoke();
                }
                return Unit.INSTANCE;
            case 27:
                zc.d dVar2 = (zc.d) obj5;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                e2.f0.f(f0Var, dVar2.b(), new zc.a(new se0.a(i17), dVar2), new z3.e(-645461407, true, new qw.b(dVar2, (gg1.o0) obj4, (e23.l) obj3, (e23.l) obj2, 4)), 4);
                if (dVar2.d().f196387c instanceof yc.z0.a) {
                    e2.f0.b(f0Var, null, new z3.e(1066057203, true, new r22.g(dVar2, i18)), 3);
                }
                return Unit.INSTANCE;
            case 28:
                i53.d dVar3 = (i53.d) obj5;
                p3.p1 p1Var9 = (p3.p1) obj4;
                p3.p1 p1Var10 = (p3.p1) obj3;
                e23.a aVar24 = (e23.a) obj2;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                for (c80.u uVar4 : c80.u.f25612w) {
                    List list7 = (List) dVar3.get(uVar4);
                    if (list7 == null) {
                        list7 = p13.j0.f134944a;
                    }
                    if (!list7.isEmpty()) {
                        e2.f0.b(f0Var2, "header-" + uVar4, new z3.e(-1168559783, true, new ok0.q(uVar4, z14 ? 1 : 0)), 2);
                        f0Var2.a(list7.size(), new sk0.l1.f(new se0.a(29), list7), new sk0.l1.g(sk0.l1.e.f159739a, list7), new z3.e(802480018, true, new sk0.l1.h(list7, p1Var9, p1Var10)));
                    }
                }
                if (!dVar3.isEmpty()) {
                    e2.f0.b(f0Var2, "add-gear-row", new z3.e(1025787337, true, new k11.u(p1Var9, p1Var10, aVar24)), 2);
                }
                return Unit.INSTANCE;
            default:
                o53.b0 b0Var2 = (o53.b0) obj5;
                sm1.s sVar3 = (sm1.s) obj4;
                n82.f fVar6 = (n82.f) obj3;
                mc mcVar = (mc) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ge1.b.T(b0Var2, null, null, new sm1.r.e(mcVar, null), 3);
                    sn.a.o(f12.l.f68084a, true);
                    sVar3.f160192l.i(fVar6.b(), true);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f120579a = i14;
        this.f120583e = obj;
        this.f120580b = obj2;
        this.f120581c = obj3;
        this.f120582d = obj4;
    }

    public /* synthetic */ e0(or0.m mVar, Context context, String str, p3.p1 p1Var) {
        this.f120579a = 8;
        this.f120583e = mVar;
        this.f120581c = context;
        this.f120580b = str;
        this.f120582d = p1Var;
    }

    public /* synthetic */ e0(LocalDate localDate, LocalDate localDate2, Object obj, String str, int i14) {
        this.f120579a = i14;
        this.f120583e = localDate;
        this.f120581c = localDate2;
        this.f120582d = obj;
        this.f120580b = str;
    }
}
