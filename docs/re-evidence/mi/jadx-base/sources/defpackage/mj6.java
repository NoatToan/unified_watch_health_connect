package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mj6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final RecyclerView B;
    public final RightArrowTwoLineTextView C;
    public final DividerView D;
    public final TextView E;
    public final NestedScrollView F;
    public final ConstraintLayout G;
    public final TextView H;
    public final SwitchButtonTwoLineTextView I;
    public final RightArrowSingleLineTextView J;

    public mj6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, RecyclerView recyclerView, RightArrowTwoLineTextView rightArrowTwoLineTextView, DividerView dividerView, TextView textView, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, TextView textView2, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2, RightArrowSingleLineTextView rightArrowSingleLineTextView) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = recyclerView;
        this.C = rightArrowTwoLineTextView;
        this.D = dividerView;
        this.E = textView;
        this.F = nestedScrollView;
        this.G = constraintLayout;
        this.H = textView2;
        this.I = switchButtonTwoLineTextView2;
        this.J = rightArrowSingleLineTextView;
    }
}
