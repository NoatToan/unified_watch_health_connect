package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mvb extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final TextView B;
    public final RightArrowTwoLineTextView C;

    public mvb(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, TextView textView, RightArrowTwoLineTextView rightArrowTwoLineTextView) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = textView;
        this.C = rightArrowTwoLineTextView;
    }
}
