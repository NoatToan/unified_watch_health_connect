package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class yln extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final RecyclerView C;
    public final TextView D;
    public final TextView E;

    public yln(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = recyclerView;
        this.D = textView2;
        this.E = textView3;
    }

    public static yln A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yln B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yln) ViewDataBinding.G(layoutInflater, dvi.d0, viewGroup, z, obj);
    }
}
