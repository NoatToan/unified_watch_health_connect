package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class dpq extends qhh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15793b;
    public cpq c;
    public byte d;
    public String e;

    public dpq() {
        this.f15793b = "VersionData";
        this.c = new cpq();
        this.d = (byte) 1;
        this.e = null;
    }

    public static byte[] e(byte b2, int i) {
        byte[] bArrD = p4q.d(i);
        byte[] bArr = new byte[5];
        bArr[0] = b2;
        System.arraycopy(bArrD, 0, bArr, 1, 4);
        return bArr;
    }

    public static byte[] f(byte b2, String str) {
        byte[] bytes = str != null ? str.getBytes() : new byte[0];
        byte[] bArrF = p4q.f((short) bytes.length);
        byte[] bArr = new byte[bytes.length + 3];
        bArr[0] = b2;
        System.arraycopy(bArrF, 0, bArr, 1, 2);
        System.arraycopy(bytes, 0, bArr, 3, bytes.length);
        return bArr;
    }

    public byte b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public cpq d() {
        return this.c;
    }

    public final byte[] g() {
        byte[] bArrE = e((byte) 1, this.c.b());
        byte[] bArrF = f((byte) 4, this.e);
        byte[] bArrF2 = this.c.a() != null ? f((byte) 2, this.c.a()) : null;
        if (bArrF2 != null) {
            voe.a(this.f15793b, "make: ver and text.");
            this.f31524a = l73.a(bArrE, bArrF2);
        }
        if (this.e != null && bArrF != null) {
            this.f31524a = l73.a(this.f31524a, bArrF);
        }
        voe.a(this.f15793b, "make version data success. len:" + this.f31524a.length);
        return this.f31524a;
    }

    public int h(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte b2 = bArr[i];
            voe.a(this.f15793b, "subcode:" + ((int) b2));
            if (b2 == 1) {
                voe.a(this.f15793b, "to parse version, i:" + i);
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, i + 1, bArr2, 0, 4);
                int iA = p4q.a(bArr2);
                voe.a(this.f15793b, "version:" + iA);
                this.c.d(iA);
                i += 5;
            } else if (b2 == 3) {
                voe.a(this.f15793b, "to parse version res, i:" + i);
                byte[] bArr3 = new byte[1];
                System.arraycopy(bArr, i + 1, bArr3, 0, 1);
                byte b3 = bArr3[0];
                voe.a(this.f15793b, "res:" + ((int) b3));
                this.d = b3;
                i += 2;
            } else {
                if (b2 != 4) {
                    voe.b(this.f15793b, "subcode error");
                    return -1;
                }
                voe.a(this.f15793b, "to parse extra text, i:" + i);
                byte[] bArr4 = new byte[2];
                System.arraycopy(bArr, i + 1, bArr4, 0, 2);
                int iC = p4q.c(bArr4);
                byte[] bArr5 = new byte[iC];
                int i2 = i + 3;
                System.arraycopy(bArr, i2, bArr5, 0, iC);
                this.e = new String(bArr5);
                i = i2 + iC;
            }
        }
        voe.a(this.f15793b, "parse version data success.");
        return 0;
    }

    public int i(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte b2 = bArr[i];
            voe.a(this.f15793b, "subcode:" + ((int) b2));
            if (b2 == 1) {
                voe.a(this.f15793b, "to parse version, i:" + i);
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, i + 1, bArr2, 0, 4);
                int iA = p4q.a(bArr2);
                voe.a(this.f15793b, "version:" + iA);
                this.c.d(iA);
                i += 5;
            } else if (b2 == 2) {
                voe.a(this.f15793b, "to parse version text, i:" + i);
                byte[] bArr3 = new byte[2];
                System.arraycopy(bArr, i + 1, bArr3, 0, 2);
                int iC = p4q.c(bArr3);
                voe.a(this.f15793b, "ver text len:" + iC);
                int i2 = i + 3;
                if (iC < 0) {
                    voe.b(this.f15793b, "invalid data length error during parsing version text");
                    return -1;
                }
                int i3 = iC + i2;
                if (i3 > bArr.length) {
                    voe.b(this.f15793b, "data length error during parsing version text");
                    return -1;
                }
                byte[] bArr4 = new byte[iC];
                System.arraycopy(bArr, i2, bArr4, 0, iC);
                this.c.c(new String(bArr4));
                i = i3;
            } else {
                if (b2 != 4) {
                    voe.b(this.f15793b, "subcode error");
                    return -1;
                }
                voe.a(this.f15793b, "to parse extra text, i:" + i);
                byte[] bArr5 = new byte[2];
                System.arraycopy(bArr, i + 1, bArr5, 0, 2);
                int iC2 = p4q.c(bArr5);
                byte[] bArr6 = new byte[iC2];
                int i4 = i + 3;
                System.arraycopy(bArr, i4, bArr6, 0, iC2);
                this.e = new String(bArr6);
                i = i4 + iC2;
            }
        }
        voe.a(this.f15793b, "parse version data success.");
        return 0;
    }

    public dpq(cpq cpqVar, String str) {
        this.f15793b = "VersionData";
        new cpq();
        this.d = (byte) 1;
        this.e = null;
        this.c = cpqVar;
        this.e = str == null ? "" : str;
        g();
    }
}
