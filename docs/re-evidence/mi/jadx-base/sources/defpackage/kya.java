package defpackage;

import android.media.ExifInterface;

/* JADX INFO: loaded from: classes6.dex */
public class kya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Float f24416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Float f24417b;

    public kya(ExifInterface exifInterface) {
        String attribute = exifInterface.getAttribute("GPSLatitude");
        String attribute2 = exifInterface.getAttribute("GPSLatitudeRef");
        String attribute3 = exifInterface.getAttribute("GPSLongitude");
        String attribute4 = exifInterface.getAttribute("GPSLongitudeRef");
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return;
        }
        if (attribute2.equals("N")) {
            this.f24416a = a(attribute);
        } else {
            this.f24416a = Float.valueOf(0.0f - a(attribute).floatValue());
        }
        if (attribute4.equals("E")) {
            this.f24417b = a(attribute3);
        } else {
            this.f24417b = Float.valueOf(0.0f - a(attribute3).floatValue());
        }
    }

    public final Float a(String str) {
        String[] strArrSplit = str.split(",", 3);
        String[] strArrSplit2 = strArrSplit[0].split("/", 2);
        double dDoubleValue = Double.valueOf(strArrSplit2[0]).doubleValue() / Double.valueOf(strArrSplit2[1]).doubleValue();
        String[] strArrSplit3 = strArrSplit[1].split("/", 2);
        double dDoubleValue2 = Double.valueOf(strArrSplit3[0]).doubleValue() / Double.valueOf(strArrSplit3[1]).doubleValue();
        String[] strArrSplit4 = strArrSplit[2].split("/", 2);
        return Float.valueOf((float) (dDoubleValue + (dDoubleValue2 / 60.0d) + ((Double.valueOf(strArrSplit4[0]).doubleValue() / Double.valueOf(strArrSplit4[1]).doubleValue()) / 3600.0d)));
    }

    public Float b() {
        return this.f24416a;
    }

    public Float c() {
        return this.f24417b;
    }
}
