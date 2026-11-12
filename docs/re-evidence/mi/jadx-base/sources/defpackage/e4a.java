package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e4a extends ViewDataBinding {
    public final RecyclerView A;

    public e4a(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }

    public static e4a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static e4a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (e4a) ViewDataBinding.G(layoutInflater, jui.I, viewGroup, z, obj);
    }
}
