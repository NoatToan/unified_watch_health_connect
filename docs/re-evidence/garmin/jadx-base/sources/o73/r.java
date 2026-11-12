package o73;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo73/r;", "", "", "", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f130775a;

    public r(List<String> list) {
        list.getClass();
        this.f130775a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f130775a.equals(((r) obj).f130775a);
    }

    public final int hashCode() {
        return this.f130775a.hashCode();
    }

    public final String toString() {
        return tn.k.h("Array(items=", ")", this.f130775a);
    }
}
