package defpackage;

/* JADX INFO: loaded from: classes23.dex */
public class bil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1128c = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1127b = 0;
    private byte[] e = new byte[1024];

    public int d() {
        return this.f1127b;
    }

    public byte[] e() {
        int i = this.f1127b;
        if (i <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, 0, bArr, 0, i);
        return bArr;
    }

    public void d(byte[] bArr, int i) {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i2 = this.f1127b;
        if (length - i2 >= i) {
            System.arraycopy(bArr, 0, bArr2, i2, i);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(bArr, 0, bArr3, this.f1127b, i);
            this.e = bArr3;
        }
        this.f1127b += i;
    }

    public void c() {
        this.e = new byte[this.f1128c];
        this.f1127b = 0;
    }

    public static String c(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr2[i] = cArr[(b2 >>> 4) & 15];
            cArr2[i + 1] = cArr[b2 & 15];
            i2++;
            i += 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cArr2);
        return sb.toString();
    }
}
