package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.heartrate.ui.view.IndicatorView;
import com.xiaomi.fitness.widget.view.DurationTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a7c extends ViewDataBinding {
    public final ConstraintLayout A;
    public final DurationTextView B;
    public final IndicatorView C;
    public final NestedScrollView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;

    public a7c(Object obj, View view, int i, ConstraintLayout constraintLayout, DurationTextView durationTextView, IndicatorView indicatorView, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = durationTextView;
        this.C = indicatorView;
        this.D = nestedScrollView;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
        this.I = textView5;
        this.J = textView6;
    }
}
