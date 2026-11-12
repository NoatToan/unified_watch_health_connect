package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uae extends ViewDataBinding {
    public final CardView A;
    public final TextView B;
    public final CardView C;
    public final TextView D;
    public final ImageView E;
    public final MotionLayout F;
    public final TextView G;
    public final TextView H;
    public final CardView I;
    public final ConstraintLayout J;
    public final TextView K;
    public final View L;

    public uae(Object obj, View view, int i, CardView cardView, TextView textView, CardView cardView2, TextView textView2, ImageView imageView, MotionLayout motionLayout, TextView textView3, TextView textView4, CardView cardView3, ConstraintLayout constraintLayout, TextView textView5, View view2) {
        super(obj, view, i);
        this.A = cardView;
        this.B = textView;
        this.C = cardView2;
        this.D = textView2;
        this.E = imageView;
        this.F = motionLayout;
        this.G = textView3;
        this.H = textView4;
        this.I = cardView3;
        this.J = constraintLayout;
        this.K = textView5;
        this.L = view2;
    }
}
