package defpackage;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qvb extends ViewDataBinding {
    public final View A;
    public final View B;
    public final LinearLayoutCompat C;
    public final RecyclerView D;

    public qvb(Object obj, View view, int i, View view2, View view3, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = view2;
        this.B = view3;
        this.C = linearLayoutCompat;
        this.D = recyclerView;
    }
}
