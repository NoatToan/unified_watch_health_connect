package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qwb extends ViewDataBinding {
    public final LinearLayout A;
    public final AppCompatImageView B;
    public final LinearLayout C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public qwb(Object obj, View view, int i, LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = appCompatImageView;
        this.C = linearLayout2;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
    }

    public static qwb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qwb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qwb) ViewDataBinding.G(layoutInflater, jui.a4, viewGroup, z, obj);
    }
}
