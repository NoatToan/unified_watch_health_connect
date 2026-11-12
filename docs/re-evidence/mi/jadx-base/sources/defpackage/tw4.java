package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tw4 extends ViewDataBinding {
    public final MoreRecyclerView A;
    public final View B;

    public tw4(Object obj, View view, int i, MoreRecyclerView moreRecyclerView, View view2) {
        super(obj, view, i);
        this.A = moreRecyclerView;
        this.B = view2;
    }
}
