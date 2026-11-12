package org.threeten.bp;

import androidx.exifinterface.media.ExifInterface;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes23.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    private static final int c = 1000000000;
    private static final int d = 1000000;
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger e = BigInteger.valueOf(1000000000);
    private static final Pattern f = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Duration a(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    private static Duration b(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(e);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        ChronoUnit chronoUnit = ChronoUnit.SECONDS;
        long jUntil = temporal.until(temporal2, chronoUnit);
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        long j = 0;
        if (temporal.isSupported(chronoField) && temporal2.isSupported(chronoField)) {
            try {
                long j2 = temporal.getLong(chronoField);
                long j3 = temporal2.getLong(chronoField) - j2;
                if (jUntil > 0 && j3 < 0) {
                    j3 += 1000000000;
                } else if (jUntil < 0 && j3 > 0) {
                    j3 -= 1000000000;
                } else if (jUntil == 0 && j3 != 0) {
                    try {
                        jUntil = temporal.until(temporal2.with(chronoField, j2), chronoUnit);
                    } catch (ArithmeticException | DateTimeException unused) {
                    }
                }
                j = j3;
            } catch (ArithmeticException | DateTimeException unused2) {
            }
        }
        return ofSeconds(jUntil, j);
    }

    private static Duration c(boolean z, long j, long j2, long j3, long j4, int i) {
        long jSafeAdd = Jdk8Methods.safeAdd(j, Jdk8Methods.safeAdd(j2, Jdk8Methods.safeAdd(j3, j4)));
        return z ? ofSeconds(jSafeAdd, i).negated() : ofSeconds(jSafeAdd, i);
    }

    private static int e(CharSequence charSequence, String str, int i) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return Integer.parseInt((str + "000000000").substring(0, 9)) * i;
        } catch (ArithmeticException e2) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e2));
        } catch (NumberFormatException e3) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e3));
        }
    }

    private static long f(CharSequence charSequence, String str, int i, String str2) {
        if (str == null) {
            return 0L;
        }
        try {
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
            return Jdk8Methods.safeMultiply(Long.parseLong(str), i);
        } catch (ArithmeticException e2) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: " + str2, charSequence, 0).initCause(e2));
        } catch (NumberFormatException e3) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: " + str2, charSequence, 0).initCause(e3));
        }
    }

    public static Duration from(TemporalAmount temporalAmount) {
        Jdk8Methods.requireNonNull(temporalAmount, "amount");
        Duration durationPlus = ZERO;
        for (TemporalUnit temporalUnit : temporalAmount.getUnits()) {
            durationPlus = durationPlus.plus(temporalAmount.get(temporalUnit), temporalUnit);
        }
        return durationPlus;
    }

    private Duration g(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(Jdk8Methods.safeAdd(Jdk8Methods.safeAdd(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public static Duration h(DataInput dataInput) throws IOException {
        return ofSeconds(dataInput.readLong(), dataInput.readInt());
    }

    private BigDecimal i() {
        return BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9));
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        return ZERO.plus(j, temporalUnit);
    }

    public static Duration ofDays(long j) {
        return a(Jdk8Methods.safeMultiply(j, 86400), 0);
    }

    public static Duration ofHours(long j) {
        return a(Jdk8Methods.safeMultiply(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return a(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return a(Jdk8Methods.safeMultiply(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return a(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return a(j, 0);
    }

    public static Duration parse(CharSequence charSequence) {
        Jdk8Methods.requireNonNull(charSequence, "text");
        Matcher matcher = f.matcher(charSequence);
        if (matcher.matches() && !ExifInterface.GPS_DIRECTION_TRUE.equals(matcher.group(3))) {
            boolean zEquals = Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(matcher.group(1));
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(4);
            String strGroup3 = matcher.group(5);
            String strGroup4 = matcher.group(6);
            String strGroup5 = matcher.group(7);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                try {
                    return c(zEquals, f(charSequence, strGroup, 86400, "days"), f(charSequence, strGroup2, 3600, "hours"), f(charSequence, strGroup3, 60, "minutes"), f(charSequence, strGroup4, 1, "seconds"), e(charSequence, strGroup5, strGroup4 != null && strGroup4.charAt(0) == '-' ? -1 : 1));
                } catch (ArithmeticException e2) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e2));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Duration", charSequence, 0);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new org.threeten.bp.a((byte) 1, this);
    }

    public Duration abs() {
        return isNegative() ? negated() : this;
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.plus(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.plus(i, ChronoUnit.NANOS) : temporal;
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : b(i().divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.a == duration.a && this.b == duration.b;
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public long get(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.SECONDS) {
            return this.a;
        }
        if (temporalUnit == ChronoUnit.NANOS) {
            return this.b;
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public List<TemporalUnit> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(ChronoUnit.SECONDS, ChronoUnit.NANOS));
    }

    public int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) + (this.b * 51);
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public boolean isZero() {
        return (this.a | ((long) this.b)) == 0;
    }

    public void j(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? g(Long.MAX_VALUE, -nano).g(1L, 0L) : g(-seconds, -nano);
    }

    public Duration minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public Duration minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1L) : plusHours(-j);
    }

    public Duration minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Duration minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    public Duration minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1L) : plusNanos(-j);
    }

    public Duration minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j == 1 ? this : b(i().multiply(BigDecimal.valueOf(j)));
    }

    public Duration negated() {
        return multipliedBy(-1L);
    }

    public Duration plus(Duration duration) {
        return g(duration.getSeconds(), duration.getNano());
    }

    public Duration plusDays(long j) {
        return g(Jdk8Methods.safeMultiply(j, 86400), 0L);
    }

    public Duration plusHours(long j) {
        return g(Jdk8Methods.safeMultiply(j, 3600), 0L);
    }

    public Duration plusMillis(long j) {
        return g(j / 1000, (j % 1000) * 1000000);
    }

    public Duration plusMinutes(long j) {
        return g(Jdk8Methods.safeMultiply(j, 60), 0L);
    }

    public Duration plusNanos(long j) {
        return g(0L, j);
    }

    public Duration plusSeconds(long j) {
        return g(j, 0L);
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public Temporal subtractFrom(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.minus(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.minus(i, ChronoUnit.NANOS) : temporal;
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toDaysPart() {
        return this.a / 86400;
    }

    public long toHours() {
        return this.a / TimeUtils.TIME_1_HOURS;
    }

    public int toHoursPart() {
        return (int) (toHours() % 24);
    }

    public long toMillis() {
        return Jdk8Methods.safeAdd(Jdk8Methods.safeMultiply(this.a, 1000), this.b / 1000000);
    }

    public int toMillisPart() {
        return this.b / 1000000;
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public int toMinutesPart() {
        return (int) (toMinutes() % 60);
    }

    public long toNanos() {
        return Jdk8Methods.safeAdd(Jdk8Methods.safeMultiply(this.a, 1000000000), this.b);
    }

    public int toNanosPart() {
        return this.b;
    }

    public int toSecondsPart() {
        return (int) (this.a % 60);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        long j2 = j / TimeUtils.TIME_1_HOURS;
        int i = (int) ((j % TimeUtils.TIME_1_HOURS) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.b <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.b > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.b);
            } else {
                sb.append(this.b + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public Duration withNanos(int i) {
        ChronoField.NANO_OF_SECOND.checkValidIntValue(i);
        return a(this.a, i);
    }

    public Duration withSeconds(long j) {
        return a(j, this.b);
    }

    public static Duration ofSeconds(long j, long j2) {
        return a(Jdk8Methods.safeAdd(j, Jdk8Methods.floorDiv(j2, 1000000000L)), Jdk8Methods.floorMod(j2, 1000000000));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompareLongs = Jdk8Methods.compareLongs(this.a, duration.a);
        return iCompareLongs != 0 ? iCompareLongs : this.b - duration.b;
    }

    public Duration plus(long j, TemporalUnit temporalUnit) {
        Jdk8Methods.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return g(Jdk8Methods.safeMultiply(j, 86400), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new DateTimeException("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return this;
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            Duration durationMultipliedBy = temporalUnit.getDuration().multipliedBy(j);
            return plusSeconds(durationMultipliedBy.getSeconds()).plusNanos(durationMultipliedBy.getNano());
        }
        int i = a.a[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return plusNanos(j);
        }
        if (i == 2) {
            return plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000);
        }
        if (i != 3) {
            return i != 4 ? plusSeconds(Jdk8Methods.safeMultiply(temporalUnit.getDuration().a, j)) : plusSeconds(j);
        }
        return plusMillis(j);
    }

    public Duration minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }
}
