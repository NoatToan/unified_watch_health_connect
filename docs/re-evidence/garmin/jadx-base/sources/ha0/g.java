package ha0;

import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.k0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lha0/g;", "", "", "isLoading", "", "Lha0/d$b;", "selectedItems", "foundItems", "", "Lha0/d$a;", "activityTypes", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/Map;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d.b> f82638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d.b> f82639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<d.a, List<d.b>> f82640d;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(boolean z14, List list, List list2, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? true : z14;
        list = (i14 & 2) != 0 ? j0.f134944a : list;
        list2 = (i14 & 4) != 0 ? j0.f134944a : list2;
        if ((i14 & 8) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(z14, list, list2, map);
    }

    public static g a(g gVar, List list, List list2, Map map, int i14) {
        boolean z14 = (i14 & 1) != 0 ? gVar.f82637a : false;
        if ((i14 & 2) != 0) {
            list = gVar.f82638b;
        }
        if ((i14 & 4) != 0) {
            list2 = gVar.f82639c;
        }
        if ((i14 & 8) != 0) {
            map = gVar.f82640d;
        }
        gVar.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        return new g(z14, list, list2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f82637a == gVar.f82637a && s.g(this.f82638b, gVar.f82638b) && s.g(this.f82639c, gVar.f82639c) && s.g(this.f82640d, gVar.f82640d);
    }

    public final int hashCode() {
        return this.f82640d.hashCode() + u0.b(u0.b(Boolean.hashCode(this.f82637a) * 31, 31, this.f82638b), 31, this.f82639c);
    }

    public final String toString() {
        return "SelectFavoriteActivitiesUiState(isLoading=" + this.f82637a + ", selectedItems=" + this.f82638b + ", foundItems=" + this.f82639c + ", activityTypes=" + this.f82640d + ")";
    }

    public g() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z14, List<d.b> list, List<d.b> list2, Map<d.a, ? extends List<d.b>> map) {
        list.getClass();
        list2.getClass();
        map.getClass();
        this.f82637a = z14;
        this.f82638b = list;
        this.f82639c = list2;
        this.f82640d = map;
    }
}
