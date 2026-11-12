package h52;

import java.util.List;
import n23.j;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh52/e;", "", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "Lf52/a;", "summaryList", "", "xAxisLabels", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/List;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f82121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f82122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f52.a> f82123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f82124d;

    public e(LocalDate localDate, LocalDate localDate2, List<f52.a> list, List<String> list2) {
        localDate.getClass();
        localDate2.getClass();
        list2.getClass();
        this.f82121a = localDate;
        this.f82122b = localDate2;
        this.f82123c = list;
        this.f82124d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f82121a, eVar.f82121a) && s.g(this.f82122b, eVar.f82122b) && s.g(this.f82123c, eVar.f82123c) && s.g(this.f82124d, eVar.f82124d);
    }

    public final int hashCode() {
        int iHashCode = (this.f82122b.hashCode() + (this.f82121a.hashCode() * 31)) * 31;
        List<f52.a> list = this.f82123c;
        return this.f82124d.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PushesSummaryChartData(startDate=");
        sb3.append(this.f82121a);
        sb3.append(", endDate=");
        sb3.append(this.f82122b);
        sb3.append(", summaryList=");
        return j.j(sb3, this.f82123c, ", xAxisLabels=", this.f82124d, ")");
    }

    public e(LocalDate localDate, LocalDate localDate2, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(localDate, localDate2, list, (i14 & 8) != 0 ? j0.f134944a : list2);
    }
}
