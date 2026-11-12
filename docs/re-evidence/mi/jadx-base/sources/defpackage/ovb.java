package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ovb extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final RecyclerView B;
    public final View C;
    public final View D;

    public ovb(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, View view2, View view3) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = recyclerView;
        this.C = view2;
        this.D = view3;
    }
}
