package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz10/a2;", "", "", "isLivetrackCapable", "isCoachCapable", "isInsightsAvailable", "isAutoDetectCapable", "<init>", "(ZZZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f200883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f200885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f200886d;

    public a2(boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f200883a = z14;
        this.f200884b = z15;
        this.f200885c = z16;
        this.f200886d = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.f200883a == a2Var.f200883a && this.f200884b == a2Var.f200884b && this.f200885c == a2Var.f200885c && this.f200886d == a2Var.f200886d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200886d) + q6.f.g(q6.f.g(Boolean.hashCode(this.f200883a) * 31, 31, this.f200884b), 31, this.f200885c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", isAutoDetectCapable=", ")", com.airbnb.lottie.animation.keyframe.a.m("DeviceCapableState(isLivetrackCapable=", ", isCoachCapable=", ", isInsightsAvailable=", this.f200883a, this.f200884b), this.f200885c, this.f200886d);
    }
}
