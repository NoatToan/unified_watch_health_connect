package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33795b;
    public final snp.a c;
    public final int d;
    public final byte[] e;

    public smp(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        rk1.a((bArr2 == null) ^ (i == 0));
        this.f33794a = z;
        this.f33795b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new snp.a(a(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b2 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b2 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b2 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return 2;
            default:
                StringBuilder sb = new StringBuilder(str.length() + 68);
                sb.append("Unsupported protection scheme type '");
                sb.append(str);
                sb.append("'. Assuming AES-CTR crypto mode.");
                toe.h("TrackEncryptionBox", sb.toString());
            case 2:
            case 3:
                return 1;
        }
    }
}
