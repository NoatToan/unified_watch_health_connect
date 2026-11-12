package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.NapDurationBarChart;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereLineChartView;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereReportChartCompareInfoView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kom extends ViewDataBinding {
    public final TextView A;
    public final SleepInterfereReportChartCompareInfoView B;
    public final SleepInterfereLineChartView C;
    public final NapDurationBarChart D;
    public final SleepInterfereReportChartCompareInfoView E;
    public final AppCompatTextView F;
    public final ImageView G;
    public final LinearLayout H;
    public final AppCompatTextView I;

    public kom(Object obj, View view, int i, TextView textView, SleepInterfereReportChartCompareInfoView sleepInterfereReportChartCompareInfoView, SleepInterfereLineChartView sleepInterfereLineChartView, NapDurationBarChart napDurationBarChart, SleepInterfereReportChartCompareInfoView sleepInterfereReportChartCompareInfoView2, AppCompatTextView appCompatTextView, ImageView imageView, LinearLayout linearLayout, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = sleepInterfereReportChartCompareInfoView;
        this.C = sleepInterfereLineChartView;
        this.D = napDurationBarChart;
        this.E = sleepInterfereReportChartCompareInfoView2;
        this.F = appCompatTextView;
        this.G = imageView;
        this.H = linearLayout;
        this.I = appCompatTextView2;
    }

    public static kom A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kom B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kom) ViewDataBinding.G(layoutInflater, jui.u8, viewGroup, z, obj);
    }
}
