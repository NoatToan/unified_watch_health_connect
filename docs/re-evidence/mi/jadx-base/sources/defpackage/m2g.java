package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class m2g extends ViewDataBinding {
    public final Button A;
    public final j3g B;
    public final View C;
    public final MoreRecyclerView D;

    public m2g(Object obj, View view, int i, Button button, j3g j3gVar, View view2, MoreRecyclerView moreRecyclerView) {
        super(obj, view, i);
        this.A = button;
        this.B = j3gVar;
        this.C = view2;
        this.D = moreRecyclerView;
    }
}
