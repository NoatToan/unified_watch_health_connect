package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bla extends ViewDataBinding {
    public final DataTitleView A;
    public final SportsDeviceListView B;
    public final View C;
    public final LevelBarView D;
    public final RecyclerView E;
    public final LineChartRecyclerView F;
    public final RecyclerView G;
    public final LinearLayout H;
    public final CardUnderstandView I;

    public bla(Object obj, View view, int i, DataTitleView dataTitleView, SportsDeviceListView sportsDeviceListView, View view2, LevelBarView levelBarView, RecyclerView recyclerView, LineChartRecyclerView lineChartRecyclerView, RecyclerView recyclerView2, LinearLayout linearLayout, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = sportsDeviceListView;
        this.C = view2;
        this.D = levelBarView;
        this.E = recyclerView;
        this.F = lineChartRecyclerView;
        this.G = recyclerView2;
        this.H = linearLayout;
        this.I = cardUnderstandView;
    }

    public static bla A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static bla B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bla) ViewDataBinding.G(layoutInflater, jui.V1, viewGroup, z, obj);
    }
}
