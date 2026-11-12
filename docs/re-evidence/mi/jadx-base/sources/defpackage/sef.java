package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class sef extends ViewDataBinding {
    public final View A;
    public final ConstraintLayout B;
    public final TextView C;
    public ecf D;

    public sef(Object obj, View view, int i, View view2, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.A = view2;
        this.B = constraintLayout;
        this.C = textView;
    }
}
