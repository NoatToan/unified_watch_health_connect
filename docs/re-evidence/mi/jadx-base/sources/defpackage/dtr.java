package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dtr extends ViewDataBinding {
    public final ixq A;
    public final RecyclerView B;

    public dtr(Object obj, View view, int i, ixq ixqVar, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = ixqVar;
        this.B = recyclerView;
    }
}
