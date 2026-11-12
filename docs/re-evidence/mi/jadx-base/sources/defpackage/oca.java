package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class oca extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final LinearLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final LinearLayout E;
    public final View F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;

    public oca(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout2, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = linearLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = linearLayout2;
        this.F = view2;
        this.G = textView;
        this.H = textView2;
        this.I = textView3;
        this.J = textView4;
        this.K = textView5;
    }
}
