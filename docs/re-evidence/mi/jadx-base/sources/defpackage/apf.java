package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class apf extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public apf(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
    }

    public static apf A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static apf B0(LayoutInflater layoutInflater, Object obj) {
        return (apf) ViewDataBinding.G(layoutInflater, qui.e, null, false, obj);
    }
}
