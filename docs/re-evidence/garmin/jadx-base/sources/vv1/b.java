package vv1;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvv1/b;", "", "", "Luv1/d;", "uiElements", "", "uiSubElements", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<uv1.d> f180506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<uv1.d, List<uv1.d>> f180507b;

    public /* synthetic */ b(List list, Map map, int i14, j jVar) {
        this(list, (i14 & 2) != 0 ? null : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f180506a, bVar.f180506a) && s.g(this.f180507b, bVar.f180507b);
    }

    public final int hashCode() {
        List<uv1.d> list = this.f180506a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<uv1.d, List<uv1.d>> map = this.f180507b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "FBTProgressReportDataModel(uiElements=" + this.f180506a + ", uiSubElements=" + this.f180507b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends uv1.d> list, Map<uv1.d, ? extends List<? extends uv1.d>> map) {
        this.f180506a = list;
        this.f180507b = map;
    }
}
