package sh0;

import gs1.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsh0/d;", "", "Lsh0/c;", "dailyChartDataDTO", "Lgs1/t;", "dailyTimelineDTO", "Lzk0/h;", "floorsGoal", "<init>", "(Lsh0/c;Lgs1/t;Lzk0/h;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f159292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f159293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f159294c;

    public /* synthetic */ d(c cVar, t tVar, h hVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : tVar, (i14 & 4) != 0 ? null : hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f159292a, dVar.f159292a) && s.g(this.f159293b, dVar.f159293b) && s.g(this.f159294c, dVar.f159294c);
    }

    public final int hashCode() {
        c cVar = this.f159292a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        t tVar = this.f159293b;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        h hVar = this.f159294c;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "FloorsDetails(dailyChartDataDTO=" + this.f159292a + ", dailyTimelineDTO=" + this.f159293b + ", floorsGoal=" + this.f159294c + ")";
    }

    public d(c cVar, t tVar, h hVar) {
        this.f159292a = cVar;
        this.f159293b = tVar;
        this.f159294c = hVar;
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
