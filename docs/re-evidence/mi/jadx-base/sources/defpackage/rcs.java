package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginError;

/* JADX INFO: loaded from: classes11.dex */
public class rcs {
    public int d = PluginError.DOWNERROR_APPVERSION;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f32424a = new byte[256];
    public int c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32425b = 0;

    public static int b(byte b2) {
        return b2 >= 0 ? b2 : b2 + 256;
    }

    public static void f(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
    }

    public static byte[] g(String str, String str2) {
        byte[] bArrB = ecs.b(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[bArrB.length + 1 + bytes.length];
        for (int i = 0; i < bArrB.length; i++) {
            bArr[i] = bArrB[i];
        }
        bArr[bArrB.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[bArrB.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }

    public static byte[] h(byte[] bArr, String str) {
        return i(bArr, ecs.b(str));
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        rcs rcsVar = new rcs();
        rcsVar.e(bArr);
        rcsVar.c();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ rcsVar.a());
        }
        return bArr3;
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        byte[] bArr3;
        int i3;
        if (i < 0 || i > bArr2.length || i + i2 > bArr2.length) {
            throw new IllegalArgumentException("start = " + i + " len = " + i2);
        }
        if (z) {
            bArr3 = bArr2;
            i3 = i;
        } else {
            bArr3 = new byte[i2];
            i3 = 0;
        }
        rcs rcsVar = new rcs();
        rcsVar.e(bArr);
        rcsVar.c();
        for (int i4 = 0; i4 < i2; i4++) {
            bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ rcsVar.a());
        }
        return bArr3;
    }

    public byte a() {
        int i = (this.f32425b + 1) % 256;
        this.f32425b = i;
        int iB = (this.c + b(this.f32424a[i])) % 256;
        this.c = iB;
        f(this.f32424a, this.f32425b, iB);
        byte[] bArr = this.f32424a;
        return bArr[(b(bArr[this.f32425b]) + b(this.f32424a[this.c])) % 256];
    }

    public final void c() {
        this.c = 0;
        this.f32425b = 0;
    }

    public final void d(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f32424a[i2] = (byte) i2;
        }
        this.c = 0;
        this.f32425b = 0;
        while (true) {
            int i3 = this.f32425b;
            if (i3 >= i) {
                break;
            }
            int iB = ((this.c + b(this.f32424a[i3])) + b(bArr[this.f32425b % length])) % 256;
            this.c = iB;
            f(this.f32424a, this.f32425b, iB);
            this.f32425b++;
        }
        if (i != 256) {
            this.d = ((this.c + b(this.f32424a[i])) + b(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("S_");
            int i4 = i - 1;
            sb.append(i4);
            sb.append(":");
            for (int i5 = 0; i5 <= i; i5++) {
                sb.append(" ");
                sb.append(b(this.f32424a[i5]));
            }
            sb.append("   j_");
            sb.append(i4);
            sb.append("=");
            sb.append(this.c);
            sb.append("   j_");
            sb.append(i);
            sb.append("=");
            sb.append(this.d);
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i4);
            sb.append("]=");
            sb.append(b(this.f32424a[this.c]));
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i);
            sb.append("]=");
            sb.append(b(this.f32424a[this.d]));
            if (this.f32424a[1] != 0) {
                sb.append("   S[1]!=0");
            }
            x9s.o(sb.toString());
        }
    }

    public final void e(byte[] bArr) {
        d(256, bArr, false);
    }
}
