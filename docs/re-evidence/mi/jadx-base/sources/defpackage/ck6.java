package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ck6 extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final ProgressBar C;
    public final TextView D;
    public final RecyclerView E;
    public final ProgressBar F;
    public final TextView G;

    public ck6(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, ProgressBar progressBar, TextView textView2, RecyclerView recyclerView, ProgressBar progressBar2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = progressBar;
        this.D = textView2;
        this.E = recyclerView;
        this.F = progressBar2;
        this.G = textView3;
    }
}
