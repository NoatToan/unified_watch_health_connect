package com.xiaomi.fitness.sync.model;

import android.text.format.Time;
import android.util.Log;
import com.xiaomi.fitness.sync.exception.DateException;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes10.dex */
public class RecurrenceProcessor {
    private static final int MAX_ALLOWED_ITERATIONS = 2000;
    private static final boolean SPEW = false;
    private static final String TAG = "RecurrenceProcessor";
    private static final int USE_BYLIST = 1;
    private static final int USE_ITERATOR = 0;
    private static final int[] DAYS_PER_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] DAYS_IN_YEAR_PRECEDING_MONTH = {0, 31, 59, 90, 120, 151, 180, 212, 243, 273, 304, 334};
    private Time mIterator = new Time("UTC");
    private Time mUntil = new Time("UTC");
    private StringBuilder mStringBuilder = new StringBuilder();
    private Time mGenerated = new Time("UTC");
    private DaySet mDays = new DaySet(false);

    public static class DaySet {
        private int mDays;
        private int mMonth;
        private EventRecurrence mR;
        private Time mTime = new Time("UTC");
        private int mYear;

        public DaySet(boolean z) {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0047 A[PHI: r10
          0x0047: PHI (r10v5 int) = (r10v3 int), (r10v6 int) binds: [B:27:0x0053, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
        private static int generateDaysList(Time time, EventRecurrence eventRecurrence) {
            int i;
            int i2;
            int i3;
            int actualMaximum = time.getActualMaximum(4);
            int i4 = eventRecurrence.bydayCount;
            if (i4 > 0) {
                int i5 = time.monthDay;
                while (i5 >= 8) {
                    i5 -= 7;
                }
                int i6 = time.weekDay;
                int i7 = i6 >= i5 ? (i6 - i5) + 1 : (i6 - i5) + 8;
                int[] iArr = eventRecurrence.byday;
                int[] iArr2 = eventRecurrence.bydayNum;
                i = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = iArr2[i8];
                    int iDay2TimeDay = EventRecurrence.day2TimeDay(iArr[i8]) - i7;
                    int i10 = iDay2TimeDay + 1;
                    if (i10 <= 0) {
                        i10 = iDay2TimeDay + 8;
                    }
                    if (i9 == 0) {
                        while (i10 <= actualMaximum) {
                            i |= 1 << i10;
                            i10 += 7;
                        }
                    } else if (i9 > 0) {
                        i3 = i10 + ((i9 - 1) * 7);
                        if (i3 <= actualMaximum) {
                            i |= 1 << i3;
                        }
                    } else {
                        while (i10 <= actualMaximum) {
                            i10 += 7;
                        }
                        i3 = i10 + (i9 * 7);
                        if (i3 >= 1) {
                            i |= 1 << i3;
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (eventRecurrence.freq > 5 && (i2 = eventRecurrence.bymonthdayCount) != 0) {
                int[] iArr3 = eventRecurrence.bymonthday;
                if (eventRecurrence.bydayCount == 0) {
                    for (int i11 = 0; i11 < i2; i11++) {
                        int i12 = iArr3[i11];
                        if (i12 >= 0 || ((i12 = i12 + actualMaximum + 1) >= 1 && i12 <= actualMaximum)) {
                            i = (1 << i12) | i;
                        }
                    }
                } else {
                    for (int i13 = 1; i13 <= actualMaximum; i13++) {
                        int i14 = 1 << i13;
                        if ((i & i14) != 0) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i2) {
                                    i = (~i14) & i;
                                    break;
                                }
                                if (iArr3[i15] == i13) {
                                    break;
                                }
                                i15++;
                            }
                        }
                    }
                }
            }
            return i;
        }

        public boolean get(Time time, int i) {
            Time time2;
            int i2 = time.year;
            int i3 = time.month;
            if (i < 1 || i > 28) {
                time2 = this.mTime;
                time2.set(i, i3, i2);
                RecurrenceProcessor.unsafeNormalize(time2);
                i2 = time2.year;
                i3 = time2.month;
                i = time2.monthDay;
            } else {
                time2 = null;
            }
            if (i2 != this.mYear || i3 != this.mMonth) {
                if (time2 == null) {
                    time2 = this.mTime;
                    time2.set(i, i3, i2);
                    RecurrenceProcessor.unsafeNormalize(time2);
                }
                this.mYear = i2;
                this.mMonth = i3;
                this.mDays = generateDaysList(time2, this.mR);
            }
            return (this.mDays & (1 << i)) != 0;
        }

        public void setRecurrence(EventRecurrence eventRecurrence) {
            this.mYear = 0;
            this.mMonth = -1;
            this.mR = eventRecurrence;
        }
    }

    private static int filter(EventRecurrence eventRecurrence, Time time) {
        int i;
        int i2;
        int i3;
        int i4 = eventRecurrence.freq;
        if (6 >= i4 && (i3 = eventRecurrence.bymonthCount) > 0 && !listContains(eventRecurrence.bymonth, i3, time.month + 1)) {
            return 1;
        }
        if (5 >= i4 && (i2 = eventRecurrence.byweeknoCount) > 0 && !listContains(eventRecurrence.byweekno, i2, time.getWeekNumber(), time.getActualMaximum(9))) {
            return 2;
        }
        if (4 >= i4) {
            int i5 = eventRecurrence.byyeardayCount;
            if (i5 > 0 && !listContains(eventRecurrence.byyearday, i5, time.yearDay, time.getActualMaximum(8))) {
                return 3;
            }
            int i6 = eventRecurrence.bymonthdayCount;
            if (i6 > 0 && !listContains(eventRecurrence.bymonthday, i6, time.monthDay, time.getActualMaximum(4))) {
                return 4;
            }
            int i7 = eventRecurrence.bydayCount;
            if (i7 > 0) {
                int[] iArr = eventRecurrence.byday;
                int iTimeDay2Day = EventRecurrence.timeDay2Day(time.weekDay);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (iArr[i8] != iTimeDay2Day) {
                    }
                }
                return 5;
            }
        }
        if (3 >= i4 && !listContains(eventRecurrence.byhour, eventRecurrence.byhourCount, time.hour, time.getActualMaximum(3))) {
            return 6;
        }
        if (2 >= i4 && !listContains(eventRecurrence.byminute, eventRecurrence.byminuteCount, time.minute, time.getActualMaximum(2))) {
            return 7;
        }
        if (1 >= i4 && !listContains(eventRecurrence.bysecond, eventRecurrence.bysecondCount, time.second, time.getActualMaximum(1))) {
            return 8;
        }
        if (eventRecurrence.bysetposCount > 0) {
            if (i4 == 6 && (i = eventRecurrence.bydayCount) > 0) {
                for (int i9 = i - 1; i9 >= 0; i9--) {
                    if (eventRecurrence.bydayNum[i9] != 0) {
                        if (Log.isLoggable(TAG, 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("BYSETPOS not supported with these rules: ");
                            sb.append(eventRecurrence);
                        }
                    }
                }
                if (!filterMonthlySetPos(eventRecurrence, time)) {
                    return 9;
                }
            } else if (Log.isLoggable(TAG, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("BYSETPOS not supported with these rules: ");
                sb2.append(eventRecurrence);
            }
        }
        return 0;
    }

    private static boolean filterMonthlySetPos(EventRecurrence eventRecurrence, Time time) {
        int i = ((time.weekDay - time.monthDay) + 36) % 7;
        int i2 = 0;
        for (int i3 = 0; i3 < eventRecurrence.bydayCount; i3++) {
            i2 |= eventRecurrence.byday[i3];
        }
        int actualMaximum = time.getActualMaximum(4);
        int[] iArr = new int[actualMaximum];
        int i4 = 0;
        for (int i5 = 1; i5 <= actualMaximum; i5++) {
            if (((65536 << i) & i2) != 0) {
                iArr[i4] = i5;
                i4++;
            }
            i++;
            if (i == 7) {
                i = 0;
            }
        }
        for (int i6 = eventRecurrence.bysetposCount - 1; i6 >= 0; i6--) {
            int i7 = eventRecurrence.bysetpos[i6];
            if (i7 > 0) {
                if (i7 <= i4 && iArr[i7 - 1] == time.monthDay) {
                    return true;
                }
            } else {
                if (i7 >= 0) {
                    throw new RuntimeException("invalid bysetpos value");
                }
                int i8 = i7 + i4;
                if (i8 >= 0 && iArr[i8] == time.monthDay) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isLeapYear(int i) {
        return i % 4 == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    private static boolean listContains(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static int monthLength(int i, int i2) {
        int i3 = DAYS_PER_MONTH[i2];
        if (i3 != 28) {
            return i3;
        }
        return isLeapYear(i) ? 29 : 28;
    }

    private static final long normDateTimeComparisonValue(Time time) {
        return (((long) time.year) << 26) + ((long) (time.month << 22)) + ((long) (time.monthDay << 17)) + ((long) (time.hour << 12)) + ((long) (time.minute << 6)) + ((long) time.second);
    }

    public static final void setTimeFromLongValue(Time time, long j) {
        time.year = (int) (j >> 26);
        time.month = ((int) (j >> 22)) & 15;
        time.monthDay = ((int) (j >> 17)) & 31;
        time.hour = ((int) (j >> 12)) & 31;
        time.minute = ((int) (j >> 6)) & 63;
        time.second = (int) (j & 63);
    }

    public static void unsafeNormalize(Time time) {
        int i = time.second;
        int i2 = time.minute;
        int i3 = time.hour;
        int i4 = time.monthDay;
        int i5 = time.month;
        int i6 = time.year;
        int i7 = (i < 0 ? i - 59 : i) / 60;
        int i8 = i - (i7 * 60);
        int i9 = i2 + i7;
        int i10 = (i9 < 0 ? i9 - 59 : i9) / 60;
        int i11 = i9 - (i10 * 60);
        int i12 = i3 + i10;
        int i13 = (i12 < 0 ? i12 - 23 : i12) / 24;
        int i14 = i12 - (i13 * 24);
        int iYearLength = i4 + i13;
        while (iYearLength <= 0) {
            iYearLength += i5 > 1 ? yearLength(i6) : yearLength(i6 - 1);
            i6--;
        }
        if (i5 < 0) {
            int i15 = ((i5 + 1) / 12) - 1;
            i6 += i15;
            i5 -= i15 * 12;
        } else if (i5 >= 12) {
            int i16 = i5 / 12;
            i6 += i16;
            i5 -= i16 * 12;
        }
        while (true) {
            if (i5 == 0) {
                int iYearLength2 = yearLength(i6);
                if (iYearLength > iYearLength2) {
                    i6++;
                    iYearLength -= iYearLength2;
                }
            }
            int iMonthLength = monthLength(i6, i5);
            if (iYearLength <= iMonthLength) {
                time.second = i8;
                time.minute = i11;
                time.hour = i14;
                time.monthDay = iYearLength;
                time.month = i5;
                time.year = i6;
                time.weekDay = weekDay(i6, i5, iYearLength);
                time.yearDay = yearDay(i6, i5, iYearLength);
                return;
            }
            iYearLength -= iMonthLength;
            int i17 = i5 + 1;
            if (i17 >= 12) {
                i5 -= 11;
                i6++;
            } else {
                i5 = i17;
            }
        }
    }

    private static boolean useBYX(int i, int i2, int i3) {
        return i > i2 && i3 > 0;
    }

    public static int weekDay(int i, int i2, int i3) {
        if (i2 <= 1) {
            i2 += 12;
            i--;
        }
        return (((((i3 + (((i2 * 13) - 14) / 5)) + i) + (i / 4)) - (i / 100)) + (i / 400)) % 7;
    }

    public static int yearDay(int i, int i2, int i3) {
        int i4 = DAYS_IN_YEAR_PRECEDING_MONTH[i2] + i3;
        return (i2 < 2 || !isLeapYear(i)) ? i4 - 1 : i4;
    }

    public static int yearLength(int i) {
        return isLeapYear(i) ? 366 : 365;
    }

    public long[] expand(Time time, RecurrenceSet recurrenceSet, long j, long j2) throws DateException {
        long jNormDateTimeComparisonValue;
        String str = time.timezone;
        this.mIterator.clear(str);
        this.mGenerated.clear(str);
        this.mIterator.set(j);
        long jNormDateTimeComparisonValue2 = normDateTimeComparisonValue(this.mIterator);
        if (j2 != -1) {
            this.mIterator.set(j2);
            jNormDateTimeComparisonValue = normDateTimeComparisonValue(this.mIterator);
        } else {
            jNormDateTimeComparisonValue = Long.MAX_VALUE;
        }
        long j3 = jNormDateTimeComparisonValue;
        TreeSet<Long> treeSet = new TreeSet<>();
        EventRecurrence[] eventRecurrenceArr = recurrenceSet.rrules;
        int i = 0;
        if (eventRecurrenceArr != null) {
            int length = eventRecurrenceArr.length;
            int i2 = 0;
            while (i2 < length) {
                expand(time, eventRecurrenceArr[i2], jNormDateTimeComparisonValue2, j3, true, treeSet);
                i2++;
                i = i;
                length = length;
                eventRecurrenceArr = eventRecurrenceArr;
            }
        }
        int i3 = i;
        long[] jArr = recurrenceSet.rdates;
        if (jArr != null) {
            int length2 = jArr.length;
            for (int i4 = i3; i4 < length2; i4++) {
                this.mIterator.set(jArr[i4]);
                treeSet.add(Long.valueOf(normDateTimeComparisonValue(this.mIterator)));
            }
        }
        EventRecurrence[] eventRecurrenceArr2 = recurrenceSet.exrules;
        if (eventRecurrenceArr2 != null) {
            int length3 = eventRecurrenceArr2.length;
            int i5 = i3;
            while (i5 < length3) {
                expand(time, eventRecurrenceArr2[i5], jNormDateTimeComparisonValue2, j3, false, treeSet);
                i5++;
                length3 = length3;
                eventRecurrenceArr2 = eventRecurrenceArr2;
            }
        }
        long[] jArr2 = recurrenceSet.exdates;
        if (jArr2 != null) {
            int length4 = jArr2.length;
            for (int i6 = i3; i6 < length4; i6++) {
                this.mIterator.set(jArr2[i6]);
                treeSet.remove(Long.valueOf(normDateTimeComparisonValue(this.mIterator)));
            }
        }
        if (treeSet.isEmpty()) {
            return new long[i3];
        }
        long[] jArr3 = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        int i7 = i3;
        while (it.hasNext()) {
            setTimeFromLongValue(this.mIterator, it.next().longValue());
            jArr3[i7] = this.mIterator.toMillis(true);
            i7++;
        }
        return jArr3;
    }

    public int generateByList(int i, int i2, int i3) {
        return (i3 < i2 && i != 0) ? 1 : 0;
    }

    public long getLastOccurence(Time time, RecurrenceSet recurrenceSet) throws DateException {
        return getLastOccurence(time, null, recurrenceSet);
    }

    private static boolean listContains(int[] iArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = iArr[i4];
            if (i5 <= 0) {
                i3 += i5;
                if (i3 == i2) {
                    return true;
                }
            } else if (i5 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x007e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    public long getLastOccurence(Time time, Time time2, RecurrenceSet recurrenceSet) throws DateException {
        long[] jArrExpand;
        long[] jArr;
        EventRecurrence[] eventRecurrenceArr = recurrenceSet.rrules;
        long j = -1;
        if (eventRecurrenceArr != null) {
            long j2 = -1;
            boolean z = false;
            for (EventRecurrence eventRecurrence : eventRecurrenceArr) {
                if (eventRecurrence.count != 0) {
                    z = true;
                } else {
                    String str = eventRecurrence.until;
                    if (str != null) {
                        this.mIterator.parse(str);
                        long millis = this.mIterator.toMillis(false);
                        if (millis > j2) {
                            j2 = millis;
                        }
                    }
                }
            }
            if (j2 != -1 && (jArr = recurrenceSet.rdates) != null) {
                for (long j3 : jArr) {
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
            }
            if (j2 != -1 && !z) {
                return j2;
            }
            if (!z) {
            }
            jArrExpand = expand(time, recurrenceSet, time.toMillis(false), time2 != null ? time2.toMillis(false) : -1L);
            if (jArrExpand.length == 0) {
                return 0L;
            }
            return jArrExpand[jArrExpand.length - 1];
        }
        long[] jArr2 = recurrenceSet.rdates;
        if (jArr2 != null && recurrenceSet.exrules == null && recurrenceSet.exdates == null) {
            for (long j4 : jArr2) {
                if (j4 > j) {
                    j = j4;
                }
            }
            return j;
        }
        if (recurrenceSet.rdates == null && time2 == null) {
            return -1L;
        }
        jArrExpand = expand(time, recurrenceSet, time.toMillis(false), time2 != null ? time2.toMillis(false) : -1L);
        if (jArrExpand.length == 0) {
            return 0L;
        }
        return jArrExpand[jArrExpand.length - 1];
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x0217 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0274  */
    /* JADX WARN: Code duplicated, block: B:143:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x0337 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0342 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:173:0x034d A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0358 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0363 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:176:0x036e A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0379 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0384 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0394  */
    /* JADX WARN: Code duplicated, block: B:184:0x0398 A[Catch: RuntimeException -> 0x01f1, DateException -> 0x01f4, TryCatch #5 {DateException -> 0x01f4, RuntimeException -> 0x01f1, blocks: (B:161:0x02ec, B:166:0x0313, B:167:0x0319, B:168:0x031b, B:169:0x031e, B:170:0x0336, B:171:0x0337, B:179:0x038e, B:184:0x0398, B:187:0x03b2, B:172:0x0342, B:173:0x034d, B:174:0x0358, B:175:0x0363, B:176:0x036e, B:177:0x0379, B:178:0x0384, B:103:0x01ea, B:109:0x01fd, B:111:0x0217, B:132:0x0242, B:135:0x026a, B:141:0x027c, B:146:0x0293, B:151:0x02b0, B:156:0x02cf, B:133:0x0252, B:122:0x022f), top: B:198:0x02ec }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0313 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x02cf A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02b0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0293 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5 A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TRY_ENTER, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[Catch: RuntimeException -> 0x0054, DateException -> 0x03bf, TRY_ENTER, TRY_LEAVE, TryCatch #0 {DateException -> 0x03bf, blocks: (B:24:0x005d, B:40:0x0099, B:49:0x00b4, B:55:0x00e4, B:65:0x0117, B:71:0x013f), top: B:195:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170 A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x018a A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:86:0x019c A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6 A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c9 A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7 A[Catch: RuntimeException -> 0x0054, DateException -> 0x0059, TRY_LEAVE, TryCatch #1 {DateException -> 0x0059, blocks: (B:11:0x0037, B:13:0x0043, B:15:0x0047, B:18:0x004c, B:19:0x0053, B:27:0x0068, B:28:0x007e, B:43:0x00a5, B:45:0x00a9, B:54:0x00e2, B:59:0x00ee, B:61:0x00f4, B:62:0x0105, B:69:0x0124, B:75:0x015b, B:77:0x0163, B:81:0x0170, B:86:0x019c, B:88:0x01a6, B:93:0x01c9, B:97:0x01d7, B:82:0x018a), top: B:197:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01de  */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x00f4, please report this as an issue */
    public void expand(Time time, EventRecurrence eventRecurrence, long j, long j2, boolean z, TreeSet<Long> treeSet) throws DateException {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        boolean zUseBYX;
        boolean z2;
        DaySet daySet;
        boolean zUseBYX2;
        int i5;
        boolean zUseBYX3;
        int i6;
        boolean zUseBYX4;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int actualMaximum;
        int i24;
        int i25;
        DaySet daySet2;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        long jNormDateTimeComparisonValue;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        String str3 = " rangeEnd=";
        unsafeNormalize(time);
        long jNormDateTimeComparisonValue2 = normDateTimeComparisonValue(time);
        if (!z || jNormDateTimeComparisonValue2 < j || jNormDateTimeComparisonValue2 >= j2) {
            i = 0;
        } else {
            treeSet.add(Long.valueOf(jNormDateTimeComparisonValue2));
            i = 1;
        }
        Time time2 = this.mIterator;
        Time time3 = this.mUntil;
        StringBuilder sb = this.mStringBuilder;
        int i45 = i;
        Time time4 = this.mGenerated;
        DaySet daySet3 = this.mDays;
        try {
            try {
                daySet3.setRecurrence(eventRecurrence);
                long jNormDateTimeComparisonValue3 = Long.MAX_VALUE;
                if (j2 == Long.MAX_VALUE && eventRecurrence.until == null && eventRecurrence.count == 0) {
                    throw new DateException("No range end provided for a recurrence that has no UNTIL or COUNT.");
                }
                try {
                    int i46 = eventRecurrence.interval;
                    int i47 = eventRecurrence.freq;
                    switch (i47) {
                        case 1:
                            i2 = 1;
                            if (i46 <= 0) {
                                i46 = 1;
                            }
                            i3 = eventRecurrence.bymonthCount;
                            i4 = i46;
                            zUseBYX = useBYX(i47, 6, i3);
                            if (i47 >= 5 || (eventRecurrence.bydayCount <= 0 && eventRecurrence.bymonthdayCount <= 0)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            int i48 = eventRecurrence.byhourCount;
                            daySet = daySet3;
                            zUseBYX2 = useBYX(i47, 3, i48);
                            i5 = i48;
                            int i49 = eventRecurrence.byminuteCount;
                            zUseBYX3 = useBYX(i47, 2, i49);
                            i6 = i49;
                            int i50 = eventRecurrence.bysecondCount;
                            zUseBYX4 = useBYX(i47, 1, i50);
                            time2.set(time);
                            i7 = i2;
                            i8 = i50;
                            if (i7 == 5 && z2) {
                                time2.monthDay = 1;
                            }
                            str2 = eventRecurrence.until;
                            i9 = i7;
                            if (str2 == null) {
                                if (str2.length() == 15) {
                                    str2 = str2 + 'Z';
                                }
                                time3.parse(str2);
                                time3.switchTimezone(time.timezone);
                                jNormDateTimeComparisonValue3 = normDateTimeComparisonValue(time3);
                            }
                            long j3 = jNormDateTimeComparisonValue3;
                            sb.ensureCapacity(15);
                            sb.setLength(15);
                            i10 = 0;
                            while (true) {
                                i11 = i10 + 1;
                                if (i10 > 2000) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Recurrence processing stuck with r=");
                                    sb2.append(eventRecurrence);
                                    sb2.append(" rangeStart=");
                                    sb2.append(j);
                                    sb2.append(str3);
                                    sb2.append(j2);
                                    return;
                                }
                                unsafeNormalize(time2);
                                i12 = time2.year;
                                i13 = time2.month + 1;
                                i14 = time2.monthDay;
                                i15 = time2.hour;
                                i16 = time2.minute;
                                i17 = time2.second;
                                time4.set(time2);
                                i18 = 0;
                                while (true) {
                                    if (zUseBYX) {
                                        i19 = eventRecurrence.bymonth[i18];
                                    } else {
                                        i19 = i13;
                                    }
                                    i20 = i19 - 1;
                                    i21 = i13;
                                    try {
                                        if (z2) {
                                            i44 = i47;
                                            i23 = i16;
                                            if (i44 == 5) {
                                                i22 = i44;
                                                int iDay2TimeDay = time2.monthDay - (((time2.weekDay - EventRecurrence.day2TimeDay(eventRecurrence.wkst)) + 7) % 7);
                                                i24 = iDay2TimeDay;
                                                actualMaximum = iDay2TimeDay + 6;
                                            } else {
                                                i22 = i44;
                                                actualMaximum = time4.getActualMaximum(4);
                                            }
                                            while (true) {
                                                if (z2) {
                                                    i25 = i14;
                                                    daySet2 = daySet;
                                                    if (daySet2.get(time2, i24)) {
                                                        i26 = i24;
                                                    } else {
                                                        i24++;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        str3 = str3;
                                                        daySet2 = daySet2;
                                                        i15 = i15;
                                                        i35 = i8;
                                                        i39 = i5;
                                                        i37 = i6;
                                                    }
                                                    if (z2 && i24 <= actualMaximum) {
                                                        i8 = i35;
                                                        i5 = i39;
                                                        i6 = i37;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet = daySet2;
                                                        i14 = i25;
                                                        i15 = i15;
                                                        str3 = str3;
                                                    }
                                                } else {
                                                    i25 = i14;
                                                    daySet2 = daySet;
                                                    i26 = i25;
                                                }
                                                i27 = 0;
                                                while (true) {
                                                    if (zUseBYX2) {
                                                        i28 = eventRecurrence.byhour[i27];
                                                    } else {
                                                        i28 = i15;
                                                    }
                                                    i29 = 0;
                                                    while (true) {
                                                        if (zUseBYX3) {
                                                            i30 = eventRecurrence.byminute[i29];
                                                        } else {
                                                            i30 = i23;
                                                        }
                                                        i31 = i45;
                                                        i32 = 0;
                                                        while (true) {
                                                            if (zUseBYX4) {
                                                                i33 = eventRecurrence.bysecond[i32];
                                                            } else {
                                                                i33 = i17;
                                                            }
                                                            time4.set(i33, i30, i28, i26, i20, i12);
                                                            unsafeNormalize(time4);
                                                            jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                            if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2 && filter(eventRecurrence, time4) == 0) {
                                                                if (jNormDateTimeComparisonValue2 != jNormDateTimeComparisonValue || !z || jNormDateTimeComparisonValue2 < j || jNormDateTimeComparisonValue2 >= j2) {
                                                                    i31++;
                                                                }
                                                                int i51 = i31;
                                                                if (jNormDateTimeComparisonValue <= j3 && jNormDateTimeComparisonValue < j2) {
                                                                    if (jNormDateTimeComparisonValue >= j) {
                                                                        if (z) {
                                                                            treeSet.add(Long.valueOf(jNormDateTimeComparisonValue));
                                                                        } else {
                                                                            treeSet.remove(Long.valueOf(jNormDateTimeComparisonValue));
                                                                        }
                                                                    }
                                                                    int i52 = eventRecurrence.count;
                                                                    if (i52 > 0 && i52 == i51) {
                                                                        return;
                                                                    } else {
                                                                        i31 = i51;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                            i34 = i32 + 1;
                                                            i35 = i8;
                                                            if (zUseBYX4 && i34 < i35) {
                                                                i32 = i34;
                                                                i8 = i35;
                                                                i12 = i12;
                                                                i20 = i20;
                                                                daySet2 = daySet2;
                                                                str3 = str3;
                                                            }
                                                        }
                                                        i36 = i29 + 1;
                                                        i37 = i6;
                                                        if (zUseBYX3 && i36 < i37) {
                                                            i29 = i36;
                                                            i8 = i35;
                                                            i6 = i37;
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                            i15 = i15;
                                                            i45 = i31;
                                                            str3 = str3;
                                                        }
                                                    }
                                                    i38 = i27 + 1;
                                                    i39 = i5;
                                                    if (zUseBYX2 && i38 < i39) {
                                                        i27 = i38;
                                                        i8 = i35;
                                                        i5 = i39;
                                                        i6 = i37;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        i15 = i15;
                                                        i45 = i31;
                                                        str3 = str3;
                                                    }
                                                }
                                                i24++;
                                                i45 = i31;
                                                if (z2) {
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet = daySet2;
                                                    i14 = i25;
                                                    i15 = i15;
                                                    str3 = str3;
                                                }
                                            }
                                            i40 = i18 + 1;
                                            i41 = i3;
                                            if (zUseBYX && i40 < i41) {
                                                i18 = i40;
                                                i8 = i35;
                                                i3 = i41;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                daySet = daySet2;
                                                i16 = i23;
                                                i17 = i17;
                                                i13 = i21;
                                                i47 = i22;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        } else {
                                            i22 = i47;
                                            i23 = i16;
                                            actualMaximum = 0;
                                        }
                                        i40 = i18 + 1;
                                        i41 = i3;
                                        if (zUseBYX) {
                                            i18 = i40;
                                            i8 = i35;
                                            i3 = i41;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            daySet = daySet2;
                                            i16 = i23;
                                            i17 = i17;
                                            i13 = i21;
                                            i47 = i22;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    } catch (DateException e) {
                                        e = e;
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("RuntimeException with r=");
                                        sb3.append(eventRecurrence);
                                        sb3.append(" rangeStart=");
                                        sb3.append(j);
                                        sb3.append(str3);
                                        sb3.append(j2);
                                        throw e;
                                    }
                                    i24 = 1;
                                    while (true) {
                                        if (z2) {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            if (daySet2.get(time2, i24)) {
                                                i24++;
                                                i12 = i12;
                                                i20 = i20;
                                                str3 = str3;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i35 = i8;
                                                i39 = i5;
                                                i37 = i6;
                                            } else {
                                                i26 = i24;
                                            }
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        } else {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            i26 = i25;
                                        }
                                        i27 = 0;
                                        while (true) {
                                            if (zUseBYX2) {
                                                i28 = eventRecurrence.byhour[i27];
                                            } else {
                                                i28 = i15;
                                            }
                                            i29 = 0;
                                            while (true) {
                                                if (zUseBYX3) {
                                                    i30 = eventRecurrence.byminute[i29];
                                                } else {
                                                    i30 = i23;
                                                }
                                                i31 = i45;
                                                i32 = 0;
                                                while (true) {
                                                    if (zUseBYX4) {
                                                        i33 = eventRecurrence.bysecond[i32];
                                                    } else {
                                                        i33 = i17;
                                                    }
                                                    time4.set(i33, i30, i28, i26, i20, i12);
                                                    unsafeNormalize(time4);
                                                    jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                    if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    } else {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    }
                                                    i34 = i32 + 1;
                                                    i35 = i8;
                                                    if (zUseBYX4) {
                                                        i32 = i34;
                                                        i8 = i35;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        str3 = str3;
                                                    }
                                                }
                                                i36 = i29 + 1;
                                                i37 = i6;
                                                if (zUseBYX3) {
                                                    i29 = i36;
                                                    i8 = i35;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i38 = i27 + 1;
                                            i39 = i5;
                                            if (zUseBYX2) {
                                                i27 = i38;
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i45 = i31;
                                                str3 = str3;
                                            }
                                        }
                                        i24++;
                                        i45 = i31;
                                        if (z2) {
                                            i8 = i35;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            i20 = i20;
                                            daySet = daySet2;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    }
                                }
                                int i53 = time2.monthDay;
                                time4.set(time2);
                                i42 = 1;
                                while (true) {
                                    i43 = i4 * i42;
                                    switch (i9) {
                                        case 1:
                                            time2.second += i43;
                                            unsafeNormalize(time2);
                                            if ((i9 == 6 && i9 != 5) || time2.monthDay == i53) {
                                                break;
                                            }
                                            i42++;
                                            time2.set(time4);
                                            i9 = i9;
                                            z2 = z2;
                                            break;
                                            break;
                                        case 2:
                                            time2.minute += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 3:
                                            time2.hour += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 4:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 5:
                                            time2.month += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 6:
                                            time2.year += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 7:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 8:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        default:
                                            throw new RuntimeException("bad field=" + i9);
                                    }
                                }
                                i10 = i11;
                                i9 = i9;
                                i8 = i35;
                                i3 = i41;
                                i5 = i39;
                                i6 = i37;
                                z2 = z2;
                                daySet = daySet2;
                                i47 = i22;
                                str3 = str3;
                                str = str3;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("DateException with r=");
                                sb4.append(eventRecurrence);
                                sb4.append(" rangeStart=");
                                sb4.append(j);
                                sb4.append(str);
                                sb4.append(j2);
                                throw e;
                            }
                        case 2:
                            i2 = 2;
                            if (i46 <= 0) {
                                i46 = 1;
                            }
                            i3 = eventRecurrence.bymonthCount;
                            i4 = i46;
                            zUseBYX = useBYX(i47, 6, i3);
                            if (i47 >= 5) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i410 = eventRecurrence.byhourCount;
                            daySet = daySet3;
                            zUseBYX2 = useBYX(i47, 3, i410);
                            i5 = i410;
                            int i411 = eventRecurrence.byminuteCount;
                            zUseBYX3 = useBYX(i47, 2, i411);
                            i6 = i411;
                            int i54 = eventRecurrence.bysecondCount;
                            zUseBYX4 = useBYX(i47, 1, i54);
                            time2.set(time);
                            i7 = i2;
                            i8 = i54;
                            if (i7 == 5) {
                                time2.monthDay = 1;
                            }
                            str2 = eventRecurrence.until;
                            i9 = i7;
                            if (str2 == null) {
                                if (str2.length() == 15) {
                                    str2 = str2 + 'Z';
                                }
                                time3.parse(str2);
                                time3.switchTimezone(time.timezone);
                                jNormDateTimeComparisonValue3 = normDateTimeComparisonValue(time3);
                            }
                            long j4 = jNormDateTimeComparisonValue3;
                            sb.ensureCapacity(15);
                            sb.setLength(15);
                            i10 = 0;
                            while (true) {
                                i11 = i10 + 1;
                                if (i10 > 2000) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Recurrence processing stuck with r=");
                                    sb5.append(eventRecurrence);
                                    sb5.append(" rangeStart=");
                                    sb5.append(j);
                                    sb5.append(str3);
                                    sb5.append(j2);
                                    return;
                                }
                                unsafeNormalize(time2);
                                i12 = time2.year;
                                i13 = time2.month + 1;
                                i14 = time2.monthDay;
                                i15 = time2.hour;
                                i16 = time2.minute;
                                i17 = time2.second;
                                time4.set(time2);
                                i18 = 0;
                                while (true) {
                                    if (zUseBYX) {
                                        i19 = eventRecurrence.bymonth[i18];
                                    } else {
                                        i19 = i13;
                                    }
                                    i20 = i19 - 1;
                                    i21 = i13;
                                    if (z2) {
                                        i44 = i47;
                                        i23 = i16;
                                        if (i44 == 5) {
                                            i22 = i44;
                                            int iDay2TimeDay2 = time2.monthDay - (((time2.weekDay - EventRecurrence.day2TimeDay(eventRecurrence.wkst)) + 7) % 7);
                                            i24 = iDay2TimeDay2;
                                            actualMaximum = iDay2TimeDay2 + 6;
                                        } else {
                                            i22 = i44;
                                            actualMaximum = time4.getActualMaximum(4);
                                        }
                                        while (true) {
                                            if (z2) {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                if (daySet2.get(time2, i24)) {
                                                    i24++;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    str3 = str3;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i35 = i8;
                                                    i39 = i5;
                                                    i37 = i6;
                                                } else {
                                                    i26 = i24;
                                                }
                                                if (z2) {
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet = daySet2;
                                                    i14 = i25;
                                                    i15 = i15;
                                                    str3 = str3;
                                                }
                                            } else {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                i26 = i25;
                                            }
                                            i27 = 0;
                                            while (true) {
                                                if (zUseBYX2) {
                                                    i28 = eventRecurrence.byhour[i27];
                                                } else {
                                                    i28 = i15;
                                                }
                                                i29 = 0;
                                                while (true) {
                                                    if (zUseBYX3) {
                                                        i30 = eventRecurrence.byminute[i29];
                                                    } else {
                                                        i30 = i23;
                                                    }
                                                    i31 = i45;
                                                    i32 = 0;
                                                    while (true) {
                                                        if (zUseBYX4) {
                                                            i33 = eventRecurrence.bysecond[i32];
                                                        } else {
                                                            i33 = i17;
                                                        }
                                                        time4.set(i33, i30, i28, i26, i20, i12);
                                                        unsafeNormalize(time4);
                                                        jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                        if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        } else {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        }
                                                        i34 = i32 + 1;
                                                        i35 = i8;
                                                        if (zUseBYX4) {
                                                            i32 = i34;
                                                            i8 = i35;
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                            str3 = str3;
                                                        }
                                                    }
                                                    i36 = i29 + 1;
                                                    i37 = i6;
                                                    if (zUseBYX3) {
                                                        i29 = i36;
                                                        i8 = i35;
                                                        i6 = i37;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        i15 = i15;
                                                        i45 = i31;
                                                        str3 = str3;
                                                    }
                                                }
                                                i38 = i27 + 1;
                                                i39 = i5;
                                                if (zUseBYX2) {
                                                    i27 = i38;
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i24++;
                                            i45 = i31;
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        }
                                        i40 = i18 + 1;
                                        i41 = i3;
                                        if (zUseBYX) {
                                            i18 = i40;
                                            i8 = i35;
                                            i3 = i41;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            daySet = daySet2;
                                            i16 = i23;
                                            i17 = i17;
                                            i13 = i21;
                                            i47 = i22;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    } else {
                                        i22 = i47;
                                        i23 = i16;
                                        actualMaximum = 0;
                                    }
                                    i24 = 1;
                                    while (true) {
                                        if (z2) {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            if (daySet2.get(time2, i24)) {
                                                i24++;
                                                i12 = i12;
                                                i20 = i20;
                                                str3 = str3;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i35 = i8;
                                                i39 = i5;
                                                i37 = i6;
                                            } else {
                                                i26 = i24;
                                            }
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        } else {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            i26 = i25;
                                        }
                                        i27 = 0;
                                        while (true) {
                                            if (zUseBYX2) {
                                                i28 = eventRecurrence.byhour[i27];
                                            } else {
                                                i28 = i15;
                                            }
                                            i29 = 0;
                                            while (true) {
                                                if (zUseBYX3) {
                                                    i30 = eventRecurrence.byminute[i29];
                                                } else {
                                                    i30 = i23;
                                                }
                                                i31 = i45;
                                                i32 = 0;
                                                while (true) {
                                                    if (zUseBYX4) {
                                                        i33 = eventRecurrence.bysecond[i32];
                                                    } else {
                                                        i33 = i17;
                                                    }
                                                    time4.set(i33, i30, i28, i26, i20, i12);
                                                    unsafeNormalize(time4);
                                                    jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                    if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    } else {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    }
                                                    i34 = i32 + 1;
                                                    i35 = i8;
                                                    if (zUseBYX4) {
                                                        i32 = i34;
                                                        i8 = i35;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        str3 = str3;
                                                    }
                                                }
                                                i36 = i29 + 1;
                                                i37 = i6;
                                                if (zUseBYX3) {
                                                    i29 = i36;
                                                    i8 = i35;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i38 = i27 + 1;
                                            i39 = i5;
                                            if (zUseBYX2) {
                                                i27 = i38;
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i45 = i31;
                                                str3 = str3;
                                            }
                                        }
                                        i24++;
                                        i45 = i31;
                                        if (z2) {
                                            i8 = i35;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            i20 = i20;
                                            daySet = daySet2;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    }
                                    i40 = i18 + 1;
                                    i41 = i3;
                                    if (zUseBYX) {
                                        i18 = i40;
                                        i8 = i35;
                                        i3 = i41;
                                        i5 = i39;
                                        i6 = i37;
                                        i12 = i12;
                                        daySet = daySet2;
                                        i16 = i23;
                                        i17 = i17;
                                        i13 = i21;
                                        i47 = i22;
                                        i14 = i25;
                                        i15 = i15;
                                        str3 = str3;
                                    }
                                }
                                int i55 = time2.monthDay;
                                time4.set(time2);
                                i42 = 1;
                                while (true) {
                                    i43 = i4 * i42;
                                    switch (i9) {
                                        case 1:
                                            time2.second += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 2:
                                            time2.minute += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 3:
                                            time2.hour += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 4:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 5:
                                            time2.month += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 6:
                                            time2.year += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 7:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 8:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        default:
                                            throw new RuntimeException("bad field=" + i9);
                                    }
                                }
                                i10 = i11;
                                i9 = i9;
                                i8 = i35;
                                i3 = i41;
                                i5 = i39;
                                i6 = i37;
                                z2 = z2;
                                daySet = daySet2;
                                i47 = i22;
                                str3 = str3;
                                str = str3;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("DateException with r=");
                                sb6.append(eventRecurrence);
                                sb6.append(" rangeStart=");
                                sb6.append(j);
                                sb6.append(str);
                                sb6.append(j2);
                                throw e;
                            }
                        case 3:
                            i2 = 3;
                            if (i46 <= 0) {
                                i46 = 1;
                            }
                            i3 = eventRecurrence.bymonthCount;
                            i4 = i46;
                            zUseBYX = useBYX(i47, 6, i3);
                            if (i47 >= 5) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i412 = eventRecurrence.byhourCount;
                            daySet = daySet3;
                            zUseBYX2 = useBYX(i47, 3, i412);
                            i5 = i412;
                            int i413 = eventRecurrence.byminuteCount;
                            zUseBYX3 = useBYX(i47, 2, i413);
                            i6 = i413;
                            int i56 = eventRecurrence.bysecondCount;
                            zUseBYX4 = useBYX(i47, 1, i56);
                            time2.set(time);
                            i7 = i2;
                            i8 = i56;
                            if (i7 == 5) {
                                time2.monthDay = 1;
                            }
                            str2 = eventRecurrence.until;
                            i9 = i7;
                            if (str2 == null) {
                                if (str2.length() == 15) {
                                    str2 = str2 + 'Z';
                                }
                                time3.parse(str2);
                                time3.switchTimezone(time.timezone);
                                jNormDateTimeComparisonValue3 = normDateTimeComparisonValue(time3);
                            }
                            long j5 = jNormDateTimeComparisonValue3;
                            sb.ensureCapacity(15);
                            sb.setLength(15);
                            i10 = 0;
                            while (true) {
                                i11 = i10 + 1;
                                if (i10 > 2000) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Recurrence processing stuck with r=");
                                    sb7.append(eventRecurrence);
                                    sb7.append(" rangeStart=");
                                    sb7.append(j);
                                    sb7.append(str3);
                                    sb7.append(j2);
                                    return;
                                }
                                unsafeNormalize(time2);
                                i12 = time2.year;
                                i13 = time2.month + 1;
                                i14 = time2.monthDay;
                                i15 = time2.hour;
                                i16 = time2.minute;
                                i17 = time2.second;
                                time4.set(time2);
                                i18 = 0;
                                while (true) {
                                    if (zUseBYX) {
                                        i19 = eventRecurrence.bymonth[i18];
                                    } else {
                                        i19 = i13;
                                    }
                                    i20 = i19 - 1;
                                    i21 = i13;
                                    if (z2) {
                                        i44 = i47;
                                        i23 = i16;
                                        if (i44 == 5) {
                                            i22 = i44;
                                            int iDay2TimeDay3 = time2.monthDay - (((time2.weekDay - EventRecurrence.day2TimeDay(eventRecurrence.wkst)) + 7) % 7);
                                            i24 = iDay2TimeDay3;
                                            actualMaximum = iDay2TimeDay3 + 6;
                                        } else {
                                            i22 = i44;
                                            actualMaximum = time4.getActualMaximum(4);
                                        }
                                        while (true) {
                                            if (z2) {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                if (daySet2.get(time2, i24)) {
                                                    i24++;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    str3 = str3;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i35 = i8;
                                                    i39 = i5;
                                                    i37 = i6;
                                                } else {
                                                    i26 = i24;
                                                }
                                                if (z2) {
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet = daySet2;
                                                    i14 = i25;
                                                    i15 = i15;
                                                    str3 = str3;
                                                }
                                            } else {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                i26 = i25;
                                            }
                                            i27 = 0;
                                            while (true) {
                                                if (zUseBYX2) {
                                                    i28 = eventRecurrence.byhour[i27];
                                                } else {
                                                    i28 = i15;
                                                }
                                                i29 = 0;
                                                while (true) {
                                                    if (zUseBYX3) {
                                                        i30 = eventRecurrence.byminute[i29];
                                                    } else {
                                                        i30 = i23;
                                                    }
                                                    i31 = i45;
                                                    i32 = 0;
                                                    while (true) {
                                                        if (zUseBYX4) {
                                                            i33 = eventRecurrence.bysecond[i32];
                                                        } else {
                                                            i33 = i17;
                                                        }
                                                        time4.set(i33, i30, i28, i26, i20, i12);
                                                        unsafeNormalize(time4);
                                                        jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                        if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        } else {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        }
                                                        i34 = i32 + 1;
                                                        i35 = i8;
                                                        if (zUseBYX4) {
                                                            i32 = i34;
                                                            i8 = i35;
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                            str3 = str3;
                                                        }
                                                    }
                                                    i36 = i29 + 1;
                                                    i37 = i6;
                                                    if (zUseBYX3) {
                                                        i29 = i36;
                                                        i8 = i35;
                                                        i6 = i37;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        i15 = i15;
                                                        i45 = i31;
                                                        str3 = str3;
                                                    }
                                                }
                                                i38 = i27 + 1;
                                                i39 = i5;
                                                if (zUseBYX2) {
                                                    i27 = i38;
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i24++;
                                            i45 = i31;
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        }
                                        i40 = i18 + 1;
                                        i41 = i3;
                                        if (zUseBYX) {
                                            i18 = i40;
                                            i8 = i35;
                                            i3 = i41;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            daySet = daySet2;
                                            i16 = i23;
                                            i17 = i17;
                                            i13 = i21;
                                            i47 = i22;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    } else {
                                        i22 = i47;
                                        i23 = i16;
                                        actualMaximum = 0;
                                    }
                                    i24 = 1;
                                    while (true) {
                                        if (z2) {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            if (daySet2.get(time2, i24)) {
                                                i24++;
                                                i12 = i12;
                                                i20 = i20;
                                                str3 = str3;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i35 = i8;
                                                i39 = i5;
                                                i37 = i6;
                                            } else {
                                                i26 = i24;
                                            }
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        } else {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            i26 = i25;
                                        }
                                        i27 = 0;
                                        while (true) {
                                            if (zUseBYX2) {
                                                i28 = eventRecurrence.byhour[i27];
                                            } else {
                                                i28 = i15;
                                            }
                                            i29 = 0;
                                            while (true) {
                                                if (zUseBYX3) {
                                                    i30 = eventRecurrence.byminute[i29];
                                                } else {
                                                    i30 = i23;
                                                }
                                                i31 = i45;
                                                i32 = 0;
                                                while (true) {
                                                    if (zUseBYX4) {
                                                        i33 = eventRecurrence.bysecond[i32];
                                                    } else {
                                                        i33 = i17;
                                                    }
                                                    time4.set(i33, i30, i28, i26, i20, i12);
                                                    unsafeNormalize(time4);
                                                    jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                    if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    } else {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    }
                                                    i34 = i32 + 1;
                                                    i35 = i8;
                                                    if (zUseBYX4) {
                                                        i32 = i34;
                                                        i8 = i35;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        str3 = str3;
                                                    }
                                                }
                                                i36 = i29 + 1;
                                                i37 = i6;
                                                if (zUseBYX3) {
                                                    i29 = i36;
                                                    i8 = i35;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i38 = i27 + 1;
                                            i39 = i5;
                                            if (zUseBYX2) {
                                                i27 = i38;
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i45 = i31;
                                                str3 = str3;
                                            }
                                        }
                                        i24++;
                                        i45 = i31;
                                        if (z2) {
                                            i8 = i35;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            i20 = i20;
                                            daySet = daySet2;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    }
                                    i40 = i18 + 1;
                                    i41 = i3;
                                    if (zUseBYX) {
                                        i18 = i40;
                                        i8 = i35;
                                        i3 = i41;
                                        i5 = i39;
                                        i6 = i37;
                                        i12 = i12;
                                        daySet = daySet2;
                                        i16 = i23;
                                        i17 = i17;
                                        i13 = i21;
                                        i47 = i22;
                                        i14 = i25;
                                        i15 = i15;
                                        str3 = str3;
                                    }
                                }
                                int i57 = time2.monthDay;
                                time4.set(time2);
                                i42 = 1;
                                while (true) {
                                    i43 = i4 * i42;
                                    switch (i9) {
                                        case 1:
                                            time2.second += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 2:
                                            time2.minute += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 3:
                                            time2.hour += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 4:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 5:
                                            time2.month += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 6:
                                            time2.year += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 7:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 8:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        default:
                                            throw new RuntimeException("bad field=" + i9);
                                    }
                                }
                                i10 = i11;
                                i9 = i9;
                                i8 = i35;
                                i3 = i41;
                                i5 = i39;
                                i6 = i37;
                                z2 = z2;
                                daySet = daySet2;
                                i47 = i22;
                                str3 = str3;
                                str = str3;
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("DateException with r=");
                                sb8.append(eventRecurrence);
                                sb8.append(" rangeStart=");
                                sb8.append(j);
                                sb8.append(str);
                                sb8.append(j2);
                                throw e;
                            }
                        case 5:
                            i46 *= 7;
                            if (i46 <= 0) {
                                i46 = 7;
                                break;
                            }
                        case 4:
                            i2 = 4;
                            if (i46 <= 0) {
                                i46 = 1;
                            }
                            i3 = eventRecurrence.bymonthCount;
                            i4 = i46;
                            zUseBYX = useBYX(i47, 6, i3);
                            if (i47 >= 5) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i414 = eventRecurrence.byhourCount;
                            daySet = daySet3;
                            zUseBYX2 = useBYX(i47, 3, i414);
                            i5 = i414;
                            int i415 = eventRecurrence.byminuteCount;
                            zUseBYX3 = useBYX(i47, 2, i415);
                            i6 = i415;
                            int i58 = eventRecurrence.bysecondCount;
                            zUseBYX4 = useBYX(i47, 1, i58);
                            time2.set(time);
                            i7 = i2;
                            i8 = i58;
                            if (i7 == 5) {
                                time2.monthDay = 1;
                            }
                            str2 = eventRecurrence.until;
                            i9 = i7;
                            if (str2 == null) {
                                if (str2.length() == 15) {
                                    str2 = str2 + 'Z';
                                }
                                time3.parse(str2);
                                time3.switchTimezone(time.timezone);
                                jNormDateTimeComparisonValue3 = normDateTimeComparisonValue(time3);
                            }
                            long j6 = jNormDateTimeComparisonValue3;
                            sb.ensureCapacity(15);
                            sb.setLength(15);
                            i10 = 0;
                            while (true) {
                                i11 = i10 + 1;
                                if (i10 > 2000) {
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append("Recurrence processing stuck with r=");
                                    sb9.append(eventRecurrence);
                                    sb9.append(" rangeStart=");
                                    sb9.append(j);
                                    sb9.append(str3);
                                    sb9.append(j2);
                                    return;
                                }
                                unsafeNormalize(time2);
                                i12 = time2.year;
                                i13 = time2.month + 1;
                                i14 = time2.monthDay;
                                i15 = time2.hour;
                                i16 = time2.minute;
                                i17 = time2.second;
                                time4.set(time2);
                                i18 = 0;
                                while (true) {
                                    if (zUseBYX) {
                                        i19 = eventRecurrence.bymonth[i18];
                                    } else {
                                        i19 = i13;
                                    }
                                    i20 = i19 - 1;
                                    i21 = i13;
                                    if (z2) {
                                        i44 = i47;
                                        i23 = i16;
                                        if (i44 == 5) {
                                            i22 = i44;
                                            int iDay2TimeDay4 = time2.monthDay - (((time2.weekDay - EventRecurrence.day2TimeDay(eventRecurrence.wkst)) + 7) % 7);
                                            i24 = iDay2TimeDay4;
                                            actualMaximum = iDay2TimeDay4 + 6;
                                        } else {
                                            i22 = i44;
                                            actualMaximum = time4.getActualMaximum(4);
                                        }
                                        while (true) {
                                            if (z2) {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                if (daySet2.get(time2, i24)) {
                                                    i24++;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    str3 = str3;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i35 = i8;
                                                    i39 = i5;
                                                    i37 = i6;
                                                } else {
                                                    i26 = i24;
                                                }
                                                if (z2) {
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet = daySet2;
                                                    i14 = i25;
                                                    i15 = i15;
                                                    str3 = str3;
                                                }
                                            } else {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                i26 = i25;
                                            }
                                            i27 = 0;
                                            while (true) {
                                                if (zUseBYX2) {
                                                    i28 = eventRecurrence.byhour[i27];
                                                } else {
                                                    i28 = i15;
                                                }
                                                i29 = 0;
                                                while (true) {
                                                    if (zUseBYX3) {
                                                        i30 = eventRecurrence.byminute[i29];
                                                    } else {
                                                        i30 = i23;
                                                    }
                                                    i31 = i45;
                                                    i32 = 0;
                                                    while (true) {
                                                        if (zUseBYX4) {
                                                            i33 = eventRecurrence.bysecond[i32];
                                                        } else {
                                                            i33 = i17;
                                                        }
                                                        time4.set(i33, i30, i28, i26, i20, i12);
                                                        unsafeNormalize(time4);
                                                        jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                        if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        } else {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        }
                                                        i34 = i32 + 1;
                                                        i35 = i8;
                                                        if (zUseBYX4) {
                                                            i32 = i34;
                                                            i8 = i35;
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                            str3 = str3;
                                                        }
                                                    }
                                                    i36 = i29 + 1;
                                                    i37 = i6;
                                                    if (zUseBYX3) {
                                                        i29 = i36;
                                                        i8 = i35;
                                                        i6 = i37;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        i15 = i15;
                                                        i45 = i31;
                                                        str3 = str3;
                                                    }
                                                }
                                                i38 = i27 + 1;
                                                i39 = i5;
                                                if (zUseBYX2) {
                                                    i27 = i38;
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i24++;
                                            i45 = i31;
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        }
                                        i40 = i18 + 1;
                                        i41 = i3;
                                        if (zUseBYX) {
                                            i18 = i40;
                                            i8 = i35;
                                            i3 = i41;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            daySet = daySet2;
                                            i16 = i23;
                                            i17 = i17;
                                            i13 = i21;
                                            i47 = i22;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    } else {
                                        i22 = i47;
                                        i23 = i16;
                                        actualMaximum = 0;
                                    }
                                    i24 = 1;
                                    while (true) {
                                        if (z2) {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            if (daySet2.get(time2, i24)) {
                                                i24++;
                                                i12 = i12;
                                                i20 = i20;
                                                str3 = str3;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i35 = i8;
                                                i39 = i5;
                                                i37 = i6;
                                            } else {
                                                i26 = i24;
                                            }
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        } else {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            i26 = i25;
                                        }
                                        i27 = 0;
                                        while (true) {
                                            if (zUseBYX2) {
                                                i28 = eventRecurrence.byhour[i27];
                                            } else {
                                                i28 = i15;
                                            }
                                            i29 = 0;
                                            while (true) {
                                                if (zUseBYX3) {
                                                    i30 = eventRecurrence.byminute[i29];
                                                } else {
                                                    i30 = i23;
                                                }
                                                i31 = i45;
                                                i32 = 0;
                                                while (true) {
                                                    if (zUseBYX4) {
                                                        i33 = eventRecurrence.bysecond[i32];
                                                    } else {
                                                        i33 = i17;
                                                    }
                                                    time4.set(i33, i30, i28, i26, i20, i12);
                                                    unsafeNormalize(time4);
                                                    jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                    if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    } else {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    }
                                                    i34 = i32 + 1;
                                                    i35 = i8;
                                                    if (zUseBYX4) {
                                                        i32 = i34;
                                                        i8 = i35;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        str3 = str3;
                                                    }
                                                }
                                                i36 = i29 + 1;
                                                i37 = i6;
                                                if (zUseBYX3) {
                                                    i29 = i36;
                                                    i8 = i35;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i38 = i27 + 1;
                                            i39 = i5;
                                            if (zUseBYX2) {
                                                i27 = i38;
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i45 = i31;
                                                str3 = str3;
                                            }
                                        }
                                        i24++;
                                        i45 = i31;
                                        if (z2) {
                                            i8 = i35;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            i20 = i20;
                                            daySet = daySet2;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    }
                                    i40 = i18 + 1;
                                    i41 = i3;
                                    if (zUseBYX) {
                                        i18 = i40;
                                        i8 = i35;
                                        i3 = i41;
                                        i5 = i39;
                                        i6 = i37;
                                        i12 = i12;
                                        daySet = daySet2;
                                        i16 = i23;
                                        i17 = i17;
                                        i13 = i21;
                                        i47 = i22;
                                        i14 = i25;
                                        i15 = i15;
                                        str3 = str3;
                                    }
                                }
                                int i59 = time2.monthDay;
                                time4.set(time2);
                                i42 = 1;
                                while (true) {
                                    i43 = i4 * i42;
                                    switch (i9) {
                                        case 1:
                                            time2.second += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 2:
                                            time2.minute += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 3:
                                            time2.hour += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 4:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 5:
                                            time2.month += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 6:
                                            time2.year += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 7:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 8:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        default:
                                            throw new RuntimeException("bad field=" + i9);
                                    }
                                }
                                i10 = i11;
                                i9 = i9;
                                i8 = i35;
                                i3 = i41;
                                i5 = i39;
                                i6 = i37;
                                z2 = z2;
                                daySet = daySet2;
                                i47 = i22;
                                str3 = str3;
                                str = str3;
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("DateException with r=");
                                sb10.append(eventRecurrence);
                                sb10.append(" rangeStart=");
                                sb10.append(j);
                                sb10.append(str);
                                sb10.append(j2);
                                throw e;
                            }
                        case 6:
                            i2 = 5;
                            if (i46 <= 0) {
                                i46 = 1;
                            }
                            i3 = eventRecurrence.bymonthCount;
                            i4 = i46;
                            zUseBYX = useBYX(i47, 6, i3);
                            if (i47 >= 5) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i416 = eventRecurrence.byhourCount;
                            daySet = daySet3;
                            zUseBYX2 = useBYX(i47, 3, i416);
                            i5 = i416;
                            int i417 = eventRecurrence.byminuteCount;
                            zUseBYX3 = useBYX(i47, 2, i417);
                            i6 = i417;
                            int i510 = eventRecurrence.bysecondCount;
                            zUseBYX4 = useBYX(i47, 1, i510);
                            time2.set(time);
                            i7 = i2;
                            i8 = i510;
                            if (i7 == 5) {
                                time2.monthDay = 1;
                            }
                            str2 = eventRecurrence.until;
                            i9 = i7;
                            if (str2 == null) {
                                if (str2.length() == 15) {
                                    str2 = str2 + 'Z';
                                }
                                time3.parse(str2);
                                time3.switchTimezone(time.timezone);
                                jNormDateTimeComparisonValue3 = normDateTimeComparisonValue(time3);
                            }
                            long j7 = jNormDateTimeComparisonValue3;
                            sb.ensureCapacity(15);
                            sb.setLength(15);
                            i10 = 0;
                            while (true) {
                                i11 = i10 + 1;
                                if (i10 > 2000) {
                                    StringBuilder sb11 = new StringBuilder();
                                    sb11.append("Recurrence processing stuck with r=");
                                    sb11.append(eventRecurrence);
                                    sb11.append(" rangeStart=");
                                    sb11.append(j);
                                    sb11.append(str3);
                                    sb11.append(j2);
                                    return;
                                }
                                unsafeNormalize(time2);
                                i12 = time2.year;
                                i13 = time2.month + 1;
                                i14 = time2.monthDay;
                                i15 = time2.hour;
                                i16 = time2.minute;
                                i17 = time2.second;
                                time4.set(time2);
                                i18 = 0;
                                while (true) {
                                    if (zUseBYX) {
                                        i19 = eventRecurrence.bymonth[i18];
                                    } else {
                                        i19 = i13;
                                    }
                                    i20 = i19 - 1;
                                    i21 = i13;
                                    if (z2) {
                                        i44 = i47;
                                        i23 = i16;
                                        if (i44 == 5) {
                                            i22 = i44;
                                            int iDay2TimeDay5 = time2.monthDay - (((time2.weekDay - EventRecurrence.day2TimeDay(eventRecurrence.wkst)) + 7) % 7);
                                            i24 = iDay2TimeDay5;
                                            actualMaximum = iDay2TimeDay5 + 6;
                                        } else {
                                            i22 = i44;
                                            actualMaximum = time4.getActualMaximum(4);
                                        }
                                        while (true) {
                                            if (z2) {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                if (daySet2.get(time2, i24)) {
                                                    i24++;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    str3 = str3;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i35 = i8;
                                                    i39 = i5;
                                                    i37 = i6;
                                                } else {
                                                    i26 = i24;
                                                }
                                                if (z2) {
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet = daySet2;
                                                    i14 = i25;
                                                    i15 = i15;
                                                    str3 = str3;
                                                }
                                            } else {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                i26 = i25;
                                            }
                                            i27 = 0;
                                            while (true) {
                                                if (zUseBYX2) {
                                                    i28 = eventRecurrence.byhour[i27];
                                                } else {
                                                    i28 = i15;
                                                }
                                                i29 = 0;
                                                while (true) {
                                                    if (zUseBYX3) {
                                                        i30 = eventRecurrence.byminute[i29];
                                                    } else {
                                                        i30 = i23;
                                                    }
                                                    i31 = i45;
                                                    i32 = 0;
                                                    while (true) {
                                                        if (zUseBYX4) {
                                                            i33 = eventRecurrence.bysecond[i32];
                                                        } else {
                                                            i33 = i17;
                                                        }
                                                        time4.set(i33, i30, i28, i26, i20, i12);
                                                        unsafeNormalize(time4);
                                                        jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                        if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        } else {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        }
                                                        i34 = i32 + 1;
                                                        i35 = i8;
                                                        if (zUseBYX4) {
                                                            i32 = i34;
                                                            i8 = i35;
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                            str3 = str3;
                                                        }
                                                    }
                                                    i36 = i29 + 1;
                                                    i37 = i6;
                                                    if (zUseBYX3) {
                                                        i29 = i36;
                                                        i8 = i35;
                                                        i6 = i37;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        i15 = i15;
                                                        i45 = i31;
                                                        str3 = str3;
                                                    }
                                                }
                                                i38 = i27 + 1;
                                                i39 = i5;
                                                if (zUseBYX2) {
                                                    i27 = i38;
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i24++;
                                            i45 = i31;
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        }
                                        i40 = i18 + 1;
                                        i41 = i3;
                                        if (zUseBYX) {
                                            i18 = i40;
                                            i8 = i35;
                                            i3 = i41;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            daySet = daySet2;
                                            i16 = i23;
                                            i17 = i17;
                                            i13 = i21;
                                            i47 = i22;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    } else {
                                        i22 = i47;
                                        i23 = i16;
                                        actualMaximum = 0;
                                    }
                                    i24 = 1;
                                    while (true) {
                                        if (z2) {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            if (daySet2.get(time2, i24)) {
                                                i24++;
                                                i12 = i12;
                                                i20 = i20;
                                                str3 = str3;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i35 = i8;
                                                i39 = i5;
                                                i37 = i6;
                                            } else {
                                                i26 = i24;
                                            }
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        } else {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            i26 = i25;
                                        }
                                        i27 = 0;
                                        while (true) {
                                            if (zUseBYX2) {
                                                i28 = eventRecurrence.byhour[i27];
                                            } else {
                                                i28 = i15;
                                            }
                                            i29 = 0;
                                            while (true) {
                                                if (zUseBYX3) {
                                                    i30 = eventRecurrence.byminute[i29];
                                                } else {
                                                    i30 = i23;
                                                }
                                                i31 = i45;
                                                i32 = 0;
                                                while (true) {
                                                    if (zUseBYX4) {
                                                        i33 = eventRecurrence.bysecond[i32];
                                                    } else {
                                                        i33 = i17;
                                                    }
                                                    time4.set(i33, i30, i28, i26, i20, i12);
                                                    unsafeNormalize(time4);
                                                    jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                    if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    } else {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    }
                                                    i34 = i32 + 1;
                                                    i35 = i8;
                                                    if (zUseBYX4) {
                                                        i32 = i34;
                                                        i8 = i35;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        str3 = str3;
                                                    }
                                                }
                                                i36 = i29 + 1;
                                                i37 = i6;
                                                if (zUseBYX3) {
                                                    i29 = i36;
                                                    i8 = i35;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i38 = i27 + 1;
                                            i39 = i5;
                                            if (zUseBYX2) {
                                                i27 = i38;
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i45 = i31;
                                                str3 = str3;
                                            }
                                        }
                                        i24++;
                                        i45 = i31;
                                        if (z2) {
                                            i8 = i35;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            i20 = i20;
                                            daySet = daySet2;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    }
                                    i40 = i18 + 1;
                                    i41 = i3;
                                    if (zUseBYX) {
                                        i18 = i40;
                                        i8 = i35;
                                        i3 = i41;
                                        i5 = i39;
                                        i6 = i37;
                                        i12 = i12;
                                        daySet = daySet2;
                                        i16 = i23;
                                        i17 = i17;
                                        i13 = i21;
                                        i47 = i22;
                                        i14 = i25;
                                        i15 = i15;
                                        str3 = str3;
                                    }
                                }
                                int i511 = time2.monthDay;
                                time4.set(time2);
                                i42 = 1;
                                while (true) {
                                    i43 = i4 * i42;
                                    switch (i9) {
                                        case 1:
                                            time2.second += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 2:
                                            time2.minute += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 3:
                                            time2.hour += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 4:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 5:
                                            time2.month += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 6:
                                            time2.year += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 7:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 8:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        default:
                                            throw new RuntimeException("bad field=" + i9);
                                    }
                                }
                                i10 = i11;
                                i9 = i9;
                                i8 = i35;
                                i3 = i41;
                                i5 = i39;
                                i6 = i37;
                                z2 = z2;
                                daySet = daySet2;
                                i47 = i22;
                                str3 = str3;
                                str = str3;
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append("DateException with r=");
                                sb12.append(eventRecurrence);
                                sb12.append(" rangeStart=");
                                sb12.append(j);
                                sb12.append(str);
                                sb12.append(j2);
                                throw e;
                            }
                        case 7:
                            i2 = 6;
                            if (i46 <= 0) {
                                i46 = 1;
                            }
                            i3 = eventRecurrence.bymonthCount;
                            i4 = i46;
                            zUseBYX = useBYX(i47, 6, i3);
                            if (i47 >= 5) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i418 = eventRecurrence.byhourCount;
                            daySet = daySet3;
                            zUseBYX2 = useBYX(i47, 3, i418);
                            i5 = i418;
                            int i419 = eventRecurrence.byminuteCount;
                            zUseBYX3 = useBYX(i47, 2, i419);
                            i6 = i419;
                            int i512 = eventRecurrence.bysecondCount;
                            zUseBYX4 = useBYX(i47, 1, i512);
                            time2.set(time);
                            i7 = i2;
                            i8 = i512;
                            if (i7 == 5) {
                                time2.monthDay = 1;
                            }
                            str2 = eventRecurrence.until;
                            i9 = i7;
                            if (str2 == null) {
                                if (str2.length() == 15) {
                                    str2 = str2 + 'Z';
                                }
                                time3.parse(str2);
                                time3.switchTimezone(time.timezone);
                                jNormDateTimeComparisonValue3 = normDateTimeComparisonValue(time3);
                            }
                            long j8 = jNormDateTimeComparisonValue3;
                            sb.ensureCapacity(15);
                            sb.setLength(15);
                            i10 = 0;
                            while (true) {
                                i11 = i10 + 1;
                                if (i10 > 2000) {
                                    StringBuilder sb13 = new StringBuilder();
                                    sb13.append("Recurrence processing stuck with r=");
                                    sb13.append(eventRecurrence);
                                    sb13.append(" rangeStart=");
                                    sb13.append(j);
                                    sb13.append(str3);
                                    sb13.append(j2);
                                    return;
                                }
                                unsafeNormalize(time2);
                                i12 = time2.year;
                                i13 = time2.month + 1;
                                i14 = time2.monthDay;
                                i15 = time2.hour;
                                i16 = time2.minute;
                                i17 = time2.second;
                                time4.set(time2);
                                i18 = 0;
                                while (true) {
                                    if (zUseBYX) {
                                        i19 = eventRecurrence.bymonth[i18];
                                    } else {
                                        i19 = i13;
                                    }
                                    i20 = i19 - 1;
                                    i21 = i13;
                                    if (z2) {
                                        i44 = i47;
                                        i23 = i16;
                                        if (i44 == 5) {
                                            i22 = i44;
                                            int iDay2TimeDay6 = time2.monthDay - (((time2.weekDay - EventRecurrence.day2TimeDay(eventRecurrence.wkst)) + 7) % 7);
                                            i24 = iDay2TimeDay6;
                                            actualMaximum = iDay2TimeDay6 + 6;
                                        } else {
                                            i22 = i44;
                                            actualMaximum = time4.getActualMaximum(4);
                                        }
                                        while (true) {
                                            if (z2) {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                if (daySet2.get(time2, i24)) {
                                                    i24++;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    str3 = str3;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i35 = i8;
                                                    i39 = i5;
                                                    i37 = i6;
                                                } else {
                                                    i26 = i24;
                                                }
                                                if (z2) {
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet = daySet2;
                                                    i14 = i25;
                                                    i15 = i15;
                                                    str3 = str3;
                                                }
                                            } else {
                                                i25 = i14;
                                                daySet2 = daySet;
                                                i26 = i25;
                                            }
                                            i27 = 0;
                                            while (true) {
                                                if (zUseBYX2) {
                                                    i28 = eventRecurrence.byhour[i27];
                                                } else {
                                                    i28 = i15;
                                                }
                                                i29 = 0;
                                                while (true) {
                                                    if (zUseBYX3) {
                                                        i30 = eventRecurrence.byminute[i29];
                                                    } else {
                                                        i30 = i23;
                                                    }
                                                    i31 = i45;
                                                    i32 = 0;
                                                    while (true) {
                                                        if (zUseBYX4) {
                                                            i33 = eventRecurrence.bysecond[i32];
                                                        } else {
                                                            i33 = i17;
                                                        }
                                                        time4.set(i33, i30, i28, i26, i20, i12);
                                                        unsafeNormalize(time4);
                                                        jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                        if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        } else {
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                        }
                                                        i34 = i32 + 1;
                                                        i35 = i8;
                                                        if (zUseBYX4) {
                                                            i32 = i34;
                                                            i8 = i35;
                                                            i12 = i12;
                                                            i20 = i20;
                                                            daySet2 = daySet2;
                                                            str3 = str3;
                                                        }
                                                    }
                                                    i36 = i29 + 1;
                                                    i37 = i6;
                                                    if (zUseBYX3) {
                                                        i29 = i36;
                                                        i8 = i35;
                                                        i6 = i37;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        i15 = i15;
                                                        i45 = i31;
                                                        str3 = str3;
                                                    }
                                                }
                                                i38 = i27 + 1;
                                                i39 = i5;
                                                if (zUseBYX2) {
                                                    i27 = i38;
                                                    i8 = i35;
                                                    i5 = i39;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i24++;
                                            i45 = i31;
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        }
                                        i40 = i18 + 1;
                                        i41 = i3;
                                        if (zUseBYX) {
                                            i18 = i40;
                                            i8 = i35;
                                            i3 = i41;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            daySet = daySet2;
                                            i16 = i23;
                                            i17 = i17;
                                            i13 = i21;
                                            i47 = i22;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    } else {
                                        i22 = i47;
                                        i23 = i16;
                                        actualMaximum = 0;
                                    }
                                    i24 = 1;
                                    while (true) {
                                        if (z2) {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            if (daySet2.get(time2, i24)) {
                                                i24++;
                                                i12 = i12;
                                                i20 = i20;
                                                str3 = str3;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i35 = i8;
                                                i39 = i5;
                                                i37 = i6;
                                            } else {
                                                i26 = i24;
                                            }
                                            if (z2) {
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet = daySet2;
                                                i14 = i25;
                                                i15 = i15;
                                                str3 = str3;
                                            }
                                        } else {
                                            i25 = i14;
                                            daySet2 = daySet;
                                            i26 = i25;
                                        }
                                        i27 = 0;
                                        while (true) {
                                            if (zUseBYX2) {
                                                i28 = eventRecurrence.byhour[i27];
                                            } else {
                                                i28 = i15;
                                            }
                                            i29 = 0;
                                            while (true) {
                                                if (zUseBYX3) {
                                                    i30 = eventRecurrence.byminute[i29];
                                                } else {
                                                    i30 = i23;
                                                }
                                                i31 = i45;
                                                i32 = 0;
                                                while (true) {
                                                    if (zUseBYX4) {
                                                        i33 = eventRecurrence.bysecond[i32];
                                                    } else {
                                                        i33 = i17;
                                                    }
                                                    time4.set(i33, i30, i28, i26, i20, i12);
                                                    unsafeNormalize(time4);
                                                    jNormDateTimeComparisonValue = normDateTimeComparisonValue(time4);
                                                    if (jNormDateTimeComparisonValue < jNormDateTimeComparisonValue2) {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    } else {
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                    }
                                                    i34 = i32 + 1;
                                                    i35 = i8;
                                                    if (zUseBYX4) {
                                                        i32 = i34;
                                                        i8 = i35;
                                                        i12 = i12;
                                                        i20 = i20;
                                                        daySet2 = daySet2;
                                                        str3 = str3;
                                                    }
                                                }
                                                i36 = i29 + 1;
                                                i37 = i6;
                                                if (zUseBYX3) {
                                                    i29 = i36;
                                                    i8 = i35;
                                                    i6 = i37;
                                                    i12 = i12;
                                                    i20 = i20;
                                                    daySet2 = daySet2;
                                                    i15 = i15;
                                                    i45 = i31;
                                                    str3 = str3;
                                                }
                                            }
                                            i38 = i27 + 1;
                                            i39 = i5;
                                            if (zUseBYX2) {
                                                i27 = i38;
                                                i8 = i35;
                                                i5 = i39;
                                                i6 = i37;
                                                i12 = i12;
                                                i20 = i20;
                                                daySet2 = daySet2;
                                                i15 = i15;
                                                i45 = i31;
                                                str3 = str3;
                                            }
                                        }
                                        i24++;
                                        i45 = i31;
                                        if (z2) {
                                            i8 = i35;
                                            i5 = i39;
                                            i6 = i37;
                                            i12 = i12;
                                            i20 = i20;
                                            daySet = daySet2;
                                            i14 = i25;
                                            i15 = i15;
                                            str3 = str3;
                                        }
                                    }
                                    i40 = i18 + 1;
                                    i41 = i3;
                                    if (zUseBYX) {
                                        i18 = i40;
                                        i8 = i35;
                                        i3 = i41;
                                        i5 = i39;
                                        i6 = i37;
                                        i12 = i12;
                                        daySet = daySet2;
                                        i16 = i23;
                                        i17 = i17;
                                        i13 = i21;
                                        i47 = i22;
                                        i14 = i25;
                                        i15 = i15;
                                        str3 = str3;
                                    }
                                }
                                int i513 = time2.monthDay;
                                time4.set(time2);
                                i42 = 1;
                                while (true) {
                                    i43 = i4 * i42;
                                    switch (i9) {
                                        case 1:
                                            time2.second += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 2:
                                            time2.minute += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 3:
                                            time2.hour += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 4:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 5:
                                            time2.month += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 6:
                                            time2.year += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 7:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        case 8:
                                            time2.monthDay += i43;
                                            unsafeNormalize(time2);
                                            if (i9 == 6) {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            } else {
                                                i42++;
                                                time2.set(time4);
                                                i9 = i9;
                                                z2 = z2;
                                            }
                                            break;
                                        default:
                                            throw new RuntimeException("bad field=" + i9);
                                    }
                                }
                                i10 = i11;
                                i9 = i9;
                                i8 = i35;
                                i3 = i41;
                                i5 = i39;
                                i6 = i37;
                                z2 = z2;
                                daySet = daySet2;
                                i47 = i22;
                                str3 = str3;
                                str = str3;
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append("DateException with r=");
                                sb14.append(eventRecurrence);
                                sb14.append(" rangeStart=");
                                sb14.append(j);
                                sb14.append(str);
                                sb14.append(j2);
                                throw e;
                            }
                        default:
                            throw new DateException("bad freq=" + i47);
                    }
                } catch (DateException e3) {
                    e = e3;
                    str3 = str3;
                }
            } catch (DateException e4) {
                e = e4;
                str = " rangeEnd=";
            }
        } catch (RuntimeException e5) {
            e = e5;
            str3 = " rangeEnd=";
        }
    }
}
