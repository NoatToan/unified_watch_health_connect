package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class sob extends ViewDataBinding {
    public final TextView A;
    public final FlexboxLayout B;
    public final LinearLayout C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public sob(Object obj, View view, int i, TextView textView, FlexboxLayout flexboxLayout, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = flexboxLayout;
        this.C = linearLayout;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = textView6;
    }

    public static sob A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static sob B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (sob) ViewDataBinding.G(layoutInflater, jui.N2, viewGroup, z, obj);
    }
}
