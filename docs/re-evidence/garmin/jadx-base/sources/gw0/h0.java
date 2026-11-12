package gw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgw0/h0;", "", "Lpv0/r;", "selectedTab", "Lmw0/o;", "selectedBehaviourSummaryDetailsSegment", "Lmw0/r;", "selectedBehaviourSummaryTab", "", "showUpdateBehaviourError", "showReportsTooltip", "showBehaviorDetailsTooltip", "showPregnancyAndLoggingBanner", "showAutoLoggingBehaviorsBanner", "Lb63/o;", "selectedDate", "<init>", "(Lpv0/r;Lmw0/o;Lmw0/r;ZZZZZLb63/o;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pv0.r f79609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mw0.o f79610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mw0.r f79611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f79612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f79613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f79614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f79615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f79616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b63.o f79617i;

    public /* synthetic */ h0(pv0.r rVar, mw0.o oVar, mw0.r rVar2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, b63.o oVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? pv0.r.OVERNIGHT_STRESS : rVar, (i14 & 2) != 0 ? mw0.o.QUANTITY : oVar, (i14 & 4) != 0 ? mw0.r.SUMMARY : rVar2, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? false : z17, (i14 & 128) != 0 ? false : z18, (i14 & 256) != 0 ? null : oVar2);
    }

    public static h0 a(h0 h0Var, pv0.r rVar, mw0.o oVar, mw0.r rVar2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, b63.o oVar2, int i14) {
        if ((i14 & 1) != 0) {
            rVar = h0Var.f79609a;
        }
        pv0.r rVar3 = rVar;
        if ((i14 & 2) != 0) {
            oVar = h0Var.f79610b;
        }
        mw0.o oVar3 = oVar;
        if ((i14 & 4) != 0) {
            rVar2 = h0Var.f79611c;
        }
        mw0.r rVar4 = rVar2;
        if ((i14 & 8) != 0) {
            z14 = h0Var.f79612d;
        }
        boolean z19 = z14;
        if ((i14 & 16) != 0) {
            z15 = h0Var.f79613e;
        }
        boolean z24 = z15;
        boolean z25 = (i14 & 32) != 0 ? h0Var.f79614f : z16;
        boolean z26 = (i14 & 64) != 0 ? h0Var.f79615g : z17;
        boolean z27 = (i14 & 128) != 0 ? h0Var.f79616h : z18;
        b63.o oVar4 = (i14 & 256) != 0 ? h0Var.f79617i : oVar2;
        h0Var.getClass();
        rVar3.getClass();
        oVar3.getClass();
        rVar4.getClass();
        return new h0(rVar3, oVar3, rVar4, z19, z24, z25, z26, z27, oVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f79609a == h0Var.f79609a && this.f79610b == h0Var.f79610b && this.f79611c == h0Var.f79611c && this.f79612d == h0Var.f79612d && this.f79613e == h0Var.f79613e && this.f79614f == h0Var.f79614f && this.f79615g == h0Var.f79615g && this.f79616h == h0Var.f79616h && p005kotlin.jvm.internal.s.g(this.f79617i, h0Var.f79617i);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((this.f79611c.hashCode() + ((this.f79610b.hashCode() + (this.f79609a.hashCode() * 31)) * 31)) * 31, 31, this.f79612d), 31, this.f79613e), 31, this.f79614f), 31, this.f79615g), 31, this.f79616h);
        b63.o oVar = this.f79617i;
        return iG + (oVar == null ? 0 : oVar.f16206a.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReportsUiState(selectedTab=");
        sb3.append(this.f79609a);
        sb3.append(", selectedBehaviourSummaryDetailsSegment=");
        sb3.append(this.f79610b);
        sb3.append(", selectedBehaviourSummaryTab=");
        sb3.append(this.f79611c);
        sb3.append(", showUpdateBehaviourError=");
        sb3.append(this.f79612d);
        sb3.append(", showReportsTooltip=");
        kg.f.q(", showBehaviorDetailsTooltip=", ", showPregnancyAndLoggingBanner=", sb3, this.f79613e, this.f79614f);
        kg.f.q(", showAutoLoggingBehaviorsBanner=", ", selectedDate=", sb3, this.f79615g, this.f79616h);
        sb3.append(this.f79617i);
        sb3.append(")");
        return sb3.toString();
    }

    public h0(pv0.r rVar, mw0.o oVar, mw0.r rVar2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, b63.o oVar2) {
        rVar.getClass();
        oVar.getClass();
        rVar2.getClass();
        this.f79609a = rVar;
        this.f79610b = oVar;
        this.f79611c = rVar2;
        this.f79612d = z14;
        this.f79613e = z15;
        this.f79614f = z16;
        this.f79615g = z17;
        this.f79616h = z18;
        this.f79617i = oVar2;
    }

    public h0() {
        this(null, null, null, false, false, false, false, false, null, 511, null);
    }
}
