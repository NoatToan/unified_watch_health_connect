package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mrp extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final orp C;
    public final NestedScrollView D;

    public mrp(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, orp orpVar, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = orpVar;
        this.D = nestedScrollView;
    }
}
