package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kba extends ViewDataBinding {
    public final SwitchButtonSingleLineTextView A;
    public final RightArrowSingleLineTextView B;
    public final RightArrowSingleLineTextView C;
    public final SwitchButtonSingleLineTextView D;
    public final RightArrowSingleLineTextView E;

    public kba(Object obj, View view, int i, SwitchButtonSingleLineTextView switchButtonSingleLineTextView, RightArrowSingleLineTextView rightArrowSingleLineTextView, RightArrowSingleLineTextView rightArrowSingleLineTextView2, SwitchButtonSingleLineTextView switchButtonSingleLineTextView2, RightArrowSingleLineTextView rightArrowSingleLineTextView3) {
        super(obj, view, i);
        this.A = switchButtonSingleLineTextView;
        this.B = rightArrowSingleLineTextView;
        this.C = rightArrowSingleLineTextView2;
        this.D = switchButtonSingleLineTextView2;
        this.E = rightArrowSingleLineTextView3;
    }
}
