package ep0;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lep0/z;", "", "", "hasRequiredSectionsForHistoricalDataTurnedOff", "canHideSection", "Li53/c;", "Lep0/y;", "stats", "Lyz1/d;", "status", "<init>", "(ZZLi53/c;Lyz1/d;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f64915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<y> f64917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yz1.d f64918d;

    public z(boolean z14, boolean z15, i53.c<y> cVar, yz1.d dVar) {
        cVar.getClass();
        dVar.getClass();
        this.f64915a = z14;
        this.f64916b = z15;
        this.f64917c = cVar;
        this.f64918d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f64915a == zVar.f64915a && this.f64916b == zVar.f64916b && this.f64917c.equals(zVar.f64917c) && this.f64918d.equals(zVar.f64918d);
    }

    public final int hashCode() {
        return this.f64918d.hashCode() + l2.a(this.f64917c, q6.f.g(Boolean.hashCode(this.f64915a) * 31, 31, this.f64916b), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("LastSevenDaysStats(hasRequiredSectionsForHistoricalDataTurnedOff=", ", canHideSection=", ", stats=", this.f64915a, this.f64916b);
        sbM.append(this.f64917c);
        sbM.append(", status=");
        sbM.append(this.f64918d);
        sbM.append(")");
        return sbM.toString();
    }
}
