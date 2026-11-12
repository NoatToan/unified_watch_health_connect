package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class gh8 {
    public static SimpleDateFormat U;
    public static SimpleDateFormat V;
    public static final e[] Z;
    public static final e[] a0;
    public static final e[] b0;
    public static final e[] c0;
    public static final e[] d0;
    public static final e e0;
    public static final e[] f0;
    public static final e[] g0;
    public static final e[] h0;
    public static final e[] i0;
    public static final e[][] j0;
    public static final e[] k0;
    public static final HashMap<Integer, e>[] l0;
    public static final HashMap<String, e>[] m0;
    public static final HashSet<String> n0;
    public static final HashMap<Integer, Integer> o0;
    public static final Charset p0;
    public static final byte[] q0;
    public static final byte[] r0;
    public static final Pattern s0;
    public static final Pattern t0;
    public static final Pattern u0;
    public static final Pattern v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f18979b;
    public AssetManager.AssetInputStream c;
    public int d;
    public boolean e;
    public final HashMap<String, d>[] f;
    public Set<Integer> g;
    public ByteOrder h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18980k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18981r;
    public int s;
    public boolean t;
    public boolean u;
    public static final boolean v = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> w = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> x = Arrays.asList(2, 7, 4, 5);
    public static final int[] y = {8, 8, 8};
    public static final int[] z = {4};
    public static final int[] A = {8};
    public static final byte[] B = {-1, -40, -1};
    public static final byte[] C = {102, 116, 121, 112};
    public static final byte[] D = {109, 105, 102, 49};
    public static final byte[] E = {104, 101, 105, 99};
    public static final byte[] F = {79, 76, 89, 77, SettingsModule.VALUE_TYPE_FLAG, 0};
    public static final byte[] G = {79, 76, 89, 77, SettingsModule.VALUE_TYPE_FLAG, 85, 83, 0, 73, 73};
    public static final byte[] H = {-119, SettingsModule.VALUE_TYPE_FLAG, 78, 71, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 10, 26, 10};
    public static final byte[] I = {101, 88, 73, 102};
    public static final byte[] J = {73, 72, 68, 82};
    public static final byte[] K = {73, 69, 78, 68};
    public static final byte[] L = {82, 73, 70, 70};
    public static final byte[] M = {87, 69, 66, SettingsModule.VALUE_TYPE_FLAG};
    public static final byte[] N = {69, 88, 73, 70};
    public static final byte[] O = {-99, 1, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY};
    public static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] Y = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 83, 67, 73, 73, 0, 0, 0};

    public class a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f18983b;

        public a(g gVar) {
            this.f18983b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f18982a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f18983b.available())) {
                        return -1;
                    }
                    this.f18983b.l(j);
                    this.f18982a = j;
                }
                if (i2 > this.f18983b.available()) {
                    i2 = this.f18983b.available();
                }
                int i3 = this.f18983b.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f18982a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f18982a = -1L;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {
        public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f18984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteOrder f18985b;
        public int c;
        public byte[] d;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.c;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f18984a.available();
        }

        public long b() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public void c(ByteOrder byteOrder) {
            this.f18985b = byteOrder;
        }

        public void d(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.f18984a.skip(i3);
                if (iSkip <= 0) {
                    if (this.d == null) {
                        this.d = new byte[8192];
                    }
                    iSkip = this.f18984a.read(this.d, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += iSkip;
            }
            this.c += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.c++;
            return this.f18984a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.c++;
            return this.f18984a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.c++;
            int i = this.f18984a.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.c += 2;
            return this.f18984a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.c += i2;
            this.f18984a.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.c += 4;
            int i = this.f18984a.read();
            int i2 = this.f18984a.read();
            int i3 = this.f18984a.read();
            int i4 = this.f18984a.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f18985b;
            if (byteOrder == e) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f18985b);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.c += 8;
            int i = this.f18984a.read();
            int i2 = this.f18984a.read();
            int i3 = this.f18984a.read();
            int i4 = this.f18984a.read();
            int i5 = this.f18984a.read();
            int i6 = this.f18984a.read();
            int i7 = this.f18984a.read();
            int i8 = this.f18984a.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f18985b;
            if (byteOrder == e) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            throw new IOException("Invalid byte order: " + this.f18985b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.c += 2;
            int i = this.f18984a.read();
            int i2 = this.f18984a.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f18985b;
            if (byteOrder == e) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f) {
                return (short) ((i << 8) + i2);
            }
            throw new IOException("Invalid byte order: " + this.f18985b);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.c += 2;
            return this.f18984a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.c++;
            return this.f18984a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.c += 2;
            int i = this.f18984a.read();
            int i2 = this.f18984a.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f18985b;
            if (byteOrder == e) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f) {
                return (i << 8) + i2;
            }
            throw new IOException("Invalid byte order: " + this.f18985b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f18985b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f18984a = dataInputStream;
            dataInputStream.mark(0);
            this.c = 0;
            this.f18985b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f18984a.read(bArr, i, i2);
            this.c += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.c += bArr.length;
            this.f18984a.readFully(bArr);
        }
    }

    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f18986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteOrder f18987b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f18986a = outputStream;
            this.f18987b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f18987b = byteOrder;
        }

        public void b(int i) throws IOException {
            this.f18986a.write(i);
        }

        public void c(int i) throws IOException {
            ByteOrder byteOrder = this.f18987b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f18986a.write(i & 255);
                this.f18986a.write((i >>> 8) & 255);
                this.f18986a.write((i >>> 16) & 255);
                this.f18986a.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f18986a.write((i >>> 24) & 255);
                this.f18986a.write((i >>> 16) & 255);
                this.f18986a.write((i >>> 8) & 255);
                this.f18986a.write(i & 255);
            }
        }

        public void d(short s) throws IOException {
            ByteOrder byteOrder = this.f18987b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f18986a.write(s & 255);
                this.f18986a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f18986a.write((s >>> 8) & 255);
                this.f18986a.write(s & 255);
            }
        }

        public void l(long j) throws IOException {
            c((int) j);
        }

        public void m(int i) throws IOException {
            d((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f18986a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f18986a.write(bArr, i, i2);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", SportSummary.VERSION_102, 3), new e("Compression", SportSummary.VERSION_103, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", SportSummary.VRESION_201, 4), new e("JPEGInterchangeFormatLength", SportSummary.VRESION_202, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", SportSummary.VERSION_102, 3), new e("Compression", SportSummary.VERSION_103, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", SportSummary.VRESION_201, 4), new e("JPEGInterchangeFormatLength", SportSummary.VRESION_202, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        d0 = eVarArr5;
        e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", SportSummary.VERSION_102, 4)};
        g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        j0 = eVarArr10;
        k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        l0 = new HashMap[eVarArr10.length];
        m0 = new HashMap[eVarArr10.length];
        n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        o0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        p0 = charsetForName;
        q0 = "Exif\u0000\u0000".getBytes(charsetForName);
        r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            e[][] eVarArr11 = j0;
            if (i >= eVarArr11.length) {
                HashMap<Integer, Integer> map = o0;
                e[] eVarArr12 = k0;
                map.put(Integer.valueOf(eVarArr12[0].f18990a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f18990a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f18990a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f18990a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f18990a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f18990a), 8);
                s0 = Pattern.compile(".*[1-9].*");
                t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            l0[i] = new HashMap<>();
            m0[i] = new HashMap<>();
            for (e eVar : eVarArr11[i]) {
                l0[i].put(Integer.valueOf(eVar.f18990a), eVar);
                m0[i].put(eVar.f18991b, eVar);
            }
            i++;
        }
    }

    public gh8(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public static boolean B(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = q0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean E(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean J(FileDescriptor fileDescriptor) {
        try {
            ih8.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean L(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d3 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d4 = d2 + (d3 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d4;
            }
            return -d4;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean d0(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    public static Pair<Integer, Integer> x(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairX = x(strArrSplit[0]);
            if (((Integer) pairX.first).intValue() == 2) {
                return pairX;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairX2 = x(strArrSplit[i]);
                int iIntValue = (((Integer) pairX2.first).equals(pairX.first) || ((Integer) pairX2.second).equals(pairX.first)) ? ((Integer) pairX.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairX.second).intValue() == -1 || !(((Integer) pairX2.first).equals(pairX.second) || ((Integer) pairX2.second).equals(pairX.second))) ? -1 : ((Integer) pairX.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairX = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairX = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairX;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public final void A(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.f18978a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (J(fileInputStream2.getFD())) {
                    this.f18979b = fileInputStream2.getFD();
                } else {
                    this.f18979b = null;
                }
                O(fileInputStream2);
                ih8.c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                ih8.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean C() {
        int iH = h("Orientation", 1);
        return iH == 2 || iH == 7 || iH == 4 || iH == 5;
    }

    public final boolean D(byte[] bArr) throws Throwable {
        long j;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                long length = bVar2.readInt();
                byte[] bArr2 = new byte[4];
                bVar2.read(bArr2);
                if (!Arrays.equals(bArr2, C)) {
                    bVar2.close();
                    return false;
                }
                if (length == 1) {
                    length = bVar2.readLong();
                    j = 16;
                    if (length < 16) {
                        bVar2.close();
                        return false;
                    }
                } else {
                    j = 8;
                }
                if (length > bArr.length) {
                    length = bArr.length;
                }
                long j2 = length - j;
                if (j2 < 8) {
                    bVar2.close();
                    return false;
                }
                byte[] bArr3 = new byte[4];
                boolean z2 = false;
                boolean z3 = false;
                for (long j3 = 0; j3 < j2 / 4; j3++) {
                    if (bVar2.read(bArr3) != 4) {
                        bVar2.close();
                        return false;
                    }
                    if (j3 != 1) {
                        if (Arrays.equals(bArr3, D)) {
                            z2 = true;
                        } else if (Arrays.equals(bArr3, E)) {
                            z3 = true;
                        }
                        if (z2 && z3) {
                            bVar2.close();
                            return true;
                        }
                    }
                }
                bVar2.close();
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return false;
    }

    public final boolean F(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderR = R(bVar2);
                this.h = byteOrderR;
                bVar2.c(byteOrderR);
                short s = bVar2.readShort();
                boolean z2 = s == 20306 || s == 21330;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean G(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public final boolean H(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean I(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderR = R(bVar2);
                this.h = byteOrderR;
                bVar2.c(byteOrderR);
                boolean z2 = bVar2.readShort() == 85;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean K(HashMap map) throws Throwable {
        d dVar;
        d dVar2 = (d) map.get("BitsPerSample");
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.o(this.h);
        int[] iArr2 = y;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.d != 3 || (dVar = (d) map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int iM = dVar.m(this.h);
        return (iM == 1 && Arrays.equals(iArr, A)) || (iM == 6 && Arrays.equals(iArr, iArr2));
    }

    public final boolean M(HashMap map) throws IOException {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.h) <= 512 && dVar2.m(this.h) <= 512;
    }

    public final boolean N(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public final void O(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < j0.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z2 = v;
                    a();
                    if (!z2) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (v) {
                    Q();
                }
                throw th;
            }
        }
        if (!this.e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = m(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (d0(this.d)) {
            g gVar = new g(inputStream);
            if (this.e) {
                t(gVar);
            } else {
                int i2 = this.d;
                if (i2 == 12) {
                    j(gVar);
                } else if (i2 == 7) {
                    n(gVar);
                } else if (i2 == 10) {
                    s(gVar);
                } else {
                    q(gVar);
                }
            }
            gVar.l(this.p);
            c0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                k(bVar, 0, 0);
            } else if (i3 == 13) {
                o(bVar);
            } else if (i3 == 9) {
                p(bVar);
            } else if (i3 == 14) {
                w(bVar);
            }
        }
        a();
        if (!v) {
            return;
        }
        Q();
    }

    public final void P(b bVar) throws IOException {
        ByteOrder byteOrderR = R(bVar);
        this.h = byteOrderR;
        bVar.c(byteOrderR);
        int unsignedShort = bVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = bVar.readInt();
        if (i2 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i2);
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            bVar.d(i3);
        }
    }

    public final void Q() {
        for (int i = 0; i < this.f.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f[i].size());
            for (Map.Entry<String, d> entry : this.f[i].entrySet()) {
                d value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append(entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(value.toString());
                sb2.append(", tagValue: '");
                sb2.append(value.n(this.h));
                sb2.append("'");
            }
        }
    }

    public final ByteOrder R(b bVar) throws IOException {
        short s = bVar.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    public final void S(byte[] bArr, int i) throws IOException {
        g gVar = new g(bArr);
        P(gVar);
        T(gVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0289  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:61:0x018e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0205  */
    /* JADX WARN: Code duplicated, block: B:89:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0212  */
    /* JADX WARN: Code duplicated, block: B:91:0x022d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x022f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0241  */
    /* JADX WARN: Code duplicated, block: B:96:0x0273  */
    /* JADX WARN: Code duplicated, block: B:99:0x027f  */
    public final void T(g gVar, int i) throws IOException {
        short s;
        int i2;
        long j;
        Integer num;
        int unsignedShort;
        long jB;
        int i3;
        this.g.add(Integer.valueOf(gVar.c));
        short s2 = gVar.readShort();
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("numberOfDirectoryEntry: ");
            sb.append((int) s2);
        }
        if (s2 <= 0) {
            return;
        }
        char c2 = 0;
        short s3 = 0;
        while (s3 < s2) {
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i4 = gVar.readInt();
            long jA = ((long) gVar.a()) + 4;
            e eVar = l0[i].get(Integer.valueOf(unsignedShort2));
            boolean z2 = v;
            boolean z3 = true;
            if (z2) {
                Object[] objArr = new Object[5];
                objArr[c2] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = eVar != null ? eVar.f18991b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i4);
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr);
            }
            if (eVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = X;
                    if (unsignedShort3 < iArr.length) {
                        if (eVar.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = eVar.c;
                            }
                            i2 = unsignedShort2;
                            s = s3;
                            j = ((long) iArr[unsignedShort3]) * ((long) i4);
                            if (j < 0 || j > 2147483647L) {
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Skip the tag entry since the number of components is invalid: ");
                                    sb2.append(i4);
                                }
                                z3 = false;
                            }
                        } else if (z2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Skip the tag entry since data format (");
                            sb3.append(W[unsignedShort3]);
                            sb3.append(") is unexpected for tag: ");
                            sb3.append(eVar.f18991b);
                        }
                    }
                    if (z3) {
                        if (j > 4) {
                            i3 = gVar.readInt();
                            if (z2) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("seek to data offset: ");
                                sb4.append(i3);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(eVar.f18991b)) {
                                    this.q = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(eVar.f18991b)) {
                                    this.f18981r = i3;
                                    this.s = i4;
                                    d dVarJ = d.j(6, this.h);
                                    d dVarF = d.f(this.f18981r, this.h);
                                    d dVarF2 = d.f(this.s, this.h);
                                    this.f[4].put("Compression", dVarJ);
                                    this.f[4].put("JPEGInterchangeFormat", dVarF);
                                    this.f[4].put("JPEGInterchangeFormatLength", dVarF2);
                                }
                            }
                            gVar.l(i3);
                        } else {
                            s2 = s2;
                            i4 = i4;
                        }
                        num = o0.get(Integer.valueOf(i2));
                        if (z2) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("nextIfdType: ");
                            sb5.append(num);
                            sb5.append(" byteCount: ");
                            sb5.append(j);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    jB = gVar.b();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    jB = -1;
                                }
                                if (z2) {
                                    String.format("Offset: %d, tagName: %s", Long.valueOf(jB), eVar.f18991b);
                                }
                                if (jB > 0) {
                                    if (!this.g.contains(Integer.valueOf((int) jB))) {
                                        gVar.l(jB);
                                        T(gVar, num.intValue());
                                    } else if (z2) {
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("Skip jump into the IFD since it has already been read: IfdType ");
                                        sb6.append(num);
                                        sb6.append(" (at ");
                                        sb6.append(jB);
                                        sb6.append(")");
                                    }
                                } else if (z2) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Skip jump into the IFD since its offset is invalid: ");
                                    sb7.append(jB);
                                }
                                gVar.l(jA);
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            jB = unsignedShort;
                            if (z2) {
                                String.format("Offset: %d, tagName: %s", Long.valueOf(jB), eVar.f18991b);
                            }
                            if (jB > 0) {
                                if (!this.g.contains(Integer.valueOf((int) jB))) {
                                    gVar.l(jB);
                                    T(gVar, num.intValue());
                                } else if (z2) {
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("Skip jump into the IFD since it has already been read: IfdType ");
                                    sb8.append(num);
                                    sb8.append(" (at ");
                                    sb8.append(jB);
                                    sb8.append(")");
                                }
                            } else if (z2) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("Skip jump into the IFD since its offset is invalid: ");
                                sb9.append(jB);
                            }
                            gVar.l(jA);
                        } else {
                            int iA = gVar.a() + this.p;
                            byte[] bArr = new byte[(int) j];
                            gVar.readFully(bArr);
                            d dVar = new d(unsignedShort3, i4, iA, bArr);
                            this.f[i].put(eVar.f18991b, dVar);
                            if ("DNGVersion".equals(eVar.f18991b)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(eVar.f18991b) || "Model".equals(eVar.f18991b)) && dVar.n(this.h).contains("PENTAX")) || ("Compression".equals(eVar.f18991b) && dVar.m(this.h) == 65535)) {
                                this.d = 8;
                            }
                            if (gVar.a() != jA) {
                                gVar.l(jA);
                            }
                        }
                    } else {
                        gVar.l(jA);
                        s2 = s2;
                    }
                    s3 = (short) (s + 1);
                    s2 = s2;
                    c2 = 0;
                }
                s = s3;
                i2 = unsignedShort2;
                if (z2) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("Skip the tag entry since data format is invalid: ");
                    sb10.append(unsignedShort3);
                }
                j = 0;
                z3 = false;
                if (z3) {
                    gVar.l(jA);
                    s2 = s2;
                } else {
                    if (j > 4) {
                        i3 = gVar.readInt();
                        if (z2) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("seek to data offset: ");
                            sb11.append(i3);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(eVar.f18991b)) {
                                this.q = i3;
                            } else if (i != 6) {
                            }
                        }
                        gVar.l(i3);
                    } else {
                        s2 = s2;
                        i4 = i4;
                    }
                    num = o0.get(Integer.valueOf(i2));
                    if (z2) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("nextIfdType: ");
                        sb12.append(num);
                        sb12.append(" byteCount: ");
                        sb12.append(j);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                jB = gVar.b();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z2) {
                                String.format("Offset: %d, tagName: %s", Long.valueOf(jB), eVar.f18991b);
                            }
                            if (jB > 0) {
                                if (!this.g.contains(Integer.valueOf((int) jB))) {
                                    gVar.l(jB);
                                    T(gVar, num.intValue());
                                } else if (z2) {
                                    StringBuilder sb13 = new StringBuilder();
                                    sb13.append("Skip jump into the IFD since it has already been read: IfdType ");
                                    sb13.append(num);
                                    sb13.append(" (at ");
                                    sb13.append(jB);
                                    sb13.append(")");
                                }
                            } else if (z2) {
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append("Skip jump into the IFD since its offset is invalid: ");
                                sb14.append(jB);
                            }
                            gVar.l(jA);
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        jB = unsignedShort;
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(jB), eVar.f18991b);
                        }
                        if (jB > 0) {
                            if (!this.g.contains(Integer.valueOf((int) jB))) {
                                gVar.l(jB);
                                T(gVar, num.intValue());
                            } else if (z2) {
                                StringBuilder sb15 = new StringBuilder();
                                sb15.append("Skip jump into the IFD since it has already been read: IfdType ");
                                sb15.append(num);
                                sb15.append(" (at ");
                                sb15.append(jB);
                                sb15.append(")");
                            }
                        } else if (z2) {
                            StringBuilder sb16 = new StringBuilder();
                            sb16.append("Skip jump into the IFD since its offset is invalid: ");
                            sb16.append(jB);
                        }
                        gVar.l(jA);
                    } else {
                        int iA2 = gVar.a() + this.p;
                        byte[] bArr2 = new byte[(int) j];
                        gVar.readFully(bArr2);
                        d dVar2 = new d(unsignedShort3, i4, iA2, bArr2);
                        this.f[i].put(eVar.f18991b, dVar2);
                        if ("DNGVersion".equals(eVar.f18991b)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(eVar.f18991b)) {
                        }
                        this.d = 8;
                        if (gVar.a() != jA) {
                            gVar.l(jA);
                        }
                    }
                }
                s3 = (short) (s + 1);
                s2 = s2;
                c2 = 0;
            } else if (z2) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append("Skip the tag entry since tag number is not defined: ");
                sb17.append(unsignedShort2);
            }
            s = s3;
            i2 = unsignedShort2;
            j = 0;
            z3 = false;
            if (z3) {
                gVar.l(jA);
                s2 = s2;
            } else {
                if (j > 4) {
                    i3 = gVar.readInt();
                    if (z2) {
                        StringBuilder sb18 = new StringBuilder();
                        sb18.append("seek to data offset: ");
                        sb18.append(i3);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(eVar.f18991b)) {
                            this.q = i3;
                        } else if (i != 6) {
                        }
                    }
                    gVar.l(i3);
                } else {
                    s2 = s2;
                    i4 = i4;
                }
                num = o0.get(Integer.valueOf(i2));
                if (z2) {
                    StringBuilder sb19 = new StringBuilder();
                    sb19.append("nextIfdType: ");
                    sb19.append(num);
                    sb19.append(" byteCount: ");
                    sb19.append(j);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            jB = gVar.b();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(jB), eVar.f18991b);
                        }
                        if (jB > 0) {
                            if (!this.g.contains(Integer.valueOf((int) jB))) {
                                gVar.l(jB);
                                T(gVar, num.intValue());
                            } else if (z2) {
                                StringBuilder sb110 = new StringBuilder();
                                sb110.append("Skip jump into the IFD since it has already been read: IfdType ");
                                sb110.append(num);
                                sb110.append(" (at ");
                                sb110.append(jB);
                                sb110.append(")");
                            }
                        } else if (z2) {
                            StringBuilder sb111 = new StringBuilder();
                            sb111.append("Skip jump into the IFD since its offset is invalid: ");
                            sb111.append(jB);
                        }
                        gVar.l(jA);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    jB = unsignedShort;
                    if (z2) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(jB), eVar.f18991b);
                    }
                    if (jB > 0) {
                        if (!this.g.contains(Integer.valueOf((int) jB))) {
                            gVar.l(jB);
                            T(gVar, num.intValue());
                        } else if (z2) {
                            StringBuilder sb112 = new StringBuilder();
                            sb112.append("Skip jump into the IFD since it has already been read: IfdType ");
                            sb112.append(num);
                            sb112.append(" (at ");
                            sb112.append(jB);
                            sb112.append(")");
                        }
                    } else if (z2) {
                        StringBuilder sb113 = new StringBuilder();
                        sb113.append("Skip jump into the IFD since its offset is invalid: ");
                        sb113.append(jB);
                    }
                    gVar.l(jA);
                } else {
                    int iA3 = gVar.a() + this.p;
                    byte[] bArr3 = new byte[(int) j];
                    gVar.readFully(bArr3);
                    d dVar3 = new d(unsignedShort3, i4, iA3, bArr3);
                    this.f[i].put(eVar.f18991b, dVar3);
                    if ("DNGVersion".equals(eVar.f18991b)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(eVar.f18991b)) {
                    }
                    this.d = 8;
                    if (gVar.a() != jA) {
                        gVar.l(jA);
                    }
                }
            }
            s3 = (short) (s + 1);
            s2 = s2;
            c2 = 0;
        }
        int i5 = gVar.readInt();
        boolean z4 = v;
        if (z4) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i5));
        }
        long j2 = i5;
        if (j2 <= 0) {
            if (z4) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append("Stop reading file since a wrong offset may cause an infinite loop: ");
                sb20.append(i5);
                return;
            }
            return;
        }
        if (this.g.contains(Integer.valueOf(i5))) {
            if (z4) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
                sb21.append(i5);
                return;
            }
            return;
        }
        gVar.l(j2);
        if (this.f[4].isEmpty()) {
            T(gVar, 4);
        } else if (this.f[5].isEmpty()) {
            T(gVar, 5);
        }
    }

    public final void U(String str) {
        for (int i = 0; i < j0.length; i++) {
            this.f[i].remove(str);
        }
    }

    public final void V(int i, String str, String str2) {
        if (this.f[i].isEmpty() || this.f[i].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f[i];
        map.put(str2, map.get(str));
        this.f[i].remove(str);
    }

    public final void W(g gVar, int i) throws Throwable {
        d dVar = this.f[i].get("ImageLength");
        d dVar2 = this.f[i].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f[i].get("JPEGInterchangeFormat");
            d dVar4 = this.f[i].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.h);
            int iM2 = dVar3.m(this.h);
            gVar.l(iM);
            byte[] bArr = new byte[iM2];
            gVar.read(bArr);
            k(new b(bArr), iM, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0152  */
    public void X() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e2;
        FileOutputStream fileOutputStream4;
        if (!L(this.d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f18979b == null && this.f18978a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.i && this.j && !this.f18980k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.t = true;
        this.n = u();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f18978a != null) {
                fileInputStream = new FileInputStream(this.f18978a);
            } else {
                ih8.a.c(this.f18979b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f18979b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    ih8.e(fileInputStream, fileOutputStream);
                    ih8.c(fileInputStream);
                    ih8.c(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f18978a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f18978a);
                                    } else {
                                        ih8.a.c(this.f18979b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f18979b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i = this.d;
                                                if (i == 4) {
                                                    Y(bufferedInputStream, bufferedOutputStream);
                                                } else if (i == 13) {
                                                    Z(bufferedInputStream, bufferedOutputStream);
                                                } else if (i == 14) {
                                                    a0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                ih8.c(bufferedInputStream);
                                                ih8.c(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.n = null;
                                            } catch (Exception e3) {
                                                exc = e3;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f18978a == null) {
                                                            ih8.a.c(this.f18979b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream4 = new FileOutputStream(this.f18979b);
                                                        } else {
                                                            fileOutputStream4 = new FileOutputStream(this.f18978a);
                                                        }
                                                        fileOutputStream3 = fileOutputStream4;
                                                        ih8.e(fileInputStream2, fileOutputStream3);
                                                        ih8.c(fileInputStream2);
                                                        ih8.c(fileOutputStream3);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e4) {
                                                        e2 = e4;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e2);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            inputStream = fileInputStream2;
                                                            ih8.c(inputStream);
                                                            ih8.c(fileOutputStream3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        inputStream = fileInputStream2;
                                                        ih8.c(inputStream);
                                                        ih8.c(fileOutputStream3);
                                                        throw th;
                                                    }
                                                } catch (Exception e5) {
                                                    fileInputStream2 = inputStream;
                                                    e2 = e5;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    ih8.c(inputStream);
                                                    ih8.c(fileOutputStream3);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e6) {
                                            inputStream = fileInputStream3;
                                            exc = e6;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = bufferedInputStream;
                                            ih8.c(inputStream);
                                            ih8.c(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e7) {
                                        inputStream = fileInputStream3;
                                        exc = e7;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    fileOutputStream2 = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream3 = fileOutputStream2;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.f18978a == null) {
                                        ih8.a.c(this.f18979b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(this.f18979b);
                                    } else {
                                        fileOutputStream4 = new FileOutputStream(this.f18978a);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    ih8.e(fileInputStream2, fileOutputStream3);
                                    ih8.c(fileInputStream2);
                                    ih8.c(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                ih8.c(inputStream);
                                ih8.c(0);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e10) {
                    e = e10;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th7) {
                        th = th7;
                        ih8.c(inputStream);
                        ih8.c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    inputStream = fileInputStream;
                    ih8.c(inputStream);
                    ih8.c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th9) {
                th = th9;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
        }
    }

    public final void Y(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveJpegAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d dVarRemove = (f("Xmp") == null || !this.u) ? null : this.f[0].remove("Xmp");
        cVar.b(-1);
        cVar.b(-31);
        h0(cVar);
        if (dVarRemove != null) {
            this.f[0].put("Xmp", dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b2 = bVar.readByte();
            if (b2 == -39 || b2 == -38) {
                cVar.b(-1);
                cVar.b(b2);
                ih8.e(bVar, cVar);
                return;
            }
            if (b2 != -31) {
                cVar.b(-1);
                cVar.b(b2);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.m(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = bVar.read(bArr, 0, Math.min(i, 4096));
                    if (i2 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, q0)) {
                        bVar.d(unsignedShort2 - 8);
                    }
                }
                cVar.b(-1);
                cVar.b(b2);
                cVar.m(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = bVar.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i4);
                    i3 -= i4;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void Z(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("savePngAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        ih8.f(bVar, cVar, bArr.length);
        int i = this.p;
        if (i == 0) {
            int i2 = bVar.readInt();
            cVar.c(i2);
            ih8.f(bVar, cVar, i2 + 8);
        } else {
            ih8.f(bVar, cVar, (i - bArr.length) - 8);
            bVar.d(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                h0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f18986a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.c((int) crc32.getValue());
                ih8.c(byteArrayOutputStream2);
                ih8.e(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                ih8.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a() {
        String strF = f("DateTimeOriginal");
        if (strF != null && f("DateTime") == null) {
            this.f[0].put("DateTime", d.e(strF));
        }
        if (f("ImageWidth") == null) {
            this.f[0].put("ImageWidth", d.f(0L, this.h));
        }
        if (f("ImageLength") == null) {
            this.f[0].put("ImageLength", d.f(0L, this.h));
        }
        if (f("Orientation") == null) {
            this.f[0].put("Orientation", d.f(0L, this.h));
        }
        if (f("LightSource") == null) {
            this.f[1].put("LightSource", d.f(0L, this.h));
        }
    }

    public final void a0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        int i;
        int i2;
        int i3;
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveWebpAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = L;
        ih8.f(bVar, cVar, bArr.length);
        byte[] bArr2 = M;
        bVar.d(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i4 = this.p;
                    if (i4 != 0) {
                        ih8.f(bVar, cVar2, (i4 - ((bArr.length + 4) + bArr2.length)) - 8);
                        bVar.d(4);
                        int i5 = bVar.readInt();
                        if (i5 % 2 != 0) {
                            i5++;
                        }
                        bVar.d(i5);
                        h0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = P;
                        boolean z2 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i6 = bVar.readInt();
                            byte[] bArr5 = new byte[i6 % 2 == 1 ? i6 + 1 : i6];
                            bVar.read(bArr5);
                            byte b2 = (byte) (8 | bArr5[0]);
                            bArr5[0] = b2;
                            boolean z3 = ((b2 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.c(i6);
                            cVar2.write(bArr5);
                            if (z3) {
                                c(bVar, cVar2, S, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, T)) {
                                        break;
                                    } else {
                                        d(bVar, cVar2, bArr6);
                                    }
                                }
                                h0(cVar2);
                            } else {
                                c(bVar, cVar2, R, Q);
                                h0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = R;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, Q)) {
                                int i7 = bVar.readInt();
                                int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (bVar.read(bArr9) != 3 || !Arrays.equals(O, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = bVar.readInt();
                                    i8 -= 10;
                                    i3 = (i << 2) >> 18;
                                    i2 = (i << 18) >> 18;
                                    z2 = false;
                                } else if (!Arrays.equals(bArr3, Q)) {
                                    i = 0;
                                    z2 = false;
                                    i2 = 0;
                                    i3 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    i = bVar.readInt();
                                    i2 = (i & 16383) + 1;
                                    i3 = ((i & 268419072) >>> 14) + 1;
                                    if ((i & 268435456) == 0) {
                                        z2 = false;
                                    }
                                    i8 -= 5;
                                }
                                cVar2.write(bArr4);
                                cVar2.c(10);
                                byte[] bArr10 = new byte[10];
                                if (z2) {
                                    bArr10[0] = (byte) (bArr10[0] | 16);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i9 = i2 - 1;
                                int i10 = i3 - 1;
                                bArr10[4] = (byte) i9;
                                bArr10[5] = (byte) (i9 >> 8);
                                bArr10[6] = (byte) (i9 >> 16);
                                bArr10[7] = (byte) i10;
                                bArr10[8] = (byte) (i10 >> 8);
                                bArr10[9] = (byte) (i10 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.c(i7);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(O);
                                    cVar2.c(i);
                                } else if (Arrays.equals(bArr3, Q)) {
                                    cVar2.write(47);
                                    cVar2.c(i);
                                }
                                ih8.f(bVar, cVar2, i8);
                                h0(cVar2);
                            }
                        }
                    }
                    ih8.e(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = M;
                    cVar.c(size + bArr11.length);
                    cVar.write(bArr11);
                    byteArrayOutputStream2.writeTo(cVar);
                    ih8.c(byteArrayOutputStream2);
                } catch (Exception e2) {
                    e = e2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    ih8.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void b0(String str, String str2) {
        e eVar;
        int i;
        int i2;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = u0.matcher(strReplaceAll).find();
            boolean zFind2 = v0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value for ");
                sb.append(str3);
                sb.append(" : ");
                sb.append(strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i3 = 2;
        int i4 = 1;
        if (strReplaceAll != null && n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = t0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid value for ");
                    sb2.append(str3);
                    sb2.append(" : ");
                    sb2.append(strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid value for ");
                    sb3.append(str3);
                    sb3.append(" : ");
                    sb3.append(strReplaceAll);
                    return;
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < j0.length) {
            if ((i6 != 4 || this.i) && (eVar = m0[i6].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairX = x(strReplaceAll);
                    if (eVar.c == ((Integer) pairX.first).intValue() || eVar.c == ((Integer) pairX.second).intValue()) {
                        i = eVar.c;
                    } else {
                        int i7 = eVar.d;
                        if (i7 == -1 || !(i7 == ((Integer) pairX.first).intValue() || eVar.d == ((Integer) pairX.second).intValue())) {
                            int i8 = eVar.c;
                            if (i8 == i4 || i8 == 7 || i8 == i3) {
                                i = i8;
                            } else if (v) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Given tag (");
                                sb4.append(str3);
                                sb4.append(") value didn't match with one of expected formats: ");
                                String[] strArr = W;
                                sb4.append(strArr[eVar.c]);
                                sb4.append(eVar.d == -1 ? "" : ", " + strArr[eVar.d]);
                                sb4.append(" (guess: ");
                                sb4.append(strArr[((Integer) pairX.first).intValue()]);
                                sb4.append(((Integer) pairX.second).intValue() != -1 ? ", " + strArr[((Integer) pairX.second).intValue()] : "");
                                sb4.append(")");
                            }
                        } else {
                            i = eVar.d;
                        }
                    }
                    switch (i) {
                        case 1:
                            i2 = i4;
                            this.f[i6].put(str3, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i2 = i4;
                            this.f[i6].put(str3, d.e(strReplaceAll));
                            break;
                        case 3:
                            i2 = i4;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                                iArr[i9] = Integer.parseInt(strArrSplit[i9]);
                            }
                            this.f[i6].put(str3, d.k(iArr, this.h));
                            break;
                        case 4:
                            i2 = i4;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                                jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                            }
                            this.f[i6].put(str3, d.g(jArr, this.h));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            int i11 = i5;
                            while (i11 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i11].split("/", -1);
                                fVarArr[i11] = new f((long) Double.parseDouble(strArrSplit4[i5]), (long) Double.parseDouble(strArrSplit4[1]));
                                i11++;
                                i5 = 0;
                            }
                            i2 = 1;
                            this.f[i6].put(str3, d.i(fVarArr, this.h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (v) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Data format isn't one of expected formats: ");
                                sb5.append(i);
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i12 = i5; i12 < strArrSplit5.length; i12++) {
                                iArr2[i12] = Integer.parseInt(strArrSplit5[i12]);
                            }
                            this.f[i6].put(str3, d.c(iArr2, this.h));
                            i2 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i13 = i5;
                            while (i13 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i13].split("/", -1);
                                fVarArr2[i13] = new f((long) Double.parseDouble(strArrSplit7[i5]), (long) Double.parseDouble(strArrSplit7[i4]));
                                i13++;
                                strArrSplit6 = strArrSplit6;
                                i4 = 1;
                            }
                            this.f[i6].put(str3, d.d(fVarArr2, this.h));
                            i2 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i14 = i5; i14 < strArrSplit8.length; i14++) {
                                dArr[i14] = Double.parseDouble(strArrSplit8[i14]);
                            }
                            this.f[i6].put(str3, d.b(dArr, this.h));
                            break;
                    }
                } else {
                    this.f[i6].remove(str3);
                }
                i2 = i4;
            } else {
                i2 = i4;
            }
            i6++;
            i4 = i2;
            i3 = 2;
            i5 = 0;
        }
    }

    public final void c(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = p0;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            d(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final void c0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f[4];
        d dVar = map.get("Compression");
        if (dVar == null) {
            this.o = 6;
            y(bVar, map);
            return;
        }
        int iM = dVar.m(this.h);
        this.o = iM;
        if (iM != 1) {
            if (iM == 6) {
                y(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (K(map)) {
            z(bVar, map);
        }
    }

    public final void d(b bVar, c cVar, byte[] bArr) throws IOException {
        int i = bVar.readInt();
        cVar.write(bArr);
        cVar.c(i);
        if (i % 2 == 1) {
            i++;
        }
        ih8.f(bVar, cVar, i);
    }

    public double e(double d2) {
        double dG = g("GPSAltitude", -1.0d);
        int iH = h("GPSAltitudeRef", -1);
        if (dG < 0.0d || iH < 0) {
            return d2;
        }
        return dG * ((double) (iH != 1 ? 1 : -1));
    }

    public final void e0(int i, int i2) throws Throwable {
        if (this.f[i].isEmpty() || this.f[i2].isEmpty()) {
            return;
        }
        d dVar = this.f[i].get("ImageLength");
        d dVar2 = this.f[i].get("ImageWidth");
        d dVar3 = this.f[i2].get("ImageLength");
        d dVar4 = this.f[i2].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int iM = dVar.m(this.h);
        int iM2 = dVar2.m(this.h);
        int iM3 = dVar3.m(this.h);
        int iM4 = dVar4.m(this.h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f;
        HashMap<String, d> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public String f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarI = i(str);
        if (dVarI != null) {
            if (!n0.contains(str)) {
                return dVarI.n(this.h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = dVarI.f18988a;
                if (i != 5 && i != 10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("GPS Timestamp format is not rational. format=");
                    sb.append(dVarI.f18988a);
                    return null;
                }
                f[] fVarArr = (f[]) dVarI.o(this.h);
                if (fVarArr == null || fVarArr.length != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid GPS Timestamp array. array=");
                    sb2.append(Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f18992a / fVar.f18993b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f18992a / fVar2.f18993b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f18992a / fVar3.f18993b)));
            }
            try {
                return Double.toString(dVarI.l(this.h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void f0(g gVar, int i) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = this.f[i].get("DefaultCropSize");
        d dVar2 = this.f[i].get("SensorTopBorder");
        d dVar3 = this.f[i].get("SensorLeftBorder");
        d dVar4 = this.f[i].get("SensorBottomBorder");
        d dVar5 = this.f[i].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                W(gVar, i);
                return;
            }
            int iM = dVar2.m(this.h);
            int iM2 = dVar4.m(this.h);
            int iM3 = dVar5.m(this.h);
            int iM4 = dVar3.m(this.h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.h);
            d dVarJ4 = d.j(iM3 - iM4, this.h);
            this.f[i].put("ImageLength", dVarJ3);
            this.f[i].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f18988a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.h);
            if (fVarArr == null || fVarArr.length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid crop size values. cropSize=");
                sb.append(Arrays.toString(fVarArr));
                return;
            }
            dVarJ = d.h(fVarArr[0], this.h);
            dVarJ2 = d.h(fVarArr[1], this.h);
        } else {
            int[] iArr = (int[]) dVar.o(this.h);
            if (iArr == null || iArr.length != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid crop size values. cropSize=");
                sb2.append(Arrays.toString(iArr));
                return;
            }
            dVarJ = d.j(iArr[0], this.h);
            dVarJ2 = d.j(iArr[1], this.h);
        }
        this.f[i].put("ImageWidth", dVarJ);
        this.f[i].put("ImageLength", dVarJ2);
    }

    public double g(String str, double d2) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarI = i(str);
        if (dVarI == null) {
            return d2;
        }
        try {
            return dVarI.l(this.h);
        } catch (NumberFormatException unused) {
            return d2;
        }
    }

    public final void g0() throws Throwable {
        e0(0, 5);
        e0(0, 4);
        e0(5, 4);
        d dVar = this.f[1].get("PixelXDimension");
        d dVar2 = this.f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f[0].put("ImageWidth", dVar);
            this.f[0].put("ImageLength", dVar2);
        }
        if (this.f[4].isEmpty() && M(this.f[5])) {
            HashMap<String, d>[] mapArr = this.f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        M(this.f[4]);
        V(0, "ThumbnailOrientation", "Orientation");
        V(0, "ThumbnailImageLength", "ImageLength");
        V(0, "ThumbnailImageWidth", "ImageWidth");
        V(5, "ThumbnailOrientation", "Orientation");
        V(5, "ThumbnailImageLength", "ImageLength");
        V(5, "ThumbnailImageWidth", "ImageWidth");
        V(4, "Orientation", "ThumbnailOrientation");
        V(4, "ImageLength", "ThumbnailImageLength");
        V(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public int h(String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarI = i(str);
        if (dVarI == null) {
            return i;
        }
        try {
            return dVarI.m(this.h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final int h0(c cVar) throws IOException {
        e[][] eVarArr = j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : k0) {
            U(eVar.f18991b);
        }
        if (this.i) {
            if (this.j) {
                U("StripOffsets");
                U("StripByteCounts");
            } else {
                U("JPEGInterchangeFormat");
                U("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < j0.length; i++) {
            for (Object obj : this.f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f[1].isEmpty()) {
            this.f[0].put(k0[1].f18991b, d.f(0L, this.h));
        }
        if (!this.f[2].isEmpty()) {
            this.f[0].put(k0[2].f18991b, d.f(0L, this.h));
        }
        if (!this.f[3].isEmpty()) {
            this.f[1].put(k0[3].f18991b, d.f(0L, this.h));
        }
        if (this.i) {
            if (this.j) {
                this.f[4].put("StripOffsets", d.j(0, this.h));
                this.f[4].put("StripByteCounts", d.j(this.m, this.h));
            } else {
                this.f[4].put("JPEGInterchangeFormat", d.f(0L, this.h));
                this.f[4].put("JPEGInterchangeFormatLength", d.f(this.m, this.h));
            }
        }
        for (int i2 = 0; i2 < j0.length; i2++) {
            Iterator<Map.Entry<String, d>> it = this.f[i2].entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int iP = it.next().getValue().p();
                if (iP > 4) {
                    i3 += iP;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int size = 8;
        for (int i4 = 0; i4 < j0.length; i4++) {
            if (!this.f[i4].isEmpty()) {
                iArr[i4] = size;
                size += (this.f[i4].size() * 12) + 6 + iArr2[i4];
            }
        }
        if (this.i) {
            if (this.j) {
                this.f[4].put("StripOffsets", d.j(size, this.h));
            } else {
                this.f[4].put("JPEGInterchangeFormat", d.f(size, this.h));
            }
            this.l = size;
            size += this.m;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (v) {
            for (int i5 = 0; i5 < j0.length; i5++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i5), Integer.valueOf(iArr[i5]), Integer.valueOf(this.f[i5].size()), Integer.valueOf(iArr2[i5]), Integer.valueOf(size));
            }
        }
        if (!this.f[1].isEmpty()) {
            this.f[0].put(k0[1].f18991b, d.f(iArr[1], this.h));
        }
        if (!this.f[2].isEmpty()) {
            this.f[0].put(k0[2].f18991b, d.f(iArr[2], this.h));
        }
        if (!this.f[3].isEmpty()) {
            this.f[1].put(k0[3].f18991b, d.f(iArr[3], this.h));
        }
        int i6 = this.d;
        if (i6 == 4) {
            cVar.m(size);
            cVar.write(q0);
        } else if (i6 == 13) {
            cVar.c(size);
            cVar.write(I);
        } else if (i6 == 14) {
            cVar.write(N);
            cVar.c(size);
        }
        cVar.d(this.h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.h);
        cVar.m(42);
        cVar.l(8L);
        for (int i7 = 0; i7 < j0.length; i7++) {
            if (!this.f[i7].isEmpty()) {
                cVar.m(this.f[i7].size());
                int size2 = iArr[i7] + 2 + (this.f[i7].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f[i7].entrySet()) {
                    int i8 = m0[i7].get(entry2.getKey()).f18990a;
                    d value = entry2.getValue();
                    int iP2 = value.p();
                    cVar.m(i8);
                    cVar.m(value.f18988a);
                    cVar.c(value.f18989b);
                    if (iP2 > 4) {
                        cVar.l(size2);
                        size2 += iP2;
                    } else {
                        cVar.write(value.d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.b(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i7 != 0 || this.f[4].isEmpty()) {
                    cVar.l(0L);
                } else {
                    cVar.l(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f[i7].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.i) {
            cVar.write(v());
        }
        if (this.d == 14 && size % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    public final d i(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < j0.length; i++) {
            d dVar = this.f[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void j(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                ih8.b.a(mediaMetadataRetriever, new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.h));
                }
                if (strExtractMetadata2 != null) {
                    this.f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata2), this.h));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    this.f[0].put("Orientation", d.j(i, this.h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.l(i3);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (gVar.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.p = i5;
                    S(bArr2, 0);
                }
                if (v) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Heif meta: ");
                    sb.append(strExtractMetadata);
                    sb.append("x");
                    sb.append(strExtractMetadata2);
                    sb.append(", rotation ");
                    sb.append(strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b A[LOOP:0: B:10:0x002e->B:61:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0161 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void k(gh8.b r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.k(gh8$b, int, int):void");
    }

    public double[] l() {
        String strF = f("GPSLatitude");
        String strF2 = f("GPSLatitudeRef");
        String strF3 = f("GPSLongitude");
        String strF4 = f("GPSLongitudeRef");
        if (strF == null || strF2 == null || strF3 == null || strF4 == null) {
            return null;
        }
        try {
            return new double[]{b(strF, strF2), b(strF3, strF4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Latitude/longitude values are not parsable. ");
            sb.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strF, strF2, strF3, strF4));
            return null;
        }
    }

    public final int m(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (E(bArr)) {
            return 4;
        }
        if (H(bArr)) {
            return 9;
        }
        if (D(bArr)) {
            return 12;
        }
        if (F(bArr)) {
            return 7;
        }
        if (I(bArr)) {
            return 10;
        }
        if (G(bArr)) {
            return 13;
        }
        return N(bArr) ? 14 : 0;
    }

    public final void n(g gVar) throws Throwable {
        int i;
        int i2;
        q(gVar);
        d dVar = this.f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.d);
            gVar2.c(this.h);
            byte[] bArr = F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.l(0L);
            byte[] bArr3 = G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.l(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.l(12L);
            }
            T(gVar2, 6);
            d dVar2 = this.f[7].get("PreviewImageStart");
            d dVar3 = this.f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f[5].put("JPEGInterchangeFormat", dVar2);
                this.f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.h);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                d dVarJ = d.j(i5, this.h);
                d dVarJ2 = d.j(i6, this.h);
                this.f[0].put("ImageWidth", dVarJ);
                this.f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    public final void o(b bVar) throws Throwable {
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, K)) {
                    return;
                }
                if (Arrays.equals(bArr2, I)) {
                    byte[] bArr3 = new byte[i];
                    if (bVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ih8.a(bArr2));
                    }
                    int i3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.p = i2;
                        S(bArr3, 0);
                        g0();
                        c0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                bVar.d(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void p(b bVar) throws Throwable {
        boolean z2 = v;
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.d(i - bVar.a());
        bVar.read(bArr4);
        k(new b(bArr4), i, 5);
        bVar.d(i3 - bVar.a());
        bVar.c(ByteOrder.BIG_ENDIAN);
        int i4 = bVar.readInt();
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == e0.f18990a) {
                short s = bVar.readShort();
                short s2 = bVar.readShort();
                d dVarJ = d.j(s, this.h);
                d dVarJ2 = d.j(s2, this.h);
                this.f[0].put("ImageLength", dVarJ);
                this.f[0].put("ImageWidth", dVarJ2);
                if (v) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append((int) s);
                    sb3.append(", width: ");
                    sb3.append((int) s2);
                    return;
                }
                return;
            }
            bVar.d(unsignedShort2);
        }
    }

    public final void q(g gVar) throws Throwable {
        d dVar;
        P(gVar);
        T(gVar, 0);
        f0(gVar, 0);
        f0(gVar, 5);
        f0(gVar, 4);
        g0();
        if (this.d != 8 || (dVar = this.f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.d);
        gVar2.c(this.h);
        gVar2.d(6);
        T(gVar2, 9);
        d dVar2 = this.f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f[1].put("ColorSpace", dVar2);
        }
    }

    public int r() {
        switch (h("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void s(g gVar) throws Throwable {
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(gVar);
        }
        q(gVar);
        d dVar = this.f[0].get("JpgFromRaw");
        if (dVar != null) {
            k(new b(dVar.d), (int) dVar.c, 5);
        }
        d dVar2 = this.f[0].get("ISO");
        d dVar3 = this.f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f[1].put("PhotographicSensitivity", dVar2);
    }

    public final void t(g gVar) throws IOException {
        byte[] bArr = q0;
        gVar.d(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.p = bArr.length;
        S(bArr2, 0);
    }

    public byte[] u() {
        int i = this.o;
        if (i == 6 || i == 7) {
            return v();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    public byte[] v() throws Throwable {
        Throwable th;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th2;
        InputStream inputStream = null;
        if (!this.i) {
            return null;
        }
        byte[] bArr = this.n;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.c;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        ih8.c(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception unused) {
                    fileDescriptor = null;
                } catch (Throwable th3) {
                    inputStream = fileInputStream;
                    th = th3;
                    fileDescriptor = null;
                    ih8.c(inputStream);
                    if (fileDescriptor == null) {
                        throw th;
                    }
                    ih8.b(fileDescriptor);
                    throw th;
                }
                ih8.c(fileInputStream);
                if (fileDescriptor != null) {
                    ih8.b(fileDescriptor);
                }
                return null;
            }
            if (this.f18978a != null) {
                fileInputStream = new FileInputStream(this.f18978a);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorB = ih8.a.b(this.f18979b);
                try {
                    ih8.a.c(fileDescriptorB, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorB;
                    fileInputStream = new FileInputStream(fileDescriptorB);
                } catch (Exception unused2) {
                    fileDescriptor = fileDescriptorB;
                    fileInputStream = null;
                } catch (Throwable th4) {
                    th2 = th4;
                    fileDescriptor = fileDescriptorB;
                    th = th2;
                    ih8.c(inputStream);
                    if (fileDescriptor == null) {
                        throw th;
                    }
                    ih8.b(fileDescriptor);
                    throw th;
                }
            }
            try {
                if (fileInputStream.skip(this.l + this.p) != this.l + this.p) {
                    throw new IOException("Corrupted image");
                }
                byte[] bArr2 = new byte[this.m];
                if (fileInputStream.read(bArr2) != this.m) {
                    throw new IOException("Corrupted image");
                }
                this.n = bArr2;
                ih8.c(fileInputStream);
                if (fileDescriptor != null) {
                    ih8.b(fileDescriptor);
                }
                return bArr2;
            } catch (Exception unused3) {
            } catch (Throwable th5) {
                th2 = th5;
                inputStream = fileInputStream;
                th = th2;
                ih8.c(inputStream);
                if (fileDescriptor == null) {
                    throw th;
                }
                ih8.b(fileDescriptor);
                throw th;
            }
        } catch (Exception unused4) {
            fileInputStream = null;
            fileDescriptor = null;
        } catch (Throwable th6) {
            th = th6;
            fileDescriptor = null;
        }
    }

    public final void w(b bVar) throws Throwable {
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.c(ByteOrder.LITTLE_ENDIAN);
        bVar.d(L.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = bVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(N, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (bVar.read(bArr3) == i2) {
                        this.p = i3;
                        S(bArr3, 0);
                        c0(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ih8.a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void y(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.h);
        int iM2 = dVar2.m(this.h);
        if (this.d == 7) {
            iM += this.q;
        }
        if (iM > 0 && iM2 > 0) {
            this.i = true;
            if (this.f18978a == null && this.c == null && this.f18979b == null) {
                byte[] bArr = new byte[iM2];
                bVar.skip(iM);
                bVar.read(bArr);
                this.n = bArr;
            }
            this.l = iM;
            this.m = iM2;
        }
        if (v) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting thumbnail attributes with offset: ");
            sb.append(iM);
            sb.append(", length: ");
            sb.append(iM2);
        }
    }

    public final void z(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get("StripOffsets");
        d dVar2 = (d) map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrD = ih8.d(dVar.o(this.h));
        long[] jArrD2 = ih8.d(dVar2.o(this.h));
        if (jArrD == null || jArrD.length == 0 || jArrD2 == null || jArrD2.length == 0 || jArrD.length != jArrD2.length) {
            return;
        }
        long j = 0;
        for (long j2 : jArrD2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.f18980k = true;
        this.j = true;
        this.i = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrD.length; i4++) {
            int i5 = (int) jArrD[i4];
            int i6 = (int) jArrD2[i4];
            if (i4 < jArrD.length - 1 && i5 + i6 != jArrD[i4 + 1]) {
                this.f18980k = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                return;
            }
            long j3 = i7;
            if (bVar.skip(j3) != j3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to skip ");
                sb.append(i7);
                sb.append(" bytes.");
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (bVar.read(bArr2) != i6) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to read ");
                sb2.append(i6);
                sb2.append(" bytes.");
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.n = bArr;
        if (this.f18980k) {
            this.l = (int) jArrD[0];
            this.m = i;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18989b;
        public final long c;
        public final byte[] d;

        public d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(gh8.p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[gh8.X[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d : dArr) {
                byteBufferWrap.putDouble(d);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[gh8.X[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putInt(i);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[gh8.X[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f18992a);
                byteBufferWrap.putInt((int) fVar.f18993b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(gh8.p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j, ByteOrder byteOrder) {
            return g(new long[]{j}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[gh8.X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[gh8.X[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f18992a);
                byteBufferWrap.putInt((int) fVar.f18993b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i, ByteOrder byteOrder) {
            return k(new int[]{i}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[gh8.X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i < fVarArr.length) {
                sb.append(fVarArr[i].f18992a);
                sb.append('/');
                sb.append(fVarArr[i].f18993b);
                i++;
                if (i != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public Object o(ByteOrder byteOrder) throws Throwable {
            b bVar;
            byte b2;
            byte b3;
            b bVar2 = null;
            try {
                bVar = new b(this.d);
                try {
                    bVar.c(byteOrder);
                    int length = 0;
                    switch (this.f18988a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.d;
                            if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                String str = new String(bArr, gh8.p0);
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b2 + 48)});
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f18989b >= gh8.Y.length) {
                                int i = 0;
                                while (true) {
                                    byte[] bArr2 = gh8.Y;
                                    if (i >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (this.d[i] == bArr2[i]) {
                                        i++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < this.f18989b && (b3 = this.d[length]) != 0) {
                                if (b3 >= 32) {
                                    sb.append((char) b3);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            String string = sb.toString();
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused3) {
                            }
                            return string;
                        case 3:
                            int[] iArr = new int[this.f18989b];
                            while (length < this.f18989b) {
                                iArr[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f18989b];
                            while (length < this.f18989b) {
                                jArr[length] = bVar.b();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            f[] fVarArr = new f[this.f18989b];
                            while (length < this.f18989b) {
                                fVarArr[length] = new f(bVar.b(), bVar.b());
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused6) {
                            }
                            return fVarArr;
                        case 8:
                            int[] iArr2 = new int[this.f18989b];
                            while (length < this.f18989b) {
                                iArr2[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f18989b];
                            while (length < this.f18989b) {
                                iArr3[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            f[] fVarArr2 = new f[this.f18989b];
                            while (length < this.f18989b) {
                                fVarArr2[length] = new f(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused9) {
                            }
                            return fVarArr2;
                        case 11:
                            double[] dArr = new double[this.f18989b];
                            while (length < this.f18989b) {
                                dArr[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f18989b];
                            while (length < this.f18989b) {
                                dArr2[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        try {
                            bVar2.close();
                        } catch (IOException unused15) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused16) {
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public int p() {
            return gh8.X[this.f18988a] * this.f18989b;
        }

        public String toString() {
            return "(" + gh8.W[this.f18988a] + ", data length:" + this.d.length + ")";
        }

        public d(int i, int i2, long j, byte[] bArr) {
            this.f18988a = i;
            this.f18989b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18993b;

        public f(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        public double a() {
            return this.f18992a / this.f18993b;
        }

        public String toString() {
            return this.f18992a + "/" + this.f18993b;
        }

        public f(long j, long j2) {
            if (j2 == 0) {
                this.f18992a = 0L;
                this.f18993b = 1L;
            } else {
                this.f18992a = j;
                this.f18993b = j2;
            }
        }
    }

    public static class g extends b {
        public g(byte[] bArr) throws IOException {
            super(bArr);
            this.f18984a.mark(Integer.MAX_VALUE);
        }

        public void l(long j) throws IOException {
            int i = this.c;
            if (i > j) {
                this.c = 0;
                this.f18984a.reset();
            } else {
                j -= (long) i;
            }
            d((int) j);
        }

        public g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f18984a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public gh8(File file) throws Throwable {
        e[][] eVarArr = j0;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            A(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f18991b;
        public final int c;
        public final int d;

        public e(String str, int i, int i2) {
            this.f18991b = str;
            this.f18990a = i;
            this.c = i2;
            this.d = -1;
        }

        public boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public e(String str, int i, int i2, int i3) {
            this.f18991b = str;
            this.f18990a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public gh8(String str) throws Throwable {
        e[][] eVarArr = j0;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            A(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    public gh8(InputStream inputStream, int i) throws IOException {
        e[][] eVarArr = j0;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f18978a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, q0.length);
                if (!B(bufferedInputStream)) {
                    return;
                }
                this.e = true;
                this.c = null;
                this.f18979b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.f18979b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (J(fileInputStream.getFD())) {
                    this.c = null;
                    this.f18979b = fileInputStream.getFD();
                } else {
                    this.c = null;
                    this.f18979b = null;
                }
            } else {
                this.c = null;
                this.f18979b = null;
            }
            O(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
