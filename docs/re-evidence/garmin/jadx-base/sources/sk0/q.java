package sk0;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsk0/q;", "", "", "isSaving", "Lsk0/q1;", "saveResult", "Li53/d;", "Lc80/u;", "Li53/c;", "Ljk0/h;", "brandLists", "isBrandListLoading", "brandListError", "<init>", "(ZLsk0/q1;Li53/d;ZZ)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f159810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.d<c80.u, i53.c<jk0.h>> f159811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f159812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f159813e;

    public /* synthetic */ q(boolean z14, q1 q1Var, i53.d dVar, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, q1Var, (i14 & 4) != 0 ? i53.a.c() : dVar, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16);
    }

    public static q a(q qVar, boolean z14, q1 q1Var, i53.d dVar, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = qVar.f159809a;
        }
        boolean z17 = z14;
        if ((i14 & 2) != 0) {
            q1Var = qVar.f159810b;
        }
        q1 q1Var2 = q1Var;
        if ((i14 & 4) != 0) {
            dVar = qVar.f159811c;
        }
        i53.d dVar2 = dVar;
        if ((i14 & 8) != 0) {
            z15 = qVar.f159812d;
        }
        boolean z18 = z15;
        if ((i14 & 16) != 0) {
            z16 = qVar.f159813e;
        }
        qVar.getClass();
        dVar2.getClass();
        return new q(z17, q1Var2, dVar2, z18, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f159809a == qVar.f159809a && p005kotlin.jvm.internal.s.g(this.f159810b, qVar.f159810b) && p005kotlin.jvm.internal.s.g(this.f159811c, qVar.f159811c) && this.f159812d == qVar.f159812d && this.f159813e == qVar.f159813e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f159809a) * 31;
        q1 q1Var = this.f159810b;
        return Boolean.hashCode(this.f159813e) + q6.f.g(l2.b(this.f159811c, (iHashCode + (q1Var == null ? 0 : q1Var.hashCode())) * 31, 31), 31, this.f159812d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AddGearState(isSaving=");
        sb3.append(this.f159809a);
        sb3.append(", saveResult=");
        sb3.append(this.f159810b);
        sb3.append(", brandLists=");
        sb3.append(this.f159811c);
        sb3.append(", isBrandListLoading=");
        sb3.append(this.f159812d);
        sb3.append(", brandListError=");
        return hb.a.k(sb3, this.f159813e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(boolean z14, q1 q1Var, i53.d<c80.u, ? extends i53.c<jk0.h>> dVar, boolean z15, boolean z16) {
        dVar.getClass();
        this.f159809a = z14;
        this.f159810b = q1Var;
        this.f159811c = dVar;
        this.f159812d = z15;
        this.f159813e = z16;
    }
}
