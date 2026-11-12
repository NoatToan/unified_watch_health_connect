package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l19 extends ViewDataBinding {
    public final RecyclerView A;
    public final RecyclerView B;
    public final TextView C;

    public l19(Object obj, View view, int i, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = recyclerView2;
        this.C = textView;
    }

    public static l19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static l19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l19) ViewDataBinding.G(layoutInflater, ovi.f29738r, viewGroup, z, obj);
    }
}
