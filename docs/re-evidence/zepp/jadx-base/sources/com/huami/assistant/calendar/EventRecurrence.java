package com.huami.assistant.calendar;

import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class EventRecurrence {
    public static final int DAILY = 4;
    public static final int FR = 2097152;
    public static final int HOURLY = 3;
    public static final int MINUTELY = 2;
    public static final int MO = 131072;
    public static final int MONTHLY = 6;
    public static final int SA = 4194304;
    public static final int SECONDLY = 1;
    public static final int SU = 65536;
    public static final int TH = 1048576;
    public static final int TU = 262144;
    public static final int WE = 524288;
    public static final int WEEKLY = 5;
    public static final int YEARLY = 7;
    private static String a = "EventRecur";
    private static HashMap<String, o> b = null;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 4;
    private static final int f = 8;
    private static final int g = 16;
    private static final int h = 32;
    private static final int i = 64;
    private static final int j = 128;
    private static final int k = 256;
    private static final int l = 512;
    private static final int m = 1024;
    private static final int n = 2048;
    private static final int o = 4096;
    private static final int p = 8192;
    private static final HashMap<String, Integer> q;
    private static final HashMap<String, Integer> r;
    private static final boolean s = true;
    private static final boolean t = false;
    private static final boolean u = false;
    public int[] byday;
    public int bydayCount;
    public int[] bydayNum;
    public int[] byhour;
    public int byhourCount;
    public int[] byminute;
    public int byminuteCount;
    public int[] bymonth;
    public int bymonthCount;
    public int[] bymonthday;
    public int bymonthdayCount;
    public int[] bysecond;
    public int bysecondCount;
    public int[] bysetpos;
    public int bysetposCount;
    public int[] byweekno;
    public int byweeknoCount;
    public int[] byyearday;
    public int byyeardayCount;
    public int count;
    public int freq;
    public int interval;
    public Time startDate;
    public String until;
    public int wkst;

    public static class InvalidFormatException extends RuntimeException {
        public InvalidFormatException(String s) {
            super(s);
        }
    }

    public static class a extends o {
        private a() {
        }

        private static void d(String str, int[] byday, int[] bydayNum, int index) {
            String strSubstring;
            int length = str.length() - 2;
            if (length > 0) {
                bydayNum[index] = o.a(str.substring(0, length), -53, 53, false);
                strSubstring = str.substring(length);
            } else {
                strSubstring = str;
            }
            Integer num = (Integer) EventRecurrence.r.get(strSubstring);
            if (num != null) {
                byday[index] = num.intValue();
                return;
            }
            throw new InvalidFormatException("Invalid BYDAY value: " + str);
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArr;
            int[] iArr2;
            int length = 1;
            if (value.indexOf(",") < 0) {
                iArr = new int[1];
                iArr2 = new int[1];
                d(value, iArr, iArr2, 0);
            } else {
                String[] strArrSplit = value.split(",");
                length = strArrSplit.length;
                iArr = new int[length];
                iArr2 = new int[length];
                for (int i = 0; i < length; i++) {
                    d(strArrSplit[i], iArr, iArr2, i);
                }
            }
            er.byday = iArr;
            er.bydayNum = iArr2;
            er.bydayCount = length;
            return 128;
        }
    }

    public static class b extends o {
        private b() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, 0, 23, true);
            er.byhour = iArrB;
            er.byhourCount = iArrB.length;
            return 64;
        }
    }

    public static class c extends o {
        private c() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, 0, 59, true);
            er.byminute = iArrB;
            er.byminuteCount = iArrB.length;
            return 32;
        }
    }

    public static class d extends o {
        private d() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, 1, 12, false);
            er.bymonth = iArrB;
            er.bymonthCount = iArrB.length;
            return 2048;
        }
    }

    public static class e extends o {
        private e() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, -31, 31, false);
            er.bymonthday = iArrB;
            er.bymonthdayCount = iArrB.length;
            return 256;
        }
    }

    public static class f extends o {
        private f() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, 0, 59, true);
            er.bysecond = iArrB;
            er.bysecondCount = iArrB.length;
            return 16;
        }
    }

    public static class g extends o {
        private g() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
            er.bysetpos = iArrB;
            er.bysetposCount = iArrB.length;
            return 4096;
        }
    }

    public static class h extends o {
        private h() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, -53, 53, false);
            er.byweekno = iArrB;
            er.byweeknoCount = iArrB.length;
            return 1024;
        }
    }

    public static class i extends o {
        private i() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int[] iArrB = o.b(value, -366, 366, false);
            er.byyearday = iArrB;
            er.byyeardayCount = iArrB.length;
            return 512;
        }
    }

    public static class j extends o {
        private j() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int iA = o.a(value, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
            er.count = iA;
            if (iA >= 0) {
                return 4;
            }
            Log.d(EventRecurrence.a, "Invalid Count. Forcing COUNT to 1 from " + value);
            er.count = 1;
            return 4;
        }
    }

    public static class k extends o {
        private k() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            Integer num = (Integer) EventRecurrence.q.get(value);
            if (num != null) {
                er.freq = num.intValue();
                return 1;
            }
            throw new InvalidFormatException("Invalid FREQ value: " + value);
        }
    }

    public static class l extends o {
        private l() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            int iA = o.a(value, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
            er.interval = iA;
            if (iA >= 1) {
                return 8;
            }
            Log.d(EventRecurrence.a, "Invalid Interval. Forcing INTERVAL to 1 from " + value);
            er.interval = 1;
            return 8;
        }
    }

    public static class m extends o {
        private m() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            er.until = value;
            return 2;
        }
    }

    public static class n extends o {
        private n() {
        }

        @Override // com.huami.assistant.calendar.EventRecurrence.o
        public int c(String value, EventRecurrence er) {
            Integer num = (Integer) EventRecurrence.r.get(value);
            if (num != null) {
                er.wkst = num.intValue();
                return 8192;
            }
            throw new InvalidFormatException("Invalid WKST value: " + value);
        }
    }

    public static abstract class o {
        public static int a(String str, int minVal, int maxVal, boolean allowZero) {
            try {
                if (str.charAt(0) == '+') {
                    str = str.substring(1);
                }
                int i = Integer.parseInt(str);
                if (i >= minVal && i <= maxVal && (i != 0 || allowZero)) {
                    return i;
                }
                throw new InvalidFormatException("Integer value out of range: " + str);
            } catch (NumberFormatException unused) {
                throw new InvalidFormatException("Invalid integer value: " + str);
            }
        }

        public static int[] b(String listStr, int minVal, int maxVal, boolean allowZero) {
            if (listStr.indexOf(",") < 0) {
                return new int[]{a(listStr, minVal, maxVal, allowZero)};
            }
            String[] strArrSplit = listStr.split(",");
            int length = strArrSplit.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = a(strArrSplit[i], minVal, maxVal, allowZero);
            }
            return iArr;
        }

        public abstract int c(String value, EventRecurrence er);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HashMap<String, o> map = new HashMap<>();
        b = map;
        map.put("FREQ", new k());
        b.put("UNTIL", new m());
        b.put("COUNT", new j());
        b.put("INTERVAL", new l());
        b.put("BYSECOND", new f());
        b.put("BYMINUTE", new c());
        b.put("BYHOUR", new b());
        b.put("BYDAY", new a());
        b.put("BYMONTHDAY", new e());
        b.put("BYYEARDAY", new i());
        b.put("BYWEEKNO", new h());
        b.put("BYMONTH", new d());
        b.put("BYSETPOS", new g());
        b.put("WKST", new n());
        HashMap<String, Integer> map2 = new HashMap<>();
        q = map2;
        map2.put("SECONDLY", 1);
        map2.put("MINUTELY", 2);
        map2.put("HOURLY", 3);
        map2.put("DAILY", 4);
        map2.put("WEEKLY", 5);
        map2.put("MONTHLY", 6);
        map2.put("YEARLY", 7);
        HashMap<String, Integer> map3 = new HashMap<>();
        r = map3;
        map3.put("SU", 65536);
        map3.put("MO", 131072);
        map3.put("TU", 262144);
        map3.put("WE", 524288);
        map3.put("TH", 1048576);
        map3.put("FR", 2097152);
        map3.put("SA", 4194304);
    }

    public static int calendarDay2Day(int day) {
        switch (day) {
            case 1:
                return 65536;
            case 2:
                return 131072;
            case 3:
                return 262144;
            case 4:
                return 524288;
            case 5:
                return 1048576;
            case 6:
                return 2097152;
            case 7:
                return 4194304;
            default:
                throw new RuntimeException("bad day of week: " + day);
        }
    }

    private void d(StringBuilder s2, int i2) {
        int i3 = this.bydayNum[i2];
        if (i3 != 0) {
            s2.append(i3);
        }
        s2.append(g(this.byday[i2]));
    }

    public static int day2CalendarDay(int day) {
        if (day == 65536) {
            return 1;
        }
        if (day == 131072) {
            return 2;
        }
        if (day == 262144) {
            return 3;
        }
        if (day == 524288) {
            return 4;
        }
        if (day == 1048576) {
            return 5;
        }
        if (day == 2097152) {
            return 6;
        }
        if (day == 4194304) {
            return 7;
        }
        throw new RuntimeException("bad day of week: " + day);
    }

    public static int day2TimeDay(int day) {
        if (day == 65536) {
            return 0;
        }
        if (day == 131072) {
            return 1;
        }
        if (day == 262144) {
            return 2;
        }
        if (day == 524288) {
            return 3;
        }
        if (day == 1048576) {
            return 4;
        }
        if (day == 2097152) {
            return 5;
        }
        if (day == 4194304) {
            return 6;
        }
        throw new RuntimeException("bad day of week: " + day);
    }

    private static void e(StringBuilder s2, String label, int count, int[] values) {
        if (count > 0) {
            s2.append(label);
            int i2 = count - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                s2.append(values[i3]);
                s2.append(",");
            }
            s2.append(values[i2]);
        }
    }

    private static boolean f(int[] array1, int count1, int[] array2, int count2) {
        if (count1 != count2) {
            return false;
        }
        for (int i2 = 0; i2 < count1; i2++) {
            if (array1[i2] != array2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static String g(int day) {
        if (day == 65536) {
            return "SU";
        }
        if (day == 131072) {
            return "MO";
        }
        if (day == 262144) {
            return "TU";
        }
        if (day == 524288) {
            return "WE";
        }
        if (day == 1048576) {
            return "TH";
        }
        if (day == 2097152) {
            return "FR";
        }
        if (day == 4194304) {
            return "SA";
        }
        throw new IllegalArgumentException("bad day argument: " + day);
    }

    private void h() {
        this.until = null;
        this.bysetposCount = 0;
        this.bymonthCount = 0;
        this.byweeknoCount = 0;
        this.byyeardayCount = 0;
        this.bymonthdayCount = 0;
        this.bydayCount = 0;
        this.byhourCount = 0;
        this.byminuteCount = 0;
        this.bysecondCount = 0;
        this.interval = 0;
        this.count = 0;
        this.freq = 0;
    }

    public static int timeDay2Day(int day) {
        switch (day) {
            case 0:
                return 65536;
            case 1:
                return 131072;
            case 2:
                return 262144;
            case 3:
                return 524288;
            case 4:
                return 1048576;
            case 5:
                return 2097152;
            case 6:
                return 4194304;
            default:
                throw new RuntimeException("bad day of week: " + day);
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventRecurrence)) {
            return false;
        }
        EventRecurrence eventRecurrence = (EventRecurrence) obj;
        Time time = this.startDate;
        if (time != null ? Time.compare(time, eventRecurrence.startDate) == 0 : eventRecurrence.startDate == null) {
            if (this.freq == eventRecurrence.freq && ((str = this.until) != null ? str.equals(eventRecurrence.until) : eventRecurrence.until == null) && this.count == eventRecurrence.count && this.interval == eventRecurrence.interval && this.wkst == eventRecurrence.wkst && f(this.bysecond, this.bysecondCount, eventRecurrence.bysecond, eventRecurrence.bysecondCount) && f(this.byminute, this.byminuteCount, eventRecurrence.byminute, eventRecurrence.byminuteCount) && f(this.byhour, this.byhourCount, eventRecurrence.byhour, eventRecurrence.byhourCount) && f(this.byday, this.bydayCount, eventRecurrence.byday, eventRecurrence.bydayCount) && f(this.bydayNum, this.bydayCount, eventRecurrence.bydayNum, eventRecurrence.bydayCount) && f(this.bymonthday, this.bymonthdayCount, eventRecurrence.bymonthday, eventRecurrence.bymonthdayCount) && f(this.byyearday, this.byyeardayCount, eventRecurrence.byyearday, eventRecurrence.byyeardayCount) && f(this.byweekno, this.byweeknoCount, eventRecurrence.byweekno, eventRecurrence.byweeknoCount) && f(this.bymonth, this.bymonthCount, eventRecurrence.bymonth, eventRecurrence.bymonthCount) && f(this.bysetpos, this.bysetposCount, eventRecurrence.bysetpos, eventRecurrence.bysetposCount)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    public void parse(String recur) {
        h();
        int i2 = 0;
        for (String str : recur.toUpperCase().split(";")) {
            if (!TextUtils.isEmpty(str)) {
                int iIndexOf = str.indexOf(61);
                if (iIndexOf <= 0) {
                    throw new InvalidFormatException("Missing LHS in " + str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (strSubstring2.length() == 0) {
                    throw new InvalidFormatException("Missing RHS in " + str);
                }
                o oVar = b.get(strSubstring);
                if (oVar != null) {
                    int iC = oVar.c(strSubstring2, this);
                    if ((i2 & iC) != 0) {
                        throw new InvalidFormatException("Part " + strSubstring + " was specified twice");
                    }
                    i2 |= iC;
                } else if (!strSubstring.startsWith("X-")) {
                    throw new InvalidFormatException("Couldn't find parser for " + strSubstring);
                }
            }
        }
        if ((i2 & 8192) == 0) {
            this.wkst = 131072;
        }
        if ((i2 & 1) == 0) {
            throw new InvalidFormatException("Must specify a FREQ value");
        }
        if ((i2 & 6) == 6) {
            Log.w(a, "Warning: rrule has both UNTIL and COUNT: " + recur);
        }
    }

    public boolean repeatsMonthlyOnDayCount() {
        return this.freq == 6 && this.bydayCount == 1 && this.bymonthdayCount == 0 && this.bydayNum[0] > 0;
    }

    public boolean repeatsOnDefault() {
        if (this.freq == 5) {
            int[] iArr = this.byday;
            if (iArr == null) {
                return true;
            }
            if (this.bydayCount != 1) {
                return false;
            }
            if (this.startDate == null || day2TimeDay(iArr[0]) == this.startDate.weekDay) {
                return true;
            }
        }
        int i2 = this.freq;
        if (i2 == 6) {
            if (this.byday != null) {
                return false;
            }
            int[] iArr2 = this.bymonthday;
            if (iArr2 == null) {
                return true;
            }
            if (this.bymonthdayCount != 1) {
                return false;
            }
            Time time = this.startDate;
            if (time == null || iArr2[0] == time.monthDay) {
                return true;
            }
        }
        if (i2 != 7) {
            return false;
        }
        int[] iArr3 = this.bymonth;
        if (iArr3 == null) {
            return true;
        }
        if (this.bymonthCount != 1) {
            return false;
        }
        Time time2 = this.startDate;
        return time2 == null || iArr3[0] == time2.month;
    }

    public boolean repeatsOnEveryWeekend() {
        int i2;
        if (this.freq != 5 || (i2 = this.bydayCount) != 2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.byday[i3];
            if (i4 != 65536 && i4 != 4194304) {
                return false;
            }
        }
        return true;
    }

    public boolean repeatsOnEveryWorkday() {
        int i2;
        if (this.freq != 5 || (i2 = this.bydayCount) != 5) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.byday[i3];
            if (i4 == 65536 || i4 == 4194304) {
                return false;
            }
        }
        return true;
    }

    public void setStartDate(Time date) {
        this.startDate = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FREQ=");
        switch (this.freq) {
            case 1:
                sb.append("SECONDLY");
                break;
            case 2:
                sb.append("MINUTELY");
                break;
            case 3:
                sb.append("HOURLY");
                break;
            case 4:
                sb.append("DAILY");
                break;
            case 5:
                sb.append("WEEKLY");
                break;
            case 6:
                sb.append("MONTHLY");
                break;
            case 7:
                sb.append("YEARLY");
                break;
        }
        if (!TextUtils.isEmpty(this.until)) {
            sb.append(";UNTIL=");
            sb.append(this.until);
        }
        if (this.count != 0) {
            sb.append(";COUNT=");
            sb.append(this.count);
        }
        if (this.interval != 0) {
            sb.append(";INTERVAL=");
            sb.append(this.interval);
        }
        if (this.wkst != 0) {
            sb.append(";WKST=");
            sb.append(g(this.wkst));
        }
        e(sb, ";BYSECOND=", this.bysecondCount, this.bysecond);
        e(sb, ";BYMINUTE=", this.byminuteCount, this.byminute);
        e(sb, ";BYSECOND=", this.byhourCount, this.byhour);
        int i2 = this.bydayCount;
        if (i2 > 0) {
            sb.append(";BYDAY=");
            int i3 = i2 - 1;
            for (int i4 = 0; i4 < i3; i4++) {
                d(sb, i4);
                sb.append(",");
            }
            d(sb, i3);
        }
        e(sb, ";BYMONTHDAY=", this.bymonthdayCount, this.bymonthday);
        e(sb, ";BYYEARDAY=", this.byyeardayCount, this.byyearday);
        e(sb, ";BYWEEKNO=", this.byweeknoCount, this.byweekno);
        e(sb, ";BYMONTH=", this.bymonthCount, this.bymonth);
        e(sb, ";BYSETPOS=", this.bysetposCount, this.bysetpos);
        return sb.toString();
    }
}
