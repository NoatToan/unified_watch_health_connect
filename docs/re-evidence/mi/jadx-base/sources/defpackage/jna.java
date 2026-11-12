package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jna extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final RelativeLayout I;
    public final RelativeLayout J;
    public final RelativeLayout K;
    public final RelativeLayout L;
    public final RelativeLayout M;
    public final RelativeLayout N;
    public final RelativeLayout O;
    public final RelativeLayout P;
    public final NestedScrollView Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final TextView a0;

    public jna(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, RelativeLayout relativeLayout8, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = imageView3;
        this.D = imageView4;
        this.E = imageView5;
        this.F = imageView6;
        this.G = imageView7;
        this.H = imageView8;
        this.I = relativeLayout;
        this.J = relativeLayout2;
        this.K = relativeLayout3;
        this.L = relativeLayout4;
        this.M = relativeLayout5;
        this.N = relativeLayout6;
        this.O = relativeLayout7;
        this.P = relativeLayout8;
        this.Q = nestedScrollView;
        this.R = textView;
        this.S = textView2;
        this.T = textView3;
        this.U = textView4;
        this.V = textView5;
        this.W = textView6;
        this.X = textView7;
        this.Y = textView8;
        this.Z = textView9;
        this.a0 = textView10;
    }

    public static jna A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static jna B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (jna) ViewDataBinding.G(layoutInflater, jui.t2, viewGroup, z, obj);
    }
}
