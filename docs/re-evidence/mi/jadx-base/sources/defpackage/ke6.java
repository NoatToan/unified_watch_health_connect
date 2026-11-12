package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ke6 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;

    public ke6(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
    }

    public static ke6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ke6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ke6) ViewDataBinding.G(layoutInflater, eui.u, viewGroup, z, obj);
    }
}
