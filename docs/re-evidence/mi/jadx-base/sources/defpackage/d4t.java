package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class d4t extends h4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g2t f15089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15090b;

    public d4t(int i) {
        this.f15089a = new g2t(i);
    }

    @Override // defpackage.h4t
    public int b(byte[] bArr, int i, int i2) {
        byte[] bArrB = this.f15089a.b();
        if (i2 > this.f15089a.a() - this.f15090b) {
            i2 = this.f15089a.a() - this.f15090b;
        }
        if (i2 > 0) {
            System.arraycopy(bArrB, this.f15090b, bArr, i, i2);
            this.f15090b += i2;
        }
        return i2;
    }

    @Override // defpackage.h4t
    public void d(byte[] bArr, int i, int i2) throws IOException {
        this.f15089a.write(bArr, i, i2);
    }

    public int h() {
        return this.f15089a.size();
    }
}
