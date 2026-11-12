package ja1;

import androidx.room.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lja1/a;", "Lja1/c;", "", "activityId", "<init>", "(J)V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98073a;

    public a(long j8) {
        super(null);
        this.f98073a = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f98073a == ((a) obj).f98073a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98073a);
    }

    public final String toString() {
        return a0.f(this.f98073a, "PowerCurveBottomSheet(activityId=", ")");
    }
}
