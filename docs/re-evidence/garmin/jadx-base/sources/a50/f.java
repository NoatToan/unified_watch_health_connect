package a50;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/f;", "", "", "isUndoAvailable", "isCurrentCourseValid", "shouldDisplayMoreOptionsHint", "<init>", "(ZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1387c;

    public f(boolean z14, boolean z15, boolean z16) {
        this.f1385a = z14;
        this.f1386b = z15;
        this.f1387c = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1385a == fVar.f1385a && this.f1386b == fVar.f1386b && this.f1387c == fVar.f1387c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1387c) + q6.f.g(Boolean.hashCode(this.f1385a) * 31, 31, this.f1386b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("CustomCourseMapActionsUIState(isUndoAvailable=", ", isCurrentCourseValid=", ", shouldDisplayMoreOptionsHint=", this.f1385a, this.f1386b), this.f1387c, ")");
    }
}
