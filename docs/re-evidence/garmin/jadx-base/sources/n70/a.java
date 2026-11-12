package n70;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln70/a;", "", "Li53/c;", "Lr70/a;", FirebaseAnalytics.Param.ITEMS, "", "startIndex", "<init>", "(Li53/c;I)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<r70.a> f123996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123997b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(i53.c<? extends r70.a> cVar, int i14) {
        cVar.getClass();
        this.f123996a = cVar;
        this.f123997b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f123996a.equals(aVar.f123996a) && this.f123997b == aVar.f123997b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123997b) + (this.f123996a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivitiesAndWorkoutsData(items=" + this.f123996a + ", startIndex=" + this.f123997b + ")";
    }
}
