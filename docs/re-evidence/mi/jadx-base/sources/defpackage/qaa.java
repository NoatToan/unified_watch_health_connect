package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.chart.view.LineDetailChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qaa extends ViewDataBinding {
    public final ConstraintLayout A;
    public final DataTitleSimpleView B;
    public final DataTitleView C;
    public final DataTitleView D;
    public final DataTitleView E;
    public final SportsDeviceListView F;
    public final View G;
    public final LevelBarView H;
    public final RecyclerView I;
    public final TextView J;
    public final TextView K;
    public final LineDetailChartRecyclerView L;
    public final LineChartRecyclerView M;
    public final LineChartRecyclerView N;
    public final RecyclerView O;
    public final LinearLayout P;
    public final CardUnderstandView Q;

    public qaa(Object obj, View view, int i, ConstraintLayout constraintLayout, DataTitleSimpleView dataTitleSimpleView, DataTitleView dataTitleView, DataTitleView dataTitleView2, DataTitleView dataTitleView3, SportsDeviceListView sportsDeviceListView, View view2, LevelBarView levelBarView, RecyclerView recyclerView, TextView textView, TextView textView2, LineDetailChartRecyclerView lineDetailChartRecyclerView, LineChartRecyclerView lineChartRecyclerView, LineChartRecyclerView lineChartRecyclerView2, RecyclerView recyclerView2, LinearLayout linearLayout, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = dataTitleSimpleView;
        this.C = dataTitleView;
        this.D = dataTitleView2;
        this.E = dataTitleView3;
        this.F = sportsDeviceListView;
        this.G = view2;
        this.H = levelBarView;
        this.I = recyclerView;
        this.J = textView;
        this.K = textView2;
        this.L = lineDetailChartRecyclerView;
        this.M = lineChartRecyclerView;
        this.N = lineChartRecyclerView2;
        this.O = recyclerView2;
        this.P = linearLayout;
        this.Q = cardUnderstandView;
    }

    public static qaa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qaa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qaa) ViewDataBinding.G(layoutInflater, jui.B0, viewGroup, z, obj);
    }
}
