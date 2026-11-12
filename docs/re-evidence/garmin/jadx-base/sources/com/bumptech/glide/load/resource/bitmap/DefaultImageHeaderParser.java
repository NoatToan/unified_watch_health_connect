package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import qj.l;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f28573a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f28574b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f28575c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int getUInt16();

        short getUInt8();

        int read(byte[] bArr, int i14);

        long skip(long j8);
    }

    public static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28576a;

        public a(ByteBuffer byteBuffer) {
            this.f28576a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int getUInt16() {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short getUInt8() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f28576a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & UnsignedBytes.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int read(byte[] bArr, int i14) {
            ByteBuffer byteBuffer = this.f28576a;
            int iMin = Math.min(i14, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j8) {
            ByteBuffer byteBuffer = this.f28576a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j8);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28577a;

        public b(byte[] bArr, int i14) {
            this.f28577a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i14);
        }

        public final short a(int i14) {
            ByteBuffer byteBuffer = this.f28577a;
            if (byteBuffer.remaining() - i14 >= 2) {
                return byteBuffer.getShort(i14);
            }
            return (short) -1;
        }
    }

    public static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f28578a;

        public c(InputStream inputStream) {
            this.f28578a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int getUInt16() {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short getUInt8() throws IOException {
            int i14 = this.f28578a.read();
            if (i14 != -1) {
                return (short) i14;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int read(byte[] bArr, int i14) throws Reader.EndOfFileException {
            int i15 = 0;
            int i16 = 0;
            while (i15 < i14 && (i16 = this.f28578a.read(bArr, i15, i14 - i15)) != -1) {
                i15 += i16;
            }
            if (i15 == 0 && i16 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i15;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j8) throws IOException {
            if (j8 < 0) {
                return 0L;
            }
            long j14 = j8;
            while (j14 > 0) {
                InputStream inputStream = this.f28578a;
                long jSkip = inputStream.skip(j14);
                if (jSkip > 0) {
                    j14 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j14--;
                }
            }
            return j8 - j14;
        }
    }

    public static int g(Reader reader, xi.b bVar) {
        try {
            int uInt16 = reader.getUInt16();
            if ((uInt16 & 65496) != 65496 && uInt16 != 19789 && uInt16 != 18761) {
                return -1;
            }
            int iK = k(reader, 225);
            if (iK != -1) {
                byte[] bArr = (byte[]) bVar.c(iK, byte[].class);
                try {
                    return l(reader, bArr, iK);
                } finally {
                    bVar.put(bArr);
                }
            }
        } catch (Reader.EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType h(Reader reader) {
        try {
            int uInt16 = reader.getUInt16();
            if (uInt16 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | reader.getUInt8();
            if (uInt8 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int uInt9 = (uInt8 << 8) | reader.getUInt8();
            if (uInt9 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.getUInt8() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (uInt9 == 1380533830) {
                reader.skip(4L);
                if (((reader.getUInt16() << 16) | reader.getUInt16()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int uInt17 = (reader.getUInt16() << 16) | reader.getUInt16();
                if ((uInt17 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i14 = uInt17 & 255;
                if (i14 != 88) {
                    if (i14 != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    reader.skip(4L);
                    return (reader.getUInt8() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                short uInt10 = reader.getUInt8();
                if ((uInt10 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (uInt10 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.getUInt16() << 16) | reader.getUInt16()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt18 = (reader.getUInt16() << 16) | reader.getUInt16();
            if (uInt18 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i15 = 0;
            boolean z14 = uInt18 == 1635150182;
            reader.skip(4L);
            int i16 = uInt9 - 16;
            if (i16 % 4 == 0) {
                while (i15 < 5 && i16 > 0) {
                    int uInt19 = (reader.getUInt16() << 16) | reader.getUInt16();
                    if (uInt19 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (uInt19 == 1635150182) {
                        z14 = true;
                    }
                    i15++;
                    i16 -= 4;
                }
            }
            return z14 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static boolean i(Reader reader, xi.b bVar) {
        if (h(reader) == ImageHeaderParser.ImageType.JPEG) {
            int iK = k(reader, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) bVar.c(iK, byte[].class);
                try {
                    if (reader.read(bArr, iK) != iK ? false : j(bArr, iK, f28574b)) {
                        bVar.put(bArr);
                        return true;
                    }
                    bVar.put(bArr);
                    iK = k(reader, 226);
                } catch (Throwable th3) {
                    bVar.put(bArr);
                    throw th3;
                }
            }
        }
        return false;
    }

    public static boolean j(byte[] bArr, int i14, byte[] bArr2) {
        boolean z14 = (bArr == null || bArr2 == null || i14 <= bArr2.length) ? false : true;
        if (z14) {
            for (int i15 = 0; i15 < bArr2.length; i15++) {
                if (bArr[i15] != bArr2[i15]) {
                    return false;
                }
            }
        }
        return z14;
    }

    public static int k(Reader reader, int i14) {
        short uInt8;
        while (reader.getUInt8() == 255 && (uInt8 = reader.getUInt8()) != 218 && uInt8 != 217) {
            int uInt16 = reader.getUInt16() - 2;
            if (uInt8 == i14) {
                return uInt16;
            }
            long j8 = uInt16;
            if (reader.skip(j8) != j8) {
                return -1;
            }
        }
        return -1;
    }

    public static int l(Reader reader, byte[] bArr, int i14) {
        short sA;
        int i15;
        int i16;
        if (reader.read(bArr, i14) == i14 && j(bArr, i14, f28573a)) {
            b bVar = new b(bArr, i14);
            short sA2 = bVar.a(6);
            ByteOrder byteOrder = sA2 != 18761 ? sA2 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
            ByteBuffer byteBuffer = bVar.f28577a;
            byteBuffer.order(byteOrder);
            int i17 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            short sA3 = bVar.a(i17 + 6);
            for (int i18 = 0; i18 < sA3; i18++) {
                int i19 = (i18 * 12) + i17 + 8;
                if (bVar.a(i19) == 274 && (sA = bVar.a(i19 + 2)) >= 1 && sA <= 12) {
                    int i24 = i19 + 4;
                    int i25 = byteBuffer.remaining() - i24 >= 4 ? byteBuffer.getInt(i24) : -1;
                    if (i25 >= 0 && (i15 = i25 + f28575c[sA]) <= 4 && (i16 = i19 + 8) >= 0 && i16 <= byteBuffer.remaining() && i15 >= 0 && i15 + i16 <= byteBuffer.remaining()) {
                        return bVar.a(i16);
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, xi.b bVar) {
        l.c(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        l.c(bVar, "Argument must not be null");
        return g(cVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean b(InputStream inputStream, xi.b bVar) {
        l.c(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        l.c(bVar, "Argument must not be null");
        return i(cVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        l.c(byteBuffer, "Argument must not be null");
        return h(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        l.c(inputStream, "Argument must not be null");
        return h(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(ByteBuffer byteBuffer, xi.b bVar) {
        l.c(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        l.c(bVar, "Argument must not be null");
        return i(aVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int f(ByteBuffer byteBuffer, xi.b bVar) {
        l.c(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        l.c(bVar, "Argument must not be null");
        return g(aVar, bVar);
    }
}
