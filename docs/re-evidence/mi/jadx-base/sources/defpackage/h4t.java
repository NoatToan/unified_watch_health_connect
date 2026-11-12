package defpackage;

import com.xiaomi.push.ki;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h4t {
    public int a() {
        return 0;
    }

    public abstract int b(byte[] bArr, int i, int i2);

    public void c(int i) {
    }

    public abstract void d(byte[] bArr, int i, int i2);

    public byte[] e() {
        return null;
    }

    public int f() {
        return -1;
    }

    public int g(byte[] bArr, int i, int i2) throws ki {
        int i3 = 0;
        while (i3 < i2) {
            int iB = b(bArr, i + i3, i2 - i3);
            if (iB <= 0) {
                throw new ki("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes.");
            }
            i3 += iB;
        }
        return i3;
    }
}
