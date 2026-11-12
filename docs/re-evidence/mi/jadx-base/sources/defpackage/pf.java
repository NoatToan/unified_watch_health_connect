package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pf extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final View D;

    public pf(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = textView2;
        this.D = view2;
    }

    public static pf A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static pf B0(LayoutInflater layoutInflater, Object obj) {
        return (pf) ViewDataBinding.G(layoutInflater, jvi.d, null, false, obj);
    }
}
