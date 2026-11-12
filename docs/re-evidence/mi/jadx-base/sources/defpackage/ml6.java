package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ml6 extends ViewDataBinding {
    public final RecyclerView A;
    public final LinearLayout B;
    public final ProgressBar C;

    public ml6(Object obj, View view, int i, RecyclerView recyclerView, LinearLayout linearLayout, ProgressBar progressBar) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = linearLayout;
        this.C = progressBar;
    }
}
