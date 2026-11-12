package lp;

import am.x0;
import fw.m;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import mp.n;
import o13.r;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.p0;
import p13.t0;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llp/f;", "", "Ltp/a;", "repo", "Lf12/l;", "gcmUserSettings", "<init>", "(Ltp/a;Lf12/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp.a f114096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f114097b;

    public f(tp.a aVar, f12.l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f114096a = aVar;
        this.f114097b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02bb A[EDGE_INSN: B:115:0x02bb->B:116:0x02c0 BREAK  A[LOOP:3: B:56:0x017a->B:114:0x02b6]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x030f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0332  */
    /* JADX WARN: Code duplicated, block: B:136:0x0354  */
    /* JADX WARN: Code duplicated, block: B:139:0x035e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0387 A[LOOP:6: B:137:0x0358->B:142:0x0387, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x0398  */
    /* JADX WARN: Code duplicated, block: B:147:0x039d  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:156:0x03c8 A[PHI: r8
      0x03c8: PHI (r8v9 double) = (r8v2 double), (r8v5 double) binds: [B:155:0x03c6, B:390:0x03c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:170:0x0412  */
    /* JADX WARN: Code duplicated, block: B:171:0x0414  */
    /* JADX WARN: Code duplicated, block: B:173:0x041f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0422  */
    /* JADX WARN: Code duplicated, block: B:176:0x0426  */
    /* JADX WARN: Code duplicated, block: B:177:0x0429  */
    /* JADX WARN: Code duplicated, block: B:180:0x0436  */
    /* JADX WARN: Code duplicated, block: B:182:0x0439  */
    /* JADX WARN: Code duplicated, block: B:184:0x043c  */
    /* JADX WARN: Code duplicated, block: B:186:0x043f  */
    /* JADX WARN: Code duplicated, block: B:189:0x044e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0458  */
    /* JADX WARN: Code duplicated, block: B:192:0x0461  */
    /* JADX WARN: Code duplicated, block: B:198:0x0474  */
    /* JADX WARN: Code duplicated, block: B:200:0x0486  */
    /* JADX WARN: Code duplicated, block: B:201:0x048b  */
    /* JADX WARN: Code duplicated, block: B:205:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:224:0x0521  */
    /* JADX WARN: Code duplicated, block: B:226:0x0525  */
    /* JADX WARN: Code duplicated, block: B:227:0x0532  */
    /* JADX WARN: Code duplicated, block: B:229:0x0549  */
    /* JADX WARN: Code duplicated, block: B:232:0x055e  */
    /* JADX WARN: Code duplicated, block: B:234:0x0572  */
    /* JADX WARN: Code duplicated, block: B:235:0x057b  */
    /* JADX WARN: Code duplicated, block: B:238:0x0588  */
    /* JADX WARN: Code duplicated, block: B:239:0x0591  */
    /* JADX WARN: Code duplicated, block: B:242:0x059e  */
    /* JADX WARN: Code duplicated, block: B:243:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:246:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:247:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:249:0x05be  */
    /* JADX WARN: Code duplicated, block: B:250:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:253:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:256:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:257:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:259:0x05db  */
    /* JADX WARN: Code duplicated, block: B:260:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:263:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:267:0x0605  */
    /* JADX WARN: Code duplicated, block: B:270:0x0611 A[LOOP:13: B:268:0x060b->B:270:0x0611, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:272:0x0623  */
    /* JADX WARN: Code duplicated, block: B:275:0x062e  */
    /* JADX WARN: Code duplicated, block: B:278:0x063a A[LOOP:14: B:276:0x0634->B:278:0x063a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0647  */
    /* JADX WARN: Code duplicated, block: B:281:0x064b  */
    /* JADX WARN: Code duplicated, block: B:284:0x0656  */
    /* JADX WARN: Code duplicated, block: B:287:0x0661  */
    /* JADX WARN: Code duplicated, block: B:288:0x0664  */
    /* JADX WARN: Code duplicated, block: B:291:0x066a  */
    /* JADX WARN: Code duplicated, block: B:292:0x066f  */
    /* JADX WARN: Code duplicated, block: B:294:0x068a  */
    /* JADX WARN: Code duplicated, block: B:296:0x069a  */
    /* JADX WARN: Code duplicated, block: B:310:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:313:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:320:0x0718  */
    /* JADX WARN: Code duplicated, block: B:323:0x0724  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:330:0x074f  */
    /* JADX WARN: Code duplicated, block: B:332:0x0766  */
    /* JADX WARN: Code duplicated, block: B:334:0x0771  */
    /* JADX WARN: Code duplicated, block: B:337:0x077d A[LOOP:19: B:335:0x0777->B:337:0x077d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:338:0x0789  */
    /* JADX WARN: Code duplicated, block: B:341:0x0795  */
    /* JADX WARN: Code duplicated, block: B:344:0x07a1 A[LOOP:20: B:342:0x079b->B:344:0x07a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:345:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:348:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:349:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:352:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:359:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[LOOP:0: B:33:0x00df->B:35:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x0806  */
    /* JADX WARN: Code duplicated, block: B:369:0x0831  */
    /* JADX WARN: Code duplicated, block: B:378:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0394 A[EDGE_INSN: B:388:0x0394->B:144:0x0394 BREAK  A[LOOP:6: B:137:0x0358->B:142:0x0387], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x011b  */
    /* JADX WARN: Code duplicated, block: B:390:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x03ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0129  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(o82.a aVar, x0 x0Var, v13.c cVar) {
        e eVar;
        String str;
        String string;
        Object objB;
        x0 x0Var2;
        DateTime dateTime;
        String str2;
        m mVar;
        List list;
        List<n> list2;
        List list3;
        boolean zY;
        boolean z14;
        LinkedHashMap linkedHashMap;
        int iA;
        Iterator it;
        mp.k kVar;
        List list4;
        Iterator it3;
        double d14;
        Iterable iterableN0;
        List list5;
        double d15;
        LinkedHashMap linkedHashMap2;
        List list6;
        double d16;
        yp.b bVar;
        List<n> list7;
        List list8;
        int i14;
        ArrayList arrayListD;
        double dDoubleValue;
        ArrayList arrayListD2;
        double dDoubleValue2;
        double d17;
        Double dValueOf;
        ArrayList arrayListD3;
        Double dValueOf2;
        ArrayList arrayListD4;
        Double dValueOf3;
        yp.f fVar;
        Iterator it4;
        Iterator it5;
        ArrayList arrayListD5;
        Double dValueOf4;
        ArrayList arrayListD6;
        Double dValueOf5;
        ArrayList arrayListD7;
        Double dValueOf6;
        ArrayList arrayList;
        double dN;
        ArrayList arrayListD8;
        Double dValueOf7;
        ArrayList arrayListD9;
        double dDoubleValue3;
        Double dH;
        Double dValueOf8;
        Double d18;
        double dDoubleValue4;
        Iterator it6;
        Iterator it7;
        double dDoubleValue5;
        ArrayList arrayListD10;
        Double dValueOf9;
        ArrayList arrayListD11;
        Double dValueOf10;
        ArrayList arrayListD12;
        Double dValueOf11;
        ArrayList arrayListD13;
        Double dValueOf12;
        double dDoubleValue6;
        double dDoubleValue7;
        double dDoubleValue8;
        double dDoubleValue9;
        double d19;
        ArrayList arrayListD14;
        Double dValueOf13;
        ArrayList arrayListD15;
        Double dValueOf14;
        Double dValueOf15;
        ArrayList arrayList2;
        Iterator it8;
        Iterator it9;
        double d24;
        Double d25;
        double dDoubleValue10;
        LinkedHashMap linkedHashMap3;
        Map map;
        ArrayList arrayList3;
        Iterator<Integer> it10;
        Iterator it11;
        yp.c cVar2;
        double d26;
        LocalDate localDate;
        LocalDate localDatePlusMonths;
        List<mp.l> value;
        List list9;
        DateTime dateTime2;
        Double dF;
        Double dH2;
        Iterator<T> it12;
        Object next;
        LocalDate localDate2;
        ArrayList arrayList4;
        LinkedHashMap linkedHashMap4;
        Map map2;
        List list10;
        Iterator it13;
        yp.e eVar2;
        yp.e eVar3;
        Iterator it14;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i15 = eVar.f114095i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f114095i = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objA = eVar.f114093g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f114095i;
        tp.a aVar3 = this.f114096a;
        if (i16 == 0) {
            r.b(objA);
            str = x0Var.f4358a;
            DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
            DateTime dateTimeAtCurrentTime = g22.l.h(aVar.f130844b).toDateTimeAtCurrentTime();
            String string2 = dateTimeAtStartOfDay.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
            string = dateTimeAtCurrentTime.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
            string2.getClass();
            string.getClass();
            eVar.f114087a = x0Var;
            eVar.f114088b = str;
            eVar.f114089c = dateTimeAtStartOfDay;
            eVar.f114090d = string2;
            eVar.f114091e = string;
            eVar.f114095i = 1;
            objB = aVar3.b(string2, string, str, eVar);
            if (objB != aVar2) {
                x0Var2 = x0Var;
                dateTime = dateTimeAtStartOfDay;
                str2 = string2;
            }
            return aVar2;
        }
        if (i16 == 1) {
            string = eVar.f114091e;
            String str3 = eVar.f114090d;
            DateTime dateTime3 = eVar.f114089c;
            str = eVar.f114088b;
            x0Var2 = eVar.f114087a;
            r.b(objA);
            str2 = str3;
            dateTime = dateTime3;
            objB = objA;
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mVar = eVar.f114092f;
            dateTime = eVar.f114089c;
            x0 x0Var3 = eVar.f114087a;
            r.b(objA);
            x0Var2 = x0Var3;
        }
        m mVar2 = (m) objA;
        list = (List) mVar2.f73770c;
        if (list != null) {
            it14 = list.iterator();
            while (it14.hasNext()) {
                ((n) it14.next()).d();
            }
        }
        dateTime.getClass();
        list2 = (List) mVar2.f73770c;
        list3 = (List) mVar.f73770c;
        f12.l lVar = this.f114097b;
        zY = lVar.y();
        z14 = !lVar.c();
        x0Var2.getClass();
        w13.c cVar3 = mp.k.C;
        iA = t0.a(y.r(cVar3, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        it = cVar3.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            kVar = (mp.k) next2;
            if (list2 != null) {
                d14 = 0.0d;
                arrayList4 = new ArrayList();
                for (n nVar : list2) {
                    DateTime dateTimeAtStartOfDay2 = new LocalDate(nVar.getDate()).toDateTimeAtStartOfDay();
                    linkedHashMap4 = nVar.f120045d;
                    if (linkedHashMap4 != null) {
                        map2 = (Map) linkedHashMap4.get(kVar.f120029b);
                    } else {
                        map2 = null;
                    }
                    if (map2 != null && !map2.isEmpty()) {
                        Iterator it15 = map2.entrySet().iterator();
                        while (true) {
                            if (!it15.hasNext()) {
                                list10 = list2;
                                it13 = it;
                                eVar2 = null;
                                break;
                            }
                            Object key = ((Map.Entry) it15.next()).getKey();
                            String str4 = mp.h.SUM.f119979a;
                            if (s.g(key, str4)) {
                                int[] iArr = xp.a.C3570a.f191827a;
                                int iOrdinal = kVar.ordinal();
                                list10 = list2;
                                it13 = it;
                                double d27 = kVar.f120030c;
                                int i17 = iArr[iOrdinal];
                                if (i17 != 1 && i17 != 2) {
                                    if (i17 == 3) {
                                        LinkedHashMap linkedHashMap5 = nVar.f120045d;
                                        Map map3 = linkedHashMap5 != null ? (Map) linkedHashMap5.get(mp.k.AVG_PACK_WEIGHT.f120029b) : null;
                                        mp.h hVar = mp.h.COUNT;
                                        Double d28 = (Double) map2.get(hVar.f119979a);
                                        Double dE = xp.a.e(d27, (Double) map2.get(str4));
                                        Double d29 = map3 != null ? (Double) map3.get(hVar.f119979a) : null;
                                        Double dE2 = map3 != null ? xp.a.e(d27, (Double) map3.get(str4)) : null;
                                        double dDoubleValue11 = (dE != null ? dE.doubleValue() : 0.0d) + (dE2 != null ? dE2.doubleValue() : 0.0d);
                                        double dDoubleValue12 = (d28 != null ? d28.doubleValue() : 0.0d) + (d29 != null ? d29.doubleValue() : 0.0d);
                                        if (dDoubleValue12 < 1.0d) {
                                            dDoubleValue12 = 1.0d;
                                        }
                                        eVar3 = new yp.e(dateTimeAtStartOfDay2.getMonthOfYear(), dateTimeAtStartOfDay2.getYear(), (dE == null && dE2 == null) ? null : Double.valueOf(dDoubleValue11 / dDoubleValue12), dateTimeAtStartOfDay2.getMillis());
                                    } else if (i17 != 4) {
                                        eVar3 = new yp.e(dateTimeAtStartOfDay2.getMonthOfYear(), dateTimeAtStartOfDay2.getYear(), xp.a.e(d27, (Double) map2.get(str4)), dateTimeAtStartOfDay2.getMillis());
                                    } else {
                                        Double d34 = (Double) map2.get(mp.h.COUNT.f119979a);
                                        eVar3 = new yp.e(dateTimeAtStartOfDay2.getMonthOfYear(), dateTimeAtStartOfDay2.getYear(), (d34 != null ? d34.doubleValue() : 0.0d) > 0.0d ? xp.a.e(d27, (Double) map2.get(str4)) : null, dateTimeAtStartOfDay2.getMillis());
                                    }
                                    eVar2 = eVar3;
                                    break;
                                }
                                eVar2 = new yp.e(dateTimeAtStartOfDay2.getMonthOfYear(), dateTimeAtStartOfDay2.getYear(), xp.a.e(d27, (Double) map2.get(mp.h.AVG.f119979a)), dateTimeAtStartOfDay2.getMillis());
                                break;
                            }
                        }
                    } else {
                        list10 = list2;
                        it13 = it;
                        eVar2 = null;
                        break;
                    }
                    if (eVar2 != null) {
                        arrayList4.add(eVar2);
                    }
                    list2 = list10;
                    it = it13;
                }
                list4 = list2;
                it3 = it;
                iterableN0 = h0.N0(arrayList4, new xp.c());
                if (iterableN0 == null) {
                }
                LocalDate localDate3 = dateTime.toLocalDate();
                if (list4 == null) {
                    list5 = j0.f134944a;
                } else {
                    list5 = list4;
                }
                Map<mp.k, List<mp.l>> mapB = xp.a.b(list5, kVar);
                d15 = kVar.f120030c;
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<mp.k, List<mp.l>> entry : mapB.entrySet()) {
                    j23.l lVarO = t.o(0, 12);
                    Iterable iterable = iterableN0;
                    arrayList3 = new ArrayList(y.r(lVarO, 10));
                    it10 = lVarO.iterator();
                    while (((j23.k) it10).f96801c) {
                        int iNextInt = ((p0) it10).nextInt();
                        Iterator<Integer> it16 = it10;
                        localDate = dateTime.withDayOfMonth(1).plusMonths(iNextInt).toLocalDate();
                        localDatePlusMonths = localDate.plusMonths(1);
                        value = entry.getValue();
                        if (value != null) {
                            it12 = value.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    list9 = list3;
                                    dateTime2 = dateTime;
                                    next = null;
                                    break;
                                }
                                next = it12.next();
                                localDatePlusMonths.getClass();
                                list9 = list3;
                                localDate2 = localDate;
                                dateTime2 = dateTime;
                                if (j23.g.a.a(f0.I(localDate, jg.b.J(localDatePlusMonths)), new LocalDate(((mp.l) next).getCalendarDate()))) {
                                    break;
                                }
                                list3 = list9;
                                localDate = localDate2;
                                dateTime = dateTime2;
                            }
                            mp.l lVar2 = (mp.l) next;
                            dF = lVar2 != null ? lVar2.getValue() : null;
                            if (dF != null) {
                                dH2 = u0.h(d15, dF);
                            } else {
                                dH2 = null;
                            }
                            arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt));
                            it10 = it16;
                            list3 = list9;
                            dateTime = dateTime2;
                        } else {
                            list9 = list3;
                            dateTime2 = dateTime;
                        }
                        if (dF != null) {
                            dH2 = u0.h(d15, dF);
                        } else {
                            dH2 = null;
                        }
                        arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt));
                        it10 = it16;
                        list3 = list9;
                        dateTime = dateTime2;
                    }
                    List list11 = list3;
                    DateTime dateTime4 = dateTime;
                    if (arrayList3.isEmpty()) {
                        d26 = d15;
                        break;
                    }
                    it11 = arrayList3.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            d26 = d15;
                            break;
                            break;
                        }
                        cVar2 = (yp.c) it11.next();
                        d26 = d15;
                        if (s.c(cVar2.f198606a, d14) && cVar2.f198606a != null) {
                            linkedHashMap2.put(entry.getKey(), arrayList3);
                            break;
                        }
                        d15 = d26;
                        d14 = 0.0d;
                    }
                    iterableN0 = iterable;
                    d15 = d26;
                    list3 = list11;
                    dateTime = dateTime4;
                    d14 = 0.0d;
                }
                Iterable iterable2 = iterableN0;
                list6 = list3;
                DateTime dateTime5 = dateTime;
                d16 = d15;
                if (linkedHashMap2.isEmpty()) {
                    bVar = null;
                } else {
                    bVar = new yp.b(i53.a.g(linkedHashMap2));
                }
                if (list4 == null) {
                    list7 = j0.f134944a;
                } else {
                    list7 = list4;
                }
                if (list6 == null) {
                    list8 = j0.f134944a;
                } else {
                    list8 = list6;
                }
                i14 = xp.a.C3570a.f191827a[kVar.ordinal()];
                if (i14 != 1) {
                    arrayListD = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_WON, mp.h.SUM);
                    if (arrayListD != null) {
                        it5 = arrayListD.iterator();
                        dDoubleValue = 0.0d;
                        while (it5.hasNext()) {
                            dDoubleValue += ((Number) it5.next()).doubleValue();
                        }
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    arrayListD2 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_NOT_WON, mp.h.SUM);
                    if (arrayListD2 != null) {
                        it4 = arrayListD2.iterator();
                        dDoubleValue2 = 0.0d;
                        while (it4.hasNext()) {
                            dDoubleValue2 = ((Number) it4.next()).doubleValue() + dDoubleValue2;
                        }
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    d17 = dDoubleValue2 + dDoubleValue;
                    if (d17 > 0.0d) {
                        dValueOf = Double.valueOf((dDoubleValue / d17) * ((double) 100));
                    } else {
                        dValueOf = null;
                    }
                    arrayListD3 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                    if (arrayListD3 != null || arrayListD3.isEmpty()) {
                        dValueOf2 = null;
                    } else {
                        Iterator it17 = arrayListD3.iterator();
                        double dDoubleValue13 = 0.0d;
                        while (it17.hasNext()) {
                            dDoubleValue13 += ((Number) it17.next()).doubleValue();
                        }
                        dValueOf2 = Double.valueOf(dDoubleValue13 / ((double) arrayListD3.size()));
                    }
                    arrayListD4 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                    if (arrayListD4 != null || arrayListD4.isEmpty()) {
                        dValueOf3 = null;
                    } else {
                        Iterator it18 = arrayListD4.iterator();
                        double dDoubleValue14 = 0.0d;
                        while (it18.hasNext()) {
                            dDoubleValue14 += ((Number) it18.next()).doubleValue();
                        }
                        dValueOf3 = Double.valueOf(dDoubleValue14 / ((double) arrayListD4.size()));
                    }
                    fVar = new yp.f(dValueOf, null, null, null, dValueOf2, null, dValueOf3, null, 174, null);
                } else if (i14 != 2) {
                    mp.i iVar = mp.i.SPLIT_SUMMARY_AVG_STRESS;
                    arrayListD5 = xp.a.d(list7, iVar, mp.h.SUM);
                    ArrayList arrayListD16 = xp.a.d(list7, iVar, mp.h.COUNT);
                    if (arrayListD5 != null || arrayListD5.isEmpty() || arrayListD16 == null || arrayListD16.isEmpty()) {
                        dValueOf4 = null;
                    } else {
                        Iterator it19 = arrayListD5.iterator();
                        double dDoubleValue15 = 0.0d;
                        while (it19.hasNext()) {
                            dDoubleValue15 += ((Number) it19.next()).doubleValue();
                        }
                        Iterator it20 = arrayListD16.iterator();
                        double dDoubleValue16 = 0.0d;
                        while (it20.hasNext()) {
                            dDoubleValue16 = ((Number) it20.next()).doubleValue() + dDoubleValue16;
                        }
                        dValueOf4 = Double.valueOf(dDoubleValue15 / dDoubleValue16);
                    }
                    arrayListD6 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                    if (arrayListD6 != null || arrayListD6.isEmpty()) {
                        dValueOf5 = null;
                    } else {
                        Iterator it21 = arrayListD6.iterator();
                        double dDoubleValue17 = 0.0d;
                        while (it21.hasNext()) {
                            dDoubleValue17 += ((Number) it21.next()).doubleValue();
                        }
                        dValueOf5 = Double.valueOf(dDoubleValue17 / ((double) arrayListD6.size()));
                    }
                    arrayListD7 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                    if (arrayListD7 != null || arrayListD7.isEmpty()) {
                        dValueOf6 = null;
                    } else {
                        Iterator it22 = arrayListD7.iterator();
                        double dDoubleValue18 = 0.0d;
                        while (it22.hasNext()) {
                            dDoubleValue18 += ((Number) it22.next()).doubleValue();
                        }
                        dValueOf6 = Double.valueOf(dDoubleValue18 / ((double) arrayListD7.size()));
                    }
                    fVar = new yp.f(dValueOf4, null, null, null, dValueOf5, null, dValueOf6, null, 174, null);
                } else if (i14 != 3) {
                    arrayList = new ArrayList(y.r(list7, 10));
                    for (n nVar2 : list7) {
                        List listC = w.c(nVar2);
                        mp.i iVar2 = mp.i.PACK_WEIGHT;
                        mp.h hVar2 = mp.h.COUNT;
                        arrayListD10 = xp.a.d(listC, iVar2, hVar2);
                        if (arrayListD10 != null) {
                            dValueOf9 = Double.valueOf(h0.P0(arrayListD10));
                        } else {
                            dValueOf9 = null;
                        }
                        List listC2 = w.c(nVar2);
                        mp.h hVar3 = mp.h.SUM;
                        arrayListD11 = xp.a.d(listC2, iVar2, hVar3);
                        if (arrayListD11 != null) {
                            dValueOf10 = Double.valueOf(h0.P0(arrayListD11));
                        } else {
                            dValueOf10 = null;
                        }
                        List listC3 = w.c(nVar2);
                        mp.i iVar3 = mp.i.SPLIT_SUMMARY_AVG_PACK_WEIGHT;
                        arrayListD12 = xp.a.d(listC3, iVar3, hVar2);
                        if (arrayListD12 != null) {
                            dValueOf11 = Double.valueOf(h0.P0(arrayListD12));
                        } else {
                            dValueOf11 = null;
                        }
                        arrayListD13 = xp.a.d(w.c(nVar2), iVar3, hVar3);
                        if (arrayListD13 != null) {
                            dValueOf12 = Double.valueOf(h0.P0(arrayListD13));
                        } else {
                            dValueOf12 = null;
                        }
                        if (dValueOf10 != null) {
                            dDoubleValue6 = dValueOf10.doubleValue();
                        } else {
                            dDoubleValue6 = 0.0d;
                        }
                        if (dValueOf12 != null) {
                            dDoubleValue7 = dValueOf12.doubleValue();
                        } else {
                            dDoubleValue7 = 0.0d;
                        }
                        double d35 = dDoubleValue6 + dDoubleValue7;
                        if (dValueOf9 != null) {
                            dDoubleValue8 = dValueOf9.doubleValue();
                        } else {
                            dDoubleValue8 = 0.0d;
                        }
                        if (dValueOf11 != null) {
                            dDoubleValue9 = dValueOf11.doubleValue();
                        } else {
                            dDoubleValue9 = 0.0d;
                        }
                        d19 = dDoubleValue8 + dDoubleValue9;
                        if (d19 < 1.0d) {
                            d19 = 1.0d;
                        }
                        arrayList.add(Double.valueOf(d35 / d19));
                    }
                    dN = h0.N(arrayList);
                    arrayListD8 = xp.a.d(list7, mp.i.DISTANCE, mp.h.SUM);
                    if (arrayListD8 != null) {
                        it7 = arrayListD8.iterator();
                        dDoubleValue5 = 0.0d;
                        while (it7.hasNext()) {
                            dDoubleValue5 = ((Number) it7.next()).doubleValue() + dDoubleValue5;
                        }
                        dValueOf7 = Double.valueOf(dDoubleValue5);
                    } else {
                        dValueOf7 = null;
                    }
                    arrayListD9 = xp.a.d(list7, mp.i.DURATION, mp.h.SUM);
                    if (arrayListD9 != null) {
                        it6 = arrayListD9.iterator();
                        dDoubleValue3 = 0.0d;
                        while (it6.hasNext()) {
                            dDoubleValue3 = ((Number) it6.next()).doubleValue() + dDoubleValue3;
                        }
                    } else {
                        dDoubleValue3 = 0.0d;
                    }
                    if (dValueOf7 != null || dDoubleValue3 <= 0.0d) {
                        dH = null;
                    } else {
                        dH = u0.h(dDoubleValue3, dValueOf7);
                    }
                    dValueOf8 = Double.valueOf(dN);
                    if (Double.isNaN(dN)) {
                        d18 = null;
                    } else {
                        d18 = dValueOf8;
                    }
                    mp.k kVar2 = mp.k.PACE;
                    if (dH != null) {
                        dDoubleValue4 = dH.doubleValue();
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    fVar = new yp.f(d18, null, Double.valueOf(dDoubleValue4), kVar2, null, null, null, null, 242, null);
                } else if (i14 != 4) {
                    arrayList2 = new ArrayList();
                    it8 = list7.iterator();
                    while (it8.hasNext()) {
                        linkedHashMap3 = ((n) it8.next()).f120045d;
                        if (linkedHashMap3 != null) {
                            map = (Map) linkedHashMap3.get(kVar.f120029b);
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            arrayList2.add(map);
                        }
                    }
                    it9 = arrayList2.iterator();
                    d24 = 0.0d;
                    while (it9.hasNext()) {
                        d25 = (Double) ((Map) it9.next()).get(mp.h.SUM.f119979a);
                        if (d25 != null) {
                            dDoubleValue10 = d25.doubleValue();
                        } else {
                            dDoubleValue10 = 0.0d;
                        }
                        d24 += dDoubleValue10;
                    }
                    double d36 = d24 / d16;
                    fVar = new yp.f(Double.valueOf(d36), null, null, null, Double.valueOf(d36 / 52.0d), null, Double.valueOf(d36 / 12.0d), null, 174, null);
                } else {
                    arrayListD14 = xp.a.d(list7, mp.i.BODY_BATTERY, mp.h.SUM);
                    if (arrayListD14 != null || arrayListD14.isEmpty()) {
                        dValueOf13 = null;
                    } else {
                        Iterator it23 = arrayListD14.iterator();
                        double dDoubleValue19 = 0.0d;
                        while (it23.hasNext()) {
                            dDoubleValue19 += ((Number) it23.next()).doubleValue();
                        }
                        dValueOf13 = Double.valueOf(dDoubleValue19);
                    }
                    arrayListD15 = xp.a.d(list8, mp.i.BODY_BATTERY, mp.h.SUM);
                    if (arrayListD15 != null || arrayListD15.isEmpty()) {
                        dValueOf14 = null;
                    } else {
                        Iterator it24 = arrayListD15.iterator();
                        double dDoubleValue20 = 0.0d;
                        while (it24.hasNext()) {
                            dDoubleValue20 = ((Number) it24.next()).doubleValue() + dDoubleValue20;
                        }
                        dValueOf14 = Double.valueOf(dDoubleValue20 / ((double) 52));
                    }
                    if (dValueOf13 != null) {
                        dValueOf15 = Double.valueOf(dValueOf13.doubleValue() / ((double) 12));
                    } else {
                        dValueOf15 = null;
                    }
                    fVar = new yp.f(dValueOf13, null, null, null, dValueOf14, null, dValueOf15, null, 174, null);
                }
                yp.f fVar2 = fVar;
                i53.f fVarJ = i53.a.j(iterable2);
                boolean zContains = x.k(x0.f4308n, x0.f4312o, x0.f4324r, x0.f4268a3).contains(x0Var2);
                String string3 = localDate3.toString("yyyy-MM-dd");
                string3.getClass();
                linkedHashMap.put(next2, new qp.c(x0Var2, bVar, fVar2, fVarJ, zContains, string3, zY, z14));
                list2 = list4;
                it = it3;
                list3 = list6;
                dateTime = dateTime5;
            } else {
                list4 = list2;
                it3 = it;
                d14 = 0.0d;
            }
            iterableN0 = j0.f134944a;
            LocalDate localDate4 = dateTime.toLocalDate();
            if (list4 == null) {
                list5 = j0.f134944a;
            } else {
                list5 = list4;
            }
            Map<mp.k, List<mp.l>> mapB2 = xp.a.b(list5, kVar);
            d15 = kVar.f120030c;
            linkedHashMap2 = new LinkedHashMap();
            while (r4.hasNext()) {
                j23.l lVarO2 = t.o(0, 12);
                Iterable iterable3 = iterableN0;
                arrayList3 = new ArrayList(y.r(lVarO2, 10));
                it10 = lVarO2.iterator();
                while (((j23.k) it10).f96801c) {
                    int iNextInt2 = ((p0) it10).nextInt();
                    Iterator<Integer> it110 = it10;
                    localDate = dateTime.withDayOfMonth(1).plusMonths(iNextInt2).toLocalDate();
                    localDatePlusMonths = localDate.plusMonths(1);
                    value = entry.getValue();
                    if (value != null) {
                        it12 = value.iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                list9 = list3;
                                dateTime2 = dateTime;
                                next = null;
                                break;
                            }
                            next = it12.next();
                            localDatePlusMonths.getClass();
                            list9 = list3;
                            localDate2 = localDate;
                            dateTime2 = dateTime;
                            if (j23.g.a.a(f0.I(localDate, jg.b.J(localDatePlusMonths)), new LocalDate(((mp.l) next).getCalendarDate()))) {
                                break;
                                break;
                            }
                            list3 = list9;
                            localDate = localDate2;
                            dateTime = dateTime2;
                        }
                        mp.l lVar3 = (mp.l) next;
                        if (lVar3 != null) {
                        }
                        if (dF != null) {
                            dH2 = u0.h(d15, dF);
                        } else {
                            dH2 = null;
                        }
                        arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt2));
                        it10 = it110;
                        list3 = list9;
                        dateTime = dateTime2;
                    } else {
                        list9 = list3;
                        dateTime2 = dateTime;
                    }
                    if (dF != null) {
                        dH2 = u0.h(d15, dF);
                    } else {
                        dH2 = null;
                    }
                    arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt2));
                    it10 = it110;
                    list3 = list9;
                    dateTime = dateTime2;
                }
                List list12 = list3;
                DateTime dateTime6 = dateTime;
                if (arrayList3.isEmpty()) {
                    d26 = d15;
                    break;
                    break;
                }
                it11 = arrayList3.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        d26 = d15;
                        break;
                        break;
                    }
                    cVar2 = (yp.c) it11.next();
                    d26 = d15;
                    if (s.c(cVar2.f198606a, d14)) {
                    }
                    d15 = d26;
                    d14 = 0.0d;
                }
                iterableN0 = iterable3;
                d15 = d26;
                list3 = list12;
                dateTime = dateTime6;
                d14 = 0.0d;
            }
            Iterable iterable4 = iterableN0;
            list6 = list3;
            DateTime dateTime7 = dateTime;
            d16 = d15;
            if (linkedHashMap2.isEmpty()) {
                bVar = null;
            } else {
                bVar = new yp.b(i53.a.g(linkedHashMap2));
            }
            if (list4 == null) {
                list7 = j0.f134944a;
            } else {
                list7 = list4;
            }
            if (list6 == null) {
                list8 = j0.f134944a;
            } else {
                list8 = list6;
            }
            i14 = xp.a.C3570a.f191827a[kVar.ordinal()];
            if (i14 != 1) {
                arrayListD = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_WON, mp.h.SUM);
                if (arrayListD != null) {
                    it5 = arrayListD.iterator();
                    dDoubleValue = 0.0d;
                    while (it5.hasNext()) {
                        dDoubleValue += ((Number) it5.next()).doubleValue();
                    }
                } else {
                    dDoubleValue = 0.0d;
                }
                arrayListD2 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_NOT_WON, mp.h.SUM);
                if (arrayListD2 != null) {
                    it4 = arrayListD2.iterator();
                    dDoubleValue2 = 0.0d;
                    while (it4.hasNext()) {
                        dDoubleValue2 = ((Number) it4.next()).doubleValue() + dDoubleValue2;
                    }
                } else {
                    dDoubleValue2 = 0.0d;
                }
                d17 = dDoubleValue2 + dDoubleValue;
                if (d17 > 0.0d) {
                    dValueOf = Double.valueOf((dDoubleValue / d17) * ((double) 100));
                } else {
                    dValueOf = null;
                }
                arrayListD3 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                if (arrayListD3 != null) {
                    dValueOf2 = null;
                } else {
                    dValueOf2 = null;
                }
                arrayListD4 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                if (arrayListD4 != null) {
                    dValueOf3 = null;
                } else {
                    dValueOf3 = null;
                }
                fVar = new yp.f(dValueOf, null, null, null, dValueOf2, null, dValueOf3, null, 174, null);
            } else if (i14 != 2) {
                mp.i iVar4 = mp.i.SPLIT_SUMMARY_AVG_STRESS;
                arrayListD5 = xp.a.d(list7, iVar4, mp.h.SUM);
                ArrayList arrayListD17 = xp.a.d(list7, iVar4, mp.h.COUNT);
                if (arrayListD5 != null) {
                    dValueOf4 = null;
                } else {
                    dValueOf4 = null;
                }
                arrayListD6 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                if (arrayListD6 != null) {
                    dValueOf5 = null;
                } else {
                    dValueOf5 = null;
                }
                arrayListD7 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                if (arrayListD7 != null) {
                    dValueOf6 = null;
                } else {
                    dValueOf6 = null;
                }
                fVar = new yp.f(dValueOf4, null, null, null, dValueOf5, null, dValueOf6, null, 174, null);
            } else if (i14 != 3) {
                arrayList = new ArrayList(y.r(list7, 10));
                while (r9.hasNext()) {
                    List listC4 = w.c(nVar2);
                    mp.i iVar5 = mp.i.PACK_WEIGHT;
                    mp.h hVar4 = mp.h.COUNT;
                    arrayListD10 = xp.a.d(listC4, iVar5, hVar4);
                    if (arrayListD10 != null) {
                        dValueOf9 = Double.valueOf(h0.P0(arrayListD10));
                    } else {
                        dValueOf9 = null;
                    }
                    List listC5 = w.c(nVar2);
                    mp.h hVar5 = mp.h.SUM;
                    arrayListD11 = xp.a.d(listC5, iVar5, hVar5);
                    if (arrayListD11 != null) {
                        dValueOf10 = Double.valueOf(h0.P0(arrayListD11));
                    } else {
                        dValueOf10 = null;
                    }
                    List listC6 = w.c(nVar2);
                    mp.i iVar6 = mp.i.SPLIT_SUMMARY_AVG_PACK_WEIGHT;
                    arrayListD12 = xp.a.d(listC6, iVar6, hVar4);
                    if (arrayListD12 != null) {
                        dValueOf11 = Double.valueOf(h0.P0(arrayListD12));
                    } else {
                        dValueOf11 = null;
                    }
                    arrayListD13 = xp.a.d(w.c(nVar2), iVar6, hVar5);
                    if (arrayListD13 != null) {
                        dValueOf12 = Double.valueOf(h0.P0(arrayListD13));
                    } else {
                        dValueOf12 = null;
                    }
                    if (dValueOf10 != null) {
                        dDoubleValue6 = dValueOf10.doubleValue();
                    } else {
                        dDoubleValue6 = 0.0d;
                    }
                    if (dValueOf12 != null) {
                        dDoubleValue7 = dValueOf12.doubleValue();
                    } else {
                        dDoubleValue7 = 0.0d;
                    }
                    double d37 = dDoubleValue6 + dDoubleValue7;
                    if (dValueOf9 != null) {
                        dDoubleValue8 = dValueOf9.doubleValue();
                    } else {
                        dDoubleValue8 = 0.0d;
                    }
                    if (dValueOf11 != null) {
                        dDoubleValue9 = dValueOf11.doubleValue();
                    } else {
                        dDoubleValue9 = 0.0d;
                    }
                    d19 = dDoubleValue8 + dDoubleValue9;
                    if (d19 < 1.0d) {
                        d19 = 1.0d;
                    }
                    arrayList.add(Double.valueOf(d37 / d19));
                }
                dN = h0.N(arrayList);
                arrayListD8 = xp.a.d(list7, mp.i.DISTANCE, mp.h.SUM);
                if (arrayListD8 != null) {
                    it7 = arrayListD8.iterator();
                    dDoubleValue5 = 0.0d;
                    while (it7.hasNext()) {
                        dDoubleValue5 = ((Number) it7.next()).doubleValue() + dDoubleValue5;
                    }
                    dValueOf7 = Double.valueOf(dDoubleValue5);
                } else {
                    dValueOf7 = null;
                }
                arrayListD9 = xp.a.d(list7, mp.i.DURATION, mp.h.SUM);
                if (arrayListD9 != null) {
                    it6 = arrayListD9.iterator();
                    dDoubleValue3 = 0.0d;
                    while (it6.hasNext()) {
                        dDoubleValue3 = ((Number) it6.next()).doubleValue() + dDoubleValue3;
                    }
                } else {
                    dDoubleValue3 = 0.0d;
                }
                if (dValueOf7 != null) {
                    dH = null;
                } else {
                    dH = null;
                }
                dValueOf8 = Double.valueOf(dN);
                if (Double.isNaN(dN)) {
                    d18 = dValueOf8;
                } else {
                    d18 = null;
                }
                mp.k kVar3 = mp.k.PACE;
                if (dH != null) {
                    dDoubleValue4 = dH.doubleValue();
                } else {
                    dDoubleValue4 = 0.0d;
                }
                fVar = new yp.f(d18, null, Double.valueOf(dDoubleValue4), kVar3, null, null, null, null, 242, null);
            } else if (i14 != 4) {
                arrayList2 = new ArrayList();
                it8 = list7.iterator();
                while (it8.hasNext()) {
                    linkedHashMap3 = ((n) it8.next()).f120045d;
                    if (linkedHashMap3 != null) {
                        map = (Map) linkedHashMap3.get(kVar.f120029b);
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        arrayList2.add(map);
                    }
                }
                it9 = arrayList2.iterator();
                d24 = 0.0d;
                while (it9.hasNext()) {
                    d25 = (Double) ((Map) it9.next()).get(mp.h.SUM.f119979a);
                    if (d25 != null) {
                        dDoubleValue10 = d25.doubleValue();
                    } else {
                        dDoubleValue10 = 0.0d;
                    }
                    d24 += dDoubleValue10;
                }
                double d38 = d24 / d16;
                fVar = new yp.f(Double.valueOf(d38), null, null, null, Double.valueOf(d38 / 52.0d), null, Double.valueOf(d38 / 12.0d), null, 174, null);
            } else {
                arrayListD14 = xp.a.d(list7, mp.i.BODY_BATTERY, mp.h.SUM);
                if (arrayListD14 != null) {
                    dValueOf13 = null;
                } else {
                    dValueOf13 = null;
                }
                arrayListD15 = xp.a.d(list8, mp.i.BODY_BATTERY, mp.h.SUM);
                if (arrayListD15 != null) {
                    dValueOf14 = null;
                } else {
                    dValueOf14 = null;
                }
                if (dValueOf13 != null) {
                    dValueOf15 = Double.valueOf(dValueOf13.doubleValue() / ((double) 12));
                } else {
                    dValueOf15 = null;
                }
                fVar = new yp.f(dValueOf13, null, null, null, dValueOf14, null, dValueOf15, null, 174, null);
            }
            yp.f fVar3 = fVar;
            i53.f fVarJ2 = i53.a.j(iterable4);
            boolean zContains2 = x.k(x0.f4308n, x0.f4312o, x0.f4324r, x0.f4268a3).contains(x0Var2);
            String string4 = localDate4.toString("yyyy-MM-dd");
            string4.getClass();
            linkedHashMap.put(next2, new qp.c(x0Var2, bVar, fVar3, fVarJ2, zContains2, string4, zY, z14));
            list2 = list4;
            it = it3;
            list3 = list6;
            dateTime = dateTime7;
        }
        return i53.a.k(linkedHashMap);
        m mVar3 = (m) objB;
        List list13 = (List) mVar3.f73770c;
        if (list13 != null) {
            Iterator it25 = list13.iterator();
            while (it25.hasNext()) {
                ((n) it25.next()).d();
            }
        }
        str2.getClass();
        string.getClass();
        eVar.f114087a = x0Var2;
        eVar.f114088b = null;
        eVar.f114089c = dateTime;
        eVar.f114090d = null;
        eVar.f114091e = null;
        eVar.f114092f = mVar3;
        eVar.f114095i = 2;
        objA = aVar3.a(str2, string, str, eVar);
        if (objA != aVar2) {
            mVar = mVar3;
            m mVar4 = (m) objA;
            list = (List) mVar4.f73770c;
            if (list != null) {
                it14 = list.iterator();
                while (it14.hasNext()) {
                    ((n) it14.next()).d();
                }
            }
            dateTime.getClass();
            list2 = (List) mVar4.f73770c;
            list3 = (List) mVar.f73770c;
            f12.l lVar4 = this.f114097b;
            zY = lVar4.y();
            z14 = !lVar4.c();
            x0Var2.getClass();
            w13.c cVar4 = mp.k.C;
            iA = t0.a(y.r(cVar4, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            it = cVar4.iterator();
            while (it.hasNext()) {
                Object next3 = it.next();
                kVar = (mp.k) next3;
                if (list2 != null) {
                    d14 = 0.0d;
                    arrayList4 = new ArrayList();
                    while (r14.hasNext()) {
                        DateTime dateTimeAtStartOfDay3 = new LocalDate(nVar.getDate()).toDateTimeAtStartOfDay();
                        linkedHashMap4 = nVar.f120045d;
                        if (linkedHashMap4 != null) {
                            map2 = (Map) linkedHashMap4.get(kVar.f120029b);
                        } else {
                            map2 = null;
                        }
                        if (map2 != null) {
                            list10 = list2;
                            it13 = it;
                            eVar2 = null;
                            break;
                        }
                        list10 = list2;
                        it13 = it;
                        eVar2 = null;
                        break;
                        if (eVar2 != null) {
                            arrayList4.add(eVar2);
                        }
                        list2 = list10;
                        it = it13;
                    }
                    list4 = list2;
                    it3 = it;
                    iterableN0 = h0.N0(arrayList4, new xp.c());
                    if (iterableN0 == null) {
                    }
                    LocalDate localDate5 = dateTime.toLocalDate();
                    if (list4 == null) {
                        list5 = j0.f134944a;
                    } else {
                        list5 = list4;
                    }
                    Map<mp.k, List<mp.l>> mapB3 = xp.a.b(list5, kVar);
                    d15 = kVar.f120030c;
                    linkedHashMap2 = new LinkedHashMap();
                    while (r4.hasNext()) {
                        j23.l lVarO3 = t.o(0, 12);
                        Iterable iterable5 = iterableN0;
                        arrayList3 = new ArrayList(y.r(lVarO3, 10));
                        it10 = lVarO3.iterator();
                        while (((j23.k) it10).f96801c) {
                            int iNextInt3 = ((p0) it10).nextInt();
                            Iterator<Integer> it111 = it10;
                            localDate = dateTime.withDayOfMonth(1).plusMonths(iNextInt3).toLocalDate();
                            localDatePlusMonths = localDate.plusMonths(1);
                            value = entry.getValue();
                            if (value != null) {
                                it12 = value.iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        list9 = list3;
                                        dateTime2 = dateTime;
                                        next = null;
                                        break;
                                    }
                                    next = it12.next();
                                    localDatePlusMonths.getClass();
                                    list9 = list3;
                                    localDate2 = localDate;
                                    dateTime2 = dateTime;
                                    if (j23.g.a.a(f0.I(localDate, jg.b.J(localDatePlusMonths)), new LocalDate(((mp.l) next).getCalendarDate()))) {
                                        break;
                                        break;
                                    }
                                    list3 = list9;
                                    localDate = localDate2;
                                    dateTime = dateTime2;
                                }
                                mp.l lVar5 = (mp.l) next;
                                if (lVar5 != null) {
                                }
                                if (dF != null) {
                                    dH2 = u0.h(d15, dF);
                                } else {
                                    dH2 = null;
                                }
                                arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt3));
                                it10 = it111;
                                list3 = list9;
                                dateTime = dateTime2;
                            } else {
                                list9 = list3;
                                dateTime2 = dateTime;
                            }
                            if (dF != null) {
                                dH2 = u0.h(d15, dF);
                            } else {
                                dH2 = null;
                            }
                            arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt3));
                            it10 = it111;
                            list3 = list9;
                            dateTime = dateTime2;
                        }
                        List list14 = list3;
                        DateTime dateTime8 = dateTime;
                        if (arrayList3.isEmpty()) {
                            d26 = d15;
                            break;
                            break;
                        }
                        it11 = arrayList3.iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                d26 = d15;
                                break;
                                break;
                            }
                            cVar2 = (yp.c) it11.next();
                            d26 = d15;
                            if (s.c(cVar2.f198606a, d14)) {
                            }
                            d15 = d26;
                            d14 = 0.0d;
                        }
                        iterableN0 = iterable5;
                        d15 = d26;
                        list3 = list14;
                        dateTime = dateTime8;
                        d14 = 0.0d;
                    }
                    Iterable iterable6 = iterableN0;
                    list6 = list3;
                    DateTime dateTime9 = dateTime;
                    d16 = d15;
                    if (linkedHashMap2.isEmpty()) {
                        bVar = null;
                    } else {
                        bVar = new yp.b(i53.a.g(linkedHashMap2));
                    }
                    if (list4 == null) {
                        list7 = j0.f134944a;
                    } else {
                        list7 = list4;
                    }
                    if (list6 == null) {
                        list8 = j0.f134944a;
                    } else {
                        list8 = list6;
                    }
                    i14 = xp.a.C3570a.f191827a[kVar.ordinal()];
                    if (i14 != 1) {
                        arrayListD = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_WON, mp.h.SUM);
                        if (arrayListD != null) {
                            it5 = arrayListD.iterator();
                            dDoubleValue = 0.0d;
                            while (it5.hasNext()) {
                                dDoubleValue += ((Number) it5.next()).doubleValue();
                            }
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        arrayListD2 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_NOT_WON, mp.h.SUM);
                        if (arrayListD2 != null) {
                            it4 = arrayListD2.iterator();
                            dDoubleValue2 = 0.0d;
                            while (it4.hasNext()) {
                                dDoubleValue2 = ((Number) it4.next()).doubleValue() + dDoubleValue2;
                            }
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                        d17 = dDoubleValue2 + dDoubleValue;
                        if (d17 > 0.0d) {
                            dValueOf = Double.valueOf((dDoubleValue / d17) * ((double) 100));
                        } else {
                            dValueOf = null;
                        }
                        arrayListD3 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                        if (arrayListD3 != null) {
                            dValueOf2 = null;
                        } else {
                            dValueOf2 = null;
                        }
                        arrayListD4 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                        if (arrayListD4 != null) {
                            dValueOf3 = null;
                        } else {
                            dValueOf3 = null;
                        }
                        fVar = new yp.f(dValueOf, null, null, null, dValueOf2, null, dValueOf3, null, 174, null);
                    } else if (i14 != 2) {
                        mp.i iVar7 = mp.i.SPLIT_SUMMARY_AVG_STRESS;
                        arrayListD5 = xp.a.d(list7, iVar7, mp.h.SUM);
                        ArrayList arrayListD18 = xp.a.d(list7, iVar7, mp.h.COUNT);
                        if (arrayListD5 != null) {
                            dValueOf4 = null;
                        } else {
                            dValueOf4 = null;
                        }
                        arrayListD6 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                        if (arrayListD6 != null) {
                            dValueOf5 = null;
                        } else {
                            dValueOf5 = null;
                        }
                        arrayListD7 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                        if (arrayListD7 != null) {
                            dValueOf6 = null;
                        } else {
                            dValueOf6 = null;
                        }
                        fVar = new yp.f(dValueOf4, null, null, null, dValueOf5, null, dValueOf6, null, 174, null);
                    } else if (i14 != 3) {
                        arrayList = new ArrayList(y.r(list7, 10));
                        while (r9.hasNext()) {
                            List listC7 = w.c(nVar2);
                            mp.i iVar8 = mp.i.PACK_WEIGHT;
                            mp.h hVar6 = mp.h.COUNT;
                            arrayListD10 = xp.a.d(listC7, iVar8, hVar6);
                            if (arrayListD10 != null) {
                                dValueOf9 = Double.valueOf(h0.P0(arrayListD10));
                            } else {
                                dValueOf9 = null;
                            }
                            List listC8 = w.c(nVar2);
                            mp.h hVar7 = mp.h.SUM;
                            arrayListD11 = xp.a.d(listC8, iVar8, hVar7);
                            if (arrayListD11 != null) {
                                dValueOf10 = Double.valueOf(h0.P0(arrayListD11));
                            } else {
                                dValueOf10 = null;
                            }
                            List listC9 = w.c(nVar2);
                            mp.i iVar9 = mp.i.SPLIT_SUMMARY_AVG_PACK_WEIGHT;
                            arrayListD12 = xp.a.d(listC9, iVar9, hVar6);
                            if (arrayListD12 != null) {
                                dValueOf11 = Double.valueOf(h0.P0(arrayListD12));
                            } else {
                                dValueOf11 = null;
                            }
                            arrayListD13 = xp.a.d(w.c(nVar2), iVar9, hVar7);
                            if (arrayListD13 != null) {
                                dValueOf12 = Double.valueOf(h0.P0(arrayListD13));
                            } else {
                                dValueOf12 = null;
                            }
                            if (dValueOf10 != null) {
                                dDoubleValue6 = dValueOf10.doubleValue();
                            } else {
                                dDoubleValue6 = 0.0d;
                            }
                            if (dValueOf12 != null) {
                                dDoubleValue7 = dValueOf12.doubleValue();
                            } else {
                                dDoubleValue7 = 0.0d;
                            }
                            double d39 = dDoubleValue6 + dDoubleValue7;
                            if (dValueOf9 != null) {
                                dDoubleValue8 = dValueOf9.doubleValue();
                            } else {
                                dDoubleValue8 = 0.0d;
                            }
                            if (dValueOf11 != null) {
                                dDoubleValue9 = dValueOf11.doubleValue();
                            } else {
                                dDoubleValue9 = 0.0d;
                            }
                            d19 = dDoubleValue8 + dDoubleValue9;
                            if (d19 < 1.0d) {
                                d19 = 1.0d;
                            }
                            arrayList.add(Double.valueOf(d39 / d19));
                        }
                        dN = h0.N(arrayList);
                        arrayListD8 = xp.a.d(list7, mp.i.DISTANCE, mp.h.SUM);
                        if (arrayListD8 != null) {
                            it7 = arrayListD8.iterator();
                            dDoubleValue5 = 0.0d;
                            while (it7.hasNext()) {
                                dDoubleValue5 = ((Number) it7.next()).doubleValue() + dDoubleValue5;
                            }
                            dValueOf7 = Double.valueOf(dDoubleValue5);
                        } else {
                            dValueOf7 = null;
                        }
                        arrayListD9 = xp.a.d(list7, mp.i.DURATION, mp.h.SUM);
                        if (arrayListD9 != null) {
                            it6 = arrayListD9.iterator();
                            dDoubleValue3 = 0.0d;
                            while (it6.hasNext()) {
                                dDoubleValue3 = ((Number) it6.next()).doubleValue() + dDoubleValue3;
                            }
                        } else {
                            dDoubleValue3 = 0.0d;
                        }
                        if (dValueOf7 != null) {
                            dH = null;
                        } else {
                            dH = null;
                        }
                        dValueOf8 = Double.valueOf(dN);
                        if (Double.isNaN(dN)) {
                            d18 = dValueOf8;
                        } else {
                            d18 = null;
                        }
                        mp.k kVar4 = mp.k.PACE;
                        if (dH != null) {
                            dDoubleValue4 = dH.doubleValue();
                        } else {
                            dDoubleValue4 = 0.0d;
                        }
                        fVar = new yp.f(d18, null, Double.valueOf(dDoubleValue4), kVar4, null, null, null, null, 242, null);
                    } else if (i14 != 4) {
                        arrayList2 = new ArrayList();
                        it8 = list7.iterator();
                        while (it8.hasNext()) {
                            linkedHashMap3 = ((n) it8.next()).f120045d;
                            if (linkedHashMap3 != null) {
                                map = (Map) linkedHashMap3.get(kVar.f120029b);
                            } else {
                                map = null;
                            }
                            if (map != null) {
                                arrayList2.add(map);
                            }
                        }
                        it9 = arrayList2.iterator();
                        d24 = 0.0d;
                        while (it9.hasNext()) {
                            d25 = (Double) ((Map) it9.next()).get(mp.h.SUM.f119979a);
                            if (d25 != null) {
                                dDoubleValue10 = d25.doubleValue();
                            } else {
                                dDoubleValue10 = 0.0d;
                            }
                            d24 += dDoubleValue10;
                        }
                        double d310 = d24 / d16;
                        fVar = new yp.f(Double.valueOf(d310), null, null, null, Double.valueOf(d310 / 52.0d), null, Double.valueOf(d310 / 12.0d), null, 174, null);
                    } else {
                        arrayListD14 = xp.a.d(list7, mp.i.BODY_BATTERY, mp.h.SUM);
                        if (arrayListD14 != null) {
                            dValueOf13 = null;
                        } else {
                            dValueOf13 = null;
                        }
                        arrayListD15 = xp.a.d(list8, mp.i.BODY_BATTERY, mp.h.SUM);
                        if (arrayListD15 != null) {
                            dValueOf14 = null;
                        } else {
                            dValueOf14 = null;
                        }
                        if (dValueOf13 != null) {
                            dValueOf15 = Double.valueOf(dValueOf13.doubleValue() / ((double) 12));
                        } else {
                            dValueOf15 = null;
                        }
                        fVar = new yp.f(dValueOf13, null, null, null, dValueOf14, null, dValueOf15, null, 174, null);
                    }
                    yp.f fVar4 = fVar;
                    i53.f fVarJ3 = i53.a.j(iterable6);
                    boolean zContains3 = x.k(x0.f4308n, x0.f4312o, x0.f4324r, x0.f4268a3).contains(x0Var2);
                    String string5 = localDate5.toString("yyyy-MM-dd");
                    string5.getClass();
                    linkedHashMap.put(next3, new qp.c(x0Var2, bVar, fVar4, fVarJ3, zContains3, string5, zY, z14));
                    list2 = list4;
                    it = it3;
                    list3 = list6;
                    dateTime = dateTime9;
                } else {
                    list4 = list2;
                    it3 = it;
                    d14 = 0.0d;
                }
                iterableN0 = j0.f134944a;
                LocalDate localDate6 = dateTime.toLocalDate();
                if (list4 == null) {
                    list5 = j0.f134944a;
                } else {
                    list5 = list4;
                }
                Map<mp.k, List<mp.l>> mapB4 = xp.a.b(list5, kVar);
                d15 = kVar.f120030c;
                linkedHashMap2 = new LinkedHashMap();
                while (r4.hasNext()) {
                    j23.l lVarO4 = t.o(0, 12);
                    Iterable iterable7 = iterableN0;
                    arrayList3 = new ArrayList(y.r(lVarO4, 10));
                    it10 = lVarO4.iterator();
                    while (((j23.k) it10).f96801c) {
                        int iNextInt4 = ((p0) it10).nextInt();
                        Iterator<Integer> it112 = it10;
                        localDate = dateTime.withDayOfMonth(1).plusMonths(iNextInt4).toLocalDate();
                        localDatePlusMonths = localDate.plusMonths(1);
                        value = entry.getValue();
                        if (value != null) {
                            it12 = value.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    list9 = list3;
                                    dateTime2 = dateTime;
                                    next = null;
                                    break;
                                }
                                next = it12.next();
                                localDatePlusMonths.getClass();
                                list9 = list3;
                                localDate2 = localDate;
                                dateTime2 = dateTime;
                                if (j23.g.a.a(f0.I(localDate, jg.b.J(localDatePlusMonths)), new LocalDate(((mp.l) next).getCalendarDate()))) {
                                    break;
                                    break;
                                }
                                list3 = list9;
                                localDate = localDate2;
                                dateTime = dateTime2;
                            }
                            mp.l lVar6 = (mp.l) next;
                            if (lVar6 != null) {
                            }
                            if (dF != null) {
                                dH2 = u0.h(d15, dF);
                            } else {
                                dH2 = null;
                            }
                            arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt4));
                            it10 = it112;
                            list3 = list9;
                            dateTime = dateTime2;
                        } else {
                            list9 = list3;
                            dateTime2 = dateTime;
                        }
                        if (dF != null) {
                            dH2 = u0.h(d15, dF);
                        } else {
                            dH2 = null;
                        }
                        arrayList3.add(new yp.c(xp.a.a(dH2, kVar), iNextInt4));
                        it10 = it112;
                        list3 = list9;
                        dateTime = dateTime2;
                    }
                    List list15 = list3;
                    DateTime dateTime10 = dateTime;
                    if (arrayList3.isEmpty()) {
                        d26 = d15;
                        break;
                        break;
                    }
                    it11 = arrayList3.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            d26 = d15;
                            break;
                            break;
                        }
                        cVar2 = (yp.c) it11.next();
                        d26 = d15;
                        if (s.c(cVar2.f198606a, d14)) {
                        }
                        d15 = d26;
                        d14 = 0.0d;
                    }
                    iterableN0 = iterable7;
                    d15 = d26;
                    list3 = list15;
                    dateTime = dateTime10;
                    d14 = 0.0d;
                }
                Iterable iterable8 = iterableN0;
                list6 = list3;
                DateTime dateTime11 = dateTime;
                d16 = d15;
                if (linkedHashMap2.isEmpty()) {
                    bVar = null;
                } else {
                    bVar = new yp.b(i53.a.g(linkedHashMap2));
                }
                if (list4 == null) {
                    list7 = j0.f134944a;
                } else {
                    list7 = list4;
                }
                if (list6 == null) {
                    list8 = j0.f134944a;
                } else {
                    list8 = list6;
                }
                i14 = xp.a.C3570a.f191827a[kVar.ordinal()];
                if (i14 != 1) {
                    arrayListD = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_WON, mp.h.SUM);
                    if (arrayListD != null) {
                        it5 = arrayListD.iterator();
                        dDoubleValue = 0.0d;
                        while (it5.hasNext()) {
                            dDoubleValue += ((Number) it5.next()).doubleValue();
                        }
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    arrayListD2 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_NOT_WON, mp.h.SUM);
                    if (arrayListD2 != null) {
                        it4 = arrayListD2.iterator();
                        dDoubleValue2 = 0.0d;
                        while (it4.hasNext()) {
                            dDoubleValue2 = ((Number) it4.next()).doubleValue() + dDoubleValue2;
                        }
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    d17 = dDoubleValue2 + dDoubleValue;
                    if (d17 > 0.0d) {
                        dValueOf = Double.valueOf((dDoubleValue / d17) * ((double) 100));
                    } else {
                        dValueOf = null;
                    }
                    arrayListD3 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                    if (arrayListD3 != null) {
                        dValueOf2 = null;
                    } else {
                        dValueOf2 = null;
                    }
                    arrayListD4 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_GAMES_AVG_WON, mp.h.AVG);
                    if (arrayListD4 != null) {
                        dValueOf3 = null;
                    } else {
                        dValueOf3 = null;
                    }
                    fVar = new yp.f(dValueOf, null, null, null, dValueOf2, null, dValueOf3, null, 174, null);
                } else if (i14 != 2) {
                    mp.i iVar10 = mp.i.SPLIT_SUMMARY_AVG_STRESS;
                    arrayListD5 = xp.a.d(list7, iVar10, mp.h.SUM);
                    ArrayList arrayListD19 = xp.a.d(list7, iVar10, mp.h.COUNT);
                    if (arrayListD5 != null) {
                        dValueOf4 = null;
                    } else {
                        dValueOf4 = null;
                    }
                    arrayListD6 = xp.a.d(list8, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                    if (arrayListD6 != null) {
                        dValueOf5 = null;
                    } else {
                        dValueOf5 = null;
                    }
                    arrayListD7 = xp.a.d(list7, mp.i.SPLIT_SUMMARY_AVG_STRESS, mp.h.AVG);
                    if (arrayListD7 != null) {
                        dValueOf6 = null;
                    } else {
                        dValueOf6 = null;
                    }
                    fVar = new yp.f(dValueOf4, null, null, null, dValueOf5, null, dValueOf6, null, 174, null);
                } else if (i14 != 3) {
                    arrayList = new ArrayList(y.r(list7, 10));
                    while (r9.hasNext()) {
                        List listC10 = w.c(nVar2);
                        mp.i iVar11 = mp.i.PACK_WEIGHT;
                        mp.h hVar8 = mp.h.COUNT;
                        arrayListD10 = xp.a.d(listC10, iVar11, hVar8);
                        if (arrayListD10 != null) {
                            dValueOf9 = Double.valueOf(h0.P0(arrayListD10));
                        } else {
                            dValueOf9 = null;
                        }
                        List listC11 = w.c(nVar2);
                        mp.h hVar9 = mp.h.SUM;
                        arrayListD11 = xp.a.d(listC11, iVar11, hVar9);
                        if (arrayListD11 != null) {
                            dValueOf10 = Double.valueOf(h0.P0(arrayListD11));
                        } else {
                            dValueOf10 = null;
                        }
                        List listC12 = w.c(nVar2);
                        mp.i iVar12 = mp.i.SPLIT_SUMMARY_AVG_PACK_WEIGHT;
                        arrayListD12 = xp.a.d(listC12, iVar12, hVar8);
                        if (arrayListD12 != null) {
                            dValueOf11 = Double.valueOf(h0.P0(arrayListD12));
                        } else {
                            dValueOf11 = null;
                        }
                        arrayListD13 = xp.a.d(w.c(nVar2), iVar12, hVar9);
                        if (arrayListD13 != null) {
                            dValueOf12 = Double.valueOf(h0.P0(arrayListD13));
                        } else {
                            dValueOf12 = null;
                        }
                        if (dValueOf10 != null) {
                            dDoubleValue6 = dValueOf10.doubleValue();
                        } else {
                            dDoubleValue6 = 0.0d;
                        }
                        if (dValueOf12 != null) {
                            dDoubleValue7 = dValueOf12.doubleValue();
                        } else {
                            dDoubleValue7 = 0.0d;
                        }
                        double d311 = dDoubleValue6 + dDoubleValue7;
                        if (dValueOf9 != null) {
                            dDoubleValue8 = dValueOf9.doubleValue();
                        } else {
                            dDoubleValue8 = 0.0d;
                        }
                        if (dValueOf11 != null) {
                            dDoubleValue9 = dValueOf11.doubleValue();
                        } else {
                            dDoubleValue9 = 0.0d;
                        }
                        d19 = dDoubleValue8 + dDoubleValue9;
                        if (d19 < 1.0d) {
                            d19 = 1.0d;
                        }
                        arrayList.add(Double.valueOf(d311 / d19));
                    }
                    dN = h0.N(arrayList);
                    arrayListD8 = xp.a.d(list7, mp.i.DISTANCE, mp.h.SUM);
                    if (arrayListD8 != null) {
                        it7 = arrayListD8.iterator();
                        dDoubleValue5 = 0.0d;
                        while (it7.hasNext()) {
                            dDoubleValue5 = ((Number) it7.next()).doubleValue() + dDoubleValue5;
                        }
                        dValueOf7 = Double.valueOf(dDoubleValue5);
                    } else {
                        dValueOf7 = null;
                    }
                    arrayListD9 = xp.a.d(list7, mp.i.DURATION, mp.h.SUM);
                    if (arrayListD9 != null) {
                        it6 = arrayListD9.iterator();
                        dDoubleValue3 = 0.0d;
                        while (it6.hasNext()) {
                            dDoubleValue3 = ((Number) it6.next()).doubleValue() + dDoubleValue3;
                        }
                    } else {
                        dDoubleValue3 = 0.0d;
                    }
                    if (dValueOf7 != null) {
                        dH = null;
                    } else {
                        dH = null;
                    }
                    dValueOf8 = Double.valueOf(dN);
                    if (Double.isNaN(dN)) {
                        d18 = dValueOf8;
                    } else {
                        d18 = null;
                    }
                    mp.k kVar5 = mp.k.PACE;
                    if (dH != null) {
                        dDoubleValue4 = dH.doubleValue();
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    fVar = new yp.f(d18, null, Double.valueOf(dDoubleValue4), kVar5, null, null, null, null, 242, null);
                } else if (i14 != 4) {
                    arrayList2 = new ArrayList();
                    it8 = list7.iterator();
                    while (it8.hasNext()) {
                        linkedHashMap3 = ((n) it8.next()).f120045d;
                        if (linkedHashMap3 != null) {
                            map = (Map) linkedHashMap3.get(kVar.f120029b);
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            arrayList2.add(map);
                        }
                    }
                    it9 = arrayList2.iterator();
                    d24 = 0.0d;
                    while (it9.hasNext()) {
                        d25 = (Double) ((Map) it9.next()).get(mp.h.SUM.f119979a);
                        if (d25 != null) {
                            dDoubleValue10 = d25.doubleValue();
                        } else {
                            dDoubleValue10 = 0.0d;
                        }
                        d24 += dDoubleValue10;
                    }
                    double d312 = d24 / d16;
                    fVar = new yp.f(Double.valueOf(d312), null, null, null, Double.valueOf(d312 / 52.0d), null, Double.valueOf(d312 / 12.0d), null, 174, null);
                } else {
                    arrayListD14 = xp.a.d(list7, mp.i.BODY_BATTERY, mp.h.SUM);
                    if (arrayListD14 != null) {
                        dValueOf13 = null;
                    } else {
                        dValueOf13 = null;
                    }
                    arrayListD15 = xp.a.d(list8, mp.i.BODY_BATTERY, mp.h.SUM);
                    if (arrayListD15 != null) {
                        dValueOf14 = null;
                    } else {
                        dValueOf14 = null;
                    }
                    if (dValueOf13 != null) {
                        dValueOf15 = Double.valueOf(dValueOf13.doubleValue() / ((double) 12));
                    } else {
                        dValueOf15 = null;
                    }
                    fVar = new yp.f(dValueOf13, null, null, null, dValueOf14, null, dValueOf15, null, 174, null);
                }
                yp.f fVar5 = fVar;
                i53.f fVarJ4 = i53.a.j(iterable8);
                boolean zContains4 = x.k(x0.f4308n, x0.f4312o, x0.f4324r, x0.f4268a3).contains(x0Var2);
                String string6 = localDate6.toString("yyyy-MM-dd");
                string6.getClass();
                linkedHashMap.put(next3, new qp.c(x0Var2, bVar, fVar5, fVarJ4, zContains4, string6, zY, z14));
                list2 = list4;
                it = it3;
                list3 = list6;
                dateTime = dateTime11;
            }
            return i53.a.k(linkedHashMap);
        }
        return aVar2;
    }
}
