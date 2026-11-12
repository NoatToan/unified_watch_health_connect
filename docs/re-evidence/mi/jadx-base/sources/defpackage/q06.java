package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class q06 extends ViewDataBinding {
    public final RecyclerView A;

    public q06(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }

    public static q06 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static q06 B0(LayoutInflater layoutInflater, Object obj) {
        return (q06) ViewDataBinding.G(layoutInflater, dui.f15940a, null, false, obj);
    }
}
