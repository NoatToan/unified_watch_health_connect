package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fde extends ViewDataBinding {
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
    public final NestedScrollView P;
    public final LinearLayout Q;
    public final LinearLayout R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;

    public fde(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, NestedScrollView nestedScrollView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
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
        this.P = nestedScrollView;
        this.Q = linearLayout;
        this.R = linearLayout2;
        this.S = textView;
        this.T = textView2;
        this.U = textView3;
        this.V = textView4;
        this.W = textView5;
        this.X = textView6;
        this.Y = textView7;
    }

    public static fde A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static fde B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (fde) ViewDataBinding.G(layoutInflater, ivi.h1, viewGroup, z, obj);
    }
}
