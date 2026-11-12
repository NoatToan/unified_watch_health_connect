package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zbf extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final RelativeLayout C;
    public final ImageView D;
    public final TextView E;
    public final RecyclerView F;
    public final TextView G;
    public final ConstraintLayout H;

    public zbf(Object obj, View view, int i, ImageView imageView, TextView textView, RelativeLayout relativeLayout, ImageView imageView2, TextView textView2, RecyclerView recyclerView, TextView textView3, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = relativeLayout;
        this.D = imageView2;
        this.E = textView2;
        this.F = recyclerView;
        this.G = textView3;
        this.H = constraintLayout;
    }
}
