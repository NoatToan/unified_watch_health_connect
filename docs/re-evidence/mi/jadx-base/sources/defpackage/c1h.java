package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c1h extends ViewDataBinding {
    public final AppCompatTextView A;
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final Button E;
    public final NestedScrollView F;

    public c1h(Object obj, View view, int i, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, Button button, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = appCompatTextView;
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = button;
        this.F = nestedScrollView;
    }
}
