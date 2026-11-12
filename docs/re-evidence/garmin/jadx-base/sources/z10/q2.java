package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz10/q2;", "", "", "isLoading", "onConsentGranted", "isConsentGranted", "Ls92/g;", "consentText", "isError", "<init>", "(ZLjava/lang/Boolean;ZLs92/g;Ljava/lang/Boolean;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f201218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f201219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s92.g f201221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f201222e;

    public /* synthetic */ q2(boolean z14, Boolean bool, boolean z15, s92.g gVar, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? null : gVar, (i14 & 16) != 0 ? null : bool2);
    }

    public static q2 a(q2 q2Var, boolean z14, Boolean bool, boolean z15, s92.g gVar, Boolean bool2, int i14) {
        if ((i14 & 2) != 0) {
            bool = q2Var.f201219b;
        }
        Boolean bool3 = bool;
        if ((i14 & 4) != 0) {
            z15 = q2Var.f201220c;
        }
        boolean z16 = z15;
        if ((i14 & 8) != 0) {
            gVar = q2Var.f201221d;
        }
        s92.g gVar2 = gVar;
        if ((i14 & 16) != 0) {
            bool2 = q2Var.f201222e;
        }
        q2Var.getClass();
        return new q2(z14, bool3, z16, gVar2, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f201218a == q2Var.f201218a && p005kotlin.jvm.internal.s.g(this.f201219b, q2Var.f201219b) && this.f201220c == q2Var.f201220c && p005kotlin.jvm.internal.s.g(this.f201221d, q2Var.f201221d) && p005kotlin.jvm.internal.s.g(this.f201222e, q2Var.f201222e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f201218a) * 31;
        Boolean bool = this.f201219b;
        int iG = q6.f.g((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f201220c);
        s92.g gVar = this.f201221d;
        int iHashCode2 = (iG + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool2 = this.f201222e;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PrivacyPolicyUiState(isLoading=");
        sb3.append(this.f201218a);
        sb3.append(", onConsentGranted=");
        sb3.append(this.f201219b);
        sb3.append(", isConsentGranted=");
        sb3.append(this.f201220c);
        sb3.append(", consentText=");
        sb3.append(this.f201221d);
        sb3.append(", isError=");
        return p6.b.f(sb3, this.f201222e, ")");
    }

    public q2(boolean z14, Boolean bool, boolean z15, s92.g gVar, Boolean bool2) {
        this.f201218a = z14;
        this.f201219b = bool;
        this.f201220c = z15;
        this.f201221d = gVar;
        this.f201222e = bool2;
    }

    public q2() {
        this(false, null, false, null, null, 31, null);
    }
}
