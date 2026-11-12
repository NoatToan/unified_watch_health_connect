package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes7.dex */
public class DropShadow {
    private int color;

    /* JADX INFO: renamed from: dx, reason: collision with root package name */
    private float f28249dx;

    /* JADX INFO: renamed from: dy, reason: collision with root package name */
    private float f28250dy;
    private float radius;
    private float[] vecs;

    public DropShadow(DropShadow dropShadow) {
        this.radius = 0.0f;
        this.f28249dx = 0.0f;
        this.f28250dy = 0.0f;
        this.color = 0;
        this.radius = dropShadow.radius;
        this.f28249dx = dropShadow.f28249dx;
        this.f28250dy = dropShadow.f28250dy;
        this.color = dropShadow.color;
        this.vecs = null;
    }

    public void applyTo(Paint paint) {
        if (Color.alpha(this.color) > 0) {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.f28249dx, this.f28250dy, this.color);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void applyWithAlpha(int i14, Paint paint) {
        int iMixOpacities = Utils.mixOpacities(Color.alpha(this.color), MiscUtils.clamp(i14, 0, 255));
        if (iMixOpacities <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.f28249dx, this.f28250dy, Color.argb(iMixOpacities, Color.red(this.color), Color.green(this.color), Color.blue(this.color)));
        }
    }

    public int getColor() {
        return this.color;
    }

    public float getDx() {
        return this.f28249dx;
    }

    public float getDy() {
        return this.f28250dy;
    }

    public float getRadius() {
        return this.radius;
    }

    public void multiplyOpacity(int i14) {
        this.color = Color.argb(Math.round((MiscUtils.clamp(i14, 0, 255) * Color.alpha(this.color)) / 255.0f), Color.red(this.color), Color.green(this.color), Color.blue(this.color));
    }

    public boolean sameAs(DropShadow dropShadow) {
        return this.radius == dropShadow.radius && this.f28249dx == dropShadow.f28249dx && this.f28250dy == dropShadow.f28250dy && this.color == dropShadow.color;
    }

    public void setColor(int i14) {
        this.color = i14;
    }

    public void setDx(float f14) {
        this.f28249dx = f14;
    }

    public void setDy(float f14) {
        this.f28250dy = f14;
    }

    public void setRadius(float f14) {
        this.radius = f14;
    }

    public void transformBy(Matrix matrix) {
        if (this.vecs == null) {
            this.vecs = new float[2];
        }
        float[] fArr = this.vecs;
        fArr[0] = this.f28249dx;
        fArr[1] = this.f28250dy;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.vecs;
        this.f28249dx = fArr2[0];
        this.f28250dy = fArr2[1];
        this.radius = matrix.mapRadius(this.radius);
    }

    public void applyTo(OffscreenLayer.ComposeOp composeOp) {
        if (Color.alpha(this.color) > 0) {
            composeOp.shadow = this;
        } else {
            composeOp.shadow = null;
        }
    }

    public DropShadow(float f14, float f15, float f16, int i14) {
        this.radius = f14;
        this.f28249dx = f15;
        this.f28250dy = f16;
        this.color = i14;
        this.vecs = null;
    }

    public DropShadow() {
        this.radius = 0.0f;
        this.f28249dx = 0.0f;
        this.f28250dy = 0.0f;
        this.color = 0;
    }

    public void applyWithAlpha(int i14, OffscreenLayer.ComposeOp composeOp) {
        DropShadow dropShadow = new DropShadow(this);
        composeOp.shadow = dropShadow;
        dropShadow.multiplyOpacity(i14);
    }
}
