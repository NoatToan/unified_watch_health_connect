package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes20.dex */
public final class zzf extends zzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f54807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54808b;

    public zzf(byte[] bArr) {
        this(bArr, true);
    }

    public zzf(byte[] bArr, boolean z) {
        this(z ? Arrays.copyOf(bArr, bArr.length) : bArr, 0, bArr.length);
    }

    public zzf(byte[] bArr, int i, int i2) {
        this(new zzh.b(bArr, i, i2));
    }

    public zzf(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.f54807a = this.f54812c;
        this.f54808b = this.d;
    }

    public void c() {
        this.f54807a = this.f54812c;
        this.f54808b = this.d;
        this.e.mark(0);
    }

    public void h() {
        try {
            this.e.reset();
        } catch (IOException unused) {
        }
        this.f54812c = this.f54807a;
        this.d = this.f54808b;
    }

    @Override // defpackage.zzh
    public void a() {
        try {
            this.e.skip(this.e.available());
        } catch (IOException unused) {
        }
        super.a();
    }

    @Override // defpackage.zzh
    public byte[] b(int i) {
        int iG = g();
        if (i < 0) {
            i = iG;
        } else if (i > iG) {
            throw new IllegalArgumentException("requested " + i + " bytes exceeds available " + iG + " bytes.");
        }
        return super.b(i);
    }

    public byte[] i() {
        return b(-1);
    }

    public void b(String str) {
        int iB = b();
        if (iB <= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " not finished! " + iB + " bits left.");
    }

    public boolean d() {
        return g() > 0;
    }

    public boolean h(int i) {
        return g() >= i;
    }

    public int b() {
        return (g() * 8) + this.d + 1;
    }

    private int g() {
        try {
            return this.e.available();
        } catch (IOException unused) {
            return -1;
        }
    }
}
