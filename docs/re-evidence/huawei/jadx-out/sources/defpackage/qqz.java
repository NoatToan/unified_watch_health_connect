package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qqz {
    public static BitmapDrawable e(Context context, int i) {
        Resources resources;
        Bitmap bitmapDecodeResource;
        if (context == null || (resources = context.getResources()) == null || (bitmapDecodeResource = BitmapFactory.decodeResource(resources, i)) == null) {
            return null;
        }
        Paint paint = new Paint();
        Matrix matrix = new Matrix();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), bitmapDecodeResource.getConfig());
        paint.setAntiAlias(true);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmapDecodeResource.getWidth(), 0.0f);
        canvas.drawBitmap(bitmapDecodeResource, matrix, paint);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        bitmapDecodeResource.recycle();
        return bitmapDrawable;
    }

    public static BitmapDrawable e(Context context, Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(new Canvas(bitmapCreateBitmap));
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmapCreateBitmap.getWidth(), 0.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getConfig());
        new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCreateBitmap, matrix, paint);
        if (context == null) {
            bitmapDrawable = new BitmapDrawable(BaseApplication.getContext().getResources(), bitmapCreateBitmap2);
        } else {
            bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap2);
        }
        bitmapCreateBitmap.recycle();
        return bitmapDrawable;
    }

    public static Drawable c(Context context, int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        return LanguageUtil.ba(context) ? e(context, drawable) : drawable;
    }
}
