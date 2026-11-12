package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uha extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final RecyclerView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public uha(Object obj, View view, int i, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = recyclerView;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
    }

    public static uha A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static uha B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uha) ViewDataBinding.G(layoutInflater, ivi.i0, viewGroup, z, obj);
    }
}
