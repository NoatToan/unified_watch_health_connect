package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ym6 extends ViewDataBinding {
    public final Barrier A;
    public final LinearLayout B;
    public final RecyclerView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public ym6(Object obj, View view, int i, Barrier barrier, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = barrier;
        this.B = linearLayout;
        this.C = recyclerView;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
    }
}
