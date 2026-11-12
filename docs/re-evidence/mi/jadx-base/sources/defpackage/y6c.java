package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class y6c extends ViewDataBinding {
    public final View A;
    public final View B;
    public final TextView C;
    public final Guideline D;

    public y6c(Object obj, View view, int i, View view2, View view3, TextView textView, Guideline guideline) {
        super(obj, view, i);
        this.A = view2;
        this.B = view3;
        this.C = textView;
        this.D = guideline;
    }
}
