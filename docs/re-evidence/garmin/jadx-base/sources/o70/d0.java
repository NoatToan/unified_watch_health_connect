package o70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo70/d0;", "", "Lj70/r;", "focusType", "", "Lj70/y;", "suggestedFocuses", "<init>", "(Lj70/r;Ljava/util/List;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.r f129949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j70.y> f129950b;

    public d0(j70.r rVar, List<j70.y> list) {
        rVar.getClass();
        list.getClass();
        this.f129949a = rVar;
        this.f129950b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f129949a == d0Var.f129949a && this.f129950b.equals(d0Var.f129950b);
    }

    public final int hashCode() {
        return this.f129950b.hashCode() + (this.f129949a.hashCode() * 31);
    }

    public final String toString() {
        return "UserFocusInfo(focusType=" + this.f129949a + ", suggestedFocuses=" + this.f129950b + ")";
    }
}
