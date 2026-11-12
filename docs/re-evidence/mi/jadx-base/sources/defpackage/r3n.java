package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import miuix.appcompat.app.AppCompatActivity;
import miuix.internal.widget.RoundFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class r3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f32151a;

    public static void a(Context context) {
        if (f32151a == 0.0f) {
            f32151a = context.getResources().getDimensionPixelSize(dmi.d0);
        }
    }

    public static boolean b(View view) {
        return (view == null || view.getContext() == null) ? false : true;
    }

    public static View c(Context context, View view, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        RoundFrameLayout roundFrameLayout = new RoundFrameLayout(context);
        roundFrameLayout.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.layout(0, 0, bitmap.getWidth(), bitmap.getHeight());
        frameLayout.setBackground(new BitmapDrawable(context.getResources(), bitmap));
        roundFrameLayout.addView(frameLayout);
        return roundFrameLayout;
    }

    public static View d(Context context, AppCompatActivity appCompatActivity) {
        View floatingBrightPanel = appCompatActivity.getFloatingBrightPanel();
        return c(context, floatingBrightPanel, f(floatingBrightPanel));
    }

    public static View e(View view, Bitmap bitmap) {
        return c(view.getContext(), view, bitmap);
    }

    public static Bitmap f(View view) {
        if (!b(view)) {
            return null;
        }
        a(view.getContext());
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return null;
        }
        Bitmap bitmapA = qp2.a(drawingCache, f32151a);
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        return bitmapA;
    }
}
