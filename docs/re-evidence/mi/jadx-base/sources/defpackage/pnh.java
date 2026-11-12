package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pnh extends ViewDataBinding {
    public final MoreRecyclerView A;
    public final TextView B;

    public pnh(Object obj, View view, int i, MoreRecyclerView moreRecyclerView, TextView textView) {
        super(obj, view, i);
        this.A = moreRecyclerView;
        this.B = textView;
    }
}
