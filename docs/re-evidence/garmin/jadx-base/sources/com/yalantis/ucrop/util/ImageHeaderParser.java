package com.yalantis.ucrop.util;

import android.text.TextUtils;
import d8.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class ImageHeaderParser {
    private static final int EXIF_MAGIC_NUMBER = 65496;
    private static final int EXIF_SEGMENT_TYPE = 225;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int SEGMENT_SOS = 218;
    private static final int SEGMENT_START_ID = 255;
    private static final String TAG = "ImageHeaderParser";
    public static final int UNKNOWN_ORIENTATION = -1;
    private final Reader reader;
    private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\u0000\u0000";
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = JPEG_EXIF_SEGMENT_PREAMBLE.getBytes(Charset.forName("UTF-8"));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static class RandomAccessReader {
        private final ByteBuffer data;

        public RandomAccessReader(byte[] bArr, int i14) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i14);
        }

        public short getInt16(int i14) {
            return this.data.getShort(i14);
        }

        public int getInt32(int i14) {
            return this.data.getInt(i14);
        }

        public int length() {
            return this.data.remaining();
        }

        public void order(ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }
    }

    public interface Reader {
        int getUInt16();

        short getUInt8();

        int read(byte[] bArr, int i14);

        long skip(long j8);
    }

    public static class StreamReader implements Reader {

        /* JADX INFO: renamed from: is, reason: collision with root package name */
        private final InputStream f54869is;

        public StreamReader(InputStream inputStream) {
            this.f54869is = inputStream;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int getUInt16() {
            return ((this.f54869is.read() << 8) & 65280) | (this.f54869is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public short getUInt8() {
            return (short) (this.f54869is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i14) throws IOException {
            int i15 = i14;
            while (i15 > 0) {
                int i16 = this.f54869is.read(bArr, i14 - i15, i15);
                if (i16 == -1) {
                    break;
                }
                i15 -= i16;
            }
            return i14 - i15;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public long skip(long j8) throws IOException {
            if (j8 < 0) {
                return 0L;
            }
            long j14 = j8;
            while (j14 > 0) {
                long jSkip = this.f54869is.skip(j14);
                if (jSkip <= 0) {
                    if (this.f54869is.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j14 -= jSkip;
            }
            return j8 - j14;
        }
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.reader = new StreamReader(inputStream);
    }

    private static int calcTagOffset(int i14, int i15) {
        return (i15 * 12) + i14 + 2;
    }

    public static void copyExif(a aVar, int i14, int i15, String str) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        try {
            a aVar2 = new a(str);
            for (int i16 = 0; i16 < 22; i16++) {
                String str2 = strArr[i16];
                String strC = aVar.c(str2);
                if (!TextUtils.isEmpty(strC)) {
                    aVar2.G(str2, strC);
                }
            }
            aVar2.G("ImageWidth", String.valueOf(i14));
            aVar2.G("ImageLength", String.valueOf(i15));
            aVar2.G("Orientation", "0");
            aVar2.C();
        } catch (IOException e4) {
            e4.getMessage();
        }
    }

    private static boolean handles(int i14) {
        return (i14 & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i14 == MOTOROLA_TIFF_MAGIC_NUMBER || i14 == INTEL_TIFF_MAGIC_NUMBER;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i14) {
        boolean z14 = bArr != null && i14 > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z14) {
            int i15 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
                if (i15 >= bArr2.length) {
                    break;
                }
                if (bArr[i15] != bArr2[i15]) {
                    return false;
                }
                i15++;
            }
        }
        return z14;
    }

    private int moveToExifSegmentAndGetLength() {
        short uInt8;
        while (this.reader.getUInt8() == 255 && (uInt8 = this.reader.getUInt8()) != SEGMENT_SOS && uInt8 != MARKER_EOI) {
            int uInt16 = this.reader.getUInt16() - 2;
            if (uInt8 == EXIF_SEGMENT_TYPE) {
                return uInt16;
            }
            long j8 = uInt16;
            if (this.reader.skip(j8) != j8) {
                return -1;
            }
        }
        return -1;
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        short int16;
        int int32;
        int i14;
        int i15;
        short int17 = randomAccessReader.getInt16(6);
        ByteOrder byteOrder = (int17 != MOTOROLA_TIFF_MAGIC_NUMBER && int17 == INTEL_TIFF_MAGIC_NUMBER) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
        randomAccessReader.order(byteOrder);
        int int33 = randomAccessReader.getInt32(10) + 6;
        short int18 = randomAccessReader.getInt16(int33);
        for (int i16 = 0; i16 < int18; i16++) {
            int iCalcTagOffset = calcTagOffset(int33, i16);
            if (randomAccessReader.getInt16(iCalcTagOffset) == ORIENTATION_TAG_TYPE && (int16 = randomAccessReader.getInt16(iCalcTagOffset + 2)) >= 1 && int16 <= 12 && (int32 = randomAccessReader.getInt32(iCalcTagOffset + 4)) >= 0 && (i14 = int32 + BYTES_PER_FORMAT[int16]) <= 4 && (i15 = iCalcTagOffset + 8) >= 0 && i15 <= randomAccessReader.length() && i14 >= 0 && i14 + i15 <= randomAccessReader.length()) {
                return randomAccessReader.getInt16(i15);
            }
        }
        return -1;
    }

    public int getOrientation() {
        int iMoveToExifSegmentAndGetLength;
        if (handles(this.reader.getUInt16()) && (iMoveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength()) != -1) {
            return parseExifSegment(new byte[iMoveToExifSegmentAndGetLength], iMoveToExifSegmentAndGetLength);
        }
        return -1;
    }

    private int parseExifSegment(byte[] bArr, int i14) {
        if (this.reader.read(bArr, i14) == i14 && hasJpegExifPreamble(bArr, i14)) {
            return parseExifSegment(new RandomAccessReader(bArr, i14));
        }
        return -1;
    }
}
