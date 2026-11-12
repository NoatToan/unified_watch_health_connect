package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.health.pai.view.PaiLimitGridView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class laa extends ViewDataBinding {
    public final PaiLimitGridView A;
    public final LineChartRecyclerView B;
    public final TextView C;

    public laa(Object obj, View view, int i, PaiLimitGridView paiLimitGridView, LineChartRecyclerView lineChartRecyclerView, TextView textView) {
        super(obj, view, i);
        this.A = paiLimitGridView;
        this.B = lineChartRecyclerView;
        this.C = textView;
    }

    public static laa A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static laa B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (laa) ViewDataBinding.G(layoutInflater, jui.A0, viewGroup, z, obj);
    }
}
