package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j3g extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final ImageView C;

    public j3g(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = imageView;
    }
}
