package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r93 extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final RelativeLayout C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final ImageView G;
    public final TextView H;
    public final LinearLayout I;
    public final TextView J;
    public final TextView K;

    public r93(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, RelativeLayout relativeLayout, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, LinearLayout linearLayout2, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = relativeLayout;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = imageView;
        this.H = textView5;
        this.I = linearLayout2;
        this.J = textView6;
        this.K = textView7;
    }

    public static r93 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static r93 B0(LayoutInflater layoutInflater, Object obj) {
        return (r93) ViewDataBinding.G(layoutInflater, kvi.f24339a, null, false, obj);
    }
}
