package d8;

import am.j;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.firebase.perf.util.Constants;
import com.google.mlkit.common.MlKitException;
import j20.x;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v.e0;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final e W;
    public static final e[][] X;
    public static final e[] Y;
    public static final HashMap<Integer, e>[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final HashMap<String, e>[] f58196a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Set<String> f58197b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f58198c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Charset f58199d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f58200e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f58201f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f58202g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Pattern f58203h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f58204i0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f58210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f58211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f58212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f58213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f58214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, d>[] f58215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f58216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f58217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f58218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f58219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f58220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f58221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f58223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f58224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f58225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f58226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f58227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f58228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f58229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f58230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f58205v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List<Integer> f58206w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List<Integer> f58207x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f58208y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f58209z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {97, 118, 105, 102};
    public static final byte[] F = {97, 118, 105, 115};
    public static final byte[] G = {79, 76, 89, 77, 80, 0};
    public static final byte[] H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] I = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};
    public static final byte[] J = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: d8.a$a, reason: collision with other inner class name */
    public class C1241a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f58231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f58232b;

        public C1241a(a aVar, g gVar) {
            this.f58232b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j8, byte[] bArr, int i14, int i15) {
            if (i15 == 0) {
                return 0;
            }
            if (j8 < 0) {
                return -1;
            }
            try {
                long j14 = this.f58231a;
                g gVar = this.f58232b;
                if (j14 != j8) {
                    if (j14 >= 0 && j8 >= j14 + ((long) gVar.f58233a.available())) {
                        return -1;
                    }
                    gVar.c(j8);
                    this.f58231a = j8;
                }
                if (i15 > gVar.f58233a.available()) {
                    i15 = gVar.f58233a.available();
                }
                int i16 = gVar.read(bArr, i14, i15);
                if (i16 >= 0) {
                    this.f58231a += (long) i16;
                    return i16;
                }
            } catch (IOException unused) {
            }
            this.f58231a = -1L;
            return -1;
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", Constants.FROZEN_FRAME_TIME, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        W = new e("StripOffsets", 273, 3);
        X = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", TsExtractor.TS_STREAM_TYPE_AIT, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        Y = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        Z = new HashMap[10];
        f58196a0 = new HashMap[10];
        f58197b0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f58198c0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f58199d0 = charsetForName;
        f58200e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f58201f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i14 = 0;
        while (true) {
            e[][] eVarArr6 = X;
            if (i14 >= eVarArr6.length) {
                HashMap<Integer, Integer> map = f58198c0;
                e[] eVarArr7 = Y;
                map.put(Integer.valueOf(eVarArr7[0].f58244a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f58244a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f58244a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f58244a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f58244a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f58244a), 8);
                Pattern.compile(".*[1-9].*");
                f58202g0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f58203h0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f58204i0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i14] = new HashMap<>();
            f58196a0[i14] = new HashMap<>();
            for (e eVar : eVarArr6[i14]) {
                Z[i14].put(Integer.valueOf(eVar.f58244a), eVar);
                f58196a0[i14].put(eVar.f58245b, eVar);
            }
            i14++;
        }
    }

    public a(InputStream inputStream, int i14) throws Throwable {
        e[][] eVarArr = X;
        this.f58215f = new HashMap[eVarArr.length];
        this.f58216g = new HashSet(eVarArr.length);
        this.f58217h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            x.l("inputStream cannot be null");
            throw null;
        }
        this.f58210a = null;
        boolean z14 = i14 == 1;
        this.f58214e = z14;
        if (z14) {
            this.f58212c = null;
            this.f58211b = null;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f58212c = (AssetManager.AssetInputStream) inputStream;
            this.f58211b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f58212c = null;
                this.f58211b = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f58212c = null;
                this.f58211b = null;
            }
        } else {
            this.f58212c = null;
            this.f58211b = null;
        }
        u(inputStream);
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d14 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d15 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d16 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d15 / 60.0d) + d14;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d16;
            }
            return -d16;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e4) {
            l2.t(e4);
            return 0.0d;
        }
    }

    public static Pair<Integer, Integer> q(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i14 = 1; i14 < strArrSplit.length; i14++) {
                Pair<Integer, Integer> pairQ2 = q(strArrSplit[i14]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j8 = Long.parseLong(str);
                    if (j8 < 0 || j8 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return j8 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
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
                long j14 = (long) Double.parseDouble(strArrSplit2[0]);
                long j15 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j14 >= 0 && j15 >= 0) {
                    if (j14 <= 2147483647L && j15 <= 2147483647L) {
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

    public static ByteOrder x(b bVar) throws IOException {
        short s8 = bVar.readShort();
        if (s8 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s8 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        o2.c.u(Integer.toHexString(s8), "Invalid byte order: ");
        return null;
    }

    public final void A(String str) {
        for (int i14 = 0; i14 < X.length; i14++) {
            this.f58215f[i14].remove(str);
        }
    }

    public final void B(int i14, String str, String str2) {
        HashMap<String, d>[] mapArr = this.f58215f;
        if (mapArr[i14].isEmpty() || mapArr[i14].get(str) == null) {
            return;
        }
        HashMap<String, d> map = mapArr[i14];
        map.put(str2, map.get(str));
        mapArr[i14].remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3 A[Catch: all -> 0x00fc, Exception -> 0x00ff, TryCatch #15 {Exception -> 0x00ff, all -> 0x00fc, blocks: (B:79:0x00ef, B:81:0x00f3, B:88:0x0111, B:87:0x0102), top: B:134:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0102 A[Catch: all -> 0x00fc, Exception -> 0x00ff, TryCatch #15 {Exception -> 0x00ff, all -> 0x00fc, blocks: (B:79:0x00ef, B:81:0x00f3, B:88:0x0111, B:87:0x0102), top: B:134:0x00ef }] */
    public final void C() {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        Object obj;
        int i14 = this.f58213d;
        if (i14 != 4 && i14 != 13 && i14 != 14) {
            h.C("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
            return;
        }
        if (this.f58211b == null && this.f58210a == null) {
            h.C("ExifInterface does not support saving attributes for the current input.");
            return;
        }
        if (this.f58218i && this.f58219j && !this.f58220k) {
            h.C("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            return;
        }
        int i15 = this.f58224o;
        Closeable closeable = null;
        this.f58223n = (i15 == 6 || i15 == 7) ? o() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f58210a != null) {
                fileInputStream = new FileInputStream(this.f58210a);
            } else {
                Os.lseek(this.f58211b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f58211b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    d8.b.d(fileInputStream, fileOutputStream);
                    d8.b.a(fileInputStream);
                    d8.b.a(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f58210a != null) {
                                        fileOutputStream2 = new FileOutputStream(this.f58210a);
                                    } else {
                                        Os.lseek(this.f58211b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.f58211b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i16 = this.f58213d;
                                                if (i16 == 4) {
                                                    D(bufferedInputStream, bufferedOutputStream);
                                                } else if (i16 == 13) {
                                                    E(bufferedInputStream, bufferedOutputStream);
                                                } else if (i16 == 14) {
                                                    F(bufferedInputStream, bufferedOutputStream);
                                                }
                                                d8.b.a(bufferedInputStream);
                                                d8.b.a(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f58223n = null;
                                            } catch (Exception e4) {
                                                e = e4;
                                                closeable = fileInputStream3;
                                                try {
                                                    try {
                                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                        try {
                                                            if (this.f58210a != null) {
                                                                fileOutputStream3 = new FileOutputStream(this.f58210a);
                                                            } else {
                                                                Os.lseek(this.f58211b, 0L, OsConstants.SEEK_SET);
                                                                fileOutputStream3 = new FileOutputStream(this.f58211b);
                                                            }
                                                            fileOutputStream2 = fileOutputStream3;
                                                            d8.b.d(fileInputStream2, fileOutputStream2);
                                                            d8.b.a(fileInputStream2);
                                                            d8.b.a(fileOutputStream2);
                                                            throw new IOException("Failed to save new file", e);
                                                        } catch (Exception e14) {
                                                            e = e14;
                                                            closeable = fileInputStream2;
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            closeable = fileInputStream2;
                                                            d8.b.a(closeable);
                                                            d8.b.a(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } catch (Exception e15) {
                                                    e = e15;
                                                }
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            closeable = bufferedInputStream;
                                            d8.b.a(closeable);
                                            d8.b.a(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        obj = null;
                                        closeable = fileInputStream3;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (this.f58210a != null) {
                                            fileOutputStream3 = new FileOutputStream(this.f58210a);
                                        } else {
                                            Os.lseek(this.f58211b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(this.f58211b);
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        d8.b.d(fileInputStream2, fileOutputStream2);
                                        d8.b.a(fileInputStream2);
                                        d8.b.a(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    fileOutputStream2 = null;
                                    obj = null;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            d8.b.a(closeable);
                            d8.b.a(0);
                            if (0 == 0) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Exception e19) {
                        e = e19;
                        fileOutputStream2 = null;
                    }
                } catch (Exception e24) {
                    e = e24;
                    closeable = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        d8.b.a(closeable);
                        d8.b.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    closeable = fileInputStream;
                    d8.b.a(closeable);
                    d8.b.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e25) {
                e = e25;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e26) {
            e = e26;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte[] bArr;
        if (f58205v) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            h.C("Invalid marker");
            return;
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            h.C("Invalid marker");
            return;
        }
        cVar.a(-40);
        cVar.a(-1);
        cVar.a(-31);
        this.f58225p = L(cVar);
        d dVar = this.f58229t;
        byte[] bArr2 = f58201f0;
        if (dVar != null) {
            cVar.write(-1);
            cVar.a(-31);
            cVar.j(bArr2.length + 2 + this.f58229t.f58243d.length);
            cVar.write(bArr2);
            cVar.write(this.f58229t.f58243d);
            this.f58230u = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b14 = bVar.readByte();
            if (b14 == -39 || b14 == -38) {
                cVar.a(-1);
                cVar.a(b14);
                d8.b.d(bVar, cVar);
                return;
            }
            if (b14 != -31) {
                cVar.a(-1);
                cVar.a(b14);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.j(unsignedShort);
                int i14 = unsignedShort - 2;
                if (i14 < 0) {
                    h.C("Invalid length");
                    return;
                }
                while (i14 > 0) {
                    int i15 = bVar.read(bArr3, 0, Math.min(i14, 4096));
                    if (i15 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i15);
                    i14 -= i15;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    h.C("Invalid length");
                    return;
                }
                int length2 = bArr2.length;
                byte[] bArr4 = f58200e0;
                if (length >= length2) {
                    bArr = new byte[bArr2.length];
                } else {
                    bArr = length >= bArr4.length ? new byte[bArr4.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (d8.b.e(bArr, bArr4) || d8.b.e(bArr, bArr2)) {
                        bVar.a(length - bArr.length);
                    }
                }
                cVar.a(-1);
                cVar.a(b14);
                cVar.j(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i16 = bVar.read(bArr3, 0, Math.min(length, 4096));
                    if (i16 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i16);
                    length -= i16;
                }
            }
        }
        h.C("Invalid marker");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x006e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0027 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005b -> B:10:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void E(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = d8.a.f58205v
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            d8.a$b r0 = new d8.a$b
            r0.<init>(r9)
            d8.a$c r9 = new d8.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = d8.a.I
            int r10 = r10.length
            d8.b.c(r0, r9, r10)
            d8.a$d r10 = r8.f58229t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.f58230u
            if (r10 == 0) goto L5b
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L30
            if (r10 == 0) goto L2c
            goto L30
        L2c:
            d8.b.d(r0, r9)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5d
            r9.c(r3)
            r9.c(r4)
            int r3 = r3 + 4
            d8.b.c(r0, r9, r3)
            int r3 = r8.f58225p
            if (r3 != 0) goto L50
            r8.M(r9)
            r1 = r2
        L50:
            d8.a$d r3 = r8.f58229t
            if (r3 == 0) goto L27
            boolean r3 = r8.f58230u
            if (r3 != 0) goto L27
            r8.N(r9)
        L5b:
            r10 = r2
            goto L27
        L5d:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6e
            if (r1 == 0) goto L6e
            r8.M(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L27
        L6e:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = d8.a.J
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            d8.a$d r10 = r8.f58229t
            if (r10 == 0) goto L8f
            r8.N(r9)
        L8f:
            r0.a(r6)
            goto L5b
        L93:
            r9.c(r3)
            r9.c(r4)
            r9.write(r7)
            d8.b.c(r0, r9, r6)
            goto L27
        La0:
            r9.c(r3)
            r9.c(r4)
            int r3 = r3 + 4
            d8.b.c(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.E(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void F(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.F(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01be A[LOOP:1: B:107:0x01bb->B:109:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x01dc A[LOOP:2: B:111:0x01da->B:112:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x020a A[LOOP:3: B:115:0x0207->B:117:0x020a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0258 A[LOOP:4: B:119:0x0256->B:120:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x0277  */
    /* JADX WARN: Code duplicated, block: B:125:0x028b A[LOOP:5: B:123:0x0288->B:125:0x028b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x02aa A[LOOP:6: B:127:0x02a8->B:128:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[LOOP:7: B:131:0x02d0->B:133:0x02d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0306  */
    /* JADX WARN: Code duplicated, block: B:138:0x0316 A[LOOP:8: B:136:0x0313->B:138:0x0316, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x032d  */
    /* JADX WARN: Code duplicated, block: B:143:0x033d A[LOOP:9: B:141:0x033a->B:143:0x033d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0354  */
    /* JADX WARN: Code duplicated, block: B:146:0x0362  */
    public final void G(String str, String str2) {
        e eVar;
        int[] iArr;
        int i14;
        int i15;
        String[] strArrSplit;
        int[] iArr2;
        int i16;
        String[] strArrSplit2;
        long[] jArr;
        int i17;
        String[] strArrSplit3;
        f[] fVarArr;
        int i18;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i19;
        ByteBuffer byteBufferWrap;
        int i24;
        String[] strArrSplit5;
        int length2;
        f[] fVarArr2;
        int i25;
        ByteBuffer byteBufferWrap2;
        int i26;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i27;
        ByteBuffer byteBufferWrap3;
        int i28;
        String strReplaceAll = str2;
        String str3 = "ISOSpeedRatings".equals(str) ? "PhotographicSensitivity" : str;
        int i29 = 2;
        int i30 = 1;
        if (strReplaceAll != null) {
            if (f58197b0.contains(str3) && !strReplaceAll.contains("/")) {
                try {
                    strReplaceAll = f.a(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            } else if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f58202g0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean zFind = f58203h0.matcher(strReplaceAll).find();
                boolean zFind2 = f58204i0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19) {
                    return;
                }
                if (!zFind && !zFind2) {
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        }
        boolean zEquals = "Xmp".equals(str3);
        int i34 = 12;
        int i35 = 9;
        int i36 = 4;
        HashMap<String, d>[] mapArr = this.f58215f;
        int i37 = 0;
        if (zEquals) {
            boolean z14 = mapArr[0].containsKey("Xmp") || mapArr[5].containsKey("Xmp");
            int i38 = this.f58213d;
            char c14 = i38 != 4 ? (i38 == 9 || i38 == 15 || i38 == 12 || i38 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c14 == 2 && (this.f58229t != null || !z14)) || (c14 == 3 && !z14)) {
                this.f58229t = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i39 = 0;
        while (i39 < X.length) {
            if ((i39 != i36 || this.f58218i) && (eVar = f58196a0[i39].get(str3)) != null) {
                int i44 = eVar.f58247d;
                int i45 = eVar.f58246c;
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairQ = q(strReplaceAll);
                    if (i45 == ((Integer) pairQ.first).intValue() || i45 == ((Integer) pairQ.second).intValue()) {
                        i44 = i45;
                        iArr = U;
                        switch (i44) {
                            case 1:
                                i14 = i30;
                                i15 = i37;
                                mapArr[i39].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i14 = i30;
                                i15 = i37;
                                mapArr[i39].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i16 < strArrSplit.length) {
                                    iArr2[i16] = Integer.parseInt(strArrSplit[i16]);
                                }
                                mapArr[i39].put(str3, d.g(iArr2, this.f58217h));
                                break;
                            case 4:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i17 < strArrSplit2.length) {
                                    jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                                }
                                mapArr[i39].put(str3, d.d(jArr, this.f58217h));
                                break;
                            case 5:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                while (i18 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i18].split("/", -1);
                                    fVarArr[i18] = new f((long) Double.parseDouble(strArrSplit7[i15]), (long) Double.parseDouble(strArrSplit7[i14]), null);
                                }
                                mapArr[i39].put(str3, d.e(fVarArr, this.f58217h));
                                break;
                            case 9:
                                i14 = i30;
                                int i46 = i35;
                                i15 = i37;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i19 < strArrSplit4.length) {
                                    iArr3[i19] = Integer.parseInt(strArrSplit4[i19]);
                                }
                                HashMap<String, d> map = mapArr[i39];
                                ByteOrder byteOrder = this.f58217h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i46] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i24 < length) {
                                    byteBufferWrap.putInt(iArr3[i24]);
                                }
                                map.put(str3, new d(i46, length, byteBufferWrap.array()));
                                break;
                            case 10:
                                i15 = i37;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i25 = i15;
                                while (i25 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i25].split("/", -1);
                                    int i47 = i30;
                                    fVarArr2[i25] = new f((long) Double.parseDouble(strArrSplit8[i15]), (long) Double.parseDouble(strArrSplit8[i47]), null);
                                    i25++;
                                    i30 = i47;
                                    iArr = iArr;
                                    i35 = i35;
                                }
                                i14 = i30;
                                HashMap<String, d> map2 = mapArr[i39];
                                ByteOrder byteOrder2 = this.f58217h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i26 < length2) {
                                    f fVar = fVarArr2[i26];
                                    byteBufferWrap2.putInt((int) fVar.f58248a);
                                    byteBufferWrap2.putInt((int) fVar.f58249b);
                                }
                                map2.put(str3, new d(10, length2, byteBufferWrap2.array()));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i27 < strArrSplit6.length) {
                                    dArr[i27] = Double.parseDouble(strArrSplit6[i27]);
                                }
                                HashMap<String, d> map3 = mapArr[i39];
                                ByteOrder byteOrder3 = this.f58217h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i34] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                i28 = i37;
                                while (i28 < length3) {
                                    double[] dArr2 = dArr;
                                    byteBufferWrap3.putDouble(dArr2[i28]);
                                    i28++;
                                    i37 = i37;
                                    dArr = dArr2;
                                }
                                i15 = i37;
                                map3.put(str3, new d(i34, length3, byteBufferWrap3.array()));
                                i14 = i30;
                                break;
                        }
                    } else if (i44 != -1 && (i44 == ((Integer) pairQ.first).intValue() || i44 == ((Integer) pairQ.second).intValue())) {
                        iArr = U;
                        switch (i44) {
                            case 1:
                                i14 = i30;
                                i15 = i37;
                                mapArr[i39].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i14 = i30;
                                i15 = i37;
                                mapArr[i39].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i16 = i15; i16 < strArrSplit.length; i16++) {
                                    iArr2[i16] = Integer.parseInt(strArrSplit[i16]);
                                }
                                mapArr[i39].put(str3, d.g(iArr2, this.f58217h));
                                break;
                            case 4:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i17 = i15; i17 < strArrSplit2.length; i17++) {
                                    jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                                }
                                mapArr[i39].put(str3, d.d(jArr, this.f58217h));
                                break;
                            case 5:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                for (i18 = i15; i18 < strArrSplit3.length; i18++) {
                                    String[] strArrSplit9 = strArrSplit3[i18].split("/", -1);
                                    fVarArr[i18] = new f((long) Double.parseDouble(strArrSplit9[i15]), (long) Double.parseDouble(strArrSplit9[i14]), null);
                                }
                                mapArr[i39].put(str3, d.e(fVarArr, this.f58217h));
                                break;
                            case 9:
                                i14 = i30;
                                int i48 = i35;
                                i15 = i37;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i19 = i15; i19 < strArrSplit4.length; i19++) {
                                    iArr3[i19] = Integer.parseInt(strArrSplit4[i19]);
                                }
                                HashMap<String, d> map4 = mapArr[i39];
                                ByteOrder byteOrder4 = this.f58217h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i48] * length]);
                                byteBufferWrap.order(byteOrder4);
                                for (i24 = i15; i24 < length; i24++) {
                                    byteBufferWrap.putInt(iArr3[i24]);
                                }
                                map4.put(str3, new d(i48, length, byteBufferWrap.array()));
                                break;
                            case 10:
                                i15 = i37;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i25 = i15;
                                while (i25 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i25].split("/", -1);
                                    int i49 = i30;
                                    fVarArr2[i25] = new f((long) Double.parseDouble(strArrSplit10[i15]), (long) Double.parseDouble(strArrSplit10[i49]), null);
                                    i25++;
                                    i30 = i49;
                                    iArr = iArr;
                                    i35 = i35;
                                }
                                i14 = i30;
                                HashMap<String, d> map5 = mapArr[i39];
                                ByteOrder byteOrder5 = this.f58217h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                for (i26 = i15; i26 < length2; i26++) {
                                    f fVar2 = fVarArr2[i26];
                                    byteBufferWrap2.putInt((int) fVar2.f58248a);
                                    byteBufferWrap2.putInt((int) fVar2.f58249b);
                                }
                                map5.put(str3, new d(10, length2, byteBufferWrap2.array()));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i27 = i37; i27 < strArrSplit6.length; i27++) {
                                    dArr[i27] = Double.parseDouble(strArrSplit6[i27]);
                                }
                                HashMap<String, d> map6 = mapArr[i39];
                                ByteOrder byteOrder6 = this.f58217h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i34] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                i28 = i37;
                                while (i28 < length3) {
                                    double[] dArr3 = dArr;
                                    byteBufferWrap3.putDouble(dArr3[i28]);
                                    i28++;
                                    i37 = i37;
                                    dArr = dArr3;
                                }
                                i15 = i37;
                                map6.put(str3, new d(i34, length3, byteBufferWrap3.array()));
                                i14 = i30;
                                break;
                        }
                    } else if (i45 == i30 || i45 == 7 || i45 == i29) {
                        i44 = i45;
                        iArr = U;
                        switch (i44) {
                            case 1:
                                i14 = i30;
                                i15 = i37;
                                mapArr[i39].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i14 = i30;
                                i15 = i37;
                                mapArr[i39].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i16 < strArrSplit.length) {
                                    iArr2[i16] = Integer.parseInt(strArrSplit[i16]);
                                }
                                mapArr[i39].put(str3, d.g(iArr2, this.f58217h));
                                break;
                            case 4:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i17 < strArrSplit2.length) {
                                    jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                                }
                                mapArr[i39].put(str3, d.d(jArr, this.f58217h));
                                break;
                            case 5:
                                i14 = i30;
                                i15 = i37;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                while (i18 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i18].split("/", -1);
                                    fVarArr[i18] = new f((long) Double.parseDouble(strArrSplit11[i15]), (long) Double.parseDouble(strArrSplit11[i14]), null);
                                }
                                mapArr[i39].put(str3, d.e(fVarArr, this.f58217h));
                                break;
                            case 9:
                                i14 = i30;
                                int i410 = i35;
                                i15 = i37;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i19 < strArrSplit4.length) {
                                    iArr3[i19] = Integer.parseInt(strArrSplit4[i19]);
                                }
                                HashMap<String, d> map7 = mapArr[i39];
                                ByteOrder byteOrder7 = this.f58217h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i410] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i24 < length) {
                                    byteBufferWrap.putInt(iArr3[i24]);
                                }
                                map7.put(str3, new d(i410, length, byteBufferWrap.array()));
                                break;
                            case 10:
                                i15 = i37;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i25 = i15;
                                while (i25 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i25].split("/", -1);
                                    int i411 = i30;
                                    fVarArr2[i25] = new f((long) Double.parseDouble(strArrSplit12[i15]), (long) Double.parseDouble(strArrSplit12[i411]), null);
                                    i25++;
                                    i30 = i411;
                                    iArr = iArr;
                                    i35 = i35;
                                }
                                i14 = i30;
                                HashMap<String, d> map8 = mapArr[i39];
                                ByteOrder byteOrder8 = this.f58217h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i26 < length2) {
                                    f fVar3 = fVarArr2[i26];
                                    byteBufferWrap2.putInt((int) fVar3.f58248a);
                                    byteBufferWrap2.putInt((int) fVar3.f58249b);
                                }
                                map8.put(str3, new d(10, length2, byteBufferWrap2.array()));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i27 < strArrSplit6.length) {
                                    dArr[i27] = Double.parseDouble(strArrSplit6[i27]);
                                }
                                HashMap<String, d> map9 = mapArr[i39];
                                ByteOrder byteOrder9 = this.f58217h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i34] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                i28 = i37;
                                while (i28 < length3) {
                                    double[] dArr4 = dArr;
                                    byteBufferWrap3.putDouble(dArr4[i28]);
                                    i28++;
                                    i37 = i37;
                                    dArr = dArr4;
                                }
                                i15 = i37;
                                map9.put(str3, new d(i34, length3, byteBufferWrap3.array()));
                                i14 = i30;
                                break;
                        }
                    } else if (f58205v) {
                        String[] strArr = T;
                        String str4 = strArr[i45];
                        if (i44 != -1) {
                            String str5 = strArr[i44];
                        }
                        String str6 = strArr[((Integer) pairQ.first).intValue()];
                        if (((Integer) pairQ.second).intValue() != -1) {
                            String str7 = strArr[((Integer) pairQ.second).intValue()];
                        }
                    }
                } else {
                    mapArr[i39].remove(str3);
                }
                i14 = i30;
                i15 = i37;
            } else {
                i14 = i30;
                i15 = i37;
            }
            i39++;
            i37 = i15;
            i30 = i14;
            i29 = 2;
            i34 = 12;
            i35 = 9;
            i36 = 4;
        }
    }

    public final void H(b bVar) throws Throwable {
        d dVar;
        HashMap<String, d> map = this.f58215f[4];
        d dVar2 = map.get("Compression");
        if (dVar2 == null) {
            this.f58224o = 6;
            r(bVar, map);
            return;
        }
        int i14 = dVar2.i(this.f58217h);
        this.f58224o = i14;
        if (i14 != 1) {
            if (i14 == 6) {
                r(bVar, map);
                return;
            } else if (i14 != 7) {
                return;
            }
        }
        d dVar3 = map.get("BitsPerSample");
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.k(this.f58217h);
            int[] iArr2 = f58208y;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f58213d != 3 || (dVar = map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int i15 = dVar.i(this.f58217h);
                if ((i15 != 1 || !Arrays.equals(iArr, f58209z)) && (i15 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            d dVar4 = map.get("StripOffsets");
            d dVar5 = map.get("StripByteCounts");
            if (dVar4 == null || dVar5 == null) {
                return;
            }
            long[] jArrB = d8.b.b(dVar4.k(this.f58217h));
            long[] jArrB2 = d8.b.b(dVar5.k(this.f58217h));
            if (jArrB == null || jArrB.length == 0 || jArrB2 == null || jArrB2.length == 0 || jArrB.length != jArrB2.length) {
                return;
            }
            long j8 = 0;
            for (long j14 : jArrB2) {
                j8 += j14;
            }
            int i16 = (int) j8;
            byte[] bArr = new byte[i16];
            this.f58220k = true;
            this.f58219j = true;
            this.f58218i = true;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < jArrB.length; i19++) {
                int i24 = (int) jArrB[i19];
                int i25 = (int) jArrB2[i19];
                if (i19 < jArrB.length - 1 && i24 + i25 != jArrB[i19 + 1]) {
                    this.f58220k = false;
                }
                int i26 = i24 - i17;
                if (i26 < 0) {
                    return;
                }
                try {
                    bVar.a(i26);
                    int i27 = i17 + i26;
                    byte[] bArr2 = new byte[i25];
                    bVar.readFully(bArr2);
                    i17 = i27 + i25;
                    System.arraycopy(bArr2, 0, bArr, i18, i25);
                    i18 += i25;
                } catch (EOFException unused) {
                    return;
                }
            }
            this.f58223n = bArr;
            if (this.f58220k) {
                this.f58221l = (int) jArrB[0];
                this.f58222m = i16;
            }
        }
    }

    public final void I(int i14, int i15) throws Throwable {
        HashMap<String, d>[] mapArr = this.f58215f;
        if (mapArr[i14].isEmpty() || mapArr[i15].isEmpty()) {
            return;
        }
        d dVar = mapArr[i14].get("ImageLength");
        d dVar2 = mapArr[i14].get("ImageWidth");
        d dVar3 = mapArr[i15].get("ImageLength");
        d dVar4 = mapArr[i15].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int i16 = dVar.i(this.f58217h);
        int i17 = dVar2.i(this.f58217h);
        int i18 = dVar3.i(this.f58217h);
        int i19 = dVar4.i(this.f58217h);
        if (i16 >= i18 || i17 >= i19) {
            return;
        }
        HashMap<String, d> map = mapArr[i14];
        mapArr[i14] = mapArr[i15];
        mapArr[i15] = map;
    }

    public final void J(g gVar, int i14) throws Throwable {
        d dVarF;
        d dVarF2;
        HashMap<String, d>[] mapArr = this.f58215f;
        d dVar = mapArr[i14].get("DefaultCropSize");
        d dVar2 = mapArr[i14].get("SensorTopBorder");
        d dVar3 = mapArr[i14].get("SensorLeftBorder");
        d dVar4 = mapArr[i14].get("SensorBottomBorder");
        d dVar5 = mapArr[i14].get("SensorRightBorder");
        if (dVar != null) {
            int i15 = dVar.f58240a;
            ByteOrder byteOrder = this.f58217h;
            if (i15 == 5) {
                f[] fVarArr = (f[]) dVar.k(byteOrder);
                if (fVarArr == null || fVarArr.length != 2) {
                    Arrays.toString(fVarArr);
                    return;
                }
                dVarF = d.e(new f[]{fVarArr[0]}, this.f58217h);
                dVarF2 = d.e(new f[]{fVarArr[1]}, this.f58217h);
            } else {
                int[] iArr = (int[]) dVar.k(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    dVarF = d.f(iArr[0], this.f58217h);
                    dVarF2 = d.f(iArr[1], this.f58217h);
                }
            }
            mapArr[i14].put("ImageWidth", dVarF);
            mapArr[i14].put("ImageLength", dVarF2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int i16 = dVar2.i(this.f58217h);
            int i17 = dVar4.i(this.f58217h);
            int i18 = dVar5.i(this.f58217h);
            int i19 = dVar3.i(this.f58217h);
            if (i17 <= i16 || i18 <= i19) {
                return;
            }
            d dVarF3 = d.f(i17 - i16, this.f58217h);
            d dVarF4 = d.f(i18 - i19, this.f58217h);
            mapArr[i14].put("ImageLength", dVarF3);
            mapArr[i14].put("ImageWidth", dVarF4);
            return;
        }
        d dVar6 = mapArr[i14].get("ImageLength");
        d dVar7 = mapArr[i14].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = mapArr[i14].get("JPEGInterchangeFormat");
            d dVar9 = mapArr[i14].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int i24 = dVar8.i(this.f58217h);
            int i25 = dVar8.i(this.f58217h);
            gVar.c(i24);
            byte[] bArr = new byte[i25];
            gVar.readFully(bArr);
            g(new b(bArr), i24, i14);
        }
    }

    public final void K() throws Throwable {
        I(0, 5);
        I(0, 4);
        I(5, 4);
        HashMap<String, d>[] mapArr = this.f58215f;
        d dVar = mapArr[1].get("PixelXDimension");
        d dVar2 = mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        t(mapArr[4]);
        B(0, "ThumbnailOrientation", "Orientation");
        B(0, "ThumbnailImageLength", "ImageLength");
        B(0, "ThumbnailImageWidth", "ImageWidth");
        B(5, "ThumbnailOrientation", "Orientation");
        B(5, "ThumbnailImageLength", "ImageLength");
        B(5, "ThumbnailImageWidth", "ImageWidth");
        B(4, "Orientation", "ThumbnailOrientation");
        B(4, "ImageLength", "ThumbnailImageLength");
        B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int L(c cVar) throws IOException {
        HashMap<String, d>[] mapArr;
        int i14;
        int[] iArr;
        int i15;
        e[][] eVarArr = X;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = Y;
        for (e eVar : eVarArr2) {
            A(eVar.f58245b);
        }
        if (this.f58218i) {
            if (this.f58219j) {
                A("StripOffsets");
                A("StripByteCounts");
            } else {
                A("JPEGInterchangeFormat");
                A("JPEGInterchangeFormatLength");
            }
        }
        int i16 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f58215f;
            if (i16 >= length) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = mapArr[i16].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
            i16++;
        }
        if (mapArr[1].isEmpty()) {
            i14 = 1;
        } else {
            i14 = 1;
            mapArr[0].put(eVarArr2[1].f58245b, d.c(0L, this.f58217h));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(eVarArr2[2].f58245b, d.c(0L, this.f58217h));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i14].put(eVarArr2[3].f58245b, d.c(0L, this.f58217h));
        }
        int i17 = 4;
        if (this.f58218i) {
            if (this.f58219j) {
                mapArr[4].put("StripOffsets", d.f(0, this.f58217h));
                mapArr[4].put("StripByteCounts", d.f(this.f58222m, this.f58217h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(0L, this.f58217h));
                mapArr[4].put("JPEGInterchangeFormatLength", d.c(this.f58222m, this.f58217h));
            }
        }
        int i18 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = U;
            if (i18 >= length2) {
                break;
            }
            Iterator<Map.Entry<String, d>> it3 = mapArr[i18].entrySet().iterator();
            int i19 = 0;
            while (it3.hasNext()) {
                d value = it3.next().getValue();
                value.getClass();
                int i24 = iArr[value.f58240a] * value.f58241b;
                if (i24 > 4) {
                    i19 += i24;
                }
            }
            iArr3[i18] = iArr3[i18] + i19;
            i18++;
        }
        int size = 8;
        for (int i25 = 0; i25 < eVarArr.length; i25++) {
            if (!mapArr[i25].isEmpty()) {
                iArr2[i25] = size;
                size = (mapArr[i25].size() * 12) + 6 + iArr3[i25] + size;
            }
        }
        if (this.f58218i) {
            if (this.f58219j) {
                mapArr[4].put("StripOffsets", d.f(size, this.f58217h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(size, this.f58217h));
            }
            this.f58221l = size;
            size += this.f58222m;
        }
        if (this.f58213d == 4) {
            size += 8;
        }
        if (f58205v) {
            for (int i26 = 0; i26 < eVarArr.length; i26++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i26), Integer.valueOf(iArr2[i26]), Integer.valueOf(mapArr[i26].size()), Integer.valueOf(iArr3[i26]), Integer.valueOf(size));
            }
        }
        if (!mapArr[i14].isEmpty()) {
            mapArr[0].put(eVarArr2[i14].f58245b, d.c(iArr2[i14], this.f58217h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(eVarArr2[r6].f58245b, d.c(iArr2[2], this.f58217h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[i14].put(eVarArr2[r6].f58245b, d.c(iArr2[3], this.f58217h));
        }
        int i27 = this.f58213d;
        if (i27 == 4) {
            if (size > 65535) {
                h.z(e0.f(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
                return 0;
            }
            cVar.j(size);
            cVar.write(f58200e0);
        } else if (i27 == 13) {
            cVar.c(size);
            cVar.c(1700284774);
        } else if (i27 == 14) {
            cVar.write(M);
            cVar.c(size);
        }
        int size2 = cVar.f58238a.size();
        cVar.e(this.f58217h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f58239b = this.f58217h;
        cVar.j(42);
        cVar.f(8L);
        int i28 = 0;
        while (i28 < eVarArr.length) {
            if (mapArr[i28].isEmpty()) {
                i15 = i17;
            } else {
                cVar.j(mapArr[i28].size());
                int size3 = (mapArr[i28].size() * 12) + iArr2[i28] + 2 + i17;
                for (Map.Entry<String, d> entry : mapArr[i28].entrySet()) {
                    int i29 = f58196a0[i28].get(entry.getKey()).f58244a;
                    d value2 = entry.getValue();
                    value2.getClass();
                    int i30 = value2.f58241b;
                    int i34 = value2.f58240a;
                    int i35 = iArr[i34] * i30;
                    cVar.j(i29);
                    cVar.j(i34);
                    cVar.c(i30);
                    if (i35 > 4) {
                        cVar.f(size3);
                        size3 += i35;
                    } else {
                        cVar.write(value2.f58243d);
                        if (i35 < 4) {
                            while (i35 < 4) {
                                cVar.a(0);
                                i35++;
                            }
                        }
                    }
                    i17 = 4;
                }
                int i36 = i17;
                if (i28 != 0 || mapArr[i36].isEmpty()) {
                    cVar.f(0L);
                } else {
                    cVar.f(iArr2[i36]);
                }
                Iterator<Map.Entry<String, d>> it4 = mapArr[i28].entrySet().iterator();
                while (it4.hasNext()) {
                    byte[] bArr = it4.next().getValue().f58243d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i15 = 4;
            }
            i28++;
            i17 = i15;
        }
        if (this.f58218i) {
            cVar.write(o());
        }
        if (this.f58213d == 14 && size % 2 == i14) {
            cVar.a(0);
        }
        cVar.f58239b = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void M(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f58225p = cVar.f58238a.size() + L(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.c((int) crc32.getValue());
    }

    public final void N(c cVar) throws IOException {
        cVar.c(this.f58229t.f58243d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.c(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = J;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f58229t.f58243d);
        crc32.update(this.f58229t.f58243d);
        cVar.c((int) crc32.getValue());
        this.f58230u = true;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap<String, d>[] mapArr = this.f58215f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", d.b(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.c(0L, this.f58217h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.c(0L, this.f58217h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", d.c(0L, this.f58217h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", d.c(0L, this.f58217h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            x.l("tag shouldn't be null");
            return null;
        }
        d dVarE = e(str);
        if (dVarE != null) {
            if (str.equals("GPSTimeStamp")) {
                int i14 = dVarE.f58240a;
                if (i14 == 5 || i14 == 10) {
                    f[] fVarArr = (f[]) dVarE.k(this.f58217h);
                    if (fVarArr == null || fVarArr.length != 3) {
                        Arrays.toString(fVarArr);
                        return null;
                    }
                    f fVar = fVarArr[0];
                    Integer numValueOf = Integer.valueOf((int) (fVar.f58248a / fVar.f58249b));
                    f fVar2 = fVarArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (fVar2.f58248a / fVar2.f58249b));
                    f fVar3 = fVarArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f58248a / fVar3.f58249b)));
                }
            } else {
                boolean zContains = f58197b0.contains(str);
                ByteOrder byteOrder = this.f58217h;
                if (!zContains) {
                    return dVarE.j(byteOrder);
                }
                try {
                    return Double.toString(dVarE.h(byteOrder));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int d(int i14, String str) {
        d dVarE = e(str);
        if (dVarE == null) {
            return i14;
        }
        try {
            return dVarE.i(this.f58217h);
        } catch (NumberFormatException unused) {
            return i14;
        }
    }

    public final d e(String str) {
        d dVar;
        int i14;
        d dVar2;
        if (str == null) {
            x.l("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i14 = this.f58213d) != 4 && ((i14 == 9 || i14 == 15 || i14 == 12 || i14 == 13) && (dVar2 = this.f58229t) != null)) {
            return dVar2;
        }
        for (int i15 = 0; i15 < X.length; i15++) {
            d dVar3 = this.f58215f[i15].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f58229t) == null) {
            return null;
        }
        return dVar;
    }

    public final void f(g gVar, int i14) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i15;
        if (i14 == 15 && Build.VERSION.SDK_INT < 31) {
            org.apache.commons.lang3.e.w("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C1241a(this, gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if (BooleanUtils.YES.equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if (BooleanUtils.YES.equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, d>[] mapArr = this.f58215f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.f(Integer.parseInt(strExtractMetadata), this.f58217h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", d.f(Integer.parseInt(strExtractMetadata3), this.f58217h));
                }
                if (strExtractMetadata2 != null) {
                    int i16 = Integer.parseInt(strExtractMetadata2);
                    if (i16 == 90) {
                        i15 = 6;
                    } else if (i16 != 180) {
                        i15 = i16 != 270 ? 1 : 8;
                    } else {
                        i15 = 3;
                    }
                    mapArr[0].put("Orientation", d.f(i15, this.f58217h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i17 = Integer.parseInt(strExtractMetadata4);
                    int i18 = Integer.parseInt(strExtractMetadata5);
                    if (i18 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.c(i17);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i19 = i17 + 6;
                    int i24 = i18 - 6;
                    if (!Arrays.equals(bArr, f58200e0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i24];
                    gVar.readFully(bArr2);
                    this.f58225p = i19;
                    y(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i25 = Integer.parseInt(strExtractMetadata8);
                    int i26 = Integer.parseInt(strExtractMetadata9);
                    long j8 = i25;
                    gVar.c(j8);
                    byte[] bArr3 = new byte[i26];
                    gVar.readFully(bArr3);
                    this.f58229t = new d(1, i26, j8, bArr3);
                    this.f58230u = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e4) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e4);
            }
        } catch (Throwable th3) {
            try {
                mediaMetadataRetriever.release();
                throw th3;
            } catch (IOException unused2) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b A[LOOP:0: B:10:0x0023->B:56:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0062. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
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
    public final void g(d8.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.g(d8.a$b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:144:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x01a5 A[RETURN] */
    public final int h(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i14;
        b bVar2;
        int i15;
        b bVar3;
        b bVar4;
        int i16;
        b bVar5;
        b bVar6;
        int i17;
        int i18;
        int i19;
        long j8;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i24 = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i24 >= bArr2.length) {
                return 4;
            }
            if (bArr[i24] != bArr2[i24]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i25 = 0; i25 < bytes.length; i25++) {
                    if (bArr[i25] != bytes[i25]) {
                        try {
                            bVar2 = new b(bArr);
                            try {
                                try {
                                    long j14 = bVar2.readInt();
                                    byte[] bArr3 = new byte[4];
                                    bVar2.readFully(bArr3);
                                    if (Arrays.equals(bArr3, B)) {
                                        if (j14 == 1) {
                                            j14 = bVar2.readLong();
                                            j8 = 16;
                                            if (j14 < 16) {
                                            }
                                            bVar2.close();
                                            i15 = 0;
                                            i14 = 0;
                                        } else {
                                            j8 = 8;
                                        }
                                        long j15 = 5000;
                                        if (j14 > j15) {
                                            j14 = j15;
                                        }
                                        long j16 = j14 - j8;
                                        if (j16 < 8) {
                                            bVar2.close();
                                            i15 = 0;
                                            i14 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j17 = 0;
                                            boolean z14 = false;
                                            boolean z15 = false;
                                            boolean z16 = false;
                                            while (true) {
                                                if (j17 < j16 / 4) {
                                                    try {
                                                        bVar2.readFully(bArr4);
                                                        if (j17 != 1) {
                                                            i14 = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, C)) {
                                                                    z14 = true;
                                                                } else if (Arrays.equals(bArr4, D)) {
                                                                    z15 = true;
                                                                } else if (Arrays.equals(bArr4, E) || Arrays.equals(bArr4, F)) {
                                                                    z16 = true;
                                                                }
                                                                if (!z14) {
                                                                    continue;
                                                                } else if (z15) {
                                                                    bVar2.close();
                                                                    i15 = 12;
                                                                } else if (z16) {
                                                                    bVar2.close();
                                                                    i15 = 15;
                                                                }
                                                            } catch (Exception unused) {
                                                                if (bVar2 != null) {
                                                                    bVar2.close();
                                                                }
                                                                i15 = i14;
                                                            }
                                                        }
                                                        j17++;
                                                    } catch (EOFException unused2) {
                                                        i14 = 0;
                                                        bVar2.close();
                                                        i15 = i14;
                                                    }
                                                } else {
                                                    i14 = 0;
                                                }
                                                bVar2.close();
                                                i15 = i14;
                                            }
                                        }
                                    } else {
                                        bVar2.close();
                                        i15 = 0;
                                        i14 = 0;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bVar = bVar2;
                                    if (bVar != null) {
                                        bVar.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused3) {
                                i14 = 0;
                            }
                        } catch (Exception unused4) {
                            i14 = 0;
                            bVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = null;
                        }
                        if (i15 != 0) {
                            return i15;
                        }
                        try {
                            bVar4 = new b(bArr);
                            try {
                                ByteOrder byteOrderX = x(bVar4);
                                this.f58217h = byteOrderX;
                                bVar4.f58235c = byteOrderX;
                                short s8 = bVar4.readShort();
                                i16 = (s8 == 20306 || s8 == 21330) ? 1 : i14;
                                bVar4.close();
                            } catch (Exception unused5) {
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                i16 = i14;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            bVar4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar3 = null;
                        }
                        if (i16 != 0) {
                            return 7;
                        }
                        try {
                            b bVar7 = new b(bArr);
                            try {
                                ByteOrder byteOrderX2 = x(bVar7);
                                this.f58217h = byteOrderX2;
                                bVar7.f58235c = byteOrderX2;
                                i17 = bVar7.readShort() == 85 ? 1 : i14;
                                bVar7.close();
                            } catch (Exception unused7) {
                                bVar6 = bVar7;
                                if (bVar6 != null) {
                                    bVar6.close();
                                }
                                i17 = i14;
                            } catch (Throwable th7) {
                                th = th7;
                                bVar5 = bVar7;
                                if (bVar5 != null) {
                                    bVar5.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused8) {
                            bVar6 = null;
                        } catch (Throwable th8) {
                            th = th8;
                            bVar5 = null;
                        }
                        if (i17 != 0) {
                            return 10;
                        }
                        int i26 = i14;
                        while (true) {
                            byte[] bArr5 = I;
                            if (i26 >= bArr5.length) {
                                i18 = 1;
                                break;
                            }
                            if (bArr[i26] != bArr5[i26]) {
                                i18 = i14;
                                break;
                            }
                            i26++;
                        }
                        if (i18 != 0) {
                            return 13;
                        }
                        int i27 = i14;
                        while (true) {
                            byte[] bArr6 = K;
                            if (i27 >= bArr6.length) {
                                int i28 = i14;
                                while (true) {
                                    byte[] bArr7 = L;
                                    if (i28 >= bArr7.length) {
                                        i19 = 1;
                                        break;
                                    }
                                    if (bArr[bArr6.length + i28 + 4] != bArr7[i28]) {
                                        break;
                                    }
                                    i28++;
                                }
                                if (i19 != 0) {
                                    return 14;
                                }
                                return i14;
                            }
                            if (bArr[i27] != bArr6[i27]) {
                                break;
                            }
                            i27++;
                        }
                        i19 = i14;
                        if (i19 != 0) {
                            return 14;
                        }
                        return i14;
                    }
                }
                return 9;
            }
            i24++;
        }
    }

    public final void i(g gVar) throws Throwable {
        int i14;
        int i15;
        l(gVar);
        HashMap<String, d>[] mapArr = this.f58215f;
        d dVar = mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f58243d);
            gVar2.f58235c = this.f58217h;
            byte[] bArr = G;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.c(0L);
            byte[] bArr3 = H;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.c(12L);
            }
            z(gVar2, 6);
            d dVar2 = mapArr[7].get("PreviewImageStart");
            d dVar3 = mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.k(this.f58217h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i16 = iArr[2];
                int i17 = iArr[0];
                if (i16 <= i17 || (i14 = iArr[3]) <= (i15 = iArr[1])) {
                    return;
                }
                int i18 = (i16 - i17) + 1;
                int i19 = (i14 - i15) + 1;
                if (i18 < i19) {
                    int i24 = i18 + i19;
                    i19 = i24 - i19;
                    i18 = i24 - i19;
                }
                d dVarF = d.f(i18, this.f58217h);
                d dVarF2 = d.f(i19, this.f58217h);
                mapArr[0].put("ImageWidth", dVarF);
                mapArr[0].put("ImageLength", dVarF2);
            }
        }
    }

    public final void j(b bVar) throws Throwable {
        if (f58205v) {
            Objects.toString(bVar);
        }
        bVar.f58235c = ByteOrder.BIG_ENDIAN;
        int i14 = bVar.f58234b;
        bVar.a(I.length);
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            if (z14 && z15) {
                break;
            }
            try {
                int i15 = bVar.readInt();
                int i16 = bVar.readInt();
                int i17 = bVar.f58234b;
                int i18 = i17 + i15 + 4;
                int i19 = i17 - i14;
                if (i19 == 16 && i16 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i16 == 1229278788) {
                    break;
                }
                if (i16 == 1700284774 && !z14) {
                    this.f58225p = i19;
                    byte[] bArr = new byte[i15];
                    bVar.readFully(bArr);
                    int i24 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i16 >>> 24);
                    crc32.update(i16 >>> 16);
                    crc32.update(i16 >>> 8);
                    crc32.update(i16);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i24) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i24 + ", calculated CRC value: " + crc32.getValue());
                    }
                    y(0, bArr);
                    K();
                    H(new b(bArr));
                    z14 = true;
                } else if (i16 == 1767135348 && !z15) {
                    byte[] bArr2 = J;
                    if (i15 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i25 = bVar.f58234b - i14;
                            int i26 = i15 - length;
                            byte[] bArr4 = new byte[i26];
                            bVar.readFully(bArr4);
                            this.f58229t = new d(1, i26, i25, bArr4);
                            z15 = true;
                        }
                    }
                }
                bVar.a(i18 - bVar.f58234b);
            } catch (EOFException e4) {
                h.u("Encountered corrupt PNG file.", e4);
                return;
            }
        }
        this.f58230u = z15;
    }

    public final void k(b bVar) throws Throwable {
        if (f58205v) {
            Objects.toString(bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i14 = ByteBuffer.wrap(bArr).getInt();
        int i15 = ByteBuffer.wrap(bArr2).getInt();
        int i16 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i15];
        bVar.a(i14 - bVar.f58234b);
        bVar.readFully(bArr4);
        g(new b(bArr4), i14, 5);
        bVar.a(i16 - bVar.f58234b);
        bVar.f58235c = ByteOrder.BIG_ENDIAN;
        int i17 = bVar.readInt();
        for (int i18 = 0; i18 < i17; i18++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == W.f58244a) {
                short s8 = bVar.readShort();
                short s14 = bVar.readShort();
                d dVarF = d.f(s8, this.f58217h);
                d dVarF2 = d.f(s14, this.f58217h);
                HashMap<String, d>[] mapArr = this.f58215f;
                mapArr[0].put("ImageLength", dVarF);
                mapArr[0].put("ImageWidth", dVarF2);
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void l(g gVar) throws Throwable {
        v(gVar);
        z(gVar, 0);
        J(gVar, 0);
        J(gVar, 5);
        J(gVar, 4);
        K();
        if (this.f58213d == 8) {
            HashMap<String, d>[] mapArr = this.f58215f;
            d dVar = mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f58243d);
                gVar2.f58235c = this.f58217h;
                gVar2.a(6);
                z(gVar2, 9);
                d dVar2 = mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void m(g gVar) throws Throwable {
        if (f58205v) {
            Objects.toString(gVar);
        }
        l(gVar);
        HashMap<String, d>[] mapArr = this.f58215f;
        d dVar = mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.f58243d), (int) dVar.f58242c, 5);
        }
        d dVar2 = mapArr[0].get("ISO");
        d dVar3 = mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean n(g gVar) throws IOException {
        byte[] bArr = f58200e0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i14 = 0;
        while (true) {
            if (i14 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i15 = gVar.f58233a.read(bArrCopyOf, i14, bArrCopyOf.length - i14);
            if (i15 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i14);
                this.f58225p = bArr.length;
                y(0, bArrCopyOf2);
                return true;
            }
            i14 += i15;
            gVar.f58234b += i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    public final byte[] o() throws Throwable {
        Throwable th3;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th4;
        InputStream inputStream = null;
        if (this.f58218i) {
            byte[] bArr = this.f58223n;
            if (bArr != null) {
                return bArr;
            }
            try {
                fileInputStream = this.f58212c;
                if (fileInputStream != null) {
                    try {
                        if (!fileInputStream.markSupported()) {
                            d8.b.a(fileInputStream);
                            return null;
                        }
                        fileInputStream.reset();
                        fileDescriptor = null;
                        try {
                            b bVar = new b(fileInputStream);
                            bVar.a(this.f58221l + this.f58225p);
                            byte[] bArr2 = new byte[this.f58222m];
                            bVar.readFully(bArr2);
                            this.f58223n = bArr2;
                            d8.b.a(fileInputStream);
                            if (fileDescriptor != null) {
                                try {
                                    Os.close(fileDescriptor);
                                } catch (ErrnoException unused) {
                                }
                            }
                            return bArr2;
                        } catch (Exception unused2) {
                        } catch (Throwable th5) {
                            th4 = th5;
                            inputStream = fileInputStream;
                            th3 = th4;
                            d8.b.a(inputStream);
                            if (fileDescriptor == null) {
                                throw th3;
                            }
                            try {
                                Os.close(fileDescriptor);
                                throw th3;
                            } catch (ErrnoException unused3) {
                                throw th3;
                            }
                        }
                    } catch (Exception unused4) {
                        fileDescriptor = null;
                    } catch (Throwable th6) {
                        inputStream = fileInputStream;
                        th3 = th6;
                        fileDescriptor = null;
                        d8.b.a(inputStream);
                        if (fileDescriptor == null) {
                            throw th3;
                        }
                        Os.close(fileDescriptor);
                        throw th3;
                    }
                    d8.b.a(fileInputStream);
                    if (fileDescriptor != null) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (ErrnoException unused5) {
                        }
                    }
                } else {
                    if (this.f58210a != null) {
                        fileInputStream = new FileInputStream(this.f58210a);
                        fileDescriptor = null;
                        b bVar2 = new b(fileInputStream);
                        bVar2.a(this.f58221l + this.f58225p);
                        byte[] bArr3 = new byte[this.f58222m];
                        bVar2.readFully(bArr3);
                        this.f58223n = bArr3;
                        d8.b.a(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        return bArr3;
                    }
                    FileDescriptor fileDescriptorDup = Os.dup(this.f58211b);
                    try {
                        Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = new FileInputStream(fileDescriptorDup);
                        b bVar3 = new b(fileInputStream);
                        bVar3.a(this.f58221l + this.f58225p);
                        byte[] bArr4 = new byte[this.f58222m];
                        bVar3.readFully(bArr4);
                        this.f58223n = bArr4;
                        d8.b.a(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        return bArr4;
                    } catch (Exception unused6) {
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = null;
                    } catch (Throwable th7) {
                        th4 = th7;
                        fileDescriptor = fileDescriptorDup;
                        th3 = th4;
                        d8.b.a(inputStream);
                        if (fileDescriptor == null) {
                            throw th3;
                        }
                        Os.close(fileDescriptor);
                        throw th3;
                    }
                }
            } catch (Exception unused7) {
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th8) {
                th3 = th8;
                fileDescriptor = null;
            }
        }
        return null;
    }

    public final void p(b bVar) throws Throwable {
        if (f58205v) {
            Objects.toString(bVar);
        }
        bVar.f58235c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(K.length);
        int i14 = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i15 = bVar.readInt();
                int i16 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i15];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f58200e0;
                    if (d8.b.e(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i15);
                    }
                    this.f58225p = i16;
                    y(0, bArrCopyOfRange);
                    H(new b(bArrCopyOfRange));
                    return;
                }
                if (i15 % 2 == 1) {
                    i15++;
                }
                length = i16 + i15;
                if (length == i14) {
                    return;
                }
                if (length > i14) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i15);
            } catch (EOFException e4) {
                h.u("Encountered corrupt WebP file.", e4);
                return;
            }
        }
    }

    public final void r(b bVar, HashMap<String, d> map) throws Throwable {
        d dVar = map.get("JPEGInterchangeFormat");
        d dVar2 = map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int i14 = dVar.i(this.f58217h);
        int i15 = dVar2.i(this.f58217h);
        if (this.f58213d == 7) {
            i14 += this.f58226q;
        }
        if (i14 <= 0 || i15 <= 0) {
            return;
        }
        this.f58218i = true;
        if (this.f58210a == null && this.f58212c == null && this.f58211b == null) {
            byte[] bArr = new byte[i15];
            bVar.a(i14);
            bVar.readFully(bArr);
            this.f58223n = bArr;
        }
        this.f58221l = i14;
        this.f58222m = i15;
    }

    public final void s(String str) throws Throwable {
        boolean z14;
        if (str == null) {
            x.l("filename cannot be null");
            return;
        }
        FileInputStream fileInputStream = null;
        this.f58212c = null;
        this.f58210a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z14 = true;
                } catch (Exception unused) {
                    z14 = false;
                }
                if (z14) {
                    this.f58211b = fileInputStream2.getFD();
                } else {
                    this.f58211b = null;
                }
                u(fileInputStream2);
                d8.b.a(fileInputStream2);
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                d8.b.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final boolean t(HashMap<String, d> map) {
        d dVar = map.get("ImageLength");
        d dVar2 = map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(this.f58217h) <= 512 && dVar2.i(this.f58217h) <= 512;
    }

    public final void u(InputStream inputStream) throws Throwable {
        boolean z14 = f58205v;
        for (int i14 = 0; i14 < X.length; i14++) {
            try {
                try {
                    this.f58215f[i14] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException unused) {
                    a();
                    if (z14) {
                        w();
                        return;
                    }
                    return;
                }
            } catch (Throwable th3) {
                a();
                if (z14) {
                    w();
                }
                throw th3;
            }
        }
        boolean z15 = this.f58214e;
        if (!z15) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f58213d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i15 = this.f58213d;
        if (i15 == 4 || i15 == 9 || i15 == 13 || i15 == 14) {
            b bVar = new b(inputStream);
            int i16 = this.f58213d;
            if (i16 == 4) {
                g(bVar, 0, 0);
            } else if (i16 == 13) {
                j(bVar);
            } else if (i16 == 9) {
                k(bVar);
            } else if (i16 == 14) {
                p(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (!z15) {
                int i17 = this.f58213d;
                if (i17 == 12 || i17 == 15) {
                    f(gVar, i17);
                } else if (i17 == 7) {
                    i(gVar);
                } else if (i17 == 10) {
                    m(gVar);
                } else {
                    l(gVar);
                }
            } else if (!n(gVar)) {
                a();
                if (z14) {
                    w();
                    return;
                }
                return;
            }
            gVar.c(this.f58225p);
            H(gVar);
        }
        a();
        if (z14) {
            w();
        }
    }

    public final void v(g gVar) throws IOException {
        ByteOrder byteOrderX = x(gVar);
        this.f58217h = byteOrderX;
        gVar.f58235c = byteOrderX;
        int unsignedShort = gVar.readUnsignedShort();
        int i14 = this.f58213d;
        if (i14 != 7 && i14 != 10 && unsignedShort != 42) {
            o2.c.u(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i15 = gVar.readInt();
        if (i15 < 8) {
            h.C(j.h(i15, "Invalid first Ifd offset: "));
            return;
        }
        int i16 = i15 - 8;
        if (i16 > 0) {
            gVar.a(i16);
        }
    }

    public final void w() throws Throwable {
        int i14 = 0;
        while (true) {
            HashMap<String, d>[] mapArr = this.f58215f;
            if (i14 >= mapArr.length) {
                return;
            }
            mapArr[i14].size();
            for (Map.Entry<String, d> entry : mapArr[i14].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.j(this.f58217h);
            }
            i14++;
        }
    }

    public final void y(int i14, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        v(gVar);
        z(gVar, i14);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    public final void z(g gVar, int i14) throws IOException {
        boolean z14;
        HashMap<String, d>[] mapArr;
        HashMap<String, d>[] mapArr2;
        e eVar;
        long j8;
        int i15;
        boolean z15;
        HashMap<String, d>[] mapArr3;
        e eVar2;
        int unsignedShort;
        long j14;
        int i16;
        Integer numValueOf = Integer.valueOf(gVar.f58234b);
        HashSet hashSet = this.f58216g;
        hashSet.add(numValueOf);
        short s8 = gVar.readShort();
        if (s8 <= 0) {
            return;
        }
        short s14 = 0;
        while (true) {
            z14 = f58205v;
            mapArr = this.f58215f;
            if (s14 >= s8) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i17 = gVar.readInt();
            short s15 = s14;
            long j15 = ((long) gVar.f58234b) + 4;
            e eVar3 = Z[i14].get(Integer.valueOf(unsignedShort2));
            if (z14) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i14), Integer.valueOf(unsignedShort2), eVar3 != null ? eVar3.f58245b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i17));
            }
            if (eVar3 != null && unsignedShort3 > 0) {
                int[] iArr = U;
                if (unsignedShort3 < iArr.length) {
                    int i18 = eVar3.f58246c;
                    if (i18 == 7 || unsignedShort3 == 7 || i18 == unsignedShort3 || (i15 = eVar3.f58247d) == unsignedShort3 || (((i18 == 4 || i15 == 4) && unsignedShort3 == 3) || (((i18 == 9 || i15 == 9) && unsignedShort3 == 8) || ((i18 == 12 || i15 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i18;
                        }
                        mapArr2 = mapArr;
                        eVar = eVar3;
                        j8 = ((long) i17) * ((long) iArr[unsignedShort3]);
                        z15 = j8 >= 0 && j8 <= 2147483647L;
                    } else {
                        if (z14 != 0) {
                            String str = T[unsignedShort3];
                        }
                        eVar = eVar3;
                        mapArr2 = mapArr;
                        j8 = 0;
                    }
                } else {
                    eVar = eVar3;
                    mapArr2 = mapArr;
                    j8 = 0;
                }
            } else {
                eVar = eVar3;
                mapArr2 = mapArr;
                j8 = 0;
            }
            if (z15) {
                if (j8 > 4) {
                    int i19 = gVar.readInt();
                    if (this.f58213d == 7) {
                        mapArr3 = mapArr2;
                        eVar2 = eVar;
                        if ("MakerNote".equals(eVar2.f58245b)) {
                            this.f58226q = i19;
                        } else {
                            if (i14 == 6 && "ThumbnailImage".equals(eVar2.f58245b)) {
                                this.f58227r = i19;
                                this.f58228s = i17;
                                d dVarF = d.f(6, this.f58217h);
                                unsignedShort2 = unsignedShort2;
                                d dVarC = d.c(this.f58227r, this.f58217h);
                                d dVarC2 = d.c(this.f58228s, this.f58217h);
                                mapArr3[4].put("Compression", dVarF);
                                mapArr3[4].put("JPEGInterchangeFormat", dVarC);
                                mapArr3[4].put("JPEGInterchangeFormatLength", dVarC2);
                            }
                            gVar.c(i19);
                        }
                    } else {
                        mapArr3 = mapArr2;
                        eVar2 = eVar;
                    }
                    gVar.c(i19);
                } else {
                    mapArr3 = mapArr2;
                    unsignedShort2 = unsignedShort2;
                    eVar2 = eVar;
                    i17 = i17;
                }
                Integer num = f58198c0.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j14 = ((long) gVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = gVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = gVar.readInt();
                        } else {
                            j14 = -1;
                        }
                        if (z14) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar2.f58245b);
                        }
                        if (j14 > 0 && (((i16 = gVar.f58237e) == -1 || j14 < i16) && !hashSet.contains(Integer.valueOf((int) j14)))) {
                            gVar.c(j14);
                            z(gVar, num.intValue());
                        }
                        gVar.c(j15);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    j14 = unsignedShort;
                    if (z14) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j14), eVar2.f58245b);
                    }
                    if (j14 > 0) {
                        gVar.c(j14);
                        z(gVar, num.intValue());
                    }
                    gVar.c(j15);
                } else {
                    int i24 = gVar.f58234b + this.f58225p;
                    byte[] bArr = new byte[(int) j8];
                    gVar.readFully(bArr);
                    d dVar = new d(unsignedShort3, i17, i24, bArr);
                    HashMap<String, d> map = mapArr3[i14];
                    String str2 = eVar2.f58245b;
                    map.put(str2, dVar);
                    if ("DNGVersion".equals(str2)) {
                        this.f58213d = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && dVar.j(this.f58217h).contains("PENTAX")) || ("Compression".equals(str2) && dVar.i(this.f58217h) == 65535)) {
                        this.f58213d = 8;
                    }
                    if (gVar.f58234b != j15) {
                        gVar.c(j15);
                    }
                }
            } else {
                gVar.c(j15);
            }
            s14 = (short) (s15 + 1);
            s8 = s8;
        }
        int i25 = gVar.readInt();
        if (z14) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i25));
        }
        long j16 = i25;
        if (j16 <= 0 || hashSet.contains(Integer.valueOf(i25))) {
            return;
        }
        gVar.c(j16);
        if (mapArr[4].isEmpty()) {
            z(gVar, 4);
        } else if (mapArr[5].isEmpty()) {
            z(gVar, 5);
        }
    }

    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataOutputStream f58238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteOrder f58239b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f58238a = new DataOutputStream(outputStream);
            this.f58239b = byteOrder;
        }

        public final void a(int i14) throws IOException {
            this.f58238a.write(i14);
        }

        public final void c(int i14) throws IOException {
            ByteOrder byteOrder = this.f58239b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            DataOutputStream dataOutputStream = this.f58238a;
            if (byteOrder == byteOrder2) {
                dataOutputStream.write(i14 & 255);
                dataOutputStream.write((i14 >>> 8) & 255);
                dataOutputStream.write((i14 >>> 16) & 255);
                dataOutputStream.write((i14 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                dataOutputStream.write((i14 >>> 24) & 255);
                dataOutputStream.write((i14 >>> 16) & 255);
                dataOutputStream.write((i14 >>> 8) & 255);
                dataOutputStream.write(i14 & 255);
            }
        }

        public final void e(short s8) throws IOException {
            ByteOrder byteOrder = this.f58239b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            DataOutputStream dataOutputStream = this.f58238a;
            if (byteOrder == byteOrder2) {
                dataOutputStream.write(s8 & 255);
                dataOutputStream.write((s8 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                dataOutputStream.write((s8 >>> 8) & 255);
                dataOutputStream.write(s8 & 255);
            }
        }

        public final void f(long j8) throws IOException {
            if (j8 <= 4294967295L) {
                c((int) j8);
            } else {
                h.s("val is larger than the maximum value of a 32-bit unsigned integer");
            }
        }

        public final void j(int i14) throws IOException {
            if (i14 <= 65535) {
                e((short) i14);
            } else {
                h.s("val is larger than the maximum value of a 16-bit unsigned integer");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f58238a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i14, int i15) {
            this.f58238a.write(bArr, i14, i15);
        }
    }

    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f58233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f58234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteOrder f58235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f58236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f58237e;

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f58233a = dataInputStream;
            dataInputStream.mark(0);
            this.f58234b = 0;
            this.f58235c = byteOrder;
            this.f58237e = inputStream instanceof b ? ((b) inputStream).f58237e : -1;
        }

        public final void a(int i14) throws IOException {
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i14 - i15;
                DataInputStream dataInputStream = this.f58233a;
                int iSkip = (int) dataInputStream.skip(i16);
                if (iSkip <= 0) {
                    if (this.f58236d == null) {
                        this.f58236d = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f58236d, 0, Math.min(8192, i16));
                    if (iSkip == -1) {
                        throw new EOFException(e0.f(i14, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i15 += iSkip;
            }
            this.f58234b += i15;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f58233a.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i14) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f58234b++;
            return this.f58233a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f58234b++;
            return this.f58233a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f58234b++;
            int i14 = this.f58233a.read();
            if (i14 >= 0) {
                return (byte) i14;
            }
            h.m();
            return (byte) 0;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f58234b += 2;
            return this.f58233a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f58234b += bArr.length;
            this.f58233a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f58234b += 4;
            DataInputStream dataInputStream = this.f58233a;
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            int i17 = dataInputStream.read();
            if ((i14 | i15 | i16 | i17) < 0) {
                h.m();
                return 0;
            }
            ByteOrder byteOrder = this.f58235c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i17 << 24) + (i16 << 16) + (i15 << 8) + i14;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i14 << 24) + (i15 << 16) + (i16 << 8) + i17;
            }
            o2.c.u(this.f58235c, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j8;
            long j14;
            this.f58234b += 8;
            DataInputStream dataInputStream = this.f58233a;
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            int i17 = dataInputStream.read();
            int i18 = dataInputStream.read();
            int i19 = dataInputStream.read();
            int i24 = dataInputStream.read();
            int i25 = dataInputStream.read();
            if ((i14 | i15 | i16 | i17 | i18 | i19 | i24 | i25) < 0) {
                h.m();
                return 0L;
            }
            ByteOrder byteOrder = this.f58235c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j8 = (((long) i25) << 56) + (((long) i24) << 48) + (((long) i19) << 40) + (((long) i18) << 32) + (((long) i17) << 24) + (((long) i16) << 16) + (((long) i15) << 8);
                j14 = i14;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    o2.c.u(this.f58235c, "Invalid byte order: ");
                    return 0L;
                }
                j8 = (((long) i14) << 56) + (((long) i15) << 48) + (((long) i16) << 40) + (((long) i17) << 32) + (((long) i18) << 24) + (((long) i19) << 16) + (((long) i24) << 8);
                j14 = i25;
            }
            return j8 + j14;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f58234b += 2;
            DataInputStream dataInputStream = this.f58233a;
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            if ((i14 | i15) < 0) {
                h.m();
                return (short) 0;
            }
            ByteOrder byteOrder = this.f58235c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i15 << 8) + i14);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i14 << 8) + i15);
            }
            o2.c.u(this.f58235c, "Invalid byte order: ");
            return (short) 0;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f58234b += 2;
            return this.f58233a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f58234b++;
            return this.f58233a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f58234b += 2;
            DataInputStream dataInputStream = this.f58233a;
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            if ((i14 | i15) < 0) {
                h.m();
                return 0;
            }
            ByteOrder byteOrder = this.f58235c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i15 << 8) + i14;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i14 << 8) + i15;
            }
            o2.c.u(this.f58235c, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i14) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i14, int i15) throws IOException {
            this.f58234b += i15;
            this.f58233a.readFully(bArr, i14, i15);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i14, int i15) {
            int i16 = this.f58233a.read(bArr, i14, i15);
            this.f58234b += i16;
            return i16;
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f58237e = bArr.length;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f58240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f58241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f58242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f58243d;

        public d(int i14, int i15, long j8, byte[] bArr) {
            this.f58240a = i14;
            this.f58241b = i15;
            this.f58242c = j8;
            this.f58243d = bArr;
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f58199d0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(String str) {
            byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(a.f58199d0);
            return new d(2, bytes.length, bytes);
        }

        public static d c(long j8, ByteOrder byteOrder) {
            return d(new long[]{j8}, byteOrder);
        }

        public static d d(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.U[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j8 : jArr) {
                byteBufferWrap.putInt((int) j8);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d e(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.U[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f58248a);
                byteBufferWrap.putInt((int) fVar.f58249b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d f(int i14, ByteOrder byteOrder) {
            return g(new int[]{i14}, byteOrder);
        }

        public static d g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.U[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i14 : iArr) {
                byteBufferWrap.putShort((short) i14);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public final double h(ByteOrder byteOrder) {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objK;
            if (fVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            f fVar = fVarArr[0];
            return fVar.f58248a / fVar.f58249b;
        }

        public final int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb3 = new StringBuilder();
            int i14 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i14 < jArr.length) {
                    sb3.append(jArr[i14]);
                    i14++;
                    if (i14 != jArr.length) {
                        sb3.append(",");
                    }
                }
                return sb3.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i14 < iArr.length) {
                    sb3.append(iArr[i14]);
                    i14++;
                    if (i14 != iArr.length) {
                        sb3.append(",");
                    }
                }
                return sb3.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i14 < dArr.length) {
                    sb3.append(dArr[i14]);
                    i14++;
                    if (i14 != dArr.length) {
                        sb3.append(",");
                    }
                }
                return sb3.toString();
            }
            if (!(objK instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objK;
            while (i14 < fVarArr.length) {
                sb3.append(fVarArr[i14].f58248a);
                sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb3.append(fVarArr[i14].f58249b);
                i14++;
                if (i14 != fVarArr.length) {
                    sb3.append(",");
                }
            }
            return sb3.toString();
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r0v11, types: [d8.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r0v12, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r0v13, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r0v6, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r0v8, types: [d8.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r0v9, types: [int[], java.io.Serializable] */
        public final Serializable k(ByteOrder byteOrder) throws Throwable {
            b bVar;
            byte b14;
            byte[] bArr = this.f58243d;
            b bVar2 = null;
            try {
                bVar = new b(bArr);
                try {
                    bVar.f58235c = byteOrder;
                    int i14 = this.f58240a;
                    int length = 0;
                    int i15 = this.f58241b;
                    switch (i14) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b14 = bArr[0]) < 0 || b14 > 1) {
                                String str = new String(bArr, a.f58199d0);
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b14 + 48)});
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i15 >= a.V.length) {
                                int i16 = 0;
                                while (true) {
                                    byte[] bArr2 = a.V;
                                    if (i16 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i16] == bArr2[i16]) {
                                        i16++;
                                    }
                                }
                            }
                            StringBuilder sb3 = new StringBuilder();
                            try {
                                while (length < i15) {
                                    byte b15 = bArr[length];
                                    if (b15 == 0) {
                                        String string = sb3.toString();
                                        bVar.close();
                                        return string;
                                    }
                                    if (b15 >= 32) {
                                        sb3.append((char) b15);
                                    } else {
                                        sb3.append('?');
                                    }
                                    length++;
                                }
                                bVar.close();
                                break;
                            } catch (IOException unused3) {
                            }
                            String string2 = sb3.toString();
                            return string2;
                        case 3:
                            ?? r14 = new int[i15];
                            while (length < i15) {
                                r14[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused4) {
                            }
                            return r14;
                        case 4:
                            ?? r15 = new long[i15];
                            while (length < i15) {
                                r15[length] = ((long) bVar.readInt()) & 4294967295L;
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused5) {
                            }
                            return r15;
                        case 5:
                            ?? r16 = new f[i15];
                            while (length < i15) {
                                r16[length] = new f(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L, null);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused6) {
                            }
                            return r16;
                        case 8:
                            ?? r17 = new int[i15];
                            while (length < i15) {
                                r17[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused7) {
                            }
                            return r17;
                        case 9:
                            ?? r18 = new int[i15];
                            while (length < i15) {
                                r18[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused8) {
                            }
                            return r18;
                        case 10:
                            ?? r19 = new f[i15];
                            while (length < i15) {
                                r19[length] = new f(bVar.readInt(), bVar.readInt(), null);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused9) {
                            }
                            return r19;
                        case 11:
                            ?? r24 = new double[i15];
                            while (length < i15) {
                                r24[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused10) {
                            }
                            return r24;
                        case 12:
                            ?? r25 = new double[i15];
                            while (length < i15) {
                                r25[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused11) {
                            }
                            return r25;
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
                } catch (Throwable th3) {
                    th = th3;
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
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("(");
            sb3.append(a.T[this.f58240a]);
            sb3.append(", data length:");
            return j.q(sb3, this.f58243d.length, ")");
        }

        public d(int i14, int i15, byte[] bArr) {
            this(i14, i15, -1L, bArr);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f58244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f58245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f58246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f58247d;

        public e(String str, int i14, int i15) {
            this.f58245b = str;
            this.f58244a = i14;
            this.f58246c = i15;
            this.f58247d = -1;
        }

        public e(String str, int i14, int i15, int i16) {
            this.f58245b = str;
            this.f58244a = i14;
            this.f58246c = i15;
            this.f58247d = i16;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f58249b;

        private f(long j8, long j14) {
            if (j14 == 0) {
                this.f58248a = 0L;
                this.f58249b = 1L;
            } else {
                this.f58248a = j8;
                this.f58249b = j14;
            }
        }

        public static f a(double d14) {
            long j8;
            long j14;
            long j15 = 1;
            if (d14 >= 9.223372036854776E18d || d14 <= -9.223372036854776E18d) {
                return new f(d14 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double dAbs = Math.abs(d14);
            long j16 = 0;
            long j17 = 1;
            double d15 = dAbs;
            long j18 = 0;
            while (true) {
                double d16 = d15 % 1.0d;
                long j19 = (long) (d15 - d16);
                j8 = j18 + (j19 * j15);
                j14 = (j19 * j16) + j17;
                d15 = 1.0d / d16;
                long j24 = j15;
                if (Math.abs(dAbs - (j8 / j14)) <= 1.0E-8d * dAbs) {
                    break;
                }
                j17 = j16;
                j15 = j8;
                j18 = j24;
                j16 = j14;
            }
            if (d14 < 0.0d) {
                j8 = -j8;
            }
            return new f(j8, j14);
        }

        public final String toString() {
            return this.f58248a + "/" + this.f58249b;
        }

        public /* synthetic */ f(long j8, long j14, C1241a c1241a) {
            this(j8, j14);
        }
    }

    public static class g extends b {
        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f58233a.mark(Integer.MAX_VALUE);
            } else {
                h.s("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
                throw null;
            }
        }

        public final void c(long j8) throws IOException {
            int i14 = this.f58234b;
            if (i14 > j8) {
                this.f58234b = 0;
                this.f58233a.reset();
            } else {
                j8 -= (long) i14;
            }
            a((int) j8);
        }

        public g(byte[] bArr) {
            super(bArr);
            this.f58233a.mark(Integer.MAX_VALUE);
        }
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = X;
        this.f58215f = new HashMap[eVarArr.length];
        this.f58216g = new HashSet(eVarArr.length);
        this.f58217h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            s(str);
        } else {
            x.l("filename cannot be null");
            throw null;
        }
    }

    public a(FileDescriptor fileDescriptor) throws Throwable {
        boolean z14;
        FileInputStream fileInputStream;
        Throwable th3;
        e[][] eVarArr = X;
        this.f58215f = new HashMap[eVarArr.length];
        this.f58216g = new HashSet(eVarArr.length);
        this.f58217h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f58212c = null;
            this.f58210a = null;
            try {
                Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.f58211b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z14 = true;
                } catch (Exception e4) {
                    h.u("Failed to duplicate file descriptor", e4);
                    throw null;
                }
            } catch (Exception unused) {
                this.f58211b = null;
                z14 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    u(fileInputStream);
                    d8.b.a(fileInputStream);
                    if (z14) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (ErrnoException unused2) {
                        }
                    }
                } catch (Throwable th4) {
                    th3 = th4;
                    d8.b.a(fileInputStream);
                    if (z14) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (ErrnoException unused3) {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                fileInputStream = null;
                th3 = th5;
            }
        } else {
            x.l("fileDescriptor cannot be null");
            throw null;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(File file) throws Throwable {
        e[][] eVarArr = X;
        this.f58215f = new HashMap[eVarArr.length];
        this.f58216g = new HashSet(eVarArr.length);
        this.f58217h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            s(file.getAbsolutePath());
        } else {
            x.l("file cannot be null");
            throw null;
        }
    }
}
