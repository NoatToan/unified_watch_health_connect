package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gkr extends ViewDataBinding {
    public final View A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final ImageView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;

    public gkr(Object obj, View view, int i, View view2, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, ImageView imageView3, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = imageView2;
        this.F = imageView3;
        this.G = textView3;
        this.H = textView4;
    }

    public static gkr A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static gkr B0(View view, Object obj) {
        return (gkr) ViewDataBinding.k(obj, view, mvi.A);
    }
}
