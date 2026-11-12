package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberDayViewModel;
import com.xiaomi.fitness.electronic.scale.widget.DataTitleView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n5a extends ViewDataBinding {
    public final DataTitleView A;
    public final FrameLayout B;
    public final LineChartRecyclerView C;
    public final TextView D;
    public VirtualMemberDayViewModel E;

    public n5a(Object obj, View view, int i, DataTitleView dataTitleView, FrameLayout frameLayout, LineChartRecyclerView lineChartRecyclerView, TextView textView) {
        super(obj, view, i);
        this.A = dataTitleView;
        this.B = frameLayout;
        this.C = lineChartRecyclerView;
        this.D = textView;
    }
}
