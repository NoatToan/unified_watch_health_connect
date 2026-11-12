package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class cyb extends ViewDataBinding {
    public final ConstraintLayout A;
    public final RecyclerView B;

    public cyb(Object obj, View view, int i, ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = recyclerView;
    }
}
