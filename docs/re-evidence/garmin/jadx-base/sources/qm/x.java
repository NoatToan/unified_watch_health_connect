package qm;

import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.github.mikephil.chartingv2.formatter.FillFormatter;
import com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class x extends c {

    public class a implements FillFormatter {
        public a(x xVar) {
        }

        @Override // com.github.mikephil.chartingv2.formatter.FillFormatter
        public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
            return 0.0f;
        }
    }

    public x(androidx.fragment.app.m mVar, zm.p pVar, zm.p pVar2, j jVar) {
        super(mVar, pVar, pVar2, jVar);
    }

    @Override // qm.b
    public final void h(androidx.fragment.app.m mVar, YAxis yAxis, double d14, boolean z14) {
        if (yAxis.getLimitLines() != null && yAxis.getLimitLines().size() > 0) {
            yAxis.removeAllLimitLines();
        }
        LimitLine limitLine = new LimitLine((float) d14, "");
        limitLine.setLineColor(a7.b.getColor(mVar, R.color.gcm_chart_avg_line));
        limitLine.setLineWidth(mVar.getResources().getDimension(R.dimen.gcm3_chart_line_size) / 2.0f);
        yAxis.addLimitLine(limitLine);
    }

    @Override // qm.c
    public final double[] n(LineDataSet lineDataSet, double d14) {
        double[] dArrA = c22.u.a(Math.floor(lineDataSet.getYMin()), Math.floor(lineDataSet.getYMax()));
        lineDataSet.setFillFormatter(new a(this));
        return dArrA == null ? m((hz.h) lineDataSet, d14) : dArrA;
    }
}
