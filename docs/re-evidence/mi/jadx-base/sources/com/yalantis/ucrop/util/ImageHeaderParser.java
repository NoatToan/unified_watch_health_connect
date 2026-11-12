package com.yalantis.ucrop.util;

import android.text.TextUtils;
import android.util.Log;
import defpackage.gh8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
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

        public RandomAccessReader(byte[] bArr, int i) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public short getInt16(int i) {
            return this.data.getShort(i);
        }

        public int getInt32(int i) {
            return this.data.getInt(i);
        }

        public int length() {
            return this.data.remaining();
        }

        public void order(ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }
    }

    public interface Reader {
        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    public static class StreamReader implements Reader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            return ((this.is.read() << 8) & 65280) | (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            return (short) (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int i3 = this.is.read(bArr, i - i2, i2);
                if (i3 == -1) {
                    break;
                }
                i2 -= i3;
            }
            return i - i2;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.is.skip(j2);
                if (jSkip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.reader = new StreamReader(inputStream);
    }

    private static int calcTagOffset(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    public static void copyExif(gh8 gh8Var, int i, int i2, String str) throws Throwable {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        try {
            gh8 gh8Var2 = new gh8(str);
            for (int i3 = 0; i3 < 22; i3++) {
                String str2 = strArr[i3];
                String strF = gh8Var.f(str2);
                if (!TextUtils.isEmpty(strF)) {
                    gh8Var2.b0(str2, strF);
                }
            }
            gh8Var2.b0("ImageWidth", String.valueOf(i));
            gh8Var2.b0("ImageLength", String.valueOf(i2));
            gh8Var2.b0("Orientation", "0");
            gh8Var2.X();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static boolean handles(int i) {
        return (i & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i == MOTOROLA_TIFF_MAGIC_NUMBER || i == INTEL_TIFF_MAGIC_NUMBER;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i) {
        boolean z = bArr != null && i > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
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

    private int moveToExifSegmentAndGetLength() throws IOException {
        short uInt8;
        int uInt16;
        long j;
        long jSkip;
        do {
            short uInt9 = this.reader.getUInt8();
            if (uInt9 != 255) {
                if (Log.isLoggable(TAG, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) uInt9);
                }
                return -1;
            }
            uInt8 = this.reader.getUInt8();
            if (uInt8 == 218) {
                return -1;
            }
            if (uInt8 == 217) {
                Log.isLoggable(TAG, 3);
                return -1;
            }
            uInt16 = this.reader.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            j = uInt16;
            jSkip = this.reader.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable(TAG, 3)) {
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

    private int parseExifSegment(byte[] bArr, int i) throws IOException {
        int i2 = this.reader.read(bArr, i);
        if (i2 == i) {
            if (hasJpegExifPreamble(bArr, i)) {
                return parseExifSegment(new RandomAccessReader(bArr, i));
            }
            Log.isLoggable(TAG, 3);
            return -1;
        }
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to read exif segment data, length: ");
            sb.append(i);
            sb.append(", actually read: ");
            sb.append(i2);
        }
        return -1;
    }

    public int getOrientation() throws IOException {
        int uInt16 = this.reader.getUInt16();
        if (handles(uInt16)) {
            int iMoveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength();
            if (iMoveToExifSegmentAndGetLength != -1) {
                return parseExifSegment(new byte[iMoveToExifSegmentAndGetLength], iMoveToExifSegmentAndGetLength);
            }
            Log.isLoggable(TAG, 3);
            return -1;
        }
        if (Log.isLoggable(TAG, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Parser doesn't handle magic number: ");
            sb.append(uInt16);
        }
        return -1;
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        ByteOrder byteOrder;
        short int16 = randomAccessReader.getInt16(6);
        if (int16 == MOTOROLA_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (int16 == INTEL_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable(TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append((int) int16);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int32 = randomAccessReader.getInt32(10) + 6;
        short int17 = randomAccessReader.getInt16(int32);
        for (int i = 0; i < int17; i++) {
            int iCalcTagOffset = calcTagOffset(int32, i);
            short int18 = randomAccessReader.getInt16(iCalcTagOffset);
            if (int18 == ORIENTATION_TAG_TYPE) {
                short int19 = randomAccessReader.getInt16(iCalcTagOffset + 2);
                if (int19 >= 1 && int19 <= 12) {
                    int int33 = randomAccessReader.getInt32(iCalcTagOffset + 4);
                    if (int33 < 0) {
                        Log.isLoggable(TAG, 3);
                    } else {
                        if (Log.isLoggable(TAG, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append((int) int18);
                            sb2.append(" formatCode=");
                            sb2.append((int) int19);
                            sb2.append(" componentCount=");
                            sb2.append(int33);
                        }
                        int i2 = int33 + BYTES_PER_FORMAT[int19];
                        if (i2 > 4) {
                            if (Log.isLoggable(TAG, 3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Got byte count > 4, not orientation, continuing, formatCode=");
                                sb3.append((int) int19);
                            }
                        } else {
                            int i3 = iCalcTagOffset + 8;
                            if (i3 >= 0 && i3 <= randomAccessReader.length()) {
                                if (i2 >= 0 && i2 + i3 <= randomAccessReader.length()) {
                                    return randomAccessReader.getInt16(i3);
                                }
                                if (Log.isLoggable(TAG, 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append((int) int18);
                                }
                            } else if (Log.isLoggable(TAG, 3)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Illegal tagValueOffset=");
                                sb5.append(i3);
                                sb5.append(" tagType=");
                                sb5.append((int) int18);
                            }
                        }
                    }
                } else if (Log.isLoggable(TAG, 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append((int) int19);
                }
            }
        }
        return -1;
    }
}
