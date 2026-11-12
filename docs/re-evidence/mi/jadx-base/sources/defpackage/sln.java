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
public abstract class sln extends ViewDataBinding {
    public final LinearLayout A;
    public final Button B;
    public final TextView C;
    public final LinearLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final ImageView G;
    public final ImageView H;
    public final ConstraintLayout I;
    public final TextView J;
    public final LinearLayout K;
    public final LinearLayout L;
    public final ImageView M;
    public final ImageView N;
    public final ConstraintLayout O;
    public final TextView P;

    public sln(Object obj, View view, int i, LinearLayout linearLayout, Button button, TextView textView, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, TextView textView3, LinearLayout linearLayout4, LinearLayout linearLayout5, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, TextView textView4) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = button;
        this.C = textView;
        this.D = linearLayout2;
        this.E = textView2;
        this.F = linearLayout3;
        this.G = imageView;
        this.H = imageView2;
        this.I = constraintLayout;
        this.J = textView3;
        this.K = linearLayout4;
        this.L = linearLayout5;
        this.M = imageView3;
        this.N = imageView4;
        this.O = constraintLayout2;
        this.P = textView4;
    }

    public static sln A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static sln B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (sln) ViewDataBinding.G(layoutInflater, dvi.a0, viewGroup, z, obj);
    }
}
