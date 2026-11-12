package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f11200a;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i14) {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.setLevel(i14) : super.onLevelChange(i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i14);
        } else {
            super.setChangingConfigurations(i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i14, PorterDuff.Mode mode) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setColorFilter(i14, mode);
        } else {
            super.setColorFilter(i14, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setFilterBitmap(z14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f14, float f15) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setHotspot(f14, f15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i14, int i15, int i16, int i17) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setHotspotBounds(i14, i15, i16, i17);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
