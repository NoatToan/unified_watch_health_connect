package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btr extends ViewDataBinding {
    public final ixq A;
    public final MoreRecyclerView B;

    public btr(Object obj, View view, int i, ixq ixqVar, MoreRecyclerView moreRecyclerView) {
        super(obj, view, i);
        this.A = ixqVar;
        this.B = moreRecyclerView;
    }
}
