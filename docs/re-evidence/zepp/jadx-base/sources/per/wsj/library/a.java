package per.wsj.library;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes23.dex */
abstract class a extends Drawable {
    private ColorFilter b;
    private ColorStateList c;
    private PorterDuffColorFilter e;
    public int a = 255;
    private PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;
    private b f = new b();

    public class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return a.this;
        }
    }

    private boolean a() {
        ColorStateList colorStateList = this.c;
        if (colorStateList != null && this.d != null) {
            this.e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.d);
            return true;
        }
        boolean z = this.e != null;
        this.e = null;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        onDraw(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.b;
    }

    public ColorFilter getColorFilterForDrawing() {
        ColorFilter colorFilter = this.b;
        return colorFilter != null ? colorFilter : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    public abstract void onDraw(Canvas canvas, int width, int height);

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        return a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (this.a != alpha) {
            this.a = alpha;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.b = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int tintColor) {
        setTintList(ColorStateList.valueOf(tintColor));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList tint) {
        this.c = tint;
        if (a()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode tintMode) {
        this.d = tintMode;
        if (a()) {
            invalidateSelf();
        }
    }
}
