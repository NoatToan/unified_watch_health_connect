package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.watch.face.widget.StateLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j6a extends ViewDataBinding {
    public final MoreRecyclerView A;
    public final StateLayout B;

    public j6a(Object obj, View view, int i, MoreRecyclerView moreRecyclerView, StateLayout stateLayout) {
        super(obj, view, i);
        this.A = moreRecyclerView;
        this.B = stateLayout;
    }
}
