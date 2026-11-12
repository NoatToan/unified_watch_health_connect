package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gp0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final LinearLayout F;

    public gp0(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = textView3;
        this.E = textView4;
        this.F = linearLayout;
    }

    public static gp0 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static gp0 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (gp0) ViewDataBinding.G(layoutInflater, dvi.j, viewGroup, z, obj);
    }
}
