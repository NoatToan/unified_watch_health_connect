package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.BodyConditionView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j68 extends ViewDataBinding {
    public final Guideline A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final BodyConditionView F;
    public final BodyConditionView G;
    public final BodyConditionView H;
    public final View I;
    public final BodyConditionView J;

    public j68(Object obj, View view, int i, Guideline guideline, TextView textView, TextView textView2, TextView textView3, TextView textView4, BodyConditionView bodyConditionView, BodyConditionView bodyConditionView2, BodyConditionView bodyConditionView3, View view2, BodyConditionView bodyConditionView4) {
        super(obj, view, i);
        this.A = guideline;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = bodyConditionView;
        this.G = bodyConditionView2;
        this.H = bodyConditionView3;
        this.I = view2;
        this.J = bodyConditionView4;
    }
}
