package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan.widget.HabitSuggestCard;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nm0 extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final View C;
    public final Guideline D;
    public final ConstraintLayout E;
    public final TextView F;
    public final HabitSuggestCard G;
    public final HabitSuggestCard H;
    public final TrainingPlanTitleBar I;
    public final RoundImageView J;
    public final LinearLayout K;
    public final TextView L;
    public final TextView M;

    public nm0(Object obj, View view, int i, TextView textView, View view2, View view3, Guideline guideline, ConstraintLayout constraintLayout, TextView textView2, HabitSuggestCard habitSuggestCard, HabitSuggestCard habitSuggestCard2, TrainingPlanTitleBar trainingPlanTitleBar, RoundImageView roundImageView, LinearLayout linearLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = view3;
        this.D = guideline;
        this.E = constraintLayout;
        this.F = textView2;
        this.G = habitSuggestCard;
        this.H = habitSuggestCard2;
        this.I = trainingPlanTitleBar;
        this.J = roundImageView;
        this.K = linearLayout;
        this.L = textView3;
        this.M = textView4;
    }
}
