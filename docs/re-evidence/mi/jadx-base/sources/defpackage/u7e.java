package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.mpchart.linechart.DataCubicLineChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u7e extends ViewDataBinding {
    public final HomeCardCommonTitleView A;
    public final View B;
    public final DataCubicLineChart C;
    public final XAxisView D;

    public u7e(Object obj, View view, int i, HomeCardCommonTitleView homeCardCommonTitleView, View view2, DataCubicLineChart dataCubicLineChart, XAxisView xAxisView) {
        super(obj, view, i);
        this.A = homeCardCommonTitleView;
        this.B = view2;
        this.C = dataCubicLineChart;
        this.D = xAxisView;
    }

    public static u7e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static u7e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (u7e) ViewDataBinding.G(layoutInflater, jui.M6, viewGroup, z, obj);
    }
}
