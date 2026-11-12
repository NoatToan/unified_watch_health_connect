package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nqp extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;

    public nqp(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = imageView2;
        this.E = textView3;
        this.F = textView4;
    }

    public static nqp A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static nqp B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (nqp) ViewDataBinding.G(layoutInflater, ivi.p2, viewGroup, z, obj);
    }
}
