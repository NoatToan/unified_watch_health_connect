package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mx8 extends ViewDataBinding {
    public final Group A;
    public final ImageView B;
    public final MoreRecyclerView C;
    public final TextView D;

    public mx8(Object obj, View view, int i, Group group, ImageView imageView, MoreRecyclerView moreRecyclerView, TextView textView) {
        super(obj, view, i);
        this.A = group;
        this.B = imageView;
        this.C = moreRecyclerView;
        this.D = textView;
    }
}
