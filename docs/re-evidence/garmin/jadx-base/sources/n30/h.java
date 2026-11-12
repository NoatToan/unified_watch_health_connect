package n30;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln30/h;", "", "", "isTutorialAvailable", "shouldDisplayNewPointHint", "shouldDisplayMapSettingsHint", "<init>", "(ZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123472c;

    public /* synthetic */ h(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static h a(h hVar) {
        boolean z14 = hVar.f123470a;
        boolean z15 = hVar.f123472c;
        hVar.getClass();
        return new h(z14, false, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f123470a == hVar.f123470a && this.f123471b == hVar.f123471b && this.f123472c == hVar.f123472c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123472c) + q6.f.g(Boolean.hashCode(this.f123470a) * 31, 31, this.f123471b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("CourseTutorialData(isTutorialAvailable=", ", shouldDisplayNewPointHint=", ", shouldDisplayMapSettingsHint=", this.f123470a, this.f123471b), this.f123472c, ")");
    }

    public h(boolean z14, boolean z15, boolean z16) {
        this.f123470a = z14;
        this.f123471b = z15;
        this.f123472c = z16;
    }

    public h() {
        this(false, false, false, 7, null);
    }
}
