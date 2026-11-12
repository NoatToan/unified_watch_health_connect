package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class bo9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f4417b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4418a;

    public bo9(byte[] bArr) {
        this.f4418a = a(bArr);
    }

    public static byte[] a(byte[] bArr) {
        k7l k7lVar = new k7l(160);
        k7lVar.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[k7lVar.c()];
        k7lVar.doFinal(bArr2, 0);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bo9) {
            return vj1.a(((bo9) obj).f4418a, this.f4418a);
        }
        return false;
    }

    public int hashCode() {
        return vj1.q(this.f4418a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.f4418a.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(f4417b[(this.f4418a[i] >>> 4) & 15]);
            stringBuffer.append(f4417b[this.f4418a[i] & 15]);
        }
        return stringBuffer.toString();
    }
}
