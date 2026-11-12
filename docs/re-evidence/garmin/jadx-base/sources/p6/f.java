package p6;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f136197e;

    public f(char[] cArr) {
        super(cArr);
        this.f136197e = Float.NaN;
    }

    @Override // p6.d
    public final float c() {
        char[] cArr;
        if (Float.isNaN(this.f136197e) && (cArr = this.f136193a) != null && cArr.length >= 1) {
            this.f136197e = Float.parseFloat(b());
        }
        return this.f136197e;
    }

    @Override // p6.d
    public final int d() {
        char[] cArr;
        if (Float.isNaN(this.f136197e) && (cArr = this.f136193a) != null && cArr.length >= 1) {
            this.f136197e = Integer.parseInt(b());
        }
        return (int) this.f136197e;
    }

    @Override // p6.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            float fC = c();
            float fC2 = ((f) obj).c();
            if ((Float.isNaN(fC) && Float.isNaN(fC2)) || fC == fC2) {
                return true;
            }
        }
        return false;
    }

    @Override // p6.d
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f14 = this.f136197e;
        return iHashCode + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0);
    }

    public f(float f14) {
        super(null);
        this.f136197e = f14;
    }
}
