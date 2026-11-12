package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public class bcr {
    public static Bitmap a(WebView webView) {
        return c(webView);
    }

    public static Bitmap b(WebView webView, float f, float f2) {
        Bitmap bitmapA = a(webView);
        int height = bitmapA.getHeight();
        return f(f, f2) ? Bitmap.createBitmap(bitmapA, 0, (((int) f) * height) / 100, bitmapA.getWidth(), (((int) (f2 - f)) * height) / 100) : bitmapA;
    }

    @SuppressLint({"WrongCall"})
    public static Bitmap c(WebView webView) {
        Bitmap bitmapCreateBitmap;
        g(webView);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        webView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        if (webView.getMeasuredWidth() <= 0 || webView.getMeasuredHeight() <= 0) {
            return null;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(webView.getMeasuredWidth(), webView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            System.gc();
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(webView.getMeasuredWidth(), webView.getMeasuredHeight(), Bitmap.Config.RGB_565);
            } catch (OutOfMemoryError unused2) {
                e(webView);
                return d(webView);
            }
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, bitmapCreateBitmap.getHeight(), new Paint());
        webView.draw(canvas);
        e(webView);
        return bitmapCreateBitmap;
    }

    public static Bitmap d(WebView webView) {
        try {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(webView.getWidth(), webView.getHeight(), Bitmap.Config.ARGB_8888);
                webView.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
            } finally {
                e(webView);
            }
        } catch (Exception unused) {
            g(webView);
            return webView.getDrawingCache();
        }
    }

    public static void e(WebView webView) {
        webView.setDrawingCacheEnabled(false);
        webView.destroyDrawingCache();
    }

    public static boolean f(float f, float f2) {
        return f >= 0.0f && f < f2 && f2 <= 100.0f;
    }

    public static void g(WebView webView) {
        webView.setDrawingCacheEnabled(true);
        webView.buildDrawingCache();
    }
}
