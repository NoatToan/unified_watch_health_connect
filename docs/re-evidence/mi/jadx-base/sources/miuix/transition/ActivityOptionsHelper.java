package miuix.transition;

import android.app.ActivityOptions;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import defpackage.gn0;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class ActivityOptionsHelper {
    public static final int ANIM_LAUNCH_ACTIVITY_FROM_ROUNDED_VIEW = 102;
    public static final int ANIM_LAUNCH_ACTIVITY_WITH_SCALED_THUMB = 103;
    private static final String TAG = "ActivityOptionsHelper";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f26905a = b();

        public static boolean b() {
            try {
                Class cls = Float.TYPE;
                ActivityOptions.class.getMethod("makeMiuiClipAnimation", Rect.class, Rect.class, cls, cls, Integer.TYPE, cls, Boolean.TYPE);
                return true;
            } catch (NoSuchMethodException e) {
                e.toString();
                return false;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f26906a = b();

        public static boolean b() {
            try {
                Class cls = Float.TYPE;
                ActivityOptions.class.getMethod("makeMiuiRoundAnimation", cls, cls, Integer.TYPE, cls);
                return true;
            } catch (NoSuchMethodException e) {
                e.toString();
                return false;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f26907a = c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f26908b = d();

        @Deprecated
        public static boolean c() {
            try {
                Class cls = Integer.TYPE;
                ActivityOptions.class.getMethod("makeScaleUpAnimationFromRoundedView", View.class, Bitmap.class, cls, cls, cls, cls, Float.TYPE, Handler.class, Runnable.class, Runnable.class, Runnable.class, Runnable.class).setAccessible(true);
                return true;
            } catch (NoSuchMethodException e) {
                e.toString();
                return false;
            }
        }

        public static boolean d() {
            try {
                Class cls = Integer.TYPE;
                ActivityOptions.class.getMethod("makeScaleUpDown", View.class, Bitmap.class, cls, cls, cls, cls, Float.TYPE, Handler.class, Runnable.class, Runnable.class, Runnable.class, Runnable.class).setAccessible(true);
                return true;
            } catch (NoSuchMethodException e) {
                e.toString();
                return false;
            }
        }
    }

    private ActivityOptionsHelper() {
    }

    public static Bitmap captureSnapshot(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        long j = width * height * 4;
        long scaledMaximumDrawingCacheSize = ViewConfiguration.get(view.getContext()).getScaledMaximumDrawingCacheSize();
        Bitmap bitmap = null;
        if (width <= 0 || height <= 0 || j > scaledMaximumDrawingCacheSize) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getResources().getDisplayMetrics(), width, height, Bitmap.Config.ARGB_8888);
            try {
                bitmapCreateBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                view.computeScroll();
                int iSave = canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScaleY());
                view.draw(canvas);
                canvas.restoreToCount(iSave);
                canvas.setBitmap(null);
                return bitmapCreateBitmap;
            } catch (OutOfMemoryError unused) {
                bitmap = bitmapCreateBitmap;
                return bitmap;
            }
        } catch (OutOfMemoryError unused2) {
        }
    }

    public static boolean isSupportMiuiClipAnimation() {
        return a.f26905a;
    }

    public static boolean isSupportMiuiRoundAnimation() {
        return b.f26906a;
    }

    public static boolean isSupportScaleUpDown(int i) {
        if (i == 102 && c.f26907a) {
            return true;
        }
        return i == 103 && c.f26908b;
    }

    public static ActivityOptions makeMiuiClipAnimation(Rect rect, Rect rect2, float f, float f2, int i, float f3, boolean z) {
        if (isSupportMiuiClipAnimation()) {
            return gn0.a(rect, rect2, f, f2, i, f3, z);
        }
        return null;
    }

    public static ActivityOptions makeMiuiRoundAnimation(float f, float f2, int i, float f3) {
        if (isSupportMiuiRoundAnimation()) {
            return gn0.b(f, f2, i, f3);
        }
        return null;
    }

    public static ActivityOptions makeScaleUpAnim(View view, Rect rect, int i, int i2, int i3) {
        if (isSupportScaleUpDown()) {
            return makeScaleUpAnim(view, rect, i, i2, null, null, null, null, (i3 == 102 || i3 == 103) ? i3 : 102);
        }
        return null;
    }

    @Deprecated
    public static ActivityOptions makeScaleUpAnimationFromRoundedView(View view, Rect rect, int i, int i2) {
        if (isSupportScaleUpDown()) {
            return makeScaleUpAnim(view, rect, i, i2, null, null, null, null, 102);
        }
        return null;
    }

    @Deprecated
    public static ActivityOptions makeScaleUpAnimationFromRoundedView(View view, Bitmap bitmap, int i, int i2, int i3, int i4, float f, Handler handler, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        return makeScaleUpAnim(view, bitmap, i, i2, i3, i4, f, handler, runnable, runnable2, runnable3, runnable4, 102);
    }

    public static boolean isSupportScaleUpDown() {
        return c.f26907a || c.f26908b;
    }

    private static ActivityOptions makeScaleUpAnim(View view, Rect rect, int i, int i2, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(captureSnapshot(view), rect.left, rect.top, rect.width(), rect.height());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return makeScaleUpAnim(view, bitmapCreateBitmap, iArr[0] + rect.left, iArr[1] + rect.top, i, i2, view.getScaleX(), new Handler(), runnable, runnable2, runnable3, runnable4, i3);
    }

    public static ActivityOptions makeScaleUpAnim(View view, Bitmap bitmap, int i, int i2, int i3, int i4, float f, Handler handler, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, int i5) {
        if (!isSupportScaleUpDown()) {
            return null;
        }
        if (c.f26908b) {
            return gn0.d(view, bitmap, i, i2, i3, i4, f, handler, runnable, runnable2, runnable3, runnable4, i5);
        }
        return gn0.c(view, bitmap, i, i2, i3, i4, f, handler, runnable, runnable2, runnable3, runnable4);
    }
}
