package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f6011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f6012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6013e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f6016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f6017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f6018j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6014f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6015g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f6019k = PorterDuff.Mode.SRC_IN;

    public d(ColorStateList colorStateList, float f14) {
        this.f6009a = f14;
        Paint paint = new Paint(5);
        this.f6010b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f6016h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f6016h.getDefaultColor()));
        this.f6011c = new RectF();
        this.f6012d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f14 = rect.left;
        float f15 = rect.top;
        float f16 = rect.right;
        float f17 = rect.bottom;
        RectF rectF = this.f6011c;
        rectF.set(f14, f15, f16, f17);
        Rect rect2 = this.f6012d;
        rect2.set(rect);
        if (this.f6014f) {
            rect2.inset((int) Math.ceil(e.a(this.f6013e, this.f6009a, this.f6015g)), (int) Math.ceil(e.b(this.f6013e, this.f6009a, this.f6015g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z14;
        PorterDuffColorFilter porterDuffColorFilter = this.f6017i;
        Paint paint = this.f6010b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z14 = false;
        } else {
            paint.setColorFilter(this.f6017i);
            z14 = true;
        }
        RectF rectF = this.f6011c;
        float f14 = this.f6009a;
        canvas.drawRoundRect(rectF, f14, f14, paint);
        if (z14) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f6012d, this.f6009a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f6018j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f6016h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f6016h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f6010b;
        boolean z14 = colorForState != paint.getColor();
        if (z14) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f6018j;
        if (colorStateList2 == null || (mode = this.f6019k) == null) {
            return z14;
        }
        this.f6017i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        this.f6010b.setAlpha(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6010b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f6018j = colorStateList;
        this.f6017i = a(colorStateList, this.f6019k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f6019k = mode;
        this.f6017i = a(this.f6018j, mode);
        invalidateSelf();
    }
}
