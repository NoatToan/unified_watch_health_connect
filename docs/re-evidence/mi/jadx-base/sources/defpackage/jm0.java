package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jm0 extends ViewDataBinding {
    public final TextView A;
    public final FrameLayout B;
    public final ConstraintLayout C;
    public final View D;
    public final ConstraintLayout E;
    public final TextView F;
    public final TrainingPlanTitleBar G;
    public final EditText H;
    public final TextView I;

    public jm0(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, ConstraintLayout constraintLayout, View view2, ConstraintLayout constraintLayout2, TextView textView2, TrainingPlanTitleBar trainingPlanTitleBar, EditText editText, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = frameLayout;
        this.C = constraintLayout;
        this.D = view2;
        this.E = constraintLayout2;
        this.F = textView2;
        this.G = trainingPlanTitleBar;
        this.H = editText;
        this.I = textView3;
    }
}
