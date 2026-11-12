package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes.dex */
public class ou1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f29678a;

    public static Bitmap a(Bitmap bitmap, int i) {
        float height;
        float width;
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        if (i == 90) {
            height = bitmap.getHeight();
            width = 0.0f;
        } else {
            height = bitmap.getHeight();
            width = bitmap.getWidth();
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        matrix.postTranslate(height - fArr[2], width - fArr[5]);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, new Paint());
        return bitmapCreateBitmap;
    }

    public static float b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static Rect c(float f, float f2, float f3, int i, int i2, int i3, int i4) {
        int i5 = (int) ((i * f) / 2.0f);
        int i6 = (int) ((i2 * f) / 2.0f);
        int i7 = (int) (((f2 / i3) * 2000.0f) - 1000.0f);
        int i8 = (int) (((f3 / i4) * 2000.0f) - 1000.0f);
        RectF rectF = new RectF(d(i7 - i5, -1000, 1000), d(i8 - i6, -1000, 1000), d(i7 + i5, -1000, 1000), d(i8 + i6, -1000, 1000));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static int d(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static void e(String str) {
        f("BGAQRCode", str);
    }

    public static void f(String str, String str2) {
    }

    public static int g(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static void h(String str) {
    }

    public static Bitmap i(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i2 = options.outHeight / 400;
            if (i2 > 0) {
                i = i2;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Point j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static int k(Context context) {
        int identifier;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.windowFullscreen});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        if (!z && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A)) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean l() {
        return f29678a;
    }

    public static boolean m(Context context) {
        Point pointJ = j(context);
        return pointJ.y > pointJ.x;
    }

    public static Bitmap n(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static void o(String str, Rect rect) {
        f("BGAQRCodeFocusArea", str + " centerX：" + rect.centerX() + " centerY：" + rect.centerY() + " width：" + rect.width() + " height：" + rect.height() + " rectHalfWidth：" + (rect.width() / 2) + " rectHalfHeight：" + (rect.height() / 2) + " left：" + rect.left + " top：" + rect.top + " right：" + rect.right + " bottom：" + rect.bottom);
    }

    public static int p(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
