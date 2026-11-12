package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ava {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3484b;

    public ava(byte[] bArr) {
        this.f3483a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int iD = cie.d(bArr);
        this.f3484b = iD;
        if (!b3i.c(iD)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f3483a = b3i.a(this.f3484b);
    }

    public static String i(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }

    public int a(int i, int i2) {
        return i ^ i2;
    }

    public String b(int i) {
        StringBuilder sb;
        String str;
        String string = "";
        for (int i2 = 0; i2 < this.f3483a; i2++) {
            if ((((byte) i) & 1) == 0) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = "1";
            }
            sb.append(str);
            sb.append(string);
            string = sb.toString();
            i >>>= 1;
        }
        return string;
    }

    public int c(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = f(i);
            i2 = -i2;
        }
        int iH = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                iH = h(iH, i);
            }
            i = h(i, i);
            i2 >>>= 1;
        }
        return iH;
    }

    public int d() {
        return this.f3483a;
    }

    public byte[] e() {
        return cie.c(this.f3484b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ava)) {
            ava avaVar = (ava) obj;
            if (this.f3483a == avaVar.f3483a && this.f3484b == avaVar.f3484b) {
                return true;
            }
        }
        return false;
    }

    public int f(int i) {
        return c(i, (1 << this.f3483a) - 2);
    }

    public boolean g(int i) {
        int i2 = this.f3483a;
        if (i2 == 31) {
            return i >= 0;
        }
        return i >= 0 && i < (1 << i2);
    }

    public int h(int i, int i2) {
        return b3i.d(i, i2, this.f3484b);
    }

    public int hashCode() {
        return this.f3484b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f3483a + ") = GF(2)[X]/<" + i(this.f3484b) + "> ";
    }
}
