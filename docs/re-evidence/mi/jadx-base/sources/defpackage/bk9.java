package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel;

/* JADX INFO: loaded from: classes8.dex */
public abstract class bk9 extends ViewDataBinding {
    public final RecyclerView A;
    public FeedbackTypesViewModel B;

    public bk9(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }
}
