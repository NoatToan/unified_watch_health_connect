package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pi0 extends ViewDataBinding {
    public final LinearLayout A;
    public final MoreRecyclerView B;

    public pi0(Object obj, View view, int i, LinearLayout linearLayout, MoreRecyclerView moreRecyclerView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = moreRecyclerView;
    }
}
