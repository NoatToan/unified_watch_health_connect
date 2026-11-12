package com.google.android.material.circularreveal;

import am.j;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;
    private boolean buildingCircularRevealCache;
    private Paint debugPaint;
    private final Delegate delegate;
    private boolean hasCircularRevealCache;
    private Drawable overlayDrawable;
    private CircularRevealWidget.RevealInfo revealInfo;
    private final Paint revealPaint;
    private final Path revealPath;
    private final Paint scrimPaint;

    /* JADX INFO: renamed from: view, reason: collision with root package name */
    private final View f53172view;

    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(Delegate delegate) {
        this.delegate = delegate;
        View view2 = (View) delegate;
        this.f53172view = view2;
        view2.setWillNotDraw(false);
        this.revealPath = new Path();
        this.revealPaint = new Paint(7);
        Paint paint = new Paint(1);
        this.scrimPaint = paint;
        paint.setColor(0);
    }

    private void drawDebugCircle(Canvas canvas, int i14, float f14) {
        this.debugPaint.setColor(i14);
        this.debugPaint.setStrokeWidth(f14);
        CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
        canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius - (f14 / 2.0f), this.debugPaint);
    }

    private void drawDebugMode(Canvas canvas) {
        this.delegate.actualDraw(canvas);
        if (shouldDrawScrim()) {
            CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
            canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, this.scrimPaint);
        }
        if (shouldDrawCircularReveal()) {
            drawDebugCircle(canvas, -16777216, 10.0f);
            drawDebugCircle(canvas, -65536, 5.0f);
        }
        drawOverlayDrawable(canvas);
    }

    private void drawOverlayDrawable(Canvas canvas) {
        if (shouldDrawOverlayDrawable()) {
            Rect bounds = this.overlayDrawable.getBounds();
            float fWidth = this.revealInfo.centerX - (bounds.width() / 2.0f);
            float fHeight = this.revealInfo.centerY - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.overlayDrawable.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float getDistanceToFurthestCorner(CircularRevealWidget.RevealInfo revealInfo) {
        return MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, this.f53172view.getWidth(), this.f53172view.getHeight());
    }

    private void invalidateRevealInfo() {
        if (STRATEGY == 1) {
            this.revealPath.rewind();
            CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
            if (revealInfo != null) {
                this.revealPath.addCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, Path.Direction.CW);
            }
        }
        this.f53172view.invalidate();
    }

    private boolean shouldDrawCircularReveal() {
        CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
        boolean z14 = revealInfo == null || revealInfo.isInvalid();
        if (STRATEGY == 0) {
            return !z14 && this.hasCircularRevealCache;
        }
        return !z14;
    }

    private boolean shouldDrawOverlayDrawable() {
        return (this.buildingCircularRevealCache || this.overlayDrawable == null || this.revealInfo == null) ? false : true;
    }

    private boolean shouldDrawScrim() {
        return (this.buildingCircularRevealCache || Color.alpha(this.scrimPaint.getColor()) == 0) ? false : true;
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.buildingCircularRevealCache = true;
            this.hasCircularRevealCache = false;
            this.f53172view.buildDrawingCache();
            Bitmap drawingCache = this.f53172view.getDrawingCache();
            if (drawingCache == null && this.f53172view.getWidth() != 0 && this.f53172view.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f53172view.getWidth(), this.f53172view.getHeight(), Bitmap.Config.ARGB_8888);
                this.f53172view.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.revealPaint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.buildingCircularRevealCache = false;
            this.hasCircularRevealCache = true;
        }
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.hasCircularRevealCache = false;
            this.f53172view.destroyDrawingCache();
            this.revealPaint.setShader(null);
            this.f53172view.invalidate();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2;
        if (shouldDrawCircularReveal()) {
            int i14 = STRATEGY;
            if (i14 == 0) {
                canvas2 = canvas;
                CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
                canvas2.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, this.revealPaint);
                if (shouldDrawScrim()) {
                    CircularRevealWidget.RevealInfo revealInfo2 = this.revealInfo;
                    canvas2.drawCircle(revealInfo2.centerX, revealInfo2.centerY, revealInfo2.radius, this.scrimPaint);
                }
            } else if (i14 == 1) {
                canvas2 = canvas;
                int iSave = canvas2.save();
                canvas2.clipPath(this.revealPath);
                this.delegate.actualDraw(canvas2);
                if (shouldDrawScrim()) {
                    canvas2.drawRect(0.0f, 0.0f, this.f53172view.getWidth(), this.f53172view.getHeight(), this.scrimPaint);
                }
                canvas2.restoreToCount(iSave);
            } else {
                if (i14 != 2) {
                    h.z(j.h(i14, "Unsupported strategy "));
                    return;
                }
                this.delegate.actualDraw(canvas);
                if (shouldDrawScrim()) {
                    canvas.drawRect(0.0f, 0.0f, this.f53172view.getWidth(), this.f53172view.getHeight(), this.scrimPaint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
            }
        } else {
            canvas2 = canvas;
            this.delegate.actualDraw(canvas2);
            if (shouldDrawScrim()) {
                canvas2.drawRect(0.0f, 0.0f, this.f53172view.getWidth(), this.f53172view.getHeight(), this.scrimPaint);
            }
        }
        drawOverlayDrawable(canvas2);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.overlayDrawable;
    }

    public int getCircularRevealScrimColor() {
        return this.scrimPaint.getColor();
    }

    public CircularRevealWidget.RevealInfo getRevealInfo() {
        CircularRevealWidget.RevealInfo revealInfo = this.revealInfo;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.isInvalid()) {
            revealInfo2.radius = getDistanceToFurthestCorner(revealInfo2);
        }
        return revealInfo2;
    }

    public boolean isOpaque() {
        return this.delegate.actualIsOpaque() && !shouldDrawCircularReveal();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.overlayDrawable = drawable;
        this.f53172view.invalidate();
    }

    public void setCircularRevealScrimColor(int i14) {
        this.scrimPaint.setColor(i14);
        this.f53172view.invalidate();
    }

    public void setRevealInfo(CircularRevealWidget.RevealInfo revealInfo) {
        if (revealInfo == null) {
            this.revealInfo = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.revealInfo;
            if (revealInfo2 == null) {
                this.revealInfo = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.set(revealInfo);
            }
            if (MathUtils.geq(revealInfo.radius, getDistanceToFurthestCorner(revealInfo), 1.0E-4f)) {
                this.revealInfo.radius = Float.MAX_VALUE;
            }
        }
        invalidateRevealInfo();
    }
}
