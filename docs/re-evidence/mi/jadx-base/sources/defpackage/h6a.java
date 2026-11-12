package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel;
import com.xiaomi.fitness.watch.face.widget.StateLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h6a extends ViewDataBinding {
    public final RecyclerView A;
    public final StateLayout B;
    public FaceCategoryViewModel C;

    public h6a(Object obj, View view, int i, RecyclerView recyclerView, StateLayout stateLayout) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = stateLayout;
    }
}
