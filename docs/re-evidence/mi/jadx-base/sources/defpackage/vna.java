package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vna extends ViewDataBinding {
    public final LineChartRecyclerView A;
    public final RecyclerView B;
    public final j84 C;
    public final RecyclerView D;

    public vna(Object obj, View view, int i, LineChartRecyclerView lineChartRecyclerView, RecyclerView recyclerView, j84 j84Var, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.A = lineChartRecyclerView;
        this.B = recyclerView;
        this.C = j84Var;
        this.D = recyclerView2;
    }

    public static vna A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static vna B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vna) ViewDataBinding.G(layoutInflater, jui.z2, viewGroup, z, obj);
    }
}
