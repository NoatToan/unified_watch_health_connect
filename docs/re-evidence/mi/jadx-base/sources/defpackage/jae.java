package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jae extends ViewDataBinding {
    public final TextView A;

    public jae(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public static jae A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static jae B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (jae) ViewDataBinding.G(layoutInflater, eui.Z2, viewGroup, z, obj);
    }
}
