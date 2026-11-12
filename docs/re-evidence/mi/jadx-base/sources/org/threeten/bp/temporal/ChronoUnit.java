package org.threeten.bp.temporal;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c5p;
import defpackage.s4p;
import defpackage.vv3;
import defpackage.zv3;
import miuix.animation.internal.FolmeCore;
import org.threeten.bp.Duration;
import org.threeten.bp.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public enum ChronoUnit implements c5p {
    NANOS("Nanos", Duration.ofNanos(1)),
    MICROS("Micros", Duration.ofNanos(1000)),
    MILLIS("Millis", Duration.ofNanos(FolmeCore.NANOS_TO_MS)),
    SECONDS("Seconds", Duration.ofSeconds(1)),
    MINUTES("Minutes", Duration.ofSeconds(60)),
    HOURS("Hours", Duration.ofSeconds(TimeDateUtil.TIME_HOUR)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200)),
    DAYS("Days", Duration.ofSeconds(86400)),
    WEEKS("Weeks", Duration.ofSeconds(604800)),
    MONTHS("Months", Duration.ofSeconds(2629746)),
    YEARS("Years", Duration.ofSeconds(31556952)),
    DECADES("Decades", Duration.ofSeconds(315569520)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(31556952000L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));

    private final Duration duration;
    private final String name;

    ChronoUnit(String str, Duration duration) {
        this.name = str;
        this.duration = duration;
    }

    @Override // defpackage.c5p
    public <R extends s4p> R addTo(R r2, long j) {
        return (R) r2.plus(j, this);
    }

    @Override // defpackage.c5p
    public long between(s4p s4pVar, s4p s4pVar2) {
        return s4pVar.until(s4pVar2, this);
    }

    @Override // defpackage.c5p
    public Duration getDuration() {
        return this.duration;
    }

    @Override // defpackage.c5p
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // defpackage.c5p
    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    @Override // defpackage.c5p
    public boolean isSupportedBy(s4p s4pVar) {
        if (this == FOREVER) {
            return false;
        }
        if (s4pVar instanceof a) {
            return isDateBased();
        }
        if ((s4pVar instanceof vv3) || (s4pVar instanceof zv3)) {
            return true;
        }
        try {
            s4pVar.plus(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                s4pVar.plus(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    @Override // defpackage.c5p
    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
