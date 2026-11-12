package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uo0 extends ViewDataBinding {
    public final FrameLayout A;
    public final LinearLayout B;
    public final TextView C;
    public final TrainingPlanTitleBar D;
    public final RecyclerView E;

    public uo0(Object obj, View view, int i, FrameLayout frameLayout, LinearLayout linearLayout, TextView textView, TrainingPlanTitleBar trainingPlanTitleBar, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = linearLayout;
        this.C = textView;
        this.D = trainingPlanTitleBar;
        this.E = recyclerView;
    }
}
