package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwd2/a2;", "", "Lwd2/z1;", "livetrackSession", "Lge2/e;", "settings", "<init>", "(Lwd2/z1;Lge2/e;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f184384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ge2.e f184385b;

    public /* synthetic */ a2(z1 z1Var, ge2.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : z1Var, (i14 & 2) != 0 ? null : eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return p005kotlin.jvm.internal.s.g(this.f184384a, a2Var.f184384a) && p005kotlin.jvm.internal.s.g(this.f184385b, a2Var.f184385b);
    }

    public final int hashCode() {
        z1 z1Var = this.f184384a;
        int iHashCode = (z1Var == null ? 0 : z1Var.hashCode()) * 31;
        ge2.e eVar = this.f184385b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "SessionDetails(livetrackSession=" + this.f184384a + ", settings=" + this.f184385b + ")";
    }

    public a2(z1 z1Var, ge2.e eVar) {
        this.f184384a = z1Var;
        this.f184385b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a2() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
