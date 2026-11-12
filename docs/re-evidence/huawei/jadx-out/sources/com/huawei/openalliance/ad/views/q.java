package com.huawei.openalliance.ad.views;

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
import com.huawei.openalliance.ad.utils.dk;

/* JADX INFO: loaded from: classes12.dex */
public abstract class q extends ClipDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f21326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f21327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f21328c;
    private Bitmap d;
    private Canvas e;
    private PorterDuffXfermode f;
    private boolean g;

    protected abstract Path a(int i);

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f21326a.setBounds(i, i2, i3, i4);
        if (this.f21328c != null) {
            b();
        }
        if (this.d != null) {
            c();
            Path pathA = a(getLevel());
            if (pathA != null) {
                this.e.drawPath(pathA, this.f21327b);
            } else {
                Log.e("HwEclipseClipDrawable", "getClipPath fail.");
            }
        }
    }

    @Override // android.graphics.drawable.ClipDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        a();
        d();
        if (this.f21328c == null || this.d == null) {
            return;
        }
        Rect bounds = getBounds();
        if (this.g) {
            canvas.scale(-1.0f, 1.0f, bounds.width() / 2.0f, bounds.height() / 2.0f);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, bounds.width(), bounds.height(), null);
        canvas.drawBitmap(this.d, 0.0f, 0.0f, this.f21327b);
        this.f21327b.setXfermode(this.f);
        canvas.drawBitmap(this.f21328c, 0.0f, 0.0f, this.f21327b);
        this.f21327b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void a(PorterDuff.Mode mode) {
        this.f = new PorterDuffXfermode(mode);
    }

    private void d() {
        Canvas canvas;
        c();
        Path pathA = a(getLevel());
        if (pathA == null || (canvas = this.e) == null) {
            Log.e("HwEclipseClipDrawable", "getClipPath fail.");
        } else {
            canvas.drawPath(pathA, this.f21327b);
        }
    }

    private void c() {
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

    private void b() {
        Rect bounds = getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        Bitmap bitmap = this.f21328c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f21328c = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f21328c);
        this.f21326a.setBounds(bounds);
        int level = this.f21326a.getLevel();
        this.f21326a.setLevel(10000);
        this.f21326a.draw(canvas);
        this.f21326a.setLevel(level);
    }

    private void a(Drawable drawable) {
        Paint paint = new Paint();
        this.f21327b = paint;
        paint.setAntiAlias(true);
        this.f21327b.setColor(-16711936);
        this.f21326a = drawable;
        a(PorterDuff.Mode.SRC_IN);
        this.g = dk.h();
    }

    private void a() {
        if (this.f21328c != null) {
            return;
        }
        b();
    }

    public q(Drawable drawable, int i, int i2) {
        super(drawable, i, i2);
        a(drawable);
    }
}
