package xm1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxm1/c;", "", "", "Lxm1/e;", "sleepConsistencyValues", "", "averageWakeTime", "averageBedtime", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f191497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f191498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f191499c;

    public c(List<e> list, Long l14, Long l15) {
        this.f191497a = list;
        this.f191498b = l14;
        this.f191499c = l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f191497a, cVar.f191497a) && s.g(this.f191498b, cVar.f191498b) && s.g(this.f191499c, cVar.f191499c);
    }

    public final int hashCode() {
        List<e> list = this.f191497a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l14 = this.f191498b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f191499c;
        return iHashCode2 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SleepConsistencySummaryChartData(sleepConsistencyValues=");
        sb3.append(this.f191497a);
        sb3.append(", averageWakeTime=");
        sb3.append(this.f191498b);
        sb3.append(", averageBedtime=");
        return p6.b.g(sb3, this.f191499c, ")");
    }

    public /* synthetic */ c(List list, Long l14, Long l15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, l14, l15);
    }
}
