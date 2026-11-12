package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vwq extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final ConstraintLayout C;
    public final TextView D;

    public vwq(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = constraintLayout;
        this.D = textView2;
    }
}
