package defpackage;

import java.util.Date;
import org.joda.convert.ToString;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y00 implements kgj {
    @Override // java.lang.Comparable
    public int compareTo(kgj kgjVar) {
        if (this == kgjVar) {
            return 0;
        }
        long millis = kgjVar.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        return millis2 < millis ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgj)) {
            return false;
        }
        kgj kgjVar = (kgj) obj;
        return getMillis() == kgjVar.getMillis() && fl9.a(getChronology(), kgjVar.getChronology());
    }

    public int get(gq5 gq5Var) {
        if (gq5Var != null) {
            return gq5Var.get(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeField must not be null");
    }

    public DateTimeZone getZone() {
        return getChronology().getZone();
    }

    public int hashCode() {
        return ((int) (getMillis() ^ (getMillis() >>> 32))) + getChronology().hashCode();
    }

    public boolean isAfter(long j) {
        return getMillis() > j;
    }

    public boolean isAfterNow() {
        return isAfter(wq5.b());
    }

    public boolean isBefore(long j) {
        return getMillis() < j;
    }

    public boolean isBeforeNow() {
        return isBefore(wq5.b());
    }

    public boolean isEqual(long j) {
        return getMillis() == j;
    }

    public boolean isEqualNow() {
        return isEqual(wq5.b());
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.getField(getChronology()).isSupported();
    }

    public Date toDate() {
        return new Date(getMillis());
    }

    public DateTime toDateTime() {
        return new DateTime(getMillis(), getZone());
    }

    public DateTime toDateTimeISO() {
        return new DateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }

    @Override // defpackage.kgj
    public Instant toInstant() {
        return new Instant(getMillis());
    }

    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), getZone());
    }

    public MutableDateTime toMutableDateTimeISO() {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }

    public String toString(jq5 jq5Var) {
        return jq5Var == null ? toString() : jq5Var.k(this);
    }

    public boolean isAfter(kgj kgjVar) {
        return isAfter(wq5.h(kgjVar));
    }

    @Override // defpackage.kgj
    public boolean isBefore(kgj kgjVar) {
        return isBefore(wq5.h(kgjVar));
    }

    public boolean isEqual(kgj kgjVar) {
        return isEqual(wq5.h(kgjVar));
    }

    public DateTime toDateTime(DateTimeZone dateTimeZone) {
        return new DateTime(getMillis(), wq5.c(getChronology()).withZone(dateTimeZone));
    }

    public MutableDateTime toMutableDateTime(DateTimeZone dateTimeZone) {
        return new MutableDateTime(getMillis(), wq5.c(getChronology()).withZone(dateTimeZone));
    }

    @Override // defpackage.kgj
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.getField(getChronology()).get(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    @ToString
    public String toString() {
        return sxc.h().k(this);
    }

    public DateTime toDateTime(bw3 bw3Var) {
        return new DateTime(getMillis(), bw3Var);
    }

    public MutableDateTime toMutableDateTime(bw3 bw3Var) {
        return new MutableDateTime(getMillis(), bw3Var);
    }
}
