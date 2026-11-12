package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zox {
    private static final int[] e = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f54416a = new int[3];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 == 1) {
                    i2 ^= -306674912;
                }
            }
            e[i] = i2;
        }
    }

    public void b(char[] cArr, boolean z) {
        int[] iArr = this.f54416a;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (byte b2 : zqp.b(cArr, z)) {
            a((byte) (b2 & 255));
        }
    }

    public void a(byte b2) {
        int[] iArr = this.f54416a;
        iArr[0] = a(iArr[0], b2);
        int[] iArr2 = this.f54416a;
        int i = iArr2[1] + (iArr2[0] & 255);
        iArr2[1] = i;
        int i2 = (i * 134775813) + 1;
        iArr2[1] = i2;
        iArr2[2] = a(iArr2[2], (byte) (i2 >> 24));
    }

    private int a(int i, byte b2) {
        return (i >>> 8) ^ e[(b2 ^ i) & 255];
    }

    public byte b() {
        int i = this.f54416a[2] | 2;
        return (byte) ((i * (i ^ 1)) >>> 8);
    }
}
