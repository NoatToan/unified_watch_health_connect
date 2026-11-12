package tf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltf0/p;", "Ltf0/k;", "", "show", "<init>", "(Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164462a;

    public p(boolean z14) {
        this.f164462a = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f164462a == ((p) obj).f164462a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164462a);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("ShowLoadingAction(show=", ")", this.f164462a);
    }
}
