package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.health.vitality.VitalityProgressView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.DataTitleView;
import com.xiaomi.fitness.widget.button.SwitchButton;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vma extends ViewDataBinding {
    public final DataTitleView A;
    public final SportsDeviceListView B;
    public final ImageView C;
    public final LinearLayout D;
    public final RecyclerView E;
    public final SwitchButton F;
    public final TextView G;
    public final TextView H;
    public final CardUnderstandView I;
    public final VitalityProgressView J;
    public final BarChartRecyclerView K;

    public vma(Object obj, View view, int i, DataTitleView dataTitleView, SportsDeviceListView sportsDeviceListView, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, SwitchButton switchButton, TextView textView, TextView textView2, CardUnderstandView cardUnderstandView, VitalityProgressView vitalityProgressView, BarChartRecyclerView barChartRecyclerView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = sportsDeviceListView;
        this.C = imageView;
        this.D = linearLayout;
        this.E = recyclerView;
        this.F = switchButton;
        this.G = textView;
        this.H = textView2;
        this.I = cardUnderstandView;
        this.J = vitalityProgressView;
        this.K = barChartRecyclerView;
    }

    public static vma A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static vma B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vma) ViewDataBinding.G(layoutInflater, jui.m2, viewGroup, z, obj);
    }
}
