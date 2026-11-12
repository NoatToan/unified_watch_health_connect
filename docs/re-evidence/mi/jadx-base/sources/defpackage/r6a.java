package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.watch.face.widget.StateLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r6a extends ViewDataBinding {
    public final MoreRecyclerView A;
    public final SwipeRefreshLayout B;
    public final StateLayout C;

    public r6a(Object obj, View view, int i, MoreRecyclerView moreRecyclerView, SwipeRefreshLayout swipeRefreshLayout, StateLayout stateLayout) {
        super(obj, view, i);
        this.A = moreRecyclerView;
        this.B = swipeRefreshLayout;
        this.C = stateLayout;
    }
}
