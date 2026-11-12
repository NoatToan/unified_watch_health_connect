package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o3a extends ViewDataBinding {
    public final CardView A;
    public final CardView B;
    public final CardView C;
    public final View D;
    public final NestedScrollView E;
    public final TextView F;
    public final TextView G;

    public o3a(Object obj, View view, int i, CardView cardView, CardView cardView2, CardView cardView3, View view2, NestedScrollView nestedScrollView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = cardView;
        this.B = cardView2;
        this.C = cardView3;
        this.D = view2;
        this.E = nestedScrollView;
        this.F = textView;
        this.G = textView2;
    }

    public static o3a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static o3a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (o3a) ViewDataBinding.G(layoutInflater, jui.z, viewGroup, z, obj);
    }
}
