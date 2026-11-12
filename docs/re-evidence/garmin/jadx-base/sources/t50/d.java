package t50;

import p005kotlin.Metadata;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt50/d;", "", "", "isEditable", "containsRests", "containsCutoffs", "containsNotes", "<init>", "(ZZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f162539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f162540d;

    public d(boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f162537a = z14;
        this.f162538b = z15;
        this.f162539c = z16;
        this.f162540d = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f162537a == dVar.f162537a && this.f162538b == dVar.f162538b && this.f162539c == dVar.f162539c && this.f162540d == dVar.f162540d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162540d) + f.g(f.g(Boolean.hashCode(this.f162537a) * 31, 31, this.f162538b), 31, this.f162539c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", containsNotes=", ")", com.airbnb.lottie.animation.keyframe.a.m("CoursePointListHeaderUIState(isEditable=", ", containsRests=", ", containsCutoffs=", this.f162537a, this.f162538b), this.f162539c, this.f162540d);
    }
}
