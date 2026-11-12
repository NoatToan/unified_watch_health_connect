package defpackage;

import android.media.ExifInterface;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class fh8 {
    public static WritableMap a(String str) throws IOException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        List<String> listB = b();
        listB.addAll(c());
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            kya kyaVar = new kya(exifInterface);
            if (kyaVar.b() != null && kyaVar.c() != null) {
                writableNativeMap.putDouble("Latitude", kyaVar.b().floatValue());
                writableNativeMap.putDouble("Longitude", kyaVar.c().floatValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str2 : listB) {
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    public static List<String> b() {
        return new ArrayList(Arrays.asList("FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"));
    }

    public static List<String> c() {
        return new ArrayList(Arrays.asList("DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal"));
    }
}
