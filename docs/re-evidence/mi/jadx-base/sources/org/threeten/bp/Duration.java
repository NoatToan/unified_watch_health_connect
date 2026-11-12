package org.threeten.bp;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.c5p;
import defpackage.crd;
import defpackage.iwl;
import defpackage.s4p;
import defpackage.y4p;
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
import miuix.animation.internal.FolmeCore;
import org.slf4j.Marker;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class Duration implements y4p, Comparable<Duration>, Serializable {
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int NANOS_PER_SECOND = 1000000000;
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(FolmeCore.NANOS_TO_S);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29590a;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f29590a = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29590a[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29590a[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29590a[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Duration(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    public static Duration between(s4p s4pVar, s4p s4pVar2) {
        ChronoUnit chronoUnit = ChronoUnit.SECONDS;
        long jUntil = s4pVar.until(s4pVar2, chronoUnit);
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        long j = 0;
        if (s4pVar.isSupported(chronoField) && s4pVar2.isSupported(chronoField)) {
            try {
                long j2 = s4pVar.getLong(chronoField);
                long j3 = s4pVar2.getLong(chronoField) - j2;
                if (jUntil > 0 && j3 < 0) {
                    j3 += FolmeCore.NANOS_TO_S;
                } else if (jUntil < 0 && j3 > 0) {
                    j3 -= FolmeCore.NANOS_TO_S;
                } else if (jUntil == 0 && j3 != 0) {
                    try {
                        jUntil = s4pVar.until(s4pVar2.with(chronoField, j2), chronoUnit);
                    } catch (ArithmeticException | DateTimeException unused) {
                    }
                }
                j = j3;
            } catch (ArithmeticException | DateTimeException unused2) {
            }
        }
        return ofSeconds(jUntil, j);
    }

    private static Duration create(boolean z, long j, long j2, long j3, long j4, int i) {
        long jK = crd.k(j, crd.k(j2, crd.k(j3, j4)));
        return z ? ofSeconds(jK, i).negated() : ofSeconds(jK, i);
    }

    public static Duration from(y4p y4pVar) {
        crd.i(y4pVar, "amount");
        Duration durationPlus = ZERO;
        for (c5p c5pVar : y4pVar.getUnits()) {
            durationPlus = durationPlus.plus(y4pVar.get(c5pVar), c5pVar);
        }
        return durationPlus;
    }

    public static Duration of(long j, c5p c5pVar) {
        return ZERO.plus(j, c5pVar);
    }

    public static Duration ofDays(long j) {
        return create(crd.m(j, RepositoryManager.GAP_A_DAY), 0);
    }

    public static Duration ofHours(long j) {
        return create(crd.m(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return create(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return create(crd.m(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / FolmeCore.NANOS_TO_S;
        int i = (int) (j % FolmeCore.NANOS_TO_S);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return create(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return create(j, 0);
    }

    public static Duration parse(CharSequence charSequence) {
        crd.i(charSequence, "text");
        Matcher matcher = PATTERN.matcher(charSequence);
        if (matcher.matches() && !"T".equals(matcher.group(3))) {
            int i = 1;
            boolean zEquals = "-".equals(matcher.group(1));
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(4);
            String strGroup3 = matcher.group(5);
            String strGroup4 = matcher.group(6);
            String strGroup5 = matcher.group(7);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                long number = parseNumber(charSequence, strGroup, RepositoryManager.GAP_A_DAY, "days");
                long number2 = parseNumber(charSequence, strGroup2, 3600, "hours");
                long number3 = parseNumber(charSequence, strGroup3, 60, "minutes");
                long number4 = parseNumber(charSequence, strGroup4, 1, "seconds");
                if (strGroup4 != null && strGroup4.charAt(0) == '-') {
                    i = -1;
                }
                try {
                    return create(zEquals, number, number2, number3, number4, parseFraction(charSequence, strGroup5, i));
                } catch (ArithmeticException e) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Duration", charSequence, 0);
    }

    private static int parseFraction(CharSequence charSequence, String str, int i) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return Integer.parseInt((str + "000000000").substring(0, 9)) * i;
        } catch (ArithmeticException e) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e));
        } catch (NumberFormatException e2) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e2));
        }
    }

    private static long parseNumber(CharSequence charSequence, String str, int i, String str2) {
        if (str == null) {
            return 0L;
        }
        try {
            if (str.startsWith(Marker.ANY_NON_NULL_MARKER)) {
                str = str.substring(1);
            }
            return crd.m(Long.parseLong(str), i);
        } catch (ArithmeticException e) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: " + str2, charSequence, 0).initCause(e));
        } catch (NumberFormatException e2) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: " + str2, charSequence, 0).initCause(e2));
        }
    }

    public static Duration readExternal(DataInput dataInput) throws IOException {
        return ofSeconds(dataInput.readLong(), dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private BigDecimal toSeconds() {
        return BigDecimal.valueOf(this.seconds).add(BigDecimal.valueOf(this.nanos, 9));
    }

    private Object writeReplace() {
        return new iwl((byte) 1, this);
    }

    public Duration abs() {
        return isNegative() ? negated() : this;
    }

    @Override // defpackage.y4p
    public s4p addTo(s4p s4pVar) {
        long j = this.seconds;
        if (j != 0) {
            s4pVar = s4pVar.plus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? s4pVar.plus(i, ChronoUnit.NANOS) : s4pVar;
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : create(toSeconds().divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
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
        return this.seconds == duration.seconds && this.nanos == duration.nanos;
    }

    @Override // defpackage.y4p
    public long get(c5p c5pVar) {
        if (c5pVar == ChronoUnit.SECONDS) {
            return this.seconds;
        }
        if (c5pVar == ChronoUnit.NANOS) {
            return this.nanos;
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
    }

    public int getNano() {
        return this.nanos;
    }

    public long getSeconds() {
        return this.seconds;
    }

    @Override // defpackage.y4p
    public List<c5p> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(ChronoUnit.SECONDS, ChronoUnit.NANOS));
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public boolean isNegative() {
        return this.seconds < 0;
    }

    public boolean isZero() {
        return (this.seconds | ((long) this.nanos)) == 0;
    }

    public Duration minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
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
        return j == 1 ? this : create(toSeconds().multiply(BigDecimal.valueOf(j)));
    }

    public Duration negated() {
        return multipliedBy(-1L);
    }

    public Duration plus(Duration duration) {
        return plus(duration.getSeconds(), duration.getNano());
    }

    public Duration plusDays(long j) {
        return plus(crd.m(j, RepositoryManager.GAP_A_DAY), 0L);
    }

    public Duration plusHours(long j) {
        return plus(crd.m(j, 3600), 0L);
    }

    public Duration plusMillis(long j) {
        return plus(j / 1000, (j % 1000) * FolmeCore.NANOS_TO_MS);
    }

    public Duration plusMinutes(long j) {
        return plus(crd.m(j, 60), 0L);
    }

    public Duration plusNanos(long j) {
        return plus(0L, j);
    }

    public Duration plusSeconds(long j) {
        return plus(j, 0L);
    }

    @Override // defpackage.y4p
    public s4p subtractFrom(s4p s4pVar) {
        long j = this.seconds;
        if (j != 0) {
            s4pVar = s4pVar.minus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? s4pVar.minus(i, ChronoUnit.NANOS) : s4pVar;
    }

    public long toDays() {
        return this.seconds / 86400;
    }

    public long toHours() {
        return this.seconds / TimeDateUtil.TIME_HOUR;
    }

    public long toMillis() {
        return crd.k(crd.m(this.seconds, 1000), this.nanos / 1000000);
    }

    public long toMinutes() {
        return this.seconds / 60;
    }

    public long toNanos() {
        return crd.k(crd.m(this.seconds, 1000000000), this.nanos);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / TimeDateUtil.TIME_HOUR;
        int i = (int) ((j % TimeDateUtil.TIME_HOUR) / 60);
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
        if (i2 == 0 && this.nanos == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.nanos);
            } else {
                sb.append(this.nanos + 1000000000);
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
        return create(this.seconds, i);
    }

    public Duration withSeconds(long j) {
        return create(j, this.nanos);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    public static Duration ofSeconds(long j, long j2) {
        return create(crd.k(j, crd.e(j2, FolmeCore.NANOS_TO_S)), crd.g(j2, 1000000000));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iB = crd.b(this.seconds, duration.seconds);
        return iB != 0 ? iB : this.nanos - duration.nanos;
    }

    public Duration plus(long j, c5p c5pVar) {
        crd.i(c5pVar, "unit");
        if (c5pVar == ChronoUnit.DAYS) {
            return plus(crd.m(j, RepositoryManager.GAP_A_DAY), 0L);
        }
        if (c5pVar.isDurationEstimated()) {
            throw new DateTimeException("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return this;
        }
        if (!(c5pVar instanceof ChronoUnit)) {
            Duration durationMultipliedBy = c5pVar.getDuration().multipliedBy(j);
            return plusSeconds(durationMultipliedBy.getSeconds()).plusNanos(durationMultipliedBy.getNano());
        }
        int i = a.f29590a[((ChronoUnit) c5pVar).ordinal()];
        if (i == 1) {
            return plusNanos(j);
        }
        if (i == 2) {
            return plusSeconds((j / FolmeCore.NANOS_TO_S) * 1000).plusNanos((j % FolmeCore.NANOS_TO_S) * 1000);
        }
        if (i != 3) {
            return i != 4 ? plusSeconds(crd.n(c5pVar.getDuration().seconds, j)) : plusSeconds(j);
        }
        return plusMillis(j);
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        if (seconds == Long.MIN_VALUE) {
            return plus(Long.MAX_VALUE, -nano).plus(1L, 0L);
        }
        return plus(-seconds, -nano);
    }

    private static Duration create(long j, int i) {
        if ((((long) i) | j) == 0) {
            return ZERO;
        }
        return new Duration(j, i);
    }

    private static Duration create(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(BI_NANOS_PER_SECOND);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    private Duration plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(crd.k(crd.k(this.seconds, j), j2 / FolmeCore.NANOS_TO_S), ((long) this.nanos) + (j2 % FolmeCore.NANOS_TO_S));
    }
}
