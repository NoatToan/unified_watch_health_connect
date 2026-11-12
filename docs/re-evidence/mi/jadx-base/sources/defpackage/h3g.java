package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h3g extends ViewDataBinding {
    public final CustomLineChart A;
    public final DataTitleSimpleView B;
    public final SportDetailItemView C;
    public final SportDetailItemView D;
    public final LinearLayout E;

    public h3g(Object obj, View view, int i, CustomLineChart customLineChart, DataTitleSimpleView dataTitleSimpleView, SportDetailItemView sportDetailItemView, SportDetailItemView sportDetailItemView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = dataTitleSimpleView;
        this.C = sportDetailItemView;
        this.D = sportDetailItemView2;
        this.E = linearLayout;
    }
}
