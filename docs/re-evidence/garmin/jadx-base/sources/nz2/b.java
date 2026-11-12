package nz2;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f128383b = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128384a = 0;

    static {
        for (int i14 = 0; i14 < 256; i14++) {
            int i15 = 8;
            int i16 = i14;
            while (true) {
                i15--;
                if (i15 >= 0) {
                    i16 = (i16 & 1) != 0 ? (i16 >>> 1) ^ (-306674912) : i16 >>> 1;
                }
            }
            f128383b[i14] = i16;
        }
    }

    @Override // nz2.c
    public final long getValue() {
        return ((long) this.f128384a) & 4294967295L;
    }

    @Override // nz2.c
    public final void reset() {
        this.f128384a = 0;
    }

    @Override // nz2.c
    public final void update(byte[] bArr, int i14, int i15) {
        int i16 = ~this.f128384a;
        while (true) {
            i15--;
            if (i15 < 0) {
                this.f128384a = ~i16;
                return;
            }
            int i17 = i14 + 1;
            i16 = (i16 >>> 8) ^ f128383b[(bArr[i14] ^ i16) & 255];
            i14 = i17;
        }
    }
}
