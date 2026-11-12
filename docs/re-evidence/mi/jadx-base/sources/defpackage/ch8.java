package defpackage;

import android.location.Location;
import androidx.annotation.RequiresApi;
import com.miui.tsmclient.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ch8 {
    public static final String c = "ch8";
    public static final ThreadLocal<SimpleDateFormat> d = new a();
    public static final ThreadLocal<SimpleDateFormat> e = new b();
    public static final ThreadLocal<SimpleDateFormat> f = new c();
    public static final List<String> g = e();
    public static final List<String> h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gh8 f5329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5330b = false;

    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT, Locale.US);
        }
    }

    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public static final class d {

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f5331a;

            public a(double d) {
                this.f5331a = d;
            }

            public double a() {
                return this.f5331a / 2.23694d;
            }
        }

        public static a a(double d) {
            return new a(d * 0.621371d);
        }

        public static a b(double d) {
            return new a(d * 1.15078d);
        }

        public static a c(double d) {
            return new a(d);
        }
    }

    public ch8(gh8 gh8Var) {
        this.f5329a = gh8Var;
    }

    public static Date a(String str) throws ParseException {
        return d.get().parse(str);
    }

    public static Date b(String str) throws ParseException {
        return f.get().parse(str);
    }

    public static Date c(String str) throws ParseException {
        return e.get().parse(str);
    }

    public static ch8 d(InputStream inputStream) throws IOException {
        return new ch8(new gh8(inputStream));
    }

    public static List<String> e() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public String f() {
        return this.f5329a.f("ImageDescription");
    }

    public int g() {
        return this.f5329a.h("ImageLength", 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    public Location h() {
        byte b2;
        double dA;
        String strF = this.f5329a.f("GPSProcessingMethod");
        double[] dArrL = this.f5329a.l();
        double dE = this.f5329a.e(0.0d);
        double dG = this.f5329a.g("GPSSpeed", 0.0d);
        String strF2 = this.f5329a.f("GPSSpeedRef");
        if (strF2 == null) {
            strF2 = "K";
        }
        long jP = p(this.f5329a.f("GPSDateStamp"), this.f5329a.f("GPSTimeStamp"));
        if (dArrL == null) {
            return null;
        }
        if (strF == null) {
            strF = c;
        }
        Location location = new Location(strF);
        location.setLatitude(dArrL[0]);
        location.setLongitude(dArrL[1]);
        if (dE != 0.0d) {
            location.setAltitude(dE);
        }
        if (dG != 0.0d) {
            int iHashCode = strF2.hashCode();
            if (iHashCode != 75) {
                if (iHashCode != 77) {
                    if (iHashCode == 78 && strF2.equals("N")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (strF2.equals("M")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (strF2.equals("K")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                dA = b2 != 1 ? d.a(dG).a() : d.b(dG).a();
            } else {
                dA = d.c(dG).a();
            }
            location.setSpeed((float) dA);
        }
        if (jP != -1) {
            location.setTime(jP);
        }
        return location;
    }

    public int i() {
        return this.f5329a.h("Orientation", 0);
    }

    public int j() {
        switch (i()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long k() {
        long jO = o(this.f5329a.f("DateTimeOriginal"));
        if (jO == -1) {
            return -1L;
        }
        String strF = this.f5329a.f("SubSecTimeOriginal");
        if (strF == null) {
            return jO;
        }
        try {
            long j = Long.parseLong(strF);
            while (j > 1000) {
                j /= 10;
            }
            return jO + j;
        } catch (NumberFormatException unused) {
            return jO;
        }
    }

    public int l() {
        return this.f5329a.h("ImageWidth", 0);
    }

    public boolean m() {
        return i() == 2;
    }

    public boolean n() {
        int i = i();
        return i == 4 || i == 5 || i == 7;
    }

    public final long o(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long p(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return o(str + " " + str2);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(l()), Integer.valueOf(g()), Integer.valueOf(j()), Boolean.valueOf(n()), Boolean.valueOf(m()), h(), Long.valueOf(k()), f());
    }
}
