package com.huami.watch.companion.ui.view;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;

/* JADX INFO: loaded from: classes16.dex */
public class ShapeHolder {
    private ShapeDrawable c;
    private int d;
    private Paint f;
    private float a = 0.0f;
    private float b = 0.0f;
    private float e = 1.0f;

    public ShapeHolder(ShapeDrawable shapeDrawable) {
        this.c = shapeDrawable;
    }

    public int getColor() {
        return this.d;
    }

    public float getHeight() {
        return this.c.getShape().getHeight();
    }

    public Paint getPaint() {
        return this.f;
    }

    public ShapeDrawable getShape() {
        return this.c;
    }

    public float getWidth() {
        return this.c.getShape().getWidth();
    }

    public float getX() {
        return this.a;
    }

    public float getY() {
        return this.b;
    }

    public void resizeShape(float f, float f2) {
        this.c.getShape().resize(f, f2);
    }

    public void setAlpha(float f) {
        this.e = f;
        this.c.setAlpha((int) ((f * 255.0f) + 0.5f));
    }

    public void setColor(int i) {
        this.c.getPaint().setColor(i);
        this.d = i;
    }

    public void setHeight(float f) {
        Shape shape = this.c.getShape();
        shape.resize(shape.getWidth(), f);
    }

    public void setPaint(Paint paint) {
        this.f = paint;
    }

    public void setShape(ShapeDrawable shapeDrawable) {
        this.c = shapeDrawable;
    }

    public void setWidth(float f) {
        Shape shape = this.c.getShape();
        shape.resize(f, shape.getHeight());
    }

    public void setX(float f) {
        this.a = f;
    }

    public void setY(float f) {
        this.b = f;
    }
}
