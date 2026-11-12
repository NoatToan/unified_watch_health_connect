package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zmg extends ViewDataBinding {
    public final LinearLayout A;
    public final ConstraintLayout B;
    public final View C;
    public final SwitchButtonTwoLineTextView D;

    public zmg(Object obj, View view, int i, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view2, SwitchButtonTwoLineTextView switchButtonTwoLineTextView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = constraintLayout;
        this.C = view2;
        this.D = switchButtonTwoLineTextView;
    }
}
