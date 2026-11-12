package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rop extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final TextView C;

    public rop(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = textView2;
    }
}
