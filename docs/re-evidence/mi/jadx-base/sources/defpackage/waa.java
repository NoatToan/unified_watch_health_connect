package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.relative.home.RelativeDataHeaderView;
import com.xiaomi.fitness.relative.home.RelativeHealthTitleView;
import com.xiaomi.fitness.relative.home.RelativeHomeHeaderView;
import com.xiaomi.fitness.view.DataEmptyView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class waa extends ViewDataBinding {
    public final RelativeHomeHeaderView A;
    public final RelativeDataHeaderView B;
    public final DataEmptyView C;
    public final RecyclerView D;
    public final NestedScrollView E;
    public final SpringBackLayout F;
    public final RelativeHealthTitleView G;

    public waa(Object obj, View view, int i, RelativeHomeHeaderView relativeHomeHeaderView, RelativeDataHeaderView relativeDataHeaderView, DataEmptyView dataEmptyView, RecyclerView recyclerView, NestedScrollView nestedScrollView, SpringBackLayout springBackLayout, RelativeHealthTitleView relativeHealthTitleView) {
        super(obj, view, i);
        this.A = relativeHomeHeaderView;
        this.B = relativeDataHeaderView;
        this.C = dataEmptyView;
        this.D = recyclerView;
        this.E = nestedScrollView;
        this.F = springBackLayout;
        this.G = relativeHealthTitleView;
    }
}
