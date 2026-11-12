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
public class w extends e {

    public class a implements FillFormatter {
        public a(w wVar) {
        }

        @Override // com.github.mikephil.chartingv2.formatter.FillFormatter
        public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
            return 0.0f;
        }
    }

    public w(androidx.fragment.app.m mVar, zm.p pVar) {
        super(mVar, pVar);
    }

    @Override // oz.c
    public final void h(YAxis yAxis, double d14) {
        if (yAxis.getLimitLines() != null && yAxis.getLimitLines().size() > 0) {
            yAxis.removeAllLimitLines();
        }
        LimitLine limitLine = new LimitLine(0.0f, "");
        limitLine.setLineColor(a7.b.getColor(this.f134441a, R.color.gcm_chart_avg_line));
        yAxis.addLimitLine(limitLine);
    }

    @Override // qm.e
    public final double[] n(LineDataSet lineDataSet, double d14) {
        double[] dArrA = c22.u.a(Math.floor(lineDataSet.getYMin()), Math.floor(lineDataSet.getYMax()));
        lineDataSet.setFillFormatter(new a(this));
        return dArrA == null ? super.n(lineDataSet, d14) : dArrA;
    }
}
