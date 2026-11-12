package qk0;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqk0/w;", "", "Lam/x0;", "activityType", "parentType", "", "isGroupingRow", "isSelected", "<init>", "(Lam/x0;Lam/x0;ZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f145164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f145165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f145167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f145168e;

    public w(x0 x0Var, x0 x0Var2, boolean z14, boolean z15) {
        x0Var.getClass();
        String strG = x0Var.f4358a;
        x0Var2.getClass();
        this.f145164a = x0Var;
        this.f145165b = x0Var2;
        this.f145166c = z14;
        this.f145167d = z15;
        if (z14 && x0Var2 == x0.f4304m) {
            strG = am.j.m("all_", strG, "_group");
        } else if (z14) {
            strG = tn.k.g(strG, "_group");
        }
        this.f145168e = strG;
    }

    public static w a(w wVar, boolean z14) {
        return new w(wVar.f145164a, wVar.f145165b, wVar.f145166c, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f145164a == wVar.f145164a && this.f145165b == wVar.f145165b && this.f145166c == wVar.f145166c && this.f145167d == wVar.f145167d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145167d) + q6.f.g((this.f145165b.hashCode() + (this.f145164a.hashCode() * 31)) * 31, 31, this.f145166c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectableActivityType(activityType=");
        sb3.append(this.f145164a);
        sb3.append(", parentType=");
        sb3.append(this.f145165b);
        sb3.append(", isGroupingRow=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isSelected=", ")", sb3, this.f145166c, this.f145167d);
    }
}
