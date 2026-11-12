package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z5a extends ViewDataBinding {
    public final RelativeLayout A;
    public final MoreRecyclerView B;
    public final TextView C;

    public z5a(Object obj, View view, int i, RelativeLayout relativeLayout, MoreRecyclerView moreRecyclerView, TextView textView) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = moreRecyclerView;
        this.C = textView;
    }
}
