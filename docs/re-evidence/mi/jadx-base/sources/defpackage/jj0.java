package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.sliding.BodyIndexSlidingViewV2;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jj0 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final BodyIndexSlidingViewV2 E;
    public final ImageView F;
    public final TextView G;
    public final RelativeLayout H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final RelativeLayout M;
    public final ConstraintLayout N;

    public jj0(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, BodyIndexSlidingViewV2 bodyIndexSlidingViewV2, ImageView imageView, TextView textView4, RelativeLayout relativeLayout, TextView textView5, TextView textView6, TextView textView7, TextView textView8, RelativeLayout relativeLayout2, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = bodyIndexSlidingViewV2;
        this.F = imageView;
        this.G = textView4;
        this.H = relativeLayout;
        this.I = textView5;
        this.J = textView6;
        this.K = textView7;
        this.L = textView8;
        this.M = relativeLayout2;
        this.N = constraintLayout2;
    }
}
