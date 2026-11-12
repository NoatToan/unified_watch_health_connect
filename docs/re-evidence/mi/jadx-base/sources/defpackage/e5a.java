package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.baseui.TitleBar;
import com.xiaomi.fitness.sport.view.widget.CustomGoalView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e5a extends ViewDataBinding {
    public final CustomGoalView A;
    public final RecyclerView B;
    public final TextView C;
    public final TitleBar D;

    public e5a(Object obj, View view, int i, CustomGoalView customGoalView, RecyclerView recyclerView, TextView textView, TitleBar titleBar) {
        super(obj, view, i);
        this.A = customGoalView;
        this.B = recyclerView;
        this.C = textView;
        this.D = titleBar;
    }
}
