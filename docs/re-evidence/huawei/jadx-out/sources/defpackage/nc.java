package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class nc {

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f42864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f42865b;
        public int d;

        public d() {
            this.f42865b = new int[256];
        }
    }

    public static byte[] b(byte[] bArr) {
        d dVarC;
        if (bArr == null || (dVarC = c("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return b(bArr, dVarC);
    }

    public static d c(String str) {
        if (str == null) {
            return null;
        }
        d dVar = new d();
        for (int i = 0; i < 256; i++) {
            dVar.f42865b[i] = i;
        }
        dVar.f42864a = 0;
        dVar.d = 0;
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = dVar.f42865b;
                int i4 = iArr[i3];
                i2 = ((cCharAt + i4) + i2) % 256;
                iArr[i3] = iArr[i2];
                iArr[i2] = i4;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return dVar;
    }

    public static byte[] b(byte[] bArr, d dVar) {
        if (bArr == null || dVar == null) {
            return null;
        }
        int i = dVar.f42864a;
        int i2 = dVar.d;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            int[] iArr = dVar.f42865b;
            int i4 = iArr[i];
            i2 = (i2 + i4) % 256;
            iArr[i] = iArr[i2];
            iArr[i2] = i4;
            int i5 = iArr[i];
            bArr[i3] = (byte) (iArr[(i5 + i4) % 256] ^ bArr[i3]);
        }
        dVar.f42864a = i;
        dVar.d = i2;
        return bArr;
    }
}
