package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
public final class ex extends ey {
    private byte[] a;
    private int b;
    private int c;

    @Override // com.xiaomi.push.ey
    public int a() {
        return this.b;
    }

    @Override // com.xiaomi.push.ey
    public int a(byte[] bArr, int i, int i2) {
        int iB = b();
        if (i2 > iB) {
            i2 = iB;
        }
        if (i2 > 0) {
            System.arraycopy(this.a, this.b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.xiaomi.push.ey
    public void a(int i) {
        this.b += i;
    }

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.ey
    /* JADX INFO: renamed from: a */
    public void mo3784a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.ey
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] mo3785a() {
        return this.a;
    }

    @Override // com.xiaomi.push.ey
    public int b() {
        return this.c - this.b;
    }

    public void b(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
    }
}
