package g21;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg21/d;", "", "Lg21/v;", "selectedOverlay", "", "availableOverlayData", "<init>", "(Lg21/v;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f75405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<v> f75406b;

    public /* synthetic */ d(v vVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : vVar, (i14 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f75405a == dVar.f75405a && p005kotlin.jvm.internal.s.g(this.f75406b, dVar.f75406b);
    }

    public final int hashCode() {
        v vVar = this.f75405a;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        List<v> list = this.f75406b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CaloriesOverlayData(selectedOverlay=" + this.f75405a + ", availableOverlayData=" + this.f75406b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(v vVar, List<? extends v> list) {
        this.f75405a = vVar;
        this.f75406b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
