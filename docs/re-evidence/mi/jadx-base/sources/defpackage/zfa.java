package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zfa extends ViewDataBinding {
    public final CustomLineChart A;
    public final DataTitleSimpleView B;
    public final SportDetailItemView C;
    public final SportDetailItemView D;
    public final LinearLayout E;
    public final AppCompatImageView F;

    public zfa(Object obj, View view, int i, CustomLineChart customLineChart, DataTitleSimpleView dataTitleSimpleView, SportDetailItemView sportDetailItemView, SportDetailItemView sportDetailItemView2, LinearLayout linearLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = dataTitleSimpleView;
        this.C = sportDetailItemView;
        this.D = sportDetailItemView2;
        this.E = linearLayout;
        this.F = appCompatImageView;
    }

    public static zfa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static zfa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zfa) ViewDataBinding.G(layoutInflater, ivi.T, viewGroup, z, obj);
    }
}
