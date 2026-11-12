package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.mpchart.linechart.DataCubicLineChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class s7e extends ViewDataBinding {
    public final HomeCardCommonTitleView A;
    public final View B;
    public final AppCompatImageView C;
    public final LevelBarView D;
    public final DataCubicLineChart E;
    public final XAxisView F;

    public s7e(Object obj, View view, int i, HomeCardCommonTitleView homeCardCommonTitleView, View view2, AppCompatImageView appCompatImageView, LevelBarView levelBarView, DataCubicLineChart dataCubicLineChart, XAxisView xAxisView) {
        super(obj, view, i);
        this.A = homeCardCommonTitleView;
        this.B = view2;
        this.C = appCompatImageView;
        this.D = levelBarView;
        this.E = dataCubicLineChart;
        this.F = xAxisView;
    }

    public static s7e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static s7e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (s7e) ViewDataBinding.G(layoutInflater, jui.L6, viewGroup, z, obj);
    }
}
