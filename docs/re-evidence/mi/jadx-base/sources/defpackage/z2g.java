package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z2g extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final ConstraintLayout E;
    public final TextView F;
    public final CheckBox G;
    public final ConstraintLayout H;
    public final TextView I;
    public final DividerView J;
    public final TextView K;
    public final LinearLayout L;

    public z2g(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout, TextView textView4, CheckBox checkBox, ConstraintLayout constraintLayout2, TextView textView5, DividerView dividerView, TextView textView6, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = constraintLayout;
        this.F = textView4;
        this.G = checkBox;
        this.H = constraintLayout2;
        this.I = textView5;
        this.J = dividerView;
        this.K = textView6;
        this.L = linearLayout2;
    }
}
