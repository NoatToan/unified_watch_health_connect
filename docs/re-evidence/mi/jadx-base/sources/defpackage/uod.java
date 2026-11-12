package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class uod extends ViewDataBinding {
    public final View A;
    public final Guideline B;
    public final View C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final View M;

    public uod(Object obj, View view, int i, View view2, Guideline guideline, View view3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, View view4) {
        super(obj, view, i);
        this.A = view2;
        this.B = guideline;
        this.C = view3;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
        this.I = textView6;
        this.J = textView7;
        this.K = textView8;
        this.L = textView9;
        this.M = view4;
    }

    public static uod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static uod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uod) ViewDataBinding.G(layoutInflater, jui.t6, viewGroup, z, obj);
    }
}
