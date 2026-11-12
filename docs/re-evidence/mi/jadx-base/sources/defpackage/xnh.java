package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xnh extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final Group C;
    public final MoreRecyclerView D;

    public xnh(Object obj, View view, int i, TextView textView, ImageView imageView, Group group, MoreRecyclerView moreRecyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = group;
        this.D = moreRecyclerView;
    }
}
