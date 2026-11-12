package lp;

import am.x0;
import am.z0;
import fw.m;
import j23.t;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lc.u0;
import mp.n;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.p0;
import p13.t0;
import p13.y;
import ps.o1;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llp/d;", "", "Ltp/a;", "repo", "Lf12/b;", "gcmUserAccount", "Lf12/l;", "gcmUserSettings", "<init>", "(Ltp/a;Lf12/b;Lf12/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp.a f114084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f114085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.l f114086c;

    public d(tp.a aVar, f12.b bVar, f12.l lVar) {
        aVar.getClass();
        bVar.getClass();
        lVar.getClass();
        this.f114084a = aVar;
        this.f114085b = bVar;
        this.f114086c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:104:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dd A[LOOP:3: B:105:0x02bf->B:110:0x02dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0304  */
    /* JADX WARN: Code duplicated, block: B:124:0x0307  */
    /* JADX WARN: Code duplicated, block: B:129:0x031d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0365  */
    /* JADX WARN: Code duplicated, block: B:139:0x037c  */
    /* JADX WARN: Code duplicated, block: B:141:0x037f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0381  */
    /* JADX WARN: Code duplicated, block: B:143:0x0395  */
    /* JADX WARN: Code duplicated, block: B:147:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:151:0x03be  */
    /* JADX WARN: Code duplicated, block: B:172:0x0442  */
    /* JADX WARN: Code duplicated, block: B:173:0x0447  */
    /* JADX WARN: Code duplicated, block: B:188:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:189:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x011d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0127 A[LOOP:22: B:30:0x0121->B:32:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0153  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:422:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:426:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:42:0x016d A[LOOP:0: B:40:0x0167->B:42:0x016d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:441:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x020b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0213 A[Catch: ParseException -> 0x0217, TRY_LEAVE, TryCatch #0 {ParseException -> 0x0217, blocks: (B:59:0x0205, B:62:0x020d, B:64:0x0213), top: B:431:0x0205 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0239  */
    /* JADX WARN: Code duplicated, block: B:68:0x023b A[PHI: r36
      0x023b: PHI (r36v14 o82.g) = (r36v3 o82.g), (r36v3 o82.g), (r36v4 o82.g), (r36v4 o82.g), (r36v15 o82.g) binds: [B:130:0x0323, B:132:0x032b, B:125:0x030d, B:127:0x0315, B:67:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x023f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0245  */
    /* JADX WARN: Code duplicated, block: B:72:0x024a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0252 A[PHI: r6 r36
      0x0252: PHI (r6v101 java.lang.Double) = (r6v66 java.lang.Double), (r6v67 java.lang.Double), (r6v70 java.lang.Double), (r6v102 java.lang.Double) binds: [B:133:0x032d, B:128:0x0317, B:122:0x0302, B:74:0x0250] A[DONT_GENERATE, DONT_INLINE]
      0x0252: PHI (r36v11 o82.g) = (r36v3 o82.g), (r36v4 o82.g), (r36v7 o82.g), (r36v12 o82.g) binds: [B:133:0x032d, B:128:0x0317, B:122:0x0302, B:74:0x0250] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0256  */
    /* JADX WARN: Code duplicated, block: B:78:0x025c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0261  */
    /* JADX WARN: Code duplicated, block: B:81:0x0268  */
    /* JADX WARN: Code duplicated, block: B:83:0x026e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0273  */
    /* JADX WARN: Code duplicated, block: B:86:0x027a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0280  */
    /* JADX WARN: Code duplicated, block: B:89:0x0285  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x028c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0292  */
    /* JADX WARN: Code duplicated, block: B:94:0x0297  */
    /* JADX WARN: Code duplicated, block: B:96:0x029e  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(o82.a aVar, x0 x0Var, o82.g gVar, v13.c cVar) {
        c cVar2;
        DateTime dateTimeAtCurrentTime;
        o82.g gVar2;
        tp.a aVar2;
        String str;
        DateTime dateTime;
        x0 x0Var2;
        String str2;
        String str3;
        DateTime dateTime2;
        m mVar;
        String str4;
        DateTime dateTime3;
        m mVar2;
        List list;
        Object objC;
        m mVar3;
        m mVar4;
        DateTime dateTime4;
        DateTime dateTime5;
        x0 x0Var3;
        o82.g gVar3;
        Iterator it;
        List list2;
        List list3;
        mp.c cVar3;
        boolean zY;
        boolean z14;
        LinkedHashMap linkedHashMap;
        int iA;
        Iterator it3;
        mp.k kVar;
        List<mp.d> listB;
        mp.c cVar4;
        o82.g gVar4;
        x0 x0Var4;
        List listN0;
        int i14;
        int iR;
        LinkedHashMap linkedHashMap2;
        Iterator<Map.Entry<mp.k, List<mp.l>>> it4;
        List list4;
        yp.b bVar;
        int i15;
        yp.f fVar;
        i53.c cVarB;
        double dDoubleValue;
        double dDoubleValue2;
        Double dValueOf;
        Double dValueOf2;
        double dDoubleValue3;
        Double dValueOf3;
        Double dValueOf4;
        Double dValueOf5;
        double dDoubleValue4;
        Double dValueOf6;
        double dDoubleValue5;
        Double dValueOf7;
        yp.f fVar2;
        yp.f fVar3;
        List list5;
        double dDoubleValue6;
        List list6;
        List<mp.l> value;
        List list7;
        x0 x0Var5;
        Iterator it5;
        DateTime dateTime6;
        Iterator<Map.Entry<mp.k, List<mp.l>>> it6;
        Iterator<Integer> it7;
        Double dF;
        Double dH;
        Object next;
        ArrayList arrayList;
        Iterator it8;
        mp.d dVar;
        long time;
        o82.g gVar5;
        o82.g gVar6;
        List<o1> listR;
        o1 o1Var;
        Double D;
        List<o1> listR2;
        o1 o1Var2;
        List<o1> listR3;
        Double dO;
        Double d14;
        Iterator<T> it9;
        Object next2;
        o1 o1Var3;
        Double dQ;
        Double dK;
        double dDoubleValue7;
        Double dI;
        double dDoubleValue8;
        Double dI2;
        double dDoubleValue9;
        Double dJ;
        double dDoubleValue10;
        Double dJ2;
        double dDoubleValue11;
        Double dG;
        double dDoubleValue12;
        String strS;
        Date date;
        Iterator it10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f114083l;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f114083l = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar5 = cVar2;
        Object obj = cVar5.f114081j;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar5.f114083l;
        tp.a aVar4 = this.f114084a;
        int i18 = 1;
        if (i17 == 0) {
            r.b(obj);
            String str5 = x0Var.f4358a;
            String strValueOf = String.valueOf(z0.n(x0Var));
            String userDisplayName = this.f114085b.getUserDisplayName();
            DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
            dateTimeAtCurrentTime = g22.l.h(aVar.f130844b).toDateTimeAtCurrentTime();
            String string = dateTimeAtStartOfDay.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
            dateTimeAtCurrentTime.getClass();
            String string2 = g22.k.A(dateTimeAtCurrentTime).toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
            string.getClass();
            string2.getClass();
            cVar5.f114072a = x0Var;
            gVar2 = gVar;
            cVar5.f114073b = gVar2;
            cVar5.f114074c = str5;
            cVar5.f114075d = dateTimeAtStartOfDay;
            cVar5.f114076e = dateTimeAtCurrentTime;
            cVar5.f114077f = string;
            cVar5.f114078g = string2;
            cVar5.f114083l = 1;
            aVar2 = aVar4;
            str = string;
            Object objE = aVar2.e(userDisplayName, strValueOf, str, string2, cVar5);
            if (objE != aVar3) {
                dateTime = dateTimeAtStartOfDay;
                x0Var2 = x0Var;
                str2 = string2;
                str3 = str5;
                obj = objE;
            }
            return aVar3;
        }
        if (i17 == 1) {
            String str6 = cVar5.f114078g;
            String str7 = cVar5.f114077f;
            DateTime dateTime7 = cVar5.f114076e;
            dateTime = cVar5.f114075d;
            String str8 = cVar5.f114074c;
            o82.g gVar7 = cVar5.f114073b;
            x0Var2 = cVar5.f114072a;
            r.b(obj);
            gVar2 = gVar7;
            str3 = str8;
            str = str7;
            str2 = str6;
            dateTimeAtCurrentTime = dateTime7;
            aVar2 = aVar4;
        } else {
            if (i17 == 2) {
                mVar = cVar5.f114079h;
                str2 = cVar5.f114078g;
                String str9 = cVar5.f114077f;
                dateTime2 = cVar5.f114076e;
                dateTime3 = cVar5.f114075d;
                str3 = cVar5.f114074c;
                gVar2 = cVar5.f114073b;
                x0Var2 = cVar5.f114072a;
                r.b(obj);
                str4 = str9;
                aVar2 = aVar4;
                mVar2 = (m) obj;
                list = (List) mVar2.f73770c;
                if (list != null) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).d();
                    }
                }
                str4.getClass();
                str2.getClass();
                cVar5.f114072a = x0Var2;
                cVar5.f114073b = gVar2;
                cVar5.f114074c = null;
                cVar5.f114075d = dateTime3;
                cVar5.f114076e = dateTime2;
                cVar5.f114077f = null;
                cVar5.f114078g = null;
                cVar5.f114079h = mVar;
                cVar5.f114080i = mVar2;
                cVar5.f114083l = 3;
                objC = aVar2.c(str4, str2, str3, cVar5);
                if (objC != aVar3) {
                    mVar3 = mVar;
                    mVar4 = mVar2;
                    obj = objC;
                    dateTime4 = dateTime2;
                    dateTime5 = dateTime3;
                    x0Var3 = x0Var2;
                    gVar3 = gVar2;
                }
                return aVar3;
            }
            if (i17 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mVar4 = cVar5.f114080i;
            mVar3 = cVar5.f114079h;
            dateTime4 = cVar5.f114076e;
            dateTime5 = cVar5.f114075d;
            gVar3 = cVar5.f114073b;
            x0Var3 = cVar5.f114072a;
            r.b(obj);
        }
        m mVar5 = (m) obj;
        list2 = (List) mVar5.f73770c;
        if (list2 != null) {
            it10 = list2.iterator();
            while (it10.hasNext()) {
                ((n) it10.next()).d();
            }
        }
        dateTime5.getClass();
        list3 = (List) mVar5.f73770c;
        List list8 = (List) mVar4.f73770c;
        cVar3 = (mp.c) mVar3.f73770c;
        long millis = dateTime5.getMillis();
        long millis2 = dateTime4.getMillis();
        f12.l lVar = this.f114086c;
        zY = lVar.y();
        z14 = !lVar.c();
        x0Var3.getClass();
        gVar3.getClass();
        w13.c cVar6 = mp.k.C;
        iA = t0.a(y.r(cVar6, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        it3 = cVar6.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            kVar = (mp.k) next3;
            if (cVar3 != null) {
                listB = cVar3.b();
            } else {
                listB = null;
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            if (listB != null) {
                arrayList = new ArrayList(y.r(listB, 10));
                it8 = listB.iterator();
                while (it8.hasNext()) {
                    dVar = (mp.d) it8.next();
                    Iterator it11 = it8;
                    mp.c cVar7 = cVar3;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                    time = -1;
                    try {
                        strS = dVar.getStartTimeLocal();
                        if (strS == null) {
                            strS = "";
                        }
                        date = simpleDateFormat.parse(strS);
                        if (date != null) {
                            time = date.getTime();
                        }
                    } catch (ParseException unused) {
                    }
                    gVar5 = gVar3;
                    x0 x0Var6 = x0Var3;
                    String strD = dVar.getActivityName();
                    long jB = dVar.getActivityId();
                    long millis3 = new DateTime(time).getMillis();
                    switch (xp.a.C3570a.f191827a[kVar.ordinal()]) {
                        case 1:
                            gVar6 = gVar5;
                            listR = dVar.r();
                            if (listR == null && (o1Var = (o1) h0.d0(listR)) != null) {
                                D = o1Var.getGamesAverageWon();
                                d14 = D;
                            } else {
                                d14 = null;
                            }
                            break;
                        case 2:
                            gVar6 = gVar5;
                            listR2 = dVar.r();
                            if (listR2 == null && (o1Var2 = (o1) h0.d0(listR2)) != null) {
                                D = o1Var2.getAvgStress();
                                d14 = D;
                            } else {
                                d14 = null;
                            }
                            break;
                        case 3:
                            listR3 = dVar.r();
                            if (listR3 != null) {
                                it9 = listR3.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        next2 = it9.next();
                                        gVar6 = gVar5;
                                        if (s.g(((o1) next2).getSplitType(), x.PACK_WEIGHT.f147220a)) {
                                            gVar5 = gVar6;
                                        }
                                    } else {
                                        gVar6 = gVar5;
                                        next2 = null;
                                    }
                                }
                                o1Var3 = (o1) next2;
                                if (o1Var3 == null && (dQ = o1Var3.getAvgPackWeight()) != null && !Double.isNaN(dQ.doubleValue())) {
                                    D = dQ;
                                }
                                dO = dVar.getPackWeight();
                                if (D == null) {
                                    d14 = D;
                                } else {
                                    d14 = dO;
                                }
                            } else {
                                gVar6 = gVar5;
                            }
                            D = null;
                            dO = dVar.getPackWeight();
                            if (D == null) {
                                d14 = D;
                            } else {
                                d14 = dO;
                            }
                            break;
                        case 4:
                            D = dVar.getDifferenceBodyBattery();
                            gVar6 = gVar5;
                            d14 = D;
                            break;
                        case 5:
                            dK = dVar.getElevationGain();
                            if (dK != null) {
                                dDoubleValue7 = dK.doubleValue();
                            } else {
                                dDoubleValue7 = 0.0d;
                            }
                            D = Double.valueOf(dDoubleValue7);
                            gVar6 = gVar5;
                            d14 = D;
                            break;
                        case 6:
                            dI = dVar.getDistance();
                            if (dI != null) {
                                dDoubleValue8 = dI.doubleValue();
                            } else {
                                dDoubleValue8 = 0.0d;
                            }
                            D = Double.valueOf(dDoubleValue8);
                            gVar6 = gVar5;
                            d14 = D;
                            break;
                        case 7:
                            dI2 = dVar.getDistance();
                            if (dI2 != null) {
                                dDoubleValue9 = dI2.doubleValue();
                            } else {
                                dDoubleValue9 = 0.0d;
                            }
                            D = Double.valueOf(dDoubleValue9);
                            gVar6 = gVar5;
                            d14 = D;
                            break;
                        case 8:
                            dJ = dVar.getDuration();
                            if (dJ != null) {
                                dDoubleValue10 = dJ.doubleValue();
                            } else {
                                dDoubleValue10 = 0.0d;
                            }
                            D = Double.valueOf(dDoubleValue10);
                            gVar6 = gVar5;
                            d14 = D;
                            break;
                        case 9:
                            dJ2 = dVar.getDuration();
                            if (dJ2 != null) {
                                dDoubleValue11 = dJ2.doubleValue();
                            } else {
                                dDoubleValue11 = 0.0d;
                            }
                            D = Double.valueOf(dDoubleValue11);
                            gVar6 = gVar5;
                            d14 = D;
                            break;
                        case 10:
                            dG = dVar.getCalories();
                            if (dG != null) {
                                dDoubleValue12 = dG.doubleValue();
                            } else {
                                dDoubleValue12 = 0.0d;
                            }
                            D = Double.valueOf(dDoubleValue12);
                            gVar6 = gVar5;
                            d14 = D;
                            break;
                        default:
                            gVar6 = gVar5;
                            d14 = null;
                            break;
                    }
                    arrayList.add(new yp.d(strD, jB, millis3, d14, z0.l(x0.f4346x, dVar.getActivityType().j()), dVar.getIsPersonalRecord()));
                    x0Var3 = x0Var6;
                    it8 = it11;
                    cVar3 = cVar7;
                    gVar3 = gVar6;
                }
                cVar4 = cVar3;
                gVar4 = gVar3;
                x0Var4 = x0Var3;
                listN0 = h0.N0(arrayList, new xp.b());
            } else {
                cVar4 = cVar3;
                gVar4 = gVar3;
                x0Var4 = x0Var3;
                listN0 = null;
            }
            Map<mp.k, List<mp.l>> mapB = xp.a.b(list3, kVar);
            double d15 = kVar.f120030c;
            i14 = xp.a.C3570a.f191828b[gVar4.ordinal()];
            if (i14 != 2) {
                iR = 28;
            } else if (i14 != 3) {
                iR = 7;
            } else {
                LocalDate localDate = dateTime5.toLocalDate();
                localDate.getClass();
                LocalDate localDateP = jg.b.P(localDate);
                iR = jg.b.r(localDateP, jg.b.t(localDateP));
            }
            linkedHashMap2 = new LinkedHashMap();
            it4 = mapB.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry<mp.k, List<mp.l>> next4 = it4.next();
                value = next4.getValue();
                if (value == null && !value.isEmpty()) {
                    list7 = listN0;
                    j23.l lVarO = t.o(0, iR);
                    x0Var5 = x0Var4;
                    it5 = it3;
                    it6 = it4;
                    ArrayList arrayList2 = new ArrayList(y.r(lVarO, 10));
                    Iterator<Integer> it12 = lVarO.iterator();
                    while (((j23.k) it12).f96801c) {
                        int iNextInt = ((p0) it12).nextInt();
                        List<mp.l> value2 = next4.getValue();
                        if (value2 != null) {
                            Iterator<T> it13 = value2.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next = it13.next();
                                    it7 = it12;
                                    if (Days.daysBetween(new LocalDate(dateTime5), new LocalDate(((mp.l) next).getCalendarDate())).getDays() != iNextInt) {
                                        it12 = it7;
                                    }
                                } else {
                                    it7 = it12;
                                    next = null;
                                }
                            }
                            mp.l lVar2 = (mp.l) next;
                            dF = lVar2 != null ? lVar2.getValue() : null;
                            if (dF != null) {
                                dH = u0.h(d15, dF);
                            } else {
                                dH = null;
                            }
                            arrayList2.add(new yp.c(xp.a.a(dH, kVar), iNextInt));
                            it12 = it7;
                        } else {
                            it7 = it12;
                        }
                        if (dF != null) {
                            dH = u0.h(d15, dF);
                        } else {
                            dH = null;
                        }
                        arrayList2.add(new yp.c(xp.a.a(dH, kVar), iNextInt));
                        it12 = it7;
                    }
                    if (arrayList2.isEmpty()) {
                        dateTime6 = dateTime5;
                        break;
                    }
                    Iterator it14 = arrayList2.iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            dateTime6 = dateTime5;
                            break;
                            break;
                        }
                        dateTime6 = dateTime5;
                        if (!s.c(((yp.c) it14.next()).f198606a, 0.0d)) {
                            linkedHashMap2.put(next4.getKey(), arrayList2);
                            break;
                        }
                        dateTime5 = dateTime6;
                    }
                } else {
                    list7 = listN0;
                    x0Var5 = x0Var4;
                    it5 = it3;
                    dateTime6 = dateTime5;
                    it6 = it4;
                }
                it4 = it6;
                listN0 = list7;
                x0Var4 = x0Var5;
                it3 = it5;
                dateTime5 = dateTime6;
            }
            list4 = listN0;
            x0 x0Var7 = x0Var4;
            Iterator it15 = it3;
            DateTime dateTime8 = dateTime5;
            if (linkedHashMap2.isEmpty()) {
                bVar = null;
            } else {
                bVar = new yp.b(i53.a.g(linkedHashMap2));
            }
            LocalDate localDate2 = dateTime8.toLocalDate();
            if (list3 != null || list8 == null) {
                i15 = i18;
                fVar = new yp.f(null, null, null, null, null, null, null, null, 252, null);
            } else {
                int i19 = xp.a.C3570a.f191827a[kVar.ordinal()];
                if (i19 != i18) {
                    if (i19 == 2) {
                        ArrayList arrayListD = xp.a.d(list3, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.COUNT);
                        if (arrayListD != null) {
                            Iterator it16 = arrayListD.iterator();
                            dDoubleValue3 = 0.0d;
                            while (it16.hasNext()) {
                                dDoubleValue3 += ((Number) it16.next()).doubleValue();
                            }
                        } else {
                            dDoubleValue3 = 0.0d;
                        }
                        if (dDoubleValue3 > 0.0d) {
                            ArrayList arrayListD2 = xp.a.d(list3, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.SUM);
                            if (arrayListD2 != null) {
                                Iterator it17 = arrayListD2.iterator();
                                dDoubleValue4 = 0.0d;
                                while (it17.hasNext()) {
                                    dDoubleValue4 += ((Number) it17.next()).doubleValue();
                                }
                            } else {
                                dDoubleValue4 = 0.0d;
                            }
                            dValueOf3 = Double.valueOf(dDoubleValue4 / dDoubleValue3);
                        } else {
                            dValueOf3 = null;
                        }
                        ArrayList arrayListD3 = xp.a.d(list3, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                        if (arrayListD3 == null || arrayListD3.isEmpty()) {
                            dValueOf4 = null;
                        } else {
                            Iterator it18 = arrayListD3.iterator();
                            double dDoubleValue13 = 0.0d;
                            while (it18.hasNext()) {
                                dDoubleValue13 += ((Number) it18.next()).doubleValue();
                            }
                            dValueOf4 = Double.valueOf(dDoubleValue13 / ((double) arrayListD3.size()));
                        }
                        int i24 = xp.a.C3570a.f191828b[gVar4.ordinal()];
                        if (i24 == 1) {
                            fVar = new yp.f(dValueOf3, null, dValueOf4, null, null, null, null, null, 250, null);
                        } else if (i24 == 2 || i24 == 3) {
                            ArrayList arrayListD4 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                            if (arrayListD4 == null || arrayListD4.isEmpty()) {
                                dValueOf5 = null;
                            } else {
                                Iterator it19 = arrayListD4.iterator();
                                double dDoubleValue14 = 0.0d;
                                while (it19.hasNext()) {
                                    dDoubleValue14 += ((Number) it19.next()).doubleValue();
                                }
                                dValueOf5 = Double.valueOf(dDoubleValue14 / ((double) arrayListD4.size()));
                            }
                            fVar = new yp.f(dValueOf3, null, dValueOf4, null, dValueOf5, null, null, null, 234, null);
                        } else {
                            fVar = new yp.f(null, null, null, null, null, null, null, null, 252, null);
                        }
                    } else if (i19 == 3) {
                        mp.i iVar = mp.i.PACK_WEIGHT;
                        mp.h hVar = mp.h.COUNT;
                        ArrayList arrayListD5 = xp.a.d(list3, iVar, hVar);
                        Double dValueOf8 = arrayListD5 != null ? Double.valueOf(h0.P0(arrayListD5)) : null;
                        mp.h hVar2 = mp.h.SUM;
                        ArrayList arrayListD6 = xp.a.d(list3, iVar, hVar2);
                        Double dValueOf9 = arrayListD6 != null ? Double.valueOf(h0.P0(arrayListD6)) : null;
                        mp.i iVar2 = mp.i.SPLIT_SUMMARY_AVG_PACK_WEIGHT;
                        ArrayList arrayListD7 = xp.a.d(list3, iVar2, hVar);
                        Double dValueOf10 = arrayListD7 != null ? Double.valueOf(h0.P0(arrayListD7)) : null;
                        ArrayList arrayListD8 = xp.a.d(list3, iVar2, hVar2);
                        Double dValueOf11 = arrayListD8 != null ? Double.valueOf(h0.P0(arrayListD8)) : null;
                        double dDoubleValue15 = (dValueOf9 != null ? dValueOf9.doubleValue() : 0.0d) + (dValueOf11 != null ? dValueOf11.doubleValue() : 0.0d);
                        double dDoubleValue16 = (dValueOf8 != null ? dValueOf8.doubleValue() : 0.0d) + (dValueOf10 != null ? dValueOf10.doubleValue() : 0.0d);
                        if (dDoubleValue16 < 1.0d) {
                            dDoubleValue16 = 1.0d;
                        }
                        double d16 = dDoubleValue15 / dDoubleValue16;
                        ArrayList arrayListC = xp.a.c(list3, mp.i.DISTANCE, hVar2);
                        if (arrayListC != null) {
                            Iterator it20 = arrayListC.iterator();
                            double dDoubleValue17 = 0.0d;
                            while (it20.hasNext()) {
                                Double dF2 = ((mp.l) it20.next()).getValue();
                                dDoubleValue17 += dF2 != null ? dF2.doubleValue() : 0.0d;
                            }
                            dValueOf6 = Double.valueOf(dDoubleValue17);
                        } else {
                            dValueOf6 = null;
                        }
                        ArrayList arrayListC2 = xp.a.c(list3, mp.i.DURATION, mp.h.SUM);
                        if (arrayListC2 != null) {
                            Iterator it21 = arrayListC2.iterator();
                            dDoubleValue5 = 0.0d;
                            while (it21.hasNext()) {
                                Double dF3 = ((mp.l) it21.next()).getValue();
                                dDoubleValue5 += dF3 != null ? dF3.doubleValue() : 0.0d;
                            }
                        } else {
                            dDoubleValue5 = 0.0d;
                        }
                        Double dH2 = (dValueOf6 == null || dDoubleValue5 <= 0.0d) ? null : u0.h(dDoubleValue5, dValueOf6);
                        fVar = new yp.f(Double.valueOf(d16), null, Double.valueOf(dH2 != null ? dH2.doubleValue() : 0.0d), mp.k.PACE, null, null, null, null, 242, null);
                    } else if (i19 != 4) {
                        Map<mp.k, List<mp.l>> mapB2 = xp.a.b(list3, kVar);
                        if (mapB2.isEmpty() || (list6 = (List) h0.a0(mapB2.values())) == null || list6.isEmpty()) {
                            dDoubleValue6 = 0.0d;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it22 = list6.iterator();
                            while (it22.hasNext()) {
                                Double dF4 = ((mp.l) it22.next()).getValue();
                                if (dF4 != null) {
                                    arrayList3.add(dF4);
                                }
                            }
                            Iterator it23 = arrayList3.iterator();
                            dDoubleValue6 = 0.0d;
                            while (it23.hasNext()) {
                                dDoubleValue6 = ((Number) it23.next()).doubleValue() + dDoubleValue6;
                            }
                        }
                        double d17 = dDoubleValue6 / d15;
                        int i25 = xp.a.C3570a.f191828b[gVar4.ordinal()];
                        if (i25 == 1) {
                            fVar3 = new yp.f(Double.valueOf(d17), null, Double.valueOf(d17 / 7.0d), null, null, null, null, null, 250, null);
                            fVar = fVar3;
                        } else if (i25 == 2) {
                            fVar2 = new yp.f(Double.valueOf(d17), null, Double.valueOf(d17 / 28.0d), null, Double.valueOf(d17 / 4.0d), null, null, null, 234, null);
                            fVar = fVar2;
                        } else if (i25 != 3) {
                            fVar = new yp.f(null, null, null, null, null, null, null, null, 252, null);
                        } else {
                            LocalDate localDate3 = new DateTime(millis).toLocalDate();
                            localDate3.getClass();
                            LocalDate localDate4 = new DateTime(millis2).toLocalDate();
                            localDate4.getClass();
                            double dM = oc.b.m(localDate3, localDate4);
                            fVar = new yp.f(Double.valueOf(d17), null, Double.valueOf(d17 / dM), null, Double.valueOf(d17 / (dM / 7.0d)), null, null, null, 234, null);
                        }
                    } else {
                        Map<mp.k, List<mp.l>> mapB3 = xp.a.b(list3, kVar);
                        if (mapB3.isEmpty() || (list5 = (List) h0.a0(mapB3.values())) == null || list5.isEmpty()) {
                            dValueOf7 = null;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it24 = list5.iterator();
                            while (it24.hasNext()) {
                                Double dF5 = ((mp.l) it24.next()).getValue();
                                if (dF5 != null) {
                                    arrayList4.add(dF5);
                                }
                            }
                            Iterator it25 = arrayList4.iterator();
                            double dDoubleValue18 = 0.0d;
                            while (it25.hasNext()) {
                                dDoubleValue18 += ((Number) it25.next()).doubleValue();
                            }
                            dValueOf7 = Double.valueOf(dDoubleValue18);
                        }
                        if (dValueOf7 != null) {
                            double dDoubleValue19 = dValueOf7.doubleValue();
                            int i26 = xp.a.C3570a.f191828b[gVar4.ordinal()];
                            if (i26 == 1) {
                                fVar = new yp.f(dValueOf7, null, Double.valueOf(dDoubleValue19 / 7.0d), null, null, null, null, null, 250, null);
                            } else if (i26 == 2) {
                                fVar = new yp.f(dValueOf7, null, Double.valueOf(dDoubleValue19 / 28.0d), null, Double.valueOf(dDoubleValue19 / 4.0d), null, null, null, 234, null);
                            } else if (i26 != 3) {
                                fVar3 = new yp.f(null, null, null, null, null, null, null, null, 252, null);
                                fVar = fVar3;
                            } else {
                                LocalDate localDate5 = new DateTime(millis).toLocalDate();
                                localDate5.getClass();
                                LocalDate localDate6 = new DateTime(millis2).toLocalDate();
                                localDate6.getClass();
                                double dM2 = oc.b.m(localDate5, localDate6);
                                fVar = new yp.f(dValueOf7, null, Double.valueOf(dDoubleValue19 / dM2), null, Double.valueOf(dDoubleValue19 / (dM2 / 7.0d)), null, null, null, 234, null);
                            }
                        } else {
                            fVar2 = new yp.f(null, null, null, null, null, null, null, null, 234, null);
                            fVar = fVar2;
                        }
                    }
                    i15 = 1;
                } else {
                    ArrayList arrayListD9 = xp.a.d(list3, mp.i.SPLIT_SUMMARY_GAMES_WON, mp.h.SUM);
                    if (arrayListD9 != null) {
                        Iterator it26 = arrayListD9.iterator();
                        dDoubleValue = 0.0d;
                        while (it26.hasNext()) {
                            dDoubleValue += ((Number) it26.next()).doubleValue();
                        }
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    ArrayList arrayListD10 = xp.a.d(list3, mp.i.SPLIT_SUMMARY_GAMES_NOT_WON, mp.h.SUM);
                    if (arrayListD10 != null) {
                        Iterator it27 = arrayListD10.iterator();
                        dDoubleValue2 = 0.0d;
                        while (it27.hasNext()) {
                            dDoubleValue2 += ((Number) it27.next()).doubleValue();
                        }
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    double d18 = dDoubleValue2 + dDoubleValue;
                    double dDoubleValue20 = 0.0d;
                    Double dValueOf12 = d18 == 0.0d ? null : Double.valueOf((dDoubleValue / d18) * ((double) 100));
                    ArrayList arrayListD11 = xp.a.d(list3, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                    if (arrayListD11 == null || arrayListD11.isEmpty()) {
                        dValueOf = null;
                    } else {
                        Iterator it28 = arrayListD11.iterator();
                        double dDoubleValue21 = 0.0d;
                        while (it28.hasNext()) {
                            dDoubleValue21 += ((Number) it28.next()).doubleValue();
                        }
                        dValueOf = Double.valueOf(dDoubleValue21 / ((double) arrayListD11.size()));
                    }
                    int i27 = xp.a.C3570a.f191828b[gVar4.ordinal()];
                    i15 = 1;
                    if (i27 == 1) {
                        fVar = new yp.f(dValueOf12, null, dValueOf, null, null, null, null, null, 250, null);
                    } else if (i27 == 2 || i27 == 3) {
                        ArrayList arrayListD12 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                        if (arrayListD12 == null || arrayListD12.isEmpty()) {
                            dValueOf2 = null;
                        } else {
                            Iterator it29 = arrayListD12.iterator();
                            while (it29.hasNext()) {
                                dDoubleValue20 = ((Number) it29.next()).doubleValue() + dDoubleValue20;
                            }
                            dValueOf2 = Double.valueOf(dDoubleValue20 / ((double) arrayListD12.size()));
                        }
                        fVar = new yp.f(dValueOf12, null, dValueOf, null, dValueOf2, null, null, null, 234, null);
                    } else {
                        fVar = new yp.f(null, null, null, null, null, null, null, null, 252, null);
                    }
                }
            }
            if (list4 != null || (cVarB = i53.a.e(list4)) == null) {
                cVarB = j53.l.b();
            }
            boolean zContains = p13.x.k(x0.f4308n, x0.f4312o, x0.f4324r, x0.f4268a3).contains(x0Var7);
            String string3 = localDate2.toString("yyyy-MM-dd");
            string3.getClass();
            linkedHashMap3.put(next3, new qp.c(x0Var7, bVar, fVar, cVarB, zContains, string3, zY, z14));
            linkedHashMap = linkedHashMap3;
            x0Var3 = x0Var7;
            i18 = i15;
            cVar3 = cVar4;
            it3 = it15;
            dateTime5 = dateTime8;
            gVar3 = gVar4;
        }
        return i53.a.k(linkedHashMap);
        m mVar6 = (m) obj;
        str.getClass();
        str2.getClass();
        cVar5.f114072a = x0Var2;
        cVar5.f114073b = gVar2;
        cVar5.f114074c = str3;
        cVar5.f114075d = dateTime;
        cVar5.f114076e = dateTimeAtCurrentTime;
        cVar5.f114077f = str;
        cVar5.f114078g = str2;
        cVar5.f114079h = mVar6;
        cVar5.f114083l = 2;
        Object objB = aVar2.b(str, str2, str3, cVar5);
        if (objB != aVar3) {
            DateTime dateTime9 = dateTime;
            dateTime2 = dateTimeAtCurrentTime;
            mVar = mVar6;
            obj = objB;
            str4 = str;
            dateTime3 = dateTime9;
            mVar2 = (m) obj;
            list = (List) mVar2.f73770c;
            if (list != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).d();
                }
            }
            str4.getClass();
            str2.getClass();
            cVar5.f114072a = x0Var2;
            cVar5.f114073b = gVar2;
            cVar5.f114074c = null;
            cVar5.f114075d = dateTime3;
            cVar5.f114076e = dateTime2;
            cVar5.f114077f = null;
            cVar5.f114078g = null;
            cVar5.f114079h = mVar;
            cVar5.f114080i = mVar2;
            cVar5.f114083l = 3;
            objC = aVar2.c(str4, str2, str3, cVar5);
            if (objC != aVar3) {
                mVar3 = mVar;
                mVar4 = mVar2;
                obj = objC;
                dateTime4 = dateTime2;
                dateTime5 = dateTime3;
                x0Var3 = x0Var2;
                gVar3 = gVar2;
                m mVar7 = (m) obj;
                list2 = (List) mVar7.f73770c;
                if (list2 != null) {
                    it10 = list2.iterator();
                    while (it10.hasNext()) {
                        ((n) it10.next()).d();
                    }
                }
                dateTime5.getClass();
                list3 = (List) mVar7.f73770c;
                List list9 = (List) mVar4.f73770c;
                cVar3 = (mp.c) mVar3.f73770c;
                long millis4 = dateTime5.getMillis();
                long millis5 = dateTime4.getMillis();
                f12.l lVar3 = this.f114086c;
                zY = lVar3.y();
                z14 = !lVar3.c();
                x0Var3.getClass();
                gVar3.getClass();
                w13.c cVar8 = mp.k.C;
                iA = t0.a(y.r(cVar8, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                it3 = cVar8.iterator();
                while (it3.hasNext()) {
                    Object next5 = it3.next();
                    kVar = (mp.k) next5;
                    if (cVar3 != null) {
                        listB = cVar3.b();
                    } else {
                        listB = null;
                    }
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    if (listB != null) {
                        arrayList = new ArrayList(y.r(listB, 10));
                        it8 = listB.iterator();
                        while (it8.hasNext()) {
                            dVar = (mp.d) it8.next();
                            Iterator it110 = it8;
                            mp.c cVar9 = cVar3;
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                            time = -1;
                            strS = dVar.getStartTimeLocal();
                            if (strS == null) {
                                strS = "";
                            }
                            date = simpleDateFormat2.parse(strS);
                            if (date != null) {
                                time = date.getTime();
                            }
                            gVar5 = gVar3;
                            x0 x0Var8 = x0Var3;
                            String strD2 = dVar.getActivityName();
                            long jB2 = dVar.getActivityId();
                            long millis6 = new DateTime(time).getMillis();
                            switch (xp.a.C3570a.f191827a[kVar.ordinal()]) {
                                case 1:
                                    gVar6 = gVar5;
                                    listR = dVar.r();
                                    if (listR == null) {
                                    }
                                    d14 = null;
                                    break;
                                case 2:
                                    gVar6 = gVar5;
                                    listR2 = dVar.r();
                                    if (listR2 == null) {
                                    }
                                    d14 = null;
                                    break;
                                case 3:
                                    listR3 = dVar.r();
                                    if (listR3 != null) {
                                        it9 = listR3.iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                next2 = it9.next();
                                                gVar6 = gVar5;
                                                if (s.g(((o1) next2).getSplitType(), x.PACK_WEIGHT.f147220a)) {
                                                    gVar5 = gVar6;
                                                }
                                            } else {
                                                gVar6 = gVar5;
                                                next2 = null;
                                            }
                                        }
                                        o1Var3 = (o1) next2;
                                        if (o1Var3 == null) {
                                        }
                                        dO = dVar.getPackWeight();
                                        if (D == null) {
                                            d14 = D;
                                        } else {
                                            d14 = dO;
                                        }
                                    } else {
                                        gVar6 = gVar5;
                                    }
                                    D = null;
                                    dO = dVar.getPackWeight();
                                    if (D == null) {
                                        d14 = D;
                                    } else {
                                        d14 = dO;
                                    }
                                    break;
                                case 4:
                                    D = dVar.getDifferenceBodyBattery();
                                    gVar6 = gVar5;
                                    d14 = D;
                                    break;
                                case 5:
                                    dK = dVar.getElevationGain();
                                    if (dK != null) {
                                        dDoubleValue7 = dK.doubleValue();
                                    } else {
                                        dDoubleValue7 = 0.0d;
                                    }
                                    D = Double.valueOf(dDoubleValue7);
                                    gVar6 = gVar5;
                                    d14 = D;
                                    break;
                                case 6:
                                    dI = dVar.getDistance();
                                    if (dI != null) {
                                        dDoubleValue8 = dI.doubleValue();
                                    } else {
                                        dDoubleValue8 = 0.0d;
                                    }
                                    D = Double.valueOf(dDoubleValue8);
                                    gVar6 = gVar5;
                                    d14 = D;
                                    break;
                                case 7:
                                    dI2 = dVar.getDistance();
                                    if (dI2 != null) {
                                        dDoubleValue9 = dI2.doubleValue();
                                    } else {
                                        dDoubleValue9 = 0.0d;
                                    }
                                    D = Double.valueOf(dDoubleValue9);
                                    gVar6 = gVar5;
                                    d14 = D;
                                    break;
                                case 8:
                                    dJ = dVar.getDuration();
                                    if (dJ != null) {
                                        dDoubleValue10 = dJ.doubleValue();
                                    } else {
                                        dDoubleValue10 = 0.0d;
                                    }
                                    D = Double.valueOf(dDoubleValue10);
                                    gVar6 = gVar5;
                                    d14 = D;
                                    break;
                                case 9:
                                    dJ2 = dVar.getDuration();
                                    if (dJ2 != null) {
                                        dDoubleValue11 = dJ2.doubleValue();
                                    } else {
                                        dDoubleValue11 = 0.0d;
                                    }
                                    D = Double.valueOf(dDoubleValue11);
                                    gVar6 = gVar5;
                                    d14 = D;
                                    break;
                                case 10:
                                    dG = dVar.getCalories();
                                    if (dG != null) {
                                        dDoubleValue12 = dG.doubleValue();
                                    } else {
                                        dDoubleValue12 = 0.0d;
                                    }
                                    D = Double.valueOf(dDoubleValue12);
                                    gVar6 = gVar5;
                                    d14 = D;
                                    break;
                                default:
                                    gVar6 = gVar5;
                                    d14 = null;
                                    break;
                            }
                            arrayList.add(new yp.d(strD2, jB2, millis6, d14, z0.l(x0.f4346x, dVar.getActivityType().j()), dVar.getIsPersonalRecord()));
                            x0Var3 = x0Var8;
                            it8 = it110;
                            cVar3 = cVar9;
                            gVar3 = gVar6;
                        }
                        cVar4 = cVar3;
                        gVar4 = gVar3;
                        x0Var4 = x0Var3;
                        listN0 = h0.N0(arrayList, new xp.b());
                    } else {
                        cVar4 = cVar3;
                        gVar4 = gVar3;
                        x0Var4 = x0Var3;
                        listN0 = null;
                    }
                    Map<mp.k, List<mp.l>> mapB4 = xp.a.b(list3, kVar);
                    double d19 = kVar.f120030c;
                    i14 = xp.a.C3570a.f191828b[gVar4.ordinal()];
                    if (i14 != 2) {
                        iR = 28;
                    } else if (i14 != 3) {
                        iR = 7;
                    } else {
                        LocalDate localDate7 = dateTime5.toLocalDate();
                        localDate7.getClass();
                        LocalDate localDateP2 = jg.b.P(localDate7);
                        iR = jg.b.r(localDateP2, jg.b.t(localDateP2));
                    }
                    linkedHashMap2 = new LinkedHashMap();
                    it4 = mapB4.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry<mp.k, List<mp.l>> next6 = it4.next();
                        value = next6.getValue();
                        if (value == null) {
                            list7 = listN0;
                            x0Var5 = x0Var4;
                            it5 = it3;
                            dateTime6 = dateTime5;
                            it6 = it4;
                        } else {
                            list7 = listN0;
                            x0Var5 = x0Var4;
                            it5 = it3;
                            dateTime6 = dateTime5;
                            it6 = it4;
                        }
                        it4 = it6;
                        listN0 = list7;
                        x0Var4 = x0Var5;
                        it3 = it5;
                        dateTime5 = dateTime6;
                    }
                    list4 = listN0;
                    x0 x0Var9 = x0Var4;
                    Iterator it111 = it3;
                    DateTime dateTime10 = dateTime5;
                    if (linkedHashMap2.isEmpty()) {
                        bVar = null;
                    } else {
                        bVar = new yp.b(i53.a.g(linkedHashMap2));
                    }
                    LocalDate localDate8 = dateTime10.toLocalDate();
                    if (list3 != null) {
                        i15 = i18;
                        fVar = new yp.f(null, null, null, null, null, null, null, null, 252, null);
                    } else {
                        i15 = i18;
                        fVar = new yp.f(null, null, null, null, null, null, null, null, 252, null);
                    }
                    if (list4 != null) {
                        cVarB = j53.l.b();
                    } else {
                        cVarB = j53.l.b();
                    }
                    boolean zContains2 = p13.x.k(x0.f4308n, x0.f4312o, x0.f4324r, x0.f4268a3).contains(x0Var9);
                    String string4 = localDate8.toString("yyyy-MM-dd");
                    string4.getClass();
                    linkedHashMap4.put(next5, new qp.c(x0Var9, bVar, fVar, cVarB, zContains2, string4, zY, z14));
                    linkedHashMap = linkedHashMap4;
                    x0Var3 = x0Var9;
                    i18 = i15;
                    cVar3 = cVar4;
                    it3 = it111;
                    dateTime5 = dateTime10;
                    gVar3 = gVar4;
                }
                return i53.a.k(linkedHashMap);
            }
        }
        return aVar3;
    }
}
