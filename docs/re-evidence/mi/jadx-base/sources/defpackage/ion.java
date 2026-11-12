package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.view.launch.gym.report.ReceiveVM;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ion extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final View C;
    public ReceiveVM D;

    public ion(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, View view2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = view2;
    }
}
