package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.view.SportRecordChartRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ro0 extends ViewDataBinding {
    public final FrameLayout A;
    public final ImageView B;
    public final SportRecordChartRecyclerView C;
    public final RecyclerView D;

    public ro0(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, SportRecordChartRecyclerView sportRecordChartRecyclerView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = imageView;
        this.C = sportRecordChartRecyclerView;
        this.D = recyclerView;
    }
}
