package rk0;

import android.content.Context;
import com.airbnb.lottie.LottieComposition;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessFeedBackPhraseTest;
import i3.i7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Unit;
import p3.x1;
import s70.j1;
import sk0.s1;
import v62.k7;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f153046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f153047c;

    public /* synthetic */ a1(int i14, Object obj, Object obj2) {
        this.f153045a = i14;
        this.f153046b = obj;
        this.f153047c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0434  */
    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:248:0x0722  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List<ir0.b> list;
        am.x0 x0VarB;
        gs1.o oVar;
        gs1.o oVar2;
        gs1.o oVar3;
        gs1.o oVar4;
        List<ir0.g> list2;
        int i14 = this.f153045a;
        int i15 = 9;
        p3.m.a aVar = p3.m.f135153a;
        final int i16 = 2;
        final int i17 = 0;
        final int i18 = 1;
        Object obj3 = this.f153047c;
        Object obj4 = this.f153046b;
        switch (i14) {
            case 0:
                String str = (String) obj4;
                GearActivity.w wVar = (GearActivity.w) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.f.c(0, 54, null, wVar, null, gl1.y.P(R.string.tracked_type_activities, new Object[]{str}, mVar), mVar, null);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                mm1.e eVar = (mm1.e) obj4;
                b10.d dVar = (b10.d) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (eVar != null) {
                        mVar2.C(908776914);
                        l72.x0.f111346a.e(null, z3.f.c(-1787387762, new o72.b(26, eVar, dVar), mVar2), mVar2, (l72.x0.f111348c << 6) | 48, 1);
                        mVar2.f();
                    } else {
                        mVar2.C(909928192);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ro0.t.a((ro0.x) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 3:
                ir0.a aVar2 = (ir0.a) obj4;
                hz.b bVar = (hz.b) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    DateTimeZone dateTimeZone = bVar.f86381d;
                    ArrayList arrayList = new ArrayList();
                    if (aVar2 != null && (list2 = aVar2.f94777n) != null && !list2.isEmpty() && !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (((ir0.g) it.next()).f94808b > 0) {
                                float f14 = aVar2.f94773j;
                                for (ir0.g gVar : list2) {
                                    f14 += gVar.f94808b;
                                    arrayList.add(new hz.d(new DateTime(gVar.f94807a, dateTimeZone), f14));
                                }
                            }
                        }
                    }
                    float f15 = aVar2 != null ? aVar2.f94773j : 0;
                    pr0.d dVar2 = new pr0.d(p13.h0.N0(arrayList, new or0.b()), f15, aVar2 != null ? aVar2.f94774k : f15, aVar2 != null ? aVar2.f94770g : 150);
                    hz.f fVar = new hz.f((aVar2 == null || (oVar4 = aVar2.f94778o) == null) ? null : oVar4.h(), (aVar2 == null || (oVar3 = aVar2.f94778o) == null) ? null : oVar3.g(), (aVar2 == null || (oVar2 = aVar2.f94778o) == null) ? null : oVar2.f(), (aVar2 == null || (oVar = aVar2.f94778o) == null) ? null : oVar.d(), bVar.f86381d);
                    ArrayList arrayList2 = new ArrayList();
                    if (aVar2 != null && (list = aVar2.f94779p) != null) {
                        for (ir0.b bVar2 : oc.b.i(list)) {
                            if (bVar2.d()) {
                                gs1.f fVar2 = bVar2.f94782a;
                                if (fVar2 != null) {
                                    x0VarB = fs1.b.b(fVar2);
                                } else {
                                    x0VarB = null;
                                }
                            } else {
                                ActivityListItemDTO activityListItemDTO = bVar2.f94783b;
                                if (activityListItemDTO != null) {
                                    x0VarB = activityListItemDTO.f29265g;
                                } else {
                                    x0VarB = null;
                                }
                            }
                            if (x0VarB == null) {
                                x0VarB = am.x0.F;
                            }
                            arrayList2.add(new pr0.c(x0VarB, bVar2.d(), bVar2.b(), dateTimeZone));
                        }
                    }
                    rr0.z.a(dVar2, bVar, fVar, arrayList2, aVar2.f94780q, mVar3, 576);
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                rr0.a0.a((pr0.d) obj4, (hz.b) obj3, (p3.m) obj, p3.p0.t(65));
                break;
            case 5:
                ((Integer) obj2).getClass();
                rv1.i.e((vt1.o) obj4, (Map) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ry0.i.a((ry0.j) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 7:
                h82.r rVar = (h82.r) obj4;
                s52.g gVar2 = (s52.g) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i19 = s52.g.f157408g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    rVar.t(R.string.lbl_how_to_set_benchmarks, mVar4, 0);
                    ArrayList arrayList3 = gVar2.f157409f;
                    if (arrayList3 == null) {
                        mVar4.C(-1389449161);
                        mVar4.f();
                    } else {
                        mVar4.C(-1389449160);
                        if (arrayList3.isEmpty()) {
                            mVar4.C(-1864622485);
                            mVar4.f();
                        } else {
                            mVar4.C(-1865251940);
                            rVar.q(gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.P(R.string.msg_set_benchmarks_for_exercises_param, new Object[]{String.valueOf(arrayList3.size())}, mVar4), gl1.y.Q(mVar4, R.string.lbl_these_exercises_colon)}, mVar4), mVar4, 0);
                            rVar.g(z3.f.c(217422052, new a1(8, arrayList3, rVar), mVar4), mVar4, 6);
                            mVar4.f();
                        }
                        rVar.c(mVar4, 0);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                break;
            case 8:
                List list3 = (List) obj4;
                h82.r rVar2 = (h82.r) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i24 = s52.g.f157408g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        rVar2.e(0, 2, (String) it3.next(), null, mVar5);
                    }
                    x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                s70.c0.h((o70.a0) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(9));
                break;
            case 10:
                ((Integer) obj2).getClass();
                s70.i0.b((androidx.lifecycle.n0) obj4, (e23.p) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 11:
                j70.r rVar3 = (j70.r) obj4;
                j70.r rVar4 = (j70.r) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.check, mVar6, 0), null, l4.k.a(h4.r.S, (rVar3 != rVar4 ? 0 : 1) != 0 ? 1.0f : 0.0f), fb1.c.g(d92.b.f58623a, mVar6), mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 12:
                ue0.l lVar = (ue0.l) obj4;
                sg0.f0 f0Var = (sg0.f0) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    l72.s sVar = l72.s.f111232a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = k7.a(t62.b.f162798a);
                    l72.s.a aVar3 = l72.s.a.KNOCKOUT;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f16 = eVar2.f97920e;
                    h4.r rVarC = c2.l.C(aVar4, f16, 0.0f, f16, eVar2.f97921f, 2);
                    String strQ = gl1.y.Q(mVar7, R.string.lbl_review_contact_lists);
                    String strQ2 = gl1.y.Q(mVar7, R.string.msg_review_contact_lists);
                    boolean zR = mVar7.r(lVar) | mVar7.r(f0Var);
                    Object objQ = mVar7.q();
                    if (zR) {
                        objQ = new j1(5, lVar, f0Var);
                        mVar7.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j1(5, lVar, f0Var);
                            mVar7.K(objQ);
                        }
                    }
                    sVar.c(rVarC, dVarA, aVar3, null, strQ, strQ2, null, false, (e23.a) objQ, null, mVar7, 384, 0, 1480);
                } else {
                    mVar7.e();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                sg0.t.b((sg0.f0) obj4, (sg0.q0) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 14:
                ManageFamilyActivity manageFamilyActivity = (ManageFamilyActivity) obj4;
                ue0.l lVar2 = (ue0.l) obj2;
                ManageFamilyActivity.a aVar5 = ManageFamilyActivity.f35178j;
                ((PrivacyType) obj).getClass();
                lVar2.getClass();
                manageFamilyActivity.f35186h.a(manageFamilyActivity.f35181c.j((Context) obj3, ((sg0.u) r53.s.d(manageFamilyActivity.da().f159087f).f150540a.getValue()).f159160e, lVar2), null);
                break;
            case 15:
                ((Integer) obj2).getClass();
                sg0.y0.c((nw0.n) obj3, (String) obj4, (p3.m) obj, p3.p0.t(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                sg2.d.a((LottieComposition) obj4, (sg2.e) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                sg2.d.c((c2.t) obj4, (sg2.e) obj3, (p3.m) obj, p3.p0.t(7));
                break;
            case 18:
                ((Integer) obj2).getClass();
                sg2.s.a((h4.r) obj4, (ah2.e) obj3, (p3.m) obj, p3.p0.t(7));
                break;
            case 19:
                ((Integer) obj2).getClass();
                si1.h.e((h4.r) obj4, (ti1.b) obj3, (p3.m) obj, p3.p0.t(7));
                break;
            case 20:
                ti1.a aVar6 = (ti1.a) obj4;
                e23.a aVar7 = (e23.a) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    si1.w wVar2 = aVar6.f164582h;
                    if (wVar2 == si1.w.PROCESSING || wVar2 == si1.w.FAILED) {
                        mVar8.C(-1412733819);
                        z02.f.c(0, 54, null, aVar7, null, gl1.y.Q(mVar8, R.string.device_settings_inreach_plan_screen_title), mVar8, null);
                        mVar8.f();
                    } else {
                        mVar8.C(-1412526243);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                break;
            case 21:
                si1.e eVar3 = (si1.e) obj4;
                e23.a aVar8 = (e23.a) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f17 = j92.b.f97899b.f97920e;
                    si1.q.a(eVar3, c2.l.C(aVar9, f17, f17, f17, 0.0f, 8), aVar8, mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                sk0.g.f((uk0.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                s1.b((GearActivity.w) obj3, (e23.l) obj4, (p3.m) obj, p3.p0.t(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                int i25 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                ((com.garmin.android.apps.connectmobile.sleep.presentation.a) obj3).t((String) obj4, (p3.m) obj, p3.p0.t(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                int i26 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                ((com.garmin.android.apps.connectmobile.sleep.presentation.a) obj4).r((ql1.b) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 26:
                com.garmin.android.apps.connectmobile.sleep.presentation.a aVar10 = (com.garmin.android.apps.connectmobile.sleep.presentation.a) obj4;
                h82.r rVar5 = (h82.r) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i27 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    aVar10.g(gl1.y.Q(mVar10, R.string.enumeration_item_one), gl1.y.Q(mVar10, R.string.msg_data_accuracy_wear_device_guideline_description), mVar10, 0);
                    rVar5.c(mVar10, 0);
                    aVar10.g(gl1.y.Q(mVar10, R.string.enumeration_item_two), gl1.y.Q(mVar10, R.string.msg_data_accuracy_wear_device_min_guideline_description), mVar10, 0);
                    rVar5.c(mVar10, 0);
                    if (c22.b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry())) {
                        mVar10.C(850432856);
                        aVar10.g(gl1.y.Q(mVar10, R.string.enumeration_item_three), gl1.y.Q(mVar10, R.string.msg_data_accuracy_additional_features_guideline_description_jp), mVar10, 0);
                        mVar10.f();
                    } else {
                        mVar10.C(850747413);
                        aVar10.g(gl1.y.Q(mVar10, R.string.enumeration_item_three), gl1.y.Q(mVar10, R.string.msg_data_accuracy_additional_features_guideline_description), mVar10, 0);
                        mVar10.f();
                    }
                    rVar5.c(mVar10, 0);
                    aVar10.g(gl1.y.Q(mVar10, R.string.enumeration_item_four), gl1.y.Q(mVar10, R.string.msg_data_accuracy_device_usage_guideline_description), mVar10, 0);
                    rVar5.c(mVar10, 0);
                    aVar10.g(gl1.y.Q(mVar10, R.string.enumeration_item_five), gl1.y.Q(mVar10, R.string.msg_data_accuracy_multiple_devices_guideline_description), mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                sz1.m.c((oz1.a) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 28:
                String str2 = (String) obj4;
                TrainingReadinessFeedBackPhraseTest trainingReadinessFeedBackPhraseTest = (TrainingReadinessFeedBackPhraseTest) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i28 = TrainingReadinessFeedBackPhraseTest.f46487a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    boolean zR2 = mVar11.r(trainingReadinessFeedBackPhraseTest);
                    Object objQ2 = mVar11.q();
                    if (zR2) {
                        objQ2 = new sg0.w0(trainingReadinessFeedBackPhraseTest, i15);
                        mVar11.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new sg0.w0(trainingReadinessFeedBackPhraseTest, i15);
                            mVar11.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ2, null, str2, mVar11, null);
                } else {
                    mVar11.e();
                }
                break;
            default:
                h82.r rVar6 = (h82.r) obj4;
                final t11.j jVar = (t11.j) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i29 = t11.j.f161736f;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar12, R.string.nutrition_101);
                    boolean zR3 = mVar12.r(jVar);
                    Object objQ3 = mVar12.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: t11.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i17;
                                j jVar2 = jVar;
                                switch (i30) {
                                    case 0:
                                        int i34 = j.f161736f;
                                        jVar2.e("NUTRITION_101");
                                        break;
                                    case 1:
                                        int i35 = j.f161736f;
                                        jVar2.e("HOW_IT_WORKS");
                                        break;
                                    default:
                                        int i36 = j.f161736f;
                                        jVar2.e("RECOMMENDATIONS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: t11.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i17;
                                    j jVar2 = jVar;
                                    switch (i30) {
                                        case 0:
                                            int i34 = j.f161736f;
                                            jVar2.e("NUTRITION_101");
                                            break;
                                        case 1:
                                            int i35 = j.f161736f;
                                            jVar2.e("HOW_IT_WORKS");
                                            break;
                                        default:
                                            int i36 = j.f161736f;
                                            jVar2.e("RECOMMENDATIONS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ3);
                        }
                    }
                    rVar6.C(strQ3, null, false, (e23.a) objQ3, mVar12, 0, 6);
                    boolean zR4 = mVar12.r(jVar);
                    Object objQ4 = mVar12.q();
                    if (zR4) {
                        objQ4 = new e23.a() { // from class: t11.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i18;
                                j jVar2 = jVar;
                                switch (i30) {
                                    case 0:
                                        int i34 = j.f161736f;
                                        jVar2.e("NUTRITION_101");
                                        break;
                                    case 1:
                                        int i35 = j.f161736f;
                                        jVar2.e("HOW_IT_WORKS");
                                        break;
                                    default:
                                        int i36 = j.f161736f;
                                        jVar2.e("RECOMMENDATIONS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new e23.a() { // from class: t11.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i18;
                                    j jVar2 = jVar;
                                    switch (i30) {
                                        case 0:
                                            int i34 = j.f161736f;
                                            jVar2.e("NUTRITION_101");
                                            break;
                                        case 1:
                                            int i35 = j.f161736f;
                                            jVar2.e("HOW_IT_WORKS");
                                            break;
                                        default:
                                            int i36 = j.f161736f;
                                            jVar2.e("RECOMMENDATIONS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ4);
                        }
                    }
                    rVar6.B(R.string.common_how_it_works, null, false, (e23.a) objQ4, mVar12, 0, 6);
                    boolean zR5 = mVar12.r(jVar);
                    Object objQ5 = mVar12.q();
                    if (zR5) {
                        objQ5 = new e23.a() { // from class: t11.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i16;
                                j jVar2 = jVar;
                                switch (i30) {
                                    case 0:
                                        int i34 = j.f161736f;
                                        jVar2.e("NUTRITION_101");
                                        break;
                                    case 1:
                                        int i35 = j.f161736f;
                                        jVar2.e("HOW_IT_WORKS");
                                        break;
                                    default:
                                        int i36 = j.f161736f;
                                        jVar2.e("RECOMMENDATIONS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new e23.a() { // from class: t11.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i16;
                                    j jVar2 = jVar;
                                    switch (i30) {
                                        case 0:
                                            int i34 = j.f161736f;
                                            jVar2.e("NUTRITION_101");
                                            break;
                                        case 1:
                                            int i35 = j.f161736f;
                                            jVar2.e("HOW_IT_WORKS");
                                            break;
                                        default:
                                            int i36 = j.f161736f;
                                            jVar2.e("RECOMMENDATIONS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ5);
                        }
                    }
                    rVar6.B(R.string.lbl_recommendations, null, false, (e23.a) objQ5, mVar12, 0, 6);
                } else {
                    mVar12.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a1(Object obj, Object obj2, int i14, int i15) {
        this.f153045a = i15;
        this.f153046b = obj;
        this.f153047c = obj2;
    }

    public /* synthetic */ a1(Object obj, Object obj2, boolean z14, int i14, int i15) {
        this.f153045a = i15;
        this.f153047c = obj;
        this.f153046b = obj2;
    }
}
