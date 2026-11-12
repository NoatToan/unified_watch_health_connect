package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.widget.NoNestScrollRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mn4 extends ViewDataBinding {
    public final TextView A;
    public final Group B;
    public final View C;
    public final RecyclerView D;
    public final MoreRecyclerView E;
    public final TextView F;
    public final ConstraintLayout G;
    public final View H;
    public final NoNestScrollRecyclerView I;
    public final NoNestScrollRecyclerView J;
    public final TextView K;
    public final TextView L;

    public mn4(Object obj, View view, int i, TextView textView, Group group, View view2, RecyclerView recyclerView, MoreRecyclerView moreRecyclerView, TextView textView2, ConstraintLayout constraintLayout, View view3, NoNestScrollRecyclerView noNestScrollRecyclerView, NoNestScrollRecyclerView noNestScrollRecyclerView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = group;
        this.C = view2;
        this.D = recyclerView;
        this.E = moreRecyclerView;
        this.F = textView2;
        this.G = constraintLayout;
        this.H = view3;
        this.I = noNestScrollRecyclerView;
        this.J = noNestScrollRecyclerView2;
        this.K = textView3;
        this.L = textView4;
    }
}
