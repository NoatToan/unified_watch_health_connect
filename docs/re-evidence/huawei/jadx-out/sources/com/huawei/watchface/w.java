package com.huawei.watchface;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public abstract class w {
    public static final double s = Math.sin(Math.toRadians(30.100000381469727d));
    public static final double t = Math.cos(Math.toRadians(30.100000381469727d));
    public static final float[] u = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public static final float[] v = {-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f30632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Canvas f30633b;
    public int e;
    public int g;
    public Bitmap k;
    public BitmapShader o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Path f30634c = new Path();
    public float d = 233.0f;
    public Paint f = new Paint(1);
    public RectF h = new RectF();
    public float i = 0.0f;
    public RectF j = new RectF();
    public Point l = new Point(233, 233);
    public boolean m = true;
    public Matrix n = new Matrix();
    public float p = 0.0f;
    public float q = 0.0f;
    public float r = 0.0f;

    public w(Bitmap bitmap) {
        Bitmap bitmap2 = (Bitmap) Objects.requireNonNull(bitmap);
        this.k = bitmap2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.o = new BitmapShader(bitmap2, tileMode, tileMode);
        this.e = Math.min(bitmap.getHeight(), bitmap.getWidth());
        this.f30632a = Bitmap.createBitmap(466, 466, Bitmap.Config.ARGB_8888);
        this.f30633b = new Canvas(this.f30632a);
        RectF rectF = new RectF(0.0f, 0.0f, 466.0f, 466.0f);
        this.f30634c.reset();
        this.f30634c.addArc(rectF, 0.0f, 360.0f);
        this.f30634c.lineTo(233.0f, 233.0f);
        this.f30633b.clipPath(this.f30634c);
        o2.b().b(this.e);
    }

    public void a(Point point) {
        RectF rectF = this.h;
        int i = point.y;
        int i2 = this.g;
        rectF.top = i - i2;
        int i3 = point.x;
        rectF.left = i3 - i2;
        rectF.bottom = i + i2;
        rectF.right = i3 + i2;
        this.f30634c.reset();
        this.f30634c.addArc(this.h, this.i, 30.1f);
        this.f30634c.lineTo(point.x, point.y);
    }

    public void b() {
        Point pointA = o2.b().a();
        this.i = o2.b().c();
        if (!this.m && this.l.equals(pointA)) {
            HwLog.d("BasePatternKaleidoscopeView", "don't need to update.");
            return;
        }
        if (this.k == null) {
            HwLog.w("BasePatternKaleidoscopeView", "updateDestBitmap:mSrcBitmap is null.");
            return;
        }
        this.m = false;
        Point point = this.l;
        point.x = pointA.x;
        point.y = pointA.y;
        a(point);
    }

    public void a(Bitmap bitmap, Canvas canvas, Paint paint, int i) {
        if (bitmap != null && canvas != null && paint != null) {
            this.n.reset();
            this.n.setValues(u);
            float f = i;
            this.n.postTranslate(0.0f, f);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, f, f / 2.0f);
            canvas.drawBitmap(bitmap, this.n, paint);
            canvas.restore();
            return;
        }
        HwLog.e("BasePatternKaleidoscopeView", "matrixSymmetricX params is null");
    }

    public void b(Bitmap bitmap, Canvas canvas, Paint paint, int i) {
        if (bitmap != null && canvas != null && paint != null) {
            this.n.reset();
            this.n.setValues(v);
            float f = i;
            this.n.postTranslate(f, 0.0f);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, f / 2.0f, f);
            canvas.drawBitmap(bitmap, this.n, paint);
            canvas.restore();
            return;
        }
        HwLog.e("BasePatternKaleidoscopeView", "matrixSymmetricY params is null");
    }

    public final void a(Bitmap bitmap, Canvas canvas, Paint paint, int i, int i2) {
        if (bitmap != null && canvas != null && paint != null) {
            float f = i;
            float f2 = f / 2.0f;
            this.p = f2;
            this.q = f2 - 1.0f;
            this.r = (i - i2) / 2.0f;
            this.j.set(-2.0f, -1.0f, f, i + 1);
            for (int i3 = -60; i3 <= 60; i3 += 60) {
                canvas.save();
                float f3 = this.p;
                canvas.rotate(i3, f3, f3);
                this.f30634c.reset();
                this.f30634c.addArc(this.j, -30.1f, 60.2f);
                this.f30634c.lineTo(this.q, this.p);
                canvas.clipPath(this.f30634c);
                canvas.drawBitmap(bitmap, this.q, this.r, paint);
                canvas.restore();
            }
            return;
        }
        HwLog.e("BasePatternKaleidoscopeView", "matrixRotateBitmap params is null");
    }

    public Bitmap a(Path path, Canvas canvas, Bitmap bitmap, Canvas canvas2, Bitmap bitmap2) {
        if (CommonUtils.a("BasePatternKaleidoscopeView", path, canvas, bitmap, bitmap2, canvas2)) {
            HwLog.e("BasePatternKaleidoscopeView", "getInterceptedAndSpliceBitmapByPath params is null");
            return this.k;
        }
        this.f.reset();
        this.f.setAntiAlias(true);
        a(path, canvas, bitmap, bitmap.getHeight());
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas2.setBitmap(bitmap2);
        a(bitmap, canvas2, this.f, bitmap2.getHeight(), bitmap.getHeight());
        b(bitmap2, canvas2, this.f, bitmap2.getHeight());
        return bitmap2;
    }

    public final void a(Path path, Canvas canvas, Bitmap bitmap, int i) {
        this.f.reset();
        this.f.setAntiAlias(true);
        this.f.setShader(this.o);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.setBitmap(bitmap);
        canvas.save();
        float f = i / 2.0f;
        canvas.rotate(-this.i, 0.0f, f);
        Point point = this.l;
        canvas.translate(-point.x, f - point.y);
        canvas.drawPath(path, this.f);
        canvas.restore();
        a(bitmap, canvas, this.f, i);
    }

    public Bitmap a() {
        return this.f30632a;
    }
}
