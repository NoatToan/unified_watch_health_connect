package a50;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La50/b;", "", "", "isTutorialAvailable", "shouldDisplayNewPointHint", "shouldDisplayMapSettingsHint", "shouldDisplayMoreOptionsHint", "<init>", "(ZZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1250d;

    public /* synthetic */ b(boolean z14, boolean z15, boolean z16, boolean z17, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17);
    }

    public static b a(b bVar, int i14) {
        boolean z14 = bVar.f1247a;
        boolean z15 = (i14 & 2) != 0 ? bVar.f1248b : false;
        boolean z16 = bVar.f1249c;
        boolean z17 = (i14 & 8) != 0 ? bVar.f1250d : false;
        bVar.getClass();
        return new b(z14, z15, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1247a == bVar.f1247a && this.f1248b == bVar.f1248b && this.f1249c == bVar.f1249c && this.f1250d == bVar.f1250d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1250d) + q6.f.g(q6.f.g(Boolean.hashCode(this.f1247a) * 31, 31, this.f1248b), 31, this.f1249c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", shouldDisplayMoreOptionsHint=", ")", com.airbnb.lottie.animation.keyframe.a.m("CourseTutorialData(isTutorialAvailable=", ", shouldDisplayNewPointHint=", ", shouldDisplayMapSettingsHint=", this.f1247a, this.f1248b), this.f1249c, this.f1250d);
    }

    public b(boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f1247a = z14;
        this.f1248b = z15;
        this.f1249c = z16;
        this.f1250d = z17;
    }

    public b() {
        this(false, false, false, false, 15, null);
    }
}
