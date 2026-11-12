package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.course.widget.NoNestScrollRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vp4 extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final MoreRecyclerView C;
    public final TextView D;
    public final ConstraintLayout E;
    public final View F;
    public final NoNestScrollRecyclerView G;
    public final NoNestScrollRecyclerView H;

    public vp4(Object obj, View view, int i, TextView textView, View view2, MoreRecyclerView moreRecyclerView, TextView textView2, ConstraintLayout constraintLayout, View view3, NoNestScrollRecyclerView noNestScrollRecyclerView, NoNestScrollRecyclerView noNestScrollRecyclerView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = moreRecyclerView;
        this.D = textView2;
        this.E = constraintLayout;
        this.F = view3;
        this.G = noNestScrollRecyclerView;
        this.H = noNestScrollRecyclerView2;
    }
}
