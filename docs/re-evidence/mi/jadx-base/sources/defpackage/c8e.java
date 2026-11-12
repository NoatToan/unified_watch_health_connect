package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c8e extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;

    public c8e(Object obj, View view, int i, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
    }

    public static c8e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static c8e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (c8e) ViewDataBinding.G(layoutInflater, jui.W6, viewGroup, z, obj);
    }
}
