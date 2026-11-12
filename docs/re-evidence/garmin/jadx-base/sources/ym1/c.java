package ym1;

import c22.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lym1/c;", "", "", "Lym1/d;", "sleepDurationValues", "Lym1/g;", "sleepNeedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f198109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f198110b;

    public /* synthetic */ c(List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f198109a, cVar.f198109a) && s.g(this.f198110b, cVar.f198110b);
    }

    public final int hashCode() {
        List<d> list = this.f198109a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<g> list2 = this.f198110b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return t.f("SleepDurationSummaryChartData(sleepDurationValues=", ", sleepNeedValues=", ")", this.f198109a, this.f198110b);
    }

    public c(List<d> list, List<g> list2) {
        this.f198109a = list;
        this.f198110b = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
