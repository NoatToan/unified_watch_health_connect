package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel;
import com.xiaomi.fitness.userinfo.medicalid.baseui.MedicalCardEntranceView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fkq extends ViewDataBinding {
    public final RelativeLayout A;
    public final LinearLayout B;
    public final TextView C;
    public final LinearLayout D;
    public final MedicalCardEntranceView E;
    public final ConstraintLayout F;
    public final View G;
    public final RecyclerView H;
    public final TrainingPlanTitleBar I;
    public final RecyclerView J;
    public final NestedScrollView K;
    public final TextView L;
    public final SpringBackLayout M;
    public final ImageView N;
    public final TextView O;
    public final RoundImageView P;
    public UserinfoSelectViewModel Q;

    public fkq(Object obj, View view, int i, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, MedicalCardEntranceView medicalCardEntranceView, ConstraintLayout constraintLayout, View view2, RecyclerView recyclerView, TrainingPlanTitleBar trainingPlanTitleBar, RecyclerView recyclerView2, NestedScrollView nestedScrollView, TextView textView2, SpringBackLayout springBackLayout, ImageView imageView, TextView textView3, RoundImageView roundImageView) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = linearLayout;
        this.C = textView;
        this.D = linearLayout2;
        this.E = medicalCardEntranceView;
        this.F = constraintLayout;
        this.G = view2;
        this.H = recyclerView;
        this.I = trainingPlanTitleBar;
        this.J = recyclerView2;
        this.K = nestedScrollView;
        this.L = textView2;
        this.M = springBackLayout;
        this.N = imageView;
        this.O = textView3;
        this.P = roundImageView;
    }
}
