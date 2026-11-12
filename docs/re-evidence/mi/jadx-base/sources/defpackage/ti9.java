package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ti9 extends ViewDataBinding {
    public final RightArrowBindingSingleLineTextView A;
    public FeedbackItemInfo B;

    public ti9(Object obj, View view, int i, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView) {
        super(obj, view, i);
        this.A = rightArrowBindingSingleLineTextView;
    }
}
