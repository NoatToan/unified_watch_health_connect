package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bx4 extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final MoreRecyclerView C;
    public final View D;
    public final TextView E;
    public final View F;

    public bx4(Object obj, View view, int i, ImageView imageView, ImageView imageView2, MoreRecyclerView moreRecyclerView, View view2, TextView textView, View view3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = moreRecyclerView;
        this.D = view2;
        this.E = textView;
        this.F = view3;
    }
}
