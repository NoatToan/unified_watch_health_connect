package defpackage;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes20.dex */
public class zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f54809a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f54811c;
    private String d;
    private final boolean e;

    public zzg(byte[] bArr) {
        this(bArr, 255, false);
    }

    public zzg(byte[] bArr, int i, boolean z) {
        this(bArr, i, z, false);
    }

    public zzg(byte[] bArr, int i, boolean z, boolean z2) {
        if (bArr == null) {
            throw new NullPointerException("bytes must not be null");
        }
        if (bArr.length > i) {
            throw new IllegalArgumentException("bytes length must be between 0 and " + i + " inclusive");
        }
        this.e = z2;
        this.f54811c = z ? Arrays.copyOf(bArr, bArr.length) : bArr;
        this.f54810b = Arrays.hashCode(bArr);
    }

    public String toString() {
        return "BYTES=" + a();
    }

    public final int hashCode() {
        return this.f54810b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzg)) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        if (((this.e || zzgVar.e) && getClass() != obj.getClass()) || this.f54810b != zzgVar.f54810b) {
            return false;
        }
        return Arrays.equals(this.f54811c, zzgVar.f54811c);
    }

    public final byte[] d() {
        return this.f54811c;
    }

    public final String a() {
        if (this.d == null) {
            this.d = zzp.b(this.f54811c);
        }
        return this.d;
    }

    public final boolean b() {
        return this.f54811c.length == 0;
    }

    public final int c() {
        return this.f54811c.length;
    }

    public static byte[] e(Random random, int i) {
        byte[] bArr = new byte[i];
        try {
            random.nextBytes(bArr);
            return bArr;
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("Number of bits per request limited ") && i > 4096) {
                byte[] bArr2 = new byte[4096];
                int i2 = 0;
                while (i2 < i) {
                    random.nextBytes(bArr2);
                    int iMin = Math.min(i - i2, 4096);
                    System.arraycopy(bArr2, 0, bArr, i2, iMin);
                    i2 += iMin;
                }
            }
            return bArr;
        }
    }

    public static byte[] b(zzg zzgVar, zzg zzgVar2) {
        return c(zzgVar.d(), zzgVar2.d());
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    public static void a(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
    }

    public static boolean c(zzg zzgVar, zzg zzgVar2) {
        if (zzgVar == zzgVar2) {
            return true;
        }
        if (zzgVar == null || zzgVar2 == null) {
            return false;
        }
        return zzgVar.equals(zzgVar2);
    }
}
