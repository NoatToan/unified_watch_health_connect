package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class okp extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;

    public okp(Object obj, View view, int i, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
    }
}
