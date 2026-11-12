package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ayb extends ViewDataBinding {
    public final View A;
    public final AppCompatImageView B;
    public final RelativeLayout C;
    public final TextView D;

    public ayb(Object obj, View view, int i, View view2, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.A = view2;
        this.B = appCompatImageView;
        this.C = relativeLayout;
        this.D = textView;
    }

    public static ayb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ayb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ayb) ViewDataBinding.G(layoutInflater, jui.p4, viewGroup, z, obj);
    }
}
