package sp0;

import b71.i;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsp0/b;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "hydrationValue", "goalValue", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f160505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f160506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f160507c;

    public /* synthetic */ b(LocalDate localDate, Double d14, Double d15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f160505a, bVar.f160505a) && s.g(this.f160506b, bVar.f160506b) && s.g(this.f160507c, bVar.f160507c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f160505a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Double d14 = this.f160506b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f160507c;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HydrationChartEntry(calendarDate=");
        sb3.append(this.f160505a);
        sb3.append(", hydrationValue=");
        sb3.append(this.f160506b);
        sb3.append(", goalValue=");
        return i.g(sb3, this.f160507c, ")");
    }

    public b(LocalDate localDate, Double d14, Double d15) {
        this.f160505a = localDate;
        this.f160506b = d14;
        this.f160507c = d15;
    }

    public b() {
        this(null, null, null, 7, null);
    }
}
