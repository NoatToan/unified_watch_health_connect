package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class gyb extends ViewDataBinding {
    public final ConstraintLayout A;
    public final AppCompatImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public gyb(Object obj, View view, int i, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = appCompatImageView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }
}
