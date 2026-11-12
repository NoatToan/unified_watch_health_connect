package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mca extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;

    public mca(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
    }
}
