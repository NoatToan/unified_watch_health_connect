package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class yub extends ViewDataBinding {
    public final DataTitleView A;
    public final LineChartRecyclerView B;
    public final TitleBarAlphaView C;

    public yub(Object obj, View view, int i, DataTitleView dataTitleView, LineChartRecyclerView lineChartRecyclerView, TitleBarAlphaView titleBarAlphaView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = lineChartRecyclerView;
        this.C = titleBarAlphaView;
    }

    public static yub A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yub B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yub) ViewDataBinding.G(layoutInflater, jui.D3, viewGroup, z, obj);
    }
}
