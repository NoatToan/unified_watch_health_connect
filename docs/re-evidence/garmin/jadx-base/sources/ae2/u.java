package ae2;

import com.garmin.android.gncs.NotificationConstants;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lae2/u;", "", "", "deviceId", "Lae2/v;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lorg/joda/time/DateTime;", "dateTime", "<init>", "(Ljava/lang/Long;Lae2/v;Lorg/joda/time/DateTime;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f2995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f2996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f2997c;

    public /* synthetic */ u(Long l14, v vVar, DateTime dateTime, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : l14, (i14 & 2) != 0 ? null : vVar, (i14 & 4) != 0 ? null : dateTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f2995a, uVar.f2995a) && p005kotlin.jvm.internal.s.g(this.f2996b, uVar.f2996b) && p005kotlin.jvm.internal.s.g(this.f2997c, uVar.f2997c);
    }

    public final int hashCode() {
        Long l14 = this.f2995a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        v vVar = this.f2996b;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        DateTime dateTime = this.f2997c;
        return iHashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final String toString() {
        return "LtLifeEvent(deviceId=" + this.f2995a + ", type=" + this.f2996b + ", dateTime=" + this.f2997c + ")";
    }

    public u(Long l14, v vVar, DateTime dateTime) {
        this.f2995a = l14;
        this.f2996b = vVar;
        this.f2997c = dateTime;
    }

    public u() {
        this(null, null, null, 7, null);
    }
}
