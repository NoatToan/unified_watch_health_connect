package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan.widget.AbilityMedalProgressLayout;
import com.xiaomi.fitness.training_plan.widget.AbilityMedalProgressLayoutTablet;
import com.xiaomi.fitness.training_plan.widget.AbilitySummaryLayout;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pg0 extends ViewDataBinding {
    public final AbilitySummaryLayout A;
    public final NestedScrollView B;
    public final LinearLayout C;
    public final AbilityMedalProgressLayout D;
    public final AbilityMedalProgressLayoutTablet E;
    public final LinearLayout F;
    public final FrameLayout G;
    public final SpringBackLayout H;
    public final TrainingPlanTitleBar I;

    public pg0(Object obj, View view, int i, AbilitySummaryLayout abilitySummaryLayout, NestedScrollView nestedScrollView, LinearLayout linearLayout, AbilityMedalProgressLayout abilityMedalProgressLayout, AbilityMedalProgressLayoutTablet abilityMedalProgressLayoutTablet, LinearLayout linearLayout2, FrameLayout frameLayout, SpringBackLayout springBackLayout, TrainingPlanTitleBar trainingPlanTitleBar) {
        super(obj, view, i);
        this.A = abilitySummaryLayout;
        this.B = nestedScrollView;
        this.C = linearLayout;
        this.D = abilityMedalProgressLayout;
        this.E = abilityMedalProgressLayoutTablet;
        this.F = linearLayout2;
        this.G = frameLayout;
        this.H = springBackLayout;
        this.I = trainingPlanTitleBar;
    }
}
