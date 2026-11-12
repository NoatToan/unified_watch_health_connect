package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vbe extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final TextView F;
    public final TextView G;

    public vbe(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = imageView4;
        this.F = textView;
        this.G = textView2;
    }
}
