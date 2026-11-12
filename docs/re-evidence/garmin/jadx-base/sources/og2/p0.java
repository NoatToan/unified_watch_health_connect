package og2;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Log2/p0;", "", "", FirebaseAnalytics.Param.LOCATION, "value", "<init>", "(FF)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f132071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f132072b;

    public p0(float f14, float f15) {
        this.f132071a = f14;
        this.f132072b = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Float.compare(this.f132071a, p0Var.f132071a) == 0 && Float.compare(this.f132072b, p0Var.f132072b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f132072b) + (Float.hashCode(this.f132071a) * 31);
    }

    public final String toString() {
        return am.j.l("YAxisLabelValue(location=", this.f132071a, ", value=", this.f132072b, ")");
    }
}
