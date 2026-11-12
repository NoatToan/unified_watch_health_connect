package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.NoScrollRecyclerView;
import com.xiaomi.fitness.electronic.scale.widget.UserManageFooterView;
import com.xiaomi.fitness.electronic.scale.widget.UserManageHeaderView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pk0 extends ViewDataBinding {
    public final UserManageFooterView A;
    public final UserManageHeaderView B;
    public final LinearLayout C;
    public final NestedScrollView D;
    public final NoScrollRecyclerView E;

    public pk0(Object obj, View view, int i, UserManageFooterView userManageFooterView, UserManageHeaderView userManageHeaderView, LinearLayout linearLayout, NestedScrollView nestedScrollView, NoScrollRecyclerView noScrollRecyclerView) {
        super(obj, view, i);
        this.A = userManageFooterView;
        this.B = userManageHeaderView;
        this.C = linearLayout;
        this.D = nestedScrollView;
        this.E = noScrollRecyclerView;
    }
}
