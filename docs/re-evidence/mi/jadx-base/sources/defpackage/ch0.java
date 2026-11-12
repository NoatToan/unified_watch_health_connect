package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ch0 extends ViewDataBinding {
    public final View A;
    public final FrameLayout B;
    public final ImageView C;
    public final LineChartRecyclerView D;

    public ch0(Object obj, View view, int i, View view2, FrameLayout frameLayout, ImageView imageView, LineChartRecyclerView lineChartRecyclerView) {
        super(obj, view, i);
        this.A = view2;
        this.B = frameLayout;
        this.C = imageView;
        this.D = lineChartRecyclerView;
    }
}
