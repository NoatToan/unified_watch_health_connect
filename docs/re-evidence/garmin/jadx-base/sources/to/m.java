package to;

import c22.t;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lto/m;", "", "", "frontGearTeeth", "rearGearTeeth", "", "timeInGearSeconds", "gearRatio", "", "percent", "<init>", "(IIFFD)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f165819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f165820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f165821e;

    public m(int i14, int i15, float f14, float f15, double d14) {
        this.f165817a = i14;
        this.f165818b = i15;
        this.f165819c = f14;
        this.f165820d = f15;
        this.f165821e = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f165817a == mVar.f165817a && this.f165818b == mVar.f165818b && Float.compare(this.f165819c, mVar.f165819c) == 0 && Float.compare(this.f165820d, mVar.f165820d) == 0 && Double.compare(this.f165821e, mVar.f165821e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f165821e) + q6.f.d(this.f165820d, q6.f.d(this.f165819c, q2.d(this.f165818b, Integer.hashCode(this.f165817a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f165817a, this.f165818b, "TimeInGearModel(frontGearTeeth=", ", rearGearTeeth=", ", timeInGearSeconds=");
        l2.n(sbJ, this.f165819c, ", gearRatio=", this.f165820d, ", percent=");
        return t.d(this.f165821e, ")", sbJ);
    }
}
