package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.trail.widget.RecordChartView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vop extends ViewDataBinding {
    public final RecordChartView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ConstraintLayout F;

    public vop(Object obj, View view, int i, RecordChartView recordChartView, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = recordChartView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = constraintLayout;
    }

    public static vop A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static vop B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vop) ViewDataBinding.G(layoutInflater, ivi.L1, viewGroup, z, obj);
    }
}
