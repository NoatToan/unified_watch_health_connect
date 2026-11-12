package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aam extends ViewDataBinding {
    public final CustomLineChart A;
    public final LinearLayout B;
    public final TextView C;

    public aam(Object obj, View view, int i, CustomLineChart customLineChart, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.A = customLineChart;
        this.B = linearLayout;
        this.C = textView;
    }

    public static aam A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static aam B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (aam) ViewDataBinding.G(layoutInflater, ivi.x1, viewGroup, z, obj);
    }
}
