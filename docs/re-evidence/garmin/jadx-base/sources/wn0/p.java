package wn0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwn0/p;", "", "", "isLoading", "Lvn0/a;", "devicePulseOxSettingsNavArgs", "showError", "showTrackingStatusBanner", "<init>", "(ZLvn0/a;ZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f186165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vn0.a f186166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f186167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f186168d;

    public /* synthetic */ p(boolean z14, vn0.a aVar, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16);
    }

    public static p a(p pVar, boolean z14, vn0.a aVar, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = pVar.f186165a;
        }
        if ((i14 & 2) != 0) {
            aVar = pVar.f186166b;
        }
        if ((i14 & 4) != 0) {
            z15 = pVar.f186167c;
        }
        if ((i14 & 8) != 0) {
            z16 = pVar.f186168d;
        }
        pVar.getClass();
        return new p(z14, aVar, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f186165a == pVar.f186165a && s.g(this.f186166b, pVar.f186166b) && this.f186167c == pVar.f186167c && this.f186168d == pVar.f186168d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f186165a) * 31;
        vn0.a aVar = this.f186166b;
        return Boolean.hashCode(this.f186168d) + q6.f.g((iHashCode + (aVar == null ? 0 : aVar.f178837a.hashCode())) * 31, 31, this.f186167c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HealthStatusUiState(isLoading=");
        sb3.append(this.f186165a);
        sb3.append(", devicePulseOxSettingsNavArgs=");
        sb3.append(this.f186166b);
        sb3.append(", showError=");
        return com.airbnb.lottie.animation.keyframe.a.f(", showTrackingStatusBanner=", ")", sb3, this.f186167c, this.f186168d);
    }

    public p(boolean z14, vn0.a aVar, boolean z15, boolean z16) {
        this.f186165a = z14;
        this.f186166b = aVar;
        this.f186167c = z15;
        this.f186168d = z16;
    }

    public p() {
        this(false, null, false, false, 15, null);
    }
}
