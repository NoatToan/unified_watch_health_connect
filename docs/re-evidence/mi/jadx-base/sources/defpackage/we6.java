package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class we6 extends ViewDataBinding {
    public final EditText A;
    public final CheckBox B;

    public we6(Object obj, View view, int i, EditText editText, CheckBox checkBox) {
        super(obj, view, i);
        this.A = editText;
        this.B = checkBox;
    }

    public static we6 A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static we6 B0(View view, Object obj) {
        return (we6) ViewDataBinding.k(obj, view, eui.B);
    }
}
