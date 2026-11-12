package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gvp extends ViewDataBinding {
    public final ImageView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final ConstraintLayout G;
    public final TextView H;

    public gvp(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout2, TextView textView5) {
        super(obj, view, i);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = constraintLayout2;
        this.H = textView5;
    }

    public static gvp A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static gvp B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (gvp) ViewDataBinding.G(layoutInflater, jvi.f0, viewGroup, z, obj);
    }
}
