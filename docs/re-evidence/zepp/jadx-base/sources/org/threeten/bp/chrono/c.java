package org.threeten.bp.chrono;

import io.netty.util.internal.StringUtil;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes23.dex */
final class c extends ChronoPeriod implements Serializable {
    private static final long serialVersionUID = 275618735781L;
    private final Chronology a;
    private final int b;
    private final int c;
    private final int d;

    public c(Chronology chronology, int i, int i2, int i3) {
        this.a = chronology;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        Jdk8Methods.requireNonNull(temporal, "temporal");
        Chronology chronology = (Chronology) temporal.query(TemporalQueries.chronology());
        if (chronology != null && !this.a.equals(chronology)) {
            throw new DateTimeException("Invalid chronology, required: " + this.a.getId() + ", but was: " + chronology.getId());
        }
        int i = this.b;
        if (i != 0) {
            temporal = temporal.plus(i, ChronoUnit.YEARS);
        }
        int i2 = this.c;
        if (i2 != 0) {
            temporal = temporal.plus(i2, ChronoUnit.MONTHS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.plus(i3, ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.a.equals(cVar.a);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public long get(TemporalUnit temporalUnit) {
        int i;
        if (temporalUnit == ChronoUnit.YEARS) {
            i = this.b;
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            i = this.c;
        } else {
            if (temporalUnit != ChronoUnit.DAYS) {
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
            i = this.d;
        }
        return i;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public Chronology getChronology() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public List<TemporalUnit> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public int hashCode() {
        return this.a.hashCode() + Integer.rotateLeft(this.b, 16) + Integer.rotateLeft(this.c, 8) + this.d;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public ChronoPeriod minus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof c) {
            c cVar = (c) temporalAmount;
            if (cVar.getChronology().equals(getChronology())) {
                return new c(this.a, Jdk8Methods.safeSubtract(this.b, cVar.b), Jdk8Methods.safeSubtract(this.c, cVar.c), Jdk8Methods.safeSubtract(this.d, cVar.d));
            }
        }
        throw new DateTimeException("Unable to subtract amount: " + temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public ChronoPeriod multipliedBy(int i) {
        return new c(this.a, Jdk8Methods.safeMultiply(this.b, i), Jdk8Methods.safeMultiply(this.c, i), Jdk8Methods.safeMultiply(this.d, i));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public ChronoPeriod normalized() {
        Chronology chronology = this.a;
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        if (!chronology.range(chronoField).isFixed()) {
            return this;
        }
        long maximum = (this.a.range(chronoField).getMaximum() - this.a.range(chronoField).getMinimum()) + 1;
        long j = (((long) this.b) * maximum) + ((long) this.c);
        return new c(this.a, Jdk8Methods.safeToInt(j / maximum), Jdk8Methods.safeToInt(j % maximum), this.d);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public ChronoPeriod plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof c) {
            c cVar = (c) temporalAmount;
            if (cVar.getChronology().equals(getChronology())) {
                return new c(this.a, Jdk8Methods.safeAdd(this.b, cVar.b), Jdk8Methods.safeAdd(this.c, cVar.c), Jdk8Methods.safeAdd(this.d, cVar.d));
            }
        }
        throw new DateTimeException("Unable to add amount: " + temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public Temporal subtractFrom(Temporal temporal) {
        Jdk8Methods.requireNonNull(temporal, "temporal");
        Chronology chronology = (Chronology) temporal.query(TemporalQueries.chronology());
        if (chronology != null && !this.a.equals(chronology)) {
            throw new DateTimeException("Invalid chronology, required: " + this.a.getId() + ", but was: " + chronology.getId());
        }
        int i = this.b;
        if (i != 0) {
            temporal = temporal.minus(i, ChronoUnit.YEARS);
        }
        int i2 = this.c;
        if (i2 != 0) {
            temporal = temporal.minus(i2, ChronoUnit.MONTHS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.minus(i3, ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public String toString() {
        if (isZero()) {
            return this.a + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(StringUtil.SPACE);
        sb.append('P');
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
