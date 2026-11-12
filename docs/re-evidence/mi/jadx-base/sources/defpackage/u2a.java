package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class u2a extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;

    public u2a(Object obj, View view, int i, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
    }
}
