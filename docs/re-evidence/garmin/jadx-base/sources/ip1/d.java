package ip1;

import com.garmin.android.gncs.NotificationConstants;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lip1/d;", "", "Lorg/joda/time/DateTime;", "calendarDate", "Lip1/e;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "rideTimeGainedMs", "<init>", "(Lorg/joda/time/DateTime;Lip1/e;Ljava/lang/Long;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f94672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f94673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f94674c;

    public d(DateTime dateTime, e eVar, Long l14) {
        dateTime.getClass();
        eVar.getClass();
        this.f94672a = dateTime;
        this.f94673b = eVar;
        this.f94674c = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f94672a, dVar.f94672a) && this.f94673b == dVar.f94673b && s.g(this.f94674c, dVar.f94674c);
    }

    public final int hashCode() {
        int iHashCode = (this.f94673b.hashCode() + (this.f94672a.hashCode() * 31)) * 31;
        Long l14 = this.f94674c;
        return iHashCode + (l14 == null ? 0 : l14.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EdgeSolarChargeEntry(calendarDate=");
        sb3.append(this.f94672a);
        sb3.append(", type=");
        sb3.append(this.f94673b);
        sb3.append(", rideTimeGainedMs=");
        return p6.b.g(sb3, this.f94674c, ")");
    }

    public /* synthetic */ d(DateTime dateTime, e eVar, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dateTime, eVar, (i14 & 4) != 0 ? null : l14);
    }
}
