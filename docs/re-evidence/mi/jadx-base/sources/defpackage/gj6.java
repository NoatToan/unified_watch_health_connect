package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gj6 extends ViewDataBinding {
    public final Button A;
    public final RecyclerView B;
    public final NestedScrollView C;
    public final ConstraintLayout D;

    public gj6(Object obj, View view, int i, Button button, RecyclerView recyclerView, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = button;
        this.B = recyclerView;
        this.C = nestedScrollView;
        this.D = constraintLayout;
    }
}
