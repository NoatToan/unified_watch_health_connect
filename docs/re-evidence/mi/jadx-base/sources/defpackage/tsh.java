package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tsh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f34995a;

    public tsh(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iE = cie.e(bArr, 0);
        int iA = kcd.a(iE - 1);
        if (bArr.length != (iE * iA) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f34995a = new int[iE];
        for (int i = 0; i < iE; i++) {
            this.f34995a[i] = cie.f(bArr, (i * iA) + 4, iA);
        }
        if (!b(this.f34995a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public byte[] a() {
        int length = this.f34995a.length;
        int iA = kcd.a(length - 1);
        byte[] bArr = new byte[(length * iA) + 4];
        cie.a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            cie.b(this.f34995a[i], bArr, (i * iA) + 4, iA);
        }
        return bArr;
    }

    public final boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof tsh) {
            return icd.b(this.f34995a, ((tsh) obj).f34995a);
        }
        return false;
    }

    public int hashCode() {
        return this.f34995a.hashCode();
    }

    public String toString() {
        String str = "[" + this.f34995a[0];
        for (int i = 1; i < this.f34995a.length; i++) {
            str = str + ", " + this.f34995a[i];
        }
        return str + "]";
    }
}
