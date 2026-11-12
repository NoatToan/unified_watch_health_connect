package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yof extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public yof(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
    }

    public static yof A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yof B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yof) ViewDataBinding.G(layoutInflater, qui.d, viewGroup, z, obj);
    }
}
