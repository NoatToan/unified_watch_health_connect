package dy1;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ldy1/b;", "", "", "benchmarkId", "", "benchmarkWeight", "", "benchmarkWeightUnit", "", "benchmarkWeightMetric", "", "benchmarkReps", "estimatedBenchmarkWeight", "isEdited", "<init>", "(JLjava/lang/Double;Ljava/lang/String;ZILjava/lang/Double;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f61528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f61529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f61531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f61533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f61534g;

    public /* synthetic */ b(long j8, Double d14, String str, boolean z14, int i14, Double d15, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, d14, str, (i15 & 8) != 0 ? true : z14, i14, d15, (i15 & 64) != 0 ? false : z15);
    }

    public static b a(b bVar, Double d14, int i14, Double d15, boolean z14, int i15) {
        long j8 = bVar.f61528a;
        if ((i15 & 2) != 0) {
            d14 = bVar.f61529b;
        }
        Double d16 = d14;
        String str = bVar.f61530c;
        boolean z15 = bVar.f61531d;
        if ((i15 & 16) != 0) {
            i14 = bVar.f61532e;
        }
        return new b(j8, d16, str, z15, i14, d15, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f61528a == bVar.f61528a && p005kotlin.jvm.internal.s.g(this.f61529b, bVar.f61529b) && p005kotlin.jvm.internal.s.g(this.f61530c, bVar.f61530c) && this.f61531d == bVar.f61531d && this.f61532e == bVar.f61532e && p005kotlin.jvm.internal.s.g(this.f61533f, bVar.f61533f) && this.f61534g == bVar.f61534g;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f61528a) * 31;
        Double d14 = this.f61529b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f61530c;
        int iD = q2.d(this.f61532e, q6.f.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f61531d), 31);
        Double d15 = this.f61533f;
        return Boolean.hashCode(this.f61534g) + ((iD + (d15 != null ? d15.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BenchmarkOptionState(benchmarkId=");
        sb3.append(this.f61528a);
        sb3.append(", benchmarkWeight=");
        sb3.append(this.f61529b);
        com.airbnb.lottie.animation.keyframe.a.t(", benchmarkWeightUnit=", this.f61530c, ", benchmarkWeightMetric=", sb3, this.f61531d);
        sb3.append(", benchmarkReps=");
        sb3.append(this.f61532e);
        sb3.append(", estimatedBenchmarkWeight=");
        sb3.append(this.f61533f);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", isEdited=", this.f61534g, ")");
    }

    public b(long j8, Double d14, String str, boolean z14, int i14, Double d15, boolean z15) {
        this.f61528a = j8;
        this.f61529b = d14;
        this.f61530c = str;
        this.f61531d = z14;
        this.f61532e = i14;
        this.f61533f = d15;
        this.f61534g = z15;
    }
}
