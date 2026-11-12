package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v29 extends ViewDataBinding {
    public final TextView A;

    public v29(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public static v29 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static v29 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (v29) ViewDataBinding.G(layoutInflater, ovi.N, viewGroup, z, obj);
    }
}
