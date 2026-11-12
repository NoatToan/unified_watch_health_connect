package og2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Log2/g;", "", "", "colorStop", "", "colorResId", "<init>", "(FI)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f132035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f132036b;

    public g(float f14, int i14) {
        this.f132035a = f14;
        this.f132036b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f132035a, gVar.f132035a) == 0 && this.f132036b == gVar.f132036b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f132036b) + (Float.hashCode(this.f132035a) * 31);
    }

    public final String toString() {
        return "ChartGradientData(colorStop=" + this.f132035a + ", colorResId=" + this.f132036b + ")";
    }
}
