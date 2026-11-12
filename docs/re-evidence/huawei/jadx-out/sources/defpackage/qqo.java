package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public class qqo extends BitmapTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Paint f46674a = new Paint(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46675c;
    private final WeakReference<ImageView> d;
    private final int e;

    public qqo(ImageView imageView, int i, int i2) {
        this.d = new WeakReference<>(imageView);
        this.e = i;
        this.f46675c = i2;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        ImageView imageView = this.d.get();
        int width = imageView == null ? 0 : imageView.getWidth();
        int height = imageView != null ? imageView.getHeight() : 0;
        int i3 = width > 0 ? width : i;
        int i4 = height > 0 ? height : i;
        LogUtil.a("GlideRoundCornerTransform", "transform requested imageView:", Integer.valueOf(width), "x", Integer.valueOf(height), " out:", Integer.valueOf(i), "x", Integer.valueOf(i2), " target:", Integer.valueOf(i3), "x", Integer.valueOf(i4));
        if (bitmap.getWidth() == i3 && bitmap.getHeight() == i4) {
            LogUtil.a("GlideRoundCornerTransform", "transform requested target size matches");
            int i5 = this.f46675c;
            return i5 == 0 ? bitmap : b(bitmapPool, bitmap, i5);
        }
        return b(bitmapPool, a(bitmapPool, a(bitmapPool, bitmap, i3, i4), i3, i4, this.e), this.f46675c);
    }

    private static Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            LogUtil.a("GlideRoundCornerTransform", "scaleBitmap requested target size matches input:", Integer.valueOf(i), "x", Integer.valueOf(i2));
            return bitmap;
        }
        float fMax = Math.max(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMax);
        int iRound2 = Math.round(bitmap.getHeight() * fMax);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            LogUtil.a("GlideRoundCornerTransform", "scaleBitmap adjusted target size matches input");
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get((int) (bitmap.getWidth() * fMax), (int) (bitmap.getHeight() * fMax), Bitmap.Config.ARGB_8888);
        LogUtil.a("GlideRoundCornerTransform", "scaleBitmap request:", Integer.valueOf(i), "x", Integer.valueOf(i2), " bitmap:", Integer.valueOf(bitmap.getWidth()), "x", Integer.valueOf(bitmap.getHeight()), " scaleBitmap:", Integer.valueOf(bitmap2.getWidth()), "x", Integer.valueOf(bitmap2.getHeight()), " minPct:", Float.valueOf(fMax));
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        c(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    private static Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= i4 && height <= i5) {
            LogUtil.a("GlideRoundCornerTransform", "cropBitmap requested target size larger or equal to input:", Integer.valueOf(i), "x", Integer.valueOf(i2), " bitmap:", Integer.valueOf(width), "x", Integer.valueOf(height));
            return bitmap;
        }
        float[] fArrB = b(i4, i5, width, height, i3);
        float f = fArrB[0];
        float f2 = fArrB[1];
        if (height < i5) {
            i5 = height;
            f2 = 0.0f;
        }
        if (width < i4) {
            i4 = width;
            f = 0.0f;
        }
        if (f < 0.0f || f2 < 0.0f) {
            LogUtil.j("GlideRoundCornerTransform", "originHorizontal or originVertical < 0");
            return bitmap;
        }
        LogUtil.a("GlideRoundCornerTransform", "cropBitmap request:", Float.valueOf(f), "x", Float.valueOf(f2), " cropBitmap:", Integer.valueOf(i4), "x", Integer.valueOf(i5), " inBitmap:", Integer.valueOf(width), "x", Integer.valueOf(height), " cropType:", Integer.valueOf(i3));
        Bitmap bitmap2 = bitmapPool.get(i4, i5, Bitmap.Config.ARGB_8888);
        float f3 = i4;
        float f4 = i5;
        Rect rect = new Rect((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        RectF rectF = new RectF(0.0f, 0.0f, f3, f4);
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, rect, rectF, f46674a);
        canvas.setBitmap(null);
        return bitmap2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static float[] b(int i, int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        float[] fArr = {0.0f, 0.0f};
        float f3 = 0.0f;
        switch (i5) {
            case 1:
                f = 0.0f;
                break;
            case 2:
                f = i4 - i2;
                break;
            case 3:
                f3 = i3 - i;
                f = 0.0f;
                break;
            case 4:
                f3 = i3 - i;
                f = i4 - i2;
                break;
            case 5:
                f = (i4 - i2) / 2.0f;
                break;
            case 6:
                f2 = i3 - i;
                f3 = f2;
                f = (i4 - i2) / 2.0f;
                break;
            default:
                f2 = (i3 - i) / 2.0f;
                f3 = f2;
                f = (i4 - i2) / 2.0f;
                break;
        }
        fArr[0] = f3;
        fArr[1] = f;
        return fArr;
    }

    private static Bitmap b(BitmapPool bitmapPool, Bitmap bitmap, float f) {
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f, f, paint);
        return bitmap2;
    }

    private static void c(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, matrix, f46674a);
        canvas.setBitmap(null);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof qqo)) {
            return false;
        }
        qqo qqoVar = (qqo) obj;
        return qqoVar.e == this.e && qqoVar.f46675c == this.f46675c;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return ((this.f46675c * 100) - 738196347) + (this.e * 10);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(("com.huawei.ui.commonui.utils.GlideRoundCornerTransform.1" + this.f46675c + this.e).getBytes(CHARSET));
    }
}
