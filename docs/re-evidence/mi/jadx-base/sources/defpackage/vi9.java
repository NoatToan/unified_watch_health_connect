package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.widget.SquareBindingImageView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vi9 extends ViewDataBinding {
    public final SquareBindingImageView A;
    public final TextView B;
    public FeedbackItemInfo C;

    public vi9(Object obj, View view, int i, SquareBindingImageView squareBindingImageView, TextView textView) {
        super(obj, view, i);
        this.A = squareBindingImageView;
        this.B = textView;
    }
}
