package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class iy7 extends ViewDataBinding {
    public final View A;
    public final TextView B;
    public final RelativeLayout C;

    public iy7(Object obj, View view, int i, View view2, TextView textView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
        this.C = relativeLayout;
    }

    public static iy7 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static iy7 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (iy7) ViewDataBinding.G(layoutInflater, fvi.D, viewGroup, z, obj);
    }
}
