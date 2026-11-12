package ew0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lew0/q;", "", "", "loading", "savingError", "saveCompleted", "<init>", "(ZZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66270c;

    public /* synthetic */ q(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static q a(q qVar, boolean z14, boolean z15, int i14) {
        if ((i14 & 2) != 0) {
            z15 = qVar.f66269b;
        }
        boolean z16 = (i14 & 4) != 0 ? qVar.f66270c : true;
        qVar.getClass();
        return new q(z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f66268a == qVar.f66268a && this.f66269b == qVar.f66269b && this.f66270c == qVar.f66270c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66270c) + q6.f.g(Boolean.hashCode(this.f66268a) * 31, 31, this.f66269b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("LifestyleLoggingSaveSetupUiState(loading=", ", savingError=", ", saveCompleted=", this.f66268a, this.f66269b), this.f66270c, ")");
    }

    public q(boolean z14, boolean z15, boolean z16) {
        this.f66268a = z14;
        this.f66269b = z15;
        this.f66270c = z16;
    }

    public q() {
        this(false, false, false, 7, null);
    }
}
