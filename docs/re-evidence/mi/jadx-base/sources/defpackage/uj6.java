package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class uj6 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final RecyclerView B;
    public final RecyclerView C;
    public final TextView D;

    public uj6(Object obj, View view, int i, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = recyclerView;
        this.C = recyclerView2;
        this.D = textView;
    }
}
