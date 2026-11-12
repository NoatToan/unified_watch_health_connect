package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.work.WorkInfo;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.a6i;
import defpackage.nj1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6973a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6974b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    public static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f6975a;

        public a(ByteBuffer byteBuffer) {
            this.f6975a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws Reader.EndOfFileException {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws Reader.EndOfFileException {
            if (this.f6975a.remaining() >= 1) {
                return (short) (this.f6975a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) {
            int iMin = Math.min(i, this.f6975a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f6975a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            int iMin = (int) Math.min(this.f6975a.remaining(), j);
            ByteBuffer byteBuffer = this.f6975a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f6976a;

        public b(byte[] bArr, int i) {
            this.f6976a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public short a(int i) {
            if (c(i, 2)) {
                return this.f6976a.getShort(i);
            }
            return (short) -1;
        }

        public int b(int i) {
            if (c(i, 4)) {
                return this.f6976a.getInt(i);
            }
            return -1;
        }

        public final boolean c(int i, int i2) {
            return this.f6976a.remaining() - i >= i2;
        }

        public int d() {
            return this.f6976a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f6976a.order(byteOrder);
        }
    }

    public static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f6977a;

        public c(InputStream inputStream) {
            this.f6977a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            return (getUInt8() << 8) | getUInt8();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            int i = this.f6977a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f6977a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f6977a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f6977a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    public static int e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    public static boolean h(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    public static int k(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA != 18761) {
            if (sA != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append((int) sA);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i = 0; i < sA2; i++) {
            int iE = e(iB, i);
            short sA3 = bVar.a(iE);
            if (sA3 == 274) {
                short sA4 = bVar.a(iE + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iE + 4);
                    if (iB2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append((int) sA3);
                            sb2.append(" formatCode=");
                            sb2.append((int) sA4);
                            sb2.append(" componentCount=");
                            sb2.append(iB2);
                        }
                        int i2 = iB2 + f6974b[sA4];
                        if (i2 <= 4) {
                            int i3 = iE + 8;
                            if (i3 >= 0 && i3 <= bVar.d()) {
                                if (i2 >= 0 && i2 + i3 <= bVar.d()) {
                                    return bVar.a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal number of bytes for TI tag data tagType=");
                                    sb3.append((int) sA3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Illegal tagValueOffset=");
                                sb4.append(i3);
                                sb4.append(" tagType=");
                                sb4.append((int) sA3);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append((int) sA4);
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append((int) sA4);
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(InputStream inputStream, nj1 nj1Var) throws IOException {
        return f(new c((InputStream) a6i.d(inputStream)), (nj1) a6i.d(nj1Var));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        return g(new c((InputStream) a6i.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) a6i.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(ByteBuffer byteBuffer, nj1 nj1Var) throws IOException {
        return f(new a((ByteBuffer) a6i.d(byteBuffer)), (nj1) a6i.d(nj1Var));
    }

    public final int f(Reader reader, nj1 nj1Var) throws IOException {
        try {
            int uInt16 = reader.getUInt16();
            if (!h(uInt16)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(uInt16);
                }
                return -1;
            }
            int iJ = j(reader);
            if (iJ == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) nj1Var.a(iJ, byte[].class);
            try {
                return l(reader, bArr, iJ);
            } finally {
                nj1Var.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType g(Reader reader) throws IOException {
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
            if (uInt9 != 1380533830) {
                return m(reader, uInt9);
            }
            reader.skip(4L);
            if (((reader.getUInt16() << 16) | reader.getUInt16()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt17 = (reader.getUInt16() << 16) | reader.getUInt16();
            if ((uInt17 & WorkInfo.STOP_REASON_NOT_STOPPED) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = uInt17 & 255;
            if (i != 88) {
                if (i != 76) {
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
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final boolean i(byte[] bArr, int i) {
        boolean z = bArr != null && i > f6973a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f6973a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    public final int j(Reader reader) throws IOException {
        short uInt8;
        int uInt16;
        long j;
        long jSkip;
        do {
            short uInt9 = reader.getUInt8();
            if (uInt9 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) uInt9);
                }
                return -1;
            }
            uInt8 = reader.getUInt8();
            if (uInt8 == 218) {
                return -1;
            }
            if (uInt8 == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            uInt16 = reader.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            j = uInt16;
            jSkip = reader.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append((int) uInt8);
            sb2.append(", wanted to skip: ");
            sb2.append(uInt16);
            sb2.append(", but actually skipped: ");
            sb2.append(jSkip);
        }
        return -1;
    }

    public final int l(Reader reader, byte[] bArr, int i) throws IOException {
        int i2 = reader.read(bArr, i);
        if (i2 == i) {
            if (i(bArr, i)) {
                return k(new b(bArr, i));
            }
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to read exif segment data, length: ");
            sb.append(i);
            sb.append(", actually read: ");
            sb.append(i2);
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType m(Reader reader, int i) throws IOException {
        if (((reader.getUInt16() << 16) | reader.getUInt16()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int uInt16 = (reader.getUInt16() << 16) | reader.getUInt16();
        if (uInt16 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        boolean z = uInt16 == 1635150182;
        reader.skip(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int uInt17 = (reader.getUInt16() << 16) | reader.getUInt16();
                if (uInt17 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (uInt17 == 1635150182) {
                    z = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
