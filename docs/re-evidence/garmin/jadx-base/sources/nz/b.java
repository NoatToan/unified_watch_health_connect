package nz;

import com.github.mikephil.chartingv2.components.YAxis;
import o13.e;
import o13.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    @e
    public static final void a(YAxis yAxis, float f14, float f15) {
        float f16 = 4;
        float f17 = f16 - ((f15 - f14) % f16);
        if (f17 == f16) {
            f17 = 0.0f;
        }
        if (f17 > 0.0f) {
            float fCeil = (float) Math.ceil(f17 / 2);
            float f18 = f14 - fCeil;
            if (f18 < 0.0f) {
                fCeil -= f14;
                f14 = 0.0f;
            } else {
                f14 = f18;
            }
            f15 += f17 - fCeil;
        }
        yAxis.setAxisMinValue(f14);
        yAxis.setAxisMaxValue(f15);
        new p(Float.valueOf(f14), Float.valueOf(f15));
    }
}
