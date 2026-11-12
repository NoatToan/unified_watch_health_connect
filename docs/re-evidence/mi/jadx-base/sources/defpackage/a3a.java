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
public abstract class a3a extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final RelativeLayout D;
    public final RelativeLayout E;
    public final RelativeLayout F;
    public final NestedScrollView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;

    public a3a(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = imageView3;
        this.D = relativeLayout;
        this.E = relativeLayout2;
        this.F = relativeLayout3;
        this.G = nestedScrollView;
        this.H = textView;
        this.I = textView2;
        this.J = textView3;
        this.K = textView4;
        this.L = textView5;
        this.M = textView6;
    }

    public static a3a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static a3a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (a3a) ViewDataBinding.G(layoutInflater, jui.s, viewGroup, z, obj);
    }
}
