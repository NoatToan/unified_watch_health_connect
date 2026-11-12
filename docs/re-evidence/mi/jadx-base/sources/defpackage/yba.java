package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.widget.CommonTitleBar;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yba extends ViewDataBinding {
    public final FrameLayout A;
    public final MoreRecyclerView B;
    public final CommonTitleBar C;

    public yba(Object obj, View view, int i, FrameLayout frameLayout, MoreRecyclerView moreRecyclerView, CommonTitleBar commonTitleBar) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = moreRecyclerView;
        this.C = commonTitleBar;
    }
}
