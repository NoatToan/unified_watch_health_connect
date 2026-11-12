package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan.widget.HabitHomeDetailCard;
import com.xiaomi.fitness.training_plan.widget.HabitHomeTrainFutureCard;
import com.xiaomi.fitness.training_plan.widget.HabitHomeTrainTodayCard;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hm0 extends ViewDataBinding {
    public final NestedScrollView A;
    public final FrameLayout B;
    public final SpringBackLayout C;
    public final TrainingPlanTitleBar D;
    public final HabitHomeDetailCard E;
    public final HabitHomeTrainFutureCard F;
    public final HabitHomeTrainTodayCard G;
    public final TextView H;
    public final ConstraintLayout I;
    public final ImageView J;
    public final TextView K;
    public final TextView L;

    public hm0(Object obj, View view, int i, NestedScrollView nestedScrollView, FrameLayout frameLayout, SpringBackLayout springBackLayout, TrainingPlanTitleBar trainingPlanTitleBar, HabitHomeDetailCard habitHomeDetailCard, HabitHomeTrainFutureCard habitHomeTrainFutureCard, HabitHomeTrainTodayCard habitHomeTrainTodayCard, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = nestedScrollView;
        this.B = frameLayout;
        this.C = springBackLayout;
        this.D = trainingPlanTitleBar;
        this.E = habitHomeDetailCard;
        this.F = habitHomeTrainFutureCard;
        this.G = habitHomeTrainTodayCard;
        this.H = textView;
        this.I = constraintLayout;
        this.J = imageView;
        this.K = textView2;
        this.L = textView3;
    }
}
