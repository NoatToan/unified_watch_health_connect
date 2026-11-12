package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.active.pk.widget.PkBarChart;
import com.xiaomi.fitness.active.pk.widget.PkScoreView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lxh extends ViewDataBinding {
    public final PkBarChart A;
    public final PkBarChart B;
    public final PkScoreView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;

    public lxh(Object obj, View view, int i, PkBarChart pkBarChart, PkBarChart pkBarChart2, PkScoreView pkScoreView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i);
        this.A = pkBarChart;
        this.B = pkBarChart2;
        this.C = pkScoreView;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
        this.I = textView6;
        this.J = textView7;
        this.K = textView8;
    }
}
