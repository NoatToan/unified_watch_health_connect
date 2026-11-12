package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ng0 extends ViewDataBinding {
    public final LinearLayout A;
    public final RelativeLayout B;
    public final TextView C;
    public final View D;
    public final Button E;
    public final TrainingPlanTitleBar F;

    public ng0(Object obj, View view, int i, LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, View view2, Button button, TrainingPlanTitleBar trainingPlanTitleBar) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = relativeLayout;
        this.C = textView;
        this.D = view2;
        this.E = button;
        this.F = trainingPlanTitleBar;
    }
}
