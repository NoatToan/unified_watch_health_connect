package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jhk {
    public static int a(ExifInterface exifInterface) {
        if (exifInterface == null) {
            return 0;
        }
        int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : -90;
        }
        return 90;
    }

    public static Bitmap a(Context context, PhotoModel photoModel) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = a(options, context, photoModel);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = false;
        return BitmapFactory.decodeFile(photoModel.getPath(), options);
    }

    private static int a(BitmapFactory.Options options, Context context, PhotoModel photoModel) {
        int i = 1;
        options.inJustDecodeBounds = true;
        double width = photoModel.getWidth();
        double height = photoModel.getHeight();
        double dC = ((double) jhi.c(context, 300.0f)) * 1.3d;
        double dC2 = ((double) jhi.c(context)) * 1.3d;
        if (width > dC || height > dC2) {
            while (true) {
                double d = i;
                if (width / d <= dC && height / d <= dC2) {
                    break;
                }
                i *= 2;
            }
        }
        LogUtil.a("PressUtils", "inSampleSize:", String.valueOf(i));
        LogUtil.a("PressUtils", "inSampleSizeoutWidth:", String.valueOf(dC));
        LogUtil.a("PressUtils", "inSampleSizeoutHeight:", String.valueOf(dC2));
        LogUtil.a("PressUtils", "inSampleSizewidth:", String.valueOf(width));
        LogUtil.a("PressUtils", "inSampleSizeheight:", String.valueOf(height));
        LogUtil.a("PressUtils", "inSampleSizeoptionswidth:", String.valueOf(options.outWidth));
        LogUtil.a("PressUtils", "inSampleSizeoptionsheight:", String.valueOf(options.outHeight));
        return i;
    }
}
