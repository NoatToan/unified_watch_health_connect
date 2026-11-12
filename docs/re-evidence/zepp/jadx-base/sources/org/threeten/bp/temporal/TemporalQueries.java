package org.threeten.bp.temporal;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.Chronology;

/* JADX INFO: loaded from: classes23.dex */
public final class TemporalQueries {
    public static final TemporalQuery<ZoneId> a = new a();
    public static final TemporalQuery<Chronology> b = new b();
    public static final TemporalQuery<TemporalUnit> c = new c();
    public static final TemporalQuery<ZoneId> d = new d();
    public static final TemporalQuery<ZoneOffset> e = new e();
    public static final TemporalQuery<LocalDate> f = new f();
    public static final TemporalQuery<LocalTime> g = new g();

    public class a implements TemporalQuery<ZoneId> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ZoneId queryFrom(TemporalAccessor temporalAccessor) {
            return (ZoneId) temporalAccessor.query(this);
        }
    }

    public class b implements TemporalQuery<Chronology> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Chronology queryFrom(TemporalAccessor temporalAccessor) {
            return (Chronology) temporalAccessor.query(this);
        }
    }

    public class c implements TemporalQuery<TemporalUnit> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TemporalUnit queryFrom(TemporalAccessor temporalAccessor) {
            return (TemporalUnit) temporalAccessor.query(this);
        }
    }

    public class d implements TemporalQuery<ZoneId> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ZoneId queryFrom(TemporalAccessor temporalAccessor) {
            ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.a);
            return zoneId != null ? zoneId : (ZoneId) temporalAccessor.query(TemporalQueries.e);
        }
    }

    public class e implements TemporalQuery<ZoneOffset> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ZoneOffset queryFrom(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            if (temporalAccessor.isSupported(chronoField)) {
                return ZoneOffset.ofTotalSeconds(temporalAccessor.get(chronoField));
            }
            return null;
        }
    }

    public class f implements TemporalQuery<LocalDate> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalDate queryFrom(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.EPOCH_DAY;
            if (temporalAccessor.isSupported(chronoField)) {
                return LocalDate.ofEpochDay(temporalAccessor.getLong(chronoField));
            }
            return null;
        }
    }

    public class g implements TemporalQuery<LocalTime> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalTime queryFrom(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.NANO_OF_DAY;
            if (temporalAccessor.isSupported(chronoField)) {
                return LocalTime.ofNanoOfDay(temporalAccessor.getLong(chronoField));
            }
            return null;
        }
    }

    private TemporalQueries() {
    }

    public static final TemporalQuery<Chronology> chronology() {
        return b;
    }

    public static final TemporalQuery<LocalDate> localDate() {
        return f;
    }

    public static final TemporalQuery<LocalTime> localTime() {
        return g;
    }

    public static final TemporalQuery<ZoneOffset> offset() {
        return e;
    }

    public static final TemporalQuery<TemporalUnit> precision() {
        return c;
    }

    public static final TemporalQuery<ZoneId> zone() {
        return d;
    }

    public static final TemporalQuery<ZoneId> zoneId() {
        return a;
    }
}
