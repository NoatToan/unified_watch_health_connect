package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p30 extends ViewDataBinding {
    public final LinearLayout A;
    public final LinearLayout B;
    public final View C;
    public final RecyclerView D;
    public final ImageView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final NestedScrollView J;

    public p30(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, View view2, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = linearLayout2;
        this.C = view2;
        this.D = recyclerView;
        this.E = imageView;
        this.F = imageView2;
        this.G = textView;
        this.H = textView2;
        this.I = textView3;
        this.J = nestedScrollView;
    }
}
