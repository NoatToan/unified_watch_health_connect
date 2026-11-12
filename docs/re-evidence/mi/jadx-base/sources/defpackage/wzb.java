package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wzb extends ViewDataBinding {
    public final LinearLayout A;
    public final qxb B;
    public final RecyclerView C;

    public wzb(Object obj, View view, int i, LinearLayout linearLayout, qxb qxbVar, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = qxbVar;
        this.C = recyclerView;
    }
}
