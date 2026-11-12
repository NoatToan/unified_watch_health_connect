package defpackage;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class srp extends ViewDataBinding {
    public final EditText A;
    public final ConstraintLayout B;

    public srp(Object obj, View view, int i, EditText editText, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = editText;
        this.B = constraintLayout;
    }
}
