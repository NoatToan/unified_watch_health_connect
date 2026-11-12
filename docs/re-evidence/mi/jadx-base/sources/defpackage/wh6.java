package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wh6 extends ViewDataBinding {
    public final SwitchButtonSingleLineTextView A;
    public final RightArrowBindingSingleLineTextView B;

    public wh6(Object obj, View view, int i, SwitchButtonSingleLineTextView switchButtonSingleLineTextView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView) {
        super(obj, view, i);
        this.A = switchButtonSingleLineTextView;
        this.B = rightArrowBindingSingleLineTextView;
    }
}
