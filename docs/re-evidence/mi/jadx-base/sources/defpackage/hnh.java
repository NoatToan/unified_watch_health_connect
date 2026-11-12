package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hnh extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public hnh(Object obj, View view, int i, TextView textView, View view2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
        this.G = textView6;
    }

    public static hnh A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static hnh B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (hnh) ViewDataBinding.G(layoutInflater, uui.f36156b, viewGroup, z, obj);
    }
}
