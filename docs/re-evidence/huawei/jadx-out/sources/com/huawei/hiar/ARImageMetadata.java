package com.huawei.hiar;

import android.util.Rational;
import com.huawei.hiar.exceptions.ARFatalException;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ARImageMetadata {
    public static final int BLACK_LEVEL_LOCK = 1441792;
    private static final int BLACK_LEVEL_START = 1441792;
    public static final int COLOR_CORRECTION_ABERRATION_MODE = 3;
    public static final int COLOR_CORRECTION_GAINS = 2;
    public static final int COLOR_CORRECTION_MODE = 0;
    private static final int COLOR_CORRECTION_START = 0;
    public static final int COLOR_CORRECTION_TRANSFORM = 1;
    public static final int CONTROL_AE_ANTIBANDING_MODE = 65536;
    public static final int CONTROL_AE_EXPOSURE_COMPENSATION = 65537;
    public static final int CONTROL_AE_LOCK = 65538;
    public static final int CONTROL_AE_MODE = 65539;
    public static final int CONTROL_AE_PRECAPTURE_TRIGGER = 65542;
    public static final int CONTROL_AE_REGIONS = 65540;
    public static final int CONTROL_AE_STATE = 65567;
    public static final int CONTROL_AE_TARGET_FPS_RANGE = 65541;
    public static final int CONTROL_AF_MODE = 65543;
    public static final int CONTROL_AF_REGIONS = 65544;
    public static final int CONTROL_AF_STATE = 65568;
    public static final int CONTROL_AF_TRIGGER = 65545;
    public static final int CONTROL_AWB_LOCK = 65546;
    public static final int CONTROL_AWB_MODE = 65547;
    public static final int CONTROL_AWB_REGIONS = 65548;
    public static final int CONTROL_AWB_STATE = 65570;
    public static final int CONTROL_CAPTURE_INTENT = 65549;
    public static final int CONTROL_EFFECT_MODE = 65550;
    public static final int CONTROL_MODE = 65551;
    public static final int CONTROL_POST_RAW_SENSITIVITY_BOOST = 65576;
    public static final int CONTROL_SCENE_MODE = 65552;
    private static final int CONTROL_START = 65536;
    public static final int CONTROL_VIDEO_STABILIZATION_MODE = 65553;
    private static final int DEPTH_START = 1638400;
    public static final int EDGE_MODE = 196608;
    private static final int EDGE_START = 196608;
    private static final int FLASH_INFO_START = 327680;
    public static final int FLASH_MODE = 262146;
    private static final int FLASH_START = 262144;
    public static final int FLASH_STATE = 262149;
    public static final int HOT_PIXEL_MODE = 393216;
    private static final int HOT_PIXEL_START = 393216;
    private static final int INFO_START = 1376256;
    public static final int JPEG_GPS_COORDINATES = 458752;
    public static final int JPEG_GPS_PROCESSING_METHOD = 458753;
    public static final int JPEG_GPS_TIMESTAMP = 458754;
    public static final int JPEG_ORIENTATION = 458755;
    public static final int JPEG_QUALITY = 458756;
    private static final int JPEG_START = 458752;
    public static final int JPEG_THUMBNAIL_QUALITY = 458757;
    public static final int JPEG_THUMBNAIL_SIZE = 458758;
    public static final int LENS_APERTURE = 524288;
    public static final int LENS_FILTER_DENSITY = 524289;
    public static final int LENS_FOCAL_LENGTH = 524290;
    public static final int LENS_FOCUS_DISTANCE = 524291;
    public static final int LENS_FOCUS_RANGE = 524296;
    private static final int LENS_INFO_START = 589824;
    public static final int LENS_INTRINSIC_CALIBRATION = 524298;
    public static final int LENS_OPTICAL_STABILIZATION_MODE = 524292;
    public static final int LENS_POSE_ROTATION = 524294;
    public static final int LENS_POSE_TRANSLATION = 524295;
    public static final int LENS_RADIAL_DISTORTION = 524299;
    private static final int LENS_START = 524288;
    public static final int LENS_STATE = 524297;
    public static final int NOISE_REDUCTION_MODE = 655360;
    private static final int NOISE_REDUCTION_START = 655360;
    public static final int REQUEST_PIPELINE_DEPTH = 786441;
    private static final int REQUEST_START = 786432;
    public static final int SCALER_CROP_REGION = 851968;
    private static final int SCALER_START = 851968;
    private static final int SECTION_BLACK_LEVEL = 22;
    private static final int SECTION_COLOR_CORRECTION = 0;
    private static final int SECTION_CONTROL = 1;
    private static final int SECTION_DEPTH = 25;
    private static final int SECTION_EDGE = 3;
    private static final int SECTION_FLASH = 4;
    private static final int SECTION_FLASH_INFO = 5;
    private static final int SECTION_HOT_PIXEL = 6;
    private static final int SECTION_INFO = 21;
    private static final int SECTION_JPEG = 7;
    private static final int SECTION_LENS = 8;
    private static final int SECTION_LENS_INFO = 9;
    private static final int SECTION_NOISE_REDUCTION = 10;
    private static final int SECTION_REQUEST = 12;
    private static final int SECTION_SCALER = 13;
    private static final int SECTION_SENSOR = 14;
    private static final int SECTION_SENSOR_INFO = 15;
    private static final int SECTION_SHADING = 16;
    private static final int SECTION_STATISTICS = 17;
    private static final int SECTION_STATISTICS_INFO = 18;
    private static final int SECTION_SYNC = 23;
    private static final int SECTION_TONEMAP = 19;
    public static final int SENSOR_DYNAMIC_BLACK_LEVEL = 917532;
    public static final int SENSOR_DYNAMIC_WHITE_LEVEL = 917533;
    public static final int SENSOR_EXPOSURE_TIME = 917504;
    public static final int SENSOR_FRAME_DURATION = 917505;
    public static final int SENSOR_GREEN_SPLIT = 917526;
    private static final int SENSOR_INFO_START = 983040;
    public static final int SENSOR_NEUTRAL_COLOR_POINT = 917522;
    public static final int SENSOR_NOISE_PROFILE = 917523;
    public static final int SENSOR_ROLLING_SHUTTER_SKEW = 917530;
    public static final int SENSOR_SENSITIVITY = 917506;
    private static final int SENSOR_START = 917504;
    public static final int SENSOR_TEST_PATTERN_DATA = 917527;
    public static final int SENSOR_TEST_PATTERN_MODE = 917528;
    public static final int SENSOR_TIMESTAMP = 917520;
    public static final int SHADING_MODE = 1048576;
    private static final int SHADING_START = 1048576;
    public static final int STATISTICS_FACE_DETECT_MODE = 1114112;
    public static final int STATISTICS_FACE_IDS = 1114116;
    public static final int STATISTICS_FACE_LANDMARKS = 1114117;
    public static final int STATISTICS_FACE_RECTANGLES = 1114118;
    public static final int STATISTICS_FACE_SCORES = 1114119;
    public static final int STATISTICS_HOT_PIXEL_MAP = 1114127;
    public static final int STATISTICS_HOT_PIXEL_MAP_MODE = 1114115;
    private static final int STATISTICS_INFO_START = 1179648;
    public static final int STATISTICS_LENS_SHADING_MAP = 1114123;
    public static final int STATISTICS_LENS_SHADING_MAP_MODE = 1114128;
    public static final int STATISTICS_SCENE_FLICKER = 1114126;
    private static final int STATISTICS_START = 1114112;
    private static final int STRING_BUILDER_CAPACITY = 80;
    public static final int SYNC_FRAME_NUMBER = 1507328;
    private static final int SYNC_START = 1507328;
    private static final String TAG = "ARImageMetadata";
    public static final int TONEMAP_CURVE_BLUE = 1245184;
    public static final int TONEMAP_CURVE_GREEN = 1245185;
    public static final int TONEMAP_CURVE_RED = 1245186;
    public static final int TONEMAP_GAMMA = 1245190;
    public static final int TONEMAP_MODE = 1245187;
    public static final int TONEMAP_PRESET_CURVE = 1245191;
    private static final int TONEMAP_START = 1245184;
    private static final int TYPE_BYTE = 0;
    private static final int TYPE_DOUBLE = 4;
    private static final int TYPE_FLOAT = 2;
    private static final int TYPE_INT = 1;
    private static final int TYPE_LONG = 3;
    private static final int TYPE_RATIONAL = 5;
    private static final String WRONG_RETURN_TYPE = "Wrong return type for ImageMetadata key: %1$d.";
    private final long mNativeHandle;
    private final ARSession mSession;
    private final a mSketchEntry;

    private native void nativeDestroyMetadataEntry(long j, long j2);

    private native int[] nativeGetAllKeys(long j, long j2);

    private native byte[] nativeGetByteArrayFromMetadataEntry(long j, long j2);

    private native byte nativeGetByteFromMetadataEntry(long j, long j2);

    private native double[] nativeGetDoubleArrayFromMetadataEntry(long j, long j2);

    private native double nativeGetDoubleFromMetadataEntry(long j, long j2);

    private native float[] nativeGetFloatArrayFromMetadataEntry(long j, long j2);

    private native float nativeGetFloatFromMetadataEntry(long j, long j2);

    private native int[] nativeGetIntArrayFromMetadataEntry(long j, long j2);

    private native int nativeGetIntFromMetadataEntry(long j, long j2);

    private native long[] nativeGetLongArrayFromMetadataEntry(long j, long j2);

    private native long nativeGetLongFromMetadataEntry(long j, long j2);

    private native long nativeGetMetadataEntry(long j, long j2, int i);

    private native int nativeGetMetadataEntryValueCount(long j, long j2);

    private native int nativeGetMetadataEntryValueType(long j, long j2);

    private native Rational[] nativeGetRationalArrayFromMetadataEntry(long j, long j2);

    private native Rational nativeGetRationalFromMetadataEntry(long j, long j2);

    private static native void nativeReleaseImageMetadata(long j);

    public Rational[] getRationalArray(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.RATIONAL) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        Rational[] rationalArrNativeGetRationalArrayFromMetadataEntry = nativeGetRationalArrayFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return rationalArrNativeGetRationalArrayFromMetadataEntry;
    }

    public Rational getRational(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.RATIONAL || aVar.f11740b != 1) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        Rational rationalNativeGetRationalFromMetadataEntry = nativeGetRationalFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return rationalNativeGetRationalFromMetadataEntry;
    }

    public long[] getLongArray(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.LONG) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        long[] jArrNativeGetLongArrayFromMetadataEntry = nativeGetLongArrayFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return jArrNativeGetLongArrayFromMetadataEntry;
    }

    public long getLong(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.LONG || aVar.f11740b != 1) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        long jNativeGetLongFromMetadataEntry = nativeGetLongFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return jNativeGetLongFromMetadataEntry;
    }

    public int[] getKeys() {
        int[] iArrNativeGetAllKeys = nativeGetAllKeys(this.mSession.mNativeHandle, this.mNativeHandle);
        if (iArrNativeGetAllKeys != null) {
            return iArrNativeGetAllKeys;
        }
        throw new ARFatalException("ARImageMetadata.getKeys() error.");
    }

    public int[] getIntArray(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.INT) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        int[] iArrNativeGetIntArrayFromMetadataEntry = nativeGetIntArrayFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return iArrNativeGetIntArrayFromMetadataEntry;
    }

    public int getInt(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.INT || aVar.f11740b != 1) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        int iNativeGetIntFromMetadataEntry = nativeGetIntFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return iNativeGetIntFromMetadataEntry;
    }

    public float[] getFloatArray(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.FLOAT) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        float[] fArrNativeGetFloatArrayFromMetadataEntry = nativeGetFloatArrayFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return fArrNativeGetFloatArrayFromMetadataEntry;
    }

    public float getFloat(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.FLOAT || aVar.f11740b != 1) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        float fNativeGetFloatFromMetadataEntry = nativeGetFloatFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return fNativeGetFloatFromMetadataEntry;
    }

    public double[] getDoubleArray(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.DOUBLE) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        double[] dArrNativeGetDoubleArrayFromMetadataEntry = nativeGetDoubleArrayFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return dArrNativeGetDoubleArrayFromMetadataEntry;
    }

    public double getDouble(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.DOUBLE || aVar.f11740b != 1) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        double dNativeGetDoubleFromMetadataEntry = nativeGetDoubleFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return dNativeGetDoubleFromMetadataEntry;
    }

    public byte[] getByteArray(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.BYTE) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        byte[] bArrNativeGetByteArrayFromMetadataEntry = nativeGetByteArrayFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return bArrNativeGetByteArrayFromMetadataEntry;
    }

    public byte getByte(int i) {
        getMetadataEntry(i, this.mSketchEntry);
        a aVar = this.mSketchEntry;
        if (aVar.f11741c != a.EnumC0083a.BYTE || aVar.f11740b != 1) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, WRONG_RETURN_TYPE, Integer.valueOf(i)));
        }
        byte bNativeGetByteFromMetadataEntry = nativeGetByteFromMetadataEntry(this.mSession.mNativeHandle, aVar.f11739a);
        nativeDestroyMetadataEntry(this.mSession.mNativeHandle, this.mSketchEntry.f11739a);
        return bNativeGetByteFromMetadataEntry;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f11739a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        EnumC0083a f11741c = EnumC0083a.INVALID;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11740b = -1;

        /* JADX INFO: renamed from: com.huawei.hiar.ARImageMetadata$a$a, reason: collision with other inner class name */
        enum EnumC0083a {
            INVALID(-1),
            BYTE(0),
            INT(1),
            FLOAT(2),
            LONG(3),
            DOUBLE(4),
            RATIONAL(5);

            final int i;

            static EnumC0083a a(int i) {
                for (EnumC0083a enumC0083a : values()) {
                    if (enumC0083a.i == i) {
                        return enumC0083a;
                    }
                }
                StringBuilder sb = new StringBuilder(80);
                sb.append("Unexpected value for native DataType, value=");
                sb.append(i);
                throw new ARFatalException(sb.toString());
            }

            EnumC0083a(int i) {
                this.i = i;
            }
        }

        a() {
        }
    }

    protected void finalize() throws Throwable {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeReleaseImageMetadata(j);
        }
        super.finalize();
    }

    private void getMetadataEntry(int i, a aVar) {
        long jNativeGetMetadataEntry = nativeGetMetadataEntry(this.mSession.mNativeHandle, this.mNativeHandle, i);
        aVar.f11739a = jNativeGetMetadataEntry;
        if (jNativeGetMetadataEntry == 0) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Invalid ImageMetadata key: %1$d", Integer.valueOf(i)));
        }
        aVar.f11741c = a.EnumC0083a.a(nativeGetMetadataEntryValueType(this.mSession.mNativeHandle, jNativeGetMetadataEntry));
        aVar.f11740b = nativeGetMetadataEntryValueCount(this.mSession.mNativeHandle, aVar.f11739a);
    }

    ARImageMetadata(long j, ARSession aRSession) {
        this.mSession = aRSession;
        this.mNativeHandle = j;
        this.mSketchEntry = new a();
    }

    protected ARImageMetadata() {
        this.mSession = null;
        this.mNativeHandle = 0L;
        this.mSketchEntry = null;
    }
}
