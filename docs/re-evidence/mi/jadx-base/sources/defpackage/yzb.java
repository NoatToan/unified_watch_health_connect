package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.weight.ui.view.SomatoTypeTreemapView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yzb extends ViewDataBinding {
    public final ConstraintLayout A;
    public final DividerView B;
    public final TextView C;
    public final RecyclerView D;
    public final SomatoTypeTreemapView E;

    public yzb(Object obj, View view, int i, ConstraintLayout constraintLayout, DividerView dividerView, TextView textView, RecyclerView recyclerView, SomatoTypeTreemapView somatoTypeTreemapView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = dividerView;
        this.C = textView;
        this.D = recyclerView;
        this.E = somatoTypeTreemapView;
    }
}
