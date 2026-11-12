package com.huami.assistant.calendar;

import android.text.format.Time;
import android.util.Log;
import com.google.android.material.datepicker.UtcDates;
import com.huami.widget.wheelview.Constant;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class RecurrenceProcessor {
    private static final int f = 2000;
    private static final String g = "RecurrenceProcessor";
    private static final boolean h = false;
    private static final int i = 0;
    private static final int j = 1;
    private static final int[] k = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] l = {0, 31, 59, 90, 120, 151, 180, 212, Constant.HEIGHT_MAX, 273, 304, 334};
    private Time a = new Time(UtcDates.UTC);
    private Time b = new Time(UtcDates.UTC);
    private StringBuilder c = new StringBuilder();
    private Time d = new Time(UtcDates.UTC);
    private DaySet e = new DaySet(false);

    public static class DaySet {
        private EventRecurrence a;
        private int b;
        private Time c = new Time(UtcDates.UTC);
        private int d;
        private int e;

        public DaySet(boolean zulu) {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0046 A[PHI: r9
          0x0046: PHI (r9v8 int) = (r9v6 int), (r9v9 int) binds: [B:27:0x0052, B:22:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        private static int a(Time generated, EventRecurrence r) {
            int i;
            int i2;
            int i3;
            int actualMaximum = generated.getActualMaximum(4);
            int i4 = r.bydayCount;
            if (i4 > 0) {
                int i5 = generated.monthDay;
                while (i5 >= 8) {
                    i5 -= 7;
                }
                int i6 = generated.weekDay;
                int i7 = i6 >= i5 ? (i6 - i5) + 1 : (i6 - i5) + 8;
                int[] iArr = r.byday;
                int[] iArr2 = r.bydayNum;
                i = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = iArr2[i8];
                    int iDay2TimeDay = (EventRecurrence.day2TimeDay(iArr[i8]) - i7) + 1;
                    if (iDay2TimeDay <= 0) {
                        iDay2TimeDay += 7;
                    }
                    if (i9 == 0) {
                        while (iDay2TimeDay <= actualMaximum) {
                            i |= 1 << iDay2TimeDay;
                            iDay2TimeDay += 7;
                        }
                    } else if (i9 > 0) {
                        i3 = iDay2TimeDay + ((i9 - 1) * 7);
                        if (i3 <= actualMaximum) {
                            i |= 1 << i3;
                        }
                    } else {
                        while (iDay2TimeDay <= actualMaximum) {
                            iDay2TimeDay += 7;
                        }
                        i3 = iDay2TimeDay + (i9 * 7);
                        if (i3 >= 1) {
                            i |= 1 << i3;
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (r.freq > 5 && (i2 = r.bymonthdayCount) != 0) {
                int[] iArr3 = r.bymonthday;
                if (r.bydayCount == 0) {
                    for (int i10 = 0; i10 < i2; i10++) {
                        int i11 = iArr3[i10];
                        if (i11 >= 0 || ((i11 = i11 + actualMaximum + 1) >= 1 && i11 <= actualMaximum)) {
                            i |= 1 << i11;
                        }
                    }
                } else {
                    for (int i12 = 1; i12 <= actualMaximum; i12++) {
                        int i13 = 1 << i12;
                        if ((i & i13) != 0) {
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i2) {
                                    i &= ~i13;
                                    break;
                                }
                                if (iArr3[i14] == i12) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                }
            }
            return i;
        }

        public boolean b(Time iterator, int day) {
            Time time;
            int i = iterator.year;
            int i2 = iterator.month;
            if (day < 1 || day > 28) {
                time = this.c;
                time.set(day, i2, i);
                RecurrenceProcessor.j(time);
                i = time.year;
                i2 = time.month;
                day = time.monthDay;
            } else {
                time = null;
            }
            if (i != this.d || i2 != this.e) {
                if (time == null) {
                    time = this.c;
                    time.set(day, i2, i);
                    RecurrenceProcessor.j(time);
                }
                this.d = i;
                this.e = i2;
                this.b = a(time, this.a);
            }
            return (this.b & (1 << day)) != 0;
        }

        public void c(EventRecurrence r) {
            this.d = 0;
            this.e = -1;
            this.a = r;
        }
    }

    private static int a(EventRecurrence r, Time iterator) {
        int i2;
        int i3;
        int i4;
        int i5 = r.freq;
        if (6 >= i5 && (i4 = r.bymonthCount) > 0 && !e(r.bymonth, i4, iterator.month + 1)) {
            return 1;
        }
        if (5 >= i5 && (i3 = r.byweeknoCount) > 0 && !f(r.byweekno, i3, iterator.getWeekNumber(), iterator.getActualMaximum(9))) {
            return 2;
        }
        if (4 >= i5) {
            int i6 = r.byyeardayCount;
            if (i6 > 0 && !f(r.byyearday, i6, iterator.yearDay, iterator.getActualMaximum(8))) {
                return 3;
            }
            int i7 = r.bymonthdayCount;
            if (i7 > 0 && !f(r.bymonthday, i7, iterator.monthDay, iterator.getActualMaximum(4))) {
                return 4;
            }
            int i8 = r.bydayCount;
            if (i8 > 0) {
                int[] iArr = r.byday;
                int iTimeDay2Day = EventRecurrence.timeDay2Day(iterator.weekDay);
                for (int i9 = 0; i9 < i8; i9++) {
                    if (iArr[i9] != iTimeDay2Day) {
                    }
                }
                return 5;
            }
        }
        if (3 >= i5 && !f(r.byhour, r.byhourCount, iterator.hour, iterator.getActualMaximum(3))) {
            return 6;
        }
        if (2 >= i5 && !f(r.byminute, r.byminuteCount, iterator.minute, iterator.getActualMaximum(2))) {
            return 7;
        }
        if (1 >= i5 && !f(r.bysecond, r.bysecondCount, iterator.second, iterator.getActualMaximum(1))) {
            return 8;
        }
        if (r.bysetposCount > 0) {
            if (i5 == 6 && (i2 = r.bydayCount) > 0) {
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    if (r.bydayNum[i10] != 0) {
                        if (Log.isLoggable(g, 2)) {
                            Log.v(g, "BYSETPOS not supported with these rules: " + r);
                        }
                    }
                }
                if (!b(r, iterator)) {
                    return 9;
                }
            } else if (Log.isLoggable(g, 2)) {
                Log.v(g, "BYSETPOS not supported with these rules: " + r);
            }
        }
        return 0;
    }

    private static boolean b(EventRecurrence r, Time instance) {
        int i2 = ((instance.weekDay - instance.monthDay) + 36) % 7;
        int i3 = 0;
        for (int i4 = 0; i4 < r.bydayCount; i4++) {
            i3 |= r.byday[i4];
        }
        int actualMaximum = instance.getActualMaximum(4);
        int[] iArr = new int[actualMaximum];
        int i5 = 0;
        for (int i6 = 1; i6 <= actualMaximum; i6++) {
            if (((65536 << i2) & i3) != 0) {
                iArr[i5] = i6;
                i5++;
            }
            i2++;
            if (i2 == 7) {
                i2 = 0;
            }
        }
        for (int i7 = r.bysetposCount - 1; i7 >= 0; i7--) {
            int i8 = r.bysetpos[i7];
            if (i8 > 0) {
                if (i8 <= i5 && iArr[i8 - 1] == instance.monthDay) {
                    return true;
                }
            } else {
                if (i8 >= 0) {
                    throw new RuntimeException("invalid bysetpos value");
                }
                int i9 = i8 + i5;
                if (i9 >= 0 && iArr[i9] == instance.monthDay) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private static boolean e(int[] a, int N, int v) {
        for (int i2 = 0; i2 < N; i2++) {
            if (a[i2] == v) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int[] a, int N, int v, int max) {
        for (int i2 = 0; i2 < N; i2++) {
            int i3 = a[i2];
            if (i3 <= 0) {
                max += i3;
                if (max == v) {
                    return true;
                }
            } else if (i3 == v) {
                return true;
            }
        }
        return false;
    }

    public static int g(int year, int month) {
        int i2 = k[month];
        if (i2 != 28) {
            return i2;
        }
        return d(year) ? 29 : 28;
    }

    private static final long h(Time normalized) {
        return (((long) normalized.year) << 26) + ((long) (normalized.month << 22)) + ((long) (normalized.monthDay << 17)) + ((long) (normalized.hour << 12)) + ((long) (normalized.minute << 6)) + ((long) normalized.second);
    }

    private static final void i(Time date, long val) {
        date.year = (int) (val >> 26);
        date.month = ((int) (val >> 22)) & 15;
        date.monthDay = ((int) (val >> 17)) & 31;
        date.hour = ((int) (val >> 12)) & 31;
        date.minute = ((int) (val >> 6)) & 63;
        date.second = (int) (val & 63);
    }

    public static void j(Time date) {
        int i2 = date.second;
        int i3 = date.minute;
        int i4 = date.hour;
        int i5 = date.monthDay;
        int i6 = date.month;
        int i7 = date.year;
        int i8 = (i2 < 0 ? i2 - 59 : i2) / 60;
        int i9 = i2 - (i8 * 60);
        int i10 = i3 + i8;
        int i11 = (i10 < 0 ? i10 - 59 : i10) / 60;
        int i12 = i10 - (i11 * 60);
        int i13 = i4 + i11;
        int i14 = (i13 < 0 ? i13 - 23 : i13) / 24;
        int i15 = i13 - (i14 * 24);
        int iN = i5 + i14;
        while (iN <= 0) {
            iN += i6 > 1 ? n(i7) : n(i7 - 1);
            i7--;
        }
        if (i6 < 0) {
            int i16 = ((i6 + 1) / 12) - 1;
            i7 += i16;
            i6 -= i16 * 12;
        } else if (i6 >= 12) {
            int i17 = i6 / 12;
            i7 += i17;
            i6 -= i17 * 12;
        }
        while (true) {
            if (i6 == 0) {
                int iN2 = n(i7);
                if (iN > iN2) {
                    i7++;
                    iN -= iN2;
                }
            }
            int iG = g(i7, i6);
            if (iN <= iG) {
                date.second = i9;
                date.minute = i12;
                date.hour = i15;
                date.monthDay = iN;
                date.month = i6;
                date.year = i7;
                date.weekDay = l(i7, i6, iN);
                date.yearDay = m(i7, i6, iN);
                return;
            }
            iN -= iG;
            i6++;
            if (i6 >= 12) {
                i6 -= 12;
                i7++;
            }
        }
    }

    private static boolean k(int freq, int freqConstant, int count) {
        return freq > freqConstant && count > 0;
    }

    public static int l(int year, int month, int day) {
        if (month <= 1) {
            month += 12;
            year--;
        }
        return (((((day + (((month * 13) - 14) / 5)) + year) + (year / 4)) - (year / 100)) + (year / 400)) % 7;
    }

    public static int m(int year, int month, int day) {
        int i2 = (l[month] + day) - 1;
        return (month < 2 || !d(year)) ? i2 : i2 + 1;
    }

    public static int n(int year) {
        return d(year) ? 366 : 365;
    }

    public int c(int count, int freq, int byFreq) {
        return (byFreq < freq && count != 0) ? 1 : 0;
    }

    public long[] expand(Time dtstart, RecurrenceSet recur, long rangeStartMillis, long rangeEndMillis) throws DateException {
        long jH;
        String str = dtstart.timezone;
        this.a.clear(str);
        this.d.clear(str);
        this.a.set(rangeStartMillis);
        long jH2 = h(this.a);
        if (rangeEndMillis != -1) {
            this.a.set(rangeEndMillis);
            jH = h(this.a);
        } else {
            jH = Long.MAX_VALUE;
        }
        long j2 = jH;
        TreeSet<Long> treeSet = new TreeSet<>();
        EventRecurrence[] eventRecurrenceArr = recur.rrules;
        if (eventRecurrenceArr != null) {
            int length = eventRecurrenceArr.length;
            int i2 = 0;
            while (i2 < length) {
                expand(dtstart, eventRecurrenceArr[i2], jH2, j2, true, treeSet);
                i2++;
                length = length;
                eventRecurrenceArr = eventRecurrenceArr;
            }
        }
        long[] jArr = recur.rdates;
        if (jArr != null) {
            for (long j3 : jArr) {
                this.a.set(j3);
                treeSet.add(Long.valueOf(h(this.a)));
            }
        }
        EventRecurrence[] eventRecurrenceArr2 = recur.exrules;
        if (eventRecurrenceArr2 != null) {
            int length2 = eventRecurrenceArr2.length;
            int i3 = 0;
            while (i3 < length2) {
                expand(dtstart, eventRecurrenceArr2[i3], jH2, j2, false, treeSet);
                i3++;
                length2 = length2;
                eventRecurrenceArr2 = eventRecurrenceArr2;
            }
        }
        long[] jArr2 = recur.exdates;
        if (jArr2 != null) {
            for (long j4 : jArr2) {
                this.a.set(j4);
                treeSet.remove(Long.valueOf(h(this.a)));
            }
        }
        if (treeSet.isEmpty()) {
            return new long[0];
        }
        long[] jArr3 = new long[treeSet.size()];
        Iterator<Long> it2 = treeSet.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            i(this.a, it2.next().longValue());
            jArr3[i4] = this.a.toMillis(true);
            i4++;
        }
        return jArr3;
    }

    public long getLastOccurence(Time dtstart, RecurrenceSet recur) throws DateException {
        return getLastOccurence(dtstart, null, recur);
    }

    public long getLastOccurence(Time dtstart, Time maxtime, RecurrenceSet recur) throws DateException {
        boolean z;
        long[] jArr;
        EventRecurrence[] eventRecurrenceArr = recur.rrules;
        long j2 = -1;
        if (eventRecurrenceArr != null) {
            long j3 = -1;
            z = false;
            for (EventRecurrence eventRecurrence : eventRecurrenceArr) {
                if (eventRecurrence.count != 0) {
                    z = true;
                } else {
                    String str = eventRecurrence.until;
                    if (str != null) {
                        this.a.parse(str);
                        long millis = this.a.toMillis(false);
                        if (millis > j3) {
                            j3 = millis;
                        }
                    }
                }
            }
            if (j3 != -1 && (jArr = recur.rdates) != null) {
                for (long j4 : jArr) {
                    if (j4 > j3) {
                        j3 = j4;
                    }
                }
            }
            if (j3 != -1 && !z) {
                return j3;
            }
        } else {
            long[] jArr2 = recur.rdates;
            if (jArr2 != null && recur.exrules == null && recur.exdates == null) {
                for (long j5 : jArr2) {
                    if (j5 > j2) {
                        j2 = j5;
                    }
                }
                return j2;
            }
            z = false;
        }
        if (!z && recur.rdates == null && maxtime == null) {
            return -1L;
        }
        long[] jArrExpand = expand(dtstart, recur, dtstart.toMillis(false), maxtime != null ? maxtime.toMillis(false) : -1L);
        if (jArrExpand.length == 0) {
            return 0L;
        }
        return jArrExpand[jArrExpand.length - 1];
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0203 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x020c  */
    /* JADX WARN: Code duplicated, block: B:105:0x022a A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0278  */
    /* JADX WARN: Code duplicated, block: B:135:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0295 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x031a A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0320 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0326 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x032c A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0332 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0338 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x033e A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0344 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0351  */
    /* JADX WARN: Code duplicated, block: B:175:0x0355 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0307 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x02e0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02c5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x02a8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x028f A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[Catch: RuntimeException -> 0x03b8, DateException -> 0x03e6, TryCatch #6 {DateException -> 0x03e6, RuntimeException -> 0x03b8, blocks: (B:11:0x003b, B:13:0x0047, B:15:0x004b, B:18:0x0050, B:19:0x0057, B:20:0x0058, B:37:0x0088, B:39:0x0094, B:41:0x0098, B:45:0x00a3, B:48:0x00ce, B:49:0x00d1, B:51:0x00d7, B:53:0x00e1, B:54:0x00f2, B:56:0x0101, B:57:0x010e, B:59:0x0114, B:60:0x0136, B:62:0x015c), top: B:198:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7 A[Catch: RuntimeException -> 0x03b8, DateException -> 0x03e6, TryCatch #6 {DateException -> 0x03e6, RuntimeException -> 0x03b8, blocks: (B:11:0x003b, B:13:0x0047, B:15:0x004b, B:18:0x0050, B:19:0x0057, B:20:0x0058, B:37:0x0088, B:39:0x0094, B:41:0x0098, B:45:0x00a3, B:48:0x00ce, B:49:0x00d1, B:51:0x00d7, B:53:0x00e1, B:54:0x00f2, B:56:0x0101, B:57:0x010e, B:59:0x0114, B:60:0x0136, B:62:0x015c), top: B:198:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1 A[Catch: RuntimeException -> 0x03b8, DateException -> 0x03e6, TryCatch #6 {DateException -> 0x03e6, RuntimeException -> 0x03b8, blocks: (B:11:0x003b, B:13:0x0047, B:15:0x004b, B:18:0x0050, B:19:0x0057, B:20:0x0058, B:37:0x0088, B:39:0x0094, B:41:0x0098, B:45:0x00a3, B:48:0x00ce, B:49:0x00d1, B:51:0x00d7, B:53:0x00e1, B:54:0x00f2, B:56:0x0101, B:57:0x010e, B:59:0x0114, B:60:0x0136, B:62:0x015c), top: B:198:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136 A[Catch: RuntimeException -> 0x03b8, DateException -> 0x03e6, TryCatch #6 {DateException -> 0x03e6, RuntimeException -> 0x03b8, blocks: (B:11:0x003b, B:13:0x0047, B:15:0x004b, B:18:0x0050, B:19:0x0057, B:20:0x0058, B:37:0x0088, B:39:0x0094, B:41:0x0098, B:45:0x00a3, B:48:0x00ce, B:49:0x00d1, B:51:0x00d7, B:53:0x00e1, B:54:0x00f2, B:56:0x0101, B:57:0x010e, B:59:0x0114, B:60:0x0136, B:62:0x015c), top: B:198:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015c A[Catch: RuntimeException -> 0x03b8, DateException -> 0x03e6, TRY_LEAVE, TryCatch #6 {DateException -> 0x03e6, RuntimeException -> 0x03b8, blocks: (B:11:0x003b, B:13:0x0047, B:15:0x004b, B:18:0x0050, B:19:0x0057, B:20:0x0058, B:37:0x0088, B:39:0x0094, B:41:0x0098, B:45:0x00a3, B:48:0x00ce, B:49:0x00d1, B:51:0x00d7, B:53:0x00e1, B:54:0x00f2, B:56:0x0101, B:57:0x010e, B:59:0x0114, B:60:0x0136, B:62:0x015c), top: B:198:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196 A[Catch: RuntimeException -> 0x019f, DateException -> 0x01a4, TRY_LEAVE, TryCatch #5 {DateException -> 0x01a4, RuntimeException -> 0x019f, blocks: (B:71:0x0176, B:76:0x0196), top: B:199:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c2 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2 A[Catch: RuntimeException -> 0x03ae, DateException -> 0x03b0, TryCatch #7 {DateException -> 0x03b0, RuntimeException -> 0x03ae, blocks: (B:24:0x006b, B:181:0x0397, B:182:0x03ad, B:86:0x01bc, B:88:0x01c2, B:153:0x02e0, B:158:0x0307, B:159:0x030f, B:160:0x0311, B:161:0x0314, B:179:0x0382, B:180:0x0396, B:162:0x031a, B:170:0x0349, B:175:0x0355, B:178:0x0378, B:163:0x0320, B:164:0x0326, B:165:0x032c, B:166:0x0332, B:167:0x0338, B:168:0x033e, B:169:0x0344, B:93:0x01e3, B:97:0x01f2, B:101:0x0203, B:103:0x0210, B:105:0x022a, B:124:0x0252, B:127:0x026e, B:133:0x027c, B:138:0x028f, B:143:0x02a8, B:148:0x02c5, B:125:0x025e, B:114:0x023e), top: B:197:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00e1, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 40, insn: 0x03b1: MOVE (r9 I:??[OBJECT, ARRAY]) = (r40 I:??[OBJECT, ARRAY]), block:B:186:0x03b1 */
    /* JADX WARN: Not initialized variable reg: 45, insn: 0x03b3: MOVE (r8 I:??[OBJECT, ARRAY]) = (r45 I:??[OBJECT, ARRAY]), block:B:186:0x03b1 */
    /* JADX WARN: Not initialized variable reg: 46, insn: 0x03b5: MOVE (r7 I:??[OBJECT, ARRAY]) = (r46 I:??[OBJECT, ARRAY]), block:B:186:0x03b1 */
    public void expand(Time dtstart, EventRecurrence r, long rangeStartDateValue, long rangeEndDateValue, boolean add, TreeSet<Long> out) throws DateException {
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i3;
        int i4;
        int i5;
        boolean zK;
        boolean z;
        Time time;
        boolean zK2;
        int i6;
        boolean zK3;
        int i7;
        boolean zK4;
        int i8;
        int i9;
        String str8;
        int i10;
        long j2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Time time2;
        int i20;
        int i21;
        int i22;
        int i23;
        int actualMaximum;
        int i24;
        String str9;
        DaySet daySet;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        long jH;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        Time time3;
        int i41;
        int i42;
        int i43;
        String str10 = " rangeEnd=";
        String str11 = " rangeStart=";
        String str12 = g;
        j(dtstart);
        long jH2 = h(dtstart);
        if (!add || jH2 < rangeStartDateValue || jH2 >= rangeEndDateValue) {
            i2 = 0;
        } else {
            out.add(Long.valueOf(jH2));
            i2 = 1;
        }
        Time time4 = this.a;
        Time time5 = this.b;
        int i44 = i2;
        StringBuilder sb = this.c;
        Time time6 = this.d;
        DaySet daySet2 = this.e;
        try {
            daySet2.c(r);
            long jH3 = Long.MAX_VALUE;
            if (rangeEndDateValue == Long.MAX_VALUE && r.until == null && r.count == 0) {
                throw new DateException("No range end provided for a recurrence that has no UNTIL or COUNT.");
            }
            int i45 = r.interval;
            int i46 = r.freq;
            DaySet daySet3 = daySet2;
            try {
                switch (i46) {
                    case 1:
                        i3 = 1;
                        if (i45 <= 0) {
                            i45 = 1;
                        }
                        i4 = r.bymonthCount;
                        i5 = i45;
                        zK = k(i46, 6, i4);
                        if (i46 >= 5 || (r.bydayCount <= 0 && r.bymonthdayCount <= 0)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        int i47 = r.byhourCount;
                        time = time6;
                        zK2 = k(i46, 3, i47);
                        i6 = i47;
                        int i48 = r.byminuteCount;
                        zK3 = k(i46, 2, i48);
                        i7 = i48;
                        int i49 = r.bysecondCount;
                        zK4 = k(i46, 1, i49);
                        time4.set(dtstart);
                        i8 = i3;
                        i9 = i49;
                        if (i8 == 5 && z) {
                            time4.monthDay = 1;
                        }
                        str8 = r.until;
                        i10 = i8;
                        if (str8 == null) {
                            if (str8.length() == 15) {
                                str8 = str8 + 'Z';
                            }
                            time5.parse(str8);
                            time5.switchTimezone(dtstart.timezone);
                            jH3 = h(time5);
                        }
                        j2 = jH3;
                        sb.ensureCapacity(15);
                        sb.setLength(15);
                        i11 = i44;
                        i12 = 0;
                        while (true) {
                            i13 = i12 + 1;
                            if (i12 > 2000) {
                                Log.w(str12, "Recurrence processing stuck with r=" + r + str11 + rangeStartDateValue + str10 + rangeEndDateValue);
                                return;
                            }
                            j(time4);
                            i14 = time4.year;
                            i15 = time4.month + 1;
                            i16 = time4.monthDay;
                            i17 = time4.hour;
                            i18 = time4.minute;
                            i19 = time4.second;
                            time2 = time;
                            time2.set(time4);
                            i20 = 0;
                            while (true) {
                                if (zK) {
                                    i15 = r.bymonth[i20];
                                }
                                i21 = i15 - 1;
                                if (z) {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    if (i23 == 5) {
                                        try {
                                            str10 = str10;
                                            try {
                                                int iDay2TimeDay = time4.monthDay - (((time4.weekDay - EventRecurrence.day2TimeDay(r.wkst)) + 7) % 7);
                                                i24 = iDay2TimeDay;
                                                actualMaximum = iDay2TimeDay + 6;
                                            } catch (DateException e) {
                                                e = e;
                                                str3 = str11;
                                                str4 = str2;
                                                str10 = str10;
                                                Log.w(str4, "DateException with r=" + r + str3 + rangeStartDateValue + str10 + rangeEndDateValue);
                                                throw e;
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                str = str11;
                                                Log.w(str2, "RuntimeException with r=" + r + str + rangeStartDateValue + str10 + rangeEndDateValue);
                                                throw e;
                                            }
                                        } catch (DateException e3) {
                                            e = e3;
                                            str3 = str11;
                                            str4 = str2;
                                        } catch (RuntimeException e4) {
                                            e = e4;
                                            str10 = str10;
                                        }
                                    } else {
                                        actualMaximum = time2.getActualMaximum(4);
                                    }
                                    while (true) {
                                        if (z) {
                                            str9 = str11;
                                            daySet = daySet3;
                                            if (daySet.b(time4, i24)) {
                                                i25 = i24;
                                            } else {
                                                i24++;
                                                j2 = j2;
                                                daySet = daySet;
                                                time4 = time4;
                                                i23 = i23;
                                                i34 = i9;
                                                i38 = i6;
                                                i36 = i7;
                                            }
                                            if (z && i24 <= actualMaximum) {
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                str11 = str9;
                                                daySet3 = daySet;
                                                i23 = i23;
                                                time4 = time4;
                                            }
                                        } else {
                                            str9 = str11;
                                            daySet = daySet3;
                                            i25 = i16;
                                        }
                                        i26 = 0;
                                        while (true) {
                                            if (zK2) {
                                                i27 = r.byhour[i26];
                                            } else {
                                                i27 = i17;
                                            }
                                            i28 = 0;
                                            while (true) {
                                                if (zK3) {
                                                    i29 = r.byminute[i28];
                                                } else {
                                                    i29 = i18;
                                                }
                                                i30 = i22;
                                                i31 = 0;
                                                while (true) {
                                                    if (zK4) {
                                                        i32 = r.bysecond[i31];
                                                    } else {
                                                        i32 = i19;
                                                    }
                                                    time2.set(i32, i29, i27, i25, i21, i14);
                                                    j(time2);
                                                    jH = h(time2);
                                                    if (jH < jH2 && a(r, time2) == 0) {
                                                        if (jH2 != jH || !add || jH2 < rangeStartDateValue || jH2 >= rangeEndDateValue) {
                                                            i30++;
                                                        }
                                                        int i50 = i30;
                                                        if (jH <= j2 && jH < rangeEndDateValue) {
                                                            if (jH >= rangeStartDateValue) {
                                                                if (add) {
                                                                    out.add(Long.valueOf(jH));
                                                                } else {
                                                                    out.remove(Long.valueOf(jH));
                                                                }
                                                            }
                                                            int i51 = r.count;
                                                            if (i51 > 0 && i51 == i50) {
                                                                return;
                                                            } else {
                                                                i30 = i50;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    j2 = j2;
                                                    i33 = i31 + 1;
                                                    i34 = i9;
                                                    if (zK4 && i33 < i34) {
                                                        i31 = i33;
                                                        i9 = i34;
                                                        j2 = j2;
                                                        time4 = time4;
                                                    }
                                                }
                                                i35 = i28 + 1;
                                                i36 = i7;
                                                if (zK3 && i35 < i36) {
                                                    i28 = i35;
                                                    i9 = i34;
                                                    i7 = i36;
                                                    j2 = j2;
                                                    i23 = i23;
                                                    i22 = i30;
                                                    time4 = time4;
                                                }
                                            }
                                            i37 = i26 + 1;
                                            i38 = i6;
                                            if (zK2 && i37 < i38) {
                                                i26 = i37;
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                daySet = daySet;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i24++;
                                        i22 = i30;
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    }
                                    i39 = i20 + 1;
                                    i40 = i4;
                                    if (zK && i39 < i40) {
                                        i20 = i39;
                                        i4 = i40;
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        i11 = i22;
                                        j2 = j2;
                                        str12 = str2;
                                        i15 = i15;
                                        str10 = str10;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i46 = i23;
                                        time4 = time4;
                                    }
                                } else {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    actualMaximum = 0;
                                }
                                i24 = 1;
                                while (true) {
                                    if (z) {
                                        str9 = str11;
                                        daySet = daySet3;
                                        if (daySet.b(time4, i24)) {
                                            i24++;
                                            j2 = j2;
                                            daySet = daySet;
                                            time4 = time4;
                                            i23 = i23;
                                            i34 = i9;
                                            i38 = i6;
                                            i36 = i7;
                                        } else {
                                            i25 = i24;
                                        }
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    } else {
                                        str9 = str11;
                                        daySet = daySet3;
                                        i25 = i16;
                                    }
                                    i26 = 0;
                                    while (true) {
                                        if (zK2) {
                                            i27 = r.byhour[i26];
                                        } else {
                                            i27 = i17;
                                        }
                                        i28 = 0;
                                        while (true) {
                                            if (zK3) {
                                                i29 = r.byminute[i28];
                                            } else {
                                                i29 = i18;
                                            }
                                            i30 = i22;
                                            i31 = 0;
                                            while (true) {
                                                if (zK4) {
                                                    i32 = r.bysecond[i31];
                                                } else {
                                                    i32 = i19;
                                                }
                                                time2.set(i32, i29, i27, i25, i21, i14);
                                                j(time2);
                                                jH = h(time2);
                                                if (jH < jH2) {
                                                    j2 = j2;
                                                } else {
                                                    j2 = j2;
                                                }
                                                i33 = i31 + 1;
                                                i34 = i9;
                                                if (zK4) {
                                                    i31 = i33;
                                                    i9 = i34;
                                                    j2 = j2;
                                                    time4 = time4;
                                                }
                                            }
                                            i35 = i28 + 1;
                                            i36 = i7;
                                            if (zK3) {
                                                i28 = i35;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i37 = i26 + 1;
                                        i38 = i6;
                                        if (zK2) {
                                            i26 = i37;
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            daySet = daySet;
                                            i23 = i23;
                                            i22 = i30;
                                            time4 = time4;
                                        }
                                    }
                                    i24++;
                                    i22 = i30;
                                    if (z) {
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        j2 = j2;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i23 = i23;
                                        time4 = time4;
                                    }
                                }
                                i39 = i20 + 1;
                                i40 = i4;
                                if (zK) {
                                    i20 = i39;
                                    i4 = i40;
                                    i6 = i38;
                                    i9 = i34;
                                    i7 = i36;
                                    i11 = i22;
                                    j2 = j2;
                                    str12 = str2;
                                    i15 = i15;
                                    str10 = str10;
                                    str11 = str9;
                                    daySet3 = daySet;
                                    i46 = i23;
                                    time4 = time4;
                                }
                                break;
                            }
                            time3 = time4;
                            int i52 = time3.monthDay;
                            time2.set(time3);
                            i41 = 1;
                            while (true) {
                                i42 = i5 * i41;
                                switch (i10) {
                                    case 1:
                                        time3.second += i42;
                                        break;
                                    case 2:
                                        time3.minute += i42;
                                        break;
                                    case 3:
                                        time3.hour += i42;
                                        break;
                                    case 4:
                                        time3.monthDay += i42;
                                        break;
                                    case 5:
                                        time3.month += i42;
                                        break;
                                    case 6:
                                        time3.year += i42;
                                        break;
                                    case 7:
                                        time3.monthDay += i42;
                                        break;
                                    case 8:
                                        time3.monthDay += i42;
                                        break;
                                    default:
                                        throw new RuntimeException("bad field=" + i10);
                                }
                                j(time3);
                                i43 = i10;
                                if ((i43 != 6 || i43 == 5) && time3.monthDay != i52) {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                }
                                break;
                            }
                            i12 = i13;
                            i10 = i43;
                            i4 = i40;
                            i6 = i38;
                            time = time2;
                            i9 = i34;
                            i7 = i36;
                            i11 = i22;
                            str12 = str2;
                            str10 = str10;
                            str11 = str9;
                            daySet3 = daySet;
                            i46 = i23;
                            time4 = time3;
                            j2 = j2;
                        }
                        break;
                    case 2:
                        i3 = 2;
                        if (i45 <= 0) {
                            i45 = 1;
                        }
                        i4 = r.bymonthCount;
                        i5 = i45;
                        zK = k(i46, 6, i4);
                        if (i46 >= 5) {
                            z = false;
                        } else {
                            z = false;
                        }
                        int i410 = r.byhourCount;
                        time = time6;
                        zK2 = k(i46, 3, i410);
                        i6 = i410;
                        int i411 = r.byminuteCount;
                        zK3 = k(i46, 2, i411);
                        i7 = i411;
                        int i412 = r.bysecondCount;
                        zK4 = k(i46, 1, i412);
                        time4.set(dtstart);
                        i8 = i3;
                        i9 = i412;
                        if (i8 == 5) {
                            time4.monthDay = 1;
                        }
                        str8 = r.until;
                        i10 = i8;
                        if (str8 == null) {
                            if (str8.length() == 15) {
                                str8 = str8 + 'Z';
                            }
                            time5.parse(str8);
                            time5.switchTimezone(dtstart.timezone);
                            jH3 = h(time5);
                        }
                        j2 = jH3;
                        sb.ensureCapacity(15);
                        sb.setLength(15);
                        i11 = i44;
                        i12 = 0;
                        while (true) {
                            i13 = i12 + 1;
                            if (i12 > 2000) {
                                Log.w(str12, "Recurrence processing stuck with r=" + r + str11 + rangeStartDateValue + str10 + rangeEndDateValue);
                                return;
                            }
                            j(time4);
                            i14 = time4.year;
                            i15 = time4.month + 1;
                            i16 = time4.monthDay;
                            i17 = time4.hour;
                            i18 = time4.minute;
                            i19 = time4.second;
                            time2 = time;
                            time2.set(time4);
                            i20 = 0;
                            while (true) {
                                if (zK) {
                                    i15 = r.bymonth[i20];
                                }
                                i21 = i15 - 1;
                                if (z) {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    if (i23 == 5) {
                                        str10 = str10;
                                        int iDay2TimeDay2 = time4.monthDay - (((time4.weekDay - EventRecurrence.day2TimeDay(r.wkst)) + 7) % 7);
                                        i24 = iDay2TimeDay2;
                                        actualMaximum = iDay2TimeDay2 + 6;
                                    } else {
                                        actualMaximum = time2.getActualMaximum(4);
                                    }
                                    while (true) {
                                        if (z) {
                                            str9 = str11;
                                            daySet = daySet3;
                                            if (daySet.b(time4, i24)) {
                                                i24++;
                                                j2 = j2;
                                                daySet = daySet;
                                                time4 = time4;
                                                i23 = i23;
                                                i34 = i9;
                                                i38 = i6;
                                                i36 = i7;
                                            } else {
                                                i25 = i24;
                                            }
                                            if (z) {
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                str11 = str9;
                                                daySet3 = daySet;
                                                i23 = i23;
                                                time4 = time4;
                                            }
                                        } else {
                                            str9 = str11;
                                            daySet = daySet3;
                                            i25 = i16;
                                        }
                                        i26 = 0;
                                        while (true) {
                                            if (zK2) {
                                                i27 = r.byhour[i26];
                                            } else {
                                                i27 = i17;
                                            }
                                            i28 = 0;
                                            while (true) {
                                                if (zK3) {
                                                    i29 = r.byminute[i28];
                                                } else {
                                                    i29 = i18;
                                                }
                                                i30 = i22;
                                                i31 = 0;
                                                while (true) {
                                                    if (zK4) {
                                                        i32 = r.bysecond[i31];
                                                    } else {
                                                        i32 = i19;
                                                    }
                                                    time2.set(i32, i29, i27, i25, i21, i14);
                                                    j(time2);
                                                    jH = h(time2);
                                                    if (jH < jH2) {
                                                        j2 = j2;
                                                    } else {
                                                        j2 = j2;
                                                    }
                                                    i33 = i31 + 1;
                                                    i34 = i9;
                                                    if (zK4) {
                                                        i31 = i33;
                                                        i9 = i34;
                                                        j2 = j2;
                                                        time4 = time4;
                                                    }
                                                }
                                                i35 = i28 + 1;
                                                i36 = i7;
                                                if (zK3) {
                                                    i28 = i35;
                                                    i9 = i34;
                                                    i7 = i36;
                                                    j2 = j2;
                                                    i23 = i23;
                                                    i22 = i30;
                                                    time4 = time4;
                                                }
                                            }
                                            i37 = i26 + 1;
                                            i38 = i6;
                                            if (zK2) {
                                                i26 = i37;
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                daySet = daySet;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i24++;
                                        i22 = i30;
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    }
                                    i39 = i20 + 1;
                                    i40 = i4;
                                    if (zK) {
                                        i20 = i39;
                                        i4 = i40;
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        i11 = i22;
                                        j2 = j2;
                                        str12 = str2;
                                        i15 = i15;
                                        str10 = str10;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i46 = i23;
                                        time4 = time4;
                                    }
                                } else {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    actualMaximum = 0;
                                }
                                i24 = 1;
                                while (true) {
                                    if (z) {
                                        str9 = str11;
                                        daySet = daySet3;
                                        if (daySet.b(time4, i24)) {
                                            i24++;
                                            j2 = j2;
                                            daySet = daySet;
                                            time4 = time4;
                                            i23 = i23;
                                            i34 = i9;
                                            i38 = i6;
                                            i36 = i7;
                                        } else {
                                            i25 = i24;
                                        }
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    } else {
                                        str9 = str11;
                                        daySet = daySet3;
                                        i25 = i16;
                                    }
                                    i26 = 0;
                                    while (true) {
                                        if (zK2) {
                                            i27 = r.byhour[i26];
                                        } else {
                                            i27 = i17;
                                        }
                                        i28 = 0;
                                        while (true) {
                                            if (zK3) {
                                                i29 = r.byminute[i28];
                                            } else {
                                                i29 = i18;
                                            }
                                            i30 = i22;
                                            i31 = 0;
                                            while (true) {
                                                if (zK4) {
                                                    i32 = r.bysecond[i31];
                                                } else {
                                                    i32 = i19;
                                                }
                                                time2.set(i32, i29, i27, i25, i21, i14);
                                                j(time2);
                                                jH = h(time2);
                                                if (jH < jH2) {
                                                    j2 = j2;
                                                } else {
                                                    j2 = j2;
                                                }
                                                i33 = i31 + 1;
                                                i34 = i9;
                                                if (zK4) {
                                                    i31 = i33;
                                                    i9 = i34;
                                                    j2 = j2;
                                                    time4 = time4;
                                                }
                                            }
                                            i35 = i28 + 1;
                                            i36 = i7;
                                            if (zK3) {
                                                i28 = i35;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i37 = i26 + 1;
                                        i38 = i6;
                                        if (zK2) {
                                            i26 = i37;
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            daySet = daySet;
                                            i23 = i23;
                                            i22 = i30;
                                            time4 = time4;
                                        }
                                    }
                                    i24++;
                                    i22 = i30;
                                    if (z) {
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        j2 = j2;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i23 = i23;
                                        time4 = time4;
                                    }
                                }
                                i39 = i20 + 1;
                                i40 = i4;
                                if (zK) {
                                    i20 = i39;
                                    i4 = i40;
                                    i6 = i38;
                                    i9 = i34;
                                    i7 = i36;
                                    i11 = i22;
                                    j2 = j2;
                                    str12 = str2;
                                    i15 = i15;
                                    str10 = str10;
                                    str11 = str9;
                                    daySet3 = daySet;
                                    i46 = i23;
                                    time4 = time4;
                                }
                                break;
                            }
                            time3 = time4;
                            int i53 = time3.monthDay;
                            time2.set(time3);
                            i41 = 1;
                            while (true) {
                                i42 = i5 * i41;
                                switch (i10) {
                                    case 1:
                                        time3.second += i42;
                                        break;
                                    case 2:
                                        time3.minute += i42;
                                        break;
                                    case 3:
                                        time3.hour += i42;
                                        break;
                                    case 4:
                                        time3.monthDay += i42;
                                        break;
                                    case 5:
                                        time3.month += i42;
                                        break;
                                    case 6:
                                        time3.year += i42;
                                        break;
                                    case 7:
                                        time3.monthDay += i42;
                                        break;
                                    case 8:
                                        time3.monthDay += i42;
                                        break;
                                    default:
                                        throw new RuntimeException("bad field=" + i10);
                                }
                                j(time3);
                                i43 = i10;
                                if (i43 != 6) {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                } else {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                }
                            }
                            i12 = i13;
                            i10 = i43;
                            i4 = i40;
                            i6 = i38;
                            time = time2;
                            i9 = i34;
                            i7 = i36;
                            i11 = i22;
                            str12 = str2;
                            str10 = str10;
                            str11 = str9;
                            daySet3 = daySet;
                            i46 = i23;
                            time4 = time3;
                            j2 = j2;
                        }
                        break;
                    case 3:
                        i3 = 3;
                        if (i45 <= 0) {
                            i45 = 1;
                        }
                        i4 = r.bymonthCount;
                        i5 = i45;
                        zK = k(i46, 6, i4);
                        if (i46 >= 5) {
                            z = false;
                        } else {
                            z = false;
                        }
                        int i413 = r.byhourCount;
                        time = time6;
                        zK2 = k(i46, 3, i413);
                        i6 = i413;
                        int i414 = r.byminuteCount;
                        zK3 = k(i46, 2, i414);
                        i7 = i414;
                        int i415 = r.bysecondCount;
                        zK4 = k(i46, 1, i415);
                        time4.set(dtstart);
                        i8 = i3;
                        i9 = i415;
                        if (i8 == 5) {
                            time4.monthDay = 1;
                        }
                        str8 = r.until;
                        i10 = i8;
                        if (str8 == null) {
                            if (str8.length() == 15) {
                                str8 = str8 + 'Z';
                            }
                            time5.parse(str8);
                            time5.switchTimezone(dtstart.timezone);
                            jH3 = h(time5);
                        }
                        j2 = jH3;
                        sb.ensureCapacity(15);
                        sb.setLength(15);
                        i11 = i44;
                        i12 = 0;
                        while (true) {
                            i13 = i12 + 1;
                            if (i12 > 2000) {
                                Log.w(str12, "Recurrence processing stuck with r=" + r + str11 + rangeStartDateValue + str10 + rangeEndDateValue);
                                return;
                            }
                            j(time4);
                            i14 = time4.year;
                            i15 = time4.month + 1;
                            i16 = time4.monthDay;
                            i17 = time4.hour;
                            i18 = time4.minute;
                            i19 = time4.second;
                            time2 = time;
                            time2.set(time4);
                            i20 = 0;
                            while (true) {
                                if (zK) {
                                    i15 = r.bymonth[i20];
                                }
                                i21 = i15 - 1;
                                if (z) {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    if (i23 == 5) {
                                        str10 = str10;
                                        int iDay2TimeDay3 = time4.monthDay - (((time4.weekDay - EventRecurrence.day2TimeDay(r.wkst)) + 7) % 7);
                                        i24 = iDay2TimeDay3;
                                        actualMaximum = iDay2TimeDay3 + 6;
                                    } else {
                                        actualMaximum = time2.getActualMaximum(4);
                                    }
                                    while (true) {
                                        if (z) {
                                            str9 = str11;
                                            daySet = daySet3;
                                            if (daySet.b(time4, i24)) {
                                                i24++;
                                                j2 = j2;
                                                daySet = daySet;
                                                time4 = time4;
                                                i23 = i23;
                                                i34 = i9;
                                                i38 = i6;
                                                i36 = i7;
                                            } else {
                                                i25 = i24;
                                            }
                                            if (z) {
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                str11 = str9;
                                                daySet3 = daySet;
                                                i23 = i23;
                                                time4 = time4;
                                            }
                                        } else {
                                            str9 = str11;
                                            daySet = daySet3;
                                            i25 = i16;
                                        }
                                        i26 = 0;
                                        while (true) {
                                            if (zK2) {
                                                i27 = r.byhour[i26];
                                            } else {
                                                i27 = i17;
                                            }
                                            i28 = 0;
                                            while (true) {
                                                if (zK3) {
                                                    i29 = r.byminute[i28];
                                                } else {
                                                    i29 = i18;
                                                }
                                                i30 = i22;
                                                i31 = 0;
                                                while (true) {
                                                    if (zK4) {
                                                        i32 = r.bysecond[i31];
                                                    } else {
                                                        i32 = i19;
                                                    }
                                                    time2.set(i32, i29, i27, i25, i21, i14);
                                                    j(time2);
                                                    jH = h(time2);
                                                    if (jH < jH2) {
                                                        j2 = j2;
                                                    } else {
                                                        j2 = j2;
                                                    }
                                                    i33 = i31 + 1;
                                                    i34 = i9;
                                                    if (zK4) {
                                                        i31 = i33;
                                                        i9 = i34;
                                                        j2 = j2;
                                                        time4 = time4;
                                                    }
                                                }
                                                i35 = i28 + 1;
                                                i36 = i7;
                                                if (zK3) {
                                                    i28 = i35;
                                                    i9 = i34;
                                                    i7 = i36;
                                                    j2 = j2;
                                                    i23 = i23;
                                                    i22 = i30;
                                                    time4 = time4;
                                                }
                                            }
                                            i37 = i26 + 1;
                                            i38 = i6;
                                            if (zK2) {
                                                i26 = i37;
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                daySet = daySet;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i24++;
                                        i22 = i30;
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    }
                                    i39 = i20 + 1;
                                    i40 = i4;
                                    if (zK) {
                                        i20 = i39;
                                        i4 = i40;
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        i11 = i22;
                                        j2 = j2;
                                        str12 = str2;
                                        i15 = i15;
                                        str10 = str10;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i46 = i23;
                                        time4 = time4;
                                    }
                                } else {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    actualMaximum = 0;
                                }
                                i24 = 1;
                                while (true) {
                                    if (z) {
                                        str9 = str11;
                                        daySet = daySet3;
                                        if (daySet.b(time4, i24)) {
                                            i24++;
                                            j2 = j2;
                                            daySet = daySet;
                                            time4 = time4;
                                            i23 = i23;
                                            i34 = i9;
                                            i38 = i6;
                                            i36 = i7;
                                        } else {
                                            i25 = i24;
                                        }
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    } else {
                                        str9 = str11;
                                        daySet = daySet3;
                                        i25 = i16;
                                    }
                                    i26 = 0;
                                    while (true) {
                                        if (zK2) {
                                            i27 = r.byhour[i26];
                                        } else {
                                            i27 = i17;
                                        }
                                        i28 = 0;
                                        while (true) {
                                            if (zK3) {
                                                i29 = r.byminute[i28];
                                            } else {
                                                i29 = i18;
                                            }
                                            i30 = i22;
                                            i31 = 0;
                                            while (true) {
                                                if (zK4) {
                                                    i32 = r.bysecond[i31];
                                                } else {
                                                    i32 = i19;
                                                }
                                                time2.set(i32, i29, i27, i25, i21, i14);
                                                j(time2);
                                                jH = h(time2);
                                                if (jH < jH2) {
                                                    j2 = j2;
                                                } else {
                                                    j2 = j2;
                                                }
                                                i33 = i31 + 1;
                                                i34 = i9;
                                                if (zK4) {
                                                    i31 = i33;
                                                    i9 = i34;
                                                    j2 = j2;
                                                    time4 = time4;
                                                }
                                            }
                                            i35 = i28 + 1;
                                            i36 = i7;
                                            if (zK3) {
                                                i28 = i35;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i37 = i26 + 1;
                                        i38 = i6;
                                        if (zK2) {
                                            i26 = i37;
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            daySet = daySet;
                                            i23 = i23;
                                            i22 = i30;
                                            time4 = time4;
                                        }
                                    }
                                    i24++;
                                    i22 = i30;
                                    if (z) {
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        j2 = j2;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i23 = i23;
                                        time4 = time4;
                                    }
                                }
                                i39 = i20 + 1;
                                i40 = i4;
                                if (zK) {
                                    i20 = i39;
                                    i4 = i40;
                                    i6 = i38;
                                    i9 = i34;
                                    i7 = i36;
                                    i11 = i22;
                                    j2 = j2;
                                    str12 = str2;
                                    i15 = i15;
                                    str10 = str10;
                                    str11 = str9;
                                    daySet3 = daySet;
                                    i46 = i23;
                                    time4 = time4;
                                }
                                break;
                            }
                            time3 = time4;
                            int i54 = time3.monthDay;
                            time2.set(time3);
                            i41 = 1;
                            while (true) {
                                i42 = i5 * i41;
                                switch (i10) {
                                    case 1:
                                        time3.second += i42;
                                        break;
                                    case 2:
                                        time3.minute += i42;
                                        break;
                                    case 3:
                                        time3.hour += i42;
                                        break;
                                    case 4:
                                        time3.monthDay += i42;
                                        break;
                                    case 5:
                                        time3.month += i42;
                                        break;
                                    case 6:
                                        time3.year += i42;
                                        break;
                                    case 7:
                                        time3.monthDay += i42;
                                        break;
                                    case 8:
                                        time3.monthDay += i42;
                                        break;
                                    default:
                                        throw new RuntimeException("bad field=" + i10);
                                }
                                j(time3);
                                i43 = i10;
                                if (i43 != 6) {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                } else {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                }
                            }
                            i12 = i13;
                            i10 = i43;
                            i4 = i40;
                            i6 = i38;
                            time = time2;
                            i9 = i34;
                            i7 = i36;
                            i11 = i22;
                            str12 = str2;
                            str10 = str10;
                            str11 = str9;
                            daySet3 = daySet;
                            i46 = i23;
                            time4 = time3;
                            j2 = j2;
                        }
                        break;
                    case 5:
                        i45 *= 7;
                        if (i45 <= 0) {
                            i45 = 7;
                            break;
                        }
                    case 4:
                        i3 = 4;
                        if (i45 <= 0) {
                            i45 = 1;
                        }
                        i4 = r.bymonthCount;
                        i5 = i45;
                        zK = k(i46, 6, i4);
                        if (i46 >= 5) {
                            z = false;
                        } else {
                            z = false;
                        }
                        int i416 = r.byhourCount;
                        time = time6;
                        zK2 = k(i46, 3, i416);
                        i6 = i416;
                        int i417 = r.byminuteCount;
                        zK3 = k(i46, 2, i417);
                        i7 = i417;
                        int i418 = r.bysecondCount;
                        zK4 = k(i46, 1, i418);
                        time4.set(dtstart);
                        i8 = i3;
                        i9 = i418;
                        if (i8 == 5) {
                            time4.monthDay = 1;
                        }
                        str8 = r.until;
                        i10 = i8;
                        if (str8 == null) {
                            if (str8.length() == 15) {
                                str8 = str8 + 'Z';
                            }
                            time5.parse(str8);
                            time5.switchTimezone(dtstart.timezone);
                            jH3 = h(time5);
                        }
                        j2 = jH3;
                        sb.ensureCapacity(15);
                        sb.setLength(15);
                        i11 = i44;
                        i12 = 0;
                        while (true) {
                            i13 = i12 + 1;
                            if (i12 > 2000) {
                                Log.w(str12, "Recurrence processing stuck with r=" + r + str11 + rangeStartDateValue + str10 + rangeEndDateValue);
                                return;
                            }
                            j(time4);
                            i14 = time4.year;
                            i15 = time4.month + 1;
                            i16 = time4.monthDay;
                            i17 = time4.hour;
                            i18 = time4.minute;
                            i19 = time4.second;
                            time2 = time;
                            time2.set(time4);
                            i20 = 0;
                            while (true) {
                                if (zK) {
                                    i15 = r.bymonth[i20];
                                }
                                i21 = i15 - 1;
                                if (z) {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    if (i23 == 5) {
                                        str10 = str10;
                                        int iDay2TimeDay4 = time4.monthDay - (((time4.weekDay - EventRecurrence.day2TimeDay(r.wkst)) + 7) % 7);
                                        i24 = iDay2TimeDay4;
                                        actualMaximum = iDay2TimeDay4 + 6;
                                    } else {
                                        actualMaximum = time2.getActualMaximum(4);
                                    }
                                    while (true) {
                                        if (z) {
                                            str9 = str11;
                                            daySet = daySet3;
                                            if (daySet.b(time4, i24)) {
                                                i24++;
                                                j2 = j2;
                                                daySet = daySet;
                                                time4 = time4;
                                                i23 = i23;
                                                i34 = i9;
                                                i38 = i6;
                                                i36 = i7;
                                            } else {
                                                i25 = i24;
                                            }
                                            if (z) {
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                str11 = str9;
                                                daySet3 = daySet;
                                                i23 = i23;
                                                time4 = time4;
                                            }
                                        } else {
                                            str9 = str11;
                                            daySet = daySet3;
                                            i25 = i16;
                                        }
                                        i26 = 0;
                                        while (true) {
                                            if (zK2) {
                                                i27 = r.byhour[i26];
                                            } else {
                                                i27 = i17;
                                            }
                                            i28 = 0;
                                            while (true) {
                                                if (zK3) {
                                                    i29 = r.byminute[i28];
                                                } else {
                                                    i29 = i18;
                                                }
                                                i30 = i22;
                                                i31 = 0;
                                                while (true) {
                                                    if (zK4) {
                                                        i32 = r.bysecond[i31];
                                                    } else {
                                                        i32 = i19;
                                                    }
                                                    time2.set(i32, i29, i27, i25, i21, i14);
                                                    j(time2);
                                                    jH = h(time2);
                                                    if (jH < jH2) {
                                                        j2 = j2;
                                                    } else {
                                                        j2 = j2;
                                                    }
                                                    i33 = i31 + 1;
                                                    i34 = i9;
                                                    if (zK4) {
                                                        i31 = i33;
                                                        i9 = i34;
                                                        j2 = j2;
                                                        time4 = time4;
                                                    }
                                                }
                                                i35 = i28 + 1;
                                                i36 = i7;
                                                if (zK3) {
                                                    i28 = i35;
                                                    i9 = i34;
                                                    i7 = i36;
                                                    j2 = j2;
                                                    i23 = i23;
                                                    i22 = i30;
                                                    time4 = time4;
                                                }
                                            }
                                            i37 = i26 + 1;
                                            i38 = i6;
                                            if (zK2) {
                                                i26 = i37;
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                daySet = daySet;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i24++;
                                        i22 = i30;
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    }
                                    i39 = i20 + 1;
                                    i40 = i4;
                                    if (zK) {
                                        i20 = i39;
                                        i4 = i40;
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        i11 = i22;
                                        j2 = j2;
                                        str12 = str2;
                                        i15 = i15;
                                        str10 = str10;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i46 = i23;
                                        time4 = time4;
                                    }
                                } else {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    actualMaximum = 0;
                                }
                                i24 = 1;
                                while (true) {
                                    if (z) {
                                        str9 = str11;
                                        daySet = daySet3;
                                        if (daySet.b(time4, i24)) {
                                            i24++;
                                            j2 = j2;
                                            daySet = daySet;
                                            time4 = time4;
                                            i23 = i23;
                                            i34 = i9;
                                            i38 = i6;
                                            i36 = i7;
                                        } else {
                                            i25 = i24;
                                        }
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    } else {
                                        str9 = str11;
                                        daySet = daySet3;
                                        i25 = i16;
                                    }
                                    i26 = 0;
                                    while (true) {
                                        if (zK2) {
                                            i27 = r.byhour[i26];
                                        } else {
                                            i27 = i17;
                                        }
                                        i28 = 0;
                                        while (true) {
                                            if (zK3) {
                                                i29 = r.byminute[i28];
                                            } else {
                                                i29 = i18;
                                            }
                                            i30 = i22;
                                            i31 = 0;
                                            while (true) {
                                                if (zK4) {
                                                    i32 = r.bysecond[i31];
                                                } else {
                                                    i32 = i19;
                                                }
                                                time2.set(i32, i29, i27, i25, i21, i14);
                                                j(time2);
                                                jH = h(time2);
                                                if (jH < jH2) {
                                                    j2 = j2;
                                                } else {
                                                    j2 = j2;
                                                }
                                                i33 = i31 + 1;
                                                i34 = i9;
                                                if (zK4) {
                                                    i31 = i33;
                                                    i9 = i34;
                                                    j2 = j2;
                                                    time4 = time4;
                                                }
                                            }
                                            i35 = i28 + 1;
                                            i36 = i7;
                                            if (zK3) {
                                                i28 = i35;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i37 = i26 + 1;
                                        i38 = i6;
                                        if (zK2) {
                                            i26 = i37;
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            daySet = daySet;
                                            i23 = i23;
                                            i22 = i30;
                                            time4 = time4;
                                        }
                                    }
                                    i24++;
                                    i22 = i30;
                                    if (z) {
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        j2 = j2;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i23 = i23;
                                        time4 = time4;
                                    }
                                }
                                i39 = i20 + 1;
                                i40 = i4;
                                if (zK) {
                                    i20 = i39;
                                    i4 = i40;
                                    i6 = i38;
                                    i9 = i34;
                                    i7 = i36;
                                    i11 = i22;
                                    j2 = j2;
                                    str12 = str2;
                                    i15 = i15;
                                    str10 = str10;
                                    str11 = str9;
                                    daySet3 = daySet;
                                    i46 = i23;
                                    time4 = time4;
                                }
                                break;
                            }
                            time3 = time4;
                            int i55 = time3.monthDay;
                            time2.set(time3);
                            i41 = 1;
                            while (true) {
                                i42 = i5 * i41;
                                switch (i10) {
                                    case 1:
                                        time3.second += i42;
                                        break;
                                    case 2:
                                        time3.minute += i42;
                                        break;
                                    case 3:
                                        time3.hour += i42;
                                        break;
                                    case 4:
                                        time3.monthDay += i42;
                                        break;
                                    case 5:
                                        time3.month += i42;
                                        break;
                                    case 6:
                                        time3.year += i42;
                                        break;
                                    case 7:
                                        time3.monthDay += i42;
                                        break;
                                    case 8:
                                        time3.monthDay += i42;
                                        break;
                                    default:
                                        throw new RuntimeException("bad field=" + i10);
                                }
                                j(time3);
                                i43 = i10;
                                if (i43 != 6) {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                } else {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                }
                            }
                            i12 = i13;
                            i10 = i43;
                            i4 = i40;
                            i6 = i38;
                            time = time2;
                            i9 = i34;
                            i7 = i36;
                            i11 = i22;
                            str12 = str2;
                            str10 = str10;
                            str11 = str9;
                            daySet3 = daySet;
                            i46 = i23;
                            time4 = time3;
                            j2 = j2;
                        }
                        break;
                    case 6:
                        i3 = 5;
                        if (i45 <= 0) {
                            i45 = 1;
                        }
                        i4 = r.bymonthCount;
                        i5 = i45;
                        zK = k(i46, 6, i4);
                        if (i46 >= 5) {
                            z = false;
                        } else {
                            z = false;
                        }
                        int i419 = r.byhourCount;
                        time = time6;
                        zK2 = k(i46, 3, i419);
                        i6 = i419;
                        int i4110 = r.byminuteCount;
                        zK3 = k(i46, 2, i4110);
                        i7 = i4110;
                        int i4111 = r.bysecondCount;
                        zK4 = k(i46, 1, i4111);
                        time4.set(dtstart);
                        i8 = i3;
                        i9 = i4111;
                        if (i8 == 5) {
                            time4.monthDay = 1;
                        }
                        str8 = r.until;
                        i10 = i8;
                        if (str8 == null) {
                            if (str8.length() == 15) {
                                str8 = str8 + 'Z';
                            }
                            time5.parse(str8);
                            time5.switchTimezone(dtstart.timezone);
                            jH3 = h(time5);
                        }
                        j2 = jH3;
                        sb.ensureCapacity(15);
                        sb.setLength(15);
                        i11 = i44;
                        i12 = 0;
                        while (true) {
                            i13 = i12 + 1;
                            if (i12 > 2000) {
                                Log.w(str12, "Recurrence processing stuck with r=" + r + str11 + rangeStartDateValue + str10 + rangeEndDateValue);
                                return;
                            }
                            j(time4);
                            i14 = time4.year;
                            i15 = time4.month + 1;
                            i16 = time4.monthDay;
                            i17 = time4.hour;
                            i18 = time4.minute;
                            i19 = time4.second;
                            time2 = time;
                            time2.set(time4);
                            i20 = 0;
                            while (true) {
                                if (zK) {
                                    i15 = r.bymonth[i20];
                                }
                                i21 = i15 - 1;
                                if (z) {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    if (i23 == 5) {
                                        str10 = str10;
                                        int iDay2TimeDay5 = time4.monthDay - (((time4.weekDay - EventRecurrence.day2TimeDay(r.wkst)) + 7) % 7);
                                        i24 = iDay2TimeDay5;
                                        actualMaximum = iDay2TimeDay5 + 6;
                                    } else {
                                        actualMaximum = time2.getActualMaximum(4);
                                    }
                                    while (true) {
                                        if (z) {
                                            str9 = str11;
                                            daySet = daySet3;
                                            if (daySet.b(time4, i24)) {
                                                i24++;
                                                j2 = j2;
                                                daySet = daySet;
                                                time4 = time4;
                                                i23 = i23;
                                                i34 = i9;
                                                i38 = i6;
                                                i36 = i7;
                                            } else {
                                                i25 = i24;
                                            }
                                            if (z) {
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                str11 = str9;
                                                daySet3 = daySet;
                                                i23 = i23;
                                                time4 = time4;
                                            }
                                        } else {
                                            str9 = str11;
                                            daySet = daySet3;
                                            i25 = i16;
                                        }
                                        i26 = 0;
                                        while (true) {
                                            if (zK2) {
                                                i27 = r.byhour[i26];
                                            } else {
                                                i27 = i17;
                                            }
                                            i28 = 0;
                                            while (true) {
                                                if (zK3) {
                                                    i29 = r.byminute[i28];
                                                } else {
                                                    i29 = i18;
                                                }
                                                i30 = i22;
                                                i31 = 0;
                                                while (true) {
                                                    if (zK4) {
                                                        i32 = r.bysecond[i31];
                                                    } else {
                                                        i32 = i19;
                                                    }
                                                    time2.set(i32, i29, i27, i25, i21, i14);
                                                    j(time2);
                                                    jH = h(time2);
                                                    if (jH < jH2) {
                                                        j2 = j2;
                                                    } else {
                                                        j2 = j2;
                                                    }
                                                    i33 = i31 + 1;
                                                    i34 = i9;
                                                    if (zK4) {
                                                        i31 = i33;
                                                        i9 = i34;
                                                        j2 = j2;
                                                        time4 = time4;
                                                    }
                                                }
                                                i35 = i28 + 1;
                                                i36 = i7;
                                                if (zK3) {
                                                    i28 = i35;
                                                    i9 = i34;
                                                    i7 = i36;
                                                    j2 = j2;
                                                    i23 = i23;
                                                    i22 = i30;
                                                    time4 = time4;
                                                }
                                            }
                                            i37 = i26 + 1;
                                            i38 = i6;
                                            if (zK2) {
                                                i26 = i37;
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                daySet = daySet;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i24++;
                                        i22 = i30;
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    }
                                    i39 = i20 + 1;
                                    i40 = i4;
                                    if (zK) {
                                        i20 = i39;
                                        i4 = i40;
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        i11 = i22;
                                        j2 = j2;
                                        str12 = str2;
                                        i15 = i15;
                                        str10 = str10;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i46 = i23;
                                        time4 = time4;
                                    }
                                } else {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    actualMaximum = 0;
                                }
                                i24 = 1;
                                while (true) {
                                    if (z) {
                                        str9 = str11;
                                        daySet = daySet3;
                                        if (daySet.b(time4, i24)) {
                                            i24++;
                                            j2 = j2;
                                            daySet = daySet;
                                            time4 = time4;
                                            i23 = i23;
                                            i34 = i9;
                                            i38 = i6;
                                            i36 = i7;
                                        } else {
                                            i25 = i24;
                                        }
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    } else {
                                        str9 = str11;
                                        daySet = daySet3;
                                        i25 = i16;
                                    }
                                    i26 = 0;
                                    while (true) {
                                        if (zK2) {
                                            i27 = r.byhour[i26];
                                        } else {
                                            i27 = i17;
                                        }
                                        i28 = 0;
                                        while (true) {
                                            if (zK3) {
                                                i29 = r.byminute[i28];
                                            } else {
                                                i29 = i18;
                                            }
                                            i30 = i22;
                                            i31 = 0;
                                            while (true) {
                                                if (zK4) {
                                                    i32 = r.bysecond[i31];
                                                } else {
                                                    i32 = i19;
                                                }
                                                time2.set(i32, i29, i27, i25, i21, i14);
                                                j(time2);
                                                jH = h(time2);
                                                if (jH < jH2) {
                                                    j2 = j2;
                                                } else {
                                                    j2 = j2;
                                                }
                                                i33 = i31 + 1;
                                                i34 = i9;
                                                if (zK4) {
                                                    i31 = i33;
                                                    i9 = i34;
                                                    j2 = j2;
                                                    time4 = time4;
                                                }
                                            }
                                            i35 = i28 + 1;
                                            i36 = i7;
                                            if (zK3) {
                                                i28 = i35;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i37 = i26 + 1;
                                        i38 = i6;
                                        if (zK2) {
                                            i26 = i37;
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            daySet = daySet;
                                            i23 = i23;
                                            i22 = i30;
                                            time4 = time4;
                                        }
                                    }
                                    i24++;
                                    i22 = i30;
                                    if (z) {
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        j2 = j2;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i23 = i23;
                                        time4 = time4;
                                    }
                                }
                                i39 = i20 + 1;
                                i40 = i4;
                                if (zK) {
                                    i20 = i39;
                                    i4 = i40;
                                    i6 = i38;
                                    i9 = i34;
                                    i7 = i36;
                                    i11 = i22;
                                    j2 = j2;
                                    str12 = str2;
                                    i15 = i15;
                                    str10 = str10;
                                    str11 = str9;
                                    daySet3 = daySet;
                                    i46 = i23;
                                    time4 = time4;
                                }
                                break;
                            }
                            time3 = time4;
                            int i56 = time3.monthDay;
                            time2.set(time3);
                            i41 = 1;
                            while (true) {
                                i42 = i5 * i41;
                                switch (i10) {
                                    case 1:
                                        time3.second += i42;
                                        break;
                                    case 2:
                                        time3.minute += i42;
                                        break;
                                    case 3:
                                        time3.hour += i42;
                                        break;
                                    case 4:
                                        time3.monthDay += i42;
                                        break;
                                    case 5:
                                        time3.month += i42;
                                        break;
                                    case 6:
                                        time3.year += i42;
                                        break;
                                    case 7:
                                        time3.monthDay += i42;
                                        break;
                                    case 8:
                                        time3.monthDay += i42;
                                        break;
                                    default:
                                        throw new RuntimeException("bad field=" + i10);
                                }
                                j(time3);
                                i43 = i10;
                                if (i43 != 6) {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                } else {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                }
                            }
                            i12 = i13;
                            i10 = i43;
                            i4 = i40;
                            i6 = i38;
                            time = time2;
                            i9 = i34;
                            i7 = i36;
                            i11 = i22;
                            str12 = str2;
                            str10 = str10;
                            str11 = str9;
                            daySet3 = daySet;
                            i46 = i23;
                            time4 = time3;
                            j2 = j2;
                        }
                        break;
                    case 7:
                        i3 = 6;
                        if (i45 <= 0) {
                            i45 = 1;
                        }
                        i4 = r.bymonthCount;
                        i5 = i45;
                        zK = k(i46, 6, i4);
                        if (i46 >= 5) {
                            z = false;
                        } else {
                            z = false;
                        }
                        int i4112 = r.byhourCount;
                        time = time6;
                        zK2 = k(i46, 3, i4112);
                        i6 = i4112;
                        int i4113 = r.byminuteCount;
                        zK3 = k(i46, 2, i4113);
                        i7 = i4113;
                        int i4114 = r.bysecondCount;
                        zK4 = k(i46, 1, i4114);
                        time4.set(dtstart);
                        i8 = i3;
                        i9 = i4114;
                        if (i8 == 5) {
                            time4.monthDay = 1;
                        }
                        str8 = r.until;
                        i10 = i8;
                        if (str8 == null) {
                            if (str8.length() == 15) {
                                str8 = str8 + 'Z';
                            }
                            time5.parse(str8);
                            time5.switchTimezone(dtstart.timezone);
                            jH3 = h(time5);
                        }
                        j2 = jH3;
                        sb.ensureCapacity(15);
                        sb.setLength(15);
                        i11 = i44;
                        i12 = 0;
                        while (true) {
                            i13 = i12 + 1;
                            if (i12 > 2000) {
                                Log.w(str12, "Recurrence processing stuck with r=" + r + str11 + rangeStartDateValue + str10 + rangeEndDateValue);
                                return;
                            }
                            j(time4);
                            i14 = time4.year;
                            i15 = time4.month + 1;
                            i16 = time4.monthDay;
                            i17 = time4.hour;
                            i18 = time4.minute;
                            i19 = time4.second;
                            time2 = time;
                            time2.set(time4);
                            i20 = 0;
                            while (true) {
                                if (zK) {
                                    i15 = r.bymonth[i20];
                                }
                                i21 = i15 - 1;
                                if (z) {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    if (i23 == 5) {
                                        str10 = str10;
                                        int iDay2TimeDay6 = time4.monthDay - (((time4.weekDay - EventRecurrence.day2TimeDay(r.wkst)) + 7) % 7);
                                        i24 = iDay2TimeDay6;
                                        actualMaximum = iDay2TimeDay6 + 6;
                                    } else {
                                        actualMaximum = time2.getActualMaximum(4);
                                    }
                                    while (true) {
                                        if (z) {
                                            str9 = str11;
                                            daySet = daySet3;
                                            if (daySet.b(time4, i24)) {
                                                i24++;
                                                j2 = j2;
                                                daySet = daySet;
                                                time4 = time4;
                                                i23 = i23;
                                                i34 = i9;
                                                i38 = i6;
                                                i36 = i7;
                                            } else {
                                                i25 = i24;
                                            }
                                            if (z) {
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                str11 = str9;
                                                daySet3 = daySet;
                                                i23 = i23;
                                                time4 = time4;
                                            }
                                        } else {
                                            str9 = str11;
                                            daySet = daySet3;
                                            i25 = i16;
                                        }
                                        i26 = 0;
                                        while (true) {
                                            if (zK2) {
                                                i27 = r.byhour[i26];
                                            } else {
                                                i27 = i17;
                                            }
                                            i28 = 0;
                                            while (true) {
                                                if (zK3) {
                                                    i29 = r.byminute[i28];
                                                } else {
                                                    i29 = i18;
                                                }
                                                i30 = i22;
                                                i31 = 0;
                                                while (true) {
                                                    if (zK4) {
                                                        i32 = r.bysecond[i31];
                                                    } else {
                                                        i32 = i19;
                                                    }
                                                    time2.set(i32, i29, i27, i25, i21, i14);
                                                    j(time2);
                                                    jH = h(time2);
                                                    if (jH < jH2) {
                                                        j2 = j2;
                                                    } else {
                                                        j2 = j2;
                                                    }
                                                    i33 = i31 + 1;
                                                    i34 = i9;
                                                    if (zK4) {
                                                        i31 = i33;
                                                        i9 = i34;
                                                        j2 = j2;
                                                        time4 = time4;
                                                    }
                                                }
                                                i35 = i28 + 1;
                                                i36 = i7;
                                                if (zK3) {
                                                    i28 = i35;
                                                    i9 = i34;
                                                    i7 = i36;
                                                    j2 = j2;
                                                    i23 = i23;
                                                    i22 = i30;
                                                    time4 = time4;
                                                }
                                            }
                                            i37 = i26 + 1;
                                            i38 = i6;
                                            if (zK2) {
                                                i26 = i37;
                                                i6 = i38;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                daySet = daySet;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i24++;
                                        i22 = i30;
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    }
                                    i39 = i20 + 1;
                                    i40 = i4;
                                    if (zK) {
                                        i20 = i39;
                                        i4 = i40;
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        i11 = i22;
                                        j2 = j2;
                                        str12 = str2;
                                        i15 = i15;
                                        str10 = str10;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i46 = i23;
                                        time4 = time4;
                                    }
                                } else {
                                    i22 = i11;
                                    i23 = i46;
                                    str2 = str12;
                                    actualMaximum = 0;
                                }
                                i24 = 1;
                                while (true) {
                                    if (z) {
                                        str9 = str11;
                                        daySet = daySet3;
                                        if (daySet.b(time4, i24)) {
                                            i24++;
                                            j2 = j2;
                                            daySet = daySet;
                                            time4 = time4;
                                            i23 = i23;
                                            i34 = i9;
                                            i38 = i6;
                                            i36 = i7;
                                        } else {
                                            i25 = i24;
                                        }
                                        if (z) {
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            str11 = str9;
                                            daySet3 = daySet;
                                            i23 = i23;
                                            time4 = time4;
                                        }
                                    } else {
                                        str9 = str11;
                                        daySet = daySet3;
                                        i25 = i16;
                                    }
                                    i26 = 0;
                                    while (true) {
                                        if (zK2) {
                                            i27 = r.byhour[i26];
                                        } else {
                                            i27 = i17;
                                        }
                                        i28 = 0;
                                        while (true) {
                                            if (zK3) {
                                                i29 = r.byminute[i28];
                                            } else {
                                                i29 = i18;
                                            }
                                            i30 = i22;
                                            i31 = 0;
                                            while (true) {
                                                if (zK4) {
                                                    i32 = r.bysecond[i31];
                                                } else {
                                                    i32 = i19;
                                                }
                                                time2.set(i32, i29, i27, i25, i21, i14);
                                                j(time2);
                                                jH = h(time2);
                                                if (jH < jH2) {
                                                    j2 = j2;
                                                } else {
                                                    j2 = j2;
                                                }
                                                i33 = i31 + 1;
                                                i34 = i9;
                                                if (zK4) {
                                                    i31 = i33;
                                                    i9 = i34;
                                                    j2 = j2;
                                                    time4 = time4;
                                                }
                                            }
                                            i35 = i28 + 1;
                                            i36 = i7;
                                            if (zK3) {
                                                i28 = i35;
                                                i9 = i34;
                                                i7 = i36;
                                                j2 = j2;
                                                i23 = i23;
                                                i22 = i30;
                                                time4 = time4;
                                            }
                                        }
                                        i37 = i26 + 1;
                                        i38 = i6;
                                        if (zK2) {
                                            i26 = i37;
                                            i6 = i38;
                                            i9 = i34;
                                            i7 = i36;
                                            j2 = j2;
                                            daySet = daySet;
                                            i23 = i23;
                                            i22 = i30;
                                            time4 = time4;
                                        }
                                    }
                                    i24++;
                                    i22 = i30;
                                    if (z) {
                                        i6 = i38;
                                        i9 = i34;
                                        i7 = i36;
                                        j2 = j2;
                                        str11 = str9;
                                        daySet3 = daySet;
                                        i23 = i23;
                                        time4 = time4;
                                    }
                                }
                                i39 = i20 + 1;
                                i40 = i4;
                                if (zK) {
                                    i20 = i39;
                                    i4 = i40;
                                    i6 = i38;
                                    i9 = i34;
                                    i7 = i36;
                                    i11 = i22;
                                    j2 = j2;
                                    str12 = str2;
                                    i15 = i15;
                                    str10 = str10;
                                    str11 = str9;
                                    daySet3 = daySet;
                                    i46 = i23;
                                    time4 = time4;
                                }
                                break;
                            }
                            time3 = time4;
                            int i57 = time3.monthDay;
                            time2.set(time3);
                            i41 = 1;
                            while (true) {
                                i42 = i5 * i41;
                                switch (i10) {
                                    case 1:
                                        time3.second += i42;
                                        break;
                                    case 2:
                                        time3.minute += i42;
                                        break;
                                    case 3:
                                        time3.hour += i42;
                                        break;
                                    case 4:
                                        time3.monthDay += i42;
                                        break;
                                    case 5:
                                        time3.month += i42;
                                        break;
                                    case 6:
                                        time3.year += i42;
                                        break;
                                    case 7:
                                        time3.monthDay += i42;
                                        break;
                                    case 8:
                                        time3.monthDay += i42;
                                        break;
                                    default:
                                        throw new RuntimeException("bad field=" + i10);
                                }
                                j(time3);
                                i43 = i10;
                                if (i43 != 6) {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                } else {
                                    i41++;
                                    time3.set(time2);
                                    i10 = i43;
                                }
                            }
                            i12 = i13;
                            i10 = i43;
                            i4 = i40;
                            i6 = i38;
                            time = time2;
                            i9 = i34;
                            i7 = i36;
                            i11 = i22;
                            str12 = str2;
                            str10 = str10;
                            str11 = str9;
                            daySet3 = daySet;
                            i46 = i23;
                            time4 = time3;
                            j2 = j2;
                        }
                        break;
                    default:
                        throw new DateException("bad freq=" + i46);
                }
            } catch (DateException e5) {
                e = e5;
                str4 = str5;
                str10 = str6;
                str3 = str7;
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (DateException e7) {
            e = e7;
            str3 = " rangeStart=";
            str4 = g;
        } catch (RuntimeException e8) {
            e = e8;
            str10 = " rangeEnd=";
            str = " rangeStart=";
            str2 = g;
        }
    }
}
