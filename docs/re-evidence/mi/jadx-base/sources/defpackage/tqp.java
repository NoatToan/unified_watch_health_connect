package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tqp extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final TextView E;
    public final okp F;

    public tqp(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, okp okpVar) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = textView;
        this.F = okpVar;
    }
}
