package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.devicesettings.common.track.TrackViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ui6 extends ViewDataBinding {
    public final cl6 A;
    public final FrameLayout B;
    public final yk6 C;
    public final MoreRecyclerView D;
    public final TextView E;
    public final View F;
    public TrackViewModel G;

    public ui6(Object obj, View view, int i, cl6 cl6Var, FrameLayout frameLayout, yk6 yk6Var, MoreRecyclerView moreRecyclerView, TextView textView, View view2) {
        super(obj, view, i);
        this.A = cl6Var;
        this.B = frameLayout;
        this.C = yk6Var;
        this.D = moreRecyclerView;
        this.E = textView;
        this.F = view2;
    }
}
