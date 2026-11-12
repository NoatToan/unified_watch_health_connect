package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g50 extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final LinearLayout D;
    public final TextView E;
    public final DividerView F;
    public final ImageView G;
    public final TextView H;
    public final ProgressBar I;
    public final ConstraintLayout J;
    public final ConstraintLayout K;
    public final z50 L;
    public final AppCompatTextView M;
    public final TextView N;

    public g50(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, TextView textView2, LinearLayout linearLayout, TextView textView3, DividerView dividerView, ImageView imageView, TextView textView4, ProgressBar progressBar, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, z50 z50Var, AppCompatTextView appCompatTextView, TextView textView5) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = textView2;
        this.D = linearLayout;
        this.E = textView3;
        this.F = dividerView;
        this.G = imageView;
        this.H = textView4;
        this.I = progressBar;
        this.J = constraintLayout2;
        this.K = constraintLayout3;
        this.L = z50Var;
        this.M = appCompatTextView;
        this.N = textView5;
    }
}
