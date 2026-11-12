package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ei extends ViewDataBinding {
    public final View A;
    public final View B;
    public final ImageView C;
    public final ImageView D;
    public final ConstraintLayout E;
    public final TextView F;
    public final ImageView G;
    public final ImageView H;
    public final ConstraintLayout I;
    public final TextView J;
    public final ImageView K;
    public final ImageView L;
    public final ConstraintLayout M;
    public final TextView N;
    public final ImageView O;
    public final ImageView P;
    public final ConstraintLayout Q;
    public final TextView R;
    public final ProgressBar S;
    public final View T;
    public final View U;
    public final View V;
    public final View W;
    public final View X;
    public final View Y;
    public final View Z;
    public final View a0;

    public ei(Object obj, View view, int i, View view2, View view3, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, TextView textView2, ImageView imageView5, ImageView imageView6, ConstraintLayout constraintLayout3, TextView textView3, ImageView imageView7, ImageView imageView8, ConstraintLayout constraintLayout4, TextView textView4, ProgressBar progressBar, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11) {
        super(obj, view, i);
        this.A = view2;
        this.B = view3;
        this.C = imageView;
        this.D = imageView2;
        this.E = constraintLayout;
        this.F = textView;
        this.G = imageView3;
        this.H = imageView4;
        this.I = constraintLayout2;
        this.J = textView2;
        this.K = imageView5;
        this.L = imageView6;
        this.M = constraintLayout3;
        this.N = textView3;
        this.O = imageView7;
        this.P = imageView8;
        this.Q = constraintLayout4;
        this.R = textView4;
        this.S = progressBar;
        this.T = view4;
        this.U = view5;
        this.V = view6;
        this.W = view7;
        this.X = view8;
        this.Y = view9;
        this.Z = view10;
        this.a0 = view11;
    }

    public static ei A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static ei B0(LayoutInflater layoutInflater, Object obj) {
        return (ei) ViewDataBinding.G(layoutInflater, jvi.g, null, false, obj);
    }
}
