package fz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import c22.j0;
import c22.p;
import com.garmin.android.apps.connectmobile.i2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Weeks;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p1.z;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfz/a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73959a = new a();

    private a() {
    }

    public static final double[] a(double d14, double d15, int i14, double d16, boolean z14) {
        double d17 = 0.0d;
        if (Math.abs(d14 - d15) < 1.0000000116860974E-7d) {
            return new double[]{0.0d, d14, d15, d15};
        }
        double[] dArr = {100.0d, 40.0d, 20.0d, 8.0d, 4.0d, 1.0d, 0.04d, 0.02d, 0.01d, 0.001d, 1.0E-4d, 1.0E-5d, 1.0E-6d, 1.0E-7d};
        double[] dArr2 = {2.0d, 1.0d, 0.5d, 0.2d, 0.1d, 0.05d, 0.01d, 0.005d, 5.0E-4d, 5.0E-5d, 5.0E-6d, 5.0E-7d, 5.0E-8d, 5.0E-9d};
        double dAbs = Math.abs(d15 - d14);
        for (int i15 = 0; i15 < 14; i15++) {
            if (dAbs >= dArr[i15]) {
                d17 = ((double) (i14 - 1)) * dArr2[i15];
                break;
            }
        }
        return d(d14, d15, i14, d16, d17, z14);
    }

    public static final double[] b(int i14, double d14, double d15, double d16) {
        double d17;
        double d18 = d14 - d15;
        if (Math.abs(d18) < 1.0000000116860974E-7d) {
            return new double[]{d14, d14, d15, d15};
        }
        int[] iArr = {60, 30, 15, 12, 10, 6, 5, 4, 3, 2, 1};
        double dAbs = Math.abs(d18);
        double d19 = ((double) iArr[10]) * ((double) (i14 - 1));
        for (int i15 = 0; i15 < 11; i15++) {
            double d24 = (((double) i14) - 1.0d) * ((double) iArr[i15]);
            if (dAbs > d24) {
                d17 = d24;
                return d(d14, d15, i14, d16, d17, false);
            }
        }
        d17 = d19;
        return d(d14, d15, i14, d16, d17, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ba  */
    public static ArrayList c(DateTime dateTime, DateTime dateTime2, int i14, boolean z14, DateTimeFormatter dateTimeFormatter) {
        dateTime.getClass();
        dateTime2.getClass();
        if (dateTime.isAfter(dateTime2)) {
            i2.a.j(i2.f36769a, "MPChartUtil", "getDailyXAxisDateValues: start date " + dateTime + " cannot be after end date " + dateTime2);
            return new ArrayList();
        }
        int iAbs = (int) (Math.abs(Days.daysBetween(dateTime, dateTime2).getDays()) + ((double) 1));
        ArrayList arrayList = new ArrayList(i14);
        float f14 = 1.0f / (i14 * 2);
        float f15 = ((long) iAbs) * 86400000;
        DateTime dateTimePlus = dateTime.plus((long) (f15 * f14));
        dateTimePlus.getClass();
        arrayList.add(dateTimePlus);
        for (int i15 = 1; i15 < i14; i15++) {
            if (z14) {
                DateTime dateTimePlus2 = dateTimePlus.plus((long) (i15 * 2 * f14 * f15));
                dateTimePlus2.getClass();
                arrayList.add(dateTimePlus2);
            } else {
                DateTime dateTimePlusMonths = dateTimePlus.plusMonths(i15);
                dateTimePlusMonths.getClass();
                arrayList.add(dateTimePlusMonths);
            }
        }
        ArrayList arrayList2 = new ArrayList(iAbs);
        int i16 = 0;
        while (!dateTime.isAfter(dateTime2)) {
            if (i16 < arrayList.size()) {
                j0 j0Var = j0.f23099a;
                DateTime dateTime3 = (DateTime) arrayList.get(i16);
                j0Var.getClass();
                if (j0.F(dateTime, dateTime3)) {
                    if (dateTimeFormatter != null) {
                        arrayList2.add(j0.h(dateTime, dateTimeFormatter));
                    } else {
                        arrayList2.add(j0.k(dateTime, 'S'));
                    }
                    i16++;
                } else {
                    arrayList2.add("");
                }
            } else {
                arrayList2.add("");
            }
            dateTime = dateTime.plusDays(1);
            dateTime.getClass();
        }
        return arrayList2;
    }

    public static final double[] d(double d14, double d15, int i14, double d16, double d17, boolean z14) {
        double d18;
        double d19;
        boolean z15;
        int i15 = i14 - 1;
        int i16 = 0;
        if (d14 > d15) {
            z15 = true;
            d19 = d14;
            d18 = d15;
        } else {
            d18 = d14;
            d19 = d15;
            z15 = false;
        }
        double d24 = (d19 - d18) * d16;
        double d25 = d18 - d24;
        double d26 = (d14 > 0.0d || d15 > 0.0d) ? d19 + d24 : d19 + d16;
        double[] dArr = new double[i14];
        double d27 = i15;
        double d28 = d17 / d27;
        double d29 = (d28 - (d25 % d28)) + d25;
        dArr[0] = d29;
        if (!z14 && d29 < 0.0d) {
            dArr[0] = 0.0d;
        }
        double dFloor = ((double) ((int) Math.floor(((double) ((int) Math.floor((d26 - d25) / d28))) / d27))) * d28;
        int i17 = 1;
        while (i17 < i14) {
            dArr[i17] = (((double) i17) * dFloor) + dArr[i16];
            i17++;
            i16 = i16;
        }
        int i18 = i16;
        double dMax = Math.max(d26, dArr[i15]);
        double[] dArr2 = new double[i14 + 2];
        if (!z15) {
            if (!z14 && d25 < 0.0d) {
                d25 = 0.0d;
            }
            dArr2[i18] = d25;
            System.arraycopy(dArr, i18, dArr2, 1, i14);
            dArr2[i14 + 1] = dMax;
            return dArr2;
        }
        dArr2[i18] = dMax;
        int i19 = i14 + 1;
        for (int i24 = 1; i24 < i19; i24++) {
            dArr2[i24] = dArr[i14 - i24];
        }
        if (!z14 && d25 < 0.0d) {
            d25 = 0.0d;
        }
        dArr2[i19] = d25;
        return dArr2;
    }

    @SuppressLint({"SwitchIntDef"})
    public static final List<String> e(Context context, int i14, DateTime dateTime, DateTime dateTime2, DateTimeFormatter dateTimeFormatter) {
        dateTime.getClass();
        dateTime2.getClass();
        dateTimeFormatter.getClass();
        if (i14 == 0) {
            return c02.a.c(dateTime, dateTime2);
        }
        if (i14 == 1) {
            return c02.a.e(dateTime, dateTime2, dateTimeFormatter);
        }
        int i15 = 0;
        if (i14 != 2) {
            if (i14 == 3) {
                int weeks = Weeks.weeksBetween(dateTime.toLocalDate(), dateTime2.toLocalDate()).getWeeks();
                z zVar = new z(weeks);
                String strPrint = dateTimeFormatter.print(dateTime.weekOfWeekyear().getDateTime());
                strPrint.getClass();
                zVar.f(0L, strPrint);
                DateTime dateTime3 = dateTime.plusWeeks(1).weekOfWeekyear().getDateTime();
                for (int i16 = 1; i16 < weeks; i16++) {
                    String strPrint2 = dateTimeFormatter.print(dateTime3);
                    strPrint2.getClass();
                    zVar.f(i16, strPrint2);
                    dateTime3 = dateTime3.plusWeeks(1);
                }
                long j8 = weeks;
                String strPrint3 = dateTimeFormatter.print(dateTime3);
                strPrint3.getClass();
                zVar.f(j8, strPrint3);
                p.f23187a.getClass();
                return p.b(zVar);
            }
            if (i14 == 4) {
                ArrayList arrayList = new ArrayList();
                if (context != null) {
                    while (dateTime.isBefore(dateTime2)) {
                        j0.f23099a.getClass();
                        String str = new SimpleDateFormat(DateFormat.is24HourFormat(context) ? "HH" : "ha", Locale.getDefault()).format(new Date(dateTime.getZone().getMillisKeepLocal(DateTimeZone.getDefault(), dateTime.getMillis())));
                        str.getClass();
                        arrayList.add(str);
                        dateTime = dateTime.plusHours(1);
                        dateTime.getClass();
                    }
                }
                return arrayList;
            }
            if (i14 != 5) {
                int days = Days.daysBetween(dateTime.toLocalDate(), dateTime2.toLocalDate()).getDays();
                int i17 = days + 1;
                z zVar2 = new z(i17);
                j0.f23099a.getClass();
                String strK = j0.k(dateTime, 'S');
                String strK2 = j0.k(dateTime2, 'S');
                while (i15 < i17) {
                    zVar2.f(i15, "");
                    i15++;
                }
                zVar2.f(0L, strK);
                zVar2.f(days, strK2);
                p.f23187a.getClass();
                return p.b(zVar2);
            }
        }
        int weeks2 = Weeks.weeksBetween(dateTime.toLocalDate(), dateTime2.toLocalDate()).getWeeks() + 1;
        z zVar3 = new z(weeks2);
        DateTime dateTime4 = dateTime.weekOfWeekyear().getDateTime();
        while (i15 < weeks2) {
            String strPrint4 = dateTimeFormatter.print(dateTime4);
            strPrint4.getClass();
            zVar3.f(i15, strPrint4);
            dateTime4 = dateTime4.plusWeeks(1);
            i15++;
        }
        p.f23187a.getClass();
        return p.b(zVar3);
    }

    public static o13.p f(int i14, double d14, double d15) {
        if (d14 < 0.0d || d15 < 0.0d) {
            h.s("minimum y and maximum y must be positive");
            return null;
        }
        double d16 = 10;
        int iFloor = (int) (Math.floor(d14 / d16) * d16);
        int iCeil = (int) (Math.ceil(d15 / d16) * d16);
        int i15 = i14 * 10;
        if (iFloor == iCeil) {
            double dFloor = (int) (Math.floor(((double) (i15 / 2)) / d16) * d16);
            double d17 = ((double) iFloor) - dFloor;
            if (d17 > 0.0d) {
                iFloor = (int) d17;
                i15 = (int) (((double) i15) - dFloor);
            }
            return new o13.p(Integer.valueOf(iFloor), Integer.valueOf(iCeil + i15));
        }
        int i16 = iCeil - iFloor;
        if (i16 % i15 == 0) {
            return new o13.p(Integer.valueOf(iFloor), Integer.valueOf(iCeil));
        }
        double d18 = i15;
        int iCeil2 = ((int) (Math.ceil(((double) i16) / d18) * d18)) - i16;
        int iFloor2 = (int) (Math.floor(((double) (iCeil2 / 2)) / d16) * d16);
        int i17 = iFloor - iFloor2;
        if (i17 > 0) {
            iCeil2 -= iFloor2;
            iFloor = i17;
        }
        return new o13.p(Integer.valueOf(iFloor), Integer.valueOf(iCeil + iCeil2));
    }

    public static double g(double d14) {
        double d15 = 10;
        return Math.floor(Math.abs(d14 / d15)) * d15;
    }

    public static double h(double d14) {
        double d15 = 10;
        return Math.ceil(Math.abs(d14 / d15)) * d15;
    }
}
