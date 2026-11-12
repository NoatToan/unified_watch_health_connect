package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

/* JADX INFO: loaded from: classes13.dex */
public class HorizontalBarBuffer extends BarBuffer {
    public HorizontalBarBuffer(int i14, int i15, boolean z14) {
        super(i14, i15, z14);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.BarBuffer, com.github.mikephil.charting.buffer.AbstractBuffer
    public void feed(IBarDataSet iBarDataSet) {
        float f14;
        float fAbs;
        float fAbs2;
        float f15;
        float entryCount = iBarDataSet.getEntryCount() * this.phaseX;
        float f16 = this.mBarWidth / 2.0f;
        for (int i14 = 0; i14 < entryCount; i14++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i14);
            if (barEntry != null) {
                float x14 = barEntry.getX();
                float y14 = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                if (!this.mContainsStacks || yVals == null) {
                    float f17 = x14 - f16;
                    float f18 = x14 + f16;
                    if (this.mInverted) {
                        f14 = y14 >= 0.0f ? y14 : 0.0f;
                        if (y14 > 0.0f) {
                            y14 = 0.0f;
                        }
                    } else {
                        float f19 = y14 >= 0.0f ? y14 : 0.0f;
                        if (y14 > 0.0f) {
                            y14 = 0.0f;
                        }
                        float f22 = y14;
                        y14 = f19;
                        f14 = f22;
                    }
                    float f24 = this.phaseY;
                    if (y14 > 0.0f) {
                        y14 *= f24;
                    } else {
                        f14 *= f24;
                    }
                    addBar(f14, f18, y14, f17);
                } else {
                    float f25 = -barEntry.getNegativeSum();
                    float f26 = 0.0f;
                    int i15 = 0;
                    while (i15 < yVals.length) {
                        float f27 = yVals[i15];
                        if (f27 >= 0.0f) {
                            fAbs = f27 + f26;
                            fAbs2 = f25;
                            f25 = f26;
                            f26 = fAbs;
                        } else {
                            fAbs = Math.abs(f27) + f25;
                            fAbs2 = Math.abs(f27) + f25;
                        }
                        float f28 = x14 - f16;
                        float f29 = x14 + f16;
                        if (this.mInverted) {
                            f15 = f25 >= fAbs ? f25 : fAbs;
                            if (f25 > fAbs) {
                                f25 = fAbs;
                            }
                        } else {
                            float f34 = f25 >= fAbs ? f25 : fAbs;
                            if (f25 > fAbs) {
                                f25 = fAbs;
                            }
                            float f35 = f25;
                            f25 = f34;
                            f15 = f35;
                        }
                        float f36 = this.phaseY;
                        addBar(f15 * f36, f29, f25 * f36, f28);
                        i15++;
                        f25 = fAbs2;
                    }
                }
            }
        }
        reset();
    }
}
