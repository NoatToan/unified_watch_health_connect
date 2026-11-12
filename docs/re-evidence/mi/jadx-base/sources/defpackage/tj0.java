package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.github.chrisbanes.photoview.PhotoView;
import com.xiaomi.fitness.electronic.scale.widget.BodyCompositionAnalysisView;
import com.xiaomi.fitness.electronic.scale.widget.BodyIndexScoreView;
import com.xiaomi.fitness.electronic.scale.widget.EvaluationIndexView;
import com.xiaomi.fitness.electronic.scale.widget.FatAnalysisView;
import com.xiaomi.fitness.electronic.scale.widget.SkeletalMuscleAnalysisView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tj0 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final Guideline B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final LinearLayout F;
    public final PhotoView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final BodyCompositionAnalysisView Q;
    public final BodyIndexScoreView R;
    public final LinearLayout S;
    public final EvaluationIndexView T;
    public final FatAnalysisView U;
    public final ConstraintLayout V;
    public final SkeletalMuscleAnalysisView W;
    public View.OnClickListener X;

    public tj0(Object obj, View view, int i, ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, PhotoView photoView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, BodyCompositionAnalysisView bodyCompositionAnalysisView, BodyIndexScoreView bodyIndexScoreView, LinearLayout linearLayout2, EvaluationIndexView evaluationIndexView, FatAnalysisView fatAnalysisView, ConstraintLayout constraintLayout2, SkeletalMuscleAnalysisView skeletalMuscleAnalysisView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = guideline;
        this.C = imageView;
        this.D = imageView2;
        this.E = imageView3;
        this.F = linearLayout;
        this.G = photoView;
        this.H = textView;
        this.I = textView2;
        this.J = textView3;
        this.K = textView4;
        this.L = textView5;
        this.M = textView6;
        this.N = textView7;
        this.O = textView8;
        this.P = textView9;
        this.Q = bodyCompositionAnalysisView;
        this.R = bodyIndexScoreView;
        this.S = linearLayout2;
        this.T = evaluationIndexView;
        this.U = fatAnalysisView;
        this.V = constraintLayout2;
        this.W = skeletalMuscleAnalysisView;
    }

    public abstract void setOnClick(View.OnClickListener onClickListener);
}
