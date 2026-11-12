package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class StandardGifDecoder implements GifDecoder {
    private static final int A = 255;

    @ColorInt
    private static final int B = 0;
    private static final String v = "StandardGifDecoder";
    private static final int w = 4096;
    private static final int x = -1;
    private static final int y = -1;
    private static final int z = 4;

    @ColorInt
    private int[] a;

    @ColorInt
    private final int[] b;
    private final GifDecoder.BitmapProvider c;
    private ByteBuffer d;
    private byte[] e;
    private GifHeaderParser f;
    private short[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;

    @ColorInt
    private int[] k;
    private int l;
    private GifHeader m;
    private Bitmap n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;

    @Nullable
    private Boolean t;

    @NonNull
    private Bitmap.Config u;

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    @ColorInt
    private int a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.q + i; i9++) {
            byte[] bArr = this.j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.q + i11; i12++) {
            byte[] bArr2 = this.j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    private void b(a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.k;
        int i6 = aVar.d;
        int i7 = this.q;
        int i8 = i6 / i7;
        int i9 = aVar.b / i7;
        int i10 = aVar.c / i7;
        int i11 = aVar.a / i7;
        boolean z2 = this.l == 0;
        int i12 = this.s;
        int i13 = this.r;
        byte[] bArr = this.j;
        int[] iArr2 = this.a;
        Boolean bool = this.t;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i8) {
            Boolean bool2 = bool;
            if (aVar.e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 == 3) {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    } else if (i18 != 4) {
                        i17 = i18;
                    } else {
                        i17 = i18;
                        i16 = 1;
                        i14 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z3 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * aVar.c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 < i22) {
                            int iA = a(i24, i28, aVar.c);
                            if (iA != 0) {
                                iArr[i29] = iA;
                            } else if (z2 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i24 += i7;
                            i29++;
                            i10 = i4;
                        }
                    }
                }
                bool = bool2;
                i15++;
                i9 = i5;
                i10 = i4;
                i8 = i;
                i16 = i3;
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        Boolean bool3 = bool;
        if (this.t == null) {
            this.t = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void c(a aVar) {
        a aVar2 = aVar;
        int[] iArr = this.k;
        int i = aVar2.d;
        int i2 = aVar2.b;
        int i3 = aVar2.c;
        int i4 = aVar2.a;
        boolean z2 = this.l == 0;
        int i5 = this.s;
        byte[] bArr = this.j;
        int[] iArr2 = this.a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = aVar2.c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            aVar2 = aVar;
        }
        this.t = Boolean.valueOf(this.t == null && z2 && b != -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16, types: [short] */
    /* JADX WARN: Type inference failed for: r7v18 */
    private void d(a aVar) {
        int i;
        int i2;
        short s;
        this = this;
        if (aVar != null) {
            this.d.position(aVar.j);
        }
        if (aVar == null) {
            GifHeader gifHeader = this.m;
            i = gifHeader.f;
            i2 = gifHeader.g;
        } else {
            i = aVar.c;
            i2 = aVar.d;
        }
        int i3 = i * i2;
        byte[] bArr = this.j;
        if (bArr == null || bArr.length < i3) {
            this.j = this.c.obtainByteArray(i3);
        }
        byte[] bArr2 = this.j;
        if (this.g == null) {
            this.g = new short[4096];
        }
        short[] sArr = this.g;
        if (this.h == null) {
            this.h = new byte[4096];
        }
        byte[] bArr3 = this.h;
        if (this.i == null) {
            this.i = new byte[4097];
        }
        byte[] bArr4 = this.i;
        int iH = h();
        int i4 = 1 << iH;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iH + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = this.e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int iG = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        while (i9 < i3) {
            if (iG == 0) {
                iG = g();
                if (iG <= 0) {
                    this.p = 3;
                    break;
                }
                i14 = 0;
            }
            i16 += (bArr5[i14] & 255) << i15;
            i14++;
            iG--;
            int i21 = i15 + 8;
            i12 = i12;
            i18 = i18;
            i11 = i11;
            i7 = i7;
            i20 = i20;
            while (true) {
                if (i21 < i11) {
                    i15 = i21;
                    break;
                }
                int i22 = i6;
                int i23 = i16 & i13;
                i16 >>= i11;
                i21 -= i11;
                if (i23 == i4) {
                    i13 = i8;
                    i11 = i7;
                    i12 = i22;
                    i6 = i12;
                    i18 = -1;
                } else {
                    if (i23 == i5) {
                        i15 = i21;
                        i6 = i22;
                        break;
                    }
                    if (i18 == -1) {
                        bArr2[i17] = bArr3[i23];
                        i17++;
                        i9++;
                        i20 = i23;
                        i18 = i20;
                        i6 = i22;
                        i21 = i21;
                    } else {
                        if (i23 >= i12) {
                            bArr4[i19] = (byte) i20;
                            i19++;
                            s = i18;
                        } else {
                            s = i23;
                        }
                        while (s >= i4) {
                            bArr4[i19] = bArr3[s];
                            i19++;
                            s = sArr[s];
                        }
                        i20 = bArr3[s] & 255;
                        byte b = (byte) i20;
                        bArr2[i17] = b;
                        while (true) {
                            i17++;
                            i9++;
                            if (i19 <= 0) {
                                break;
                            }
                            i19--;
                            bArr2[i17] = bArr4[i19];
                        }
                        byte[] bArr6 = bArr4;
                        if (i12 < 4096) {
                            sArr[i12] = (short) i18;
                            bArr3[i12] = b;
                            i12++;
                            if ((i12 & i13) == 0 && i12 < 4096) {
                                i11++;
                                i13 += i12;
                            }
                        }
                        i18 = i23;
                        i6 = i22;
                        i21 = i21;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i17, i3, (byte) 0);
    }

    @NonNull
    private GifHeaderParser e() {
        if (this.f == null) {
            this.f = new GifHeaderParser();
        }
        return this.f;
    }

    private Bitmap f() {
        Boolean bool = this.t;
        Bitmap bitmapObtain = this.c.obtain(this.s, this.r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.u);
        bitmapObtain.setHasAlpha(true);
        return bitmapObtain;
    }

    private int g() {
        int iH = h();
        if (iH <= 0) {
            return iH;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(this.e, 0, Math.min(iH, byteBuffer.remaining()));
        return iH;
    }

    private int h() {
        return this.d.get() & 255;
    }

    private Bitmap i(a aVar, a aVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.k;
        int i3 = 0;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.n;
            if (bitmap2 != null) {
                this.c.release(bitmap2);
            }
            this.n = null;
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null && aVar2.g == 3 && this.n == null) {
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null && (i2 = aVar2.g) > 0) {
            if (i2 == 2) {
                if (!aVar.f) {
                    GifHeader gifHeader = this.m;
                    int i4 = gifHeader.l;
                    if (aVar.k == null || gifHeader.j != aVar.h) {
                        i3 = i4;
                    }
                } else if (this.l == 0) {
                    this.t = Boolean.TRUE;
                }
                int i5 = aVar2.d;
                int i6 = this.q;
                int i7 = i5 / i6;
                int i8 = aVar2.b / i6;
                int i9 = aVar2.c / i6;
                int i10 = aVar2.a / i6;
                int i11 = this.s;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.s;
                }
            } else if (i2 == 3 && (bitmap = this.n) != null) {
                int i16 = this.s;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.r);
            }
        }
        d(aVar);
        if (aVar.e || this.q != 1) {
            b(aVar);
        } else {
            c(aVar);
        }
        if (this.o && ((i = aVar.g) == 0 || i == 1)) {
            if (this.n == null) {
                this.n = f();
            }
            Bitmap bitmap3 = this.n;
            int i17 = this.s;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.r);
        }
        Bitmap bitmapF = f();
        int i18 = this.s;
        bitmapF.setPixels(iArr, 0, i18, 0, 0, i18, this.r);
        return bitmapF;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.l = (this.l + 1) % this.m.c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.m = null;
        byte[] bArr = this.j;
        if (bArr != null) {
            this.c.release(bArr);
        }
        int[] iArr = this.k;
        if (iArr != null) {
            this.c.release(iArr);
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.c.release(bitmap);
        }
        this.n = null;
        this.d = null;
        this.t = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            this.c.release(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return this.d.limit() + this.j.length + (this.k.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public ByteBuffer getData() {
        return this.d;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int i) {
        if (i >= 0) {
            GifHeader gifHeader = this.m;
            if (i < gifHeader.c) {
                return gifHeader.e.get(i).i;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.m.c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.m.g;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        int i = this.m.m;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.m.m;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        int i;
        if (this.m.c <= 0 || (i = this.l) < 0) {
            return 0;
        }
        return getDelay(i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    public synchronized Bitmap getNextFrame() {
        if (this.m.c <= 0 || this.l < 0) {
            String str = v;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.m.c + ", framePointer=" + this.l);
            }
            this.p = 1;
        }
        int i = this.p;
        if (i != 1 && i != 2) {
            this.p = 0;
            if (this.e == null) {
                this.e = this.c.obtainByteArray(255);
            }
            a aVar = this.m.e.get(this.l);
            int i2 = this.l - 1;
            a aVar2 = i2 >= 0 ? this.m.e.get(i2) : null;
            int[] iArr = aVar.k;
            if (iArr == null) {
                iArr = this.m.a;
            }
            this.a = iArr;
            if (iArr != null) {
                if (aVar.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[aVar.h] = 0;
                }
                return i(aVar, aVar2);
            }
            String str2 = v;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "No valid color table found for frame #" + this.l);
            }
            this.p = 1;
            return null;
        }
        String str3 = v;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.p);
        }
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        int i = this.m.m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.m.f;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(@Nullable InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i2 = inputStream.read(bArr, 0, 16384);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Log.w(v, "Error reading data from stream", e);
            }
        } else {
            this.p = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w(v, "Error closing stream", e2);
            }
        }
        return this.p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.l = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider) {
        this.b = new int[256];
        this.u = Bitmap.Config.ARGB_8888;
        this.c = bitmapProvider;
        this.m = new GifHeader();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer, int i) {
        try {
            if (i > 0) {
                int iHighestOneBit = Integer.highestOneBit(i);
                this.p = 0;
                this.m = gifHeader;
                this.l = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.o = false;
                Iterator<a> it2 = gifHeader.e.iterator();
                while (it2.hasNext()) {
                    if (it2.next().g == 3) {
                        this.o = true;
                        break;
                    }
                }
                this.q = iHighestOneBit;
                int i2 = gifHeader.f;
                this.s = i2 / iHighestOneBit;
                int i3 = gifHeader.g;
                this.r = i3 / iHighestOneBit;
                this.j = this.c.obtainByteArray(i2 * i3);
                this.k = this.c.obtainIntArray(this.s * this.r);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(@Nullable byte[] bArr) {
        GifHeader header = e().setData(bArr).parseHeader();
        this.m = header;
        if (bArr != null) {
            setData(header, bArr);
        }
        return this.p;
    }
}
