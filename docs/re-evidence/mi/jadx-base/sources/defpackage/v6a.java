package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.watch.face.widget.StateLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v6a extends ViewDataBinding {
    public final TextView A;
    public final MoreRecyclerView B;
    public final StateLayout C;

    public v6a(Object obj, View view, int i, TextView textView, MoreRecyclerView moreRecyclerView, StateLayout stateLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = moreRecyclerView;
        this.C = stateLayout;
    }
}
