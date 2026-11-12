package org.apache.commons.lang.time;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrBuilder;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes23.dex */
public class DurationFormatUtils {
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";
    public static final Object a = "y";
    public static final Object b = "M";
    public static final Object c = GoogleApiAvailabilityLight.a;
    public static final Object d = "H";
    public static final Object e = "m";
    public static final Object f = SOAP.XMLNS;
    public static final Object g = ExifInterface.LATITUDE_SOUTH;

    public static String a(a[] aVarArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        StrBuilder strBuilder = new StrBuilder();
        int i8 = i7;
        boolean z2 = false;
        for (a aVar : aVarArr) {
            Object objC = aVar.c();
            int iB = aVar.b();
            if (objC instanceof StringBuffer) {
                strBuilder.append(objC.toString());
            } else {
                if (objC == a) {
                    String string = Integer.toString(i);
                    if (z) {
                        string = StringUtils.leftPad(string, iB, '0');
                    }
                    strBuilder.append(string);
                } else if (objC == b) {
                    String string2 = Integer.toString(i2);
                    if (z) {
                        string2 = StringUtils.leftPad(string2, iB, '0');
                    }
                    strBuilder.append(string2);
                } else if (objC == c) {
                    String string3 = Integer.toString(i3);
                    if (z) {
                        string3 = StringUtils.leftPad(string3, iB, '0');
                    }
                    strBuilder.append(string3);
                } else if (objC == d) {
                    String string4 = Integer.toString(i4);
                    if (z) {
                        string4 = StringUtils.leftPad(string4, iB, '0');
                    }
                    strBuilder.append(string4);
                } else if (objC == e) {
                    String string5 = Integer.toString(i5);
                    if (z) {
                        string5 = StringUtils.leftPad(string5, iB, '0');
                    }
                    strBuilder.append(string5);
                } else if (objC == f) {
                    String string6 = Integer.toString(i6);
                    if (z) {
                        string6 = StringUtils.leftPad(string6, iB, '0');
                    }
                    strBuilder.append(string6);
                    z2 = true;
                } else if (objC == g) {
                    if (z2) {
                        i8 += 1000;
                        String string7 = Integer.toString(i8);
                        if (z) {
                            string7 = StringUtils.leftPad(string7, iB, '0');
                        }
                        strBuilder.append(string7.substring(1));
                    } else {
                        String string8 = Integer.toString(i8);
                        if (z) {
                            string8 = StringUtils.leftPad(string8, iB, '0');
                        }
                        strBuilder.append(string8);
                    }
                }
                z2 = false;
            }
        }
        return strBuilder.toString();
    }

