package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.github.mikephil.charting.charts.LineChart;

/* JADX INFO: loaded from: classes9.dex */
public abstract class iom extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final LineChart C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final CardView G;
    public final CardView H;
    public final View I;
    public final View J;

    public iom(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, LineChart lineChart, TextView textView2, TextView textView3, TextView textView4, CardView cardView, CardView cardView2, View view2, View view3) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = lineChart;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = cardView;
        this.H = cardView2;
        this.I = view2;
        this.J = view3;
    }
}
