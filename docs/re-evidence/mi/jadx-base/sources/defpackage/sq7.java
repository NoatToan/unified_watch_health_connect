package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sq7 extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final ConstraintLayout C;
    public final ImageView D;
    public BindRopeSkippingListViewModel E;

    public sq7(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = constraintLayout;
        this.D = imageView;
    }
}
