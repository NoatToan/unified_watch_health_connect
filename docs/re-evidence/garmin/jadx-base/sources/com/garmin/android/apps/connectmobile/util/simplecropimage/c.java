package com.garmin.android.apps.connectmobile.util.simplecropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import l0.e;
import n22.d;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends AppCompatImageView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f47349o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f47350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f47351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f47352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f47353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f47354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f47357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f47359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f47360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f47361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f47362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f47363n;

    public interface a {
    }

    public c(Context context) {
        super(context);
        this.f47350a = new Matrix();
        this.f47351b = new Matrix();
        this.f47352c = new Matrix();
        this.f47353d = new float[9];
        this.f47354e = new d(null);
        this.f47355f = -1;
        this.f47356g = -1;
        this.f47362m = new Handler();
        this.f47363n = null;
        e();
    }

    public final void c() {
        float height;
        d dVar = this.f47354e;
        if (dVar.f122377a == null) {
            return;
        }
        Matrix imageViewMatrix = getImageViewMatrix();
        float f14 = 0.0f;
        RectF rectF = new RectF(0.0f, 0.0f, dVar.f122377a.getWidth(), dVar.f122377a.getHeight());
        imageViewMatrix.mapRect(rectF);
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float height2 = getHeight();
        float f15 = rectF.top;
        if (fHeight < height2) {
            height = ((height2 - fHeight) / 2.0f) - f15;
        } else if (f15 > 0.0f) {
            height = -f15;
        } else {
            height = rectF.bottom < height2 ? getHeight() - rectF.bottom : 0.0f;
        }
        float width = getWidth();
        float f16 = rectF.left;
        if (fWidth < width) {
            f14 = ((width - fWidth) / 2.0f) - f16;
        } else if (f16 > 0.0f) {
            f14 = -f16;
        } else {
            float f17 = rectF.right;
            if (f17 < width) {
                f14 = width - f17;
            }
        }
        postTranslate(f14, height);
        setImageMatrix(getImageViewMatrix());
    }

    public final void d(d dVar, Matrix matrix) {
        float width = getWidth();
        float height = getHeight();
        boolean z14 = (dVar.f122378b / 90) % 2 != 0;
        Bitmap bitmap = dVar.f122377a;
        float height2 = z14 ? bitmap.getHeight() : bitmap.getWidth();
        boolean z15 = (dVar.f122378b / 90) % 2 != 0;
        Bitmap bitmap2 = dVar.f122377a;
        float width2 = z15 ? bitmap2.getWidth() : bitmap2.getHeight();
        matrix.reset();
        float fMin = Math.min(Math.min(width / height2, 2.0f), Math.min(height / width2, 2.0f));
        Matrix matrix2 = new Matrix();
        if (dVar.f122378b != 0) {
            matrix2.preTranslate(-(dVar.f122377a.getWidth() / 2), -(dVar.f122377a.getHeight() / 2));
            matrix2.postRotate(dVar.f122378b);
            boolean z16 = (dVar.f122378b / 90) % 2 != 0;
            Bitmap bitmap3 = dVar.f122377a;
            float height3 = (z16 ? bitmap3.getHeight() : bitmap3.getWidth()) / 2;
            boolean z17 = (dVar.f122378b / 90) % 2 != 0;
            Bitmap bitmap4 = dVar.f122377a;
            matrix2.postTranslate(height3, (z17 ? bitmap4.getWidth() : bitmap4.getHeight()) / 2);
        }
        matrix.postConcat(matrix2);
        matrix.postScale(fMin, fMin);
        matrix.postTranslate((width - (height2 * fMin)) / 2.0f, hb.a.c(width2, fMin, height, 2.0f));
    }

    public final void e() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void f(d dVar) {
        float fMax;
        if (getWidth() <= 0) {
            this.f47363n = new e(14, this, dVar);
            return;
        }
        Bitmap bitmap = dVar.f122377a;
        d dVar2 = this.f47354e;
        Matrix matrix = this.f47350a;
        if (bitmap != null) {
            d(dVar, matrix);
            Bitmap bitmap2 = dVar.f122377a;
            int i14 = dVar.f122378b;
            super.setImageBitmap(bitmap2);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setDither(true);
            }
            Bitmap bitmap3 = dVar2.f122377a;
            dVar2.f122377a = bitmap2;
            dVar2.f122378b = i14;
        } else {
            matrix.reset();
            setImageBitmap(null);
        }
        this.f47351b.reset();
        setImageMatrix(getImageViewMatrix());
        Bitmap bitmap4 = dVar2.f122377a;
        if (bitmap4 == null) {
            fMax = 1.0f;
        } else {
            float height = ((dVar2.f122378b / 90) % 2 != 0 ? bitmap4.getHeight() : bitmap4.getWidth()) / this.f47355f;
            boolean z14 = (dVar2.f122378b / 90) % 2 != 0;
            Bitmap bitmap5 = dVar2.f122377a;
            fMax = Math.max(height, (z14 ? bitmap5.getWidth() : bitmap5.getHeight()) / this.f47356g) * 4.0f;
        }
        this.f47357h = fMax;
    }

    public void g(float f14, float f15, float f16) {
        float f17 = this.f47357h;
        if (f14 > f17) {
            f14 = f17;
        }
        float scale = f14 / getScale();
        this.f47351b.postScale(scale, scale, f15, f16);
        setImageMatrix(getImageViewMatrix());
        c();
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.f47350a;
        Matrix matrix2 = this.f47352c;
        matrix2.set(matrix);
        matrix2.postConcat(this.f47351b);
        return matrix2;
    }

    public float getScale() {
        Matrix matrix = this.f47351b;
        float[] fArr = this.f47353d;
        matrix.getValues(fArr);
        return fArr[0];
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i14, KeyEvent keyEvent) {
        if (i14 != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i14, keyEvent);
        }
        g(1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        return true;
    }

    @Override // android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) throws Exception {
        super.onLayout(z14, i14, i15, i16, i17);
        this.f47358i = i14;
        this.f47359j = i16;
        this.f47360k = i15;
        this.f47361l = i17;
        this.f47355f = i16 - i14;
        this.f47356g = i17 - i15;
        e eVar = this.f47363n;
        if (eVar != null) {
            this.f47363n = null;
            eVar.run();
        }
        d dVar = this.f47354e;
        if (dVar.f122377a != null) {
            d(dVar, this.f47350a);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void postTranslate(float f14, float f15) {
        this.f47351b.postTranslate(f14, f15);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        d dVar = this.f47354e;
        Bitmap bitmap2 = dVar.f122377a;
        dVar.f122377a = bitmap;
        dVar.f122378b = 0;
    }

    public void setRecycler(a aVar) {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47350a = new Matrix();
        this.f47351b = new Matrix();
        this.f47352c = new Matrix();
        this.f47353d = new float[9];
        this.f47354e = new d(null);
        this.f47355f = -1;
        this.f47356g = -1;
        this.f47362m = new Handler();
        this.f47363n = null;
        e();
    }
}
