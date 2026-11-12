package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yi6 extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final NestedScrollView C;
    public final RightArrowTwoLineTextView D;
    public final RightArrowTwoLineTextView E;
    public final RightArrowTwoLineTextView F;
    public final LinearLayout G;
    public final RelativeLayout H;
    public final SwitchButtonTwoLineTextView I;
    public final TextView J;
    public final TextView K;

    public yi6(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, NestedScrollView nestedScrollView, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView2, RightArrowTwoLineTextView rightArrowTwoLineTextView3, LinearLayout linearLayout2, RelativeLayout relativeLayout, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = nestedScrollView;
        this.D = rightArrowTwoLineTextView;
        this.E = rightArrowTwoLineTextView2;
        this.F = rightArrowTwoLineTextView3;
        this.G = linearLayout2;
        this.H = relativeLayout;
        this.I = switchButtonTwoLineTextView;
        this.J = textView2;
        this.K = textView3;
    }
}
