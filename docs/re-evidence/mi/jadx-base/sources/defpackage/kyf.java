package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kyf extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final RecyclerView D;
    public final TextView E;

    public kyf(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
        this.D = recyclerView;
        this.E = textView3;
    }
}
