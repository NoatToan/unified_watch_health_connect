package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class gh0 extends ViewDataBinding {
    public final FrameLayout A;
    public final ConstraintLayout B;

    public gh0(Object obj, View view, int i, FrameLayout frameLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = constraintLayout;
    }
}
