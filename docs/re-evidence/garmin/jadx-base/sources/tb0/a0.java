package tb0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltb0/a0;", "", "", "isLoading", "isError", "Ltb0/x;", "lottieAnimationState", "<init>", "(ZZLtb0/x;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f163591c;

    public /* synthetic */ a0(boolean z14, boolean z15, x xVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f163589a == a0Var.f163589a && this.f163590b == a0Var.f163590b && p005kotlin.jvm.internal.s.g(this.f163591c, a0Var.f163591c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f163589a) * 31, 31, this.f163590b);
        x xVar = this.f163591c;
        return iG + (xVar == null ? 0 : xVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PairUiState(isLoading=", ", isError=", ", lottieAnimationState=", this.f163589a, this.f163590b);
        sbM.append(this.f163591c);
        sbM.append(")");
        return sbM.toString();
    }

    public a0(boolean z14, boolean z15, x xVar) {
        this.f163589a = z14;
        this.f163590b = z15;
        this.f163591c = xVar;
    }

    public a0() {
        this(false, false, null, 7, null);
    }
}
