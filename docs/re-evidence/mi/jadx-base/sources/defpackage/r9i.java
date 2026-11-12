package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class r9i extends ViewDataBinding {
    public final RecyclerView A;

    public r9i(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = recyclerView;
    }
}
