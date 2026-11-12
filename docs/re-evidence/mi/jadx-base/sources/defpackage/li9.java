package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class li9 extends ViewDataBinding {
    public final RecyclerView A;
    public final NestedScrollView B;

    public li9(Object obj, View view, int i, RecyclerView recyclerView, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = nestedScrollView;
    }
}
