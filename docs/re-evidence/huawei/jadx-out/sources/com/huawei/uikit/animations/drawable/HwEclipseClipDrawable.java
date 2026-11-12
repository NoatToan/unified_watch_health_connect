package com.huawei.uikit.animations.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: loaded from: classes20.dex */
public abstract class HwEclipseClipDrawable extends ClipDrawable {
    private static final String g = "HwEclipseClipDrawable";
    private static final int h = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f29181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f29182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f29183c;
    private Bitmap d;
    private Canvas e;
    private PorterDuffXfermode f;

    public HwEclipseClipDrawable(Drawable drawable, int i, int i2) {
        super(drawable, i, i2);
        a(drawable);
    }

    private void a(Drawable drawable) {
        Paint paint = new Paint();
        this.f29182b = paint;
        paint.setAntiAlias(true);
        this.f29182b.setColor(-16711936);
        this.f29181a = drawable;
        setPorterDuffMode(PorterDuff.Mode.SRC_IN);
    }

    private void b() {
        Canvas canvas;
        d();
        Path clipPath = getClipPath(getLevel());
        if (clipPath == null || (canvas = this.e) == null) {
            Log.e(g, "getClipPath fail.");
        } else {
            canvas.drawPath(clipPath, this.f29182b);
        }
    }

    private void c() {
        Rect bounds = getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        Bitmap bitmap = this.f29183c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f29183c = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f29183c);
        this.f29181a.setBounds(bounds);
        int level = this.f29181a.getLevel();
        this.f29181a.setLevel(10000);
        this.f29181a.draw(canvas);
        this.f29181a.setLevel(level);
    }

    private void d() {
        Rect bounds = getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.d = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
        this.e = new Canvas(this.d);
    }

    @Override // android.graphics.drawable.ClipDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        a();
        b();
        if (this.f29183c == null || this.d == null) {
            return;
        }
        Rect bounds = getBounds();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, bounds.width(), bounds.height(), null);
        canvas.drawBitmap(this.d, 0.0f, 0.0f, this.f29182b);
        this.f29182b.setXfermode(this.f);
        canvas.drawBitmap(this.f29183c, 0.0f, 0.0f, this.f29182b);
        this.f29182b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    protected abstract Path getClipPath(int i);

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f29181a.setBounds(i, i2, i3, i4);
        if (this.f29183c != null) {
            c();
        }
        if (this.d != null) {
            d();
            Path clipPath = getClipPath(getLevel());
            if (clipPath != null) {
                this.e.drawPath(clipPath, this.f29182b);
            } else {
                Log.e(g, "getClipPath fail.");
            }
        }
    }

    public void setEclipseInsideColor(int i) {
        this.f29182b.setColor(i);
    }

    public void setPorterDuffMode(PorterDuff.Mode mode) {
        this.f = new PorterDuffXfermode(mode);
    }

    private void a() {
        if (this.f29183c != null) {
            return;
        }
        c();
    }
}
