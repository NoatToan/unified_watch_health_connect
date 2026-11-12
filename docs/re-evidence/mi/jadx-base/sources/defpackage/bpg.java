package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bpg extends ViewDataBinding {
    public final RecyclerView A;
    public final FrameLayout B;

    public bpg(Object obj, View view, int i, RecyclerView recyclerView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = frameLayout;
    }
}
