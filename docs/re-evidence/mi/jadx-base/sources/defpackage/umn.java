package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class umn extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final ConstraintLayout D;
    public final TextView E;

    public umn(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, ConstraintLayout constraintLayout, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = constraintLayout;
        this.E = textView3;
    }
}
