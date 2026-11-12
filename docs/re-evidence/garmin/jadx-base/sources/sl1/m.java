package sl1;

import android.graphics.Canvas;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsl1/m;", "Li00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/YAxis;", "yAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "axisTransformer", "", "drawBottomYLabelEntryEnabled", "showGridLines", "drawLimitLineBehindData", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;ZZZ)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends i00.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f160004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f160005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f160006k;

    public /* synthetic */ m(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewPortHandler, yAxis, transformer, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? true : z15, (i14 & 32) != 0 ? true : z16);
    }

    @Override // i00.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF160006k() {
        return this.f160006k;
    }

    @Override // i00.b
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF160005j() {
        return this.f160005j;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        canvas.getClass();
        fArr.getClass();
        boolean zIsDrawTopYLabelEntryEnabled = this.mYAxis.isDrawTopYLabelEntryEnabled();
        YAxis yAxis = this.mYAxis;
        int i14 = zIsDrawTopYLabelEntryEnabled ? yAxis.mEntryCount : yAxis.mEntryCount - 1;
        for (int i15 = !this.f160004i ? 1 : 0; i15 < i14; i15++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i15), f14, fArr[(i15 * 2) + 1] + f15, this.mAxisLabelPaint);
        }
    }

    @Override // i00.b
    public final void g() {
        this.f160006k = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, boolean z14, boolean z15, boolean z16) {
        super(viewPortHandler, yAxis, transformer);
        vb.h.o(viewPortHandler, yAxis, transformer);
        this.f160004i = z14;
        this.f160005j = z16;
        this.f160006k = z15;
    }
}
