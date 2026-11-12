package ue1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lue1/e;", "", "Lue1/c;", "latest", "", "Lue1/d;", "weeklyAggregates", "<init>", "(Lue1/c;Ljava/util/List;)V", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f170241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f170242b;

    public e(c cVar, List<d> list) {
        cVar.getClass();
        this.f170241a = cVar;
        this.f170242b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f170241a.equals(eVar.f170241a) && s.g(this.f170242b, eVar.f170242b);
    }

    public final int hashCode() {
        int iHashCode = this.f170241a.hashCode() * 31;
        List<d> list = this.f170242b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "RunningEconomyData(latest=" + this.f170241a + ", weeklyAggregates=" + this.f170242b + ")";
    }
}
