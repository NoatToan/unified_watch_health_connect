package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nde extends ViewDataBinding {
    public final TextView A;

    public nde(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public static nde A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static nde B0(LayoutInflater layoutInflater, Object obj) {
        return (nde) ViewDataBinding.G(layoutInflater, ivi.o1, null, false, obj);
    }
}
