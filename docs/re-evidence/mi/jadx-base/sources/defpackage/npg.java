package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class npg extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ConstraintLayout F;

    public npg(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
        this.F = constraintLayout;
    }
}
