package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f19 extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;

    public f19(Object obj, View view, int i, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
    }

    public static f19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static f19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (f19) ViewDataBinding.G(layoutInflater, ovi.o, viewGroup, z, obj);
    }
}
