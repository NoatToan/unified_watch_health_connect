package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineDetailChartRecyclerView;
import com.xiaomi.fitness.chart.view.SleepChartRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zbe extends ViewDataBinding {
    public final SleepChartRecyclerView A;
    public final View B;
    public final ImageView C;
    public final FrameLayout D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final LineDetailChartRecyclerView G;
    public final LineDetailChartRecyclerView H;

    public zbe(Object obj, View view, int i, SleepChartRecyclerView sleepChartRecyclerView, View view2, ImageView imageView, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LineDetailChartRecyclerView lineDetailChartRecyclerView, LineDetailChartRecyclerView lineDetailChartRecyclerView2) {
        super(obj, view, i);
        this.A = sleepChartRecyclerView;
        this.B = view2;
        this.C = imageView;
        this.D = frameLayout;
        this.E = linearLayout;
        this.F = linearLayout2;
        this.G = lineDetailChartRecyclerView;
        this.H = lineDetailChartRecyclerView2;
    }
}
