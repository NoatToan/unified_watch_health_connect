package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wdk extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final TextView C;
    public final NestedScrollView D;
    public final RecyclerView E;
    public final ConstraintLayout F;
    public final RecyclerView G;
    public final RecyclerView H;

    public wdk(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, NestedScrollView nestedScrollView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = textView;
        this.D = nestedScrollView;
        this.E = recyclerView;
        this.F = constraintLayout2;
        this.G = recyclerView2;
        this.H = recyclerView3;
    }
}
