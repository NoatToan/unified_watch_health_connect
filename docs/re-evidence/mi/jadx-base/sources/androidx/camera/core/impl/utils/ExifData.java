package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import defpackage.bse;
import defpackage.eh8;
import defpackage.g6i;
import defpackage.lh8;
import defpackage.zpe;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ExifData {
    public static final String[] c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final lh8[] d;
    public static final lh8[] e;
    public static final lh8[] f;
    public static final lh8[] g;
    public static final lh8[] h;
    public static final lh8[][] i;
    public static final HashSet<String> j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Map<String, eh8>> f1743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f1744b;

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1746b;

        static {
            int[] iArr = new int[WhiteBalanceMode.values().length];
            f1746b = iArr;
            try {
                iArr[WhiteBalanceMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1746b[WhiteBalanceMode.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraCaptureMetaData$FlashState.values().length];
            f1745a = iArr2;
            try {
                iArr2[CameraCaptureMetaData$FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1745a[CameraCaptureMetaData$FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1745a[CameraCaptureMetaData$FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b {
        public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final List<HashMap<String, lh8>> f = Collections.list(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Map<String, eh8>> f1747a = Collections.list(new C0013b());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteOrder f1748b;

        public class a implements Enumeration<HashMap<String, lh8>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f1749a = 0;

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, lh8> nextElement() {
                HashMap<String, lh8> map = new HashMap<>();
                for (lh8 lh8Var : ExifData.i[this.f1749a]) {
                    map.put(lh8Var.f25071b, lh8Var);
                }
                this.f1749a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1749a < ExifData.i.length;
            }
        }

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$b$b, reason: collision with other inner class name */
        public class C0013b implements Enumeration<Map<String, eh8>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f1750a = 0;

            public C0013b() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, eh8> nextElement() {
                this.f1750a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1750a < ExifData.i.length;
            }
        }

        public class c implements Enumeration<Map<String, eh8>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Enumeration<Map<String, eh8>> f1752a;

            public c() {
                this.f1752a = Collections.enumeration(b.this.f1747a);
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, eh8> nextElement() {
                return new HashMap(this.f1752a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1752a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.f1748b = byteOrder;
        }

        public static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair<Integer, Integer> pairB2 = b(strArrSplit[i]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
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

        public ExifData a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new ExifData(this.f1748b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f1747a);
            return this;
        }

        public final void d(String str, String str2, List<Map<String, eh8>> list) {
            Iterator<Map<String, eh8>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final void e(String str, String str2, List<Map<String, eh8>> list) {
            int i;
            int i2;
            int i3;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = d.matcher(strReplaceAll).find();
                boolean zFind2 = e.matcher(strReplaceAll).find();
                if (str2.length() != 19 || (!zFind && !zFind2)) {
                    zpe.k("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i4 = 2;
            int i5 = 1;
            if (strReplaceAll != null && ExifData.j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        zpe.k("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) g6i.g(matcher.group(1))) + "/1," + Integer.parseInt((String) g6i.g(matcher.group(2))) + "/1," + Integer.parseInt((String) g6i.g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new bse(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e2) {
                        zpe.l("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e2);
                        return;
                    }
                }
            }
            int i6 = 0;
            int i7 = 0;
            while (i7 < ExifData.i.length) {
                lh8 lh8Var = f.get(i7).get(str4);
                if (lh8Var == null) {
                    i = i7;
                    i2 = i5;
                } else {
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairB = b(strReplaceAll);
                        if (lh8Var.c == ((Integer) pairB.first).intValue() || lh8Var.c == ((Integer) pairB.second).intValue()) {
                            i3 = lh8Var.c;
                        } else {
                            int i8 = lh8Var.d;
                            if (i8 == -1 || !(i8 == ((Integer) pairB.first).intValue() || lh8Var.d == ((Integer) pairB.second).intValue())) {
                                i3 = lh8Var.c;
                                if (i3 == i5 || i3 == 7 || i3 == i4) {
                                }
                            } else {
                                i3 = lh8Var.d;
                            }
                        }
                        String str5 = "/";
                        switch (i3) {
                            case 1:
                                i = i7;
                                i2 = i5;
                                list.get(i).put(str4, eh8.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i = i7;
                                i2 = i5;
                                list.get(i).put(str4, eh8.e(strReplaceAll));
                                break;
                            case 3:
                                i = i7;
                                i2 = i5;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                                    iArr[i9] = Integer.parseInt(strArrSplit[i9]);
                                }
                                list.get(i).put(str4, eh8.i(iArr, bVar.f1748b));
                                break;
                            case 4:
                                i = i7;
                                i2 = i5;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                                    jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                                }
                                list.get(i).put(str4, eh8.g(jArr, bVar.f1748b));
                                break;
                            case 5:
                                String str6 = "/";
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                bse[] bseVarArr = new bse[strArrSplit3.length];
                                int i11 = i6;
                                while (i11 < strArrSplit3.length) {
                                    String str7 = str6;
                                    String[] strArrSplit4 = strArrSplit3[i11].split(str7, -1);
                                    bseVarArr[i11] = new bse((long) Double.parseDouble(strArrSplit4[i6]), (long) Double.parseDouble(strArrSplit4[1]));
                                    i11++;
                                    str6 = str7;
                                    i7 = i7;
                                    i6 = 0;
                                }
                                i = i7;
                                i2 = 1;
                                list.get(i).put(str4, eh8.h(bseVarArr, bVar.f1748b));
                                break;
                            case 9:
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i12 = i6; i12 < strArrSplit5.length; i12++) {
                                    iArr2[i12] = Integer.parseInt(strArrSplit5[i12]);
                                }
                                list.get(i7).put(str4, eh8.c(iArr2, bVar.f1748b));
                                i = i7;
                                i2 = 1;
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                bse[] bseVarArr2 = new bse[strArrSplit6.length];
                                int i13 = i6;
                                while (i13 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i13].split(str5, -1);
                                    bseVarArr2[i13] = new bse((long) Double.parseDouble(strArrSplit7[i6]), (long) Double.parseDouble(strArrSplit7[i5]));
                                    i13++;
                                    str5 = str5;
                                    i5 = 1;
                                }
                                bVar = this;
                                list.get(i7).put(str4, eh8.d(bseVarArr2, bVar.f1748b));
                                i = i7;
                                i2 = 1;
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i14 = i6; i14 < strArrSplit8.length; i14++) {
                                    dArr[i14] = Double.parseDouble(strArrSplit8[i14]);
                                }
                                list.get(i7).put(str4, eh8.b(dArr, bVar.f1748b));
                                break;
                        }
                    } else {
                        list.get(i7).remove(str4);
                    }
                    i = i7;
                    i2 = i5;
                }
                i7 = i + 1;
                i5 = i2;
                i4 = 2;
                i6 = 0;
            }
        }

        public b f(long j) {
            return c("ExposureTime", String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(CameraCaptureMetaData$FlashState cameraCaptureMetaData$FlashState) {
            int i;
            if (cameraCaptureMetaData$FlashState == CameraCaptureMetaData$FlashState.UNKNOWN) {
                return this;
            }
            int i2 = a.f1745a[cameraCaptureMetaData$FlashState.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else {
                if (i2 != 3) {
                    zpe.k("ExifData", "Unknown flash state: " + cameraCaptureMetaData$FlashState);
                    return this;
                }
                i = 1;
            }
            if ((i & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i));
        }

        public b h(float f2) {
            return c("FocalLength", new bse((long) (f2 * 1000.0f), 1000L).toString());
        }

        public b i(int i) {
            return c("ImageLength", String.valueOf(i));
        }

        public b j(int i) {
            return c("ImageWidth", String.valueOf(i));
        }

        public b k(int i) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i)));
        }

        public b l(float f2) {
            return c("FNumber", String.valueOf(f2));
        }

        public b m(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                zpe.k("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return c("Orientation", String.valueOf(i2));
        }

        public b n(WhiteBalanceMode whiteBalanceMode) {
            String strValueOf;
            int i = a.f1746b[whiteBalanceMode.ordinal()];
            if (i != 1) {
                strValueOf = i != 2 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            return c("WhiteBalance", strValueOf);
        }
    }

    static {
        lh8[] lh8VarArr = {new lh8("ImageWidth", 256, 3, 4), new lh8("ImageLength", 257, 3, 4), new lh8("Make", 271, 2), new lh8("Model", 272, 2), new lh8("Orientation", 274, 3), new lh8("XResolution", 282, 5), new lh8("YResolution", 283, 5), new lh8("ResolutionUnit", 296, 3), new lh8("Software", 305, 2), new lh8("DateTime", 306, 2), new lh8("YCbCrPositioning", 531, 3), new lh8("SubIFDPointer", 330, 4), new lh8("ExifIFDPointer", 34665, 4), new lh8("GPSInfoIFDPointer", 34853, 4)};
        d = lh8VarArr;
        lh8[] lh8VarArr2 = {new lh8("ExposureTime", 33434, 5), new lh8("FNumber", 33437, 5), new lh8("ExposureProgram", 34850, 3), new lh8("PhotographicSensitivity", 34855, 3), new lh8("SensitivityType", 34864, 3), new lh8("ExifVersion", 36864, 2), new lh8("DateTimeOriginal", 36867, 2), new lh8("DateTimeDigitized", 36868, 2), new lh8("ComponentsConfiguration", 37121, 7), new lh8("ShutterSpeedValue", 37377, 10), new lh8("ApertureValue", 37378, 5), new lh8("BrightnessValue", 37379, 10), new lh8("ExposureBiasValue", 37380, 10), new lh8("MaxApertureValue", 37381, 5), new lh8("MeteringMode", 37383, 3), new lh8("LightSource", 37384, 3), new lh8("Flash", 37385, 3), new lh8("FocalLength", 37386, 5), new lh8("SubSecTime", 37520, 2), new lh8("SubSecTimeOriginal", 37521, 2), new lh8("SubSecTimeDigitized", 37522, 2), new lh8("FlashpixVersion", 40960, 7), new lh8("ColorSpace", 40961, 3), new lh8("PixelXDimension", 40962, 3, 4), new lh8("PixelYDimension", 40963, 3, 4), new lh8("InteroperabilityIFDPointer", 40965, 4), new lh8("FocalPlaneResolutionUnit", 41488, 3), new lh8("SensingMethod", 41495, 3), new lh8("FileSource", 41728, 7), new lh8("SceneType", 41729, 7), new lh8("CustomRendered", 41985, 3), new lh8("ExposureMode", 41986, 3), new lh8("WhiteBalance", 41987, 3), new lh8("SceneCaptureType", 41990, 3), new lh8("Contrast", 41992, 3), new lh8("Saturation", 41993, 3), new lh8("Sharpness", 41994, 3)};
        e = lh8VarArr2;
        lh8[] lh8VarArr3 = {new lh8("GPSVersionID", 0, 1), new lh8("GPSLatitudeRef", 1, 2), new lh8("GPSLatitude", 2, 5, 10), new lh8("GPSLongitudeRef", 3, 2), new lh8("GPSLongitude", 4, 5, 10), new lh8("GPSAltitudeRef", 5, 1), new lh8("GPSAltitude", 6, 5), new lh8("GPSTimeStamp", 7, 5), new lh8("GPSSpeedRef", 12, 2), new lh8("GPSTrackRef", 14, 2), new lh8("GPSImgDirectionRef", 16, 2), new lh8("GPSDestBearingRef", 23, 2), new lh8("GPSDestDistanceRef", 25, 2)};
        f = lh8VarArr3;
        g = new lh8[]{new lh8("SubIFDPointer", 330, 4), new lh8("ExifIFDPointer", 34665, 4), new lh8("GPSInfoIFDPointer", 34853, 4), new lh8("InteroperabilityIFDPointer", 40965, 4)};
        lh8[] lh8VarArr4 = {new lh8("InteroperabilityIndex", 1, 2)};
        h = lh8VarArr4;
        i = new lh8[][]{lh8VarArr, lh8VarArr2, lh8VarArr3, lh8VarArr4};
        j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public ExifData(ByteOrder byteOrder, List<Map<String, eh8>> list) {
        g6i.j(list.size() == i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f1744b = byteOrder;
        this.f1743a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public Map<String, eh8> b(int i2) {
        g6i.c(i2, 0, i.length, "Invalid IFD index: " + i2 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f1743a.get(i2);
    }

    public ByteOrder c() {
        return this.f1744b;
    }
}
