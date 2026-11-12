package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ox8 extends ViewDataBinding {
    public final ImageView A;
    public final ConstraintLayout B;
    public final ImageView C;
    public final Group D;
    public final RecyclerView E;
    public final TextView F;
    public final MoreRecyclerView G;
    public final NestedScrollView H;

    public ox8(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, Group group, RecyclerView recyclerView, TextView textView, MoreRecyclerView moreRecyclerView, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = imageView2;
        this.D = group;
        this.E = recyclerView;
        this.F = textView;
        this.G = moreRecyclerView;
        this.H = nestedScrollView;
    }
}
