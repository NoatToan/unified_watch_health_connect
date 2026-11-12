package im;

import android.annotation.SuppressLint;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.i2;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import ps.x0;
import zm.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private d() {
    }

    /* JADX WARN: Code duplicated, block: B:126:0x030c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0311  */
    /* JADX WARN: Code duplicated, block: B:294:0x071d A[PHI: r7 r8 r11 r13 r28 r34 r39 r56
      0x071d: PHI (r7v20 im.b) = (r45v1 im.b), (r7v22 im.b) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]
      0x071d: PHI (r8v30 double) = (r8v31 double), (r8v32 double) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]
      0x071d: PHI (r11v25 double) = (r12v7 double), (r11v27 double) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]
      0x071d: PHI (r13v14 o20.a) = (r13v15 o20.a), (r13v16 o20.a) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]
      0x071d: PHI (r28v19 o20.a) = (r11v2 o20.a), (r28v21 o20.a) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]
      0x071d: PHI (r34v15 int) = (r8v7 int), (r34v17 int) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]
      0x071d: PHI (r39v17 int) = (r11v5 int), (r39v19 int) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]
      0x071d: PHI (r56v17 int) = (r56v2 int), (r56v19 int) binds: [B:301:0x076a, B:293:0x071b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r57v0, types: [com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO$b] */
    /* JADX WARN: Type inference failed for: r58v0, types: [com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO$b] */
    @SuppressLint({"SwitchIntDef"})
    public static b a(ActivityDetailChartDTO activityDetailChartDTO, double d14, double d15, int i14, String str, String str2, ActivityDetailChartDTO.b bVar, ActivityDetailChartDTO.b bVar2, fz.c cVar, List list, boolean z14) {
        int i15;
        int i16;
        boolean z15;
        int i17;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> list2;
        int i18;
        int i19;
        b bVar3;
        double dC;
        int i24;
        Throwable th3;
        List list3;
        int i25;
        double dC2;
        double d16;
        double d17;
        ?? arrayList;
        int i26;
        int i27;
        Object objPrevious;
        qs.p pVarS0;
        qs.p pVarS1;
        double d18;
        o20.a aVar;
        double d19;
        o20.a aVar2;
        o20.a aVar3;
        double d24;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> list4;
        ArrayList arrayList2;
        int i28 = i14;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO.G();
        HashMap<Double, Double> map = new HashMap<>();
        int[] iArr = {ss.a.a(str2, listG), ss.a.a(str, listG)};
        int i29 = iArr[0];
        int size = iArr[1];
        boolean zY = ((f12.l) KoinJavaComponent.get(f12.l.class)).y();
        if (i28 == 38) {
            int[] iArr2 = {ss.a.a(cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", listG), ss.a.a("directWindYawAngle", listG)};
            i16 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i15 = -1;
            i16 = -1;
        }
        if (size != -1 || i29 != -1) {
            int i30 = i16;
            b bVar4 = new b(i28);
            bVar4.f94118i = cVar;
            int i34 = 1;
            bVar4.k(new ArrayList(0));
            bVar4.f94110a = size;
            if (list != null) {
                bVar4.s(list);
            }
            List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
            b bVar5 = bVar4;
            int i35 = i29;
            if (i28 == 50 && cVar == fz.c.DISTANCE) {
                int size2 = listG.size();
                com.garmin.android.apps.connectmobile.activities.newmodel.y yVarOrElse = listG.stream().filter(new c(0)).findFirst().orElse(null);
                com.garmin.android.apps.connectmobile.activities.newmodel.y yVarOrElse2 = listG.stream().filter(new c(1)).findFirst().orElse(null);
                if (yVarOrElse != null && yVarOrElse2 != null) {
                    listG.add(new com.garmin.android.apps.connectmobile.activities.newmodel.y(size2, "customDirectLapPace", yVarOrElse.H()));
                    int iG = yVarOrElse2.G();
                    if (list == null || list.isEmpty() || list.get(0) == null) {
                        list4 = listC;
                        z15 = zY;
                        arrayList2 = new ArrayList();
                    } else {
                        arrayList2 = new ArrayList();
                        double dZ2 = list.get(0) != null ? ((x0) list.get(0)).Z2() : 0.0d;
                        int i36 = 0;
                        while (i36 < list.size()) {
                            Double averageSpeed = ((x0) list.get(i36)).getAverageSpeed();
                            if (i36 < list.size() - 1) {
                                arrayList2.add(new lm.b((((x0) list.get(i36 + 1)).Z2() - dZ2) / 1000.0d, averageSpeed != null ? averageSpeed.doubleValue() : 0.0d));
                            } else {
                                dZ2 = dZ2;
                                arrayList2.add(new lm.b(Double.MAX_VALUE, averageSpeed != null ? averageSpeed.doubleValue() : 0.0d));
                            }
                            i36++;
                            listC = listC;
                            zY = zY;
                            dZ2 = dZ2;
                        }
                        list4 = listC;
                        z15 = zY;
                    }
                    ArrayList arrayList3 = new ArrayList(list4 != null ? list4 : Collections.EMPTY_LIST);
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < arrayList2.size() && i38 < arrayList3.size()) {
                        lm.b bVar6 = (lm.b) arrayList2.get(i37);
                        ArrayList arrayList4 = new ArrayList(((com.garmin.android.apps.connectmobile.activities.newmodel.b) arrayList3.get(i38)).C());
                        Double d25 = (Double) arrayList4.get(iG);
                        int i39 = i15;
                        if ((d25 != null ? d25.doubleValue() : 0.0d) < bVar6.f113491a) {
                            arrayList4.add(Double.valueOf(bVar6.f113492b));
                            arrayList3.set(i38, new com.garmin.android.apps.connectmobile.activities.newmodel.b(arrayList4));
                            i38++;
                        } else {
                            i37++;
                        }
                        i15 = i39;
                    }
                    i17 = i15;
                    size = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) arrayList3.get(0)).C().size() - 1;
                    list2 = arrayList3;
                }
            } else {
                z15 = zY;
                i17 = i15;
                list2 = listC;
            }
            o20.a aVar4 = new o20.a(0.0d, 0.0d);
            o20.a aVar5 = new o20.a(-255.0d, -255.0d);
            int i44 = 0;
            for (com.garmin.android.apps.connectmobile.activities.newmodel.b bVar7 : list2) {
                int iIndexOf = list2.indexOf(bVar7);
                List<Double> listC2 = bVar7.C();
                int i45 = i35;
                double dDoubleValue = (i45 == -1 || listC2.get(i45) == null) ? Double.NaN : listC2.get(i45).doubleValue();
                double dDoubleValue2 = (size < 0 || size >= listC2.size() || listC2.get(size) == null) ? Double.NaN : listC2.get(size).doubleValue();
                if (bVar == 0 || Double.isNaN(dDoubleValue)) {
                    i18 = i17;
                    i19 = i34;
                    bVar3 = bVar5;
                    dC = dDoubleValue;
                    i24 = iIndexOf;
                    th3 = null;
                } else {
                    i18 = i17;
                    i24 = iIndexOf;
                    bVar3 = bVar5;
                    i19 = i34;
                    th3 = null;
                    dC = bVar.c(i24, list2, i45, dDoubleValue, 0.0d, 0.0d);
                }
                if (bVar2 == 0 || Double.isNaN(dDoubleValue2)) {
                    i45 = i45;
                    i45 = i45;
                    list3 = list2;
                    i25 = size;
                    dC2 = dDoubleValue2;
                } else {
                    i45 = i45;
                    List list5 = list2;
                    int i46 = size;
                    list3 = list5;
                    i25 = i46;
                    dC2 = bVar2.c(i24, list5, i46, dDoubleValue2, d14, d15);
                }
                if (i28 == i19 || i28 == 64 || i28 == 67 || i28 == 68 || i28 == 69) {
                    d16 = 0.0d;
                    d17 = dC2 != 0.0d ? dC2 : Double.NaN;
                    if (d17 < 3599.0d) {
                        i44 = i19;
                    }
                } else {
                    d17 = dC2;
                    d16 = 0.0d;
                }
                if (!Double.isNaN(d17)) {
                    d16 = d17;
                } else if (i28 == 3) {
                    d16 = -1.0d;
                } else if (i28 != 33) {
                    if (i28 != 88) {
                        d16 = d17;
                    } else {
                        d16 = -1.0d;
                    }
                }
                if (i28 != 2) {
                    if (i28 != 3) {
                        if (i28 == 16) {
                            aVar4 = aVar4;
                            i45 = i45;
                            i25 = i25;
                            double d26 = dC;
                            aVar5 = aVar5;
                            bVar3 = bVar3;
                            double d27 = d16;
                            z15 = z15;
                            if (d27 < d16 || d27 > 20.0d) {
                                i30 = i30;
                                i30 = i30;
                                i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Vertical Ratio 'y' value [" + d27 + "]");
                            } else {
                                if (!Double.isNaN(d26)) {
                                    i30 = i30;
                                    e5.p(d26, d27, bVar3);
                                }
                                i30 = i30;
                                f(aVar4, aVar5, d26, d27, false);
                            }
                        } else if (i28 == 19) {
                            aVar4 = aVar4;
                            i45 = i45;
                            i25 = i25;
                            double d28 = dC;
                            bVar3 = bVar3;
                            double d29 = d16;
                            z15 = z15;
                            if (d29 < d16 || d29 > 100.0d) {
                                i30 = i30;
                                i30 = i30;
                                aVar5 = aVar5;
                                i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Left Right Balance 'y' value [" + d29 + "]");
                            } else {
                                double dAbs = Math.abs(100.0d - d29);
                                if (!Double.isNaN(d28)) {
                                    i30 = i30;
                                    e5.p(d28, dAbs, bVar3);
                                }
                                i30 = i30;
                                aVar5 = aVar5;
                                f(aVar4, aVar5, d28, dAbs, false);
                            }
                        } else if (i28 != 50) {
                            if (i28 != 52) {
                                if (i28 == 61 || i28 == 63) {
                                    i45 = i45;
                                    i25 = i25;
                                    double d34 = dC;
                                    aVar5 = aVar5;
                                    i30 = i30;
                                    aVar = aVar4;
                                    bVar3 = bVar3;
                                    f12.l.f68084a.getClass();
                                    double dV3 = d16 / f12.l.a.a().v3();
                                    if (!Double.isNaN(d34)) {
                                        e5.p(d34, dV3, bVar3);
                                    }
                                } else {
                                    if (i28 == 72) {
                                        aVar = aVar4;
                                        d19 = d16;
                                    } else if (i28 == 82) {
                                        i45 = i45;
                                        i25 = i25;
                                        dC = dC;
                                        aVar5 = aVar5;
                                        aVar = aVar4;
                                        bVar3 = bVar3;
                                        d19 = d16;
                                        if (d19 < d16 || d19 > 3.0d) {
                                            i30 = i30;
                                            i30 = i30;
                                            i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out IMPACT LOAD FACTOR 'y' value [" + d19 + "]");
                                        } else if (!Double.isNaN(dC)) {
                                            i30 = i30;
                                            e5.p(dC, d19, bVar3);
                                        }
                                    } else if (i28 == 33) {
                                        aVar4 = aVar4;
                                        i45 = i45;
                                        i25 = i25;
                                        double d35 = dC;
                                        aVar5 = aVar5;
                                        bVar3 = bVar3;
                                        double d36 = d16;
                                        if (d36 < -20.0d || d36 > 20.0d) {
                                            i30 = i30;
                                            i30 = i30;
                                            aVar = aVar4;
                                            i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out invalid Performance Condition'y' value [" + d36 + "]");
                                        } else {
                                            if (!Double.isNaN(d35)) {
                                                i30 = i30;
                                                e5.p(d35, d36, bVar3);
                                            }
                                            i30 = i30;
                                            f(aVar4, aVar5, d35, d36, true);
                                        }
                                    } else if (i28 != 34) {
                                        if (i28 == 87) {
                                            d16 = 0.0d;
                                        } else if (i28 != 88) {
                                            switch (i28) {
                                                case 11:
                                                    aVar = aVar4;
                                                    d19 = d16;
                                                    break;
                                                case 12:
                                                    aVar4 = aVar4;
                                                    i45 = i45;
                                                    i25 = i25;
                                                    double d37 = dC;
                                                    i30 = i30;
                                                    bVar3 = bVar3;
                                                    double d38 = d16;
                                                    o20.a aVar6 = aVar5;
                                                    if (d38 < 100.0d || d38 > 400.0d) {
                                                        aVar5 = aVar6;
                                                        i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Ground Contact Time 'y' value [" + d38 + "]");
                                                    } else {
                                                        if (!Double.isNaN(d37)) {
                                                            e5.p(d37, d38, bVar3);
                                                        }
                                                        aVar5 = aVar6;
                                                        f(aVar4, aVar5, d37, d38, true);
                                                    }
                                                    break;
                                                case 13:
                                                    i45 = i45;
                                                    i25 = i25;
                                                    double d39 = dC;
                                                    i30 = i30;
                                                    o20.a aVar7 = aVar4;
                                                    bVar3 = bVar3;
                                                    double d44 = d16;
                                                    aVar2 = aVar5;
                                                    if (d44 <= d16 || d44 > 20.0d) {
                                                        aVar4 = aVar7;
                                                        i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Vertical Oscillation 'y' value [" + d44 + "]");
                                                        aVar5 = aVar2;
                                                    } else {
                                                        if (!Double.isNaN(d39)) {
                                                            e5.p(d39, d44, bVar3);
                                                        }
                                                        aVar4 = aVar7;
                                                        aVar5 = aVar2;
                                                        f(aVar4, aVar5, d39, d44, true);
                                                    }
                                                    break;
                                                default:
                                                    o20.a aVar8 = aVar4;
                                                    i45 = i45;
                                                    switch (i28) {
                                                        case 21:
                                                        case 22:
                                                            double d45 = d16;
                                                            i25 = i25;
                                                            double d46 = dC;
                                                            aVar2 = aVar5;
                                                            i30 = i30;
                                                            bVar3 = bVar3;
                                                            aVar3 = aVar8;
                                                            if (d45 < -30.0d || d45 > 30.0d) {
                                                                i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Platform center offsset  Ratio 'y' value [" + d45 + "]");
                                                            } else {
                                                                if (!Double.isNaN(d46)) {
                                                                    e5.p(d46, d45, bVar3);
                                                                }
                                                                aVar3.G(-30.0d);
                                                                aVar2.G(30.0d);
                                                            }
                                                            aVar4 = aVar3;
                                                            aVar5 = aVar2;
                                                            break;
                                                        case 23:
                                                            i25 = i25;
                                                            double d47 = dC;
                                                            i30 = i30;
                                                            bVar3 = bVar3;
                                                            aVar3 = aVar8;
                                                            double d48 = d16;
                                                            aVar2 = aVar5;
                                                            if (d48 < 135.0d || d48 > 315.0d) {
                                                                i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Power Phase End 'y' value [" + d48 + "]");
                                                            } else {
                                                                if (!Double.isNaN(d47)) {
                                                                    e5.p(d47, d48, bVar3);
                                                                }
                                                                aVar3.G(135.0d);
                                                                aVar2.G(315.0d);
                                                            }
                                                            aVar4 = aVar3;
                                                            aVar5 = aVar2;
                                                            break;
                                                        case 24:
                                                            i25 = i25;
                                                            double d49 = dC;
                                                            double d54 = d16;
                                                            aVar2 = aVar5;
                                                            i30 = i30;
                                                            bVar3 = bVar3;
                                                            aVar3 = aVar8;
                                                            if (!Double.isNaN(d49)) {
                                                                e5.p(d49, d54, bVar3);
                                                            }
                                                            aVar3.G(0.0d);
                                                            aVar2.G(180.0d);
                                                            aVar4 = aVar3;
                                                            aVar5 = aVar2;
                                                            break;
                                                        case 25:
                                                            i25 = i25;
                                                            double d55 = dC;
                                                            i30 = i30;
                                                            bVar3 = bVar3;
                                                            aVar3 = aVar8;
                                                            double d56 = d16;
                                                            aVar2 = aVar5;
                                                            if (d56 < d16 || d56 > 135.0d) {
                                                                i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Power Phase End 'y' value [" + d56 + "]");
                                                            } else {
                                                                if (!Double.isNaN(d55)) {
                                                                    e5.p(d55, d56, bVar3);
                                                                }
                                                                aVar3.G(d16);
                                                                aVar2.G(135.0d);
                                                            }
                                                            aVar4 = aVar3;
                                                            aVar5 = aVar2;
                                                            break;
                                                        case 26:
                                                            i25 = i25;
                                                            double d57 = dC;
                                                            i30 = i30;
                                                            bVar3 = bVar3;
                                                            double d58 = d16;
                                                            o20.a aVar9 = aVar5;
                                                            int i47 = i18;
                                                            if (d58 < 45.0d || d58 > 180.0d) {
                                                                i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Power Phase End 'y' value [" + d58 + "]");
                                                            } else {
                                                                if (Double.isNaN(d57)) {
                                                                    d24 = 45.0d;
                                                                } else {
                                                                    e5.p(d57, d58, bVar3);
                                                                    d24 = 45.0d;
                                                                }
                                                                aVar8.G(d24);
                                                                aVar9.G(180.0d);
                                                            }
                                                            aVar4 = aVar8;
                                                            aVar5 = aVar9;
                                                            i18 = i47;
                                                            z15 = z15;
                                                            break;
                                                        default:
                                                            switch (i28) {
                                                                case 38:
                                                                    o20.a aVar10 = aVar5;
                                                                    bVar3 = bVar3;
                                                                    if (!Double.isNaN(dC)) {
                                                                        e5.p(dC, d16, bVar3);
                                                                    }
                                                                    f(aVar8, aVar10, dC, d16, false);
                                                                    int i48 = i30;
                                                                    if (i48 != -1) {
                                                                        int i49 = i18;
                                                                        if (i49 != -1) {
                                                                            Double d59 = listC2.get(i48);
                                                                            DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                                                            double dDoubleValue3 = listC2.get(i49).doubleValue();
                                                                            l3.f23124b.getClass();
                                                                            double dAbs2 = Math.abs(dDoubleValue3) * 57.21733049365841d;
                                                                            if (dAbs2 > 360.0d) {
                                                                                dAbs2 %= (double) 360;
                                                                            }
                                                                            map.put(d59, Double.valueOf(decimalFormat.format(dAbs2)));
                                                                        } else {
                                                                            i25 = i25;
                                                                        }
                                                                        i18 = i49;
                                                                    } else {
                                                                        i25 = i25;
                                                                    }
                                                                    i30 = i48;
                                                                    aVar4 = aVar8;
                                                                    aVar5 = aVar10;
                                                                    z15 = z15;
                                                                    break;
                                                                case 39:
                                                                case 40:
                                                                    bVar3 = bVar3;
                                                                    if (!Double.isNaN(dC)) {
                                                                        e5.p(dC, d16, bVar3);
                                                                    }
                                                                    aVar4 = aVar8;
                                                                    aVar5 = aVar5;
                                                                    f(aVar4, aVar5, dC, d16, false);
                                                                    z15 = z15;
                                                                    i30 = i30;
                                                                    break;
                                                                case 41:
                                                                    bVar3 = bVar3;
                                                                    if (!Double.isNaN(d16) && !Double.isNaN(dC)) {
                                                                        e5.p(dC, d16, bVar3);
                                                                    }
                                                                    aVar4 = aVar8;
                                                                    aVar5 = aVar5;
                                                                    z15 = z15;
                                                                    i30 = i30;
                                                                    break;
                                                                default:
                                                                    if (Double.isNaN(dC)) {
                                                                        aVar4 = aVar8;
                                                                        i25 = i25;
                                                                        aVar5 = aVar5;
                                                                        z15 = z15;
                                                                        i30 = i30;
                                                                        bVar3 = bVar3;
                                                                    } else {
                                                                        bVar3 = bVar3;
                                                                        e5.p(dC, d16, bVar3);
                                                                        aVar4 = aVar8;
                                                                        aVar5 = aVar5;
                                                                        z15 = z15;
                                                                        i30 = i30;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            d18 = d16;
                                        }
                                        i28 = i14;
                                        bVar5 = bVar3;
                                        z15 = z15;
                                        list2 = list3;
                                        aVar4 = aVar4;
                                        aVar5 = aVar5;
                                        i35 = i45;
                                        size = i25;
                                        i17 = i18;
                                        i34 = 1;
                                    } else {
                                        aVar4 = aVar4;
                                        i45 = i45;
                                        i25 = i25;
                                        double d64 = dC;
                                        aVar5 = aVar5;
                                        bVar3 = bVar3;
                                        double d65 = d16;
                                        if (d65 < d16) {
                                            i30 = i30;
                                            i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Floor Climbing 'y' value [" + d65 + "]");
                                        } else {
                                            if (!Double.isNaN(d64)) {
                                                i30 = i30;
                                                e5.p(d64, d65, bVar3);
                                            }
                                            i30 = i30;
                                            f(aVar4, aVar5, d64, d65, false);
                                        }
                                    }
                                    if (d19 <= 0.0d) {
                                        i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out running cadence 'y' value [" + d19 + "]");
                                    } else if (!Double.isNaN(dC)) {
                                        i30 = i30;
                                        e5.p(dC, d19, bVar3);
                                    }
                                }
                                i30 = i30;
                                aVar4 = aVar;
                            } else {
                                i45 = i45;
                                i25 = i25;
                                double d66 = dC;
                                aVar5 = aVar5;
                                o20.a aVar11 = aVar4;
                                bVar3 = bVar3;
                                if (list != null) {
                                    i30 = i30;
                                    Iterator it = list.iterator();
                                    double dDoubleValue4 = 0.0d;
                                    while (true) {
                                        if (it.hasNext()) {
                                            x0 x0Var = (x0) it.next();
                                            if (x0Var == null) {
                                                z15 = z15;
                                            } else if (qs.x.RUN_ACTIVE.f147220a.equals(x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String())) {
                                                if (d66 > dDoubleValue4) {
                                                    dDoubleValue4 += x0Var.getDuration() == null ? 0.0d : x0Var.getDuration().doubleValue();
                                                }
                                                if (d66 <= dDoubleValue4) {
                                                    double dDoubleValue5 = x0Var.getAverageSpeed() == null ? 0.0d : x0Var.getAverageSpeed().doubleValue();
                                                    l3.f23124b.getClass();
                                                    z15 = z15;
                                                    double dMin = Math.min(3599, l3.a.p(dDoubleValue5, z15));
                                                    if (!Double.isNaN(d66)) {
                                                        e5.p(d66, dMin, bVar3);
                                                    }
                                                    aVar4 = aVar11;
                                                    f(aVar4, aVar5, d66, dMin, false);
                                                }
                                                z15 = z15;
                                            } else {
                                                z15 = z15;
                                                if (qs.x.RUN_REST.f147220a.equals(x0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String())) {
                                                    if (!Double.isNaN(d66) && d66 > dDoubleValue4) {
                                                        dDoubleValue4 += x0Var.getDuration() == null ? 0.0d : x0Var.getDuration().doubleValue();
                                                    }
                                                    if (!Double.isNaN(d66) && d66 <= dDoubleValue4) {
                                                        double dMin2 = Math.min(3599.0d, e0.c(list));
                                                        e5.p(d66, dMin2, bVar3);
                                                        aVar4 = aVar11;
                                                        f(aVar4, aVar5, d66, dMin2, false);
                                                    }
                                                }
                                            }
                                            z15 = z15;
                                            aVar11 = aVar11;
                                        } else {
                                            aVar4 = aVar11;
                                        }
                                    }
                                } else {
                                    i30 = i30;
                                    z15 = z15;
                                    aVar4 = aVar11;
                                }
                            }
                            z15 = z15;
                        } else {
                            aVar4 = aVar4;
                            i45 = i45;
                            i25 = i25;
                            double d67 = dC;
                            double dP = d16;
                            aVar5 = aVar5;
                            z15 = z15;
                            bVar3 = bVar3;
                            if (list != null && cVar == fz.c.TIME) {
                                i30 = i30;
                                Iterator it3 = list.iterator();
                                double dDoubleValue6 = 0.0d;
                                while (it3.hasNext()) {
                                    x0 x0Var2 = (x0) it3.next();
                                    if (d67 > dDoubleValue6) {
                                        dDoubleValue6 += x0Var2.getDuration() == null ? 0.0d : x0Var2.getDuration().doubleValue();
                                    }
                                    if (d67 <= dDoubleValue6) {
                                        double dDoubleValue7 = x0Var2.getAverageSpeed() == null ? 0.0d : x0Var2.getAverageSpeed().doubleValue();
                                        l3.f23124b.getClass();
                                        dP = l3.a.p(dDoubleValue7, z15);
                                    }
                                }
                            }
                            i30 = i30;
                            i30 = i30;
                            if (!Double.isNaN(d67)) {
                                e5.p(d67, dP, bVar3);
                            }
                            f(aVar4, aVar5, d67, dP, false);
                        }
                        d16 = 0.0d;
                        i28 = i14;
                        bVar5 = bVar3;
                        z15 = z15;
                        list2 = list3;
                        aVar4 = aVar4;
                        aVar5 = aVar5;
                        i35 = i45;
                        size = i25;
                        i17 = i18;
                        i34 = 1;
                    } else {
                        d18 = d16;
                    }
                    z15 = z15;
                    d16 = 0.0d;
                    if (d18 == -1.0d || d18 > 0.0d) {
                        if (!Double.isNaN(dC)) {
                            e5.p(dC, d18, bVar3);
                        }
                        if (d18 != -1.0d) {
                            f(aVar4, aVar5, dC, d18, false);
                        }
                    } else {
                        i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Heart Rate 'y' value [" + d18 + "]");
                    }
                    i28 = i14;
                    bVar5 = bVar3;
                    z15 = z15;
                    list2 = list3;
                    aVar4 = aVar4;
                    aVar5 = aVar5;
                    i35 = i45;
                    size = i25;
                    i17 = i18;
                    i34 = 1;
                }
                if (!Double.isNaN(dC) && !Double.isNaN(d16)) {
                    e5.p(dC, d16, bVar3);
                }
                bVar3.s(list);
                f(aVar4, aVar5, dC, d16, false);
                if (list != null && !list.isEmpty() && list.stream().anyMatch(new c(2))) {
                    int[] iArr3 = {ss.a.a("directTimestamp", listG), ss.a.a(str, listG)};
                    new v();
                    double dDoubleValue8 = listC2.get(iArr3[0]).doubleValue();
                    ArrayList arrayList5 = bVar3.T;
                    if (arrayList5 != null) {
                        arrayList = new ArrayList();
                        for (Object obj : arrayList5) {
                            qs.p pVarS2 = ((x0) obj).S0();
                            if (pVarS2 != null && (pVarS2 == qs.p.ASCENT || pVarS2 == qs.p.DESCENT || pVarS2 == qs.p.TRANSITION)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = th3;
                    }
                    if (arrayList != 0) {
                        Iterator it4 = arrayList.iterator();
                        int i54 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                Object next = it4.next();
                                int i55 = i54 + 1;
                                if (i54 < 0) {
                                    p13.x.q();
                                    throw th3;
                                }
                                x0 x0Var3 = (x0) next;
                                qs.p pVarS3 = x0Var3.S0();
                                if (pVarS3 == null || (i27 = pVarS3.f147144b) == 0) {
                                    i27 = R.color.gray_50_static;
                                }
                                x0 x0Var4 = (x0) h0.e0(i55, arrayList);
                                if (x0Var4 != null) {
                                    if (x0Var3.S0() != null) {
                                        long j8 = (long) dDoubleValue8;
                                        if (j8 >= x0Var3.Z2() && j8 < x0Var4.Z2()) {
                                            if (x0Var3.S0() != qs.p.TRANSITION || z14) {
                                                i26 = i27;
                                            } else {
                                                List listSubList = arrayList.subList(0, i54);
                                                ListIterator listIterator = listSubList.listIterator(listSubList.size());
                                                while (true) {
                                                    if (listIterator.hasPrevious()) {
                                                        objPrevious = listIterator.previous();
                                                        x0 x0Var5 = (x0) objPrevious;
                                                        if (x0Var5.S0() == qs.p.TRANSITION || ((pVarS1 = x0Var5.S0()) != null && pVarS1.f147144b == 0)) {
                                                        }
                                                    } else {
                                                        objPrevious = th3;
                                                    }
                                                }
                                                x0 x0Var6 = (x0) objPrevious;
                                                if (x0Var6 != null && (pVarS0 = x0Var6.S0()) != null) {
                                                    i26 = pVarS0.f147144b;
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                    i54 = i55;
                                } else if (x0Var3.S0() != null) {
                                    i26 = i27;
                                } else {
                                    i54 = i55;
                                }
                            } else {
                                i26 = R.color.gray_50_static;
                            }
                        }
                    } else {
                        i26 = R.color.gray_50_static;
                    }
                    bVar3.f94123m.add(Integer.valueOf(i26));
                }
                i28 = i14;
                bVar5 = bVar3;
                z15 = z15;
                list2 = list3;
                aVar4 = aVar4;
                aVar5 = aVar5;
                i35 = i45;
                size = i25;
                i17 = i18;
                i34 = 1;
            }
            int i56 = size;
            o20.a aVar12 = aVar4;
            o20.a aVar13 = aVar5;
            b bVar8 = bVar5;
            int i57 = i35;
            if ((i28 == i34 || i28 == 64 || i28 == 68 || i28 == 67 || i28 == 69) && i44 == 0) {
                return null;
            }
            if (i28 == 38) {
                bVar8.M0 = map;
            }
            bVar8.f94124n = aVar12.D();
            bVar8.f94125o = aVar13.D();
            if (i57 != -1 && i56 != -1) {
                return bVar8;
            }
            bVar8.f94122l = Collections.EMPTY_LIST;
            return bVar8;
        }
        return null;
    }

    public static b b(ActivityDetailChartDTO activityDetailChartDTO, double d14, double d15, int i14, String str, String str2, ActivityDetailChartDTO.b bVar, fz.c cVar) {
        return a(activityDetailChartDTO, d14, d15, i14, str, str2, null, bVar, cVar, null, false);
    }

    public static b c(ActivityDetailChartDTO activityDetailChartDTO, int i14, String str, String str2, ActivityDetailChartDTO.b bVar, ActivityDetailChartDTO.b bVar2, fz.c cVar) {
        return a(activityDetailChartDTO, 0.0d, 0.0d, i14, str, str2, bVar, bVar2, cVar, null, false);
    }

    public static ArrayList d(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int iD = 0;
        while (iD < length) {
            iD = e5.d(iArr[iD], iD, arrayList, 1);
        }
        return arrayList;
    }

    public static ArrayList e(zm.p pVar, ArrayList arrayList) {
        int b14 = pVar.getB1();
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = a.f94102s;
        switch (b14) {
            case 0:
            case 2:
            case 3:
            case 6:
            case 14:
            case 15:
            case 16:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 39:
            case 40:
            case 47:
            case 51:
            case 54:
            case 55:
            case 56:
            case 86:
            case 87:
            case 88:
            case 89:
            case 92:
                arrayList2 = d(iArr);
                arrayList2.remove(Integer.valueOf(b14));
                break;
            case 1:
            case 67:
            case 68:
            case 69:
                arrayList2 = d(a.f94103t);
                break;
            case 4:
                arrayList2 = d(a.D);
                break;
            case 5:
            case 57:
            case 61:
            case 62:
            case 63:
                arrayList2 = d(a.f94109z);
                break;
            case 7:
            case 8:
            case 65:
                arrayList2 = d(a.L);
                break;
            case 9:
                arrayList2 = d(a.f94081a0);
                break;
            case 10:
                arrayList2 = d(a.M);
                break;
            case 11:
            case 44:
            case 66:
            case 72:
                arrayList2 = d(a.C);
                break;
            case 12:
                arrayList2 = d(a.J);
                break;
            case 13:
                arrayList2 = d(a.H);
                break;
            case 19:
                arrayList2 = d(a.N);
                break;
            case 20:
                arrayList2 = d(iArr);
                break;
            case 28:
                arrayList2 = d(a.B);
                break;
            case 33:
                arrayList2 = d(a.K);
                break;
            case 34:
                arrayList2 = d(a.f94108y);
                break;
            case 35:
                arrayList2 = d(a.O);
                break;
            case 36:
                arrayList2 = d(a.P);
                break;
            case 37:
                arrayList2 = d(a.Q);
                break;
            case 38:
                arrayList2 = d(a.R);
                break;
            case 41:
                String f113501k1 = pVar.getF113501k1();
                if (f113501k1 != null) {
                    if (f113501k1.equals(am.x0.f4308n.f4358a)) {
                        arrayList2 = d(a.S);
                    } else {
                        boolean zEquals = f113501k1.equals(am.x0.f4344w2.f4358a);
                        int[] iArr2 = a.U;
                        arrayList2 = (!zEquals && !f113501k1.equals(am.x0.f4348x2.f4358a) && !f113501k1.equals("health_snapshot_key")) ? d(a.T) : d(iArr2);
                    }
                }
                break;
            case 43:
                arrayList2 = d(a.V);
                break;
            case 45:
                arrayList2 = d(a.X);
                break;
            case 50:
                arrayList2 = d(a.f94105v);
                break;
            case 52:
                arrayList2 = d(a.f94106w);
                break;
            case 53:
                arrayList2 = d(a.W);
                break;
            case 58:
            case 59:
            case 60:
                arrayList2 = d(a.Y);
                arrayList2.remove(Integer.valueOf(b14));
                break;
            case 64:
                arrayList2 = d(a.f94107x);
                break;
            case 71:
                arrayList2 = d(a.E);
                break;
            case 77:
                arrayList2 = d(a.Z);
                break;
            case 81:
                arrayList2 = d(a.A);
                break;
            case 82:
                arrayList2 = d(a.f94104u);
                break;
            case 83:
                arrayList2 = d(a.F);
                break;
            case 84:
                arrayList2 = d(a.G);
                break;
            case 85:
                arrayList2 = d(a.f94083b0);
                break;
            case 96:
                arrayList2 = d(a.I);
                break;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            zm.p pVar2 = (zm.p) arrayList.get(i14);
            if (arrayList2.contains(Integer.valueOf(pVar2.getB1())) && pVar2.getB1() != 20) {
                arrayList3.add(pVar2);
            }
        }
        return arrayList3;
    }

    public static void f(o20.a aVar, o20.a aVar2, double d14, double d15, boolean z14) {
        if (!z14) {
            if (Double.isNaN(d14)) {
                if (d15 < aVar.D()) {
                    aVar.G(d15);
                    return;
                } else {
                    if (d15 > aVar2.D()) {
                        aVar2.G(d15);
                        return;
                    }
                    return;
                }
            }
            if (d15 < aVar.D()) {
                aVar.F(d14);
                aVar.G(d15);
                return;
            } else {
                if (d15 > aVar2.D()) {
                    aVar2.F(d14);
                    aVar2.G(d15);
                    return;
                }
                return;
            }
        }
        if (Double.isNaN(d14)) {
            if (aVar.D() == 0.0d || d15 < aVar.D()) {
                aVar.G(d15);
            }
            if (aVar2.D() == -255.0d || d15 > aVar2.D()) {
                aVar2.G(d15);
                return;
            }
            return;
        }
        if (aVar.D() == 0.0d || d15 < aVar.D()) {
            aVar.F(d14);
            aVar.G(d15);
        }
        if (aVar2.D() == -255.0d || d15 > aVar2.D()) {
            aVar2.F(d14);
            aVar2.G(d15);
        }
    }
}
