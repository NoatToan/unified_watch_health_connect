package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ScrollView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lsv {
    public static Bitmap e(View view) {
        if (view == null) {
            LogUtil.a("Track_ScreenShotUtils", "shotScreen view is null");
            return null;
        }
        if (view instanceof ScrollView) {
            return e((ScrollView) view);
        }
        return c(view);
    }

    private static Bitmap e(ScrollView scrollView) {
        Bitmap bitmapCreateBitmap;
        if (scrollView.getHeight() == 0) {
            LogUtil.a("Track_ScreenShotUtils", "getBitmapByView scrollView.height == 0");
            return null;
        }
        int height = 0;
        for (int i = 0; i < scrollView.getChildCount(); i++) {
            if (scrollView.getChildAt(i) != null) {
                height += scrollView.getChildAt(i).getHeight();
            }
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(scrollView.getWidth(), height, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            LogUtil.j("Track_ScreenShotUtils", ExceptionUtils.c(e));
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            LogUtil.j("Track_ScreenShotUtils", "getBitmapByView 1 No enough memory");
            return null;
        }
        scrollView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private static Bitmap c(View view) {
        Bitmap bitmapCreateBitmap;
        if (view.getHeight() == 0) {
            LogUtil.a("Track_ScreenShotUtils", "getBitmapByView 2 view.height == 0");
            return null;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            LogUtil.j("Track_ScreenShotUtils", e.getMessage());
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            LogUtil.j("Track_ScreenShotUtils", "getBitmapByView view No enough memory");
            return null;
        }
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
