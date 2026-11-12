package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class eod extends ViewDataBinding {
    public final TextView A;
    public final TextView B;

    public eod(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
    }

    public static eod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static eod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (eod) ViewDataBinding.G(layoutInflater, jui.n6, viewGroup, z, obj);
    }
}
