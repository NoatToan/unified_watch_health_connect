package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x6e extends ViewDataBinding {
    public final LinearLayout A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;

    public x6e(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = linearLayout2;
        this.C = linearLayout3;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
        this.I = textView6;
        this.J = textView7;
        this.K = textView8;
    }

    public static x6e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static x6e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (x6e) ViewDataBinding.G(layoutInflater, jui.u6, viewGroup, z, obj);
    }
}
