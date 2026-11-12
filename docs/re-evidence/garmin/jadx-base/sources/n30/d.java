package n30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/d;", "", "", "isUndoAvailable", "isCurrentCourseValid", "<init>", "(ZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123445b;

    public d(boolean z14, boolean z15) {
        this.f123444a = z14;
        this.f123445b = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f123444a == dVar.f123444a && this.f123445b == dVar.f123445b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123445b) + (Boolean.hashCode(this.f123444a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("AutomaticCourseMapActionsUIState(isUndoAvailable=", ", isCurrentCourseValid=", ")", this.f123444a, this.f123445b);
    }
}
