package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class n4g extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final LinearLayout F;
    public final ConstraintLayout G;
    public final ImageView H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout K;
    public final ConstraintLayout L;
    public final ConstraintLayout M;
    public final ImageView N;

    public n4g(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView2, TextView textView3, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ImageView imageView2, TextView textView4, TextView textView5, LinearLayout linearLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ImageView imageView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
        this.F = linearLayout;
        this.G = constraintLayout2;
        this.H = imageView2;
        this.I = textView4;
        this.J = textView5;
        this.K = linearLayout2;
        this.L = constraintLayout3;
        this.M = constraintLayout4;
        this.N = imageView3;
    }

    public static n4g A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static n4g B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (n4g) ViewDataBinding.G(layoutInflater, rui.z, viewGroup, z, obj);
    }
}
