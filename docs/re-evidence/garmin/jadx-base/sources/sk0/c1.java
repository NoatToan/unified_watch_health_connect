package sk0;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsk0/c1;", "", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lsk0/r0;", Action.KEY_ATTRIBUTE, "Lr53/i;", "Lyc/v2;", "Luk0/e;", "pager", "<init>", "(Lo53/b0;Lsk0/r0;Lr53/i;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f159644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f159645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.i<v2<uk0.e>> f159646c;

    public c1(o53.b0 b0Var, r0 r0Var, r53.i<v2<uk0.e>> iVar) {
        b0Var.getClass();
        r0Var.getClass();
        iVar.getClass();
        this.f159644a = b0Var;
        this.f159645b = r0Var;
        this.f159646c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f159644a.equals(c1Var.f159644a) && this.f159645b.equals(c1Var.f159645b) && this.f159646c.equals(c1Var.f159646c);
    }

    public final int hashCode() {
        return this.f159646c.hashCode() + ((this.f159645b.hashCode() + (this.f159644a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GearPagerCache(scope=" + this.f159644a + ", key=" + this.f159645b + ", pager=" + this.f159646c + ")";
    }
}
