package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vg0 extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final TrainingPlanTitleBar B;
    public final RightArrowBindingSingleLineTextView C;
    public final RightArrowBindingSingleLineTextView D;
    public final SwitchButtonBindingTwoLineTextView E;
    public final RightArrowBindingSingleLineTextView F;
    public final SwitchButtonBindingTwoLineTextView G;

    public vg0(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, TrainingPlanTitleBar trainingPlanTitleBar, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView2, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView3, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = trainingPlanTitleBar;
        this.C = rightArrowBindingSingleLineTextView;
        this.D = rightArrowBindingSingleLineTextView2;
        this.E = switchButtonBindingTwoLineTextView;
        this.F = rightArrowBindingSingleLineTextView3;
        this.G = switchButtonBindingTwoLineTextView2;
    }
}
