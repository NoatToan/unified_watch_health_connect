package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import am.x0;
import android.content.Context;
import bm.e0;
import bm.k0;
import bm.m;
import bm.n;
import c22.b2;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.firebase.messaging.Constants;
import f12.l;
import j23.t;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/c;", "", "", "totalDuration", "startDuration", "endDuration", "", "totalDistance", "startDistance", "endDistance", "Lbm/k0;", "totalTime", "startTime", "endTime", "initialStartTime", "initialEndTime", "<init>", "(IIIDDDLbm/k0;Lbm/k0;Lbm/k0;Lbm/k0;Lbm/k0;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f28844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f28845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f28846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f28847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f28848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3 f28849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m3 f28850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f28851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f28852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f28853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e0 f28854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f28855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f28856m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/c$a;", "", "", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28858b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f28857a = str;
            this.f28858b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28857a.equals(aVar.f28857a) && this.f28858b.equals(aVar.f28858b);
        }

        public final int hashCode() {
            return this.f28858b.hashCode() + (this.f28857a.hashCode() * 31);
        }

        public final String toString() {
            return v.e0.g("AccessibleTime(display=", this.f28857a, ", contentDescription=", this.f28858b, ")");
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f28861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f28862d;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b.TRIM_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28859a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_START_DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a.TRIM_END_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f28860b = iArr2;
            int[] iArr3 = new int[x0.values().length];
            try {
                iArr3[x0.f4273c2.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[x0.S2.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[x0.f4317p1.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f28861c = iArr3;
            int[] iArr4 = new int[n.values().length];
            try {
                iArr4[n.SUM_DURATION_TO_SUM_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[n.SUM_DISTANCE_TO_SUM_DURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[n.SUM_DURATION_TO_TIME_STAMP.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f28862d = iArr4;
        }
    }

    public c(int i14, int i15, int i16, double d14, double d15, double d16, k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4, k0 k0Var5) {
        k0Var.getClass();
        k0Var2.getClass();
        k0Var3.getClass();
        k0Var4.getClass();
        k0Var5.getClass();
        this.f28844a = k0Var;
        this.f28845b = k0Var2;
        this.f28846c = k0Var3;
        this.f28847d = k0Var4;
        this.f28848e = k0Var5;
        m3 m3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
        this.f28849f = m3Var;
        this.f28850g = m3Var;
        this.f28851h = new e0(d14, 0, 0, null, null, 30, null);
        this.f28852i = new e0(d15, 0, 0, null, null, 30, null);
        this.f28853j = new e0(d16, 0, 0, null, null, 30, null);
        this.f28854k = new e0(d14, 0, 0, null, null, 30, null);
        this.f28855l = new e0(d15, 0, 0, null, null, 30, null);
        this.f28856m = new e0(d16, 0, 0, null, null, 30, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Double a(c cVar, ActivityDetailChartDTO activityDetailChartDTO, im.b bVar, List list, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar2) {
        int iC;
        Double dE = cVar.e(bVar2, null);
        if (dE == null || (iC = cVar.c(activityDetailChartDTO, bVar, "SUMDURATION", bVar2, null)) == -1 || iC >= list.size()) {
            return null;
        }
        if (!list.isEmpty() && s.a(((o20.a) list.get(iC)).C(), dE)) {
            double D = ((o20.a) list.get(iC)).D();
            return !Double.isNaN(D) ? Double.valueOf(D) : Double.valueOf(0.0d);
        }
        p pVarD = d(dE.doubleValue(), iC, list.size(), ((o20.a) list.get(iC)).C());
        if (pVarD == null) {
            return Double.valueOf(((o20.a) list.get(iC)).D());
        }
        B b14 = pVarD.f128595b;
        Number number = (Number) pVarD.f128594a;
        Number number2 = (Number) b14;
        return Double.valueOf(m.j(((o20.a) list.get(number.intValue())).C(), ((o20.a) list.get(number.intValue())).D(), ((o20.a) list.get(number2.intValue())).C(), ((o20.a) list.get(number2.intValue())).D(), dE.doubleValue()));
    }

    public static p d(double d14, int i14, int i15, double d15) {
        int i16;
        if (d15 >= d14 || (i16 = i14 + 1) >= i15) {
            int i17 = i14 - 1;
            if (i17 >= 0) {
                i14 = i17;
                i16 = i14;
            } else {
                i16 = -1;
                i14 = -1;
            }
        }
        if (i14 == -1 || i16 == -1) {
            return null;
        }
        return new p(Integer.valueOf(i14), Integer.valueOf(i16));
    }

    public static Integer f(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num != null || num2 == null || num3 == null || num4 == null) {
            return num;
        }
        int iIntValue = num2.intValue();
        int iIntValue2 = num3.intValue();
        return Integer.valueOf((iIntValue2 * 60) + (iIntValue * DateTimeConstants.SECONDS_PER_HOUR) + num4.intValue());
    }

    public static int i(ActivityDetailChartDTO activityDetailChartDTO, n nVar) {
        String str;
        activityDetailChartDTO.getClass();
        nVar.getClass();
        int i14 = b.f28862d[nVar.ordinal()];
        if (i14 == 1) {
            str = "SUMDISTANCE";
        } else if (i14 == 2) {
            str = "SUMDURATION";
        } else {
            if (i14 != 3) {
                u0.r();
                return 0;
            }
            str = "DIRECTTIMESTAMP";
        }
        return activityDetailChartDTO.H(str);
    }

    public static void o(c cVar, Integer num, Integer num2, Integer num3, Integer num4, int i14) {
        if ((i14 & 1) != 0) {
            num = null;
        }
        if ((i14 & 2) != 0) {
            num2 = null;
        }
        if ((i14 & 4) != 0) {
            num3 = null;
        }
        if ((i14 & 8) != 0) {
            num4 = null;
        }
        k0 k0Var = cVar.f28846c;
        k0 k0Var2 = cVar.f28848e;
        Integer numF = f(num, num2, num3, num4);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int i15 = k0Var2.f18822a;
            if (iIntValue < i15) {
                k0Var.a(numF.intValue());
            } else {
                k0Var.a(i15);
            }
            int i16 = k0Var.f18822a - cVar.f28845b.f18822a;
            if (i16 <= k0Var2.f18822a) {
                cVar.f28844a.a(i16);
            }
        }
    }

    public static void q(c cVar, Integer num, Integer num2, Integer num3, Integer num4, int i14) {
        if ((i14 & 1) != 0) {
            num = null;
        }
        if ((i14 & 2) != 0) {
            num2 = null;
        }
        if ((i14 & 4) != 0) {
            num3 = null;
        }
        if ((i14 & 8) != 0) {
            num4 = null;
        }
        k0 k0Var = cVar.f28845b;
        Integer numF = f(num, num2, num3, num4);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int i15 = cVar.f28847d.f18822a;
            if (iIntValue > i15) {
                k0Var.a(numF.intValue());
            } else {
                k0Var.a(i15);
            }
            int i16 = k0Var.f18822a;
            int i17 = cVar.f28846c.f18822a;
            if (i16 < i17) {
                cVar.f28844a.a(i17 - i16);
            }
        }
    }

    public static void s(c cVar, Integer num, Integer num2, Integer num3, Integer num4, int i14) {
        int i15;
        if ((i14 & 1) != 0) {
            num = null;
        }
        if ((i14 & 2) != 0) {
            num2 = null;
        }
        if ((i14 & 4) != 0) {
            num3 = null;
        }
        if ((i14 & 8) != 0) {
            num4 = null;
        }
        k0 k0Var = cVar.f28846c;
        k0 k0Var2 = cVar.f28845b;
        k0 k0Var3 = cVar.f28844a;
        k0 k0Var4 = cVar.f28848e;
        Integer numF = f(num, num2, num3, num4);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int i16 = k0Var4.f18822a;
            if (iIntValue < i16) {
                k0Var3.a(numF.intValue());
            } else {
                k0Var3.a(i16);
            }
            int i17 = k0Var3.f18822a;
            int i18 = k0Var4.f18822a;
            if (i17 < i18 && (i15 = k0Var2.f18822a + i17) <= i18) {
                k0Var.a(i15);
            } else {
                k0Var2.a(0);
                k0Var.a(i17);
            }
        }
    }

    public final Integer[] b(int i14) {
        int i15;
        Integer[] numArrI = m.i(l3.f23129g.format(this.f28852i.a() + 0.01d));
        int iIntValue = 0;
        Integer num = numArrI[0];
        e0 e0Var = this.f28856m;
        int i16 = e0Var.f18789b;
        if (i14 == i16) {
            if (num != null && i14 == num.intValue()) {
                Integer num2 = numArrI[1];
                num2.getClass();
                iIntValue = num2.intValue();
            }
            i15 = e0Var.f18790c;
        } else {
            if (num != null && i14 == num.intValue()) {
                Integer num3 = numArrI[1];
                num3.getClass();
                iIntValue = num3.intValue();
            } else {
                int i17 = e0Var.f18789b;
                if (i14 >= i17 && i14 > i17) {
                    i15 = e0Var.f18790c;
                }
            }
            i15 = 99;
        }
        num.getClass();
        return new Integer[]{num, Integer.valueOf(i16), Integer.valueOf(iIntValue), Integer.valueOf(i15)};
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01ec  */
    public final int c(ActivityDetailChartDTO activityDetailChartDTO, im.b bVar, String str, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar2, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar) {
        Object next;
        int i14 = -1;
        if ((bVar2 != null || aVar != null) && bVar != null) {
            List<o20.a> list = bVar.f94122l;
            Double dE = e(bVar2, aVar);
            if (dE != null) {
                double dDoubleValue = dE.doubleValue();
                list.getClass();
                int size = list.size() - 1;
                int i15 = size / 2;
                int i16 = 0;
                while (i16 <= size) {
                    if (dDoubleValue == list.get(i15).C()) {
                        return i15;
                    }
                    if (dDoubleValue < list.get(i15).C()) {
                        size = i15 - 1;
                    } else {
                        i16 = i15 + 1;
                    }
                    i15 = (i16 + size) / 2;
                }
                if (list.size() > 1) {
                    if (i15 == 0) {
                        return Math.abs(list.get(0).C() - dDoubleValue) < Math.abs(list.get(1).C() - dDoubleValue) ? 0 : 1;
                    }
                    if (i15 == list.size() - 1) {
                        int i17 = i15 - 1;
                        if (Math.abs(list.get(i15).C() - dDoubleValue) >= Math.abs(list.get(i17).C() - dDoubleValue)) {
                            return i17;
                        }
                    } else {
                        int i18 = i15 - 1;
                        double dAbs = Math.abs(list.get(i18).C() - dDoubleValue);
                        double dAbs2 = Math.abs(list.get(i15).C() - dDoubleValue);
                        int i19 = i15 + 1;
                        double dAbs3 = Math.abs(list.get(i19).C() - dDoubleValue);
                        if (dAbs <= dAbs2 && dAbs <= dAbs3) {
                            return i18;
                        }
                        if (dAbs2 >= dAbs || dAbs2 > dAbs3) {
                            return i19;
                        }
                    }
                    return i15;
                }
            }
        } else if (activityDetailChartDTO != null) {
            List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
            int iH = activityDetailChartDTO.H(str);
            Double dE2 = e(bVar2, aVar);
            if (iH != -1 && listC != null && !listC.isEmpty() && dE2 != null) {
                int size2 = listC.size() - 1;
                int i24 = 0;
                while (i24 <= size2) {
                    int i25 = (i24 + size2) / 2;
                    List<Double> listC2 = listC.get(i25).C();
                    listC2.getClass();
                    if (dE2.doubleValue() > listC2.get(iH).doubleValue()) {
                        i24 = i25 + 1;
                    } else {
                        if (dE2.doubleValue() >= listC2.get(iH).doubleValue()) {
                            return i25;
                        }
                        size2 = i25 - 1;
                    }
                }
                int iF = t.f(i24, x.i(listC));
                if (listC.size() > 1) {
                    if (iF == 0) {
                        i14 = Math.abs(listC.get(0).C().get(iH).doubleValue() - dE2.doubleValue()) < Math.abs(listC.get(1).C().get(iH).doubleValue() - dE2.doubleValue()) ? 0 : 1;
                    } else if (iF == listC.size() - 1) {
                        i14 = iF - 1;
                        if (Math.abs(listC.get(iF).C().get(iH).doubleValue() - dE2.doubleValue()) < Math.abs(listC.get(i14).C().get(iH).doubleValue() - dE2.doubleValue())) {
                            i14 = iF;
                        }
                    } else {
                        i14 = iF - 1;
                        double dAbs4 = Math.abs(listC.get(i14).C().get(iH).doubleValue() - dE2.doubleValue());
                        double dAbs5 = Math.abs(listC.get(iF).C().get(iH).doubleValue() - dE2.doubleValue());
                        int i26 = iF + 1;
                        double dAbs6 = Math.abs(listC.get(i26).C().get(iH).doubleValue() - dE2.doubleValue());
                        if (dAbs4 > dAbs5 || dAbs4 > dAbs6) {
                            if (dAbs5 >= dAbs4 || dAbs5 > dAbs6) {
                                i14 = i26;
                            } else {
                                i14 = iF;
                            }
                        }
                    }
                }
                if (aVar != null && listC.size() > 1) {
                    Integer[] numArrC = this.f28853j.c();
                    if (numArrC.length == 3) {
                        Integer num = numArrC[0];
                        char c14 = b2.f23010b;
                        Integer num2 = numArrC[1];
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(num);
                        sb3.append(c14);
                        sb3.append(num2);
                        String string = sb3.toString();
                        m3.a aVar2 = m3.f23147f;
                        int iIntValue = numArrC[2].intValue();
                        aVar2.getClass();
                        Iterator<T> it = m3.f23159r.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((m3) next).f23164e != iIntValue);
                        m3 m3Var = (m3) next;
                        if (m3Var != null) {
                            int size3 = listC.size();
                            while (iF < size3) {
                                l3.a aVar3 = l3.f23124b;
                                Double d14 = listC.get(iF).C().get(iH);
                                d14.getClass();
                                double dDoubleValue2 = d14.doubleValue();
                                DecimalFormat decimalFormat = l3.f23129g;
                                aVar3.getClass();
                                if (!l3.a.R(null, dDoubleValue2, m3Var, decimalFormat, false, null).equals(string)) {
                                    break;
                                }
                                i14 = iF;
                                iF++;
                            }
                        }
                    }
                }
            }
        }
        return i14;
    }

    public final Double e(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar) {
        if (bVar != null) {
            int i14 = b.f28859a[bVar.ordinal()];
            if (i14 == 1) {
                return Double.valueOf(this.f28844a.f18822a);
            }
            if (i14 == 2) {
                return Double.valueOf(this.f28845b.f18822a);
            }
            if (i14 == 3) {
                return Double.valueOf(this.f28846c.f18822a);
            }
            u0.r();
            return null;
        }
        if (aVar == null) {
            return null;
        }
        int i15 = b.f28860b[aVar.ordinal()];
        if (i15 == 1) {
            return Double.valueOf(this.f28851h.f18788a);
        }
        if (i15 == 2) {
            return Double.valueOf(this.f28852i.f18788a);
        }
        if (i15 == 3) {
            return Double.valueOf(this.f28853j.f18788a);
        }
        u0.r();
        return null;
    }

    public final String g(Context context, com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar, x0 x0Var, boolean z14) {
        aVar.getClass();
        int i14 = b.f28860b[aVar.ordinal()];
        if (i14 == 1) {
            return this.f28851h.b(context, x0Var, z14);
        }
        if (i14 == 2) {
            return this.f28852i.b(context, x0Var, z14);
        }
        if (i14 == 3) {
            return this.f28853j.b(context, x0Var, z14);
        }
        u0.r();
        return null;
    }

    public final a h(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar, Context context) {
        k0 k0Var;
        bVar.getClass();
        int i14 = b.f28859a[bVar.ordinal()];
        if (i14 == 1) {
            k0Var = this.f28844a;
        } else if (i14 == 2) {
            k0Var = this.f28845b;
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            k0Var = this.f28846c;
        }
        int i15 = k0Var.f18823b;
        int i16 = k0Var.f18824c;
        int i17 = k0Var.f18825d;
        if (i15 == 0) {
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return new a(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i16), Integer.valueOf(i17)}, 2)), i16 + " minutes " + i17 + " seconds");
        }
        String str = LocalTime.of(i15, i16, i17).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        str.getClass();
        String string = context.getString(R.string.lbl_hours);
        String string2 = context.getString(R.string.audio_prompts_Minutes);
        String string3 = context.getString(R.string.audio_prompts_seconds);
        StringBuilder sbR = wr.g.r(i15, "$", StringUtils.SPACE, string, StringUtils.SPACE);
        wr.g.t(i16, StringUtils.SPACE, string2, StringUtils.SPACE, sbR);
        sbR.append(i17);
        sbR.append(StringUtils.SPACE);
        sbR.append(string3);
        sbR.append("  ");
        return new a(str, sbR.toString());
    }

    public final Integer[] j(int i14) {
        Integer[] numArrI = m.i(l3.f23129g.format(this.f28853j.a() - 0.01d));
        e0 e0Var = this.f28855l;
        int i15 = e0Var.f18789b;
        int i16 = 0;
        Integer num = numArrI[0];
        int iIntValue = 99;
        if (i14 == i15) {
            i16 = e0Var.f18790c;
            if (num != null && i14 == num.intValue()) {
                Integer num2 = numArrI[1];
                num2.getClass();
                iIntValue = num2.intValue();
            }
        } else if (num != null && i14 == num.intValue()) {
            Integer num3 = numArrI[1];
            num3.getClass();
            iIntValue = num3.intValue();
        } else {
            numArrI[0].intValue();
        }
        Integer numValueOf = Integer.valueOf(i15);
        num.getClass();
        return new Integer[]{numValueOf, num, Integer.valueOf(i16), Integer.valueOf(iIntValue)};
    }

    public final Integer[] k(int i14) {
        int iIntValue;
        int i15;
        Integer[] numArrI = m.i(l3.f23129g.format(this.f28855l.a() + 0.01d));
        e0 e0Var = this.f28856m;
        int i16 = e0Var.f18789b;
        if (i14 == i16) {
            i15 = e0Var.f18790c;
            Integer num = numArrI[0];
            if (num != null && i14 == num.intValue()) {
                Integer num2 = numArrI[1];
                num2.getClass();
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            Integer num3 = numArrI[0];
            if (num3 != null && i14 == num3.intValue()) {
                Integer num4 = numArrI[1];
                num4.getClass();
                int iIntValue2 = num4.intValue();
                i15 = i14 == e0Var.f18789b ? e0Var.f18790c : 99;
                iIntValue = iIntValue2;
            } else {
                int i17 = e0Var.f18789b;
                iIntValue = 0;
                i15 = 99;
            }
        }
        return new Integer[]{0, Integer.valueOf(i16), Integer.valueOf(iIntValue), Integer.valueOf(i15)};
    }

    public final void l(m3 m3Var, boolean z14) {
        e0 e0Var = this.f28856m;
        e0 e0Var2 = this.f28855l;
        e0 e0Var3 = this.f28853j;
        e0 e0Var4 = this.f28852i;
        e0 e0Var5 = this.f28851h;
        if (z14) {
            e0Var5.d(m3Var);
            e0Var4.d(m3Var);
            e0Var3.d(m3Var);
            e0Var2.d(m3Var);
            e0Var.d(m3Var);
            return;
        }
        e0Var5.f(m3Var);
        e0Var4.f(m3Var);
        e0Var3.f(m3Var);
        e0Var2.f(m3Var);
        e0Var.f(m3Var);
    }

    public final void m(double d14) {
        double d15 = this.f28856m.f18788a;
        if (d14 >= d15) {
            d14 = d15;
        }
        m3 m3Var = this.f28850g;
        e0 e0Var = this.f28853j;
        e0Var.e(d14, m3Var);
        this.f28851h.e(Math.abs(e0Var.f18788a - this.f28852i.f18788a), this.f28850g);
    }

    public final Integer[] n(int i14, int i15, k0 k0Var) {
        k0 k0Var2 = this.f28848e;
        int i16 = k0Var2.f18824c;
        int i17 = k0Var.f18824c;
        int i18 = k0Var2.f18823b;
        int i19 = 59;
        int i24 = 0;
        if (i14 == i18 && i14 == k0Var.f18823b) {
            if (i15 < i17) {
                i15 = i17;
            } else if (i15 > i16) {
                i15 = i16;
            }
            if (i15 == i16 && i15 == i17) {
                i24 = k0Var.f18825d;
                i19 = k0Var2.f18825d;
            } else if (i15 == i16) {
                i19 = k0Var2.f18825d;
            } else if (i15 == i17) {
                i24 = k0Var.f18825d;
            }
        } else {
            if (i14 == i18) {
                if (i15 < 0) {
                    i15 = 0;
                } else if (i15 > i16) {
                    i15 = i16;
                }
                if (i15 == i16) {
                    i19 = k0Var2.f18825d;
                }
            } else if (i14 == k0Var.f18823b) {
                if (i15 < i17) {
                    i15 = i17;
                } else if (i15 > 59) {
                    i15 = 59;
                }
                i24 = i15 == i17 ? k0Var.f18825d : 0;
                i16 = 59;
            } else {
                i16 = 59;
            }
            i17 = 0;
        }
        return new Integer[]{Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i24), Integer.valueOf(i19)};
    }

    public final void p(double d14) {
        double d15 = this.f28855l.f18788a;
        if (d14 <= d15) {
            d14 = d15;
        }
        m3 m3Var = this.f28850g;
        e0 e0Var = this.f28852i;
        e0Var.e(d14, m3Var);
        this.f28851h.e(Math.abs(this.f28853j.f18788a - e0Var.f18788a), this.f28850g);
    }

    public final void r(double d14) {
        e0 e0Var = this.f28856m;
        double d15 = e0Var.f18788a;
        if (d14 >= d15) {
            d14 = d15;
        }
        this.f28851h.e(d14, this.f28850g);
        e0 e0Var2 = this.f28852i;
        double d16 = e0Var2.f18788a + d14;
        double d17 = e0Var.f18788a;
        e0 e0Var3 = this.f28853j;
        if (d16 <= d17) {
            e0Var3.e(d16, this.f28850g);
        } else {
            e0Var2.e(0.0d, this.f28850g);
            e0Var3.e(d14, this.f28850g);
        }
    }

    public final Integer[] t(int i14, int i15) {
        int i16;
        int i17;
        k0 k0Var = this.f28846c;
        int i18 = k0Var.f18822a;
        if (i18 > 0) {
            k0Var = new k0(i18 - 1, 0, 0, 0, 14, null);
        }
        k0 k0Var2 = this.f28847d;
        int i19 = 0;
        int i24 = 59;
        if (i14 == k0Var2.f18823b) {
            int i25 = k0Var2.f18824c;
            int i26 = i14 == k0Var.f18823b ? k0Var.f18824c : 59;
            if (i15 < i25) {
                i15 = i25;
            } else if (i15 > i26) {
                i15 = i26;
            }
            if (i15 == i25) {
                i19 = k0Var2.f18825d;
                if (i15 == k0Var.f18824c) {
                    i24 = k0Var.f18825d;
                }
            } else if (i15 == k0Var.f18824c) {
                i24 = k0Var.f18825d;
            }
            i17 = i24;
            i24 = i26;
            i16 = i19;
            i19 = i25;
        } else if (i14 == k0Var.f18823b) {
            int i27 = k0Var.f18824c;
            if (i15 < 0) {
                i15 = 0;
            } else if (i15 > i27) {
                i15 = i27;
            }
            i17 = i15 == i27 ? k0Var.f18825d : 59;
            i24 = i27;
            i16 = 0;
        } else {
            i16 = 0;
            i17 = 59;
        }
        return new Integer[]{Integer.valueOf(i19), Integer.valueOf(i24), Integer.valueOf(i16), Integer.valueOf(i17)};
    }

    public /* synthetic */ c(int i14, int i15, int i16, double d14, double d15, double d16, k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4, k0 k0Var5, int i17, j jVar) {
        this(i14, i15, i16, d14, d15, d16, (i17 & 64) != 0 ? new k0(i14, 0, 0, 0, 14, null) : k0Var, (i17 & 128) != 0 ? new k0(i15, 0, 0, 0, 14, null) : k0Var2, (i17 & 256) != 0 ? new k0(i16, 0, 0, 0, 14, null) : k0Var3, (i17 & 512) != 0 ? new k0(0, 0, 0, 0, 14, null) : k0Var4, (i17 & 1024) != 0 ? new k0(i16, 0, 0, 0, 14, null) : k0Var5);
    }
}
