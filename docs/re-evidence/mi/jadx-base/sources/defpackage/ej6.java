package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ej6 extends ViewDataBinding {
    public final RecyclerView A;
    public final ConstraintLayout B;

    public ej6(Object obj, View view, int i, RecyclerView recyclerView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = constraintLayout;
    }
}
