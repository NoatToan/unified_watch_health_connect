package ds0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lds0/c;", "Lds0/m;", "", "openAddTrip", "<init>", "(Z)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f61068a;

    public c(boolean z14) {
        super(null);
        this.f61068a = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f61068a == ((c) obj).f61068a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61068a);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("DestinationJetLagManageTrips(openAddTrip=", ")", this.f61068a);
    }
}
