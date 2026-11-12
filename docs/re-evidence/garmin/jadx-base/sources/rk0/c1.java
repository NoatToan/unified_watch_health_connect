package rk0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrk0/c1;", "", "", "gearUUID", "Lam/x0;", "parentActivityType", "", "availableActivityTypes", "activityTypeFilter", "", "isWheelchairUser", "<init>", "(Ljava/lang/String;Lam/x0;Ljava/util/List;Lam/x0;Z)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am.x0 f153082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<am.x0> f153083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final am.x0 f153084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f153085e;

    /* JADX WARN: Multi-variable type inference failed */
    public c1(String str, am.x0 x0Var, List<? extends am.x0> list, am.x0 x0Var2, boolean z14) {
        str.getClass();
        x0Var.getClass();
        list.getClass();
        this.f153081a = str;
        this.f153082b = x0Var;
        this.f153083c = list;
        this.f153084d = x0Var2;
        this.f153085e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f153081a.equals(c1Var.f153081a) && this.f153082b == c1Var.f153082b && this.f153083c.equals(c1Var.f153083c) && this.f153084d == c1Var.f153084d && this.f153085e == c1Var.f153085e;
    }

    public final int hashCode() {
        int iB = lc.u0.b((this.f153082b.hashCode() + (this.f153081a.hashCode() * 31)) * 31, 31, this.f153083c);
        am.x0 x0Var = this.f153084d;
        return Boolean.hashCode(this.f153085e) + ((iB + (x0Var == null ? 0 : x0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrackedActivitiesState(gearUUID=");
        sb3.append(this.f153081a);
        sb3.append(", parentActivityType=");
        sb3.append(this.f153082b);
        sb3.append(", availableActivityTypes=");
        sb3.append(this.f153083c);
        sb3.append(", activityTypeFilter=");
        sb3.append(this.f153084d);
        sb3.append(", isWheelchairUser=");
        return hb.a.k(sb3, this.f153085e, ")");
    }
}
