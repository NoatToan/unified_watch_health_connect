package qm;

import android.view.View;
import androidx.core.view.m1;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.chartingv2.charts.LineChart;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements androidx.core.view.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LineChart f145260b;

    public /* synthetic */ a0(LineChart lineChart, int i14) {
        this.f145259a = i14;
        this.f145260b = lineChart;
    }

    @Override // androidx.core.view.z
    public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
        int i14 = this.f145259a;
        LineChart lineChart = this.f145260b;
        switch (i14) {
            case 0:
                int i15 = c0.f145331z;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(128);
                eVarI.getClass();
                lineChart.setExtraLeftOffset(Utils.convertPixelsToDp(eVarI.f25190a));
                break;
            default:
                int i16 = g0.C;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(128);
                eVarI2.getClass();
                lineChart.setExtraLeftOffset(com.github.mikephil.chartingv2.utils.Utils.convertPixelsToDp(eVarI2.f25190a));
                break;
        }
        return m1Var;
    }
}
