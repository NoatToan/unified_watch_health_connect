package androidx.cardview.widget;

import am.j;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class e extends Drawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double f6020q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f6022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f6023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f6024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f6025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f6027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f6028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f6029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f6030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorStateList f6031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6035o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6036p;

    public e(Resources resources, ColorStateList colorStateList, float f14, float f15, float f16) {
        this.f6032l = true;
        this.f6036p = false;
        this.f6033m = resources.getColor(R.color.cardview_shadow_start_color);
        this.f6034n = resources.getColor(R.color.cardview_shadow_end_color);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        this.f6021a = dimensionPixelSize;
        Paint paint = new Paint(5);
        this.f6022b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f6031k = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f6031k.getDefaultColor()));
        Paint paint2 = new Paint(5);
        this.f6023c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f6026f = (int) (f14 + 0.5f);
        this.f6025e = new RectF();
        Paint paint3 = new Paint(paint2);
        this.f6024d = paint3;
        paint3.setAntiAlias(false);
        if (f15 < 0.0f) {
            j.v(f15, "Invalid shadow size ", ". Must be >= 0");
            throw null;
        }
        if (f16 < 0.0f) {
            j.v(f16, "Invalid max shadow size ", ". Must be >= 0");
            throw null;
        }
        int i14 = (int) (f15 + 0.5f);
        float f17 = i14 % 2 == 1 ? i14 - 1 : i14;
        int i15 = (int) (f16 + 0.5f);
        float f18 = i15 % 2 == 1 ? i15 - 1 : i15;
        if (f17 > f18) {
            if (!this.f6036p) {
                this.f6036p = true;
            }
            f17 = f18;
        }
        if (this.f6030j == f17 && this.f6028h == f18) {
            return;
        }
        this.f6030j = f17;
        this.f6028h = f18;
        this.f6029i = (int) ((f17 * 1.5f) + dimensionPixelSize + 0.5f);
        this.f6032l = true;
        invalidateSelf();
    }

    public static float a(float f14, float f15, boolean z14) {
        if (!z14) {
            return f14;
        }
        return (float) (((1.0d - f6020q) * ((double) f15)) + ((double) f14));
    }

    public static float b(float f14, float f15, boolean z14) {
        if (!z14) {
            return f14 * 1.5f;
        }
        return (float) (((1.0d - f6020q) * ((double) f15)) + ((double) (f14 * 1.5f)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z14;
        boolean z15;
        float f14;
        boolean z16 = this.f6032l;
        float f15 = this.f6029i;
        Paint paint = this.f6023c;
        float f16 = this.f6026f;
        Paint paint2 = this.f6024d;
        RectF rectF = this.f6025e;
        if (z16) {
            Rect bounds = getBounds();
            float f17 = this.f6028h;
            float f18 = 1.5f * f17;
            z15 = true;
            rectF.set(bounds.left + f17, bounds.top + f18, bounds.right - f17, bounds.bottom - f18);
            float f19 = -f16;
            RectF rectF2 = new RectF(f19, f19, f16, f16);
            RectF rectF3 = new RectF(rectF2);
            float f22 = -f15;
            rectF3.inset(f22, f22);
            Path path = this.f6027g;
            if (path == null) {
                this.f6027g = new Path();
            } else {
                path.reset();
            }
            this.f6027g.setFillType(Path.FillType.EVEN_ODD);
            this.f6027g.moveTo(f19, 0.0f);
            this.f6027g.rLineTo(-f15, 0.0f);
            this.f6027g.arcTo(rectF3, 180.0f, 90.0f, false);
            this.f6027g.arcTo(rectF2, 270.0f, -90.0f, false);
            this.f6027g.close();
            int i14 = this.f6033m;
            int i15 = this.f6034n;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f16 + f15, new int[]{i14, i14, i15}, new float[]{0.0f, f16 / (f16 + f15), 1.0f}, tileMode));
            paint2.setShader(new LinearGradient(0.0f, f19 + f15, 0.0f, f19 - f15, new int[]{i14, i14, i15}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
            z14 = false;
            paint2.setAntiAlias(false);
            this.f6032l = false;
        } else {
            z14 = false;
            z15 = true;
        }
        float f24 = this.f6030j;
        canvas.translate(0.0f, f24 / 2.0f);
        float f25 = -f16;
        float f26 = f25 - f15;
        float f27 = (f24 / 2.0f) + f16 + this.f6021a;
        float f28 = f27 * 2.0f;
        boolean z17 = rectF.width() - f28 > 0.0f ? z15 : z14;
        if (rectF.height() - f28 > 0.0f) {
            z14 = z15;
        }
        int iSave = canvas.save();
        canvas.translate(rectF.left + f27, rectF.top + f27);
        canvas.drawPath(this.f6027g, paint);
        if (z17) {
            canvas.drawRect(0.0f, f26, rectF.width() - f28, f25, paint2);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        canvas.translate(rectF.right - f27, rectF.bottom - f27);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f6027g, paint);
        if (z17) {
            canvas.drawRect(0.0f, f26, rectF.width() - f28, f25 + f15, paint2);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(rectF.left + f27, rectF.bottom - f27);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f6027g, paint);
        if (z14) {
            f14 = f25;
            canvas.drawRect(0.0f, f26, rectF.height() - f28, f14, paint2);
        } else {
            f14 = f25;
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(rectF.right - f27, rectF.top + f27);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f6027g, paint);
        if (z14) {
            canvas.drawRect(0.0f, f26, rectF.height() - f28, f14, paint2);
        }
        canvas.restoreToCount(iSave4);
        canvas.translate(0.0f, (-f24) / 2.0f);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f14 = this.f6028h;
        float f15 = this.f6026f;
        boolean z14 = this.f6035o;
        int iCeil = (int) Math.ceil(b(f14, f15, z14));
        int iCeil2 = (int) Math.ceil(a(this.f6028h, f15, z14));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f6031k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6032l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f6031k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f6022b;
        if (paint.getColor() == colorForState) {
            return false;
        }
        paint.setColor(colorForState);
        this.f6032l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        this.f6022b.setAlpha(i14);
        this.f6023c.setAlpha(i14);
        this.f6024d.setAlpha(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6022b.setColorFilter(colorFilter);
    }
}
