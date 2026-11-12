package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;

/* JADX INFO: loaded from: classes13.dex */
public class Highlight {
    private YAxis.AxisDependency axis;
    private int mDataIndex;
    private int mDataSetIndex;
    private float mDrawX;
    private float mDrawY;
    private int mStackIndex;
    private float mX;
    private float mXPx;
    private float mY;
    private float mYPx;

    public Highlight(float f14, float f15, float f16, float f17, int i14, YAxis.AxisDependency axisDependency) {
        this.mDataIndex = -1;
        this.mStackIndex = -1;
        this.mX = f14;
        this.mY = f15;
        this.mXPx = f16;
        this.mYPx = f17;
        this.mDataSetIndex = i14;
        this.axis = axisDependency;
    }

    public boolean equalTo(Highlight highlight) {
        return highlight != null && this.mDataSetIndex == highlight.mDataSetIndex && this.mX == highlight.mX && this.mStackIndex == highlight.mStackIndex && this.mDataIndex == highlight.mDataIndex;
    }

    public YAxis.AxisDependency getAxis() {
        return this.axis;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public int getDataSetIndex() {
        return this.mDataSetIndex;
    }

    public float getDrawX() {
        return this.mDrawX;
    }

    public float getDrawY() {
        return this.mDrawY;
    }

    public int getStackIndex() {
        return this.mStackIndex;
    }

    public float getX() {
        return this.mX;
    }

    public float getXPx() {
        return this.mXPx;
    }

    public float getY() {
        return this.mY;
    }

    public float getYPx() {
        return this.mYPx;
    }

    public boolean isStacked() {
        return this.mStackIndex >= 0;
    }

    public void setDataIndex(int i14) {
        this.mDataIndex = i14;
    }

    public void setDraw(float f14, float f15) {
        this.mDrawX = f14;
        this.mDrawY = f15;
    }

    public String toString() {
        return "Highlight, x: " + this.mX + ", y: " + this.mY + ", dataSetIndex: " + this.mDataSetIndex + ", stackIndex (only stacked barentry): " + this.mStackIndex;
    }

    public Highlight(float f14, int i14, int i15) {
        this(f14, Float.NaN, i14);
        this.mStackIndex = i15;
    }

    public Highlight(float f14, float f15, int i14) {
        this.mDataIndex = -1;
        this.mStackIndex = -1;
        this.mX = f14;
        this.mY = f15;
        this.mDataSetIndex = i14;
    }

    public Highlight(float f14, float f15, float f16, float f17, int i14, int i15, YAxis.AxisDependency axisDependency) {
        this(f14, f15, f16, f17, i14, axisDependency);
        this.mStackIndex = i15;
    }
}
