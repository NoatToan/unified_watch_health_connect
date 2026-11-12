package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ozg extends ViewDataBinding {
    public final TextView A;
    public final TextView B;

    public ozg(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
    }

    public static ozg A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ozg B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ozg) ViewDataBinding.G(layoutInflater, tui.h, viewGroup, z, obj);
    }
}
