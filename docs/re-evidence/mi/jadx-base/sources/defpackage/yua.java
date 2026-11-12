package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class yua implements w2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f40564a;

    public yua(int[] iArr) {
        this.f40564a = vj1.g(iArr);
    }

    @Override // defpackage.w2i
    public int[] a() {
        return vj1.g(this.f40564a);
    }

    @Override // defpackage.w2i
    public int b() {
        int[] iArr = this.f40564a;
        return iArr[iArr.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yua) {
            return vj1.c(this.f40564a, ((yua) obj).f40564a);
        }
        return false;
    }

    public int hashCode() {
        return vj1.s(this.f40564a);
    }
}
