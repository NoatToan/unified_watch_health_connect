package i60;

import c22.t;
import com.google.firebase.messaging.Constants;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li60/d;", "", "Lorg/joda/time/LocalDate;", Constants.MessagePayloadKeys.FROM, "until", "", "value", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;D)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f91808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f91809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f91810c;

    public d(LocalDate localDate, LocalDate localDate2, double d14) {
        localDate.getClass();
        localDate2.getClass();
        this.f91808a = localDate;
        this.f91809b = localDate2;
        this.f91810c = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f91808a.equals(dVar.f91808a) && this.f91809b.equals(dVar.f91809b) && Double.compare(this.f91810c, dVar.f91810c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f91810c) + ((this.f91809b.hashCode() + (this.f91808a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CriticalSwimSpeedChartEntry(from=");
        sb3.append(this.f91808a);
        sb3.append(", until=");
        sb3.append(this.f91809b);
        sb3.append(", value=");
        return t.d(this.f91810c, ")", sb3);
    }
}
