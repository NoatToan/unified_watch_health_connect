package j0;

import android.location.Location;
import i3.e5;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f95913b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f95914c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f95915d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f95916e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<String> f95917f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8.a f95918a;

    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private g(d8.a aVar) {
        this.f95918a = aVar;
    }

    public static g b(File file) {
        return new g(new d8.a(file.toString()));
    }

    public static g c(ByteArrayInputStream byteArrayInputStream) {
        return new g(new d8.a(byteArrayInputStream));
    }

    public final void a(g gVar) {
        d8.a aVar = gVar.f95918a;
        ArrayList<String> arrayList = new ArrayList(f95916e);
        arrayList.removeAll(f95917f);
        for (String str : arrayList) {
            String strC = this.f95918a.c(str);
            String strC2 = aVar.c(str);
            if (strC != null && !strC.equals(strC2)) {
                aVar.G(str, strC);
            }
        }
    }

    public final int d() {
        switch (this.f95918a.d(0, "Orientation")) {
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

    public final void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        c cVar = f95915d;
        String str = cVar.get().format(new Date(jCurrentTimeMillis));
        d8.a aVar = this.f95918a;
        aVar.G("DateTime", str);
        try {
            aVar.G("SubSecTime", Long.toString(jCurrentTimeMillis - cVar.get().parse(str).getTime()));
        } catch (ParseException unused) {
        }
        aVar.C();
    }

    public final String toString() {
        double[] dArr;
        double dH;
        double d14;
        double dH2;
        Integer num;
        long time;
        long time2;
        Location location;
        double d15;
        long time3;
        Locale locale = Locale.ENGLISH;
        d8.a aVar = this.f95918a;
        Integer numValueOf = Integer.valueOf(aVar.d(0, "ImageWidth"));
        Integer numValueOf2 = Integer.valueOf(aVar.d(0, "ImageLength"));
        Integer numValueOf3 = Integer.valueOf(d());
        int iD = aVar.d(0, "Orientation");
        Boolean boolValueOf = Boolean.valueOf(iD == 4 || iD == 5 || iD == 7);
        Boolean boolValueOf2 = Boolean.valueOf(aVar.d(0, "Orientation") == 2);
        String strC = aVar.c("GPSProcessingMethod");
        String strC2 = aVar.c("GPSLatitude");
        String strC3 = aVar.c("GPSLatitudeRef");
        String strC4 = aVar.c("GPSLongitude");
        String strC5 = aVar.c("GPSLongitudeRef");
        if (strC2 == null || strC3 == null || strC4 == null || strC5 == null) {
            dArr = null;
        } else {
            try {
                dArr = new double[]{d8.a.b(strC2, strC3), d8.a.b(strC4, strC5)};
            } catch (IllegalArgumentException unused) {
                dArr = null;
            }
        }
        d8.a.d dVarE = aVar.e("GPSAltitude");
        if (dVarE == null) {
            dH = -1.0d;
        } else {
            try {
                dH = dVarE.h(aVar.f58217h);
            } catch (NumberFormatException unused2) {
                dH = -1.0d;
            }
        }
        int iD2 = aVar.d(-1, "GPSAltitudeRef");
        if (dH < 0.0d || iD2 < 0) {
            d14 = 0.0d;
        } else {
            d14 = dH * ((double) (iD2 != 1 ? 1 : -1));
        }
        d8.a.d dVarE2 = aVar.e("GPSSpeed");
        if (dVarE2 == null) {
            dH2 = 0.0d;
        } else {
            try {
                dH2 = dVarE2.h(aVar.f58217h);
            } catch (NumberFormatException unused3) {
                dH2 = 0.0d;
            }
        }
        String strC6 = aVar.c("GPSSpeedRef");
        if (strC6 == null) {
            strC6 = "K";
        }
        String strC7 = aVar.c("GPSDateStamp");
        String strC8 = aVar.c("GPSTimeStamp");
        c cVar = f95915d;
        long j8 = -1;
        if (strC7 == null && strC8 == null) {
            num = numValueOf;
            time = -1;
        } else {
            try {
                if (strC8 == null) {
                    time2 = f95913b.get().parse(strC7).getTime();
                } else if (strC7 == null) {
                    time2 = f95914c.get().parse(strC8).getTime();
                } else {
                    num = numValueOf;
                    try {
                        time = cVar.get().parse(e5.g(strC7, StringUtils.SPACE, strC8)).getTime();
                    } catch (ParseException unused4) {
                        time = -1;
                    }
                }
                long j14 = time2;
                num = numValueOf;
                time = j14;
            } catch (ParseException unused5) {
                num = numValueOf;
            }
        }
        if (dArr == null) {
            location = null;
        } else {
            if (strC == null) {
                strC = "g";
            }
            Location location2 = new Location(strC);
            location2.setLatitude(dArr[0]);
            location2.setLongitude(dArr[1]);
            if (d14 != 0.0d) {
                location2.setAltitude(d14);
            }
            if (dH2 != 0.0d) {
                int iHashCode = strC6.hashCode();
                if (iHashCode != 75) {
                    if (iHashCode != 77) {
                        if (iHashCode == 78 && strC6.equals("N")) {
                            d15 = new h(dH2 * 1.15078d).f95919a;
                        }
                    } else if (strC6.equals("M")) {
                        d15 = new h(dH2).f95919a;
                    }
                    location2.setSpeed((float) (d15 / 2.23694d));
                } else {
                    strC6.equals("K");
                }
                d15 = new h(dH2 * 0.621371d).f95919a;
                location2.setSpeed((float) (d15 / 2.23694d));
            }
            if (time != -1) {
                location2.setTime(time);
            }
            location = location2;
        }
        String strC9 = aVar.c("DateTimeOriginal");
        if (strC9 == null) {
            time3 = -1;
        } else {
            try {
                time3 = cVar.get().parse(strC9).getTime();
            } catch (ParseException unused6) {
                time3 = -1;
            }
        }
        if (time3 != -1) {
            String strC10 = aVar.c("SubSecTimeOriginal");
            if (strC10 != null) {
                try {
                    long j15 = Long.parseLong(strC10);
                    while (j15 > 1000) {
                        j15 /= 10;
                    }
                    j8 = time3 + j15;
                } catch (NumberFormatException unused7) {
                    j8 = time3;
                }
            } else {
                j8 = time3;
            }
        }
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, numValueOf2, numValueOf3, boolValueOf, boolValueOf2, location, Long.valueOf(j8), aVar.c("ImageDescription"));
    }
}
