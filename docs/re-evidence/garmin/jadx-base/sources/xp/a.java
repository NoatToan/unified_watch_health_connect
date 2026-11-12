package xp;

import am.j;
import c22.l3;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import mp.h;
import mp.i;
import mp.k;
import mp.n;
import o13.p;
import o82.g;
import org.apache.commons.lang3.e;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.j0;
import p13.k0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: xp.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3570a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f191828b;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.WIN_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.STRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.PACK_WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.BODY_BATTERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.ASCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.DISTANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.DISTANCE_SWIMMING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k.TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k.TIME_INDOOR_ROWING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k.CALORIES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k.RESTING_CALORIES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k.NON_PACK_WEIGHT_CALORIES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k.PACK_WEIGHT_CALORIES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[k.GAMES_WON.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[k.GAMES_AVG_WON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[k.GAMES_NOT_WON.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[k.AVG_WIN_STRESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[k.AVG_LOSS_STRESS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[k.AVG_DRAW_STRESS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[k.AVG_PACK_WEIGHT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[k.PACE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f191827a = iArr;
            int[] iArr2 = new int[g.values().length];
            try {
                iArr2[g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[g.f130857j.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            f191828b = iArr2;
        }
    }

    public static final Double a(Double d14, k kVar) {
        double dE;
        double dDoubleValue;
        double d15;
        boolean z14 = j.z(l.f68084a);
        boolean zC = l.a.a().c();
        if (d14 == null) {
            return null;
        }
        switch (C3570a.f191827a[kVar.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                dE = MathKt.e(d14.doubleValue());
                break;
            case 3:
            case 20:
            case 21:
                dE = d14.doubleValue();
                break;
            case 5:
                if (!zC) {
                    dE = d14.doubleValue();
                } else {
                    l3.a aVar = l3.f23124b;
                    double dDoubleValue2 = d14.doubleValue();
                    aVar.getClass();
                    dE = 3.2808399d * dDoubleValue2;
                }
                break;
            case 6:
                if (z14) {
                    l3.a aVar2 = l3.f23124b;
                    dDoubleValue = d14.doubleValue();
                    aVar2.getClass();
                    d15 = 1000.0d;
                } else {
                    l3.a aVar3 = l3.f23124b;
                    dDoubleValue = d14.doubleValue();
                    aVar3.getClass();
                    d15 = 1609.344d;
                }
                dE = dDoubleValue / d15;
                break;
            case 7:
                if (!z14) {
                    l3.a aVar4 = l3.f23124b;
                    double dDoubleValue3 = d14.doubleValue();
                    aVar4.getClass();
                    dE = l3.a.S1(dDoubleValue3);
                } else {
                    dE = d14.doubleValue();
                }
                break;
            case 8:
                dE = d14.doubleValue();
                break;
            case 9:
                dE = d14.doubleValue();
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                dE = Math.rint(d14.doubleValue());
                break;
            default:
                u0.r();
                return null;
        }
        return Double.valueOf(dE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map<k, List<mp.l>> b(List<n> list, k kVar) {
        Double dValueOf;
        Map mapL;
        Map mapL2;
        Map mapL3;
        Double d14;
        Double d15;
        Double d16;
        mp.l lVar;
        Double value;
        Double value2;
        ArrayList arrayList = null;
        Map mapL4 = null;
        switch (C3570a.f191827a[kVar.ordinal()]) {
            case 1:
                k kVar2 = k.WIN_RATE;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayListC = c(list, i.SPLIT_SUMMARY_GAMES_AVG_WON, h.AVG);
                if (arrayListC != null && !arrayListC.isEmpty()) {
                    Iterator it = arrayListC.iterator();
                    if (!it.hasNext()) {
                        e.w("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        mp.l lVar2 = (mp.l) it.next();
                        mp.l lVar3 = (mp.l) next;
                        Double value3 = lVar3.getValue();
                        if (value3 != null) {
                            double dDoubleValue = value3.doubleValue();
                            Double value4 = lVar2.getValue();
                            dValueOf = Double.valueOf(dDoubleValue + (value4 != null ? value4.doubleValue() : 0.0d));
                        } else {
                            dValueOf = null;
                        }
                        next = mp.l.b(lVar3, dValueOf);
                    }
                    mp.l lVar4 = (mp.l) next;
                    Double value5 = lVar4.getValue();
                    arrayList2.add(mp.l.b(lVar4, value5 != null ? Double.valueOf(value5.doubleValue() / ((double) arrayListC.size())) : null));
                }
                Unit unit = Unit.INSTANCE;
                p pVar = new p(kVar2, arrayList2);
                k kVar3 = k.GAMES_WON;
                i iVar = i.SPLIT_SUMMARY_GAMES_WON;
                h hVar = h.SUM;
                return p13.u0.e(pVar, new p(kVar3, c(list, iVar, hVar)), new p(k.GAMES_AVG_WON, c(list, i.SPLIT_SUMMARY_GAMES_AVG_WON, h.AVG)), new p(k.GAMES_NOT_WON, c(list, i.SPLIT_SUMMARY_GAMES_NOT_WON, hVar)));
            case 2:
                k kVar4 = k.STRESS;
                i iVar2 = i.SPLIT_SUMMARY_AVG_STRESS;
                h hVar2 = h.AVG;
                return p13.u0.e(new p(kVar4, c(list, iVar2, hVar2)), new p(k.AVG_WIN_STRESS, c(list, i.SPLIT_SUMMARY_AVG_STRESS_WIN, hVar2)), new p(k.AVG_LOSS_STRESS, c(list, i.SPLIT_SUMMARY_AVG_STRESS_LOSS, hVar2)), new p(k.AVG_DRAW_STRESS, c(list, i.SPLIT_SUMMARY_AVG_STRESS_DRAW, hVar2)));
            case 3:
                k kVar5 = k.PACK_WEIGHT;
                ArrayList<mp.l> arrayListC2 = c(list, i.PACK_WEIGHT, h.COUNT);
                if (arrayListC2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (mp.l lVar5 : arrayListC2) {
                        p pVar2 = (lVar5.getCalendarDate() == null || lVar5.getValue() == null) ? null : new p(lVar5.getCalendarDate(), lVar5.getValue());
                        if (pVar2 != null) {
                            arrayList3.add(pVar2);
                        }
                    }
                    mapL = p13.u0.l(arrayList3);
                } else {
                    mapL = null;
                }
                ArrayList<mp.l> arrayListC3 = c(list, i.PACK_WEIGHT, h.SUM);
                if (arrayListC3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (mp.l lVar6 : arrayListC3) {
                        p pVar3 = (lVar6.getCalendarDate() == null || lVar6.getValue() == null) ? null : new p(lVar6.getCalendarDate(), lVar6.getValue());
                        if (pVar3 != null) {
                            arrayList4.add(pVar3);
                        }
                    }
                    mapL2 = p13.u0.l(arrayList4);
                } else {
                    mapL2 = null;
                }
                ArrayList<mp.l> arrayListC4 = c(list, i.SPLIT_SUMMARY_AVG_PACK_WEIGHT, h.COUNT);
                if (arrayListC4 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (mp.l lVar7 : arrayListC4) {
                        p pVar4 = (lVar7.getCalendarDate() == null || lVar7.getValue() == null) ? null : new p(lVar7.getCalendarDate(), lVar7.getValue());
                        if (pVar4 != null) {
                            arrayList5.add(pVar4);
                        }
                    }
                    mapL3 = p13.u0.l(arrayList5);
                } else {
                    mapL3 = null;
                }
                ArrayList<mp.l> arrayListC5 = c(list, i.SPLIT_SUMMARY_AVG_PACK_WEIGHT, h.SUM);
                if (arrayListC5 != null) {
                    ArrayList arrayList6 = new ArrayList();
                    for (mp.l lVar8 : arrayListC5) {
                        p pVar5 = (lVar8.getCalendarDate() == null || lVar8.getValue() == null) ? null : new p(lVar8.getCalendarDate(), lVar8.getValue());
                        if (pVar5 != null) {
                            arrayList6.add(pVar5);
                        }
                    }
                    mapL4 = p13.u0.l(arrayList6);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (mapL2 != null) {
                    for (Map.Entry entry : mapL2.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new p(entry.getValue(), Double.valueOf((mapL == null || (d16 = (Double) mapL.get(entry.getKey())) == null) ? 0.0d : d16.doubleValue())));
                    }
                }
                if (mapL4 != null) {
                    for (Map.Entry entry2 : mapL4.entrySet()) {
                        p pVar6 = (p) linkedHashMap.get(entry2.getKey());
                        linkedHashMap.put(entry2.getKey(), pVar6 != null ? new p(Double.valueOf(((Number) pVar6.f128594a).doubleValue() + ((Number) entry2.getValue()).doubleValue()), Double.valueOf(((Number) pVar6.f128595b).doubleValue() + ((mapL3 == null || (d15 = (Double) mapL3.get(entry2.getKey())) == null) ? 0.0d : d15.doubleValue()))) : new p(entry2.getValue(), Double.valueOf((mapL3 == null || (d14 = (Double) mapL3.get(entry2.getKey())) == null) ? 0.0d : d14.doubleValue())));
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    double dDoubleValue2 = ((Number) ((p) entry3.getValue()).f128594a).doubleValue();
                    double dDoubleValue3 = ((Number) ((p) entry3.getValue()).f128595b).doubleValue();
                    if (dDoubleValue3 < 1.0d) {
                        dDoubleValue3 = 1.0d;
                    }
                    arrayList7.add(new mp.l(Double.valueOf(dDoubleValue2 / dDoubleValue3), (String) entry3.getKey()));
                }
                return p13.u0.e(new p(kVar5, arrayList7), new p(k.PACE, c(list, i.AVG_SPEED, h.AVG)));
            case 4:
                return t0.b(new p(k.BODY_BATTERY, c(list, i.BODY_BATTERY, h.SUM)));
            case 5:
                return t0.b(new p(k.ASCENT, c(list, i.ELEVATION_GAIN, h.SUM)));
            case 6:
                return t0.b(new p(k.DISTANCE, c(list, i.DISTANCE, h.SUM)));
            case 7:
                return t0.b(new p(k.DISTANCE_SWIMMING, c(list, i.DISTANCE, h.SUM)));
            case 8:
                return t0.b(new p(k.TIME, c(list, i.DURATION, h.SUM)));
            case 9:
                return t0.b(new p(k.TIME_INDOOR_ROWING, c(list, i.DURATION, h.SUM)));
            case 10:
                i iVar3 = i.CALORIES;
                h hVar3 = h.SUM;
                ArrayList<mp.l> arrayListC6 = c(list, iVar3, hVar3);
                ArrayList arrayListC7 = c(list, i.RESTING_CALORIES, hVar3);
                ArrayList arrayListC8 = c(list, i.PACK_WEIGHT_CALORIES, hVar3);
                Iterable iterable = arrayListC8 == null ? j0.f134944a : arrayListC8;
                Iterable iterable2 = arrayListC7 == null ? j0.f134944a : arrayListC7;
                int iA = t0.a(y.r(iterable, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
                for (Object obj : iterable) {
                    linkedHashMap2.put(((mp.l) obj).getCalendarDate(), obj);
                }
                int iA2 = t0.a(y.r(iterable2, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                for (Object obj2 : iterable2) {
                    linkedHashMap3.put(((mp.l) obj2).getCalendarDate(), obj2);
                }
                if (arrayListC6 != null) {
                    ArrayList arrayList8 = new ArrayList();
                    for (mp.l lVar9 : arrayListC6) {
                        String calendarDate = lVar9.getCalendarDate();
                        if (calendarDate != null) {
                            mp.l lVar10 = (mp.l) linkedHashMap2.get(calendarDate);
                            double dDoubleValue4 = (lVar10 == null || (value2 = lVar10.getValue()) == null) ? 0.0d : value2.doubleValue();
                            mp.l lVar11 = (mp.l) linkedHashMap3.get(calendarDate);
                            double dDoubleValue5 = (lVar11 == null || (value = lVar11.getValue()) == null) ? 0.0d : value.doubleValue();
                            Double value6 = lVar9.getValue();
                            double dDoubleValue6 = ((value6 != null ? value6.doubleValue() : 0.0d) - dDoubleValue4) - dDoubleValue5;
                            if (dDoubleValue6 < 0.0d) {
                                dDoubleValue6 = 0.0d;
                            }
                            lVar = new mp.l(Double.valueOf(dDoubleValue6), calendarDate);
                        } else {
                            lVar = null;
                        }
                        if (lVar != null) {
                            arrayList8.add(lVar);
                        }
                    }
                    arrayList = arrayList8;
                }
                return p13.u0.e(new p(k.CALORIES, arrayListC6), new p(k.RESTING_CALORIES, arrayListC7), new p(k.NON_PACK_WEIGHT_CALORIES, arrayList), new p(k.PACK_WEIGHT_CALORIES, arrayListC8));
            default:
                k0 k0Var = k0.f134949a;
                k0Var.getClass();
                return k0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList c(List list, i iVar, h hVar) {
        Map map;
        String date;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            LinkedHashMap linkedHashMap = nVar.f120045d;
            p pVar = (linkedHashMap == null || (map = (Map) linkedHashMap.get(iVar.f119999a)) == null || (date = nVar.getDate()) == null) ? null : new p(map, date);
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        ArrayList<p> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Double d14 = (Double) ((Map) ((p) obj).f128594a).get(h.COUNT.f119979a);
            if (d14 == null || d14.doubleValue() != 0.0d) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (p pVar2 : arrayList2) {
            Double d15 = (Double) ((Map) pVar2.f128594a).get(hVar.f119979a);
            mp.l lVar = d15 != null ? new mp.l(Double.valueOf(d15.doubleValue()), (String) pVar2.f128595b) : null;
            if (lVar != null) {
                arrayList3.add(lVar);
            }
        }
        return arrayList3;
    }

    public static final ArrayList d(List list, i iVar, h hVar) {
        ArrayList arrayListC = c(list, iVar, hVar);
        if (arrayListC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            Double value = ((mp.l) it.next()).getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    public static final Double e(double d14, Double d15) {
        if (d15 != null) {
            return u0.h(d14, d15);
        }
        return null;
    }
}
