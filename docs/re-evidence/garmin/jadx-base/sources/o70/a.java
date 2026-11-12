package o70;

import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo70/a;", "", "", "", "jsonData", "Lorg/joda/time/LocalDate;", "filterDate", "<init>", "(Ljava/util/List;Lorg/joda/time/LocalDate;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f129910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f129911b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(List list, LocalDate localDate, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            localDate = LocalDate.now();
            localDate.getClass();
        }
        this(list, localDate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f129910a, aVar.f129910a) && p005kotlin.jvm.internal.s.g(this.f129911b, aVar.f129911b);
    }

    public final int hashCode() {
        return this.f129911b.hashCode() + (this.f129910a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivitiesWorkoutsData(jsonData=" + this.f129910a + ", filterDate=" + this.f129911b + ")";
    }

    public a(List<String> list, LocalDate localDate) {
        list.getClass();
        localDate.getClass();
        this.f129910a = list;
        this.f129911b = localDate;
    }
}
