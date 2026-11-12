package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hpg extends ViewDataBinding {
    public final RecyclerView A;
    public final NestedScrollView B;
    public final SpringBackLayout C;

    public hpg(Object obj, View view, int i, RecyclerView recyclerView, NestedScrollView nestedScrollView, SpringBackLayout springBackLayout) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = nestedScrollView;
        this.C = springBackLayout;
    }
}
