package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.highlight.Range;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"ParcelCreator"})
public class BarEntry extends Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private Range[] mRanges;
    private float[] mYVals;

    public BarEntry(float f14, float[] fArr) {
        super(f14, calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    private void calcPosNegSum() {
        float[] fArr = this.mYVals;
        if (fArr == null) {
            this.mNegativeSum = 0.0f;
            this.mPositiveSum = 0.0f;
            return;
        }
        float fAbs = 0.0f;
        float f14 = 0.0f;
        for (float f15 : fArr) {
            if (f15 <= 0.0f) {
                fAbs += Math.abs(f15);
            } else {
                f14 += f15;
            }
        }
        this.mNegativeSum = fAbs;
        this.mPositiveSum = f14;
    }

    private static float calcSum(float[] fArr) {
        float f14 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f15 : fArr) {
            f14 += f15;
        }
        return f14;
    }

    public void calcRanges() {
        float[] yVals = getYVals();
        if (yVals == null || yVals.length == 0) {
            return;
        }
        this.mRanges = new Range[yVals.length];
        float f14 = -getNegativeSum();
        int i14 = 0;
        float f15 = 0.0f;
        while (true) {
            Range[] rangeArr = this.mRanges;
            if (i14 >= rangeArr.length) {
                return;
            }
            float f16 = yVals[i14];
            if (f16 < 0.0f) {
                float f17 = f14 - f16;
                rangeArr[i14] = new Range(f14, f17);
                f14 = f17;
            } else {
                float f18 = f16 + f15;
                rangeArr[i14] = new Range(f15, f18);
                f15 = f18;
            }
            i14++;
        }
    }

    @Override // com.github.mikephil.charting.data.Entry
    public BarEntry copy() {
        BarEntry barEntry = new BarEntry(getX(), getY(), getData());
        barEntry.setVals(this.mYVals);
        return barEntry;
    }

    @Deprecated
    public float getBelowSum(int i14) {
        return getSumBelow(i14);
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    public Range[] getRanges() {
        return this.mRanges;
    }

    public float getSumBelow(int i14) {
        float[] fArr = this.mYVals;
        float f14 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i14 && length >= 0; length--) {
            f14 += this.mYVals[length];
        }
        return f14;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public float[] getYVals() {
        return this.mYVals;
    }

    public boolean isStacked() {
        return this.mYVals != null;
    }

    public void setVals(float[] fArr) {
        setY(calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f14, float f15, Object obj) {
        super(f14, f15, obj);
    }

    public BarEntry(float f14, float f15, Drawable drawable) {
        super(f14, f15, drawable);
    }

    public BarEntry(float f14, float f15, Drawable drawable, Object obj) {
        super(f14, f15, drawable, obj);
    }

    public BarEntry(float f14, float f15) {
        super(f14, f15);
    }

    public BarEntry(float f14, float[] fArr, Object obj) {
        super(f14, calcSum(fArr), obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f14, float[] fArr, Drawable drawable) {
        super(f14, calcSum(fArr), drawable);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f14, float[] fArr, Drawable drawable, Object obj) {
        super(f14, calcSum(fArr), drawable, obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }
}
