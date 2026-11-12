package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jf extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final LinearLayout F;
    public final TextView G;

    public jf(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
        this.F = linearLayout;
        this.G = textView6;
    }

    public static jf A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static jf B0(LayoutInflater layoutInflater, Object obj) {
        return (jf) ViewDataBinding.G(layoutInflater, jvi.c, null, false, obj);
    }
}
