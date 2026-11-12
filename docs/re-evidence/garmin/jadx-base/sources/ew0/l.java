package ew0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lew0/l;", "", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "dataLoaded", "<init>", "(ZZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66232c;

    public /* synthetic */ l(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static l a(l lVar, boolean z14, boolean z15, int i14) {
        if ((i14 & 2) != 0) {
            z15 = lVar.f66231b;
        }
        boolean z16 = (i14 & 4) != 0 ? lVar.f66232c : true;
        lVar.getClass();
        return new l(z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f66230a == lVar.f66230a && this.f66231b == lVar.f66231b && this.f66232c == lVar.f66232c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66232c) + q6.f.g(Boolean.hashCode(this.f66230a) * 31, 31, this.f66231b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("LifestyleLoggingOnboardingInitUiState(loading=", ", error=", ", dataLoaded=", this.f66230a, this.f66231b), this.f66232c, ")");
    }

    public l(boolean z14, boolean z15, boolean z16) {
        this.f66230a = z14;
        this.f66231b = z15;
        this.f66232c = z16;
    }

    public l() {
        this(false, false, false, 7, null);
    }
}
