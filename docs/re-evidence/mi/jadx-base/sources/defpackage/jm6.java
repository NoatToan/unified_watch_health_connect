package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jm6 extends ViewDataBinding {
    public final lm6 A;
    public final LinearLayout B;
    public final RecyclerView C;

    public jm6(Object obj, View view, int i, lm6 lm6Var, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = lm6Var;
        this.B = linearLayout;
        this.C = recyclerView;
    }
}
