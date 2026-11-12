package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.training_plan_export.widget.TrainingStartBtn;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tg0 extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final LinearLayout E;
    public final RelativeLayout F;
    public final ImageView G;
    public final TrainingPlanTitleBar H;
    public final TrainingStartBtn I;

    public tg0(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, RelativeLayout relativeLayout, ImageView imageView, TrainingPlanTitleBar trainingPlanTitleBar, TrainingStartBtn trainingStartBtn) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = linearLayout;
        this.F = relativeLayout;
        this.G = imageView;
        this.H = trainingPlanTitleBar;
        this.I = trainingStartBtn;
    }
}
