package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ceb extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ConstraintLayout F;
    public final TextView G;
    public final ImageView H;
    public final TextView I;
    public final ImageView J;
    public final NestedScrollView K;

    public ceb(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, TextView textView5, ImageView imageView2, TextView textView6, ImageView imageView3, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = constraintLayout;
        this.G = textView5;
        this.H = imageView2;
        this.I = textView6;
        this.J = imageView3;
        this.K = nestedScrollView;
    }
}
