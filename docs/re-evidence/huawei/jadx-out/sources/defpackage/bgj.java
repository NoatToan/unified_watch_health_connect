package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
public class bgj {
    public static VectorDrawableCompat d(String str, bgi bgiVar) throws bdo {
        try {
            VectorDrawableCompat vectorDrawableCompatA = VectorDrawableCompat.a(bdn.b() + File.separator + str + WatchFaceConstant.XML_SUFFIX);
            vectorDrawableCompatA.d(c(bgiVar, vectorDrawableCompatA.getIntrinsicWidth(), vectorDrawableCompatA.getIntrinsicHeight()));
            return vectorDrawableCompatA;
        } catch (IOException | XmlPullParserException unused) {
            Log.e("VectorDrawableUtils", "load vector drawable failed, file name: " + str);
            throw new bdo("load vector drawable failed, file name: " + str);
        }
    }

    public static VectorDrawableCompat e(String str, bgi bgiVar, int i, int i2) throws bdo {
        try {
            VectorDrawableCompat vectorDrawableCompatA = VectorDrawableCompat.a(bdn.b() + File.separator + str + WatchFaceConstant.XML_SUFFIX);
            vectorDrawableCompatA.d(c(bgiVar, i, i2));
            return vectorDrawableCompatA;
        } catch (IOException | XmlPullParserException unused) {
            Log.e("VectorDrawableUtils", "load vector drawable failed, file name: " + str);
            throw new bdo("load vector drawable failed, file name: " + str);
        }
    }

    private static Matrix c(bgi bgiVar, float f, float f2) {
        if (bgiVar == null) {
            return null;
        }
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.postScale(bgiVar.b(), bgiVar.b(), f3, f4);
        matrix.postRotate(bgiVar.e(), f3, f4);
        matrix.postTranslate(bgiVar.d() * f, bgiVar.a() * f2);
        return matrix;
    }

    public static Bitmap b(VectorDrawableCompat vectorDrawableCompat) {
        return e(vectorDrawableCompat, vectorDrawableCompat.getMinimumWidth(), vectorDrawableCompat.getMinimumHeight());
    }

    public static Bitmap e(VectorDrawableCompat vectorDrawableCompat, int i, int i2) {
        vectorDrawableCompat.a(false);
        vectorDrawableCompat.setBounds(0, 0, i, i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        vectorDrawableCompat.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
