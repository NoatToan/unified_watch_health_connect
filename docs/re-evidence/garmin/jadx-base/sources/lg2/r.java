package lg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llg2/r;", "", "", "primaryButtonLoading", "stopButtonLoading", "<init>", "(ZZ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112356b;

    public /* synthetic */ r(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f112355a == rVar.f112355a && this.f112356b == rVar.f112356b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112356b) + (Boolean.hashCode(this.f112355a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("MainButtonsLoadingState(primaryButtonLoading=", ", stopButtonLoading=", ")", this.f112355a, this.f112356b);
    }

    public r(boolean z14, boolean z15) {
        this.f112355a = z14;
        this.f112356b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
