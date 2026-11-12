package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ynd extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;

    public ynd(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
    }

    public static ynd A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ynd B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ynd) ViewDataBinding.G(layoutInflater, jvi.Q, viewGroup, z, obj);
    }
}
