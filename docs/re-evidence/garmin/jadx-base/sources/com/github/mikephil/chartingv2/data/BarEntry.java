package com.github.mikephil.chartingv2.data;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BarEntry extends Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private float[] mVals;

    public BarEntry(float[] fArr, int i14) {
        super(calcSum(fArr), i14);
        this.mVals = fArr;
        calcPosNegSum();
    }

    private void calcPosNegSum() {
        float[] fArr = this.mVals;
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

    @Override // com.github.mikephil.chartingv2.data.Entry
    public BarEntry copy() {
        BarEntry barEntry = new BarEntry(getVal(), getXIndex(), getData());
        barEntry.setVals(this.mVals);
        return barEntry;
    }

    public float getBelowSum(int i14) {
        float[] fArr = this.mVals;
        float f14 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i14 && length >= 0; length--) {
            f14 += this.mVals[length];
        }
        return f14;
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    @Override // com.github.mikephil.chartingv2.data.Entry
    public float getVal() {
        return super.getVal();
    }

    public float[] getVals() {
        return this.mVals;
    }

    public boolean isStacked() {
        return this.mVals != null;
    }

    public void setVals(float[] fArr) {
        setVal(calcSum(fArr));
        this.mVals = fArr;
        calcPosNegSum();
    }

    public BarEntry(float f14, int i14) {
        super(f14, i14);
    }

    public BarEntry(float[] fArr, int i14, String str) {
        super(calcSum(fArr), i14, str);
        this.mVals = fArr;
        calcPosNegSum();
    }

    public BarEntry(float f14, int i14, Object obj) {
        super(f14, i14, obj);
    }
}
