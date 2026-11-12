package pt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpt1/r;", "", "", "isHelpful", "isRecentlyChanged", "<init>", "(ZZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f140963c;

    public r(boolean z14, boolean z15) {
        this.f140961a = z14;
        this.f140962b = z15;
        this.f140963c = z15 ? z14 ? 1 : -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f140961a == rVar.f140961a && this.f140962b == rVar.f140962b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140962b) + (Boolean.hashCode(this.f140961a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("TrailPhotoHelpfulState(isHelpful=", ", isRecentlyChanged=", ")", this.f140961a, this.f140962b);
    }

    public /* synthetic */ r(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, (i14 & 2) != 0 ? false : z15);
    }
}
