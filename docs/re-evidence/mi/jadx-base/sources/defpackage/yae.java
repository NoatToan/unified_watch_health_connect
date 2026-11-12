package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class yae extends ViewDataBinding {
    public final RelativeLayout A;
    public final ConstraintLayout B;
    public final ImageView C;
    public final ImageView D;
    public final TextView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;

    public yae(Object obj, View view, int i, RelativeLayout relativeLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = constraintLayout;
        this.C = imageView;
        this.D = imageView2;
        this.E = textView;
        this.F = imageView3;
        this.G = imageView4;
        this.H = imageView5;
        this.I = imageView6;
    }

    public static yae A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yae B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yae) ViewDataBinding.G(layoutInflater, dvi.A, viewGroup, z, obj);
    }
}
