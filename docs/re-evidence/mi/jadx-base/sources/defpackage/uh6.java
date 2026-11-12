package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class uh6 extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final LinearLayout C;
    public final ImageView D;
    public final RecyclerView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public uh6(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView2, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = linearLayout;
        this.D = imageView;
        this.E = recyclerView2;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
    }
}
