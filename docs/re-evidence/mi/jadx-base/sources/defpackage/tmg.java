package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tmg extends ViewDataBinding {
    public final AppCompatImageView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final TextView D;

    public tmg(Object obj, View view, int i, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = constraintLayout;
        this.C = textView;
        this.D = textView2;
    }
}
