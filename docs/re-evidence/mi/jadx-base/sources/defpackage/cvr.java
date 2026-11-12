package defpackage;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class cvr extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f14789b;
    public Bitmap c;
    public pvr d;

    public cvr(String str, View view) {
        super(str);
        this.f14788a = view;
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f14789b = Bitmap.createBitmap(300, 600, config);
        this.c = Bitmap.createBitmap(300, 600, config);
        pvr pvrVar = new pvr();
        this.d = pvrVar;
        pvrVar.b(view.getContext(), this.f14789b, 25.0f);
    }

    public Bitmap a() {
        if (this.f14788a == null || this.f14789b == null || this.c == null) {
            return null;
        }
        long jNanoTime = System.nanoTime();
        this.d.a(this.f14789b, this.c);
        zxr.a("BlurThread", "blurBitmap:spend:" + (System.nanoTime() - jNanoTime) + " ns");
        return this.c;
    }

    public final Bitmap b(View view) {
        Bitmap drawingCache = view.getDrawingCache();
        return drawingCache != null ? Bitmap.createScaledBitmap(drawingCache, 300, 600, false) : drawingCache;
    }

    public Bitmap c() {
        if (this.f14788a == null) {
            return null;
        }
        long jNanoTime = System.nanoTime();
        try {
            this.f14788a.setDrawingCacheEnabled(true);
            this.f14788a.buildDrawingCache();
            this.f14789b = b(this.f14788a);
            this.f14788a.setDrawingCacheEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        zxr.a("BlurThread", "getCacheBitmapFromView:spend:" + (System.nanoTime() - jNanoTime) + " ns");
        return this.f14789b;
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        return super.quit();
    }
}
