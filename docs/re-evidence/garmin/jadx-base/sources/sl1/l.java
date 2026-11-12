package sl1;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsl1/l;", "Lh00/e;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends h00.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer, pz.a.LARGE_LIMIT_DOT_PATTERN, pz.b.DEFAULT_LABEL_PATTERN, false);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
    }

    @Override // h00.e, com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        Canvas canvas2;
        Drawable drawable;
        canvas.getClass();
        mPPointF.getClass();
        super.drawLabels(canvas, f14, mPPointF);
        List<xz.h> list = this.f80600d;
        if (list != null) {
            for (xz.h hVar : list) {
                float[] fArr = {hVar.f192754a, 0.0f};
                getTransformer().pointValuesToPixel(fArr);
                float f15 = fArr[0];
                if (!this.mViewPortHandler.isInBoundsX(f15) || (drawable = hVar.f192755b) == null) {
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    Utils.drawImage(canvas2, drawable, (int) f15, (int) (12.0f + f14), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                canvas = canvas2;
            }
        }
    }
}
