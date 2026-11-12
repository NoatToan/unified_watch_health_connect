package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c4a extends ViewDataBinding {
    public final RecyclerView A;

    public c4a(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }

    public static c4a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static c4a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (c4a) ViewDataBinding.G(layoutInflater, jui.H, viewGroup, z, obj);
    }
}
