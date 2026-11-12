package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDataSetStyle;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qpe implements IHwHealthDataSetStyle {
    public static final String c(float f) {
        return b(f, false);
    }

    public static final String b(float f, boolean z) {
        int iRound = Math.round(f);
        if (iRound < 1 && !z) {
            iRound = 1;
        }
        Context context = BaseApplication.getContext();
        int i = iRound / 60;
        if (context == null) {
            return "";
        }
        if (LanguageUtil.p(context)) {
            return UnitUtil.e(iRound);
        }
        String string = context.getResources().getString(R.string.IDS_hwh_motiontrack_show_pace, UnitUtil.e(i, 1, 0), Integer.valueOf(iRound % 60));
        return LanguageUtil.c(context) ? string.substring(0, string.length() - 2).replace("'", ":") : string;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthDataSetStyle
    public void initStyle(final HwHealthBaseBarLineChart hwHealthBaseBarLineChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        if (hwHealthBaseBarLineChart == null || hwHealthBaseBarLineDataSet == null) {
            return;
        }
        HwHealthYAxis.HwHealthAxisDependency axisDependencyExt = hwHealthBaseBarLineDataSet.getAxisDependencyExt();
        hwHealthBaseBarLineChart.getTransformer(axisDependencyExt).e(new HwHealthTransformer.BusinessMatrixGenerator() { // from class: qpe.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthTransformer.BusinessMatrixGenerator
            public Matrix generateBusinessMatrix(Matrix matrix) {
                if (matrix != null) {
                    matrix.reset();
                    matrix.postScale(1.0f, -1.0f);
                    matrix.postTranslate(0.0f, -hwHealthBaseBarLineChart.getViewPortHandler().getContentRect().height());
                }
                return matrix;
            }
        });
        hwHealthBaseBarLineChart.getAxis(axisDependencyExt).setValueFormatter(new IAxisValueFormatter() { // from class: qpe.3
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                return qpe.c(f);
            }
        });
        qmi axisDataRenderArg = hwHealthBaseBarLineChart.getAxisDataRenderArg(axisDependencyExt);
        axisDataRenderArg.e(false);
        axisDataRenderArg.d(this);
    }
}
