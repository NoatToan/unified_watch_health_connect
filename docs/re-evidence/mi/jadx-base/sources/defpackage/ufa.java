package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ufa extends ViewDataBinding {
    public final CustomLineChart A;
    public final DataTitleSimpleView B;
    public final AppCompatImageView C;
    public final RecyclerView D;

    public ufa(Object obj, View view, int i, CustomLineChart customLineChart, DataTitleSimpleView dataTitleSimpleView, AppCompatImageView appCompatImageView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = dataTitleSimpleView;
        this.C = appCompatImageView;
        this.D = recyclerView;
    }

    public static ufa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ufa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ufa) ViewDataBinding.G(layoutInflater, ivi.R, viewGroup, z, obj);
    }
}
