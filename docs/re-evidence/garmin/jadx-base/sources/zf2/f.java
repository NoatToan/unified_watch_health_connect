package zf2;

import am.j;
import ds.e0;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzf2/f;", "", "", "zone1Floor", "zone2Floor", "zone3Floor", "zone4Floor", "zone5Floor", "<init>", "(IIIII)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f204642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f204644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f204645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f204646e;

    public f(int i14, int i15, int i16, int i17, int i18) {
        this.f204642a = i14;
        this.f204643b = i15;
        this.f204644c = i16;
        this.f204645d = i17;
        this.f204646e = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f204642a == fVar.f204642a && this.f204643b == fVar.f204643b && this.f204644c == fVar.f204644c && this.f204645d == fVar.f204645d && this.f204646e == fVar.f204646e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f204646e) + q2.d(this.f204645d, q2.d(this.f204644c, q2.d(this.f204643b, Integer.hashCode(this.f204642a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f204642a, this.f204643b, "HeartRateZones(zone1Floor=", ", zone2Floor=", ", zone3Floor=");
        e0.m(this.f204644c, this.f204645d, ", zone4Floor=", ", zone5Floor=", sbJ);
        return j.q(sbJ, this.f204646e, ")");
    }
}
