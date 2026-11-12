package hy;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhy/n;", "Lhy/g;", "", "tripId", "Lorg/joda/time/LocalDate;", "date", "<init>", "(Ljava/lang/Long;Lorg/joda/time/LocalDate;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f86345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f86346b;

    public n(Long l14, LocalDate localDate) {
        super(null);
        this.f86345a = l14;
        this.f86346b = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f86345a, nVar.f86345a) && p005kotlin.jvm.internal.s.g(this.f86346b, nVar.f86346b);
    }

    public final int hashCode() {
        Long l14 = this.f86345a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        LocalDate localDate = this.f86346b;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }

    public final String toString() {
        return "JetLagTripDetailsDestination(tripId=" + this.f86345a + ", date=" + this.f86346b + ")";
    }
}
