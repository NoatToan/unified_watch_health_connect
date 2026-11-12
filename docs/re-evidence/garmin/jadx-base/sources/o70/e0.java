package o70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo70/e0;", "", "Lx70/h;", "welcomeCardType", "", "isDismissed", "<init>", "(Lx70/h;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x70.h f129964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129965b;

    public e0(x70.h hVar, boolean z14) {
        hVar.getClass();
        this.f129964a = hVar;
        this.f129965b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f129964a == e0Var.f129964a && this.f129965b == e0Var.f129965b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129965b) + (this.f129964a.hashCode() * 31);
    }

    public final String toString() {
        return "WelcomeCardData(welcomeCardType=" + this.f129964a + ", isDismissed=" + this.f129965b + ")";
    }
}
