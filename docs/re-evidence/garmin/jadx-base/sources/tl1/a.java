package tl1;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ltl1/a;", "Ld00/a;", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends d00.a {
    static {
        new C3104a(null);
    }

    public a(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
    }

    @Override // d00.a
    public final BarBuffer a(IBarDataSet iBarDataSet, int i14, Transformer transformer, float f14, float f15) {
        BarBuffer barBufferA = super.a(iBarDataSet, i14, transformer, f14, f15);
        if (iBarDataSet instanceof b) {
            b bVar = (b) iBarDataSet;
            int i15 = bVar.f165272a;
            float f16 = bVar.f165273b;
            int stackSize = bVar.getStackSize();
            if (i15 > 0) {
                float f17 = f16 / 2.0f;
                int i16 = stackSize * 4;
                for (int i17 = 0; i17 < barBufferA.size(); i17 += i16) {
                    int i18 = (i17 / i16) % i15;
                    if (i18 == 0) {
                        for (int i19 = i17; i19 < i17 + i16; i19 += 4) {
                            int i24 = i19 + 2;
                            if (i24 < barBufferA.size()) {
                                float[] fArr = barBufferA.buffer;
                                float f18 = fArr[i19] + f17;
                                if (fArr[i24] - f18 > 0.0f) {
                                    fArr[i19] = f18;
                                }
                            }
                        }
                    }
                    if (i18 == i15 - 1) {
                        for (int i25 = i17 + 2; i25 < i17 + i16; i25 += 4) {
                            if (i25 < barBufferA.size()) {
                                float[] fArr2 = barBufferA.buffer;
                                float f19 = fArr2[i25] - f17;
                                if (f19 - fArr2[i25 - 2] > 0.0f) {
                                    fArr2[i25] = f19;
                                }
                            }
                        }
                    }
                }
            }
        }
        return barBufferA;
    }

    /* JADX INFO: renamed from: tl1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltl1/a$a;", "", "<init>", "()V", "", "BAR_RECT_ARRAY_SIZE", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3104a {
        public /* synthetic */ C3104a(j jVar) {
            this();
        }

        private C3104a() {
        }
    }
}
