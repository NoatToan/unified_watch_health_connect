package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class in0 extends ViewDataBinding {
    public final FrameLayout A;
    public final MoreRecyclerView B;
    public final LinearLayout C;
    public final TrainingPlanTitleBar D;

    public in0(Object obj, View view, int i, FrameLayout frameLayout, MoreRecyclerView moreRecyclerView, LinearLayout linearLayout, TrainingPlanTitleBar trainingPlanTitleBar) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = moreRecyclerView;
        this.C = linearLayout;
        this.D = trainingPlanTitleBar;
    }
}
