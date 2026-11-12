package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.view.SportsBehaviorCircleView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class iod extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final DividerView D;
    public final SportsBehaviorCircleView E;
    public final SportsBehaviorCircleView F;
    public final RecyclerView G;
    public final SportsBehaviorCircleView H;
    public final DataTitleSimpleView I;

    public iod(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, DividerView dividerView, SportsBehaviorCircleView sportsBehaviorCircleView, SportsBehaviorCircleView sportsBehaviorCircleView2, RecyclerView recyclerView, SportsBehaviorCircleView sportsBehaviorCircleView3, DataTitleSimpleView dataTitleSimpleView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
        this.D = dividerView;
        this.E = sportsBehaviorCircleView;
        this.F = sportsBehaviorCircleView2;
        this.G = recyclerView;
        this.H = sportsBehaviorCircleView3;
        this.I = dataTitleSimpleView;
    }

    public static iod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static iod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (iod) ViewDataBinding.G(layoutInflater, ivi.o0, viewGroup, z, obj);
    }
}
