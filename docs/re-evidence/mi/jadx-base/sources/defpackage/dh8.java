package defpackage;

import android.media.ExifInterface;
import com.xiaomi.fitness.common.log.Logger;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class dh8 {
    public static int a(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 0);
            Logger.d("Exif", "getDegree: ori = " + attributeInt);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            Logger.e("Exif", "getDegree: " + e.getMessage());
        }
    }

    public static boolean b(int i) {
        return i == 90 || i == 270 || i == 180;
    }
}
