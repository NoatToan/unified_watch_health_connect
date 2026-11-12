package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;

/* JADX INFO: loaded from: classes8.dex */
public abstract class bj9 extends ViewDataBinding {
    public final TextView A;
    public FeedbackItemInfo B;

    public bj9(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }
}
