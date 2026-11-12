package aa0;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Laa0/j;", "", "", "", "", "Lhv/j;", "groups", "staticImage", "<init>", "(Ljava/util/Map;I)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, List<hv.j>> f2214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2215b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map<Integer, ? extends List<hv.j>> map, int i14) {
        map.getClass();
        this.f2214a = map;
        this.f2215b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f2214a.equals(jVar.f2214a) && this.f2215b == jVar.f2215b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2215b) + (this.f2214a.hashCode() * 31);
    }

    public final String toString() {
        return "ParsedAnimationData(groups=" + this.f2214a + ", staticImage=" + this.f2215b + ")";
    }
}
