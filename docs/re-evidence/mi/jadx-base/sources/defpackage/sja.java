package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.chart.view.ScrollChartRecycleView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class sja extends ViewDataBinding {
    public final BarChartRecyclerView A;
    public final DataTitleView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final ImageView K;
    public final lde L;
    public final LinearLayout M;
    public final ScrollChartRecycleView N;
    public final TextView O;

    public sja(Object obj, View view, int i, BarChartRecyclerView barChartRecyclerView, DataTitleView dataTitleView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, lde ldeVar, LinearLayout linearLayout, ScrollChartRecycleView scrollChartRecycleView, TextView textView5) {
        super(obj, view, i);
        this.A = barChartRecyclerView;
        this.B = dataTitleView;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = appCompatImageView3;
        this.F = appCompatImageView4;
        this.G = textView;
        this.H = textView2;
        this.I = textView3;
        this.J = textView4;
        this.K = imageView;
        this.L = ldeVar;
        this.M = linearLayout;
        this.N = scrollChartRecycleView;
        this.O = textView5;
    }
}
