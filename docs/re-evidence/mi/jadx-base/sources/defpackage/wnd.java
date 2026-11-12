package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wnd extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final ImageView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final View M;
    public final TextView N;

    public wnd(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ImageView imageView, TextView textView9, TextView textView10, TextView textView11, View view2, TextView textView12) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
        this.F = textView6;
        this.G = textView7;
        this.H = textView8;
        this.I = imageView;
        this.J = textView9;
        this.K = textView10;
        this.L = textView11;
        this.M = view2;
        this.N = textView12;
    }

    public static wnd A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static wnd B0(LayoutInflater layoutInflater, Object obj) {
        return (wnd) ViewDataBinding.G(layoutInflater, jvi.P, null, false, obj);
    }
}
