package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportBasicInfoView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class evp extends ViewDataBinding {
    public final ImageView A;
    public final View B;
    public final TrainPlanReportBasicInfoView C;
    public final ImageView D;
    public final ImageView E;
    public final TextView F;
    public final LinearLayout G;
    public final TextView H;
    public final RecyclerView I;
    public final DataTitleSimpleView J;
    public final FrameLayout K;
    public final ConstraintLayout L;
    public final NestedScrollView M;
    public final ImageView N;
    public final ImageView O;

    public evp(Object obj, View view, int i, ImageView imageView, View view2, TrainPlanReportBasicInfoView trainPlanReportBasicInfoView, ImageView imageView2, ImageView imageView3, TextView textView, LinearLayout linearLayout, TextView textView2, RecyclerView recyclerView, DataTitleSimpleView dataTitleSimpleView, FrameLayout frameLayout, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, ImageView imageView4, ImageView imageView5) {
        super(obj, view, i);
        this.A = imageView;
        this.B = view2;
        this.C = trainPlanReportBasicInfoView;
        this.D = imageView2;
        this.E = imageView3;
        this.F = textView;
        this.G = linearLayout;
        this.H = textView2;
        this.I = recyclerView;
        this.J = dataTitleSimpleView;
        this.K = frameLayout;
        this.L = constraintLayout;
        this.M = nestedScrollView;
        this.N = imageView4;
        this.O = imageView5;
    }
}
