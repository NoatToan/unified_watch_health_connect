package defpackage;

import android.graphics.Canvas;
import com.github.mikephil.charting.utils.Transformer;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.datarender.HwHealthRenderMode;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qnv extends qoc {
    public qnv(HwHealthRenderMode hwHealthRenderMode, DataInfos dataInfos) {
        super(hwHealthRenderMode);
        hwHealthRenderMode.f23752c = true;
        hwHealthRenderMode.d = dataInfos;
    }

    @Override // defpackage.qoc
    public void a(Canvas canvas, IHwHealthLineDatasContainer iHwHealthLineDatasContainer, Transformer transformer) {
        super.a(canvas, iHwHealthLineDatasContainer, transformer);
    }

    @Override // defpackage.qoc
    protected List<qod> c(IHwHealthLineDatasContainer iHwHealthLineDatasContainer) {
        return iHwHealthLineDatasContainer.queryNewNodes();
    }
}
