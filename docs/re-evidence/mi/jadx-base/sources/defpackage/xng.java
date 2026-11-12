package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xng extends ViewDataBinding {
    public final AppCompatTextView A;
    public final TextView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final ConstraintLayout E;
    public final TextView F;
    public final NestedScrollView G;
    public final AppCompatTextView H;

    public xng(Object obj, View view, int i, AppCompatTextView appCompatTextView, TextView textView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, TextView textView2, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView3) {
        super(obj, view, i);
        this.A = appCompatTextView;
        this.B = textView;
        this.C = appCompatImageView;
        this.D = appCompatTextView2;
        this.E = constraintLayout;
        this.F = textView2;
        this.G = nestedScrollView;
        this.H = appCompatTextView3;
    }
}
