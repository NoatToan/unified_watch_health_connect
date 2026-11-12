package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mjq extends ViewDataBinding {
    public final SwitchButtonBindingSingleLineTextView A;
    public final RightArrowSingleLineTextView B;

    public mjq(Object obj, View view, int i, SwitchButtonBindingSingleLineTextView switchButtonBindingSingleLineTextView, RightArrowSingleLineTextView rightArrowSingleLineTextView) {
        super(obj, view, i);
        this.A = switchButtonBindingSingleLineTextView;
        this.B = rightArrowSingleLineTextView;
    }
}
