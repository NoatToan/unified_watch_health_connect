package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sda extends ViewDataBinding {
    public final CustomLineChart A;
    public final DataTitleSimpleView B;
    public final SportDetailItemView C;
    public final SportDetailItemView D;
    public final LinearLayout E;
    public final RecyclerView F;

    public sda(Object obj, View view, int i, CustomLineChart customLineChart, DataTitleSimpleView dataTitleSimpleView, SportDetailItemView sportDetailItemView, SportDetailItemView sportDetailItemView2, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = dataTitleSimpleView;
        this.C = sportDetailItemView;
        this.D = sportDetailItemView2;
        this.E = linearLayout;
        this.F = recyclerView;
    }
}
