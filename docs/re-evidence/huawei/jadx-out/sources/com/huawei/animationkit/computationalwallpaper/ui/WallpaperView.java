package com.huawei.animationkit.computationalwallpaper.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.animationkit.computationalwallpaper.generator.DynamicWallpaper;

/* JADX INFO: loaded from: classes23.dex */
public class WallpaperView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f5167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable.Callback f5168c;
    private WallpaperDrawable d;

    public WallpaperView(Context context) {
        super(context);
        this.f5167b = new Rect();
        this.f5168c = new Drawable.Callback() { // from class: com.huawei.animationkit.computationalwallpaper.ui.WallpaperView.5
            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                WallpaperView.this.invalidate();
            }
        };
    }

    public WallpaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5167b = new Rect();
        this.f5168c = new Drawable.Callback() { // from class: com.huawei.animationkit.computationalwallpaper.ui.WallpaperView.5
            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                WallpaperView.this.invalidate();
            }
        };
    }

    public WallpaperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5167b = new Rect();
        this.f5168c = new Drawable.Callback() { // from class: com.huawei.animationkit.computationalwallpaper.ui.WallpaperView.5
            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                WallpaperView.this.invalidate();
            }
        };
    }

    public void setDrawable(WallpaperDrawable wallpaperDrawable) {
        WallpaperDrawable wallpaperDrawable2 = this.d;
        if (wallpaperDrawable2 != null) {
            wallpaperDrawable2.setCallback(null);
            if (this.d.getWallpaper() instanceof DynamicWallpaper) {
                ((DynamicWallpaper) this.d.getWallpaper()).getPattern().releaseBitmap();
            }
        }
        this.d = wallpaperDrawable;
        wallpaperDrawable.setCallback(this.f5168c);
        if (this.f5167b.width() == 0 || this.f5167b.height() == 0) {
            return;
        }
        this.d.setBounds(this.f5167b);
    }

    public WallpaperDrawable getDrawable() {
        return this.d;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f5167b.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        WallpaperDrawable wallpaperDrawable = this.d;
        if (wallpaperDrawable != null) {
            wallpaperDrawable.setBounds(this.f5167b);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WallpaperDrawable wallpaperDrawable = this.d;
        if (wallpaperDrawable != null) {
            wallpaperDrawable.draw(canvas);
        }
    }
}
