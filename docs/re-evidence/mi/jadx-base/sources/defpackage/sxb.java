package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class sxb extends ViewDataBinding {
    public final RelativeLayout A;
    public final TextView B;

    public sxb(Object obj, View view, int i, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = textView;
    }

    public static sxb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static sxb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (sxb) ViewDataBinding.G(layoutInflater, jui.k4, viewGroup, z, obj);
    }
}
