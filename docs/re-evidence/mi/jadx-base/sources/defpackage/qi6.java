package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qi6 extends ViewDataBinding {
    public final RecyclerView A;
    public final ConstraintLayout B;
    public final LinearLayout C;
    public final ImageView D;
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    public qi6(Object obj, View view, int i, RecyclerView recyclerView, ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = constraintLayout;
        this.C = linearLayout;
        this.D = imageView;
        this.E = linearLayout2;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
        this.I = textView4;
    }
}
