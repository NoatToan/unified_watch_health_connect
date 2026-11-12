package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ldy1/d;", "", "Lmx1/a;", "benchmarkType", "", "isBarbell", "Ldy1/b;", "barbellBenchmarkOptionState", "dumbbellBenchmarkOptionState", "", "activityId", "", "previousValue", "pendingValue", "<init>", "(Lmx1/a;ZLdy1/b;Ldy1/b;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx1.a f61540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f61541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f61542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f61543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f61544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f61545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f61546g;

    public /* synthetic */ d(mx1.a aVar, boolean z14, b bVar, b bVar2, Long l14, Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, z14, bVar, bVar2, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : d15);
    }

    public static d a(d dVar, boolean z14, b bVar, b bVar2, int i14) {
        mx1.a aVar = dVar.f61540a;
        if ((i14 & 2) != 0) {
            z14 = dVar.f61541b;
        }
        boolean z15 = z14;
        if ((i14 & 4) != 0) {
            bVar = dVar.f61542c;
        }
        b bVar3 = bVar;
        if ((i14 & 8) != 0) {
            bVar2 = dVar.f61543d;
        }
        b bVar4 = bVar2;
        Long l14 = dVar.f61544e;
        Double d14 = (i14 & 32) != 0 ? dVar.f61545f : null;
        Double d15 = dVar.f61546g;
        dVar.getClass();
        aVar.getClass();
        return new d(aVar, z15, bVar3, bVar4, l14, d14, d15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f61540a == dVar.f61540a && this.f61541b == dVar.f61541b && p005kotlin.jvm.internal.s.g(this.f61542c, dVar.f61542c) && p005kotlin.jvm.internal.s.g(this.f61543d, dVar.f61543d) && p005kotlin.jvm.internal.s.g(this.f61544e, dVar.f61544e) && p005kotlin.jvm.internal.s.g(this.f61545f, dVar.f61545f) && p005kotlin.jvm.internal.s.g(this.f61546g, dVar.f61546g);
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f61540a.hashCode() * 31, 31, this.f61541b);
        b bVar = this.f61542c;
        int iHashCode = (iG + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f61543d;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Long l14 = this.f61544e;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d14 = this.f61545f;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f61546g;
        return iHashCode4 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BenchmarkState(benchmarkType=");
        sb3.append(this.f61540a);
        sb3.append(", isBarbell=");
        sb3.append(this.f61541b);
        sb3.append(", barbellBenchmarkOptionState=");
        sb3.append(this.f61542c);
        sb3.append(", dumbbellBenchmarkOptionState=");
        sb3.append(this.f61543d);
        sb3.append(", activityId=");
        sb3.append(this.f61544e);
        sb3.append(", previousValue=");
        sb3.append(this.f61545f);
        sb3.append(", pendingValue=");
        return b71.i.g(sb3, this.f61546g, ")");
    }

    public d(mx1.a aVar, boolean z14, b bVar, b bVar2, Long l14, Double d14, Double d15) {
        aVar.getClass();
        this.f61540a = aVar;
        this.f61541b = z14;
        this.f61542c = bVar;
        this.f61543d = bVar2;
        this.f61544e = l14;
        this.f61545f = d14;
        this.f61546g = d15;
    }
}
