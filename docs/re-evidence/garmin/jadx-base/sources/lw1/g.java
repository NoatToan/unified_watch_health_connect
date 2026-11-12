package lw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llw1/g;", "", "Lkw1/h;", "planSportType", "", "requiresGCPlus", "<init>", "(Lkw1/h;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kw1.h f115119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115120b;

    public g(kw1.h hVar, boolean z14) {
        hVar.getClass();
        this.f115119a = hVar;
        this.f115120b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f115119a == gVar.f115119a && this.f115120b == gVar.f115120b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115120b) + (this.f115119a.hashCode() * 31);
    }

    public final String toString() {
        return "PlanSportTypeInfo(planSportType=" + this.f115119a + ", requiresGCPlus=" + this.f115120b + ")";
    }
}
