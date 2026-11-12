package tb0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltb0/u;", "", "", "isLoading", "isError", "Lhv/a;", "tutorialHolder", "<init>", "(ZZLhv/a;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hv.a f163713c;

    public /* synthetic */ u(boolean z14, boolean z15, hv.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f163711a == uVar.f163711a && this.f163712b == uVar.f163712b && p005kotlin.jvm.internal.s.g(this.f163713c, uVar.f163713c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f163711a) * 31, 31, this.f163712b);
        hv.a aVar = this.f163713c;
        return iG + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("LegacyPairTutorialUiState(isLoading=", ", isError=", ", tutorialHolder=", this.f163711a, this.f163712b);
        sbM.append(this.f163713c);
        sbM.append(")");
        return sbM.toString();
    }

    public u(boolean z14, boolean z15, hv.a aVar) {
        this.f163711a = z14;
        this.f163712b = z15;
        this.f163713c = aVar;
    }

    public u() {
        this(false, false, null, 7, null);
    }
}