    public static a[] b(String str) {
        Object obj;
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList(charArray.length);
        StringBuffer stringBuffer = null;
        a aVar = null;
        boolean z = false;
        for (char c2 : charArray) {
            if (!z || c2 == '\'') {
                if (c2 != '\'') {
                    if (c2 == 'H') {
                        obj = d;
                    } else if (c2 == 'M') {
                        obj = b;
                    } else if (c2 == 'S') {
                        obj = g;
                    } else if (c2 == 'd') {
                        obj = c;
                    } else if (c2 == 'm') {
                        obj = e;
                    } else if (c2 == 's') {
                        obj = f;
                    } else if (c2 != 'y') {
                        if (stringBuffer == null) {
                            stringBuffer = new StringBuffer();
                            arrayList.add(new a(stringBuffer));
                        }
                        stringBuffer.append(c2);
                        obj = null;
                    } else {
                        obj = a;
                    }
                } else if (z) {
                    stringBuffer = null;
                    obj = null;
                    z = false;
                } else {
                    stringBuffer = new StringBuffer();
                    arrayList.add(new a(stringBuffer));
                    z = true;
                    obj = null;
                }
                if (obj != null) {
                    if (aVar == null || aVar.c() != obj) {
                        a aVar2 = new a(obj);
                        arrayList.add(aVar2);
                        aVar = aVar2;
                    } else {
                        aVar.d();
                    }
                    stringBuffer = null;
                }
            } else {
                stringBuffer.append(c2);
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    public static String formatDuration(long j, String str) {
        return formatDuration(j, str, true);
    }

    public static String formatDurationHMS(long j) {
        return formatDuration(j, "H:mm:ss.SSS");
    }

    public static String formatDurationISO(long j) {
        return formatDuration(j, ISO_EXTENDED_FORMAT_PATTERN, false);
    }

    public static String formatDurationWords(long j, boolean z, boolean z2) {
        String duration = formatDuration(j, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(duration);
            duration = stringBuffer.toString();
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
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        stringBuffer2.append(duration);
        return StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(stringBuffer2.toString(), " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String formatPeriod(long j, long j2, String str) {
        return formatPeriod(j, j2, str, true, TimeZone.getDefault());
    }

    public static String formatPeriodISO(long j, long j2) {
        return formatPeriod(j, j2, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }

    public static String formatDuration(long j, String str, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        a[] aVarArrB = b(str);
        if (a.a(aVarArrB, c)) {
            int i5 = (int) (j / 86400000);
            j -= ((long) i5) * 86400000;
            i = i5;
        } else {
            i = 0;
        }
        if (a.a(aVarArrB, d)) {
            int i6 = (int) (j / 3600000);
            j -= ((long) i6) * 3600000;
            i2 = i6;
        } else {
            i2 = 0;
        }
        if (a.a(aVarArrB, e)) {
            int i7 = (int) (j / 60000);
            j -= ((long) i7) * 60000;
            i3 = i7;
        } else {
            i3 = 0;
        }
        if (a.a(aVarArrB, f)) {
            int i8 = (int) (j / 1000);
            j -= ((long) i8) * 1000;
            i4 = i8;
        } else {
            i4 = 0;
        }
        return a(aVarArrB, 0, 0, i, i2, i3, i4, a.a(aVarArrB, g) ? (int) j : 0, z);
    }

    public static String formatPeriod(long j, long j2, String str, boolean z, TimeZone timeZone) {
        int i;
        int i2;
        int i3;
        a[] aVarArrB = b(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j2));
        int i4 = calendar2.get(14) - calendar.get(14);
        int i5 = calendar2.get(13) - calendar.get(13);
        int i6 = calendar2.get(12) - calendar.get(12);
        int i7 = calendar2.get(11) - calendar.get(11);
        int actualMaximum = calendar2.get(5) - calendar.get(5);
        int i8 = calendar2.get(2) - calendar.get(2);
        int i9 = calendar2.get(1) - calendar.get(1);
        while (i4 < 0) {
            i4 += 1000;
            i5--;
        }
        while (i5 < 0) {
            i5 += 60;
            i6--;
        }
        while (i6 < 0) {
            i6 += 60;
            i7--;
        }
        while (i7 < 0) {
            i7 += 24;
            actualMaximum--;
        }
        int i10 = 0;
        if (a.a(aVarArrB, b)) {
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i8--;
                calendar.add(2, 1);
            }
            while (i8 < 0) {
                i8 += 12;
                i9--;
            }
            if (!a.a(aVarArrB, a) && i9 != 0) {
                while (i9 != 0) {
                    i8 += i9 * 12;
                    i9 = 0;
                }
            }
            i = i8;
        } else {
            if (!a.a(aVarArrB, a)) {
                int i11 = calendar2.get(1);
                if (i8 < 0) {
                    i11--;
                }
                while (calendar.get(1) != i11) {
                    int actualMaximum2 = actualMaximum + (calendar.getActualMaximum(6) - calendar.get(6));
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum2++;
                    }
                    calendar.add(1, 1);
                    actualMaximum = actualMaximum2 + calendar.get(6);
                }
                i9 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                actualMaximum += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i = 0;
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i--;
                calendar.add(2, 1);
            }
        }
        int i12 = i9;
        if (a.a(aVarArrB, c)) {
            i2 = actualMaximum;
        } else {
            i7 += actualMaximum * 24;
            i2 = 0;
        }
        if (!a.a(aVarArrB, d)) {
            i6 += i7 * 60;
            i7 = 0;
        }
        if (!a.a(aVarArrB, e)) {
            i5 += i6 * 60;
            i6 = 0;
        }
        if (a.a(aVarArrB, f)) {
            i3 = i4;
            i10 = i5;
        } else {
            i3 = i4 + (i5 * 1000);
        }
        return a(aVarArrB, i12, i, i2, i7, i6, i10, i3, z);
    }

    public static class a {
        private Object a;
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
            if (obj2 instanceof StringBuffer) {
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
