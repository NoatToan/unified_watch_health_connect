package pt;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpt/d;", "", "", "blueY", "whiteY", "centerY", "rangeScale", "<init>", "(FFFF)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f140563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f140564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f140565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f140566d;

    public d(float f14, float f15, float f16, float f17) {
        this.f140563a = f14;
        this.f140564b = f15;
        this.f140565c = f16;
        this.f140566d = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f140563a, dVar.f140563a) == 0 && Float.compare(this.f140564b, dVar.f140564b) == 0 && Float.compare(this.f140565c, dVar.f140565c) == 0 && Float.compare(this.f140566d, dVar.f140566d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f140566d) + q6.f.d(this.f140565c, q6.f.d(this.f140564b, Float.hashCode(this.f140563a) * 31, 31), 31);
    }

    public final String toString() {
        float f14 = this.f140563a;
        float f15 = this.f140564b;
        float f16 = this.f140565c;
        float f17 = this.f140566d;
        StringBuilder sbI = e0.i("BodyBatteryPosition(blueY=", f14, ", whiteY=", f15, ", centerY=");
        sbI.append(f16);
        sbI.append(", rangeScale=");
        sbI.append(f17);
        sbI.append(")");
        return sbI.toString();
    }
}
