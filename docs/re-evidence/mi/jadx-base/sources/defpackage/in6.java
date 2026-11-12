package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class in6 extends ViewDataBinding {
    public final LinearLayout A;
    public final ConstraintLayout B;
    public final kn6 C;

    public in6(Object obj, View view, int i, LinearLayout linearLayout, ConstraintLayout constraintLayout, kn6 kn6Var) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = constraintLayout;
        this.C = kn6Var;
    }
}
