package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dde extends ViewDataBinding {
    public final ConstraintLayout A;
    public final AppCompatImageView B;
    public final TextView C;
    public final TextView D;

    public dde(Object obj, View view, int i, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = appCompatImageView;
        this.C = textView;
        this.D = textView2;
    }
}
