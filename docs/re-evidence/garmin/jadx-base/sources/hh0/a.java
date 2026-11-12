package hh0;

import dh0.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.h;
import yz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lhh0/a;", "", "Lyz1/d;", "status", "", "fitnessAge", "achievableFitnessAge", "", "chronologicalAge", "", "lastUpdated", "", "hasStaleMetrics", "Ldh0/f;", "invalidReason", "<init>", "(Lyz1/d;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;ZLdh0/f;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f83731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f83732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f83733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f83735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f83736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f83737g;

    public a(d dVar, Double d14, Double d15, int i14, String str, boolean z14, f fVar) {
        dVar.getClass();
        this.f83731a = dVar;
        this.f83732b = d14;
        this.f83733c = d15;
        this.f83734d = i14;
        this.f83735e = str;
        this.f83736f = z14;
        this.f83737g = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f83731a, aVar.f83731a) && s.g(this.f83732b, aVar.f83732b) && s.g(this.f83733c, aVar.f83733c) && this.f83734d == aVar.f83734d && s.g(this.f83735e, aVar.f83735e) && this.f83736f == aVar.f83736f && s.g(this.f83737g, aVar.f83737g);
    }

    public final int hashCode() {
        int iHashCode = this.f83731a.hashCode() * 31;
        Double d14 = this.f83732b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f83733c;
        int iD = q2.d(this.f83734d, (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31, 31);
        String str = this.f83735e;
        int iG = q6.f.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f83736f);
        f fVar = this.f83737g;
        return iG + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FitnessAgeCardData(status=");
        sb3.append(this.f83731a);
        sb3.append(", fitnessAge=");
        sb3.append(this.f83732b);
        sb3.append(", achievableFitnessAge=");
        sb3.append(this.f83733c);
        sb3.append(", chronologicalAge=");
        sb3.append(this.f83734d);
        sb3.append(", lastUpdated=");
        h.C(this.f83735e, ", hasStaleMetrics=", ", invalidReason=", sb3, this.f83736f);
        sb3.append(this.f83737g);
        sb3.append(")");
        return sb3.toString();
    }

    public /* synthetic */ a(d dVar, Double d14, Double d15, int i14, String str, boolean z14, f fVar, int i15, j jVar) {
        this(dVar, d14, d15, i14, str, (i15 & 32) != 0 ? false : z14, fVar);
    }
}
