package v;

import android.util.Range;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f173765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f173766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f173767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f173768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f173769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f173770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f173771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f173772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Range<Integer> f173773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f173774j;

    public e(int i14, boolean z14, int i15, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Range<Integer> range, boolean z24) {
        this.f173765a = i14;
        this.f173766b = z14;
        this.f173767c = i15;
        this.f173768d = z15;
        this.f173769e = z16;
        this.f173770f = z17;
        this.f173771g = z18;
        this.f173772h = z19;
        if (range == null) {
            j20.x.l("Null getTargetFpsRange");
            throw null;
        }
        this.f173773i = range;
        this.f173774j = z24;
    }

    @Override // v.b2.c
    public final int a() {
        return this.f173765a;
    }

    @Override // v.b2.c
    public final int b() {
        return this.f173767c;
    }

    @Override // v.b2.c
    public final Range<Integer> c() {
        return this.f173773i;
    }

    @Override // v.b2.c
    public final boolean d() {
        return this.f173766b;
    }

    @Override // v.b2.c
    public final boolean e() {
        return this.f173771g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2.c)) {
            return false;
        }
        b2.c cVar = (b2.c) obj;
        return this.f173765a == cVar.a() && this.f173766b == cVar.d() && this.f173767c == cVar.b() && this.f173768d == cVar.g() && this.f173769e == cVar.i() && this.f173770f == cVar.f() && this.f173771g == cVar.e() && this.f173772h == cVar.j() && this.f173773i.equals(cVar.c()) && this.f173774j == cVar.h();
    }

    @Override // v.b2.c
    public final boolean f() {
        return this.f173770f;
    }

    @Override // v.b2.c
    public final boolean g() {
        return this.f173768d;
    }

    @Override // v.b2.c
    public final boolean h() {
        return this.f173774j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f173765a ^ 1000003) * 1000003) ^ (this.f173766b ? 1231 : 1237)) * 1000003) ^ this.f173767c) * 1000003) ^ (this.f173768d ? 1231 : 1237)) * 1000003) ^ (this.f173769e ? 1231 : 1237)) * 1000003) ^ (this.f173770f ? 1231 : 1237)) * 1000003) ^ (this.f173771g ? 1231 : 1237)) * 1000003) ^ (this.f173772h ? 1231 : 1237)) * 1000003) ^ this.f173773i.hashCode()) * 1000003) ^ (this.f173774j ? 1231 : 1237);
    }

    @Override // v.b2.c
    public final boolean i() {
        return this.f173769e;
    }

    @Override // v.b2.c
    public final boolean j() {
        return this.f173772h;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FeatureSettings{getCameraMode=");
        sb3.append(this.f173765a);
        sb3.append(", hasVideoCapture=");
        sb3.append(this.f173766b);
        sb3.append(", getRequiredMaxBitDepth=");
        sb3.append(this.f173767c);
        sb3.append(", isPreviewStabilizationOn=");
        sb3.append(this.f173768d);
        sb3.append(", isUltraHdrOn=");
        sb3.append(this.f173769e);
        sb3.append(", isHighSpeedOn=");
        sb3.append(this.f173770f);
        sb3.append(", isFeatureComboInvocation=");
        sb3.append(this.f173771g);
        sb3.append(", requiresFeatureComboQuery=");
        sb3.append(this.f173772h);
        sb3.append(", getTargetFpsRange=");
        sb3.append(this.f173773i);
        sb3.append(", isStrictFpsRequired=");
        return hb.a.k(sb3, this.f173774j, StringSubstitutor.DEFAULT_VAR_END);
    }
}
