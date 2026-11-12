package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j4o extends ViewDataBinding {
    public final HomeHeaderTabTitleView A;
    public final RecyclerView B;
    public final ConstraintLayout C;
    public final NestedScrollView D;
    public final RecyclerView E;
    public final SpringBackLayout F;
    public final ConstraintLayout G;

    public j4o(Object obj, View view, int i, HomeHeaderTabTitleView homeHeaderTabTitleView, RecyclerView recyclerView, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, RecyclerView recyclerView2, SpringBackLayout springBackLayout, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.A = homeHeaderTabTitleView;
        this.B = recyclerView;
        this.C = constraintLayout;
        this.D = nestedScrollView;
        this.E = recyclerView2;
        this.F = springBackLayout;
        this.G = constraintLayout2;
    }
}
