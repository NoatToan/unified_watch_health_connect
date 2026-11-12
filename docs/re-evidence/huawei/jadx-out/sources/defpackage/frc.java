package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;

/* JADX INFO: loaded from: classes7.dex */
public class frc extends qnx {
    @Override // defpackage.qnq
    protected boolean a() {
        return false;
    }

    public frc(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
    }

    @Override // defpackage.qnq
    protected void e(IHwHealthLineDataSet iHwHealthLineDataSet, int i, Transformer transformer, Canvas canvas) {
        super.e(iHwHealthLineDataSet, i, transformer, canvas);
        int entryCount = iHwHealthLineDataSet.getEntryCount();
        if (!iHwHealthLineDataSet.isDrawFilledEnabled() || entryCount <= 0) {
            return;
        }
        e(this.mBitmapCanvas, iHwHealthLineDataSet, transformer, this.mXBounds, this.mChart.getAxisDataRenderArg(iHwHealthLineDataSet.getAxisDependencyExt()));
    }
}
