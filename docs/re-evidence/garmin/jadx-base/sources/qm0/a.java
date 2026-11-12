package qm0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqm0/a;", "", "", "activityId", "", "Lps/j;", "images", "<init>", "(JLjava/util/List;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f145470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ps.j> f145471b;

    public a(long j8, List<ps.j> list) {
        list.getClass();
        this.f145470a = j8;
        this.f145471b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f145470a == aVar.f145470a && this.f145471b.equals(aVar.f145471b);
    }

    public final int hashCode() {
        return this.f145471b.hashCode() + (Long.hashCode(this.f145470a) * 31);
    }

    public final String toString() {
        return "ActivityImageChangedEvent(activityId=" + this.f145470a + ", images=" + this.f145471b + ")";
    }
}
