package x61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx61/p;", "", "", "hasTrainingStatusCapableDevice", "currentDeviceSupportsTSPause", "isUserInTrainingStatusPause", "displayGarminCoachPauseBanner", "<init>", "(ZZZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f189267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f189268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f189269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f189270d;

    public /* synthetic */ p(boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f189267a == pVar.f189267a && this.f189268b == pVar.f189268b && this.f189269c == pVar.f189269c && this.f189270d == pVar.f189270d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189270d) + q6.f.g(q6.f.g(Boolean.hashCode(this.f189267a) * 31, 31, this.f189268b), 31, this.f189269c);
    }

    public final String toString() {
        boolean z14 = this.f189267a;
        boolean z15 = this.f189268b;
        return com.airbnb.lottie.animation.keyframe.a.f(", displayGarminCoachPauseBanner=", ")", com.airbnb.lottie.animation.keyframe.a.m("TrainingStatusPauseUIModel(hasTrainingStatusCapableDevice=", ", currentDeviceSupportsTSPause=", ", isUserInTrainingStatusPause=", z14, z15), this.f189269c, this.f189270d);
    }

    public p(boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f189267a = z14;
        this.f189268b = z15;
        this.f189269c = z16;
        this.f189270d = z17;
    }

    public p() {
        this(false, false, false, false, 15, null);
    }
}
