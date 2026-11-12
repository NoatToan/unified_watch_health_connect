package o70;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo70/h;", "", "", "Lr70/s;", FirebaseAnalytics.Param.ITEMS, "", "loading", "<init>", "(Ljava/util/List;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<r70.s> f129996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129997b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends r70.s> list, boolean z14) {
        list.getClass();
        this.f129996a = list;
        this.f129997b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f129996a.equals(hVar.f129996a) && this.f129997b == hVar.f129997b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129997b) + (this.f129996a.hashCode() * 31);
    }

    public final String toString() {
        return "EssentialsItems(items=" + this.f129996a + ", loading=" + this.f129997b + ")";
    }
}
