package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf62/t0;", "", "", "showWorkoutGCPUpsellBanner", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f69338a;

    public /* synthetic */ t0(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && this.f69338a == ((t0) obj).f69338a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69338a);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("WorkoutPreCreateUIState(showWorkoutGCPUpsellBanner=", ")", this.f69338a);
    }

    public t0(boolean z14) {
        this.f69338a = z14;
    }

    public t0() {
        this(false, 1, null);
    }
}
