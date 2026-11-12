package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.bugreport.FeedbackDeviceInfo;
import com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ni9 extends ViewDataBinding {
    public final RightArrowBindingSingleLineTextView A;
    public final FrameLayout B;
    public FeedbackDeviceInfo C;
    public FeedbackTypesViewModel D;

    public ni9(Object obj, View view, int i, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = rightArrowBindingSingleLineTextView;
        this.B = frameLayout;
    }
}
