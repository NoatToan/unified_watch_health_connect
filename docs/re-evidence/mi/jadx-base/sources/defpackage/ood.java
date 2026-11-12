package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ood extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;

    public ood(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
    }

    public static ood A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ood B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ood) ViewDataBinding.G(layoutInflater, ivi.r0, viewGroup, z, obj);
    }
}
