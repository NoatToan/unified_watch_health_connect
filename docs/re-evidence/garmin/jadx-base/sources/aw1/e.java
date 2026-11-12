package aw1;

import android.content.Context;
import android.os.Parcelable;
import c22.g2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f72.p8;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import u62.f3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13346b;

    public /* synthetic */ e(h hVar, int i14) {
        this.f13345a = i14;
        this.f13346b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:110:0x023f  */
    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:218:0x049f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0529  */
    /* JADX WARN: Code duplicated, block: B:288:0x0689  */
    /* JADX WARN: Code duplicated, block: B:330:0x0730  */
    /* JADX WARN: Code duplicated, block: B:331:0x0733  */
    /* JADX WARN: Code duplicated, block: B:334:0x076d  */
    /* JADX WARN: Code duplicated, block: B:335:0x0770  */
    /* JADX WARN: Code duplicated, block: B:338:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:339:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:344:0x07db  */
    /* JADX WARN: Code duplicated, block: B:347:0x0812  */
    /* JADX WARN: Code duplicated, block: B:348:0x0815  */
    /* JADX WARN: Code duplicated, block: B:351:0x0845  */
    /* JADX WARN: Code duplicated, block: B:352:0x0848  */
    /* JADX WARN: Code duplicated, block: B:355:0x0889  */
    /* JADX WARN: Code duplicated, block: B:357:0x089a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:358:0x089c  */
    /* JADX WARN: Code duplicated, block: B:360:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:365:0x08de  */
    /* JADX WARN: Code duplicated, block: B:368:0x091b  */
    /* JADX WARN: Code duplicated, block: B:369:0x091e  */
    /* JADX WARN: Code duplicated, block: B:371:0x0947  */
    /* JADX WARN: Code duplicated, block: B:373:0x094d  */
    /* JADX WARN: Code duplicated, block: B:377:0x0959  */
    /* JADX WARN: Code duplicated, block: B:388:0x0986  */
    /* JADX WARN: Code duplicated, block: B:395:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:401:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:404:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:411:0x09df  */
    /* JADX WARN: Code duplicated, block: B:414:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:417:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:427:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:430:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:437:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:443:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:448:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:450:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:460:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:463:0x0b1a  */
    /* JADX WARN: Code duplicated, block: B:516:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:517:0x0c2a  */
    /* JADX WARN: Code duplicated, block: B:520:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:526:0x0c7b  */
    /* JADX WARN: Code duplicated, block: B:530:0x0c84  */
    /* JADX WARN: Code duplicated, block: B:532:0x0ca9  */
    /* JADX WARN: Code duplicated, block: B:590:0x0979 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0996 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x09b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x09da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x09cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x09c0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x0a04 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x09f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x09ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0a2e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0a14 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v68 */
    @Override // e23.l
    public final Object invoke(Object obj) {
        fg0.p pVar;
        String strR;
        fg0.k kVar;
        String string;
        boolean z14;
        o13.p pVar2;
        boolean z15;
        ArrayList arrayList;
        String strB;
        String str;
        String str2;
        vt1.o oVar;
        String str3;
        String str4;
        String string2;
        String str5;
        boolean z16;
        boolean z17;
        String strR2;
        boolean z18;
        boolean z19;
        int i14;
        String string3;
        String str6;
        String strA;
        String str7;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        fg0.j jVar;
        vt1.f fVar;
        jv1.m mVar;
        o13.p pVar3;
        Integer num;
        String str8;
        List listK;
        String str9;
        boolean z34;
        String string4;
        Double d14;
        gg0.i iVar;
        String strH;
        Integer numValueOf;
        Double d15;
        gg0.i iVar2;
        Double d16;
        int i15;
        int i16;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        Iterator it;
        Object next;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2;
        Iterator it3;
        Object next2;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar3;
        Iterator it4;
        Object next3;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar4;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH2;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH3;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar2;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH4;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar3;
        fg0.d customGoal;
        double dDoubleValue;
        fg0.d customGoal2;
        gg0.i unit;
        Double value;
        Iterator it5;
        Object next4;
        Iterator it6;
        Object next5;
        Iterator it7;
        Object next6;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar5;
        fg0.d customGoal3;
        long jDoubleValue;
        String strE1;
        String str10;
        Double value2;
        String string5;
        LocalDate date;
        String strB0;
        tw1.c cVar4;
        jv1.e eVarY5;
        int i17 = this.f13345a;
        h hVar = this.f13346b;
        switch (i17) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i18 = h.S1;
                if (zBooleanValue) {
                    hVar.l7();
                }
                return Unit.INSTANCE;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i19 = h.S1;
                if (zBooleanValue2) {
                    hVar.f7();
                }
                return Unit.INSTANCE;
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                int i24 = h.S1;
                if (zBooleanValue3) {
                    hVar.u7();
                    hVar.u5();
                    hVar.k7();
                }
                return Unit.INSTANCE;
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                int i25 = h.S1;
                if (zBooleanValue4) {
                    hVar.j7();
                }
                return Unit.INSTANCE;
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                int i26 = h.S1;
                if (zBooleanValue5) {
                    hVar.j7();
                }
                return Unit.INSTANCE;
            case 5:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                int i27 = h.S1;
                if (zBooleanValue6) {
                    hVar.s6().j("FBTSwimDaysSelectionFragCompose");
                }
                return Unit.INSTANCE;
            case 6:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                int i28 = h.S1;
                if (zBooleanValue7) {
                    hVar.f7();
                }
                return Unit.INSTANCE;
            case 7:
                boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                int i29 = h.S1;
                if (!zBooleanValue8) {
                    hVar.u5();
                    hVar.k7();
                } else if (hVar.Y7()) {
                    hVar.s6().j("FBTAddCourseFragment");
                } else {
                    hVar.s6().j("FBTElevationProfileFragment");
                }
                return Unit.INSTANCE;
            case 8:
                boolean zBooleanValue9 = ((Boolean) obj).booleanValue();
                int i30 = h.S1;
                if (zBooleanValue9) {
                    hVar.o5();
                }
                return Unit.INSTANCE;
            case 9:
                boolean zBooleanValue10 = ((Boolean) obj).booleanValue();
                int i34 = h.S1;
                if (zBooleanValue10) {
                    hVar.o5();
                }
                return Unit.INSTANCE;
            default:
                jv1.s sVar = (jv1.s) obj;
                int i35 = h.S1;
                sVar.getClass();
                vt1.e eVar = sVar.f101122a;
                vt1.m mVar2 = sVar.f101123b;
                vt1.o oVar2 = sVar.f101125d;
                Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
                String str11 = sVar.f101138q;
                fg0.k kVar6 = sVar.f101124c;
                if (kVar6 != null) {
                    Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                    strR = kVar6.r(false);
                    if (strR == null) {
                        pVar = sVar.f101145x;
                        if (pVar != null) {
                            strR = fg0.p.b(pVar);
                        } else {
                            strR = null;
                        }
                        if (strR == null) {
                            kVar = sVar.f101146y;
                            if (kVar != null) {
                                Parcelable.Creator<fg0.k> creator2 = fg0.k.CREATOR;
                                strR = kVar.r(false);
                            } else {
                                strR = null;
                            }
                        }
                    }
                } else {
                    pVar = sVar.f101145x;
                    if (pVar != null) {
                        strR = fg0.p.b(pVar);
                    } else {
                        strR = null;
                    }
                    if (strR == null) {
                        kVar = sVar.f101146y;
                        if (kVar != null) {
                            Parcelable.Creator<fg0.k> creator3 = fg0.k.CREATOR;
                            strR = kVar.r(false);
                        } else {
                            strR = null;
                        }
                    }
                }
                if (strR != null) {
                    x0 x0Var = x0.f105818a;
                    String string6 = contextB.getString(R.string.named_plan);
                    string6.getClass();
                    string = String.format(string6, Arrays.copyOf(new Object[]{strR}, 1));
                } else {
                    string = null;
                }
                if (str11 == null) {
                    String strR5 = hVar.r5(contextB);
                    if (strR5 != null) {
                        string = strR5;
                    } else if (string == null) {
                        string = contextB.getString(R.string.named_plan, contextB.getString(R.string.lbl_fitness));
                        string.getClass();
                    }
                } else {
                    string = str11;
                }
                if (!string.equals(str11)) {
                    jv1.s sVarI6 = hVar.i6();
                    hVar.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 511) : null);
                }
                dw1.b bVar = dw1.b.f61444a;
                boolean z35 = hVar.f13383p1;
                boolean z36 = (!hVar.J6() || (eVarY5 = hVar.y5()) == null || eVarY5.f101039h) ? false : true;
                boolean zC8 = hVar.c8();
                fg0.k kVarB6 = hVar.b6();
                bVar.getClass();
                Integer numValueOf2 = Integer.valueOf(R.string.coach_title);
                hv1.i iVar3 = sVar.f101137p;
                Context contextB2 = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
                l22.a aVar = new l22.a(contextB2);
                String str12 = sVar.f101138q;
                xw1.h hVar2 = sVar.f101130i;
                String coachFirstName = hVar2 != null ? hVar2.getCoachFirstName() : null;
                vt1.o oVar3 = vt1.o.f180176g;
                String name = (oVar2 != oVar3 || (cVar4 = sVar.f101131j) == null) ? null : cVar4.getName();
                List<wt1.q> listM = sVar.m();
                List<wt1.q> listJ = sVar.j();
                String str13 = name;
                LocalDate localDateD = sVar.d();
                tw1.d dVar = sVar.A;
                String string7 = dVar != null ? contextB2.getString(R.string.lbl_plural_more_than_one_hour_capitalized, String.valueOf(dVar.getAvgWorkoutHoursPerWeek())) : null;
                vt1.j jVar2 = sVar.f101147z;
                String string8 = jVar2 != null ? contextB2.getString(jVar2.f180135a) : null;
                fg0.k kVarF = sVar.f();
                int i36 = kVarF != null ? p005kotlin.jvm.internal.s.g(kVarF.getRace(), Boolean.TRUE) : false ? R.string.lbl_race : R.string.lbl_event;
                if (coachFirstName != null) {
                    z14 = z36;
                    pVar2 = new o13.p(numValueOf2, e5.g(contextB2.getString(R.string.coach_title), StringUtils.SPACE, coachFirstName));
                } else {
                    z14 = z36;
                    if (str13 != null) {
                        pVar2 = new o13.p(Integer.valueOf(R.string.plan_type), contextB2.getString(R.string.named_plan, str13));
                    } else if (!(mVar2 == vt1.m.FBT_ADAPTIVE)) {
                        pVar2 = new o13.p(null, null);
                    } else if ((oVar2 != null ? oVar2.e(contextB2) : null) != null) {
                        pVar2 = new o13.p(numValueOf2, oVar2.e(contextB2));
                    } else {
                        pVar2 = new o13.p(null, null);
                    }
                }
                Integer num2 = (Integer) pVar2.f128594a;
                String str14 = (String) pVar2.f128595b;
                Integer num3 = sVar.g() ? sVar.f101141t : null;
                tw1.k kVar7 = sVar.O;
                String string9 = kVar7 != null ? contextB2.getString(kVar7.f166749c) : null;
                vt1.h hVar3 = sVar.F;
                if (hVar3 == null) {
                    hVar3 = vt1.h.NONE;
                }
                Integer num4 = num3;
                if (!z35) {
                    z15 = false;
                } else if (!(mVar2 == vt1.m.FBT_ADAPTIVE)) {
                    z15 = false;
                } else if (oVar2 == vt1.o.f180180k) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                boolean z37 = oVar2 == vt1.o.f180175f || oVar2 == oVar3;
                int i37 = oVar2 == vt1.o.f180179j ? R.string.lbl_days_available : R.string.training_days;
                tu1.i.a aVar2 = tu1.i.f166483a;
                if (listM == null) {
                    listM = p13.j0.f134944a;
                }
                boolean z38 = z15;
                aVar2.getClass();
                o13.p pVarC = tu1.i.a.c(contextB2, listM);
                boolean z39 = z37;
                String str15 = (String) pVarC.f128594a;
                String str16 = (String) pVarC.f128595b;
                o13.p pVarC2 = tu1.i.a.c(contextB2, listJ == null ? p13.j0.f134944a : listJ);
                String str17 = string9;
                String str18 = (String) pVarC2.f128594a;
                String str19 = (String) pVarC2.f128595b;
                List<String> list = sVar.f101136o;
                if (list != null) {
                    arrayList = new ArrayList(p13.y.r(list, 10));
                    for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                        wr.g.z(wt1.q.f187120f, (String) it8.next(), arrayList);
                    }
                } else {
                    arrayList = null;
                }
                tu1.i.a aVar3 = tu1.i.f166483a;
                List list2 = arrayList == null ? p13.j0.f134944a : arrayList;
                aVar3.getClass();
                o13.p pVarC3 = tu1.i.a.c(contextB2, list2);
                String str20 = (String) pVarC3.f128594a;
                String str21 = (String) pVarC3.f128595b;
                int i38 = (arrayList != null ? arrayList.size() : 0) > 1 ? R.string.swim_days : R.string.swim_day;
                if (iVar3 != null) {
                    hv1.i.a aVar4 = hv1.i.f85867c;
                    strB = iVar3.b(contextB2, false);
                } else {
                    strB = "";
                }
                String strA2 = iVar3 != null ? hv1.i.a(iVar3, contextB2) : "";
                String str22 = strB;
                vt1.o oVar4 = vt1.o.f180180k;
                boolean z44 = oVar2 == oVar4;
                String str23 = strA2;
                int i39 = i38;
                String strA3 = new zv1.a(aVar).a(sVar.K, sVar.L, sVar.M);
                if (strA3 == null) {
                    str = "";
                } else {
                    oi0.b bVar2 = new oi0.b(aVar, strA3);
                    bVar2.y();
                    bVar2.g();
                    Unit unit2 = Unit.INSTANCE;
                    str = bVar2.f132238b;
                }
                e60.a aVar5 = new e60.a(aVar, false, null, 6, null);
                z20.e eVar2 = sVar.N;
                if (eVar2 != null) {
                    str3 = strA3;
                    String str24 = eVar2.f201898b;
                    str4 = str;
                    double d17 = eVar2.f201900d;
                    str2 = str16;
                    oVar = oVar2;
                    double d18 = eVar2.f201901e;
                    l22.b bVar3 = aVar5.f63147a;
                    string2 = (str24 == null || str24.length() == 0) ? bVar3.getString(R.string.txt_untitle) : str24;
                    String strA4 = aVar5.a(d17, "");
                    if (Double.isNaN(d18)) {
                        strB0 = "";
                    } else {
                        l3.a aVar6 = l3.f23124b;
                        DecimalFormat decimalFormat = l3.f23126d;
                        aVar6.getClass();
                        strB0 = l3.a.b0(aVar5.f63147a, d18, aVar5.f63149c, false, decimalFormat);
                    }
                    if (strA4.length() > 0 && strB0.length() > 0) {
                        string2 = bVar3.a(R.string.string_bullet_string_bullet_string_pattern, string2, strA4, strB0);
                    } else if (strA4.length() > 0) {
                        string2 = bVar3.a(R.string.string_space_bullet_string_pattern, string2, strA4);
                    } else if (strB0.length() > 0) {
                        string2 = bVar3.a(R.string.string_space_bullet_string_pattern, string2, strB0);
                    }
                } else {
                    str2 = str16;
                    oVar = oVar2;
                    str3 = strA3;
                    str4 = str;
                    string2 = null;
                }
                if (string2 == null) {
                    str5 = "";
                } else {
                    oi0.b bVar4 = new oi0.b(aVar, string2);
                    bVar4.s();
                    bVar4.B();
                    bVar4.y();
                    bVar4.g();
                    Unit unit3 = Unit.INSTANCE;
                    str5 = bVar4.f132238b;
                }
                boolean z45 = sVar.g() && sVar.h();
                String str25 = sVar.f101139r;
                String string10 = contextB2.getString(R.string.plan_name);
                string10.getClass();
                jv1.t tVar = new jv1.t(string10, str12, null, !sVar.g(), false, null, false, "FBTNameYourPlanFragCompose", null, null, 884, null);
                String string11 = contextB2.getString(R.string.event_name);
                string11.getClass();
                jv1.t tVar2 = new jv1.t(string11, str25, null, true, z45, null, false, "FBTNameYourPlanFragCompose", null, null, 868, null);
                String string12 = contextB2.getString(R.string.pregnancy_end_date);
                string12.getClass();
                String string13 = localDateD != null ? localDateD.toString(localDateD.getYear() != LocalDate.now().getYear() ? "MMM d, yyyy" : "MMM d") : null;
                if (sVar.h()) {
                    z16 = true;
                } else if (eVar == vt1.e.IMPROVE_FITNESS) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                jv1.t tVar3 = new jv1.t(string12, string13, null, false, z16, null, false, "FBTGoalDateSelectionFragmentCompose", null, null, 876, null);
                String string14 = contextB2.getString(i36);
                string14.getClass();
                if (kVarF == null || (date = kVarF.getDate()) == null) {
                    z17 = false;
                    strR2 = null;
                } else {
                    DateTime dateTimeK = c22.j0.K(date.toString(), "yyyy-MM-dd");
                    String strB2 = date.getYear() == LocalDate.now().getYear() ? c22.j0.b(dateTimeK, "MMM d", null) : c22.j0.b(dateTimeK, "MMMM dd, yyyy", null);
                    if (g22.n.d(strB2)) {
                        z17 = false;
                        strR2 = contextB2.getString(R.string.race_on_date, kVarF.r(false), strB2);
                    } else {
                        z17 = false;
                        strR2 = kVarF.r(false);
                        if (strR2 == null) {
                            strR2 = "";
                        }
                    }
                }
                String str26 = strR2 == null ? "" : strR2;
                if (sVar.h()) {
                    z18 = z17;
                } else if (eVar == vt1.e.IMPROVE_FITNESS ? true : z17) {
                    z18 = z17;
                } else {
                    z18 = true;
                }
                List listK2 = p13.x.k(tVar, tVar2, tVar3, new jv1.t(string14, str26, null, false, z18, null, false, "navigate_to_event_search", null, null, 876, null), new jv1.t((num2 == null || (string5 = contextB2.getString(num2.intValue())) == null) ? "" : string5, str14, null, !sVar.f101132k, (num2 == null || str14 == null) ? z17 : true, null, false, null, "startCoachEditFlow", null, 740, null));
                String string15 = contextB2.getString(R.string.workout_intensity_target_type);
                string15.getClass();
                jv1.t tVar4 = new jv1.t(string15, string8, null, false, string8 != null ? true : z17, null, false, "FBTItpPlanTypeSelectionFragmentCompose", null, null, 876, null);
                String string16 = contextB2.getString(R.string.itp_hours_week);
                string16.getClass();
                jv1.t tVar5 = new jv1.t(string16, string7, null, false, string7 != null ? true : z17, null, false, "FBTItpHoursPerWeekSelectionFragmentCompose", null, null, 876, null);
                String string17 = contextB2.getString(R.string.lbl_workouts_per_week_title);
                string17.getClass();
                jv1.t tVar6 = new jv1.t(string17, String.valueOf(num4), null, sVar.k(), num4 != null ? true : z17, null, false, null, "startEditWorkoutDaysFlow", null, 740, null);
                jv1.t tVar7 = new jv1.t(aVar.getString(R.string.lbl_training_level), str17, null, false, (!zC8 || str17 == null) ? z17 : true, null, false, "FBTSelectTrainingLevelFragment", null, null, 876, null);
                String string18 = contextB2.getString(R.string.strength_workouts);
                string18.getClass();
                jv1.t tVar8 = new jv1.t(string18, contextB2.getString(hVar3.f180121b), null, false, (z38 && z39) ? true : z17, null, false, "FBTSelectStrengthWorkoutTypeFragment", null, null, 876, null);
                String string19 = contextB2.getString(i37);
                string19.getClass();
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put("text", str2);
                b92.a aVarB = c0235a.b();
                if (z44) {
                    z19 = z17;
                } else if (str15.length() > 0 ? true : z17) {
                    z19 = true;
                } else {
                    z19 = z17;
                }
                jv1.t tVar9 = new jv1.t(string19, str15, aVarB, false, z19, null, false, "FBTAvailableTrainingDaysFragCompose", null, null, 872, null);
                ?? size = listJ != null ? listJ.size() : z17;
                vt1.o oVar5 = vt1.o.f180176g;
                vt1.o oVar6 = oVar;
                if (!(oVar6 == oVar5 ? true : z17)) {
                    if (oVar6 == vt1.o.f180178i ? true : z17) {
                        i14 = 1;
                        string3 = aVar.getString(size > 1 ? R.string.long_workout_days : R.string.long_workout_day);
                    } else {
                        i14 = 1;
                        if (oVar6 == oVar4 ? true : z17) {
                            if (size > 1) {
                                c22.x0.f23314a.getClass();
                                str6 = c22.x0.Sb;
                            } else {
                                c22.x0.f23314a.getClass();
                                str6 = c22.x0.Qb;
                            }
                            strA = dh.b.A(aVar.f109162a, g2.b(str6));
                        } else {
                            string3 = aVar.getString(size > 1 ? R.string.long_run_days : R.string.atp_lbl_long_run_day);
                        }
                    }
                    str7 = string3;
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, i14, null);
                    c0235a2.f16962a.put("text", str19);
                    b92.a aVarB2 = c0235a2.b();
                    if (str18.length() > 0) {
                        z24 = true;
                    } else {
                        z24 = z17;
                    }
                    jv1.t tVar10 = new jv1.t(str7, str18, aVarB2, false, z24, null, false, "FBTLongDaysSelectionFragCompose", null, null, 872, null);
                    String string20 = contextB2.getString(i39);
                    string20.getClass();
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    c0235a3.f16962a.put("text", str21);
                    b92.a aVarB3 = c0235a3.b();
                    if (str20.length() > 0) {
                        z25 = true;
                    } else {
                        z25 = z17;
                    }
                    jv1.t tVar11 = new jv1.t(string20, str20, aVarB3, false, z25, null, false, "FBTSwimDaysSelectionFragCompose", null, null, 872, null);
                    String string21 = contextB2.getString(R.string.swim_distance);
                    string21.getClass();
                    b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                    c0235a4.f16962a.put("text", str23);
                    b92.a aVarB4 = c0235a4.b();
                    if (str22.length() > 0) {
                        z26 = true;
                    } else {
                        z26 = z17;
                    }
                    jv1.t tVar12 = new jv1.t(string21, str22, aVarB4, false, z26, null, false, "FBTSelectSwimAbilityFragment", null, null, 872, null);
                    String string22 = contextB2.getString(R.string.strength_workouts);
                    string22.getClass();
                    String string23 = contextB2.getString(hVar3.f180121b);
                    if (z38 || z39) {
                        z27 = z17;
                    } else {
                        z27 = true;
                    }
                    jv1.t tVar13 = new jv1.t(string22, string23, null, false, z27, null, false, "FBTSelectStrengthWorkoutTypeFragment", null, null, 876, null);
                    String str27 = str4;
                    String string24 = contextB2.getString(R.string.lbl_course_profile);
                    string24.getClass();
                    b92.a.C0235a c0235a5 = new b92.a.C0235a(null, 1, null);
                    c0235a5.f16962a.put("text", str27);
                    b92.a aVarB5 = c0235a5.b();
                    if (str3 != null) {
                        z28 = true;
                    } else {
                        z28 = z17;
                    }
                    jv1.t tVar14 = new jv1.t(string24, str3, aVarB5, false, z28, null, false, null, "course_profile_action", null, 744, null);
                    String string25 = contextB2.getString(R.string.lbl_course_profile);
                    string25.getClass();
                    b92.a.C0235a c0235a6 = new b92.a.C0235a(null, 1, null);
                    c0235a6.f16962a.put("text", str5);
                    b92.a aVarB6 = c0235a6.b();
                    if (string2 != 0) {
                        z29 = true;
                    } else {
                        z29 = z17;
                    }
                    List listK3 = p13.x.k(tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, new jv1.t(string25, string2, aVarB6, false, z29, null, false, "FBTAddCourseFragment", null, null, 872, null));
                    vt1.o oVar7 = sVar.f101125d;
                    jVar = sVar.H;
                    fVar = sVar.f101128g;
                    if (jVar != null) {
                        gg0.g gVarS = jVar.s();
                        int[] iArr = dw1.c.a.f61445a;
                        int iOrdinal = gVarS.ordinal();
                        i15 = gVarS.f77155a;
                        i16 = iArr[iOrdinal];
                        if (i16 != 1) {
                            listH = kVarB6.h();
                            if (listH == null) {
                                listH = p13.j0.f134944a;
                            }
                            it = listH.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                    kVar5 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                                    if (kVar5.getEventLegActivityType() != m52.c.SWIMMING || kVar5.getEventLegActivityType() == m52.c.LAP_SWIMMING) {
                                    }
                                } else {
                                    next = null;
                                }
                                kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                                it3 = listH.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                    } else {
                                        next2 = null;
                                    }
                                    kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                                    it4 = listH.iterator();
                                    do {
                                        if (it4.hasNext()) {
                                            next3 = it4.next();
                                        } else {
                                            next3 = null;
                                        }
                                        kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                        listH2 = jVar.h();
                                        if (listH2 != null) {
                                            it7 = listH2.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    next6 = it7.next();
                                                    com.garmin.android.apps.connectmobile.workouts.data.model.c cVar5 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                                    if (kVar2 != null || cVar5.getLegIndex() != kVar2.getLegIndex()) {
                                                    }
                                                } else {
                                                    next6 = null;
                                                }
                                            }
                                            cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                        } else {
                                            cVar = null;
                                        }
                                        listH3 = jVar.h();
                                        if (listH3 != null) {
                                            it6 = listH3.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next5 = it6.next();
                                                    com.garmin.android.apps.connectmobile.workouts.data.model.c cVar6 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                                    if (kVar3 != null || cVar6.getLegIndex() != kVar3.getLegIndex()) {
                                                    }
                                                } else {
                                                    next5 = null;
                                                }
                                            }
                                            cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                        } else {
                                            cVar2 = null;
                                        }
                                        listH4 = jVar.h();
                                        if (listH4 != null) {
                                            it5 = listH4.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    next4 = it5.next();
                                                    com.garmin.android.apps.connectmobile.workouts.data.model.c cVar7 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                                    if (kVar4 != null || cVar7.getLegIndex() != kVar4.getLegIndex()) {
                                                    }
                                                } else {
                                                    next4 = null;
                                                }
                                            }
                                            cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                        } else {
                                            cVar3 = null;
                                        }
                                        m52.c cVar8 = m52.c.SWIMMING;
                                        s62.a.f157643a.getClass();
                                        jv1.t tVarA = dw1.c.a(contextB2, kVar2, cVar, cVar8, p8.a(t62.c.f162799a));
                                        jv1.t tVarB = dw1.c.b(contextB2, cVar, 1);
                                        m52.c cVar9 = m52.c.CYCLING;
                                        t62.a aVar7 = t62.a.f162797a;
                                        jv1.t tVarA2 = dw1.c.a(contextB2, kVar3, cVar2, cVar9, u62.t.a(aVar7));
                                        jv1.t tVarB2 = dw1.c.b(contextB2, cVar2, 2);
                                        jv1.t tVarA3 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar7));
                                        og0.a aVar8 = og0.a.f131967a;
                                        customGoal = jVar.getCustomGoal();
                                        if (customGoal != null || (value = customGoal.getValue()) == null) {
                                            dDoubleValue = 0.0d;
                                        } else {
                                            dDoubleValue = value.doubleValue();
                                        }
                                        customGoal2 = jVar.getCustomGoal();
                                        if (customGoal2 != null || (unit = customGoal2.getUnit()) == null) {
                                            unit = gg0.i.SECOND;
                                        }
                                        aVar8.getClass();
                                        double dJ = og0.a.j(dDoubleValue, unit);
                                        l3.f23124b.getClass();
                                        String strO1 = l3.a.o1((long) dJ);
                                        String strK1 = l3.a.k1(new l22.a(contextB2), true, (int) dJ);
                                        String string26 = contextB2.getString(R.string.overall_goal_time);
                                        string26.getClass();
                                        boolean z46 = !z14;
                                        b92.a.C0235a c0235a7 = new b92.a.C0235a(null, 1, null);
                                        c0235a7.f16962a.put("text", strK1);
                                        jv1.t tVar15 = new jv1.t(string26, strO1, c0235a7.b(), z46, false, null, true, null, null, null, 944, null);
                                        String string27 = contextB2.getString(R.string.training_goal);
                                        string27.getClass();
                                        listK = p13.x.k(new jv1.t(string27, contextB2.getString(i15), null, z46, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA, tVarB, tVarA2, tVarB2, tVarA3, tVar15);
                                    } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                                    kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                    listH2 = jVar.h();
                                    if (listH2 != null) {
                                        it7 = listH2.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                next6 = it7.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar10 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                                if (kVar2 != null) {
                                                }
                                            } else {
                                                next6 = null;
                                            }
                                        }
                                        cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                    } else {
                                        cVar = null;
                                    }
                                    listH3 = jVar.h();
                                    if (listH3 != null) {
                                        it6 = listH3.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                next5 = it6.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                                if (kVar3 != null) {
                                                }
                                            } else {
                                                next5 = null;
                                            }
                                        }
                                        cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                    } else {
                                        cVar2 = null;
                                    }
                                    listH4 = jVar.h();
                                    if (listH4 != null) {
                                        it5 = listH4.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next4 = it5.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar12 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                                if (kVar4 != null) {
                                                }
                                            } else {
                                                next4 = null;
                                            }
                                        }
                                        cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                    } else {
                                        cVar3 = null;
                                    }
                                    m52.c cVar13 = m52.c.SWIMMING;
                                    s62.a.f157643a.getClass();
                                    jv1.t tVarA4 = dw1.c.a(contextB2, kVar2, cVar, cVar13, p8.a(t62.c.f162799a));
                                    jv1.t tVarB3 = dw1.c.b(contextB2, cVar, 1);
                                    m52.c cVar14 = m52.c.CYCLING;
                                    t62.a aVar9 = t62.a.f162797a;
                                    jv1.t tVarA5 = dw1.c.a(contextB2, kVar3, cVar2, cVar14, u62.t.a(aVar9));
                                    jv1.t tVarB4 = dw1.c.b(contextB2, cVar2, 2);
                                    jv1.t tVarA6 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar9));
                                    og0.a aVar10 = og0.a.f131967a;
                                    customGoal = jVar.getCustomGoal();
                                    if (customGoal != null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    customGoal2 = jVar.getCustomGoal();
                                    if (customGoal2 != null) {
                                        unit = gg0.i.SECOND;
                                    } else {
                                        unit = gg0.i.SECOND;
                                    }
                                    aVar10.getClass();
                                    double dJ2 = og0.a.j(dDoubleValue, unit);
                                    l3.f23124b.getClass();
                                    String strO2 = l3.a.o1((long) dJ2);
                                    String strK2 = l3.a.k1(new l22.a(contextB2), true, (int) dJ2);
                                    String string28 = contextB2.getString(R.string.overall_goal_time);
                                    string28.getClass();
                                    boolean z47 = !z14;
                                    b92.a.C0235a c0235a8 = new b92.a.C0235a(null, 1, null);
                                    c0235a8.f16962a.put("text", strK2);
                                    jv1.t tVar16 = new jv1.t(string28, strO2, c0235a8.b(), z47, false, null, true, null, null, null, 944, null);
                                    String string29 = contextB2.getString(R.string.training_goal);
                                    string29.getClass();
                                    listK = p13.x.k(new jv1.t(string29, contextB2.getString(i15), null, z47, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA4, tVarB3, tVarA5, tVarB4, tVarA6, tVar16);
                                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                                kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                                it4 = listH.iterator();
                                do {
                                    if (it4.hasNext()) {
                                        next3 = it4.next();
                                    } else {
                                        next3 = null;
                                    }
                                    kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                    listH2 = jVar.h();
                                    if (listH2 != null) {
                                        it7 = listH2.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                next6 = it7.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar15 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                                if (kVar2 != null) {
                                                }
                                            } else {
                                                next6 = null;
                                            }
                                        }
                                        cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                    } else {
                                        cVar = null;
                                    }
                                    listH3 = jVar.h();
                                    if (listH3 != null) {
                                        it6 = listH3.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                next5 = it6.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar16 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                                if (kVar3 != null) {
                                                }
                                            } else {
                                                next5 = null;
                                            }
                                        }
                                        cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                    } else {
                                        cVar2 = null;
                                    }
                                    listH4 = jVar.h();
                                    if (listH4 != null) {
                                        it5 = listH4.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next4 = it5.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar17 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                                if (kVar4 != null) {
                                                }
                                            } else {
                                                next4 = null;
                                            }
                                        }
                                        cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                    } else {
                                        cVar3 = null;
                                    }
                                    m52.c cVar18 = m52.c.SWIMMING;
                                    s62.a.f157643a.getClass();
                                    jv1.t tVarA7 = dw1.c.a(contextB2, kVar2, cVar, cVar18, p8.a(t62.c.f162799a));
                                    jv1.t tVarB5 = dw1.c.b(contextB2, cVar, 1);
                                    m52.c cVar19 = m52.c.CYCLING;
                                    t62.a aVar11 = t62.a.f162797a;
                                    jv1.t tVarA8 = dw1.c.a(contextB2, kVar3, cVar2, cVar19, u62.t.a(aVar11));
                                    jv1.t tVarB6 = dw1.c.b(contextB2, cVar2, 2);
                                    jv1.t tVarA9 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar11));
                                    og0.a aVar12 = og0.a.f131967a;
                                    customGoal = jVar.getCustomGoal();
                                    if (customGoal != null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    customGoal2 = jVar.getCustomGoal();
                                    if (customGoal2 != null) {
                                        unit = gg0.i.SECOND;
                                    } else {
                                        unit = gg0.i.SECOND;
                                    }
                                    aVar12.getClass();
                                    double dJ3 = og0.a.j(dDoubleValue, unit);
                                    l3.f23124b.getClass();
                                    String strO3 = l3.a.o1((long) dJ3);
                                    String strK3 = l3.a.k1(new l22.a(contextB2), true, (int) dJ3);
                                    String string210 = contextB2.getString(R.string.overall_goal_time);
                                    string210.getClass();
                                    boolean z48 = !z14;
                                    b92.a.C0235a c0235a9 = new b92.a.C0235a(null, 1, null);
                                    c0235a9.f16962a.put("text", strK3);
                                    jv1.t tVar17 = new jv1.t(string210, strO3, c0235a9.b(), z48, false, null, true, null, null, null, 944, null);
                                    String string211 = contextB2.getString(R.string.training_goal);
                                    string211.getClass();
                                    listK = p13.x.k(new jv1.t(string211, contextB2.getString(i15), null, z48, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA7, tVarB5, tVarA8, tVarB6, tVarA9, tVar17);
                                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                                kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                listH2 = jVar.h();
                                if (listH2 != null) {
                                    it7 = listH2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            next6 = it7.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar110 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                            if (kVar2 != null) {
                                            }
                                        } else {
                                            next6 = null;
                                        }
                                    }
                                    cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                } else {
                                    cVar = null;
                                }
                                listH3 = jVar.h();
                                if (listH3 != null) {
                                    it6 = listH3.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next5 = it6.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                            if (kVar3 != null) {
                                            }
                                        } else {
                                            next5 = null;
                                        }
                                    }
                                    cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                } else {
                                    cVar2 = null;
                                }
                                listH4 = jVar.h();
                                if (listH4 != null) {
                                    it5 = listH4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next4 = it5.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar112 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                            if (kVar4 != null) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                } else {
                                    cVar3 = null;
                                }
                                m52.c cVar113 = m52.c.SWIMMING;
                                s62.a.f157643a.getClass();
                                jv1.t tVarA10 = dw1.c.a(contextB2, kVar2, cVar, cVar113, p8.a(t62.c.f162799a));
                                jv1.t tVarB7 = dw1.c.b(contextB2, cVar, 1);
                                m52.c cVar114 = m52.c.CYCLING;
                                t62.a aVar13 = t62.a.f162797a;
                                jv1.t tVarA11 = dw1.c.a(contextB2, kVar3, cVar2, cVar114, u62.t.a(aVar13));
                                jv1.t tVarB8 = dw1.c.b(contextB2, cVar2, 2);
                                jv1.t tVarA12 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar13));
                                og0.a aVar14 = og0.a.f131967a;
                                customGoal = jVar.getCustomGoal();
                                if (customGoal != null) {
                                    dDoubleValue = 0.0d;
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                customGoal2 = jVar.getCustomGoal();
                                if (customGoal2 != null) {
                                    unit = gg0.i.SECOND;
                                } else {
                                    unit = gg0.i.SECOND;
                                }
                                aVar14.getClass();
                                double dJ4 = og0.a.j(dDoubleValue, unit);
                                l3.f23124b.getClass();
                                String strO4 = l3.a.o1((long) dJ4);
                                String strK4 = l3.a.k1(new l22.a(contextB2), true, (int) dJ4);
                                String string212 = contextB2.getString(R.string.overall_goal_time);
                                string212.getClass();
                                boolean z49 = !z14;
                                b92.a.C0235a c0235a10 = new b92.a.C0235a(null, 1, null);
                                c0235a10.f16962a.put("text", strK4);
                                jv1.t tVar18 = new jv1.t(string212, strO4, c0235a10.b(), z49, false, null, true, null, null, null, 944, null);
                                String string213 = contextB2.getString(R.string.training_goal);
                                string213.getClass();
                                listK = p13.x.k(new jv1.t(string213, contextB2.getString(i15), null, z49, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA10, tVarB7, tVarA11, tVarB8, tVarA12, tVar18);
                            } while (kVar5.getEventLegActivityType() != m52.c.OPEN_WATER_SWIMMING);
                            kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                            it3 = listH.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                } else {
                                    next2 = null;
                                }
                                kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                                it4 = listH.iterator();
                                do {
                                    if (it4.hasNext()) {
                                        next3 = it4.next();
                                    } else {
                                        next3 = null;
                                    }
                                    kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                    listH2 = jVar.h();
                                    if (listH2 != null) {
                                        it7 = listH2.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                next6 = it7.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar115 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                                if (kVar2 != null) {
                                                }
                                            } else {
                                                next6 = null;
                                            }
                                        }
                                        cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                    } else {
                                        cVar = null;
                                    }
                                    listH3 = jVar.h();
                                    if (listH3 != null) {
                                        it6 = listH3.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                next5 = it6.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar116 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                                if (kVar3 != null) {
                                                }
                                            } else {
                                                next5 = null;
                                            }
                                        }
                                        cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                    } else {
                                        cVar2 = null;
                                    }
                                    listH4 = jVar.h();
                                    if (listH4 != null) {
                                        it5 = listH4.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next4 = it5.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar117 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                                if (kVar4 != null) {
                                                }
                                            } else {
                                                next4 = null;
                                            }
                                        }
                                        cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                    } else {
                                        cVar3 = null;
                                    }
                                    m52.c cVar118 = m52.c.SWIMMING;
                                    s62.a.f157643a.getClass();
                                    jv1.t tVarA13 = dw1.c.a(contextB2, kVar2, cVar, cVar118, p8.a(t62.c.f162799a));
                                    jv1.t tVarB9 = dw1.c.b(contextB2, cVar, 1);
                                    m52.c cVar119 = m52.c.CYCLING;
                                    t62.a aVar15 = t62.a.f162797a;
                                    jv1.t tVarA14 = dw1.c.a(contextB2, kVar3, cVar2, cVar119, u62.t.a(aVar15));
                                    jv1.t tVarB10 = dw1.c.b(contextB2, cVar2, 2);
                                    jv1.t tVarA15 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar15));
                                    og0.a aVar16 = og0.a.f131967a;
                                    customGoal = jVar.getCustomGoal();
                                    if (customGoal != null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    customGoal2 = jVar.getCustomGoal();
                                    if (customGoal2 != null) {
                                        unit = gg0.i.SECOND;
                                    } else {
                                        unit = gg0.i.SECOND;
                                    }
                                    aVar16.getClass();
                                    double dJ5 = og0.a.j(dDoubleValue, unit);
                                    l3.f23124b.getClass();
                                    String strO5 = l3.a.o1((long) dJ5);
                                    String strK5 = l3.a.k1(new l22.a(contextB2), true, (int) dJ5);
                                    String string214 = contextB2.getString(R.string.overall_goal_time);
                                    string214.getClass();
                                    boolean z410 = !z14;
                                    b92.a.C0235a c0235a11 = new b92.a.C0235a(null, 1, null);
                                    c0235a11.f16962a.put("text", strK5);
                                    jv1.t tVar19 = new jv1.t(string214, strO5, c0235a11.b(), z410, false, null, true, null, null, null, 944, null);
                                    String string215 = contextB2.getString(R.string.training_goal);
                                    string215.getClass();
                                    listK = p13.x.k(new jv1.t(string215, contextB2.getString(i15), null, z410, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA13, tVarB9, tVarA14, tVarB10, tVarA15, tVar19);
                                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                                kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                listH2 = jVar.h();
                                if (listH2 != null) {
                                    it7 = listH2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            next6 = it7.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1110 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                            if (kVar2 != null) {
                                            }
                                        } else {
                                            next6 = null;
                                        }
                                    }
                                    cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                } else {
                                    cVar = null;
                                }
                                listH3 = jVar.h();
                                if (listH3 != null) {
                                    it6 = listH3.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next5 = it6.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1111 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                            if (kVar3 != null) {
                                            }
                                        } else {
                                            next5 = null;
                                        }
                                    }
                                    cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                } else {
                                    cVar2 = null;
                                }
                                listH4 = jVar.h();
                                if (listH4 != null) {
                                    it5 = listH4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next4 = it5.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1112 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                            if (kVar4 != null) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                } else {
                                    cVar3 = null;
                                }
                                m52.c cVar1113 = m52.c.SWIMMING;
                                s62.a.f157643a.getClass();
                                jv1.t tVarA16 = dw1.c.a(contextB2, kVar2, cVar, cVar1113, p8.a(t62.c.f162799a));
                                jv1.t tVarB11 = dw1.c.b(contextB2, cVar, 1);
                                m52.c cVar1114 = m52.c.CYCLING;
                                t62.a aVar17 = t62.a.f162797a;
                                jv1.t tVarA17 = dw1.c.a(contextB2, kVar3, cVar2, cVar1114, u62.t.a(aVar17));
                                jv1.t tVarB12 = dw1.c.b(contextB2, cVar2, 2);
                                jv1.t tVarA18 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar17));
                                og0.a aVar18 = og0.a.f131967a;
                                customGoal = jVar.getCustomGoal();
                                if (customGoal != null) {
                                    dDoubleValue = 0.0d;
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                customGoal2 = jVar.getCustomGoal();
                                if (customGoal2 != null) {
                                    unit = gg0.i.SECOND;
                                } else {
                                    unit = gg0.i.SECOND;
                                }
                                aVar18.getClass();
                                double dJ6 = og0.a.j(dDoubleValue, unit);
                                l3.f23124b.getClass();
                                String strO6 = l3.a.o1((long) dJ6);
                                String strK6 = l3.a.k1(new l22.a(contextB2), true, (int) dJ6);
                                String string216 = contextB2.getString(R.string.overall_goal_time);
                                string216.getClass();
                                boolean z411 = !z14;
                                b92.a.C0235a c0235a12 = new b92.a.C0235a(null, 1, null);
                                c0235a12.f16962a.put("text", strK6);
                                jv1.t tVar110 = new jv1.t(string216, strO6, c0235a12.b(), z411, false, null, true, null, null, null, 944, null);
                                String string217 = contextB2.getString(R.string.training_goal);
                                string217.getClass();
                                listK = p13.x.k(new jv1.t(string217, contextB2.getString(i15), null, z411, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA16, tVarB11, tVarA17, tVarB12, tVarA18, tVar110);
                            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                            kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                            it4 = listH.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next3 = it4.next();
                                } else {
                                    next3 = null;
                                }
                                kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                listH2 = jVar.h();
                                if (listH2 != null) {
                                    it7 = listH2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            next6 = it7.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1115 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                            if (kVar2 != null) {
                                            }
                                        } else {
                                            next6 = null;
                                        }
                                    }
                                    cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                } else {
                                    cVar = null;
                                }
                                listH3 = jVar.h();
                                if (listH3 != null) {
                                    it6 = listH3.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next5 = it6.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1116 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                            if (kVar3 != null) {
                                            }
                                        } else {
                                            next5 = null;
                                        }
                                    }
                                    cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                } else {
                                    cVar2 = null;
                                }
                                listH4 = jVar.h();
                                if (listH4 != null) {
                                    it5 = listH4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next4 = it5.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1117 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                            if (kVar4 != null) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                } else {
                                    cVar3 = null;
                                }
                                m52.c cVar1118 = m52.c.SWIMMING;
                                s62.a.f157643a.getClass();
                                jv1.t tVarA19 = dw1.c.a(contextB2, kVar2, cVar, cVar1118, p8.a(t62.c.f162799a));
                                jv1.t tVarB13 = dw1.c.b(contextB2, cVar, 1);
                                m52.c cVar1119 = m52.c.CYCLING;
                                t62.a aVar19 = t62.a.f162797a;
                                jv1.t tVarA110 = dw1.c.a(contextB2, kVar3, cVar2, cVar1119, u62.t.a(aVar19));
                                jv1.t tVarB14 = dw1.c.b(contextB2, cVar2, 2);
                                jv1.t tVarA111 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar19));
                                og0.a aVar110 = og0.a.f131967a;
                                customGoal = jVar.getCustomGoal();
                                if (customGoal != null) {
                                    dDoubleValue = 0.0d;
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                customGoal2 = jVar.getCustomGoal();
                                if (customGoal2 != null) {
                                    unit = gg0.i.SECOND;
                                } else {
                                    unit = gg0.i.SECOND;
                                }
                                aVar110.getClass();
                                double dJ7 = og0.a.j(dDoubleValue, unit);
                                l3.f23124b.getClass();
                                String strO7 = l3.a.o1((long) dJ7);
                                String strK7 = l3.a.k1(new l22.a(contextB2), true, (int) dJ7);
                                String string218 = contextB2.getString(R.string.overall_goal_time);
                                string218.getClass();
                                boolean z412 = !z14;
                                b92.a.C0235a c0235a13 = new b92.a.C0235a(null, 1, null);
                                c0235a13.f16962a.put("text", strK7);
                                jv1.t tVar111 = new jv1.t(string218, strO7, c0235a13.b(), z412, false, null, true, null, null, null, 944, null);
                                String string219 = contextB2.getString(R.string.training_goal);
                                string219.getClass();
                                listK = p13.x.k(new jv1.t(string219, contextB2.getString(i15), null, z412, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA19, tVarB13, tVarA110, tVarB14, tVarA111, tVar111);
                            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                            kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                            listH2 = jVar.h();
                            if (listH2 != null) {
                                it7 = listH2.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next6 = it7.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11110 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                        if (kVar2 != null) {
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                }
                                cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                            } else {
                                cVar = null;
                            }
                            listH3 = jVar.h();
                            if (listH3 != null) {
                                it6 = listH3.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next5 = it6.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11111 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                        if (kVar3 != null) {
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                }
                                cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                            } else {
                                cVar2 = null;
                            }
                            listH4 = jVar.h();
                            if (listH4 != null) {
                                it5 = listH4.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next4 = it5.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11112 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                        if (kVar4 != null) {
                                        }
                                    } else {
                                        next4 = null;
                                    }
                                }
                                cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                            } else {
                                cVar3 = null;
                            }
                            m52.c cVar11113 = m52.c.SWIMMING;
                            s62.a.f157643a.getClass();
                            jv1.t tVarA112 = dw1.c.a(contextB2, kVar2, cVar, cVar11113, p8.a(t62.c.f162799a));
                            jv1.t tVarB15 = dw1.c.b(contextB2, cVar, 1);
                            m52.c cVar11114 = m52.c.CYCLING;
                            t62.a aVar111 = t62.a.f162797a;
                            jv1.t tVarA113 = dw1.c.a(contextB2, kVar3, cVar2, cVar11114, u62.t.a(aVar111));
                            jv1.t tVarB16 = dw1.c.b(contextB2, cVar2, 2);
                            jv1.t tVarA114 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar111));
                            og0.a aVar112 = og0.a.f131967a;
                            customGoal = jVar.getCustomGoal();
                            if (customGoal != null) {
                                dDoubleValue = 0.0d;
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            customGoal2 = jVar.getCustomGoal();
                            if (customGoal2 != null) {
                                unit = gg0.i.SECOND;
                            } else {
                                unit = gg0.i.SECOND;
                            }
                            aVar112.getClass();
                            double dJ8 = og0.a.j(dDoubleValue, unit);
                            l3.f23124b.getClass();
                            String strO8 = l3.a.o1((long) dJ8);
                            String strK8 = l3.a.k1(new l22.a(contextB2), true, (int) dJ8);
                            String string2110 = contextB2.getString(R.string.overall_goal_time);
                            string2110.getClass();
                            boolean z413 = !z14;
                            b92.a.C0235a c0235a14 = new b92.a.C0235a(null, 1, null);
                            c0235a14.f16962a.put("text", strK8);
                            jv1.t tVar112 = new jv1.t(string2110, strO8, c0235a14.b(), z413, false, null, true, null, null, null, 944, null);
                            String string2111 = contextB2.getString(R.string.training_goal);
                            string2111.getClass();
                            listK = p13.x.k(new jv1.t(string2111, contextB2.getString(i15), null, z413, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA112, tVarB15, tVarA113, tVarB16, tVarA114, tVar112);
                        } else if (i16 != 2) {
                            String string30 = contextB2.getString(R.string.training_goal);
                            string30.getClass();
                            listK = p13.w.c(new jv1.t(string30, contextB2.getString(i15), null, !z14, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null));
                        } else {
                            l3.a aVar20 = l3.f23124b;
                            customGoal3 = jVar.getCustomGoal();
                            if (customGoal3 != null || (value2 = customGoal3.getValue()) == null) {
                                jDoubleValue = 0;
                            } else {
                                jDoubleValue = (long) value2.doubleValue();
                            }
                            aVar20.getClass();
                            strE1 = l3.a.e1(jDoubleValue);
                            String string31 = contextB2.getString(R.string.training_goal);
                            string31.getClass();
                            jv1.t tVar20 = new jv1.t(string31, contextB2.getString(i15), null, !z14, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null);
                            String string32 = contextB2.getString(R.string.lbl_goal_time);
                            string32.getClass();
                            if (strE1 == null) {
                                str10 = "";
                            } else {
                                str10 = strE1;
                            }
                            listK = p13.x.k(tVar20, new jv1.t(string32, str10, null, false, g22.n.d(strE1), null, false, null, "navigateToTriathlonGoalSelection", null, 748, null));
                        }
                    } else {
                        if (fVar != vt1.c.RUN_WITH_GOAL_TIME || fVar == vt1.g.FINISH_GOAL_TIME || fVar == vt1.i.GOAL_DISTANCE_SPEED || fVar == vt1.i.GOAL_PACE_DISTANCE) {
                            mVar = sVar.f101129h;
                        } else {
                            mVar = null;
                        }
                        jv1.h hVar4 = sVar.f101127f;
                        if (mVar != null) {
                            gg0.i iVar4 = mVar.f101077b;
                            d14 = mVar.f101076a;
                            if (d14 != null || iVar4 == null) {
                                pVar3 = new o13.p(null, null);
                            } else {
                                gg0.h hVar5 = mVar.f101078c;
                                int i44 = hVar5 == null ? -1 : dw1.c.a.f61446b[hVar5.ordinal()];
                                if (i44 == 1) {
                                    Integer numValueOf3 = Integer.valueOf(R.string.distance_goal);
                                    og0.a aVar21 = og0.a.f131967a;
                                    double dDoubleValue2 = d14.doubleValue();
                                    aVar21.getClass();
                                    double dG = og0.a.g(dDoubleValue2, iVar4);
                                    double dDoubleValue3 = (hVar4 == null || (d15 = hVar4.f101057a) == null) ? 0.0d : d15.doubleValue();
                                    if (hVar4 == null || (iVar = hVar4.f101058b) == null) {
                                        iVar = gg0.i.METER;
                                    }
                                    double dDoubleValue4 = d14.doubleValue();
                                    boolean z54 = oVar6 == oVar5;
                                    iVar.getClass();
                                    double dJ9 = og0.a.j(dDoubleValue3, iVar);
                                    String str28 = new DecimalFormat("0.00").format(og0.a.A(dDoubleValue4, 2));
                                    str28.getClass();
                                    String string33 = contextB2.getString(R.string.placeholder_text_with_unit, str28, iVar4.c(contextB2));
                                    string33.getClass();
                                    strH = com.nimbusds.jose.shaded.gson.internal.a.h(string33, " (", z54 ? jv1.m.b(contextB2, dJ9, dG) : e5.g(og0.a.c(contextB2, dJ9, dG), StringUtils.SPACE, u0.j(contextB2.getString(R.string.lbl_pace))), ")");
                                    numValueOf = numValueOf3;
                                } else if (i44 != 2) {
                                    strH = null;
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(R.string.lbl_time_goal);
                                    og0.a aVar22 = og0.a.f131967a;
                                    double dDoubleValue5 = (hVar4 == null || (d16 = hVar4.f101057a) == null) ? 0.0d : d16.doubleValue();
                                    if (hVar4 == null || (iVar2 = hVar4.f101058b) == null) {
                                        iVar2 = gg0.i.METER;
                                    }
                                    aVar22.getClass();
                                    double dG2 = og0.a.g(dDoubleValue5, iVar2);
                                    double dDoubleValue6 = d14.doubleValue();
                                    boolean z55 = oVar6 == oVar5 ? true : z17;
                                    double dJ10 = og0.a.j(dDoubleValue6, iVar4);
                                    l3.f23124b.getClass();
                                    strH = com.nimbusds.jose.shaded.gson.internal.a.h(l3.a.e1((long) dJ10), " (", z55 ? jv1.m.b(contextB2, dJ10, dG2) : og0.a.c(contextB2, dJ10, dG2), ")");
                                }
                                pVar3 = new o13.p(numValueOf, strH);
                            }
                        } else {
                            pVar3 = new o13.p(null, null);
                        }
                        num = (Integer) pVar3.f128594a;
                        str8 = (String) pVar3.f128595b;
                        if (fVar != null) {
                            String string34 = contextB2.getString(R.string.training_goal);
                            string34.getClass();
                            jv1.t tVar21 = new jv1.t(string34, contextB2.getString(fVar.getF180129a()), null, !z14, false, null, false, "FBTGoalTypeSelectionFragment", null, null, 884, null);
                            if (num != null || (string4 = contextB2.getString(num.intValue())) == null) {
                                str9 = "";
                            } else {
                                str9 = string4;
                            }
                            if (num != null || str8 == null) {
                                z34 = false;
                            } else {
                                z34 = true;
                            }
                            listK = p13.x.k(tVar21, new jv1.t(str9, str8, null, false, z34, null, false, "FBTAddGoalDataFragment", null, null, 876, null));
                        } else {
                            listK = p13.j0.f134944a;
                        }
                    }
                    return new jv1.u(oVar7, str12, listK2, listK3, listK);
                }
                strA = aVar.getString(size > 1 ? R.string.long_ride_days : R.string.itp_setup_option_long_day);
                str7 = strA;
                i14 = 1;
                b92.a.C0235a c0235a15 = new b92.a.C0235a(null, i14, null);
                c0235a15.f16962a.put("text", str19);
                b92.a aVarB7 = c0235a15.b();
                if (str18.length() > 0) {
                    z24 = true;
                } else {
                    z24 = z17;
                }
                jv1.t tVar113 = new jv1.t(str7, str18, aVarB7, false, z24, null, false, "FBTLongDaysSelectionFragCompose", null, null, 872, null);
                String string220 = contextB2.getString(i39);
                string220.getClass();
                b92.a.C0235a c0235a16 = new b92.a.C0235a(null, 1, null);
                c0235a16.f16962a.put("text", str21);
                b92.a aVarB8 = c0235a16.b();
                if (str20.length() > 0) {
                    z25 = true;
                } else {
                    z25 = z17;
                }
                jv1.t tVar114 = new jv1.t(string220, str20, aVarB8, false, z25, null, false, "FBTSwimDaysSelectionFragCompose", null, null, 872, null);
                String string221 = contextB2.getString(R.string.swim_distance);
                string221.getClass();
                b92.a.C0235a c0235a17 = new b92.a.C0235a(null, 1, null);
                c0235a17.f16962a.put("text", str23);
                b92.a aVarB9 = c0235a17.b();
                if (str22.length() > 0) {
                    z26 = true;
                } else {
                    z26 = z17;
                }
                jv1.t tVar115 = new jv1.t(string221, str22, aVarB9, false, z26, null, false, "FBTSelectSwimAbilityFragment", null, null, 872, null);
                String string222 = contextB2.getString(R.string.strength_workouts);
                string222.getClass();
                String string223 = contextB2.getString(hVar3.f180121b);
                if (z38) {
                    z27 = z17;
                } else {
                    z27 = z17;
                }
                jv1.t tVar116 = new jv1.t(string222, string223, null, false, z27, null, false, "FBTSelectStrengthWorkoutTypeFragment", null, null, 876, null);
                String str29 = str4;
                String string224 = contextB2.getString(R.string.lbl_course_profile);
                string224.getClass();
                b92.a.C0235a c0235a18 = new b92.a.C0235a(null, 1, null);
                c0235a18.f16962a.put("text", str29);
                b92.a aVarB10 = c0235a18.b();
                if (str3 != null) {
                    z28 = true;
                } else {
                    z28 = z17;
                }
                jv1.t tVar117 = new jv1.t(string224, str3, aVarB10, false, z28, null, false, null, "course_profile_action", null, 744, null);
                String string225 = contextB2.getString(R.string.lbl_course_profile);
                string225.getClass();
                b92.a.C0235a c0235a19 = new b92.a.C0235a(null, 1, null);
                c0235a19.f16962a.put("text", str5);
                b92.a aVarB11 = c0235a19.b();
                if (string2 != 0) {
                    z29 = true;
                } else {
                    z29 = z17;
                }
                List listK4 = p13.x.k(tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar113, tVar114, tVar115, tVar116, tVar117, new jv1.t(string225, string2, aVarB11, false, z29, null, false, "FBTAddCourseFragment", null, null, 872, null));
                vt1.o oVar8 = sVar.f101125d;
                jVar = sVar.H;
                fVar = sVar.f101128g;
                if (jVar != null) {
                    gg0.g gVarS2 = jVar.s();
                    int[] iArr2 = dw1.c.a.f61445a;
                    int iOrdinal2 = gVarS2.ordinal();
                    i15 = gVarS2.f77155a;
                    i16 = iArr2[iOrdinal2];
                    if (i16 != 1) {
                        listH = kVarB6.h();
                        if (listH == null) {
                            listH = p13.j0.f134944a;
                        }
                        it = listH.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                kVar5 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                                if (kVar5.getEventLegActivityType() != m52.c.SWIMMING) {
                                }
                            } else {
                                next = null;
                            }
                            kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                            it3 = listH.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                } else {
                                    next2 = null;
                                }
                                kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                                it4 = listH.iterator();
                                do {
                                    if (it4.hasNext()) {
                                        next3 = it4.next();
                                    } else {
                                        next3 = null;
                                    }
                                    kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                    listH2 = jVar.h();
                                    if (listH2 != null) {
                                        it7 = listH2.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                next6 = it7.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11115 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                                if (kVar2 != null) {
                                                }
                                            } else {
                                                next6 = null;
                                            }
                                        }
                                        cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                    } else {
                                        cVar = null;
                                    }
                                    listH3 = jVar.h();
                                    if (listH3 != null) {
                                        it6 = listH3.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                next5 = it6.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11116 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                                if (kVar3 != null) {
                                                }
                                            } else {
                                                next5 = null;
                                            }
                                        }
                                        cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                    } else {
                                        cVar2 = null;
                                    }
                                    listH4 = jVar.h();
                                    if (listH4 != null) {
                                        it5 = listH4.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next4 = it5.next();
                                                com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11117 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                                if (kVar4 != null) {
                                                }
                                            } else {
                                                next4 = null;
                                            }
                                        }
                                        cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                    } else {
                                        cVar3 = null;
                                    }
                                    m52.c cVar11118 = m52.c.SWIMMING;
                                    s62.a.f157643a.getClass();
                                    jv1.t tVarA115 = dw1.c.a(contextB2, kVar2, cVar, cVar11118, p8.a(t62.c.f162799a));
                                    jv1.t tVarB17 = dw1.c.b(contextB2, cVar, 1);
                                    m52.c cVar11119 = m52.c.CYCLING;
                                    t62.a aVar113 = t62.a.f162797a;
                                    jv1.t tVarA116 = dw1.c.a(contextB2, kVar3, cVar2, cVar11119, u62.t.a(aVar113));
                                    jv1.t tVarB18 = dw1.c.b(contextB2, cVar2, 2);
                                    jv1.t tVarA117 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar113));
                                    og0.a aVar114 = og0.a.f131967a;
                                    customGoal = jVar.getCustomGoal();
                                    if (customGoal != null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    customGoal2 = jVar.getCustomGoal();
                                    if (customGoal2 != null) {
                                        unit = gg0.i.SECOND;
                                    } else {
                                        unit = gg0.i.SECOND;
                                    }
                                    aVar114.getClass();
                                    double dJ11 = og0.a.j(dDoubleValue, unit);
                                    l3.f23124b.getClass();
                                    String strO9 = l3.a.o1((long) dJ11);
                                    String strK9 = l3.a.k1(new l22.a(contextB2), true, (int) dJ11);
                                    String string2112 = contextB2.getString(R.string.overall_goal_time);
                                    string2112.getClass();
                                    boolean z414 = !z14;
                                    b92.a.C0235a c0235a110 = new b92.a.C0235a(null, 1, null);
                                    c0235a110.f16962a.put("text", strK9);
                                    jv1.t tVar118 = new jv1.t(string2112, strO9, c0235a110.b(), z414, false, null, true, null, null, null, 944, null);
                                    String string2113 = contextB2.getString(R.string.training_goal);
                                    string2113.getClass();
                                    listK = p13.x.k(new jv1.t(string2113, contextB2.getString(i15), null, z414, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA115, tVarB17, tVarA116, tVarB18, tVarA117, tVar118);
                                } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                                kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                listH2 = jVar.h();
                                if (listH2 != null) {
                                    it7 = listH2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            next6 = it7.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111110 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                            if (kVar2 != null) {
                                            }
                                        } else {
                                            next6 = null;
                                        }
                                    }
                                    cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                } else {
                                    cVar = null;
                                }
                                listH3 = jVar.h();
                                if (listH3 != null) {
                                    it6 = listH3.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next5 = it6.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111111 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                            if (kVar3 != null) {
                                            }
                                        } else {
                                            next5 = null;
                                        }
                                    }
                                    cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                } else {
                                    cVar2 = null;
                                }
                                listH4 = jVar.h();
                                if (listH4 != null) {
                                    it5 = listH4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next4 = it5.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111112 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                            if (kVar4 != null) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                } else {
                                    cVar3 = null;
                                }
                                m52.c cVar111113 = m52.c.SWIMMING;
                                s62.a.f157643a.getClass();
                                jv1.t tVarA118 = dw1.c.a(contextB2, kVar2, cVar, cVar111113, p8.a(t62.c.f162799a));
                                jv1.t tVarB19 = dw1.c.b(contextB2, cVar, 1);
                                m52.c cVar111114 = m52.c.CYCLING;
                                t62.a aVar115 = t62.a.f162797a;
                                jv1.t tVarA119 = dw1.c.a(contextB2, kVar3, cVar2, cVar111114, u62.t.a(aVar115));
                                jv1.t tVarB110 = dw1.c.b(contextB2, cVar2, 2);
                                jv1.t tVarA1110 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar115));
                                og0.a aVar116 = og0.a.f131967a;
                                customGoal = jVar.getCustomGoal();
                                if (customGoal != null) {
                                    dDoubleValue = 0.0d;
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                customGoal2 = jVar.getCustomGoal();
                                if (customGoal2 != null) {
                                    unit = gg0.i.SECOND;
                                } else {
                                    unit = gg0.i.SECOND;
                                }
                                aVar116.getClass();
                                double dJ12 = og0.a.j(dDoubleValue, unit);
                                l3.f23124b.getClass();
                                String strO10 = l3.a.o1((long) dJ12);
                                String strK10 = l3.a.k1(new l22.a(contextB2), true, (int) dJ12);
                                String string2114 = contextB2.getString(R.string.overall_goal_time);
                                string2114.getClass();
                                boolean z415 = !z14;
                                b92.a.C0235a c0235a111 = new b92.a.C0235a(null, 1, null);
                                c0235a111.f16962a.put("text", strK10);
                                jv1.t tVar119 = new jv1.t(string2114, strO10, c0235a111.b(), z415, false, null, true, null, null, null, 944, null);
                                String string2115 = contextB2.getString(R.string.training_goal);
                                string2115.getClass();
                                listK = p13.x.k(new jv1.t(string2115, contextB2.getString(i15), null, z415, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA118, tVarB19, tVarA119, tVarB110, tVarA1110, tVar119);
                            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                            kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                            it4 = listH.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next3 = it4.next();
                                } else {
                                    next3 = null;
                                }
                                kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                listH2 = jVar.h();
                                if (listH2 != null) {
                                    it7 = listH2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            next6 = it7.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111115 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                            if (kVar2 != null) {
                                            }
                                        } else {
                                            next6 = null;
                                        }
                                    }
                                    cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                } else {
                                    cVar = null;
                                }
                                listH3 = jVar.h();
                                if (listH3 != null) {
                                    it6 = listH3.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next5 = it6.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111116 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                            if (kVar3 != null) {
                                            }
                                        } else {
                                            next5 = null;
                                        }
                                    }
                                    cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                } else {
                                    cVar2 = null;
                                }
                                listH4 = jVar.h();
                                if (listH4 != null) {
                                    it5 = listH4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next4 = it5.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111117 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                            if (kVar4 != null) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                } else {
                                    cVar3 = null;
                                }
                                m52.c cVar111118 = m52.c.SWIMMING;
                                s62.a.f157643a.getClass();
                                jv1.t tVarA1111 = dw1.c.a(contextB2, kVar2, cVar, cVar111118, p8.a(t62.c.f162799a));
                                jv1.t tVarB111 = dw1.c.b(contextB2, cVar, 1);
                                m52.c cVar111119 = m52.c.CYCLING;
                                t62.a aVar117 = t62.a.f162797a;
                                jv1.t tVarA1112 = dw1.c.a(contextB2, kVar3, cVar2, cVar111119, u62.t.a(aVar117));
                                jv1.t tVarB112 = dw1.c.b(contextB2, cVar2, 2);
                                jv1.t tVarA1113 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar117));
                                og0.a aVar118 = og0.a.f131967a;
                                customGoal = jVar.getCustomGoal();
                                if (customGoal != null) {
                                    dDoubleValue = 0.0d;
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                customGoal2 = jVar.getCustomGoal();
                                if (customGoal2 != null) {
                                    unit = gg0.i.SECOND;
                                } else {
                                    unit = gg0.i.SECOND;
                                }
                                aVar118.getClass();
                                double dJ13 = og0.a.j(dDoubleValue, unit);
                                l3.f23124b.getClass();
                                String strO11 = l3.a.o1((long) dJ13);
                                String strK11 = l3.a.k1(new l22.a(contextB2), true, (int) dJ13);
                                String string2116 = contextB2.getString(R.string.overall_goal_time);
                                string2116.getClass();
                                boolean z416 = !z14;
                                b92.a.C0235a c0235a112 = new b92.a.C0235a(null, 1, null);
                                c0235a112.f16962a.put("text", strK11);
                                jv1.t tVar1110 = new jv1.t(string2116, strO11, c0235a112.b(), z416, false, null, true, null, null, null, 944, null);
                                String string2117 = contextB2.getString(R.string.training_goal);
                                string2117.getClass();
                                listK = p13.x.k(new jv1.t(string2117, contextB2.getString(i15), null, z416, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA1111, tVarB111, tVarA1112, tVarB112, tVarA1113, tVar1110);
                            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                            kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                            listH2 = jVar.h();
                            if (listH2 != null) {
                                it7 = listH2.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next6 = it7.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1111110 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                        if (kVar2 != null) {
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                }
                                cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                            } else {
                                cVar = null;
                            }
                            listH3 = jVar.h();
                            if (listH3 != null) {
                                it6 = listH3.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next5 = it6.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1111111 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                        if (kVar3 != null) {
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                }
                                cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                            } else {
                                cVar2 = null;
                            }
                            listH4 = jVar.h();
                            if (listH4 != null) {
                                it5 = listH4.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next4 = it5.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1111112 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                        if (kVar4 != null) {
                                        }
                                    } else {
                                        next4 = null;
                                    }
                                }
                                cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                            } else {
                                cVar3 = null;
                            }
                            m52.c cVar1111113 = m52.c.SWIMMING;
                            s62.a.f157643a.getClass();
                            jv1.t tVarA1114 = dw1.c.a(contextB2, kVar2, cVar, cVar1111113, p8.a(t62.c.f162799a));
                            jv1.t tVarB113 = dw1.c.b(contextB2, cVar, 1);
                            m52.c cVar1111114 = m52.c.CYCLING;
                            t62.a aVar119 = t62.a.f162797a;
                            jv1.t tVarA1115 = dw1.c.a(contextB2, kVar3, cVar2, cVar1111114, u62.t.a(aVar119));
                            jv1.t tVarB114 = dw1.c.b(contextB2, cVar2, 2);
                            jv1.t tVarA1116 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar119));
                            og0.a aVar1110 = og0.a.f131967a;
                            customGoal = jVar.getCustomGoal();
                            if (customGoal != null) {
                                dDoubleValue = 0.0d;
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            customGoal2 = jVar.getCustomGoal();
                            if (customGoal2 != null) {
                                unit = gg0.i.SECOND;
                            } else {
                                unit = gg0.i.SECOND;
                            }
                            aVar1110.getClass();
                            double dJ14 = og0.a.j(dDoubleValue, unit);
                            l3.f23124b.getClass();
                            String strO12 = l3.a.o1((long) dJ14);
                            String strK12 = l3.a.k1(new l22.a(contextB2), true, (int) dJ14);
                            String string2118 = contextB2.getString(R.string.overall_goal_time);
                            string2118.getClass();
                            boolean z417 = !z14;
                            b92.a.C0235a c0235a113 = new b92.a.C0235a(null, 1, null);
                            c0235a113.f16962a.put("text", strK12);
                            jv1.t tVar1111 = new jv1.t(string2118, strO12, c0235a113.b(), z417, false, null, true, null, null, null, 944, null);
                            String string2119 = contextB2.getString(R.string.training_goal);
                            string2119.getClass();
                            listK = p13.x.k(new jv1.t(string2119, contextB2.getString(i15), null, z417, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA1114, tVarB113, tVarA1115, tVarB114, tVarA1116, tVar1111);
                        } while (kVar5.getEventLegActivityType() != m52.c.OPEN_WATER_SWIMMING);
                        kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                        it3 = listH.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                            } else {
                                next2 = null;
                            }
                            kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                            it4 = listH.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next3 = it4.next();
                                } else {
                                    next3 = null;
                                }
                                kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                                listH2 = jVar.h();
                                if (listH2 != null) {
                                    it7 = listH2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            next6 = it7.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1111115 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                            if (kVar2 != null) {
                                            }
                                        } else {
                                            next6 = null;
                                        }
                                    }
                                    cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                } else {
                                    cVar = null;
                                }
                                listH3 = jVar.h();
                                if (listH3 != null) {
                                    it6 = listH3.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            next5 = it6.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1111116 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                            if (kVar3 != null) {
                                            }
                                        } else {
                                            next5 = null;
                                        }
                                    }
                                    cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                } else {
                                    cVar2 = null;
                                }
                                listH4 = jVar.h();
                                if (listH4 != null) {
                                    it5 = listH4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            next4 = it5.next();
                                            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar1111117 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                            if (kVar4 != null) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                } else {
                                    cVar3 = null;
                                }
                                m52.c cVar1111118 = m52.c.SWIMMING;
                                s62.a.f157643a.getClass();
                                jv1.t tVarA1117 = dw1.c.a(contextB2, kVar2, cVar, cVar1111118, p8.a(t62.c.f162799a));
                                jv1.t tVarB115 = dw1.c.b(contextB2, cVar, 1);
                                m52.c cVar1111119 = m52.c.CYCLING;
                                t62.a aVar1111 = t62.a.f162797a;
                                jv1.t tVarA1118 = dw1.c.a(contextB2, kVar3, cVar2, cVar1111119, u62.t.a(aVar1111));
                                jv1.t tVarB116 = dw1.c.b(contextB2, cVar2, 2);
                                jv1.t tVarA1119 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar1111));
                                og0.a aVar1112 = og0.a.f131967a;
                                customGoal = jVar.getCustomGoal();
                                if (customGoal != null) {
                                    dDoubleValue = 0.0d;
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                customGoal2 = jVar.getCustomGoal();
                                if (customGoal2 != null) {
                                    unit = gg0.i.SECOND;
                                } else {
                                    unit = gg0.i.SECOND;
                                }
                                aVar1112.getClass();
                                double dJ15 = og0.a.j(dDoubleValue, unit);
                                l3.f23124b.getClass();
                                String strO13 = l3.a.o1((long) dJ15);
                                String strK13 = l3.a.k1(new l22.a(contextB2), true, (int) dJ15);
                                String string21110 = contextB2.getString(R.string.overall_goal_time);
                                string21110.getClass();
                                boolean z418 = !z14;
                                b92.a.C0235a c0235a114 = new b92.a.C0235a(null, 1, null);
                                c0235a114.f16962a.put("text", strK13);
                                jv1.t tVar1112 = new jv1.t(string21110, strO13, c0235a114.b(), z418, false, null, true, null, null, null, 944, null);
                                String string21111 = contextB2.getString(R.string.training_goal);
                                string21111.getClass();
                                listK = p13.x.k(new jv1.t(string21111, contextB2.getString(i15), null, z418, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA1117, tVarB115, tVarA1118, tVarB116, tVarA1119, tVar1112);
                            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                            kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                            listH2 = jVar.h();
                            if (listH2 != null) {
                                it7 = listH2.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next6 = it7.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11111110 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                        if (kVar2 != null) {
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                }
                                cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                            } else {
                                cVar = null;
                            }
                            listH3 = jVar.h();
                            if (listH3 != null) {
                                it6 = listH3.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next5 = it6.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11111111 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                        if (kVar3 != null) {
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                }
                                cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                            } else {
                                cVar2 = null;
                            }
                            listH4 = jVar.h();
                            if (listH4 != null) {
                                it5 = listH4.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next4 = it5.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11111112 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                        if (kVar4 != null) {
                                        }
                                    } else {
                                        next4 = null;
                                    }
                                }
                                cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                            } else {
                                cVar3 = null;
                            }
                            m52.c cVar11111113 = m52.c.SWIMMING;
                            s62.a.f157643a.getClass();
                            jv1.t tVarA11110 = dw1.c.a(contextB2, kVar2, cVar, cVar11111113, p8.a(t62.c.f162799a));
                            jv1.t tVarB117 = dw1.c.b(contextB2, cVar, 1);
                            m52.c cVar11111114 = m52.c.CYCLING;
                            t62.a aVar1113 = t62.a.f162797a;
                            jv1.t tVarA11111 = dw1.c.a(contextB2, kVar3, cVar2, cVar11111114, u62.t.a(aVar1113));
                            jv1.t tVarB118 = dw1.c.b(contextB2, cVar2, 2);
                            jv1.t tVarA11112 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar1113));
                            og0.a aVar1114 = og0.a.f131967a;
                            customGoal = jVar.getCustomGoal();
                            if (customGoal != null) {
                                dDoubleValue = 0.0d;
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            customGoal2 = jVar.getCustomGoal();
                            if (customGoal2 != null) {
                                unit = gg0.i.SECOND;
                            } else {
                                unit = gg0.i.SECOND;
                            }
                            aVar1114.getClass();
                            double dJ16 = og0.a.j(dDoubleValue, unit);
                            l3.f23124b.getClass();
                            String strO14 = l3.a.o1((long) dJ16);
                            String strK14 = l3.a.k1(new l22.a(contextB2), true, (int) dJ16);
                            String string21112 = contextB2.getString(R.string.overall_goal_time);
                            string21112.getClass();
                            boolean z419 = !z14;
                            b92.a.C0235a c0235a115 = new b92.a.C0235a(null, 1, null);
                            c0235a115.f16962a.put("text", strK14);
                            jv1.t tVar1113 = new jv1.t(string21112, strO14, c0235a115.b(), z419, false, null, true, null, null, null, 944, null);
                            String string21113 = contextB2.getString(R.string.training_goal);
                            string21113.getClass();
                            listK = p13.x.k(new jv1.t(string21113, contextB2.getString(i15), null, z419, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA11110, tVarB117, tVarA11111, tVarB118, tVarA11112, tVar1113);
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                        kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                        it4 = listH.iterator();
                        do {
                            if (it4.hasNext()) {
                                next3 = it4.next();
                            } else {
                                next3 = null;
                            }
                            kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                            listH2 = jVar.h();
                            if (listH2 != null) {
                                it7 = listH2.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next6 = it7.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11111115 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                        if (kVar2 != null) {
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                }
                                cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                            } else {
                                cVar = null;
                            }
                            listH3 = jVar.h();
                            if (listH3 != null) {
                                it6 = listH3.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next5 = it6.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11111116 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                        if (kVar3 != null) {
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                }
                                cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                            } else {
                                cVar2 = null;
                            }
                            listH4 = jVar.h();
                            if (listH4 != null) {
                                it5 = listH4.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next4 = it5.next();
                                        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar11111117 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                        if (kVar4 != null) {
                                        }
                                    } else {
                                        next4 = null;
                                    }
                                }
                                cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                            } else {
                                cVar3 = null;
                            }
                            m52.c cVar11111118 = m52.c.SWIMMING;
                            s62.a.f157643a.getClass();
                            jv1.t tVarA11113 = dw1.c.a(contextB2, kVar2, cVar, cVar11111118, p8.a(t62.c.f162799a));
                            jv1.t tVarB119 = dw1.c.b(contextB2, cVar, 1);
                            m52.c cVar11111119 = m52.c.CYCLING;
                            t62.a aVar1115 = t62.a.f162797a;
                            jv1.t tVarA11114 = dw1.c.a(contextB2, kVar3, cVar2, cVar11111119, u62.t.a(aVar1115));
                            jv1.t tVarB1110 = dw1.c.b(contextB2, cVar2, 2);
                            jv1.t tVarA11115 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar1115));
                            og0.a aVar1116 = og0.a.f131967a;
                            customGoal = jVar.getCustomGoal();
                            if (customGoal != null) {
                                dDoubleValue = 0.0d;
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            customGoal2 = jVar.getCustomGoal();
                            if (customGoal2 != null) {
                                unit = gg0.i.SECOND;
                            } else {
                                unit = gg0.i.SECOND;
                            }
                            aVar1116.getClass();
                            double dJ17 = og0.a.j(dDoubleValue, unit);
                            l3.f23124b.getClass();
                            String strO15 = l3.a.o1((long) dJ17);
                            String strK15 = l3.a.k1(new l22.a(contextB2), true, (int) dJ17);
                            String string21114 = contextB2.getString(R.string.overall_goal_time);
                            string21114.getClass();
                            boolean z4110 = !z14;
                            b92.a.C0235a c0235a116 = new b92.a.C0235a(null, 1, null);
                            c0235a116.f16962a.put("text", strK15);
                            jv1.t tVar1114 = new jv1.t(string21114, strO15, c0235a116.b(), z4110, false, null, true, null, null, null, 944, null);
                            String string21115 = contextB2.getString(R.string.training_goal);
                            string21115.getClass();
                            listK = p13.x.k(new jv1.t(string21115, contextB2.getString(i15), null, z4110, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA11113, tVarB119, tVarA11114, tVarB1110, tVarA11115, tVar1114);
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next3).getEventLegActivityType() != m52.c.RUNNING);
                        kVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next3;
                        listH2 = jVar.h();
                        if (listH2 != null) {
                            it7 = listH2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    next6 = it7.next();
                                    com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111111110 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                                    if (kVar2 != null) {
                                    }
                                } else {
                                    next6 = null;
                                }
                            }
                            cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
                        } else {
                            cVar = null;
                        }
                        listH3 = jVar.h();
                        if (listH3 != null) {
                            it6 = listH3.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    next5 = it6.next();
                                    com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111111111 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                                    if (kVar3 != null) {
                                    }
                                } else {
                                    next5 = null;
                                }
                            }
                            cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next5;
                        } else {
                            cVar2 = null;
                        }
                        listH4 = jVar.h();
                        if (listH4 != null) {
                            it5 = listH4.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    next4 = it5.next();
                                    com.garmin.android.apps.connectmobile.workouts.data.model.c cVar111111112 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                                    if (kVar4 != null) {
                                    }
                                } else {
                                    next4 = null;
                                }
                            }
                            cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
                        } else {
                            cVar3 = null;
                        }
                        m52.c cVar111111113 = m52.c.SWIMMING;
                        s62.a.f157643a.getClass();
                        jv1.t tVarA11116 = dw1.c.a(contextB2, kVar2, cVar, cVar111111113, p8.a(t62.c.f162799a));
                        jv1.t tVarB1111 = dw1.c.b(contextB2, cVar, 1);
                        m52.c cVar111111114 = m52.c.CYCLING;
                        t62.a aVar1117 = t62.a.f162797a;
                        jv1.t tVarA11117 = dw1.c.a(contextB2, kVar3, cVar2, cVar111111114, u62.t.a(aVar1117));
                        jv1.t tVarB1112 = dw1.c.b(contextB2, cVar2, 2);
                        jv1.t tVarA11118 = dw1.c.a(contextB2, kVar4, cVar3, m52.c.RUNNING, f3.a(aVar1117));
                        og0.a aVar1118 = og0.a.f131967a;
                        customGoal = jVar.getCustomGoal();
                        if (customGoal != null) {
                            dDoubleValue = 0.0d;
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        customGoal2 = jVar.getCustomGoal();
                        if (customGoal2 != null) {
                            unit = gg0.i.SECOND;
                        } else {
                            unit = gg0.i.SECOND;
                        }
                        aVar1118.getClass();
                        double dJ18 = og0.a.j(dDoubleValue, unit);
                        l3.f23124b.getClass();
                        String strO16 = l3.a.o1((long) dJ18);
                        String strK16 = l3.a.k1(new l22.a(contextB2), true, (int) dJ18);
                        String string21116 = contextB2.getString(R.string.overall_goal_time);
                        string21116.getClass();
                        boolean z4111 = !z14;
                        b92.a.C0235a c0235a117 = new b92.a.C0235a(null, 1, null);
                        c0235a117.f16962a.put("text", strK16);
                        jv1.t tVar1115 = new jv1.t(string21116, strO16, c0235a117.b(), z4111, false, null, true, null, null, null, 944, null);
                        String string21117 = contextB2.getString(R.string.training_goal);
                        string21117.getClass();
                        listK = p13.x.k(new jv1.t(string21117, contextB2.getString(i15), null, z4111, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null), tVarA11116, tVarB1111, tVarA11117, tVarB1112, tVarA11118, tVar1115);
                    } else if (i16 != 2) {
                        String string35 = contextB2.getString(R.string.training_goal);
                        string35.getClass();
                        listK = p13.w.c(new jv1.t(string35, contextB2.getString(i15), null, !z14, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null));
                    } else {
                        l3.a aVar23 = l3.f23124b;
                        customGoal3 = jVar.getCustomGoal();
                        if (customGoal3 != null) {
                            jDoubleValue = 0;
                        } else {
                            jDoubleValue = 0;
                        }
                        aVar23.getClass();
                        strE1 = l3.a.e1(jDoubleValue);
                        String string36 = contextB2.getString(R.string.training_goal);
                        string36.getClass();
                        jv1.t tVar22 = new jv1.t(string36, contextB2.getString(i15), null, !z14, false, null, false, null, "navigateToTriathlonGoalSelection", null, 756, null);
                        String string37 = contextB2.getString(R.string.lbl_goal_time);
                        string37.getClass();
                        if (strE1 == null) {
                            str10 = "";
                        } else {
                            str10 = strE1;
                        }
                        listK = p13.x.k(tVar22, new jv1.t(string37, str10, null, false, g22.n.d(strE1), null, false, null, "navigateToTriathlonGoalSelection", null, 748, null));
                    }
                } else {
                    if (fVar != vt1.c.RUN_WITH_GOAL_TIME) {
                        mVar = sVar.f101129h;
                    } else {
                        mVar = sVar.f101129h;
                    }
                    jv1.h hVar6 = sVar.f101127f;
                    if (mVar != null) {
                        gg0.i iVar5 = mVar.f101077b;
                        d14 = mVar.f101076a;
                        if (d14 != null) {
                            pVar3 = new o13.p(null, null);
                        } else {
                            pVar3 = new o13.p(null, null);
                        }
                    } else {
                        pVar3 = new o13.p(null, null);
                    }
                    num = (Integer) pVar3.f128594a;
                    str8 = (String) pVar3.f128595b;
                    if (fVar != null) {
                        String string38 = contextB2.getString(R.string.training_goal);
                        string38.getClass();
                        jv1.t tVar23 = new jv1.t(string38, contextB2.getString(fVar.getF180129a()), null, !z14, false, null, false, "FBTGoalTypeSelectionFragment", null, null, 884, null);
                        if (num != null) {
                            str9 = "";
                        } else {
                            str9 = "";
                        }
                        if (num != null) {
                            z34 = false;
                        } else {
                            z34 = false;
                        }
                        listK = p13.x.k(tVar23, new jv1.t(str9, str8, null, false, z34, null, false, "FBTAddGoalDataFragment", null, null, 876, null));
                    } else {
                        listK = p13.j0.f134944a;
                    }
                }
                return new jv1.u(oVar8, str12, listK2, listK4, listK);
        }
    }
}
