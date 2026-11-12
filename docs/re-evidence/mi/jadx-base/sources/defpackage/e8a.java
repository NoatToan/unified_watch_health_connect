package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e8a extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final BarChartRecyclerView B;

    public e8a(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, BarChartRecyclerView barChartRecyclerView) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = barChartRecyclerView;
    }

    public static e8a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static e8a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (e8a) ViewDataBinding.G(layoutInflater, jui.o0, viewGroup, z, obj);
    }
}
