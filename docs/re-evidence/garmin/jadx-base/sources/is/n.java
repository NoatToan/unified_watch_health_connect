package is;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lis/n;", "Lg6/c;", "", "density", "fontScale", "<init>", "(FF)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements g6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f94881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f94882b;

    public n(float f14, float f15) {
        this.f94881a = f14;
        this.f94882b = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f94881a, nVar.f94881a) == 0 && Float.compare(this.f94882b, nVar.f94882b) == 0;
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public final float getF94881a() {
        return this.f94881a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f94882b) + (Float.hashCode(this.f94881a) * 31);
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0, reason: from getter */
    public final float getF94882b() {
        return this.f94882b;
    }

    public final String toString() {
        return am.j.l("ScaledDensity(density=", this.f94881a, ", fontScale=", this.f94882b, ")");
    }
}
