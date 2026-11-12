package ew0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lew0/i;", "", "", "loading", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onboardingCompleted", "<init>", "(ZZLjava/lang/Boolean;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f66223c;

    public /* synthetic */ i(boolean z14, boolean z15, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : bool);
    }

    public static i a(i iVar, boolean z14, boolean z15, Boolean bool, int i14) {
        if ((i14 & 2) != 0) {
            z15 = iVar.f66222b;
        }
        if ((i14 & 4) != 0) {
            bool = iVar.f66223c;
        }
        iVar.getClass();
        return new i(z14, z15, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f66221a == iVar.f66221a && this.f66222b == iVar.f66222b && p005kotlin.jvm.internal.s.g(this.f66223c, iVar.f66223c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f66221a) * 31, 31, this.f66222b);
        Boolean bool = this.f66223c;
        return iG + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return p6.b.f(com.airbnb.lottie.animation.keyframe.a.m("LifestyleLoggingOnboardingCheckUiState(loading=", ", error=", ", onboardingCompleted=", this.f66221a, this.f66222b), this.f66223c, ")");
    }

    public i(boolean z14, boolean z15, Boolean bool) {
        this.f66221a = z14;
        this.f66222b = z15;
        this.f66223c = bool;
    }

    public i() {
        this(false, false, null, 7, null);
    }
}
