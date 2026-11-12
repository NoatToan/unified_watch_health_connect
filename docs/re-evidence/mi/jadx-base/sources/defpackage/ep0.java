package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ep0 extends ViewDataBinding {
    public final View A;
    public final TextView B;

    public ep0(Object obj, View view, int i, View view2, TextView textView) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
    }

    public static ep0 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ep0 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ep0) ViewDataBinding.G(layoutInflater, ivi.e, viewGroup, z, obj);
    }
}
