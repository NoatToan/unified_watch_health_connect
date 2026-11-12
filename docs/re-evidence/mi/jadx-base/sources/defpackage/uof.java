package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class uof extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final RecyclerView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public uof(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = recyclerView;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
    }
}
