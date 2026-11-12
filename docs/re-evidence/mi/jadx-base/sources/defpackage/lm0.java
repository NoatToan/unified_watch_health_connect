package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lm0 extends ViewDataBinding {
    public final LinearLayout A;
    public final TrainingPlanTitleBar B;
    public final SwitchButtonBindingTwoLineTextView C;
    public final RightArrowBindingSingleLineTextView D;
    public final SwitchButtonBindingTwoLineTextView E;

    public lm0(Object obj, View view, int i, LinearLayout linearLayout, TrainingPlanTitleBar trainingPlanTitleBar, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = trainingPlanTitleBar;
        this.C = switchButtonBindingTwoLineTextView;
        this.D = rightArrowBindingSingleLineTextView;
        this.E = switchButtonBindingTwoLineTextView2;
    }
}
