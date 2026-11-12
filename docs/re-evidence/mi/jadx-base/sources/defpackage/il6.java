package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class il6 extends ViewDataBinding {
    public final TextView A;

    public il6(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public static il6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static il6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (il6) ViewDataBinding.G(layoutInflater, eui.C1, viewGroup, z, obj);
    }
}
