package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class p36 extends ViewDataBinding {
    public final CheckBox A;
    public final TextView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final ImageView E;
    public final TextView F;
    public final CheckBox G;
    public final TextView H;
    public final ConstraintLayout I;
    public final TextView J;
    public final ImageView K;
    public final TextView L;
    public final CheckBox M;
    public final TextView N;
    public final ConstraintLayout O;
    public final TextView P;
    public final ImageView Q;
    public final TextView R;

    public p36(Object obj, View view, int i, CheckBox checkBox, TextView textView, ConstraintLayout constraintLayout, TextView textView2, ImageView imageView, TextView textView3, CheckBox checkBox2, TextView textView4, ConstraintLayout constraintLayout2, TextView textView5, ImageView imageView2, TextView textView6, CheckBox checkBox3, TextView textView7, ConstraintLayout constraintLayout3, TextView textView8, ImageView imageView3, TextView textView9) {
        super(obj, view, i);
        this.A = checkBox;
        this.B = textView;
        this.C = constraintLayout;
        this.D = textView2;
        this.E = imageView;
        this.F = textView3;
        this.G = checkBox2;
        this.H = textView4;
        this.I = constraintLayout2;
        this.J = textView5;
        this.K = imageView2;
        this.L = textView6;
        this.M = checkBox3;
        this.N = textView7;
        this.O = constraintLayout3;
        this.P = textView8;
        this.Q = imageView3;
        this.R = textView9;
    }

    public static p36 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static p36 B0(LayoutInflater layoutInflater, Object obj) {
        return (p36) ViewDataBinding.G(layoutInflater, dui.n, null, false, obj);
    }
}
