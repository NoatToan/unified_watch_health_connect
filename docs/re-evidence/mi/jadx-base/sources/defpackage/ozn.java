package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ozn extends ViewDataBinding {
    public final RecyclerView A;
    public final NestedScrollView B;
    public final AppCompatTextView C;
    public final RecyclerView D;

    public ozn(Object obj, View view, int i, RecyclerView recyclerView, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = nestedScrollView;
        this.C = appCompatTextView;
        this.D = recyclerView2;
    }
}
