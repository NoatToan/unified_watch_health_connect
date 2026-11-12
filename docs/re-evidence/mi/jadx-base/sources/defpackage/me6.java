package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class me6 extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;

    public me6(Object obj, View view, int i, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
    }

    public static me6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static me6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (me6) ViewDataBinding.G(layoutInflater, eui.v, viewGroup, z, obj);
    }
}
