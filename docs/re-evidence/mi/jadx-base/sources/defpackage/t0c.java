package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.appcompat.widget.Spinner;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t0c extends ViewDataBinding {
    public final Spinner A;
    public final RelativeLayout B;
    public final TextView C;

    public t0c(Object obj, View view, int i, Spinner spinner, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.A = spinner;
        this.B = relativeLayout;
        this.C = textView;
    }

    public static t0c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static t0c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (t0c) ViewDataBinding.G(layoutInflater, jui.Z4, viewGroup, z, obj);
    }
}
