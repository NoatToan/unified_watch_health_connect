package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f29 extends ViewDataBinding {
    public final TextView A;

    public f29(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public static f29 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static f29 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (f29) ViewDataBinding.G(layoutInflater, ovi.E, viewGroup, z, obj);
    }
}
