package tb0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltb0/t;", "", "", "isLoading", "isError", "Lhv/a;", "tutorialHolder", "excludeLastStep", "completeMsgRequired", "", "currentIndex", "<init>", "(ZZLhv/a;ZZI)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hv.a f163707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f163708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f163709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f163710f;

    public /* synthetic */ t(boolean z14, boolean z15, hv.a aVar, boolean z16, boolean z17, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? null : aVar, (i15 & 8) != 0 ? false : z16, (i15 & 16) != 0 ? false : z17, (i15 & 32) != 0 ? 0 : i14);
    }

    public static t a(t tVar, boolean z14, hv.a aVar, int i14, int i15) {
        boolean z15 = (i15 & 1) != 0 ? tVar.f163705a : false;
        if ((i15 & 2) != 0) {
            z14 = tVar.f163706b;
        }
        boolean z16 = z14;
        if ((i15 & 4) != 0) {
            aVar = tVar.f163707c;
        }
        hv.a aVar2 = aVar;
        boolean z17 = tVar.f163708d;
        boolean z18 = tVar.f163709e;
        if ((i15 & 32) != 0) {
            i14 = tVar.f163710f;
        }
        tVar.getClass();
        return new t(z15, z16, aVar2, z17, z18, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f163705a == tVar.f163705a && this.f163706b == tVar.f163706b && p005kotlin.jvm.internal.s.g(this.f163707c, tVar.f163707c) && this.f163708d == tVar.f163708d && this.f163709e == tVar.f163709e && this.f163710f == tVar.f163710f;
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f163705a) * 31, 31, this.f163706b);
        hv.a aVar = this.f163707c;
        return Integer.hashCode(this.f163710f) + q6.f.g(q6.f.g((iG + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f163708d), 31, this.f163709e);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("LegacyGestureTutorialUiState(isLoading=", ", isError=", ", tutorialHolder=", this.f163705a, this.f163706b);
        sbM.append(this.f163707c);
        sbM.append(", excludeLastStep=");
        sbM.append(this.f163708d);
        sbM.append(", completeMsgRequired=");
        sbM.append(this.f163709e);
        sbM.append(", currentIndex=");
        sbM.append(this.f163710f);
        sbM.append(")");
        return sbM.toString();
    }

    public t(boolean z14, boolean z15, hv.a aVar, boolean z16, boolean z17, int i14) {
        this.f163705a = z14;
        this.f163706b = z15;
        this.f163707c = aVar;
        this.f163708d = z16;
        this.f163709e = z17;
        this.f163710f = i14;
    }

    public t() {
        this(false, false, null, false, false, 0, 63, null);
    }
}
