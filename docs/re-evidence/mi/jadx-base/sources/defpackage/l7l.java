package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class l7l extends ezd implements qtr {
    public l7l(int i) {
        super(m(i));
    }

    public static int m(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
    }

    @Override // defpackage.qtr
    public int b(byte[] bArr, int i, int i2) {
        int iN = n(bArr, i, i2);
        reset();
        return iN;
    }

    @Override // defpackage.aw6
    public int doFinal(byte[] bArr, int i) {
        return b(bArr, i, c());
    }

    @Override // defpackage.aw6
    public String getAlgorithmName() {
        return "SHAKE" + this.e;
    }

    public int n(byte[] bArr, int i, int i2) {
        if (!this.f) {
            h(15, 4);
        }
        l(bArr, i, ((long) i2) * 8);
        return i2;
    }
}
