package c80;

import java.util.List;
import p005kotlin.Metadata;
import r53.o2;
import r53.q2;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lc80/b;", "", "Lr53/o2;", "Lc80/c;", "activityInfo", "Lr53/z1;", "Li53/c;", "Lc80/a;", "v2UsedGear", "", "Lc80/t;", "events", "", "loadingCalls", "", "canGearChildScrollUp", "<init>", "(Lr53/o2;Lr53/z1;Lr53/z1;Lr53/z1;Lr53/z1;)V", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2<c> f25295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1<i53.c<a>> f25296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1<List<t>> f25297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1<Integer> f25298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<Boolean> f25299e;

    public b(o2 o2Var, z1 z1Var, z1 z1Var2, z1 z1Var3, z1 z1Var4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(o2Var, (i14 & 2) != 0 ? q2.a(j53.l.b()) : z1Var, z1Var2, z1Var3, (i14 & 16) != 0 ? q2.a(Boolean.FALSE) : z1Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f25295a, bVar.f25295a) && p005kotlin.jvm.internal.s.g(this.f25296b, bVar.f25296b) && p005kotlin.jvm.internal.s.g(this.f25297c, bVar.f25297c) && p005kotlin.jvm.internal.s.g(this.f25298d, bVar.f25298d) && p005kotlin.jvm.internal.s.g(this.f25299e, bVar.f25299e);
    }

    public final int hashCode() {
        return this.f25299e.hashCode() + ((this.f25298d.hashCode() + ((this.f25297c.hashCode() + ((this.f25296b.hashCode() + (this.f25295a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActivityGearSharedState(activityInfo=" + this.f25295a + ", v2UsedGear=" + this.f25296b + ", events=" + this.f25297c + ", loadingCalls=" + this.f25298d + ", canGearChildScrollUp=" + this.f25299e + ")";
    }

    public b(o2<c> o2Var, z1<i53.c<a>> z1Var, z1<List<t>> z1Var2, z1<Integer> z1Var3, z1<Boolean> z1Var4) {
        o2Var.getClass();
        z1Var.getClass();
        z1Var2.getClass();
        z1Var3.getClass();
        z1Var4.getClass();
        this.f25295a = o2Var;
        this.f25296b = z1Var;
        this.f25297c = z1Var2;
        this.f25298d = z1Var3;
        this.f25299e = z1Var4;
    }
}
