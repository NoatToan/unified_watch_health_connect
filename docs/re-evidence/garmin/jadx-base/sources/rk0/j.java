package rk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrk0/j;", "", "Ljk0/j;", "collection", "Lrk0/u0;", "loadingState", "Lrk0/v0;", "savingState", "", "edited", "deleted", "<init>", "(Ljk0/j;Lrk0/u0;Lrk0/v0;ZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk0.j f153165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f153166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f153167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f153168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f153169e;

    public j(jk0.j jVar, u0 u0Var, v0 v0Var, boolean z14, boolean z15) {
        this.f153165a = jVar;
        this.f153166b = u0Var;
        this.f153167c = v0Var;
        this.f153168d = z14;
        this.f153169e = z15;
    }

    public static j a(j jVar, jk0.j jVar2, u0 u0Var, v0 v0Var, int i14) {
        if ((i14 & 1) != 0) {
            jVar2 = jVar.f153165a;
        }
        jk0.j jVar3 = jVar2;
        if ((i14 & 2) != 0) {
            u0Var = jVar.f153166b;
        }
        u0 u0Var2 = u0Var;
        if ((i14 & 4) != 0) {
            v0Var = jVar.f153167c;
        }
        v0 v0Var2 = v0Var;
        boolean z14 = (i14 & 8) != 0 ? jVar.f153168d : true;
        boolean z15 = (i14 & 16) != 0 ? jVar.f153169e : true;
        jVar.getClass();
        return new j(jVar3, u0Var2, v0Var2, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f153165a, jVar.f153165a) && this.f153166b == jVar.f153166b && p005kotlin.jvm.internal.s.g(this.f153167c, jVar.f153167c) && this.f153168d == jVar.f153168d && this.f153169e == jVar.f153169e;
    }

    public final int hashCode() {
        jk0.j jVar = this.f153165a;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        u0 u0Var = this.f153166b;
        int iHashCode2 = (iHashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        v0 v0Var = this.f153167c;
        return Boolean.hashCode(this.f153169e) + q6.f.g((iHashCode2 + (v0Var != null ? v0Var.hashCode() : 0)) * 31, 31, this.f153168d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollectionDetailsState(collection=");
        sb3.append(this.f153165a);
        sb3.append(", loadingState=");
        sb3.append(this.f153166b);
        sb3.append(", savingState=");
        sb3.append(this.f153167c);
        sb3.append(", edited=");
        sb3.append(this.f153168d);
        sb3.append(", deleted=");
        return hb.a.k(sb3, this.f153169e, ")");
    }
}
