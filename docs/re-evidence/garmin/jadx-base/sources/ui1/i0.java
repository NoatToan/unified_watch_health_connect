package ui1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lui1/i0;", "", "Lui1/j;", "action", "", "directActivationCapableDevice", "hasActiveSubscription", "<init>", "(Lui1/j;ZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f171293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f171294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f171295c;

    public i0(j jVar, boolean z14, boolean z15) {
        jVar.getClass();
        this.f171293a = jVar;
        this.f171294b = z14;
        this.f171295c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f171293a == i0Var.f171293a && this.f171294b == i0Var.f171294b && this.f171295c == i0Var.f171295c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f171295c) + q6.f.g(this.f171293a.hashCode() * 31, 31, this.f171294b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubscriptionDestinationResult(action=");
        sb3.append(this.f171293a);
        sb3.append(", directActivationCapableDevice=");
        sb3.append(this.f171294b);
        sb3.append(", hasActiveSubscription=");
        return hb.a.k(sb3, this.f171295c, ")");
    }
}
