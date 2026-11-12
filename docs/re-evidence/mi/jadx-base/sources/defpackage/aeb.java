package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xiaomi.fitness.habit.widget.MoreRecyclerView;
import com.xiaomi.fitness.habit.widget.StateLayout;

/* JADX INFO: loaded from: classes8.dex */
public abstract class aeb extends ViewDataBinding {
    public final View A;
    public final MoreRecyclerView B;
    public final SwipeRefreshLayout C;
    public final LinearLayout D;
    public final StateLayout E;

    public aeb(Object obj, View view, int i, View view2, MoreRecyclerView moreRecyclerView, SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, StateLayout stateLayout) {
        super(obj, view, i);
        this.A = view2;
        this.B = moreRecyclerView;
        this.C = swipeRefreshLayout;
        this.D = linearLayout;
        this.E = stateLayout;
    }
}
