package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.ScrollTitleBar;
import com.xiaomi.fitness.widget.view.HomeHeaderView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w3o extends ViewDataBinding {
    public final Button A;
    public final View B;
    public final NestedScrollView C;
    public final HomeHeaderView D;
    public final RecyclerView E;
    public final ScrollTitleBar F;
    public final View G;

    public w3o(Object obj, View view, int i, Button button, View view2, NestedScrollView nestedScrollView, HomeHeaderView homeHeaderView, RecyclerView recyclerView, ScrollTitleBar scrollTitleBar, View view3) {
        super(obj, view, i);
        this.A = button;
        this.B = view2;
        this.C = nestedScrollView;
        this.D = homeHeaderView;
        this.E = recyclerView;
        this.F = scrollTitleBar;
        this.G = view3;
    }
}
