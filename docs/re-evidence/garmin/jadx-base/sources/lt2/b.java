package lt2;

import ds.e0;
import mt2.i;
import mt2.j;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Llt2/b;", "", "Lmt2/i;", "targetType", "", "targetValueOne", "targetValueTwo", "Lmt2/j;", "targetValueUnit", "", "powerCurveDuration", "powerCurveScale", "powerCurveRange", "zoneNumber", "<init>", "(Lmt2/i;DDLmt2/j;IIII)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f114870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f114871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f114872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f114873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f114874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f114875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f114876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f114877h;

    public /* synthetic */ b(i iVar, double d14, double d15, j jVar, int i14, int i15, int i16, int i17, int i18, p005kotlin.jvm.internal.j jVar2) {
        this(iVar, (i18 & 2) != 0 ? 0.0d : d14, (i18 & 4) != 0 ? 0.0d : d15, (i18 & 8) != 0 ? null : jVar, (i18 & 16) != 0 ? -1 : i14, (i18 & 32) != 0 ? -1 : i15, (i18 & 64) != 0 ? -1 : i16, (i18 & 128) != 0 ? 0 : i17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f114870a == bVar.f114870a && Double.compare(this.f114871b, bVar.f114871b) == 0 && Double.compare(this.f114872c, bVar.f114872c) == 0 && this.f114873d == bVar.f114873d && this.f114874e == bVar.f114874e && this.f114875f == bVar.f114875f && this.f114876g == bVar.f114876g && this.f114877h == bVar.f114877h;
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(this.f114870a.hashCode() * 31, 31, this.f114871b), 31, this.f114872c);
        j jVar = this.f114873d;
        return Integer.hashCode(this.f114877h) + q2.d(this.f114876g, q2.d(this.f114875f, q2.d(this.f114874e, (iB + (jVar == null ? 0 : jVar.hashCode())) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CommonIntensityTarget(targetType=");
        sb3.append(this.f114870a);
        sb3.append(", targetValueOne=");
        sb3.append(this.f114871b);
        am.j.x(sb3, ", targetValueTwo=", this.f114872c, ", targetValueUnit=");
        sb3.append(this.f114873d);
        sb3.append(", powerCurveDuration=");
        sb3.append(this.f114874e);
        sb3.append(", powerCurveScale=");
        e0.m(this.f114875f, this.f114876g, ", powerCurveRange=", ", zoneNumber=", sb3);
        return am.j.q(sb3, this.f114877h, ")");
    }

    public b(i iVar, double d14, double d15, j jVar, int i14, int i15, int i16, int i17) {
        iVar.getClass();
        this.f114870a = iVar;
        this.f114871b = d14;
        this.f114872c = d15;
        this.f114873d = jVar;
        this.f114874e = i14;
        this.f114875f = i15;
        this.f114876g = i16;
        this.f114877h = i17;
    }
}
