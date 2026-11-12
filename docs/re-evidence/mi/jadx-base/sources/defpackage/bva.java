package defpackage;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public class bva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeZone f4636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f4637b;
    public final int c;

    public bva(DateTimeZone dateTimeZone, Instant instant, int i) {
        this.f4636a = dateTimeZone;
        this.f4637b = instant;
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bva)) {
            return false;
        }
        bva bvaVar = (bva) obj;
        Instant instant = this.f4637b;
        if (instant == null) {
            if (bvaVar.f4637b != null) {
                return false;
            }
        } else if (!instant.equals(bvaVar.f4637b)) {
            return false;
        }
        if (this.c != bvaVar.c) {
            return false;
        }
        DateTimeZone dateTimeZone = this.f4636a;
        if (dateTimeZone == null) {
            if (bvaVar.f4636a != null) {
                return false;
            }
        } else if (!dateTimeZone.equals(bvaVar.f4636a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Instant instant = this.f4637b;
        int iHashCode = ((((instant == null ? 0 : instant.hashCode()) + 31) * 31) + this.c) * 31;
        DateTimeZone dateTimeZone = this.f4636a;
        return iHashCode + (dateTimeZone != null ? dateTimeZone.hashCode() : 0);
    }
}
