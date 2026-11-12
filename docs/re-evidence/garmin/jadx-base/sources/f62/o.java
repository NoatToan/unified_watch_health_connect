package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf62/o;", "", "", "totalTime", "", "totalDistance", "Lm52/b;", "estimateType", "Lm52/j;", "estimatedDistanceUnit", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Lm52/b;Lm52/j;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f69291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f69292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m52.b f69293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m52.j f69294d;

    public o(Integer num, Double d14, m52.b bVar, m52.j jVar) {
        this.f69291a = num;
        this.f69292b = d14;
        this.f69293c = bVar;
        this.f69294d = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f69291a, oVar.f69291a) && p005kotlin.jvm.internal.s.g(this.f69292b, oVar.f69292b) && this.f69293c == oVar.f69293c && this.f69294d == oVar.f69294d;
    }

    public final int hashCode() {
        Integer num = this.f69291a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f69292b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        m52.b bVar = this.f69293c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        m52.j jVar = this.f69294d;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = lc.u0.m("TimeDistance(totalTime=", this.f69291a, ", totalDistance=", this.f69292b, ", estimateType=");
        sbM.append(this.f69293c);
        sbM.append(", estimatedDistanceUnit=");
        sbM.append(this.f69294d);
        sbM.append(")");
        return sbM.toString();
    }
}
