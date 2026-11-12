package ew0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew0/d0;", "", "", "behaviourSelectionLimitReached", "isAutoLoggingEnabled", "<init>", "(ZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66201b;

    public /* synthetic */ d0(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? true : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f66200a == d0Var.f66200a && this.f66201b == d0Var.f66201b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66201b) + (Boolean.hashCode(this.f66200a) * 31);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.e("LifestyleLoggingSelectBehavioursUiState(behaviourSelectionLimitReached=", ", isAutoLoggingEnabled=", ")", this.f66200a, this.f66201b);
    }

    public d0(boolean z14, boolean z15) {
        this.f66200a = z14;
        this.f66201b = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0() {
        boolean z14 = false;
        this(z14, z14, 3, null);
    }
}
