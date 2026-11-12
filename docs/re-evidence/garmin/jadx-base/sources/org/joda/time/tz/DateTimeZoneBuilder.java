package org.joda.time.tz;

import am.j;
import ch.qos.logback.core.spi.ComponentTracker;
import ds.e0;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        public DSTZone(String str, int i14, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i14;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j8) {
            long next;
            int i14 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j8, i14, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                next = j8;
            }
            try {
                j8 = recurrence2.next(j8, i14, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j8 ? recurrence : recurrence2;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DSTZone) {
                DSTZone dSTZone = (DSTZone) obj;
                if (getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j8) {
            return findMatchingRecurrence(j8).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j8) {
            return this.iStandardOffset + findMatchingRecurrence(j8).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j8) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j8) {
            long next;
            int i14 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j8, i14, recurrence2.getSaveMillis());
                if (j8 > 0 && next < 0) {
                    next = j8;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long next2 = recurrence2.next(j8, i14, recurrence.getSaveMillis());
                if (j8 <= 0 || next2 >= 0) {
                    j8 = next2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j8 ? j8 : next;
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j8) {
            long jPrevious;
            long j14 = j8 + 1;
            int i14 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                jPrevious = recurrence.previous(j14, i14, recurrence2.getSaveMillis());
                if (j14 < 0 && jPrevious > 0) {
                    jPrevious = j14;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long jPrevious2 = recurrence2.previous(j14, i14, recurrence.getSaveMillis());
                if (j14 >= 0 || jPrevious2 <= 0) {
                    j14 = jPrevious2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jPrevious <= j14) {
                jPrevious = j14;
            }
            return jPrevious - 1;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    public static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        public OfYear(char c14, int i14, int i15, int i16, boolean z14, int i17) {
            if (c14 != 'u' && c14 != 'w' && c14 != 's') {
                h.s(k.f("Unknown mode: ", c14));
                throw null;
            }
            this.iMode = c14;
            this.iMonthOfYear = i14;
            this.iDayOfMonth = i15;
            this.iDayOfWeek = i16;
            this.iAdvance = z14;
            this.iMillisOfDay = i17;
        }

        public static OfYear readFrom(DataInput dataInput) {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j8) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j8, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j8, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j8) {
            try {
                return setDayOfMonth(chronology, j8);
            } catch (IllegalArgumentException e4) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e4;
                }
                while (!chronology.year().isLeap(j8)) {
                    j8 = chronology.year().add(j8, 1);
                }
                return setDayOfMonth(chronology, j8);
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j8) {
            try {
                return setDayOfMonth(chronology, j8);
            } catch (IllegalArgumentException e4) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e4;
                }
                while (!chronology.year().isLeap(j8)) {
                    j8 = chronology.year().add(j8, -1);
                }
                return setDayOfMonth(chronology, j8);
            }
        }

        private long setDayOfWeek(Chronology chronology, long j8) {
            int i14 = this.iDayOfWeek - chronology.dayOfWeek().get(j8);
            if (i14 == 0) {
                return j8;
            }
            if (this.iAdvance) {
                if (i14 < 0) {
                    i14 += 7;
                }
            } else if (i14 > 0) {
                i14 -= 7;
            }
            return chronology.dayOfWeek().add(j8, i14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OfYear) {
                OfYear ofYear = (OfYear) obj;
                if (this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Character.valueOf(this.iMode), Integer.valueOf(this.iMonthOfYear), Integer.valueOf(this.iDayOfMonth), Integer.valueOf(this.iDayOfWeek), Boolean.valueOf(this.iAdvance), Integer.valueOf(this.iMillisOfDay)});
        }

        public long next(long j8, int i14, int i15) {
            char c14 = this.iMode;
            if (c14 == 'w') {
                i14 += i15;
            } else if (c14 != 's') {
                i14 = 0;
            }
            long j14 = i14;
            long j15 = j8 + j14;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j15, this.iMonthOfYear), 0), Math.min(this.iMillisOfDay, 86399999)));
            if (this.iDayOfWeek != 0) {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j15) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthNext <= j15) {
                dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthNext, 0), this.iMillisOfDay) - j14;
        }

        public long previous(long j8, int i14, int i15) {
            char c14 = this.iMode;
            if (c14 == 'w') {
                i14 += i15;
            } else if (c14 != 's') {
                i14 = 0;
            }
            long j14 = i14;
            long j15 = j8 + j14;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j15, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j15) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthPrevious >= j15) {
                dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthPrevious, 0), this.iMillisOfDay) - j14;
        }

        public long setInstant(int i14, int i15, int i16) {
            char c14 = this.iMode;
            if (c14 == 'w') {
                i15 += i16;
            } else if (c14 != 's') {
                i15 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i14), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - ((long) i15);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("[OfYear]\nMode: ");
            sb3.append(this.iMode);
            sb3.append("\nMonthOfYear: ");
            sb3.append(this.iMonthOfYear);
            sb3.append("\nDayOfMonth: ");
            sb3.append(this.iDayOfMonth);
            sb3.append("\nDayOfWeek: ");
            sb3.append(this.iDayOfWeek);
            sb3.append("\nAdvanceDayOfWeek: ");
            sb3.append(this.iAdvance);
            sb3.append("\nMillisOfDay: ");
            return e0.j(sb3, this.iMillisOfDay, '\n');
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z14, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            long[] jArr;
            int i14;
            int size = arrayList.size();
            if (size == 0) {
                h.w();
                return null;
            }
            long[] jArr2 = new long[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            String[] strArr = new String[size];
            int i15 = 0;
            Transition transition = null;
            int i16 = 0;
            while (i16 < size) {
                Transition transition2 = arrayList.get(i16);
                if (!transition2.isTransitionFrom(transition)) {
                    h.s(str);
                    return null;
                }
                jArr2[i16] = transition2.getMillis();
                iArr[i16] = transition2.getWallOffset();
                iArr2[i16] = transition2.getStandardOffset();
                strArr[i16] = transition2.getNameKey();
                i16++;
                transition = transition2;
            }
            String[] strArr2 = new String[5];
            for (String[] strArr3 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                if (strArr3 != null && strArr3.length == 5) {
                    if (str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                    }
                }
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            while (i15 < size - 1) {
                String str2 = strArr[i15];
                int i17 = i15 + 1;
                String str3 = strArr[i17];
                long j8 = iArr[i15];
                int i18 = size;
                int i19 = i15;
                long j14 = iArr[i17];
                long j15 = iArr2[i19];
                long j16 = iArr2[i17];
                Period period = new Period(jArr2[i19], jArr2[i17], PeriodType.yearMonthDay(), instanceUTC);
                ISOChronology iSOChronology = instanceUTC;
                if (j8 != j14 && j15 == j16 && str2.equals(str3) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str2.equals(strArr2[2]) && str2.equals(strArr2[4])) {
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Fixing duplicate name key - " + str3);
                        PrintStream printStream = System.out;
                        StringBuilder sb3 = new StringBuilder("     - ");
                        jArr = jArr2;
                        sb3.append(new DateTime(jArr[i19], iSOChronology));
                        sb3.append(" - ");
                        sb3.append(new DateTime(jArr[i17], iSOChronology));
                        printStream.println(sb3.toString());
                    } else {
                        jArr = jArr2;
                    }
                    if (j8 > j14) {
                        strArr[i19] = str2.concat("-Summer").intern();
                    } else {
                        strArr[i17] = (str3 + "-Summer").intern();
                        i14 = i17;
                    }
                    i15 = i14 + 1;
                    instanceUTC = iSOChronology;
                    iArr2 = iArr2;
                    jArr2 = jArr;
                    iArr = iArr;
                    size = i18;
                } else {
                    jArr = jArr2;
                    iArr = iArr;
                    iArr2 = iArr2;
                }
                i14 = i19;
                i15 = i14 + 1;
                instanceUTC = iSOChronology;
                iArr2 = iArr2;
                jArr2 = jArr;
                iArr = iArr;
                size = i18;
            }
            long[] jArr3 = jArr2;
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            if (dSTZone == null || !dSTZone.iStartRecurrence.getNameKey().equals(dSTZone.iEndRecurrence.getNameKey())) {
                dSTZone2 = dSTZone;
            } else {
                if (ZoneInfoLogger.verbose()) {
                    System.out.println("Fixing duplicate recurrent name key - " + dSTZone.iStartRecurrence.getNameKey());
                }
                dSTZone2 = dSTZone.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence.renameAppend("-Summer"), dSTZone.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence, dSTZone.iEndRecurrence.renameAppend("-Summer"));
            }
            return new PrecalculatedZone(z14 ? str : "", jArr3, iArr3, iArr4, strArr, dSTZone2);
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i14 = 0; i14 < unsignedShort; i14++) {
                strArr[i14] = dataInput.readUTF();
            }
            int i15 = dataInput.readInt();
            long[] jArr = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            String[] strArr2 = new String[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                jArr[i16] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i16] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i16] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        h.C("Invalid encoding");
                        return null;
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i16] = strArr[unsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrecalculatedZone) {
                PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
                if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                    DSTZone dSTZone = this.iTailZone;
                    DSTZone dSTZone2 = precalculatedZone.iTailZone;
                    if (dSTZone != null ? dSTZone.equals(dSTZone2) : dSTZone2 == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j8) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j8);
            if (iBinarySearch >= 0) {
                return this.iNameKeys[iBinarySearch];
            }
            int i14 = ~iBinarySearch;
            if (i14 < jArr.length) {
                return i14 > 0 ? this.iNameKeys[i14 - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i14 - 1] : dSTZone.getNameKey(j8);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j8) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j8);
            if (iBinarySearch >= 0) {
                return this.iWallOffsets[iBinarySearch];
            }
            int i14 = ~iBinarySearch;
            if (i14 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i14 - 1] : dSTZone.getOffset(j8);
            }
            if (i14 > 0) {
                return this.iWallOffsets[i14 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j8) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j8);
            if (iBinarySearch >= 0) {
                return this.iStandardOffsets[iBinarySearch];
            }
            int i14 = ~iBinarySearch;
            if (i14 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i14 - 1] : dSTZone.getStandardOffset(j8);
            }
            if (i14 > 0) {
                return this.iStandardOffsets[i14 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return getID().hashCode();
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d14 = 0.0d;
            int i14 = 0;
            for (int i15 = 1; i15 < jArr.length; i15++) {
                long j8 = jArr[i15] - jArr[i15 - 1];
                if (j8 < 63158400000L) {
                    d14 += j8;
                    i14++;
                }
            }
            return i14 > 0 && (d14 / ((double) i14)) / 8.64E7d >= 25.0d;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j8) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j8);
            int i14 = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i14 < jArr.length) {
                return jArr[i14];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j8;
            }
            long j14 = jArr[jArr.length - 1];
            if (j8 < j14) {
                j8 = j14;
            }
            return dSTZone.nextTransition(j8);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j8) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j8);
            if (iBinarySearch < 0) {
                int i14 = ~iBinarySearch;
                if (i14 >= jArr.length) {
                    DSTZone dSTZone = this.iTailZone;
                    if (dSTZone != null) {
                        long jPreviousTransition = dSTZone.previousTransition(j8);
                        if (jPreviousTransition < j8) {
                            return jPreviousTransition;
                        }
                    }
                    long j14 = jArr[i14 - 1];
                    if (j14 > Long.MIN_VALUE) {
                        return j14 - 1;
                    }
                } else if (i14 > 0) {
                    long j15 = jArr[i14 - 1];
                    if (j15 > Long.MIN_VALUE) {
                        return j15 - 1;
                    }
                }
            } else if (j8 > Long.MIN_VALUE) {
                return j8 - 1;
            }
            return j8;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet hashSet = new HashSet();
            for (int i14 = 0; i14 < length; i14++) {
                hashSet.add(this.iNameKeys[i14]);
            }
            int size = hashSet.size();
            if (size > 65535) {
                e.w("String pool is too large");
                return;
            }
            String[] strArr = new String[size];
            Iterator it = hashSet.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                strArr[i15] = (String) it.next();
                i15++;
            }
            dataOutput.writeShort(size);
            for (int i16 = 0; i16 < size; i16++) {
                dataOutput.writeUTF(strArr[i16]);
            }
            dataOutput.writeInt(length);
            for (int i17 = 0; i17 < length; i17++) {
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i17]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i17]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i17]);
                String str = this.iNameKeys[i17];
                for (int i18 = 0; i18 < size; i18++) {
                    if (strArr[i18].equals(str)) {
                        if (size < 256) {
                            dataOutput.writeByte(i18);
                            break;
                        } else {
                            dataOutput.writeShort(i18);
                            break;
                        }
                    }
                }
            }
            dataOutput.writeBoolean(this.iTailZone != null);
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                dSTZone.writeTo(dataOutput);
            }
        }
    }

    public static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i14) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i14;
        }

        public static Recurrence readFrom(DataInput dataInput) {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Recurrence) {
                Recurrence recurrence = (Recurrence) obj;
                if (this.iSaveMillis == recurrence.iSaveMillis && this.iNameKey.equals(recurrence.iNameKey) && this.iOfYear.equals(recurrence.iOfYear)) {
                    return true;
                }
            }
            return false;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iSaveMillis), this.iNameKey, this.iOfYear});
        }

        public long next(long j8, int i14, int i15) {
            return this.iOfYear.next(j8, i14, i15);
        }

        public long previous(long j8, int i14, int i15) {
            return this.iOfYear.previous(j8, i14, i15);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public String toString() {
            return this.iOfYear + " named " + this.iNameKey + " at " + this.iSaveMillis;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    public static final class Rule {
        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        public Rule(Recurrence recurrence, int i14, int i15) {
            this.iRecurrence = recurrence;
            this.iFromYear = i14;
            this.iToYear = i15;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j8, int i14, int i15) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i16 = i14 + i15;
            long next = this.iRecurrence.next(((j8 > Long.MIN_VALUE ? 1 : (j8 == Long.MIN_VALUE ? 0 : -1)) == 0 ? Integer.MIN_VALUE : instanceUTC.year().get(((long) i16) + j8)) < this.iFromYear ? (instanceUTC.year().set(0L, this.iFromYear) - ((long) i16)) - 1 : j8, i14, i15);
            return (next <= j8 || instanceUTC.year().get(((long) i16) + next) <= this.iToYear) ? next : j8;
        }

        public String toString() {
            return this.iFromYear + " to " + this.iToYear + " using " + this.iRecurrence;
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i14 = size - 1;
        Transition transition2 = arrayList.get(i14);
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (transition.getMillis() + ((long) transition2.getWallOffset()) == transition2.getMillis() + ((long) (size >= 2 ? arrayList.get(size - 2).getWallOffset() : 0))) {
            return addTransition(arrayList, transition.withMillis(arrayList.remove(i14).getMillis()));
        }
        arrayList.add(transition);
        return true;
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i14, int i15) {
        return ("UTC".equals(str) && str.equals(str2) && i14 == 0 && i15 == 0) ? DateTimeZone.UTC : new FixedDateTimeZone(str, str2, i14, i15);
    }

    private RuleSet getLastRuleSet() {
        DateTimeZoneBuilder dateTimeZoneBuilder;
        if (this.iRuleSets.size() == 0) {
            dateTimeZoneBuilder = this;
            dateTimeZoneBuilder.addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        } else {
            dateTimeZoneBuilder = this;
        }
        return (RuleSet) j.f(1, dateTimeZoneBuilder.iRuleSets);
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (unsignedByte == 70) {
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
        }
        if (unsignedByte == 80) {
            return PrecalculatedZone.readFrom(dataInput, str);
        }
        h.C("Invalid encoding");
        return null;
    }

    public static long readMillis(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j8;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i14 = unsignedByte2 >> 6;
        if (i14 == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j8 = 60000;
        } else if (i14 == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j8 = 1000;
        } else {
            if (i14 == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j8 = ComponentTracker.DEFAULT_TIMEOUT;
        }
        return unsignedByte * j8;
    }

    public static void writeMillis(DataOutput dataOutput, long j8) throws IOException {
        if (j8 % ComponentTracker.DEFAULT_TIMEOUT == 0) {
            long j14 = j8 / ComponentTracker.DEFAULT_TIMEOUT;
            if (((j14 << 58) >> 58) == j14) {
                dataOutput.writeByte((int) (j14 & 63));
                return;
            }
        }
        if (j8 % 60000 == 0) {
            long j15 = j8 / 60000;
            if (((j15 << 34) >> 34) == j15) {
                dataOutput.writeInt(((int) (1073741823 & j15)) | 1073741824);
                return;
            }
        }
        if (j8 % 1000 == 0) {
            long j16 = j8 / 1000;
            if (((j16 << 26) >> 26) == j16) {
                dataOutput.writeByte(((int) ((j16 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) j16);
                return;
            }
        }
        dataOutput.writeByte(j8 < 0 ? 255 : 192);
        dataOutput.writeLong(j8);
    }

    public DateTimeZoneBuilder addCutover(int i14, char c14, int i15, int i16, int i17, boolean z14, int i18) {
        if (this.iRuleSets.size() > 0) {
            ((RuleSet) j.f(1, this.iRuleSets)).setUpperLimit(i14, new OfYear(c14, i15, i16, i17, z14, i18));
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i14, int i15, int i16, char c14, int i17, int i18, int i19, boolean z14, int i24) {
        if (i15 <= i16) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c14, i17, i18, i19, z14, i24), str, i14), i15, i16));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i14) {
        getLastRuleSet().setFixedSavings(str, i14);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i14) {
        getLastRuleSet().setStandardOffset(i14);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z14) {
        if (str == null) {
            h.w();
            return null;
        }
        ArrayList<Transition> arrayList = new ArrayList<>();
        int size = this.iRuleSets.size();
        DSTZone dSTZoneBuildTailZone = null;
        long upperLimit = Long.MIN_VALUE;
        for (int i14 = 0; i14 < size; i14++) {
            RuleSet ruleSet = this.iRuleSets.get(i14);
            Transition transitionFirstTransition = ruleSet.firstTransition(upperLimit);
            if (transitionFirstTransition != null) {
                addTransition(arrayList, transitionFirstTransition);
                long millis = transitionFirstTransition.getMillis();
                int saveMillis = transitionFirstTransition.getSaveMillis();
                RuleSet ruleSet2 = new RuleSet(ruleSet);
                while (true) {
                    Transition transitionNextTransition = ruleSet2.nextTransition(millis, saveMillis);
                    if (transitionNextTransition == null || (addTransition(arrayList, transitionNextTransition) && dSTZoneBuildTailZone != null)) {
                        break;
                    }
                    long millis2 = transitionNextTransition.getMillis();
                    int saveMillis2 = transitionNextTransition.getSaveMillis();
                    if (dSTZoneBuildTailZone == null && i14 == size - 1) {
                        dSTZoneBuildTailZone = ruleSet2.buildTailZone(str);
                    }
                    saveMillis = saveMillis2;
                    millis = millis2;
                }
                upperLimit = ruleSet2.getUpperLimit(saveMillis);
            }
        }
        if (arrayList.size() == 0) {
            return dSTZoneBuildTailZone != null ? dSTZoneBuildTailZone : buildFixedZone(str, "UTC", 0, 0);
        }
        if (arrayList.size() == 1 && dSTZoneBuildTailZone == null) {
            Transition transition = arrayList.get(0);
            return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
        }
        PrecalculatedZone precalculatedZoneCreate = PrecalculatedZone.create(str, z14, arrayList, dSTZoneBuildTailZone);
        return precalculatedZoneCreate.isCachable() ? CachedDateTimeZone.forZone(precalculatedZoneCreate) : precalculatedZoneCreate;
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }

    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j8, Rule rule, int i14) {
            this.iMillis = j8;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i14;
            this.iStandardOffset = i14;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            if (transition == null) {
                return true;
            }
            if (this.iMillis > transition.iMillis) {
                return (this.iWallOffset == transition.iWallOffset && this.iStandardOffset == transition.iStandardOffset && this.iNameKey.equals(transition.iNameKey)) ? false : true;
            }
            return false;
        }

        public String toString() {
            return new DateTime(this.iMillis, DateTimeZone.UTC) + StringUtils.SPACE + this.iStandardOffset + StringUtils.SPACE + this.iWallOffset;
        }

        public Transition withMillis(long j8) {
            return new Transition(j8, this.iNameKey, this.iWallOffset, this.iStandardOffset);
        }

        public Transition(long j8, Transition transition) {
            this.iMillis = j8;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public Transition(long j8, String str, int i14, int i15) {
            this.iMillis = j8;
            this.iNameKey = str;
            this.iWallOffset = i14;
            this.iStandardOffset = i15;
        }
    }

    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }

        public void addRule(Rule rule) {
            if (this.iRules.contains(rule)) {
                return;
            }
            this.iRules.add(rule);
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() != 2) {
                return null;
            }
            Rule rule = this.iRules.get(0);
            Rule rule2 = this.iRules.get(1);
            if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
            }
            return null;
        }

        public Transition firstTransition(long j8) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i14 = this.iStandardOffset;
                return new Transition(j8, str, i14 + this.iInitialSaveMillis, i14);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long millis = Long.MIN_VALUE;
            int saveMillis = 0;
            Transition transition = null;
            while (true) {
                Transition transitionNextTransition = nextTransition(millis, saveMillis);
                if (transitionNextTransition == null) {
                    break;
                }
                millis = transitionNextTransition.getMillis();
                if (millis == j8) {
                    transition = new Transition(j8, transitionNextTransition);
                    break;
                }
                if (millis > j8) {
                    if (transition == null) {
                        for (Rule rule : arrayList) {
                            if (rule.getSaveMillis() == 0) {
                                transition = new Transition(j8, rule, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition != null) {
                        break;
                    }
                    String nameKey = transitionNextTransition.getNameKey();
                    int i15 = this.iStandardOffset;
                    transition = new Transition(j8, nameKey, i15, i15);
                    break;
                }
                transition = new Transition(j8, transitionNextTransition);
                saveMillis = transitionNextTransition.getSaveMillis();
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i14) {
            int i15 = this.iUpperYear;
            if (i15 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i15, this.iStandardOffset, i14);
        }

        public Transition nextTransition(long j8, int i14) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it = this.iRules.iterator();
            long j14 = Long.MAX_VALUE;
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                long next2 = next.next(j8, this.iStandardOffset, i14);
                if (next2 <= j8) {
                    it.remove();
                } else if (next2 <= j14) {
                    rule = next;
                    j14 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j14) >= YEAR_LIMIT) {
                return null;
            }
            int i15 = this.iUpperYear;
            if (i15 >= Integer.MAX_VALUE || j14 < this.iUpperOfYear.setInstant(i15, this.iStandardOffset, i14)) {
                return new Transition(j14, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i14) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i14;
        }

        public void setStandardOffset(int i14) {
            this.iStandardOffset = i14;
        }

        public void setUpperLimit(int i14, OfYear ofYear) {
            this.iUpperYear = i14;
            this.iUpperOfYear = ofYear;
        }

        public String toString() {
            return this.iInitialNameKey + " initial: " + this.iInitialSaveMillis + " std: " + this.iStandardOffset + " upper: " + this.iUpperYear + StringUtils.SPACE + this.iUpperOfYear + StringUtils.SPACE + this.iRules;
        }

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone readFrom(InputStream inputStream, String str) {
        if (inputStream instanceof DataInput) {
            return readFrom((DataInput) inputStream, str);
        }
        return readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }
}
