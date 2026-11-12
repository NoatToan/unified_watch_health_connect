package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wln extends ViewDataBinding {
    public final ConstraintLayout A;
    public final DividerView B;
    public final AppCompatTextView C;
    public final RelativeLayout D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final DividerView J;

    public wln(Object obj, View view, int i, ConstraintLayout constraintLayout, DividerView dividerView, AppCompatTextView appCompatTextView, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, DividerView dividerView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = dividerView;
        this.C = appCompatTextView;
        this.D = relativeLayout;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
        this.I = textView5;
        this.J = dividerView2;
    }
}
