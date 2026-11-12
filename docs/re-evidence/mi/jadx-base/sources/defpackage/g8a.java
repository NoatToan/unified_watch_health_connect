package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g8a extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final LineChartRecyclerView B;

    public g8a(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, LineChartRecyclerView lineChartRecyclerView) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = lineChartRecyclerView;
    }

    public static g8a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static g8a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (g8a) ViewDataBinding.G(layoutInflater, jui.n0, viewGroup, z, obj);
    }
}
