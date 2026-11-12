package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jxh extends ViewDataBinding {
    public final NestedScrollView A;
    public final TextView B;
    public final TextView C;
    public final RecyclerView D;
    public final RecyclerView E;
    public final RecyclerView F;

    public jxh(Object obj, View view, int i, NestedScrollView nestedScrollView, TextView textView, TextView textView2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        super(obj, view, i);
        this.A = nestedScrollView;
        this.B = textView;
        this.C = textView2;
        this.D = recyclerView;
        this.E = recyclerView2;
        this.F = recyclerView3;
    }
}
