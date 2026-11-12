package com.github.mikephil.chartingv2.buffer;

import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class HorizontalBarBuffer extends BarBuffer {
    public HorizontalBarBuffer(int i14, float f14, int i15, boolean z14) {
        super(i14, f14, i15, z14);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.buffer.BarBuffer, com.github.mikephil.chartingv2.buffer.AbstractBuffer
    public void feed(IBarDataSet iBarDataSet) {
        float f14;
        float f15;
        float fAbs;
        float fAbs2;
        float f16;
        float entryCount = iBarDataSet.getEntryCount() * this.phaseX;
        int i14 = this.mDataSetCount - 1;
        float f17 = this.mBarSpace / 2.0f;
        float f18 = this.mGroupSpace / 2.0f;
        int i15 = 0;
        while (i15 < entryCount) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i15);
            float xIndex = (this.mGroupSpace * barEntry.getXIndex()) + (barEntry.getXIndex() * i14) + barEntry.getXIndex() + this.mDataSetIndex + f18;
            float val = barEntry.getVal();
            float[] vals = barEntry.getVals();
            float f19 = 0.0f;
            float f22 = 0.5f;
            if (!this.mContainsStacks || vals == null) {
                f14 = entryCount;
                float f24 = (xIndex - 0.5f) + f17;
                float f25 = (xIndex + 0.5f) - f17;
                if (this.mInverted) {
                    f15 = val >= 0.0f ? val : 0.0f;
                    if (val > 0.0f) {
                        val = 0.0f;
                    }
                } else {
                    float f26 = val >= 0.0f ? val : 0.0f;
                    if (val > 0.0f) {
                        val = 0.0f;
                    }
                    float f27 = val;
                    val = f26;
                    f15 = f27;
                }
                float f28 = this.phaseY;
                if (val > 0.0f) {
                    val *= f28;
                } else {
                    f15 *= f28;
                }
                addBar(f15, f25, val, f24);
            } else {
                float f29 = -barEntry.getNegativeSum();
                float f34 = 0.0f;
                int i16 = 0;
                while (i16 < vals.length) {
                    float f35 = vals[i16];
                    if (f35 >= f19) {
                        fAbs = f35 + f34;
                        fAbs2 = f29;
                        f29 = f34;
                        f34 = fAbs;
                    } else {
                        fAbs = Math.abs(f35) + f29;
                        fAbs2 = Math.abs(f35) + f29;
                    }
                    float f36 = (xIndex - f22) + f17;
                    float f37 = f19;
                    float f38 = (xIndex + f22) - f17;
                    float f39 = f22;
                    if (this.mInverted) {
                        f16 = f29 >= fAbs ? f29 : fAbs;
                        if (f29 > fAbs) {
                        }
                        float f44 = entryCount;
                        float f45 = this.phaseY;
                        addBar(f16 * f45, f38, f29 * f45, f36);
                        i16++;
                        f29 = fAbs2;
                        entryCount = f44;
                        f22 = f39;
                        f19 = f37;
                    } else {
                        float f46 = f29 >= fAbs ? f29 : fAbs;
                        if (f29 > fAbs) {
                            f29 = fAbs;
                        }
                        fAbs = f46;
                        f16 = f29;
                    }
                    f29 = fAbs;
                    float f47 = entryCount;
                    float f48 = this.phaseY;
                    addBar(f16 * f48, f38, f29 * f48, f36);
                    i16++;
                    f29 = fAbs2;
                    entryCount = f47;
                    f22 = f39;
                    f19 = f37;
                }
                f14 = entryCount;
            }
            i15++;
            entryCount = f14;
        }
        reset();
    }
}
