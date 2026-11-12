package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rg0 extends ViewDataBinding {
    public final View A;
    public final ScrollView B;
    public final LinearLayout C;
    public final TextView D;
    public final TrainingPlanTitleBar E;

    public rg0(Object obj, View view, int i, View view2, ScrollView scrollView, LinearLayout linearLayout, TextView textView, TrainingPlanTitleBar trainingPlanTitleBar) {
        super(obj, view, i);
        this.A = view2;
        this.B = scrollView;
        this.C = linearLayout;
        this.D = textView;
        this.E = trainingPlanTitleBar;
    }
}
