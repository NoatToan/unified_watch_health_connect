package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.garmin.android.apps.connectmobile.R;
import j20.x;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f101910m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f101911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f101913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f101914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f101915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f101916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f101917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f101918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f101919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f101920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f101921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f101922l;

    public b(Context context) {
        Paint paint = new Paint();
        this.f101911a = paint;
        this.f101917g = new Path();
        this.f101919i = false;
        this.f101922l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, h.a.f80434n, R.attr.drawerArrowStyle, 2132148467);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f101921k = (float) (Math.cos(f101910m) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f101916f != z14) {
            this.f101916f = z14;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f101915e) {
            this.f101915e = fRound;
            invalidateSelf();
        }
        this.f101918h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f101913c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f101912b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f101914d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f14, float f15, float f16) {
        return x.a(f15, f14, f16, f14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z14 = false;
        int i14 = this.f101922l;
        if (i14 != 0 && (i14 == 1 || (i14 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z14 = true;
        }
        float f14 = this.f101912b;
        float fSqrt = (float) Math.sqrt(f14 * f14 * 2.0f);
        float f15 = this.f101920j;
        float f16 = this.f101913c;
        float fA = a(f16, fSqrt, f15);
        float fA2 = a(f16, this.f101914d, this.f101920j);
        float fRound = Math.round(a(0.0f, this.f101921k, this.f101920j));
        float fA3 = a(0.0f, f101910m, this.f101920j);
        float fA4 = a(z14 ? 0.0f : -180.0f, z14 ? 180.0f : 0.0f, this.f101920j);
        double d14 = fA;
        double d15 = fA3;
        float fRound2 = Math.round(Math.cos(d15) * d14);
        float fRound3 = Math.round(Math.sin(d15) * d14);
        Path path = this.f101917g;
        path.rewind();
        float f17 = this.f101915e;
        Paint paint = this.f101911a;
        float fA5 = a(f17 + paint.getStrokeWidth(), -this.f101921k, this.f101920j);
        float f18 = (-fA2) / 2.0f;
        path.moveTo(f18 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f18, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f18, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f19 = this.f101915e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f19 + ((((int) (fHeight - (f19 * 2.0f))) / 4) * 2));
        if (this.f101916f) {
            canvas.rotate(fA4 * (this.f101919i ^ z14 ? -1 : 1));
        } else if (z14) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f101918h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f101918h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        Paint paint = this.f101911a;
        if (i14 != paint.getAlpha()) {
            paint.setAlpha(i14);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f101911a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f14) {
        if (this.f101920j != f14) {
            this.f101920j = f14;
            invalidateSelf();
        }
    }
}
