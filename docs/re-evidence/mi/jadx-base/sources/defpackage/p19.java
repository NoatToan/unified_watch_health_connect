package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p19 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final TextView F;

    public p19(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = imageView4;
        this.F = textView2;
    }

    public static p19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static p19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (p19) ViewDataBinding.G(layoutInflater, ovi.t, viewGroup, z, obj);
    }
}
