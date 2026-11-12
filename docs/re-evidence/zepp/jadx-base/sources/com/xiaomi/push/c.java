package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private final byte[] a;
    private final int b;
    private int c;
    private final OutputStream d;

    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.a = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    private c(byte[] bArr, int i, int i2) {
        this.d = null;
        this.a = bArr;
        this.c = i;
        this.b = i + i2;
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int a(int i, int i2) {
        return c(i) + a(i2);
    }

    public static int a(int i, long j) {
        return c(i) + a(j);
    }

    public static int a(int i, com.xiaomi.push.a aVar) {
        return c(i) + a(aVar);
    }

    public static int a(int i, e eVar) {
        return c(i) + a(eVar);
    }

    public static int a(int i, String str) {
        return c(i) + a(str);
    }

    public static int a(int i, boolean z) {
        return c(i) + a(z);
    }

    public static int a(long j) {
        return b(j);
    }

    public static int a(com.xiaomi.push.a aVar) {
        return d(aVar.a()) + aVar.a();
    }

    public static int a(e eVar) {
        int iB = eVar.b();
        return d(iB) + iB;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(boolean z) {
        return 1;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i) {
        return new c(outputStream, new byte[i]);
    }

    public static c a(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int b(int i) {
        return d(i);
    }

    public static int b(int i, int i2) {
        return c(i) + b(i2);
    }

    public static int b(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int c(int i) {
        return d(f.b(i, 0));
    }

    public static int d(int i) {
        if ((i & com.alipay.sdk.m.n.a.g) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    private void d() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.a, 0, this.c);
        this.c = 0;
    }

    public int a() {
        if (this.d == null) {
            return this.b - this.c;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3616a() throws IOException {
        if (this.d != null) {
            d();
        }
    }

    public void a(byte b) throws IOException {
        if (this.c == this.b) {
            d();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3617a(int i) throws IOException {
        if (i >= 0) {
            m3634d(i);
        } else {
            m3632b(i);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3618a(int i, int i2) throws IOException {
        c(i, 0);
        m3617a(i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3619a(int i, long j) throws IOException {
        c(i, 0);
        m3624a(j);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3620a(int i, com.xiaomi.push.a aVar) throws IOException {
        c(i, 2);
        m3625a(aVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3621a(int i, e eVar) throws IOException {
        c(i, 2);
        m3626a(eVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3622a(int i, String str) throws IOException {
        c(i, 2);
        m3627a(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3623a(int i, boolean z) throws IOException {
        c(i, 0);
        m3628a(z);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3624a(long j) throws IOException {
        m3632b(j);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3625a(com.xiaomi.push.a aVar) throws IOException {
        byte[] bArrM3486a = aVar.m3486a();
        m3634d(bArrM3486a.length);
        a(bArrM3486a);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3626a(e eVar) throws IOException {
        m3634d(eVar.a());
        eVar.a(this);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3627a(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m3634d(bytes.length);
        a(bytes);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3628a(boolean z) throws IOException {
        m3633c(z ? 1 : 0);
    }

    public void a(byte[] bArr) throws IOException {
        m3629a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3629a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        d();
        if (i7 > this.b) {
            this.d.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        }
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3630b(int i) throws IOException {
        m3634d(i);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3631b(int i, int i2) throws IOException {
        c(i, 0);
        m3630b(i2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3632b(long j) throws IOException {
        while (((-128) & j) != 0) {
            m3633c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m3633c((int) j);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void m3633c(int i) throws IOException {
        a((byte) i);
    }

    public void c(int i, int i2) throws IOException {
        m3634d(f.b(i, i2));
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public void m3634d(int i) throws IOException {
        while ((i & com.alipay.sdk.m.n.a.g) != 0) {
            m3633c((i & 127) | 128);
            i >>>= 7;
        }
        m3633c(i);
    }
}
