package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pyf extends ViewDataBinding {
    public final RecyclerView A;

    public pyf(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }

    public static pyf A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static pyf B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (pyf) ViewDataBinding.G(layoutInflater, rui.h, viewGroup, z, obj);
    }
}
