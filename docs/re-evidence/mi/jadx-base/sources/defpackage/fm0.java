package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fm0 extends ViewDataBinding {
    public final FrameLayout A;
    public final LinearLayout B;
    public final MoreRecyclerView C;
    public final TrainingPlanTitleBar D;

    public fm0(Object obj, View view, int i, FrameLayout frameLayout, LinearLayout linearLayout, MoreRecyclerView moreRecyclerView, TrainingPlanTitleBar trainingPlanTitleBar) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = linearLayout;
        this.C = moreRecyclerView;
        this.D = trainingPlanTitleBar;
    }
}
