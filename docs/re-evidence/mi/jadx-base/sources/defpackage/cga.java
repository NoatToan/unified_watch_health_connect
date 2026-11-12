package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cga extends ViewDataBinding {
    public final CustomLineChart A;
    public final DataTitleSimpleView B;
    public final SportDetailItemView C;
    public final SportDetailItemView D;
    public final LinearLayout E;
    public final AppCompatImageView F;
    public final RecyclerView G;

    public cga(Object obj, View view, int i, CustomLineChart customLineChart, DataTitleSimpleView dataTitleSimpleView, SportDetailItemView sportDetailItemView, SportDetailItemView sportDetailItemView2, LinearLayout linearLayout, AppCompatImageView appCompatImageView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = dataTitleSimpleView;
        this.C = sportDetailItemView;
        this.D = sportDetailItemView2;
        this.E = linearLayout;
        this.F = appCompatImageView;
        this.G = recyclerView;
    }

    public static cga A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static cga B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (cga) ViewDataBinding.G(layoutInflater, ivi.U, viewGroup, z, obj);
    }
}
