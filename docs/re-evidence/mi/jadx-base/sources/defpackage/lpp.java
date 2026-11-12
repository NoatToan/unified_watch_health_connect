package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lpp extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public lpp(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
        this.D = imageView;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
    }

    public static lpp A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static lpp B0(View view, Object obj) {
        return (lpp) ViewDataBinding.k(obj, view, ivi.Y1);
    }

    public static lpp C0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return D0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static lpp D0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (lpp) ViewDataBinding.G(layoutInflater, ivi.Y1, viewGroup, z, obj);
    }
}
