package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mg6 extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final RecyclerView E;

    public mg6(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = textView2;
        this.D = textView3;
        this.E = recyclerView;
    }
}
