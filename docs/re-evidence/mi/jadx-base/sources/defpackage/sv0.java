package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class sv0 extends ewg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34011b;
    public final int c;
    public final int d;
    public final String e;
    public final byte[] f;

    public sv0(byte[] bArr, String str, int i, int i2, int i3) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        fnq.a(i);
        if (i2 <= a() + i3 + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f = Arrays.copyOf(bArr, bArr.length);
        this.e = str;
        this.f34010a = i;
        this.f34011b = i2;
        this.d = i3;
        this.c = i2 - 16;
    }

    public int a() {
        return this.f34010a + 8;
    }
}
