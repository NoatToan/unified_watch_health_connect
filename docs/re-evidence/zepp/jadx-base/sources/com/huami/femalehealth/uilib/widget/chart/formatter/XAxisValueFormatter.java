package com.huami.femalehealth.uilib.widget.chart.formatter;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class XAxisValueFormatter extends ValueFormatter {
    private static final String b = "XAxisValueFormatter";
    private List<BarEntry> a;

    public XAxisValueFormatter(List<BarEntry> list) {
        this.a = list;
    }

    private boolean a(float f) {
        double d = f;
        return d == Math.floor(d);
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public String getFormattedValue(float f) {
        List<BarEntry> list = this.a;
        if (list == null || list.size() <= 0) {
            return "";
        }
        Object data = this.a.get(Math.min(Math.max(0, (int) f), this.a.size() - 1)).getData();
        return ((data instanceof SymptomVo) && a(f) && f >= 0.0f) ? ChartHelper.INSTANCE.formatDateMonthAndDay(((SymptomVo) data).getDate()) : "";
    }
}
