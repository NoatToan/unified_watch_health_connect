package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rnh extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final ImageView G;
    public final TextView H;
    public final ConstraintLayout I;

    public rnh(Object obj, View view, int i, TextView textView, View view2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
        this.G = imageView;
        this.H = textView6;
        this.I = constraintLayout;
    }

    public static rnh A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static rnh B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (rnh) ViewDataBinding.G(layoutInflater, uui.i, viewGroup, z, obj);
    }
}
