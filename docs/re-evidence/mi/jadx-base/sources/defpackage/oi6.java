package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oi6 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final View B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final RecyclerView E;
    public final TextView F;
    public final TextView G;

    public oi6(Object obj, View view, int i, ConstraintLayout constraintLayout, View view2, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = view2;
        this.C = linearLayout;
        this.D = linearLayout2;
        this.E = recyclerView;
        this.F = textView;
        this.G = textView2;
    }
}
