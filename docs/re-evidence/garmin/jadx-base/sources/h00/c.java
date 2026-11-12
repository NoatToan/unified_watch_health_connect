package h00;

import android.graphics.Canvas;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh00/c;", "Lh00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f80609m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        canvas.getClass();
        str.getClass();
        mPPointF.getClass();
        int i14 = this.f80609m;
        String str2 = (i14 == 0 || i14 == this.f80602f + (-1)) ? "●" : "•";
        float f17 = (i14 == 0 || i14 == this.f80602f + (-1)) ? f15 : f15 + (pz.d.f141919b / 4);
        Utils.drawXAxisValue(canvas, str2, f14, f17, this.f80599c, mPPointF, f16);
        Utils.drawXAxisValue(canvas, str, f14, f17 + pz.d.f141918a, this.f80598b, mPPointF, f16);
        this.f80609m++;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        canvas.getClass();
        mPPointF.getClass();
        this.f80609m = 0;
        super.drawLabels(canvas, f14, mPPointF);
    }
}
