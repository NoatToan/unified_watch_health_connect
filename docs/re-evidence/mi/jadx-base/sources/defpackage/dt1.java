package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15908b;

    public dt1(int i, float f) {
        this.f15907a = i;
        this.f15908b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dt1.class != obj.getClass()) {
            return false;
        }
        dt1 dt1Var = (dt1) obj;
        return this.f15907a == dt1Var.f15907a && Float.compare(dt1Var.f15908b, this.f15908b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f15907a) * 31) + Float.floatToIntBits(this.f15908b);
    }
}
