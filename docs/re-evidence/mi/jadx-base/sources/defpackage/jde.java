package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jde extends ViewDataBinding {
    public final RecyclerView A;
    public final RecyclerView B;

    public jde(Object obj, View view, int i, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = recyclerView2;
    }
}
