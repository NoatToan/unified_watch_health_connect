package ep0;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lep0/e0;", "", "", "hasRequiredSectionsForHistoricalDataTurnedOff", "canHideSection", "Li53/c;", "Lep0/d0;", "stats", "Lyz1/d;", "status", "<init>", "(ZZLi53/c;Lyz1/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f64877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<d0> f64879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yz1.d f64880d;

    public e0(boolean z14, boolean z15, i53.c<d0> cVar, yz1.d dVar) {
        cVar.getClass();
        dVar.getClass();
        this.f64877a = z14;
        this.f64878b = z15;
        this.f64879c = cVar;
        this.f64880d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f64877a == e0Var.f64877a && this.f64878b == e0Var.f64878b && this.f64879c.equals(e0Var.f64879c) && this.f64880d.equals(e0Var.f64880d);
    }

    public final int hashCode() {
        return this.f64880d.hashCode() + l2.a(this.f64879c, q6.f.g(Boolean.hashCode(this.f64877a) * 31, 31, this.f64878b), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("YesterdayStats(hasRequiredSectionsForHistoricalDataTurnedOff=", ", canHideSection=", ", stats=", this.f64877a, this.f64878b);
        sbM.append(this.f64879c);
        sbM.append(", status=");
        sbM.append(this.f64880d);
        sbM.append(")");
        return sbM.toString();
    }
}
