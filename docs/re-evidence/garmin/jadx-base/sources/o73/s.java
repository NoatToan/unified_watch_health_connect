package o73;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo73/s;", "", "", "Lp73/a;", "", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/Map;)V", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<p73.a, String> f130776a;

    public s(Map<p73.a, String> map) {
        map.getClass();
        this.f130776a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f130776a.equals(((s) obj).f130776a);
    }

    public final int hashCode() {
        return this.f130776a.hashCode();
    }

    public final String toString() {
        return "Plurals(items=" + this.f130776a + ")";
    }
}
