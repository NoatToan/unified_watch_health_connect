package per.wsj.library;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class TileDrawable extends a {
    private Drawable g;
    private int h = -1;

    public TileDrawable(Drawable drawable) {
        this.g = drawable;
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    public Drawable getDrawable() {
        return this.g;
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public int getTileCount() {
        return this.h;
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.g = this.g.mutate();
        return this;
    }

    @Override // per.wsj.library.a
    public void onDraw(Canvas canvas, int width, int height) {
        this.g.setAlpha(this.a);
        ColorFilter colorFilterForDrawing = getColorFilterForDrawing();
        if (colorFilterForDrawing != null) {
            this.g.setColorFilter(colorFilterForDrawing);
        }
        int intrinsicHeight = this.g.getIntrinsicHeight();
        float f = height / intrinsicHeight;
        canvas.scale(f, f);
        float f2 = width / f;
        int i = this.h;
        if (i < 0) {
            int intrinsicWidth = this.g.getIntrinsicWidth();
            int i2 = 0;
            while (i2 < f2) {
                int i3 = i2 + intrinsicWidth;
                this.g.setBounds(i2, 0, i3, intrinsicHeight);
                this.g.draw(canvas);
                i2 = i3;
            }
            return;
        }
        float f3 = f2 / i;
        for (int i4 = 0; i4 < this.h; i4++) {
            float f4 = (i4 + 0.5f) * f3;
            float intrinsicWidth2 = this.g.getIntrinsicWidth() / 2.0f;
            this.g.setBounds(Math.round(f4 - intrinsicWidth2), 0, Math.round(f4 + intrinsicWidth2), intrinsicHeight);
            this.g.draw(canvas);
        }
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int alpha) {
        super.setAlpha(alpha);
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setTileCount(int tileCount) {
        this.h = tileCount;
        invalidateSelf();
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTint(@ColorInt int tintColor) {
        super.setTint(tintColor);
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(@Nullable ColorStateList tint) {
        super.setTintList(tint);
    }

    @Override // per.wsj.library.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode tintMode) {
        super.setTintMode(tintMode);
    }
}
