package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class xka extends ViewDataBinding {
    public final SwitchButtonSingleLineTextView A;
    public final RightArrowTwoLineTextView B;

    public xka(Object obj, View view, int i, SwitchButtonSingleLineTextView switchButtonSingleLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView) {
        super(obj, view, i);
        this.A = switchButtonSingleLineTextView;
        this.B = rightArrowTwoLineTextView;
    }
}
