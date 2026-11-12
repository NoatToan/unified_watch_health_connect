package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mf6 extends ViewDataBinding {
    public final LinearLayout A;
    public final ConstraintLayout B;
    public final ImageView C;
    public final RecyclerView D;
    public final ProgressBar E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public mf6(Object obj, View view, int i, LinearLayout linearLayout, ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = constraintLayout;
        this.C = imageView;
        this.D = recyclerView;
        this.E = progressBar;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
    }
}
