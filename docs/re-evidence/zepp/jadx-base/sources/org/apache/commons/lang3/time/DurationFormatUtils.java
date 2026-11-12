package org.apache.commons.lang3.time;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes23.dex */
public class DurationFormatUtils {
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
    public static final Object a = "y";
    public static final Object b = "M";
    public static final Object c = GoogleApiAvailabilityLight.a;
    public static final Object d = "H";
    public static final Object e = "m";
    public static final Object f = SOAP.XMLNS;
    public static final Object g = ExifInterface.LATITUDE_SOUTH;

    public static String a(a[] aVarArr, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        int i;
        a[] aVarArr2 = aVarArr;
        StringBuilder sb = new StringBuilder();
        int length = aVarArr2.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            a aVar = aVarArr2[i2];
            Object objC = aVar.c();
            int iB = aVar.b();
            if (objC instanceof StringBuilder) {
                sb.append(objC.toString());
                length = length;
                i = i2;
            } else {
                if (objC.equals(a)) {
                    sb.append(c(j, z, iB));
                    i = i2;
                } else if (objC.equals(b)) {
                    i = i2;
                    sb.append(c(j2, z, iB));
                } else {
                    i = i2;
                    if (objC.equals(c)) {
                        sb.append(c(j3, z, iB));
                    } else if (objC.equals(d)) {
                        sb.append(c(j4, z, iB));
                    } else if (objC.equals(e)) {
                        sb.append(c(j5, z, iB));
                    } else if (objC.equals(f)) {
                        length = length;
                        sb.append(c(j6, z, iB));
                        z2 = true;
                    } else {
                        length = length;
                        if (objC.equals(g)) {
                            if (z2) {
                                sb.append(c(j7, true, z ? Math.max(3, iB) : 3));
                            } else {
                                sb.append(c(j7, z, iB));
                            }
                            z2 = false;
                        }
                    }
                    i2 = i + 1;
                    length = length;
                    aVarArr2 = aVarArr;
                }
                z2 = false;
            }
            i2 = i + 1;
            length = length;
            aVarArr2 = aVarArr;
        }
        return sb.toString();
    }

    public static a[] b(String str) {
        Object obj;
        ArrayList arrayList = new ArrayList(str.length());
        StringBuilder sb = null;
        a aVar = null;
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!z || cCharAt == '\'') {
                if (cCharAt != '\'') {
                    if (cCharAt == 'H') {
                        obj = d;
                    } else if (cCharAt == 'M') {
                        obj = b;
                    } else if (cCharAt == 'S') {
                        obj = g;
                    } else if (cCharAt == 'd') {
                        obj = c;
                    } else if (cCharAt == 'm') {
                        obj = e;
                    } else if (cCharAt == 's') {
                        obj = f;
                    } else if (cCharAt != 'y') {
                        if (sb == null) {
                            sb = new StringBuilder();
                            arrayList.add(new a(sb));
                        }
                        sb.append(cCharAt);
                        obj = null;
                    } else {
                        obj = a;
                    }
                } else if (z) {
                    sb = null;
                    obj = null;
                    z = false;
                } else {
                    sb = new StringBuilder();
                    arrayList.add(new a(sb));
                    z = true;
                    obj = null;
                }
                if (obj != null) {
                    if (aVar == null || !aVar.c().equals(obj)) {
                        a aVar2 = new a(obj);
                        arrayList.add(aVar2);
                        aVar = aVar2;
                    } else {
                        aVar.d();
                    }
                    sb = null;
                }
            } else {
                sb.append(cCharAt);
            }
        }
        if (!z) {
            return (a[]) arrayList.toArray(new a[arrayList.size()]);
        }
        throw new IllegalArgumentException("Unmatched quote in format: " + str);
    }

    private static String c(long j, boolean z, int i) {
        String string = Long.toString(j);
        return z ? StringUtils.leftPad(string, i, '0') : string;
    }

    public static String formatDuration(long j, String str) {
        return formatDuration(j, str, true);
    }

    public static String formatDurationHMS(long j) {
        return formatDuration(j, "HH:mm:ss.SSS");
    }

    public static String formatDurationISO(long j) {
        return formatDuration(j, ISO_EXTENDED_FORMAT_PATTERN, false);
    }

    public static String formatDurationWords(long j, boolean z, boolean z2) {
        String duration = formatDuration(j, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z) {
            duration = " " + duration;
            String strReplaceOnce = StringUtils.replaceOnce(duration, " 0 days", "");
            if (strReplaceOnce.length() != duration.length()) {
                String strReplaceOnce2 = StringUtils.replaceOnce(strReplaceOnce, " 0 hours", "");
                if (strReplaceOnce2.length() != strReplaceOnce.length()) {
                    duration = StringUtils.replaceOnce(strReplaceOnce2, " 0 minutes", "");
                    if (duration.length() != duration.length()) {
                        duration = StringUtils.replaceOnce(duration, " 0 seconds", "");
                    }
                } else {
                    duration = strReplaceOnce;
                }
            }
            if (duration.length() != 0) {
                duration = duration.substring(1);
            }
        }
        if (z2) {
            String strReplaceOnce3 = StringUtils.replaceOnce(duration, " 0 seconds", "");
            if (strReplaceOnce3.length() != duration.length()) {
                duration = StringUtils.replaceOnce(strReplaceOnce3, " 0 minutes", "");
                if (duration.length() != strReplaceOnce3.length()) {
                    String strReplaceOnce4 = StringUtils.replaceOnce(duration, " 0 hours", "");
                    if (strReplaceOnce4.length() != duration.length()) {
                        duration = StringUtils.replaceOnce(strReplaceOnce4, " 0 days", "");
                    }
                } else {
                    duration = strReplaceOnce3;
                }
            }
        }
        return StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(" " + duration, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String formatPeriod(long j, long j2, String str) {
        return formatPeriod(j, j2, str, true, TimeZone.getDefault());
    }

    public static String formatPeriodISO(long j, long j2) {
        return formatPeriod(j, j2, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }

    public static String formatDuration(long j, String str, boolean z) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        Validate.inclusiveBetween(0L, Long.MAX_VALUE, j, "durationMillis must not be negative");
        a[] aVarArrB = b(str);
        if (a.a(aVarArrB, c)) {
            long j8 = j / 86400000;
            j2 = j - (86400000 * j8);
            j3 = j8;
        } else {
            j2 = j;
            j3 = 0;
        }
        if (a.a(aVarArrB, d)) {
            long j9 = j2 / 3600000;
            j2 -= 3600000 * j9;
            j4 = j9;
        } else {
            j4 = 0;
        }
        if (a.a(aVarArrB, e)) {
            long j10 = j2 / 60000;
            j2 -= 60000 * j10;
            j5 = j10;
        } else {
            j5 = 0;
        }
        if (a.a(aVarArrB, f)) {
            long j11 = j2 / 1000;
            j7 = j2 - (1000 * j11);
            j6 = j11;
        } else {
            j6 = 0;
            j7 = j2;
        }
        return a(aVarArrB, 0L, 0L, j3, j4, j5, j6, j7, z);
    }

    public static String formatPeriod(long j, long j2, String str, boolean z, TimeZone timeZone) {
        int i = 0;
        Validate.isTrue(j <= j2, "startMillis must not be greater than endMillis", new Object[0]);
        a[] aVarArrB = b(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j2));
        int i2 = calendar2.get(14) - calendar.get(14);
        int i3 = calendar2.get(13) - calendar.get(13);
        int i4 = calendar2.get(12) - calendar.get(12);
        int i5 = calendar2.get(11) - calendar.get(11);
        int actualMaximum = calendar2.get(5) - calendar.get(5);
        int i6 = calendar2.get(2) - calendar.get(2);
        int i7 = calendar2.get(1) - calendar.get(1);
        while (i2 < 0) {
            i2 += 1000;
            i3--;
        }
        while (i3 < 0) {
            i3 += 60;
            i4--;
        }
        while (i4 < 0) {
            i4 += 60;
            i5--;
        }
        while (i5 < 0) {
            i5 += 24;
            actualMaximum--;
        }
        if (a.a(aVarArrB, b)) {
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i6--;
                calendar.add(2, 1);
            }
            while (i6 < 0) {
                i6 += 12;
                i7--;
            }
            if (!a.a(aVarArrB, a) && i7 != 0) {
                while (i7 != 0) {
                    i6 += i7 * 12;
                    i7 = 0;
                }
            }
        } else {
            if (!a.a(aVarArrB, a)) {
                int i8 = calendar2.get(1);
                if (i6 < 0) {
                    i8--;
                }
                while (calendar.get(1) != i8) {
                    int actualMaximum2 = actualMaximum + (calendar.getActualMaximum(6) - calendar.get(6));
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum2++;
                    }
                    calendar.add(1, 1);
                    actualMaximum = actualMaximum2 + calendar.get(6);
                }
                i7 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                actualMaximum += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i6 = 0;
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i6--;
                calendar.add(2, 1);
            }
        }
        if (!a.a(aVarArrB, c)) {
            i5 += actualMaximum * 24;
            actualMaximum = 0;
        }
        if (!a.a(aVarArrB, d)) {
            i4 += i5 * 60;
            i5 = 0;
        }
        if (!a.a(aVarArrB, e)) {
            i3 += i4 * 60;
            i4 = 0;
        }
        if (a.a(aVarArrB, f)) {
            i = i3;
        } else {
            i2 += i3 * 1000;
        }
        return a(aVarArrB, i7, i6, actualMaximum, i5, i4, i, i2, z);
    }

    public static class a {
        private final Object a;
        private int b;

        public a(Object obj) {
            this.a = obj;
            this.b = 1;
        }

        public static boolean a(a[] aVarArr, Object obj) {
            for (a aVar : aVarArr) {
                if (aVar.c() == obj) {
                    return true;
                }
            }
            return false;
        }

        public int b() {
            return this.b;
        }

        public Object c() {
            return this.a;
        }

        public void d() {
            this.b++;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.getClass() != aVar.a.getClass() || this.b != aVar.b) {
                return false;
            }
            Object obj2 = this.a;
            if (obj2 instanceof StringBuilder) {
                return obj2.toString().equals(aVar.a.toString());
            }
            if (obj2 instanceof Number) {
                return obj2.equals(aVar.a);
            }
            return obj2 == aVar.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return StringUtils.repeat(this.a.toString(), this.b);
        }

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }
    }
}
