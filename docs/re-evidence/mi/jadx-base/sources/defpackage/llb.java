package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class llb implements v7l {
    public static final byte[] h = {1};
    public static final Hashtable i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aw6 f25197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f25198b;
    public byte[] c;
    public long d;
    public ac8 e;
    public int f;
    public int g;

    static {
        Hashtable hashtable = new Hashtable();
        i = hashtable;
        hashtable.put("SHA-1", rcd.b(440));
        hashtable.put("SHA-224", rcd.b(440));
        hashtable.put(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, rcd.b(440));
        hashtable.put("SHA-512/256", rcd.b(440));
        hashtable.put("SHA-512/224", rcd.b(440));
        hashtable.put("SHA-384", rcd.b(888));
        hashtable.put("SHA-512", rcd.b(888));
    }

    public llb(aw6 aw6Var, int i2, ac8 ac8Var, byte[] bArr, byte[] bArr2) {
        if (i2 > imq.a(aw6Var)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (ac8Var.b() < i2) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f25197a = aw6Var;
        this.e = ac8Var;
        this.f = i2;
        this.g = ((Integer) i.get(aw6Var.getAlgorithmName())).intValue();
        byte[] bArrC = imq.c(this.f25197a, vj1.k(e(), bArr2, bArr), this.g);
        this.f25198b = bArrC;
        byte[] bArr3 = new byte[bArrC.length + 1];
        System.arraycopy(bArrC, 0, bArr3, 1, bArrC.length);
        this.c = imq.c(this.f25197a, bArr3, this.g);
        this.d = 1L;
    }

    private byte[] e() {
        byte[] bArrA = this.e.a();
        if (bArrA.length >= (this.f + 7) / 8) {
            return bArrA;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    @Override // defpackage.v7l
    public int a(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.d > 140737488355328L) {
            return -1;
        }
        if (z) {
            b(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            byte[] bArr3 = this.f25198b;
            byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
            bArr4[0] = 2;
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            System.arraycopy(bArr2, 0, bArr4, this.f25198b.length + 1, bArr2.length);
            c(this.f25198b, f(bArr4));
        }
        byte[] bArrG = g(this.f25198b, length);
        byte[] bArr5 = this.f25198b;
        byte[] bArr6 = new byte[bArr5.length + 1];
        System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
        bArr6[0] = 3;
        c(this.f25198b, f(bArr6));
        c(this.f25198b, this.c);
        long j = this.d;
        c(this.f25198b, new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
        this.d++;
        System.arraycopy(bArrG, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // defpackage.v7l
    public void b(byte[] bArr) {
        byte[] bArrC = imq.c(this.f25197a, vj1.l(h, this.f25198b, e(), bArr), this.g);
        this.f25198b = bArrC;
        byte[] bArr2 = new byte[bArrC.length + 1];
        bArr2[0] = 0;
        System.arraycopy(bArrC, 0, bArr2, 1, bArrC.length);
        this.c = imq.c(this.f25197a, bArr2, this.g);
        this.d = 1L;
    }

    public final void c(byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        for (int i3 = 1; i3 <= bArr2.length; i3++) {
            int i4 = (bArr[bArr.length - i3] & 255) + (bArr2[bArr2.length - i3] & 255) + i2;
            i2 = i4 > 255 ? 1 : 0;
            bArr[bArr.length - i3] = (byte) i4;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i5 = (bArr[bArr.length - length] & 255) + i2;
            i2 = i5 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i5;
        }
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        this.f25197a.update(bArr, 0, bArr.length);
        this.f25197a.doFinal(bArr2, 0);
    }

    public final byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[this.f25197a.c()];
        d(bArr, bArr2);
        return bArr2;
    }

    public final byte[] g(byte[] bArr, int i2) {
        int i3 = i2 / 8;
        int iC = i3 / this.f25197a.c();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i3];
        int iC2 = this.f25197a.c();
        byte[] bArr4 = new byte[iC2];
        for (int i4 = 0; i4 <= iC; i4++) {
            d(bArr2, bArr4);
            int i5 = i4 * iC2;
            int i6 = i3 - i5;
            if (i6 > iC2) {
                i6 = iC2;
            }
            System.arraycopy(bArr4, 0, bArr3, i5, i6);
            c(bArr2, h);
        }
        return bArr3;
    }
}
