package com.garmin.android.apps.connectmobile.util.simplecropimage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import b7.g;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47330c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Rect f47332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RectF f47333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f47334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f47335h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f47337j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f47339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f47340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f47341n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f47331d = a.None;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47336i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f47338k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f47342o = new Paint();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f47343p = new Paint();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f47344q = new Paint();

    public enum a {
        None,
        Move,
        Grow
    }

    public b(View view2) {
        this.f47328a = view2;
    }

    public final Rect a() {
        RectF rectF = this.f47334g;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.f47335h.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }

    public final int b(float f14, float f15) {
        Rect rectA = a();
        if (this.f47338k) {
            float fCenterX = f14 - rectA.centerX();
            float fCenterY = f15 - rectA.centerY();
            int iSqrt = (int) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
            int iWidth = this.f47332e.width() / 2;
            if (Math.abs(iSqrt - iWidth) > 20.0f) {
                return iSqrt < iWidth ? 32 : 1;
            }
            if (Math.abs(fCenterY) > Math.abs(fCenterX)) {
                return fCenterY < 0.0f ? 8 : 16;
            }
            return fCenterX < 0.0f ? 2 : 4;
        }
        boolean z14 = false;
        boolean z15 = f15 >= ((float) rectA.top) - 20.0f && f15 < ((float) rectA.bottom) + 20.0f;
        float f16 = rectA.left;
        if (f14 >= f16 - 20.0f && f14 < rectA.right + 20.0f) {
            z14 = true;
        }
        int i14 = (Math.abs(f16 - f14) >= 20.0f || !z15) ? 1 : 3;
        if (Math.abs(rectA.right - f14) < 20.0f && z15) {
            i14 |= 4;
        }
        if (Math.abs(rectA.top - f15) < 20.0f && z14) {
            i14 |= 8;
        }
        if (Math.abs(rectA.bottom - f15) < 20.0f && z14) {
            i14 |= 16;
        }
        if (i14 == 1 && rectA.contains((int) f14, (int) f15)) {
            return 32;
        }
        return i14;
    }

    public final void c(Matrix matrix, Rect rect, RectF rectF, boolean z14, boolean z15) {
        if (z14) {
            z15 = true;
        }
        this.f47335h = new Matrix(matrix);
        this.f47334g = rectF;
        this.f47333f = new RectF(rect);
        this.f47336i = z15;
        this.f47338k = z14;
        this.f47337j = this.f47334g.width() / this.f47334g.height();
        this.f47332e = a();
        this.f47342o.setARGB(125, 50, 50, 50);
        this.f47343p.setARGB(125, 50, 50, 50);
        Paint paint = this.f47344q;
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.f47331d = a.None;
        Resources resources = this.f47328a.getResources();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        this.f47339l = resources.getDrawable(R.drawable.camera_crop_width, null);
        this.f47340m = resources.getDrawable(R.drawable.camera_crop_height, null);
        this.f47341n = resources.getDrawable(R.drawable.indicator_autocrop, null);
    }
}
