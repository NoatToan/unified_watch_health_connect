package org.threeten.bp;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.a5p;
import defpackage.b5p;
import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.iq5;
import defpackage.iwl;
import defpackage.s4p;
import defpackage.sv5;
import defpackage.t4p;
import defpackage.w4p;
import defpackage.y4p;
import defpackage.z4p;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import miuix.animation.internal.FolmeCore;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant extends sv5 implements s4p, w4p, Comparable<Instant>, Serializable {
    private static final long MILLIS_PER_SEC = 1000;
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int NANOS_PER_SECOND = 1000000000;
    private static final long serialVersionUID = -665713676816604388L;
    private final int nanos;
    private final long seconds;
    public static final Instant EPOCH = new Instant(0, 0);
    private static final long MIN_SECOND = -31557014167219200L;
    public static final Instant MIN = ofEpochSecond(MIN_SECOND, 0);
    private static final long MAX_SECOND = 31556889864403199L;
    public static final Instant MAX = ofEpochSecond(MAX_SECOND, 999999999);
    public static final b5p<Instant> FROM = new a();

    public class a implements b5p<Instant> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Instant a(t4p t4pVar) {
            return Instant.from(t4pVar);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29592b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            f29592b = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29592b[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29592b[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29592b[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29592b[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29592b[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29592b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29592b[ChronoUnit.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            f29591a = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29591a[ChronoField.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29591a[ChronoField.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29591a[ChronoField.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private Instant(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    private static Instant create(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < MIN_SECOND || j > MAX_SECOND) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant from(t4p t4pVar) {
        try {
            return ofEpochSecond(t4pVar.getLong(ChronoField.INSTANT_SECONDS), t4pVar.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName(), e);
        }
    }

    private long nanosUntil(Instant instant) {
        return crd.k(crd.m(crd.p(instant.seconds, this.seconds), 1000000000), instant.nanos - this.nanos);
    }

    public static Instant now() {
        return g14.e().b();
    }

    public static Instant ofEpochMilli(long j) {
        return create(crd.e(j, 1000L), crd.g(j, 1000) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return create(j, 0);
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) iq5.t.h(charSequence, FROM);
    }

    public static Instant readExternal(DataInput dataInput) throws IOException {
        return ofEpochSecond(dataInput.readLong(), dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private long secondsUntil(Instant instant) {
        long jP = crd.p(instant.seconds, this.seconds);
        long j = instant.nanos - this.nanos;
        if (jP <= 0 || j >= 0) {
            return (jP >= 0 || j <= 0) ? jP : jP + 1;
        }
        return jP - 1;
    }

    private Object writeReplace() {
        return new iwl((byte) 2, this);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.INSTANT_SECONDS, this.seconds).with(ChronoField.NANO_OF_SECOND, this.nanos);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.ofInstant(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.seconds == instant.seconds && this.nanos == instant.nanos;
    }

    @Override // defpackage.sv5, defpackage.t4p
    public int get(z4p z4pVar) {
        if (!(z4pVar instanceof ChronoField)) {
            return range(z4pVar).checkValidIntValue(z4pVar.getFrom(this), z4pVar);
        }
        int i = b.f29591a[((ChronoField) z4pVar).ordinal()];
        if (i == 1) {
            return this.nanos;
        }
        if (i == 2) {
            return this.nanos / 1000;
        }
        if (i == 3) {
            return this.nanos / 1000000;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }

    public long getEpochSecond() {
        return this.seconds;
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        int i;
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        int i2 = b.f29591a[((ChronoField) z4pVar).ordinal()];
        if (i2 == 1) {
            i = this.nanos;
        } else if (i2 == 2) {
            i = this.nanos / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.seconds;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
            }
            i = this.nanos / 1000000;
        }
        return i;
    }

    public int getNano() {
        return this.nanos;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.INSTANT_SECONDS || z4pVar == ChronoField.NANO_OF_SECOND || z4pVar == ChronoField.MICRO_OF_SECOND || z4pVar == ChronoField.MILLI_OF_SECOND;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public Instant minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Instant minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1L) : plusNanos(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public Instant plusMillis(long j) {
        return plus(j / 1000, (j % 1000) * FolmeCore.NANOS_TO_MS);
    }

    public Instant plusNanos(long j) {
        return plus(0L, j);
    }

    public Instant plusSeconds(long j) {
        return plus(j, 0L);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (b5pVar == a5p.b() || b5pVar == a5p.c() || b5pVar == a5p.a() || b5pVar == a5p.g() || b5pVar == a5p.f() || b5pVar == a5p.d()) {
            return null;
        }
        return b5pVar.a(this);
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        return super.range(z4pVar);
    }

    public long toEpochMilli() {
        long j = this.seconds;
        return j >= 0 ? crd.k(crd.n(j, 1000L), this.nanos / 1000000) : crd.p(crd.n(j + 1, 1000L), 1000 - ((long) (this.nanos / 1000000)));
    }

    public String toString() {
        return iq5.t.b(this);
    }

    public Instant truncatedTo(c5p c5pVar) {
        if (c5pVar == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = c5pVar.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new DateTimeException("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos != 0) {
            throw new DateTimeException("Unit must divide into a standard day without remainder");
        }
        long j = ((this.seconds % 86400) * FolmeCore.NANOS_TO_S) + ((long) this.nanos);
        return plusNanos((crd.e(j, nanos) * nanos) - j);
    }

    @Override // defpackage.s4p
    public long until(s4p s4pVar, c5p c5pVar) {
        Instant instantFrom = from(s4pVar);
        if (!(c5pVar instanceof ChronoUnit)) {
            return c5pVar.between(this, instantFrom);
        }
        switch (b.f29592b[((ChronoUnit) c5pVar).ordinal()]) {
            case 1:
                return nanosUntil(instantFrom);
            case 2:
                return nanosUntil(instantFrom) / 1000;
            case 3:
                return crd.p(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return secondsUntil(instantFrom);
            case 5:
                return secondsUntil(instantFrom) / 60;
            case 6:
                return secondsUntil(instantFrom) / TimeDateUtil.TIME_HOUR;
            case 7:
                return secondsUntil(instantFrom) / 43200;
            case 8:
                return secondsUntil(instantFrom) / 86400;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
        }
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    public static Instant now(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        return g14Var.b();
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return create(crd.k(j, crd.e(j2, FolmeCore.NANOS_TO_S)), crd.g(j2, 1000000000));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iB = crd.b(this.seconds, instant.seconds);
        return iB != 0 ? iB : this.nanos - instant.nanos;
    }

    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant m2669plus(y4p y4pVar) {
        return (Instant) y4pVar.addTo(this);
    }

    @Override // defpackage.s4p
    public Instant with(w4p w4pVar) {
        return (Instant) w4pVar.adjustInto(this);
    }

    public boolean isSupported(c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            return c5pVar.isTimeBased() || c5pVar == ChronoUnit.DAYS;
        }
        return c5pVar != null && c5pVar.isSupportedBy(this);
    }

    @Override // defpackage.s4p
    public Instant plus(long j, c5p c5pVar) {
        if (c5pVar instanceof ChronoUnit) {
            switch (b.f29592b[((ChronoUnit) c5pVar).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plus(j / FolmeCore.NANOS_TO_MS, (j % FolmeCore.NANOS_TO_MS) * 1000);
                case 3:
                    return plusMillis(j);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusSeconds(crd.m(j, 60));
                case 6:
                    return plusSeconds(crd.m(j, 3600));
                case 7:
                    return plusSeconds(crd.m(j, 43200));
                case 8:
                    return plusSeconds(crd.m(j, RepositoryManager.GAP_A_DAY));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
            }
        }
        return (Instant) c5pVar.addTo(this, j);
    }

    @Override // defpackage.s4p
    public Instant with(z4p z4pVar, long j) {
        if (z4pVar instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) z4pVar;
            chronoField.checkValidValue(j);
            int i = b.f29591a[chronoField.ordinal()];
            if (i == 1) {
                return j != ((long) this.nanos) ? create(this.seconds, (int) j) : this;
            }
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                return i2 != this.nanos ? create(this.seconds, i2) : this;
            }
            if (i == 3) {
                int i3 = ((int) j) * 1000000;
                return i3 != this.nanos ? create(this.seconds, i3) : this;
            }
            if (i == 4) {
                return j != this.seconds ? create(j, this.nanos) : this;
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }
        return (Instant) z4pVar.adjustInto(this, j);
    }

    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public Instant m2668minus(y4p y4pVar) {
        return (Instant) y4pVar.subtractFrom(this);
    }

    private Instant plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(crd.k(crd.k(this.seconds, j), j2 / FolmeCore.NANOS_TO_S), ((long) this.nanos) + (j2 % FolmeCore.NANOS_TO_S));
    }
}
