package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ysb extends ViewDataBinding {
    public final Button A;
    public final View B;
    public final MoreRecyclerView C;

    public ysb(Object obj, View view, int i, Button button, View view2, MoreRecyclerView moreRecyclerView) {
        super(obj, view, i);
        this.A = button;
        this.B = view2;
        this.C = moreRecyclerView;
    }
}
