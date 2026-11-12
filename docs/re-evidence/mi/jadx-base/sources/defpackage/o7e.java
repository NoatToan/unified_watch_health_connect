package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o7e extends ViewDataBinding {
    public final CustomBarChart A;
    public final CustomBarChart B;
    public final HomeCardCommonTitleView C;
    public final View D;
    public final XAxisView E;

    public o7e(Object obj, View view, int i, CustomBarChart customBarChart, CustomBarChart customBarChart2, HomeCardCommonTitleView homeCardCommonTitleView, View view2, XAxisView xAxisView) {
        super(obj, view, i);
        this.A = customBarChart;
        this.B = customBarChart2;
        this.C = homeCardCommonTitleView;
        this.D = view2;
        this.E = xAxisView;
    }

    public static o7e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static o7e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (o7e) ViewDataBinding.G(layoutInflater, jui.K6, viewGroup, z, obj);
    }
}
