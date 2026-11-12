package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.health.pai.view.PaiLimitGridView;
import com.xiaomi.fitness.health.pai.view.PaiProgressView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jaa extends ViewDataBinding {
    public final DataTitleView A;
    public final SportsDeviceListView B;
    public final DataTitleView C;
    public final ImageView D;
    public final ImageView E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final PaiLimitGridView H;
    public final PaiProgressView I;
    public final BarChartRecyclerView J;
    public final BarChartRecyclerView K;
    public final TextView L;
    public final TextView M;
    public final CardUnderstandView N;

    public jaa(Object obj, View view, int i, DataTitleView dataTitleView, SportsDeviceListView sportsDeviceListView, DataTitleView dataTitleView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, PaiLimitGridView paiLimitGridView, PaiProgressView paiProgressView, BarChartRecyclerView barChartRecyclerView, BarChartRecyclerView barChartRecyclerView2, TextView textView, TextView textView2, CardUnderstandView cardUnderstandView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = sportsDeviceListView;
        this.C = dataTitleView2;
        this.D = imageView;
        this.E = imageView2;
        this.F = linearLayout;
        this.G = linearLayout2;
        this.H = paiLimitGridView;
        this.I = paiProgressView;
        this.J = barChartRecyclerView;
        this.K = barChartRecyclerView2;
        this.L = textView;
        this.M = textView2;
        this.N = cardUnderstandView;
    }

    public static jaa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static jaa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (jaa) ViewDataBinding.G(layoutInflater, jui.z0, viewGroup, z, obj);
    }
}
