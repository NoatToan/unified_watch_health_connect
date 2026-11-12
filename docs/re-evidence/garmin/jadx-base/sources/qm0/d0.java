package qm0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqm0/d0;", "", "", "activityId", "<init>", "(J)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f145509a;

    public d0(long j8) {
        this.f145509a = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.f145509a == ((d0) obj).f145509a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f145509a);
    }

    public final String toString() {
        return androidx.room.a0.f(this.f145509a, "RemoveVideoEvent(activityId=", ")");
    }
}
