package ab1;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lab1/n;", "", "", FirebaseAnalytics.Param.INDEX, "", "distance", "", "time", "targetPower", "avgGrade", "percentFTP", "elevationChange", "<init>", "(IDFIDID)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f2613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f2616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f2618g;

    public n(int i14, double d14, float f14, int i15, double d15, int i16, double d16) {
        this.f2612a = i14;
        this.f2613b = d14;
        this.f2614c = f14;
        this.f2615d = i15;
        this.f2616e = d15;
        this.f2617f = i16;
        this.f2618g = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f2612a == nVar.f2612a && Double.compare(this.f2613b, nVar.f2613b) == 0 && Float.compare(this.f2614c, nVar.f2614c) == 0 && this.f2615d == nVar.f2615d && Double.compare(this.f2616e, nVar.f2616e) == 0 && this.f2617f == nVar.f2617f && Double.compare(this.f2618g, nVar.f2618g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2618g) + q2.d(this.f2617f, org.apache.commons.lang3.e.b(q2.d(this.f2615d, q6.f.d(this.f2614c, org.apache.commons.lang3.e.b(Integer.hashCode(this.f2612a) * 31, 31, this.f2613b), 31), 31), 31, this.f2616e), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SplitAdapterItem(index=");
        sb3.append(this.f2612a);
        sb3.append(", distance=");
        sb3.append(this.f2613b);
        sb3.append(", time=");
        sb3.append(this.f2614c);
        sb3.append(", targetPower=");
        sb3.append(this.f2615d);
        am.j.x(sb3, ", avgGrade=", this.f2616e, ", percentFTP=");
        sb3.append(this.f2617f);
        sb3.append(", elevationChange=");
        sb3.append(this.f2618g);
        sb3.append(")");
        return sb3.toString();
    }
}
