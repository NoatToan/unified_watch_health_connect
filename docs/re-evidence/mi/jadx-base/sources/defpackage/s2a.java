package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class s2a extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;

    public s2a(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = constraintLayout;
        this.D = constraintLayout2;
    }
}
