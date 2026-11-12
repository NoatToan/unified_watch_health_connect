package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.SymChartRecordInfoView;
import com.xiaomi.fitness.health.curse.view.SymMoodChartRecordInfoView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class osb extends ViewDataBinding {
    public final View A;
    public final SymChartRecordInfoView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final TextView E;
    public final SymChartRecordInfoView F;
    public final SymMoodChartRecordInfoView G;
    public final TextView H;
    public final NestedScrollView I;
    public final TextView J;

    public osb(Object obj, View view, int i, View view2, SymChartRecordInfoView symChartRecordInfoView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, SymChartRecordInfoView symChartRecordInfoView2, SymMoodChartRecordInfoView symMoodChartRecordInfoView, TextView textView3, NestedScrollView nestedScrollView, TextView textView4) {
        super(obj, view, i);
        this.A = view2;
        this.B = symChartRecordInfoView;
        this.C = constraintLayout;
        this.D = textView;
        this.E = textView2;
        this.F = symChartRecordInfoView2;
        this.G = symMoodChartRecordInfoView;
        this.H = textView3;
        this.I = nestedScrollView;
        this.J = textView4;
    }
}
