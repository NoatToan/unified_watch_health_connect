package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tm4 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;

    public tm4(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
    }
}
