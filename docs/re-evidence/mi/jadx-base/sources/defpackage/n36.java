package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n36 extends ViewDataBinding {
    public final AppCompatTextView A;

    public n36(Object obj, View view, int i, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = appCompatTextView;
    }

    public static n36 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static n36 B0(LayoutInflater layoutInflater, Object obj) {
        return (n36) ViewDataBinding.G(layoutInflater, dui.l, null, false, obj);
    }
}
