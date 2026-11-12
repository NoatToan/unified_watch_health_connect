package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.CheckedTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ug6 extends ViewDataBinding {
    public final Button A;
    public final CheckedTextView B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final CheckedTextView F;
    public final ConstraintLayout G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final Button J;
    public final NestedScrollView K;

    public ug6(Object obj, View view, int i, Button button, CheckedTextView checkedTextView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, CheckedTextView checkedTextView2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Button button2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = button;
        this.B = checkedTextView;
        this.C = constraintLayout;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
        this.F = checkedTextView2;
        this.G = constraintLayout2;
        this.H = appCompatTextView3;
        this.I = appCompatTextView4;
        this.J = button2;
        this.K = nestedScrollView;
    }
}
