package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vx7 extends ViewDataBinding {
    public final px7 A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;

    public vx7(Object obj, View view, int i, px7 px7Var, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = px7Var;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
    }

    public static vx7 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static vx7 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vx7) ViewDataBinding.G(layoutInflater, fvi.v, viewGroup, z, obj);
    }
}
