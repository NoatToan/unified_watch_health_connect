package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wk6 extends ViewDataBinding {
    public final View A;
    public final ConstraintLayout B;
    public final FrameLayout C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public final ImageView G;

    public wk6(Object obj, View view, int i, View view2, ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        super(obj, view, i);
        this.A = view2;
        this.B = constraintLayout;
        this.C = frameLayout;
        this.D = imageView;
        this.E = textView;
        this.F = textView2;
        this.G = imageView2;
    }

    public static wk6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static wk6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wk6) ViewDataBinding.G(layoutInflater, eui.g1, viewGroup, z, obj);
    }
}
