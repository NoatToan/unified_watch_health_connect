package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wl6 extends ViewDataBinding {
    public final TextView A;
    public final AppCompatImageView B;
    public final TextView C;
    public clf D;

    public wl6(Object obj, View view, int i, TextView textView, AppCompatImageView appCompatImageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = appCompatImageView;
        this.C = textView2;
    }

    public static wl6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static wl6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wl6) ViewDataBinding.G(layoutInflater, eui.J1, viewGroup, z, obj);
    }

    public abstract void C0(clf clfVar);
}
