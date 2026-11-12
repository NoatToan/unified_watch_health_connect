package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lg0 extends ViewDataBinding {
    public final RecyclerView A;
    public final LinearLayout B;
    public final TrainingPlanTitleBar C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;

    public lg0(Object obj, View view, int i, RecyclerView recyclerView, LinearLayout linearLayout, TrainingPlanTitleBar trainingPlanTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = linearLayout;
        this.C = trainingPlanTitleBar;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
        this.I = textView6;
        this.J = textView7;
        this.K = textView8;
        this.L = textView9;
    }
}
