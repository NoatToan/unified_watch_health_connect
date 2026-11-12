package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.UserinfoSelectViewModel;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class rk0 extends ViewDataBinding {
    public final Button A;
    public final LinearLayout B;
    public final ConstraintLayout C;
    public final RightArrowSingleLineTextView D;
    public final RightArrowSingleLineTextView E;
    public final RightArrowSingleLineTextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final RoundImageView K;
    public UserinfoSelectViewModel L;

    public rk0(Object obj, View view, int i, Button button, LinearLayout linearLayout, ConstraintLayout constraintLayout, RightArrowSingleLineTextView rightArrowSingleLineTextView, RightArrowSingleLineTextView rightArrowSingleLineTextView2, RightArrowSingleLineTextView rightArrowSingleLineTextView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, RoundImageView roundImageView) {
        super(obj, view, i);
        this.A = button;
        this.B = linearLayout;
        this.C = constraintLayout;
        this.D = rightArrowSingleLineTextView;
        this.E = rightArrowSingleLineTextView2;
        this.F = rightArrowSingleLineTextView3;
        this.G = textView;
        this.H = textView2;
        this.I = textView3;
        this.J = textView4;
        this.K = roundImageView;
    }
}
