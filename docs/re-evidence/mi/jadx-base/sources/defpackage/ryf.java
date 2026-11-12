package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ryf extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ConstraintLayout C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public ryf(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = constraintLayout;
        this.D = imageView3;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
    }
}
