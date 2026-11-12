package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xua implements v2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f39476a;

    public xua(int[] iArr) {
        this.f39476a = wj1.f(iArr);
    }

    @Override // defpackage.v2i
    public int[] a() {
        return wj1.f(this.f39476a);
    }

    @Override // defpackage.v2i
    public int b() {
        int[] iArr = this.f39476a;
        return iArr[iArr.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xua) {
            return wj1.c(this.f39476a, ((xua) obj).f39476a);
        }
        return false;
    }

    public int hashCode() {
        return wj1.m(this.f39476a);
    }
}
