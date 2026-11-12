package d00;

import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld00/f;", "Lcom/github/mikephil/charting/buffer/BarBuffer;", "", "size", "dataSetCount", "", "containsStacks", "<init>", "(IIZ)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends BarBuffer {
    public f(int i14, int i15, boolean z14) {
        super(i14, i15, z14);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.BarBuffer, com.github.mikephil.charting.buffer.AbstractBuffer
    public final void feed(IBarDataSet iBarDataSet) {
        float f14;
        iBarDataSet.getClass();
        float entryCount = iBarDataSet.getEntryCount() * this.phaseX;
        float f15 = this.mBarWidth / 2.0f;
        for (int i14 = 0; i14 < entryCount; i14++) {
            xz.e eVar = (xz.e) iBarDataSet.getEntryForIndex(i14);
            if (eVar != null) {
                float x14 = eVar.getX();
                float f16 = eVar.f192735b;
                float[] yVals = eVar.getYVals();
                if (!this.mContainsStacks || yVals == null) {
                    float f17 = x14 - f15;
                    float f18 = x14 + f15;
                    if (this.mInverted) {
                        f14 = f16 >= 0.0f ? f16 : 0.0f;
                        if (f16 > 0.0f) {
                            f16 = 0.0f;
                        }
                    } else {
                        float f19 = f16 >= 0.0f ? f16 : 0.0f;
                        if (f16 > 0.0f) {
                            f16 = 0.0f;
                        }
                        float f22 = f19;
                        f14 = f16;
                        f16 = f22;
                    }
                    float f24 = this.phaseY;
                    if (f16 > 0.0f) {
                        f16 *= f24;
                    } else {
                        f14 *= f24;
                    }
                    addBar(f17, f16, f18, f14);
                }
            }
        }
        reset();
    }
}
