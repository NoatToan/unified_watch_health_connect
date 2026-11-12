package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nwb extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final RelativeLayout C;
    public final TextView D;
    public final ImageView E;
    public final RecyclerView F;
    public final TextView G;
    public final TextView H;

    public nwb(Object obj, View view, int i, TextView textView, View view2, RelativeLayout relativeLayout, TextView textView2, ImageView imageView, RecyclerView recyclerView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = relativeLayout;
        this.D = textView2;
        this.E = imageView;
        this.F = recyclerView;
        this.G = textView3;
        this.H = textView4;
    }
}
