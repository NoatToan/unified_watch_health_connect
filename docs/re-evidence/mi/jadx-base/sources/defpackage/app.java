package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class app extends ViewDataBinding {
    public final RecyclerView A;

    public app(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }

    public static app A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static app B0(View view, Object obj) {
        return (app) ViewDataBinding.k(obj, view, ivi.Q1);
    }
}
