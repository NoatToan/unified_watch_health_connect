package yj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyj1/j;", "", "", "isFilled", "userHasSeenScreen", "<init>", "(ZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f197554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197555b;

    public /* synthetic */ j(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f197554a == jVar.f197554a && this.f197555b == jVar.f197555b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197555b) + (Boolean.hashCode(this.f197554a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("MyInformationUiState(isFilled=", ", userHasSeenScreen=", ")", this.f197554a, this.f197555b);
    }

    public j(boolean z14, boolean z15) {
        this.f197554a = z14;
        this.f197555b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
