package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class eua extends ViewDataBinding {
    public final RecyclerView A;

    public eua(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }

    public static eua A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static eua B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (eua) ViewDataBinding.G(layoutInflater, fvi.X, viewGroup, z, obj);
    }
}
