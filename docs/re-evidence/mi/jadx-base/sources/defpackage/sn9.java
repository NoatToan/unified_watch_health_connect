package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class sn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f33809b;
    public final atk[] c;

    public sn9(int i, int[] iArr, int i2, int i3, int i4) {
        this.f33808a = i;
        this.f33809b = iArr;
        float f = i2;
        float f2 = i4;
        this.c = new atk[]{new atk(f, f2), new atk(i3, f2)};
    }

    public atk[] a() {
        return this.c;
    }

    public int[] b() {
        return this.f33809b;
    }

    public int c() {
        return this.f33808a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof sn9) && this.f33808a == ((sn9) obj).f33808a;
    }

    public int hashCode() {
        return this.f33808a;
    }
}
