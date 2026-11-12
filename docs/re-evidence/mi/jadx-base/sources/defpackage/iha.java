package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class iha extends ViewDataBinding {
    public final CustomLineChart A;
    public final DataTitleSimpleView B;
    public final RecyclerView C;

    public iha(Object obj, View view, int i, CustomLineChart customLineChart, DataTitleSimpleView dataTitleSimpleView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = dataTitleSimpleView;
        this.C = recyclerView;
    }

    public static iha A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static iha B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (iha) ViewDataBinding.G(layoutInflater, ivi.f0, viewGroup, z, obj);
    }
}
