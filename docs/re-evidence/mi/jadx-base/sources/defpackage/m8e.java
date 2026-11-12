package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class m8e extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final TextView D;

    public m8e(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = textView2;
        this.D = textView3;
    }
}
