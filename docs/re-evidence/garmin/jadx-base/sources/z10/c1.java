package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz10/c1;", "", "", "isLoading", "isAccountSuspended", "isPendingReconsent", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f200930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f200931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f200932c;

    public /* synthetic */ c1(boolean z14, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2);
    }

    public static c1 a(c1 c1Var, boolean z14, Boolean bool, Boolean bool2, int i14) {
        if ((i14 & 1) != 0) {
            z14 = c1Var.f200930a;
        }
        if ((i14 & 2) != 0) {
            bool = c1Var.f200931b;
        }
        if ((i14 & 4) != 0) {
            bool2 = c1Var.f200932c;
        }
        c1Var.getClass();
        return new c1(z14, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f200930a == c1Var.f200930a && p005kotlin.jvm.internal.s.g(this.f200931b, c1Var.f200931b) && p005kotlin.jvm.internal.s.g(this.f200932c, c1Var.f200932c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f200930a) * 31;
        Boolean bool = this.f200931b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f200932c;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConsentUiState(isLoading=");
        sb3.append(this.f200930a);
        sb3.append(", isAccountSuspended=");
        sb3.append(this.f200931b);
        sb3.append(", isPendingReconsent=");
        return p6.b.f(sb3, this.f200932c, ")");
    }

    public c1(boolean z14, Boolean bool, Boolean bool2) {
        this.f200930a = z14;
        this.f200931b = bool;
        this.f200932c = bool2;
    }

    public c1() {
        this(false, null, null, 7, null);
    }
}
