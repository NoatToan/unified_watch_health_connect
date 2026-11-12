package k62;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk62/g;", "", "", "loading", "hasChildAccount", "hasWorkoutsAccess", "<init>", "(ZZLjava/lang/Boolean;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f103188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f103190c;

    public /* synthetic */ g(boolean z14, boolean z15, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f103188a == gVar.f103188a && this.f103189b == gVar.f103189b && s.g(this.f103190c, gVar.f103190c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f103188a) * 31, 31, this.f103189b);
        Boolean bool = this.f103190c;
        return iG + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return p6.b.f(com.airbnb.lottie.animation.keyframe.a.m("MyWorkoutsInitialStateCheckUiState(loading=", ", hasChildAccount=", ", hasWorkoutsAccess=", this.f103188a, this.f103189b), this.f103190c, ")");
    }

    public g(boolean z14, boolean z15, Boolean bool) {
        this.f103188a = z14;
        this.f103189b = z15;
        this.f103190c = bool;
    }

    public g() {
        this(false, false, null, 7, null);
    }
}
