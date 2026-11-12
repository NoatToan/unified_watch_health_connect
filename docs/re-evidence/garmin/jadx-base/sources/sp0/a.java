package sp0;

import java.util.List;
import n23.j;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsp0/a;", "", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "Lsp0/b;", "summaryList", "", "xAxisLabels", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/List;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f160501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f160503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f160504d;

    public a(LocalDate localDate, LocalDate localDate2, List<b> list, List<String> list2) {
        localDate.getClass();
        localDate2.getClass();
        list2.getClass();
        this.f160501a = localDate;
        this.f160502b = localDate2;
        this.f160503c = list;
        this.f160504d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f160501a, aVar.f160501a) && s.g(this.f160502b, aVar.f160502b) && s.g(this.f160503c, aVar.f160503c) && s.g(this.f160504d, aVar.f160504d);
    }

    public final int hashCode() {
        int iHashCode = (this.f160502b.hashCode() + (this.f160501a.hashCode() * 31)) * 31;
        List<b> list = this.f160503c;
        return this.f160504d.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HydrationChartData(startDate=");
        sb3.append(this.f160501a);
        sb3.append(", endDate=");
        sb3.append(this.f160502b);
        sb3.append(", summaryList=");
        return j.j(sb3, this.f160503c, ", xAxisLabels=", this.f160504d, ")");
    }

    public a(LocalDate localDate, LocalDate localDate2, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(localDate, localDate2, list, (i14 & 8) != 0 ? j0.f134944a : list2);
    }
}
