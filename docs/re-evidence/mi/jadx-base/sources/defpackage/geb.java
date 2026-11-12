package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xiaomi.fitness.habit.widget.MoreRecyclerView;
import com.xiaomi.fitness.habit.widget.StateLayout;

/* JADX INFO: loaded from: classes8.dex */
public abstract class geb extends ViewDataBinding {
    public final RelativeLayout A;
    public final View B;
    public final MoreRecyclerView C;
    public final SwipeRefreshLayout D;
    public final StateLayout E;

    public geb(Object obj, View view, int i, RelativeLayout relativeLayout, View view2, MoreRecyclerView moreRecyclerView, SwipeRefreshLayout swipeRefreshLayout, StateLayout stateLayout) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = view2;
        this.C = moreRecyclerView;
        this.D = swipeRefreshLayout;
        this.E = stateLayout;
    }
}
