package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.github.mikephil.charting.charts.LineChart;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pxq extends ViewDataBinding {
    public final LineChart A;
    public final ConstraintLayout B;
    public final TextView C;

    public pxq(Object obj, View view, int i, LineChart lineChart, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.A = lineChart;
        this.B = constraintLayout;
        this.C = textView;
    }

    public static pxq A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static pxq B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (pxq) ViewDataBinding.G(layoutInflater, ivi.T2, viewGroup, z, obj);
    }
}
