package o70;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo70/c0;", "", "", "canHideSection", "Lyz1/d;", "status", "", "Lr70/s;", FirebaseAnalytics.Param.ITEMS, "<init>", "(ZLyz1/d;Ljava/util/List;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz1.d f129944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<r70.s> f129945c;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(boolean z14, yz1.d dVar, List<? extends r70.s> list) {
        dVar.getClass();
        list.getClass();
        this.f129943a = z14;
        this.f129944b = dVar;
        this.f129945c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f129943a == c0Var.f129943a && this.f129944b.equals(c0Var.f129944b) && this.f129945c.equals(c0Var.f129945c);
    }

    public final int hashCode() {
        return this.f129945c.hashCode() + ((this.f129944b.hashCode() + (Boolean.hashCode(this.f129943a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingSectionData(canHideSection=");
        sb3.append(this.f129943a);
        sb3.append(", status=");
        sb3.append(this.f129944b);
        sb3.append(", items=");
        return u62.z.c(sb3, this.f129945c, ")");
    }
}
