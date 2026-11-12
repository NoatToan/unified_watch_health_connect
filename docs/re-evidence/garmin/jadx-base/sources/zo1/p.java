package zo1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo1/p;", "", "", "isLoading", "<init>", "(Z)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f206409a;

    public /* synthetic */ p(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f206409a == ((p) obj).f206409a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206409a);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("GroupRideDetailsUiState(isLoading=", ")", this.f206409a);
    }

    public p(boolean z14) {
        this.f206409a = z14;
    }

    public p() {
        this(false, 1, null);
    }
}
