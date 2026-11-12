package h00;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;
import w5.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lh00/h;", "Lh00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends b {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        Drawable drawable;
        int i14 = this.mAxis.mEntryCount * 120;
        int i15 = i14 + 2;
        float[] fArr = new float[i15];
        int i16 = i14 + 1;
        int i17 = 0;
        int iN = r.n(0, i16, 2);
        if (iN >= 0) {
            int i18 = 0;
            while (true) {
                fArr[i18] = i18 / 2.0f;
                if (i18 == iN) {
                    break;
                } else {
                    i18 += 2;
                }
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        int iN2 = r.n(0, i16, 120);
        if (iN2 >= 0) {
            while (true) {
                float f15 = fArr[i17];
                if (this.mViewPortHandler.isInBoundsX(f15)) {
                    String axisLabel = this.mXAxis.getValueFormatter().getAxisLabel(i17 / 2.0f, this.mXAxis);
                    axisLabel.getClass();
                    float f16 = f14 + 12.0f;
                    float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
                    if ((i17 / 2) % 240.0f == 0.0f) {
                        Utils.drawXAxisValue(canvas, axisLabel, f15, f16 + pz.d.f141918a, this.f80598b, mPPointF, labelRotationAngle);
                        Utils.drawXAxisValue(canvas, "●", f15, f16, this.f80599c, mPPointF, 0.0f);
                    } else {
                        Utils.drawXAxisValue(canvas, "•", f15, f16, this.f80599c, mPPointF, 0.0f);
                    }
                }
                if (i17 == iN2) {
                    break;
                } else {
                    i17 += 120;
                }
            }
        }
        List<xz.h> list = this.f80600d;
        if (list != null) {
            for (xz.h hVar : list) {
                int i19 = hVar.f192754a * 2;
                if (i19 >= i15) {
                    return;
                }
                float f17 = fArr[i19];
                if (this.mViewPortHandler.isInBoundsX(f17) && (drawable = hVar.f192755b) != null) {
                    Utils.drawImage(canvas, drawable, (int) f17, (int) (f14 + 24.0f), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lh00/h$a;", "", "<init>", "()V", "", "DRAWABLE_TOP_PADDING", "F", "", "MINUTES_IN_AN_HOUR", "I", "X_AXIS_LABEL_STEP", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
