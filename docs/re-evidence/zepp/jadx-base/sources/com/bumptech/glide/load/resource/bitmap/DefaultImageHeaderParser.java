package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    private static final String a = "DfltImageHeaderParser";
    private static final int b = 4671814;
    private static final int c = -1991225785;
    public static final int d = 65496;
    private static final int e = 19789;
    private static final int f = 18761;
    private static final int i = 218;
    private static final int j = 217;
    public static final int k = 255;
    public static final int l = 225;
    private static final int m = 274;
    private static final int o = 1380533830;
    private static final int p = 1464156752;
    private static final int q = 1448097792;
    private static final int r = -256;
    private static final int s = 255;
    private static final int t = 88;
    private static final int u = 76;
    private static final int v = 16;
    private static final int w = 8;
    private static final String g = "Exif\u0000\u0000";
    public static final byte[] h = g.getBytes(Charset.forName("UTF-8"));
    private static final int[] n = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {
        private final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public int a() {
            return ((b() << 8) & 65280) | (b() & 255);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public int b() {
            if (this.a.remaining() < 1) {
                return -1;
            }
            return this.a.get();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public short c() {
            return (short) (b() & 255);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public int read(byte[] bArr, int i) {
            int iMin = Math.min(i, this.a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public long skip(long j) {
            int iMin = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {
        private final ByteBuffer a;

        public b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean c(int i, int i2) {
            return this.a.remaining() - i >= i2;
        }

        public short a(int i) {
            if (c(i, 2)) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        public int b(int i) {
            if (c(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }

        public int d() {
            return this.a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    public interface c {
        int a() throws IOException;

        int b() throws IOException;

        short c() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    public static final class d implements c {
        private final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public int a() throws IOException {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public int b() throws IOException {
            return this.a.read();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public short c() throws IOException {
            return (short) (this.a.read() & 255);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int i3 = this.a.read(bArr, i - i2, i2);
                if (i3 == -1) {
                    break;
                }
                i2 -= i3;
            }
            return i - i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.a.skip(j2);
                if (jSkip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    private static int a(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    private int b(c cVar, ArrayPool arrayPool) throws IOException {
        int iA = cVar.a();
        if (!d(iA)) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Parser doesn't handle magic number: " + iA);
            }
            return -1;
        }
        int iF = f(cVar);
        if (iF == -1) {
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) arrayPool.get(iF, byte[].class);
        try {
            return h(cVar, bArr, iF);
        } finally {
            arrayPool.put(bArr);
        }
    }

    @NonNull
    private ImageHeaderParser.ImageType c(c cVar) throws IOException {
        int iA = cVar.a();
        if (iA == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int iA2 = ((iA << 16) & SupportMenu.CATEGORY_MASK) | (cVar.a() & 65535);
        if (iA2 == c) {
            cVar.skip(21L);
            return cVar.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((iA2 >> 8) == b) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (iA2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        cVar.skip(4L);
        if ((((cVar.a() << 16) & SupportMenu.CATEGORY_MASK) | (cVar.a() & 65535)) != p) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA3 = ((cVar.a() << 16) & SupportMenu.CATEGORY_MASK) | (cVar.a() & 65535);
        if ((iA3 & (-256)) != q) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i2 = iA3 & 255;
        if (i2 == 88) {
            cVar.skip(4L);
            return (cVar.b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i2 != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        cVar.skip(4L);
        return (cVar.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }

    private static boolean d(int i2) {
        return (i2 & d) == 65496 || i2 == e || i2 == f;
    }

    private boolean e(byte[] bArr, int i2) {
        boolean z = bArr != null && i2 > h.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = h;
                if (i3 >= bArr2.length) {
                    break;
                }
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
                i3++;
            }
        }
        return z;
    }

    private int f(c cVar) throws IOException {
        short sC;
        int iA;
        long j2;
        long jSkip;
        do {
            short sC2 = cVar.c();
            if (sC2 != 255) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Unknown segmentId=" + ((int) sC2));
                }
                return -1;
            }
            sC = cVar.c();
            if (sC == i) {
                return -1;
            }
            if (sC == j) {
                if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iA = cVar.a() - 2;
            if (sC == 225) {
                return iA;
            }
            j2 = iA;
            jSkip = cVar.skip(j2);
        } while (jSkip == j2);
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Unable to skip enough data, type: " + ((int) sC) + ", wanted to skip: " + iA + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    private static int g(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA != f) {
            if (sA != e && Log.isLoggable(a, 3)) {
                Log.d(a, "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i2 = 0; i2 < sA2; i2++) {
            int iA = a(iB, i2);
            short sA3 = bVar.a(iA);
            if (sA3 == m) {
                short sA4 = bVar.a(iA + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iA + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Got tagIndex=" + i2 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i3 = iB2 + n[sA4];
                        if (i3 <= 4) {
                            int i4 = iA + 8;
                            if (i4 >= 0 && i4 <= bVar.d()) {
                                if (i3 >= 0 && i3 + i4 <= bVar.d()) {
                                    return bVar.a(i4);
                                }
                                if (Log.isLoggable(a, 3)) {
                                    Log.d(a, "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                }
                            } else if (Log.isLoggable(a, 3)) {
                                Log.d(a, "Illegal tagValueOffset=" + i4 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable(a, 3)) {
                            Log.d(a, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                        }
                    } else if (Log.isLoggable(a, 3)) {
                        Log.d(a, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(a, 3)) {
                    Log.d(a, "Got invalid format code = " + ((int) sA4));
                }
            }
        }
        return -1;
    }

    private int h(c cVar, byte[] bArr, int i2) throws IOException {
        int i3 = cVar.read(bArr, i2);
        if (i3 == i2) {
            if (e(bArr, i2)) {
                return g(new b(bArr, i2));
            }
            if (Log.isLoggable(a, 3)) {
                Log.d(a, "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable(a, 3)) {
            Log.d(a, "Unable to read exif segment data, length: " + i2 + ", actually read: " + i3);
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        return b(new d((InputStream) Preconditions.checkNotNull(inputStream)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType getType(@NonNull InputStream inputStream) throws IOException {
        return c(new d((InputStream) Preconditions.checkNotNull(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType getType(@NonNull ByteBuffer byteBuffer) throws IOException {
        return c(new a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException {
        return b(new a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }
}
