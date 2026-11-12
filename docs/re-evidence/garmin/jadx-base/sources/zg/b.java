package zg;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: zg.b$b, reason: collision with other inner class name */
    public static class C3815b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f204670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f204671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f204672c;

        public C3815b() {
            this.f204670a = new int[256];
        }
    }

    public static byte[] a(byte[] bArr) {
        C3815b c3815b = new C3815b();
        for (int i14 = 0; i14 < 256; i14++) {
            c3815b.f204670a[i14] = i14;
        }
        c3815b.f204671b = 0;
        c3815b.f204672c = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < 256; i17++) {
            try {
                char cCharAt = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK".charAt(i15);
                int[] iArr = c3815b.f204670a;
                int i18 = iArr[i17];
                i16 = ((cCharAt + i18) + i16) % 256;
                iArr[i17] = iArr[i16];
                iArr[i16] = i18;
                i15 = (i15 + 1) % 256;
            } catch (Exception unused) {
                c3815b = null;
            }
        }
        if (c3815b == null) {
            return null;
        }
        int i19 = c3815b.f204671b;
        int i24 = c3815b.f204672c;
        for (int i25 = 0; i25 < bArr.length; i25++) {
            i19 = (i19 + 1) % 256;
            int[] iArr2 = c3815b.f204670a;
            int i26 = iArr2[i19];
            i24 = (i24 + i26) % 256;
            iArr2[i19] = iArr2[i24];
            iArr2[i24] = i26;
            bArr[i25] = (byte) (iArr2[(iArr2[i19] + i26) % 256] ^ bArr[i25]);
        }
        c3815b.f204671b = i19;
        c3815b.f204672c = i24;
        return bArr;
    }
}
