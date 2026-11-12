package defpackage;

import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class xq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f39344b;

    public xq1(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.f39343a = bArr;
        if (bArr2 == null) {
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        this.f39344b = bArr2;
    }

    public byte[] a() {
        return this.f39344b;
    }

    public byte[] b() {
        return this.f39343a;
    }
}
