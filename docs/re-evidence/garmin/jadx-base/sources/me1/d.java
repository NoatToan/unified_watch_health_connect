package me1;

import b63.o;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import d53.w;
import e23.q;
import fw.p;
import fw.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.c0;
import p13.h0;
import p13.y;
import p3.x1;
import w61.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118079a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f118081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f118082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f118083e;

    public /* synthetic */ d(List list, int i14, o oVar, o oVar2) {
        this.f118081c = list;
        this.f118080b = i14;
        this.f118082d = oVar;
        this.f118083e = oVar2;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0383  */
    /* JADX WARN: Code duplicated, block: B:147:0x038d  */
    /* JADX WARN: Code duplicated, block: B:152:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:167:0x0431  */
    /* JADX WARN: Code duplicated, block: B:171:0x044d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0460  */
    /* JADX WARN: Code duplicated, block: B:177:0x046c  */
    /* JADX WARN: Code duplicated, block: B:217:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x045a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [org.joda.time.format.DateTimeFormatter] */
    /* JADX WARN: Type inference failed for: r6v10, types: [x61.k] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r8v11, types: [x61.k] */
    /* JADX WARN: Type inference failed for: r8v8, types: [x61.k] */
    /* JADX WARN: Type inference failed for: r8v9 */
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
        x61.q qVar;
        char c14;
        TrainingStatusReportDTO trainingStatusReportDTO;
        char c15;
        l22.b bVar;
        ArrayList arrayList;
        String str;
        String string;
        String str2;
        ArrayList arrayListC;
        ArrayList arrayList2;
        boolean z14;
        Iterator it;
        x61.j jVar;
        ArrayList arrayList3;
        int i14;
        ArrayList arrayList4;
        int i15;
        int i16;
        Iterator it3;
        char c16;
        l22.b bVar2;
        ?? r14;
        ArrayList arrayList5;
        int i17;
        int i18 = this.f118079a;
        Object obj4 = this.f118083e;
        Object obj5 = this.f118082d;
        Object obj6 = this.f118081c;
        switch (i18) {
            case 0:
                List list = (List) obj6;
                o oVar = (o) obj5;
                o oVar2 = (o) obj4;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    n.a(list != null ? i53.a.j(list) : null, this.f118080b, oVar, oVar2, null, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                x xVar = (x) obj6;
                DateTime dateTimePlusMonths = (DateTime) obj5;
                DateTime dateTime = (DateTime) obj4;
                fw.m mVar2 = (fw.m) obj;
                fw.m mVar3 = (fw.m) obj2;
                int i19 = x.O0;
                mVar3.getClass();
                mVar2.getClass();
                int i24 = x.b.f183290a[f0.p(mVar2, mVar3).ordinal()];
                if (i24 == 1) {
                    return new fw.m(null, p.LOADING, null, null, 9, null);
                }
                if (i24 == 2) {
                    p pVar = p.ERROR;
                    fw.c rVar = mVar2.f73771d;
                    if (rVar == null && (rVar = mVar3.f73771d) == null) {
                        rVar = new r();
                    }
                    return new fw.m(null, pVar, null, rVar, 1, null);
                }
                if (i24 != 3) {
                    u0.r();
                    return null;
                }
                fw.m.a aVar = fw.m.f73767e;
                com.garmin.android.apps.connectmobile.performance.model.a aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar2.f73770c;
                TrainingStatusReportDTO trainingStatusReportDTO2 = (TrainingStatusReportDTO) mVar3.f73770c;
                xVar.L4(dateTimePlusMonths, dateTime);
                if (dateTimePlusMonths == null || dateTime == null) {
                    qVar = null;
                } else {
                    x61.k kVar = xVar.f183267c;
                    String str3 = aVar2 != null ? aVar2.f39917a : null;
                    int i25 = this.f118080b;
                    if (i25 == 5) {
                        c14 = 0;
                    } else if (i25 == 9) {
                        c14 = 2;
                    } else if (i25 != 10) {
                        c14 = 0;
                    } else {
                        c14 = 1;
                    }
                    l22.b bVar3 = kVar.f189261b;
                    ArrayList arrayList6 = new ArrayList();
                    if (trainingStatusReportDTO2 == null || str3 == null || str3.length() == 0) {
                        trainingStatusReportDTO = trainingStatusReportDTO2;
                        c15 = c14;
                        bVar = bVar3;
                        arrayList = arrayList6;
                    } else {
                        List<com.garmin.android.apps.connectmobile.performance.model.c> listC = !trainingStatusReportDTO2.f39910a ? trainingStatusReportDTO2.C() : trainingStatusReportDTO2.f39912c.get(str3);
                        ArrayList arrayList7 = listC != null ? new ArrayList(h0.Z(listC)) : null;
                        if (arrayList7 != null) {
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj7 : arrayList7) {
                                if (((com.garmin.android.apps.connectmobile.performance.model.c) obj7).f39942a != null) {
                                    arrayList8.add(obj7);
                                }
                            }
                            arrayList3 = new ArrayList(arrayList8);
                        } else {
                            arrayList3 = null;
                        }
                        if (arrayList3 != null && arrayList3.size() > 1) {
                            c0.u(arrayList3, new x61.n());
                        }
                        int iA = g22.k.a(dateTimePlusMonths, dateTime) + 1;
                        DateTime dateTimeMinusDays = dateTimePlusMonths.minusDays(1);
                        dateTimeMinusDays.getClass();
                        if (c14 == 2) {
                            if (arrayList3 != null) {
                                Iterator it4 = arrayList3.iterator();
                                int i26 = 0;
                                ?? r15 = kVar;
                                while (it4.hasNext()) {
                                    Object next = it4.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        p13.x.q();
                                        throw null;
                                    }
                                    com.garmin.android.apps.connectmobile.performance.model.c cVar = (com.garmin.android.apps.connectmobile.performance.model.c) next;
                                    com.garmin.android.apps.connectmobile.performance.model.b bVarB = cVar.f39957p ? com.garmin.android.apps.connectmobile.performance.model.b.PAUSE : com.garmin.android.apps.connectmobile.performance.model.b.a.b(com.garmin.android.apps.connectmobile.performance.model.b.f39921h, cVar.f39950i);
                                    if (i26 == 0) {
                                        if (g22.k.f(cVar.C(), dateTimePlusMonths)) {
                                            i17 = 1;
                                        } else {
                                            i17 = 1;
                                            DateTime dateTimeMinusDays2 = cVar.C().minusDays(1);
                                            dateTimeMinusDays2.getClass();
                                            arrayList6.add(r15.b(iA, dateTimePlusMonths, dateTimeMinusDays2));
                                        }
                                        DateTime dateTimeMinusDays3 = !g22.k.f(cVar.C(), dateTimePlusMonths) ? cVar.C().minusDays(i17) : cVar.C();
                                        dateTimeMinusDays3.getClass();
                                        DateTime dateTimeC = cVar.C();
                                        int i28 = i17;
                                        int i29 = i26 == arrayList3.size() + (-1) ? i28 : 0;
                                        it3 = it4;
                                        bVar2 = bVar3;
                                        DateTime dateTime2 = dateTimeMinusDays3;
                                        c16 = c14;
                                        com.garmin.android.apps.connectmobile.performance.model.b bVar4 = bVarB;
                                        int i30 = i26;
                                        r14 = r15;
                                        arrayList5 = arrayList6;
                                        arrayList5.add(r14.a(bVar4, dateTimePlusMonths, dateTime, dateTime2, dateTimeC, i29, iA, true));
                                        if (i30 == arrayList3.size() - 1 && !g22.k.f(cVar.C(), dateTime)) {
                                            DateTime dateTimePlusDays = cVar.C().plusDays(i28);
                                            dateTimePlusDays.getClass();
                                            arrayList5.add(r14.b(iA, dateTimePlusDays, dateTime));
                                        }
                                    } else {
                                        it3 = it4;
                                        c16 = c14;
                                        bVar2 = bVar3;
                                        com.garmin.android.apps.connectmobile.performance.model.b bVar5 = bVarB;
                                        int i34 = i26;
                                        r14 = r15;
                                        arrayList5 = arrayList6;
                                        if (i34 == arrayList3.size() - 1) {
                                            DateTime dateTimePlusDays2 = ((com.garmin.android.apps.connectmobile.performance.model.c) arrayList3.get(i34 - 1)).C().plusDays(1);
                                            dateTimePlusDays2.getClass();
                                            arrayList5.add(r14.a(bVar5, dateTimePlusMonths, dateTime, dateTimePlusDays2, cVar.C(), true, iA, true));
                                            if (!g22.k.f(cVar.C(), dateTime)) {
                                                DateTime dateTimePlusDays3 = cVar.C().plusDays(1);
                                                dateTimePlusDays3.getClass();
                                                arrayList5.add(r14.b(iA, dateTimePlusDays3, dateTime));
                                            }
                                        } else {
                                            DateTime dateTimePlusDays4 = ((com.garmin.android.apps.connectmobile.performance.model.c) arrayList3.get(i34 - 1)).C().plusDays(1);
                                            dateTimePlusDays4.getClass();
                                            arrayList5.add(r14.a(bVar5, dateTimePlusMonths, dateTime, dateTimePlusDays4, cVar.C(), false, iA, true));
                                        }
                                    }
                                    it4 = it3;
                                    c14 = c16;
                                    bVar3 = bVar2;
                                    arrayList6 = arrayList5;
                                    r15 = r14;
                                    i26 = i27;
                                    trainingStatusReportDTO2 = trainingStatusReportDTO2;
                                }
                            }
                            trainingStatusReportDTO = trainingStatusReportDTO2;
                            c15 = c14;
                            bVar = bVar3;
                            arrayList = arrayList6;
                        } else {
                            DateTime dateTimeMinusDays4 = dateTimeMinusDays;
                            trainingStatusReportDTO = trainingStatusReportDTO2;
                            c15 = c14;
                            bVar = bVar3;
                            arrayList = arrayList6;
                            str = null;
                            if (arrayList3 != null) {
                                int i35 = 0;
                                for (Object obj8 : arrayList3) {
                                    int i36 = i35 + 1;
                                    if (i35 < 0) {
                                        p13.x.q();
                                        throw null;
                                    }
                                    com.garmin.android.apps.connectmobile.performance.model.c cVar2 = (com.garmin.android.apps.connectmobile.performance.model.c) obj8;
                                    com.garmin.android.apps.connectmobile.performance.model.c cVar3 = i35 > 0 ? (com.garmin.android.apps.connectmobile.performance.model.c) arrayList3.get(i35 - 1) : null;
                                    com.garmin.android.apps.connectmobile.performance.model.c cVar4 = i35 < arrayList3.size() + (-1) ? (com.garmin.android.apps.connectmobile.performance.model.c) arrayList3.get(i36) : null;
                                    com.garmin.android.apps.connectmobile.performance.model.b bVarB2 = cVar2.f39957p ? com.garmin.android.apps.connectmobile.performance.model.b.PAUSE : com.garmin.android.apps.connectmobile.performance.model.b.a.b(com.garmin.android.apps.connectmobile.performance.model.b.f39921h, cVar2.f39950i);
                                    if (cVar3 == 0) {
                                        if (g22.k.f(cVar2.C(), dateTimePlusMonths)) {
                                            i14 = 1;
                                        } else {
                                            i14 = 1;
                                            dateTimeMinusDays4 = cVar2.C().minusDays(1);
                                            dateTimeMinusDays4.getClass();
                                            arrayList.add(kVar.b(iA, dateTimePlusMonths, dateTimeMinusDays4));
                                        }
                                        arrayList4 = arrayList3;
                                    } else {
                                        i14 = 1;
                                        arrayList4 = arrayList3;
                                        if (g22.k.a(cVar2.C(), cVar3.C()) > 1) {
                                            dateTimeMinusDays4 = cVar2.C().minusDays(1);
                                            dateTimeMinusDays4.getClass();
                                            DateTime dateTimePlusDays5 = cVar3.C().plusDays(1);
                                            dateTimePlusDays5.getClass();
                                            arrayList.add(kVar.b(iA, dateTimePlusDays5, dateTimeMinusDays4));
                                        }
                                    }
                                    if (cVar4 == null) {
                                        DateTime dateTimePlusDays6 = dateTimeMinusDays4.plusDays(i14);
                                        dateTimePlusDays6.getClass();
                                        int i37 = i14;
                                        i15 = i36;
                                        arrayList.add(kVar.a(bVarB2, dateTimePlusMonths, dateTime, dateTimePlusDays6, cVar2.C(), true, iA, cVar2.f39957p));
                                        if (!g22.k.f(cVar2.C(), dateTime)) {
                                            DateTime dateTimePlusDays7 = cVar2.C().plusDays(i37);
                                            dateTimePlusDays7.getClass();
                                            arrayList.add(kVar.b(iA, dateTimePlusDays7, dateTime));
                                        }
                                    } else {
                                        i15 = i36;
                                        if (bVarB2 == (cVar4.f39957p ? com.garmin.android.apps.connectmobile.performance.model.b.PAUSE : com.garmin.android.apps.connectmobile.performance.model.b.a.b(com.garmin.android.apps.connectmobile.performance.model.b.f39921h, cVar4.f39950i))) {
                                            int iA2 = g22.k.a(cVar2.C(), cVar4.C());
                                            i16 = 1;
                                            if (iA2 > 1) {
                                            }
                                        } else {
                                            i16 = 1;
                                        }
                                        DateTime dateTimePlusDays8 = dateTimeMinusDays4.plusDays(i16);
                                        dateTimePlusDays8.getClass();
                                        arrayList.add(kVar.a(bVarB2, dateTimePlusMonths, dateTime, dateTimePlusDays8, cVar2.C(), false, iA, false));
                                        dateTimeMinusDays4 = cVar2.C();
                                    }
                                    i35 = i15;
                                    arrayList3 = arrayList4;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            string = bVar.getString(R.string.msg_training_status_no_data);
                            String string2 = bVar.getString(R.string.msg_no_status_message_ts2);
                            arrayList.clear();
                            str2 = string2;
                        } else {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    jVar = (x61.j) it.next();
                                    if (jVar.f189254a.length() <= 0 && !s.g(jVar.f189254a, bVar.getString(com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN.f39938e))) {
                                        string = str;
                                        str2 = string;
                                    }
                                } else {
                                    string = bVar.getString(R.string.msg_training_status_no_data);
                                    String string3 = bVar.getString(R.string.msg_no_status_message_ts2);
                                    arrayList.clear();
                                    str2 = string3;
                                }
                            }
                        }
                        if (c15 != 0 || c15 == 1) {
                            fz.a.f73959a.getClass();
                            arrayListC = fz.a.c(dateTimePlusMonths, dateTime, 7, true, str);
                        } else {
                            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
                            dateTimeFormatterForPattern.getClass();
                            if (Months.monthsBetween(dateTimePlusMonths.dayOfMonth().withMinimumValue(), dateTime.dayOfMonth().withMaximumValue()).getMonths() >= 6) {
                                dateTimePlusMonths = dateTimePlusMonths.plusMonths(1);
                                dateTimePlusMonths.getClass();
                            }
                            ArrayList arrayListM = p13.x.m(dateTimePlusMonths);
                            for (int i38 = 1; i38 < 6; i38++) {
                                DateTime dateTimePlusMonths2 = dateTimePlusMonths.plusMonths(i38);
                                dateTimePlusMonths2.getClass();
                                arrayListM.add(dateTimePlusMonths2);
                            }
                            arrayListC = new ArrayList(y.r(arrayListM, 10));
                            Iterator it5 = arrayListM.iterator();
                            while (it5.hasNext()) {
                                arrayListC.add(j0.h((DateTime) it5.next(), dateTimeFormatterForPattern));
                            }
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj9 : arrayListC) {
                            if (!w.J((String) obj9)) {
                                arrayList2.add(obj9);
                            }
                        }
                        if (trainingStatusReportDTO != null) {
                            z14 = trainingStatusReportDTO.f39910a;
                        } else {
                            z14 = false;
                        }
                        qVar = new x61.q(arrayList, arrayList2, string, str2, z14);
                    }
                    str = null;
                    if (arrayList.isEmpty()) {
                        string = bVar.getString(R.string.msg_training_status_no_data);
                        String string4 = bVar.getString(R.string.msg_no_status_message_ts2);
                        arrayList.clear();
                        str2 = string4;
                    } else {
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                jVar = (x61.j) it.next();
                                if (jVar.f189254a.length() <= 0) {
                                }
                            } else {
                                string = bVar.getString(R.string.msg_training_status_no_data);
                                String string5 = bVar.getString(R.string.msg_no_status_message_ts2);
                                arrayList.clear();
                                str2 = string5;
                            }
                        }
                    }
                    if (c15 != 0) {
                        fz.a.f73959a.getClass();
                        arrayListC = fz.a.c(dateTimePlusMonths, dateTime, 7, true, str);
                    } else {
                        fz.a.f73959a.getClass();
                        arrayListC = fz.a.c(dateTimePlusMonths, dateTime, 7, true, str);
                    }
                    arrayList2 = new ArrayList();
                    while (r3.hasNext()) {
                        if (!w.J((String) obj9)) {
                            arrayList2.add(obj9);
                        }
                    }
                    if (trainingStatusReportDTO != null) {
                        z14 = trainingStatusReportDTO.f39910a;
                    } else {
                        z14 = false;
                    }
                    qVar = new x61.q(arrayList, arrayList2, string, str2, z14);
                }
                return fw.m.a.g(aVar, qVar, 1);
        }
    }

    public /* synthetic */ d(x xVar, DateTime dateTime, DateTime dateTime2, int i14) {
        this.f118081c = xVar;
        this.f118082d = dateTime;
        this.f118083e = dateTime2;
        this.f118080b = i14;
    }
}
