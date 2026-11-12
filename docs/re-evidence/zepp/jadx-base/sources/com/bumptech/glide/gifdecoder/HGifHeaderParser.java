package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class HGifHeaderParser {
    private static final String e = "GifHeaderParser";
    private static final int f = 255;
    private static final int g = 44;
    private static final int h = 33;
    private static final int i = 59;
    private static final int j = 249;
    private static final int k = 255;
    private static final int l = 254;
    private static final int m = 1;
    private static final int n = 28;
    private static final int o = 2;
    private static final int p = 1;
    private static final int q = 128;
    private static final int r = 64;
    private static final int s = 7;
    private static final int t = 128;
    private static final int u = 7;
    public static final int v = 2;
    public static final int w = 10;
    private static final int x = 256;
    private ByteBuffer b;
    private GifHeader c;
    private final byte[] a = new byte[256];
    private int d = 0;

    private boolean a() {
        return this.c.b != 0;
    }

    private int b() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    private void c() {
        this.c.d.a = l();
        this.c.d.b = l();
        this.c.d.c = l();
        this.c.d.d = l();
        int iB = b();
        boolean z = (iB & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iB & 7) + 1);
        a aVar = this.c.d;
        aVar.e = (iB & 64) != 0;
        if (z) {
            aVar.k = e(iPow);
        } else {
            aVar.k = null;
        }
        this.c.d.j = this.b.position();
        o();
        if (a()) {
            return;
        }
        GifHeader gifHeader = this.c;
        gifHeader.c++;
        gifHeader.e.add(gifHeader.d);
    }

    private void d() {
        int iB = b();
        this.d = iB;
        if (iB <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                int i4 = this.d;
                if (i2 >= i4) {
                    return;
                }
                i3 = i4 - i2;
                this.b.get(this.a, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable(e, 3)) {
                    Log.d(e, "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.d, e2);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    @Nullable
    private int[] e(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable(e, 3)) {
                Log.d(e, "Format Error Reading Color Table", e2);
            }
            this.c.b = 1;
        }
        return iArr;
    }

    private void f() {
        g(Integer.MAX_VALUE);
    }

    private void g(int i2) {
        boolean z = false;
        while (!z && !a() && this.c.c <= i2) {
            int iB = b();
            if (iB != 0) {
                if (iB == 33) {
                    int iB2 = b();
                    if (iB2 == 1) {
                        n();
                    } else if (iB2 == j) {
                        this.c.d = new a();
                        h();
                    } else if (iB2 == 254) {
                        n();
                    } else if (iB2 != 255) {
                        n();
                    } else {
                        d();
                        StringBuilder sb = new StringBuilder();
                        for (int i3 = 0; i3 < 11; i3++) {
                            sb.append((char) this.a[i3]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            k();
                        } else {
                            n();
                        }
                    }
                } else if (iB == 44) {
                    GifHeader gifHeader = this.c;
                    if (gifHeader.d == null) {
                        gifHeader.d = new a();
                    }
                    c();
                } else if (iB != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
        }
    }

    private void h() {
        b();
        int iB = b();
        a aVar = this.c.d;
        int i2 = (iB & 28) >> 2;
        aVar.g = i2;
        if (i2 == 0) {
            aVar.g = 1;
        }
        aVar.f = (iB & 1) != 0;
        int iL = l();
        if (iL < 2) {
            iL = 10;
        }
        a aVar2 = this.c.d;
        aVar2.i = iL * 10;
        aVar2.h = b();
        b();
    }

    private void i() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) b());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        j();
        if (!this.c.h || a()) {
            return;
        }
        GifHeader gifHeader = this.c;
        gifHeader.a = e(gifHeader.i);
        GifHeader gifHeader2 = this.c;
        gifHeader2.l = gifHeader2.a[gifHeader2.j];
    }

    private void j() {
        this.c.f = l();
        this.c.g = l();
        int iB = b();
        GifHeader gifHeader = this.c;
        gifHeader.h = (iB & 128) != 0;
        gifHeader.i = (int) Math.pow(2.0d, (iB & 7) + 1);
        this.c.j = b();
        this.c.k = b();
    }

    private void k() {
        do {
            d();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!a());
    }

    private int l() {
        return this.b.getShort();
    }

    private void m() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new GifHeader();
        this.d = 0;
    }

    private void n() {
        int iB;
        do {
            iB = b();
            this.b.position(Math.min(this.b.position() + iB, this.b.limit()));
        } while (iB > 0);
    }

    private void o() {
        b();
        n();
    }

    public void clear() {
        this.b = null;
        this.c = null;
    }

    public boolean isAnimated() {
        i();
        if (!a()) {
            g(2);
        }
        return this.c.c > 1;
    }

    @NonNull
    public GifHeader parseHeader() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.c;
        }
        i();
        if (!a()) {
            f();
            GifHeader gifHeader = this.c;
            if (gifHeader.c < 0) {
                gifHeader.b = 1;
            }
        }
        return this.c;
    }

    public HGifHeaderParser setData(@NonNull ByteBuffer byteBuffer) {
        m();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public HGifHeaderParser setData(@Nullable byte[] bArr) {
        if (bArr != null) {
            setData(ByteBuffer.wrap(bArr));
        } else {
            this.b = null;
            this.c.b = 2;
        }
        return this;
    }
}
