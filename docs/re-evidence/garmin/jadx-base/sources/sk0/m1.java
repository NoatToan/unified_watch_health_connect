package sk0;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsk0/m1;", "", "", "isFetching", "hasFetchedSuccessfully", "showFetchingError", "Li53/d;", "Lc80/u;", "Li53/c;", "Luk0/a;", "groupedGearList", "Ljk0/x;", "newlyCreatedGear", "<init>", "(ZZZLi53/d;Ljk0/x;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.d<c80.u, i53.c<uk0.a>> f159758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jk0.x f159759e;

    public /* synthetic */ m1(boolean z14, boolean z15, boolean z16, i53.d dVar, jk0.x xVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? i53.a.c() : dVar, (i14 & 16) != 0 ? null : xVar);
    }

    public static m1 a(m1 m1Var, boolean z14, boolean z15, i53.d dVar, jk0.x xVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = m1Var.f159755a;
        }
        boolean z16 = z14;
        boolean z17 = (i14 & 2) != 0 ? m1Var.f159756b : true;
        if ((i14 & 4) != 0) {
            z15 = m1Var.f159757c;
        }
        boolean z18 = z15;
        if ((i14 & 8) != 0) {
            dVar = m1Var.f159758d;
        }
        i53.d dVar2 = dVar;
        if ((i14 & 16) != 0) {
            xVar = m1Var.f159759e;
        }
        m1Var.getClass();
        dVar2.getClass();
        return new m1(z16, z17, z18, dVar2, xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f159755a == m1Var.f159755a && this.f159756b == m1Var.f159756b && this.f159757c == m1Var.f159757c && p005kotlin.jvm.internal.s.g(this.f159758d, m1Var.f159758d) && p005kotlin.jvm.internal.s.g(this.f159759e, m1Var.f159759e);
    }

    public final int hashCode() {
        int iB = l2.b(this.f159758d, q6.f.g(q6.f.g(Boolean.hashCode(this.f159755a) * 31, 31, this.f159756b), 31, this.f159757c), 31);
        jk0.x xVar = this.f159759e;
        return iB + (xVar == null ? 0 : xVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ManageCollectionGearState(isFetching=", ", hasFetchedSuccessfully=", ", showFetchingError=", this.f159755a, this.f159756b);
        sbM.append(this.f159757c);
        sbM.append(", groupedGearList=");
        sbM.append(this.f159758d);
        sbM.append(", newlyCreatedGear=");
        sbM.append(this.f159759e);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m1(boolean z14, boolean z15, boolean z16, i53.d<c80.u, ? extends i53.c<uk0.a>> dVar, jk0.x xVar) {
        dVar.getClass();
        this.f159755a = z14;
        this.f159756b = z15;
        this.f159757c = z16;
        this.f159758d = dVar;
        this.f159759e = xVar;
    }

    public m1() {
        this(false, false, false, null, null, 31, null);
    }
}
