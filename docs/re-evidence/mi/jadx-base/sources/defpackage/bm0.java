package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bm0 extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final LinearLayout H;
    public final RecyclerView I;
    public final TrainingPlanTitleBar J;

    public bm0(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout, RecyclerView recyclerView, TrainingPlanTitleBar trainingPlanTitleBar) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
        this.G = textView6;
        this.H = linearLayout;
        this.I = recyclerView;
        this.J = trainingPlanTitleBar;
    }
}
