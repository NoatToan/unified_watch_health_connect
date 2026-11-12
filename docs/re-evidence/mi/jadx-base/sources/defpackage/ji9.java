package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ji9 extends ViewDataBinding {
    public final RecyclerView A;
    public FeedbackQuestionViewModel B;

    public ji9(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }
}
