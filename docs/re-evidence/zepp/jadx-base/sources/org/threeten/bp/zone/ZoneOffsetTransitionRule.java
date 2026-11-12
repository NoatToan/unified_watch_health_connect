package org.threeten.bp.zone;

import io.netty.util.internal.StringUtil;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Month;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.TemporalAdjusters;

/* JADX INFO: loaded from: classes23.dex */
public final class ZoneOffsetTransitionRule implements Serializable {
    private static final int j = 86400;
    private static final long serialVersionUID = 6889046316657758795L;
    private final Month a;
    private final byte b;
    private final DayOfWeek c;
    private final LocalTime d;
    private final int e;
    private final TimeDefinition f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public LocalDateTime createDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
            int i = a.a[ordinal()];
            if (i != 1) {
                return i != 2 ? localDateTime : localDateTime.plusSeconds(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            return localDateTime.plusSeconds(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeDefinition.values().length];
            a = iArr;
            try {
                iArr[TimeDefinition.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeDefinition.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ZoneOffsetTransitionRule(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, int i2, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = month;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = i2;
        this.f = timeDefinition;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void a(StringBuilder sb, long j2) {
        if (j2 < 10) {
            sb.append(0);
        }
        sb.append(j2);
    }

    public static ZoneOffsetTransitionRule b(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        Month monthOf = Month.of(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        DayOfWeek dayOfWeekOf = i3 == 0 ? null : DayOfWeek.of(i3);
        int i4 = (507904 & i) >>> 14;
        TimeDefinition timeDefinition = TimeDefinition.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        int i8 = i4 == 31 ? dataInput.readInt() : i4 * 3600;
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i5 == 255 ? dataInput.readInt() : (i5 + com.alipay.sdk.m.n.a.g) * 900);
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i6 == 3 ? dataInput.readInt() : zoneOffsetOfTotalSeconds.getTotalSeconds() + (i6 * 1800));
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(i7 == 3 ? dataInput.readInt() : zoneOffsetOfTotalSeconds.getTotalSeconds() + (i7 * 1800));
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new ZoneOffsetTransitionRule(monthOf, i2, dayOfWeekOf, LocalTime.ofSecondOfDay(Jdk8Methods.floorMod(i8, 86400)), Jdk8Methods.floorDiv(i8, 86400), timeDefinition, zoneOffsetOfTotalSeconds, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3);
    }

    public static ZoneOffsetTransitionRule of(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        Jdk8Methods.requireNonNull(month, "month");
        Jdk8Methods.requireNonNull(localTime, "time");
        Jdk8Methods.requireNonNull(timeDefinition, "timeDefnition");
        Jdk8Methods.requireNonNull(zoneOffset, "standardOffset");
        Jdk8Methods.requireNonNull(zoneOffset2, "offsetBefore");
        Jdk8Methods.requireNonNull(zoneOffset3, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z || localTime.equals(LocalTime.MIDNIGHT)) {
            return new ZoneOffsetTransitionRule(month, i, dayOfWeek, localTime, z ? 1 : 0, timeDefinition, zoneOffset, zoneOffset2, zoneOffset3);
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    private Object writeReplace() {
        return new org.threeten.bp.zone.a((byte) 3, this);
    }

    public void c(DataOutput dataOutput) throws IOException {
        int hour;
        int secondOfDay = this.d.toSecondOfDay() + (this.e * 86400);
        int totalSeconds = this.g.getTotalSeconds();
        int totalSeconds2 = this.h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.i.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 != 0 || secondOfDay > 86400) {
            hour = 31;
        } else {
            hour = secondOfDay == 86400 ? 24 : this.d.getHour();
        }
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (hour == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.h.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.i.getTotalSeconds());
        }
    }

    public ZoneOffsetTransition createTransition(int i) {
        LocalDate localDateOf;
        byte b = this.b;
        if (b < 0) {
            Month month = this.a;
            localDateOf = LocalDate.of(i, month, month.length(IsoChronology.INSTANCE.isLeapYear(i)) + 1 + this.b);
            DayOfWeek dayOfWeek = this.c;
            if (dayOfWeek != null) {
                localDateOf = localDateOf.with(TemporalAdjusters.previousOrSame(dayOfWeek));
            }
        } else {
            localDateOf = LocalDate.of(i, this.a, b);
            DayOfWeek dayOfWeek2 = this.c;
            if (dayOfWeek2 != null) {
                localDateOf = localDateOf.with(TemporalAdjusters.nextOrSame(dayOfWeek2));
            }
        }
        return new ZoneOffsetTransition(this.f.createDateTime(LocalDateTime.of(localDateOf.plusDays(this.e), this.d), this.g, this.h), this.h, this.i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransitionRule)) {
            return false;
        }
        ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
        return this.a == zoneOffsetTransitionRule.a && this.b == zoneOffsetTransitionRule.b && this.c == zoneOffsetTransitionRule.c && this.f == zoneOffsetTransitionRule.f && this.e == zoneOffsetTransitionRule.e && this.d.equals(zoneOffsetTransitionRule.d) && this.g.equals(zoneOffsetTransitionRule.g) && this.h.equals(zoneOffsetTransitionRule.h) && this.i.equals(zoneOffsetTransitionRule.i);
    }

    public int getDayOfMonthIndicator() {
        return this.b;
    }

    public DayOfWeek getDayOfWeek() {
        return this.c;
    }

    public LocalTime getLocalTime() {
        return this.d;
    }

    public Month getMonth() {
        return this.a;
    }

    public ZoneOffset getOffsetAfter() {
        return this.i;
    }

    public ZoneOffset getOffsetBefore() {
        return this.h;
    }

    public ZoneOffset getStandardOffset() {
        return this.g;
    }

    public TimeDefinition getTimeDefinition() {
        return this.f;
    }

    public int hashCode() {
        int secondOfDay = ((this.d.toSecondOfDay() + this.e) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((((secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)) + this.f.ordinal()) ^ this.g.hashCode()) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public boolean isMidnightEndOfDay() {
        return this.e == 1 && this.d.equals(LocalTime.MIDNIGHT);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.h.compareTo(this.i) > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(StringUtil.SPACE);
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(StringUtil.SPACE);
            sb.append((int) this.b);
        }
        sb.append(" at ");
        if (this.e == 0) {
            sb.append(this.d);
        } else {
            long secondOfDay = (this.d.toSecondOfDay() / 60) + (this.e * 24 * 60);
            a(sb, Jdk8Methods.floorDiv(secondOfDay, 60L));
            sb.append(JsonLexerKt.COLON);
            a(sb, Jdk8Methods.floorMod(secondOfDay, 60));
        }
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }
}
