package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public abstract class cn6 extends ViewDataBinding {
    public final EditText A;

    public cn6(Object obj, View view, int i, EditText editText) {
        super(obj, view, i);
        this.A = editText;
    }

    public static cn6 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static cn6 B0(LayoutInflater layoutInflater, Object obj) {
        return (cn6) ViewDataBinding.G(layoutInflater, eui.e2, null, false, obj);
    }
}
