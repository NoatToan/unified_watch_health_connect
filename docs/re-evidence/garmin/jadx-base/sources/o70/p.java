package o70;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo70/p;", "", "", "selectedItem", "", "Lr70/s;", FirebaseAnalytics.Param.ITEMS, "", "itemsType", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f130051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<r70.s> f130052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f130053c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(int i14, List<? extends r70.s> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.f130051a = i14;
        this.f130052b = list;
        this.f130053c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f130051a == pVar.f130051a && this.f130052b.equals(pVar.f130052b) && this.f130053c.equals(pVar.f130053c);
    }

    public final int hashCode() {
        return this.f130053c.hashCode() + u0.b(Integer.hashCode(this.f130051a) * 31, 31, this.f130052b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("KeyStatsItems(selectedItem=");
        sb3.append(this.f130051a);
        sb3.append(", items=");
        sb3.append(this.f130052b);
        sb3.append(", itemsType=");
        return u62.z.c(sb3, this.f130053c, ")");
    }
}
