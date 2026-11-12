package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.CheckedTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class iba extends ViewDataBinding {
    public final CheckedTextView A;
    public final CheckedTextView B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final NestedScrollView E;

    public iba(Object obj, View view, int i, CheckedTextView checkedTextView, CheckedTextView checkedTextView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = checkedTextView;
        this.B = checkedTextView2;
        this.C = constraintLayout;
        this.D = constraintLayout2;
        this.E = nestedScrollView;
    }
}
