package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class snd extends ViewDataBinding {
    public final TextView A;
    public final View B;

    public snd(Object obj, View view, int i, TextView textView, View view2) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
    }

    public static snd A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static snd B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (snd) ViewDataBinding.G(layoutInflater, eui.F2, viewGroup, z, obj);
    }
}
