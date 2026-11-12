package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class izb extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final RecyclerView G;
    public final TextView H;
    public final RecyclerView I;
    public final TextView J;
    public final RecyclerView K;
    public final TextView L;

    public izb(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, RecyclerView recyclerView, TextView textView7, RecyclerView recyclerView2, TextView textView8, RecyclerView recyclerView3, TextView textView9) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
        this.F = textView6;
        this.G = recyclerView;
        this.H = textView7;
        this.I = recyclerView2;
        this.J = textView8;
        this.K = recyclerView3;
        this.L = textView9;
    }

    public static izb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static izb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (izb) ViewDataBinding.G(layoutInflater, jui.J4, viewGroup, z, obj);
    }
}
