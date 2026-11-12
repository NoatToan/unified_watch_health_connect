package na0;

import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lna0/i;", "", "", "", "digits", "", "circumferenceInMm", "", "showCircumference", "isNextEnabled", "<init>", "(Ljava/util/List;IZZ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f125125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f125127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f125128d;

    public i(List<String> list, int i14, boolean z14, boolean z15) {
        list.getClass();
        this.f125125a = list;
        this.f125126b = i14;
        this.f125127c = z14;
        this.f125128d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f125125a.equals(iVar.f125125a) && this.f125126b == iVar.f125126b && this.f125127c == iVar.f125127c && this.f125128d == iVar.f125128d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125128d) + q6.f.g(q2.d(this.f125126b, this.f125125a.hashCode() * 31, 31), 31, this.f125127c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BikeWheelCircumferenceEstimationUiState(digits=");
        sb3.append(this.f125125a);
        sb3.append(", circumferenceInMm=");
        sb3.append(this.f125126b);
        sb3.append(", showCircumference=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isNextEnabled=", ")", sb3, this.f125127c, this.f125128d);
    }
}
