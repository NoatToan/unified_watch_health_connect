package wm1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwm1/d;", "", "", "Lwm1/a;", "sleepIntensityMinutesValues", "", "averageDailyTotal", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f186065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f186066b;

    public /* synthetic */ d(List list, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f186065a, dVar.f186065a) && s.g(this.f186066b, dVar.f186066b);
    }

    public final int hashCode() {
        List<a> list = this.f186065a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f186066b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SleepIntensityMinutesSummaryChartData(sleepIntensityMinutesValues=" + this.f186065a + ", averageDailyTotal=" + this.f186066b + ")";
    }

    public d(List<a> list, Integer num) {
        this.f186065a = list;
        this.f186066b = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
