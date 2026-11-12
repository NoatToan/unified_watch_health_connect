package o70;

import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo70/q;", "", "", "Lpb2/a$d;", "data", "Lorg/joda/time/LocalDate;", "filterDate", "<init>", "(Ljava/util/List;Lorg/joda/time/LocalDate;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<pb2.a.d> f130054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f130055b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(List list, LocalDate localDate, int i14, p005kotlin.jvm.internal.j jVar) {
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
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f130054a, qVar.f130054a) && p005kotlin.jvm.internal.s.g(this.f130055b, qVar.f130055b);
    }

    public final int hashCode() {
        return this.f130055b.hashCode() + (this.f130054a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingActivitiesData(data=" + this.f130054a + ", filterDate=" + this.f130055b + ")";
    }

    public q(List<pb2.a.d> list, LocalDate localDate) {
        list.getClass();
        localDate.getClass();
        this.f130054a = list;
        this.f130055b = localDate;
    }
}
