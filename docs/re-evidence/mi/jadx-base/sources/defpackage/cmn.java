package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cmn extends ViewDataBinding {
    public final LinearLayout A;
    public final Button B;
    public final Button C;
    public final ImageView D;
    public final ImageView E;
    public final ConstraintLayout F;
    public final TextView G;
    public final LinearLayout H;
    public final TextView I;
    public final LinearLayout J;
    public final TextView K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final ImageView N;
    public final ImageView O;
    public final ConstraintLayout P;
    public final TextView Q;

    public cmn(Object obj, View view, int i, LinearLayout linearLayout, Button button, Button button2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, TextView textView3, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, TextView textView4) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = button;
        this.C = button2;
        this.D = imageView;
        this.E = imageView2;
        this.F = constraintLayout;
        this.G = textView;
        this.H = linearLayout2;
        this.I = textView2;
        this.J = linearLayout3;
        this.K = textView3;
        this.L = linearLayout4;
        this.M = linearLayout5;
        this.N = imageView3;
        this.O = imageView4;
        this.P = constraintLayout2;
        this.Q = textView4;
    }

    public static cmn A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static cmn B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (cmn) ViewDataBinding.G(layoutInflater, dvi.f0, viewGroup, z, obj);
    }
}
