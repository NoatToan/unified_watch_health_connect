package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r29 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public final FrameLayout D;
    public final ImageView E;
    public final FrameLayout F;
    public final ImageView G;
    public final FrameLayout H;
    public final TextView I;

    public r29(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, FrameLayout frameLayout, ImageView imageView3, FrameLayout frameLayout2, ImageView imageView4, FrameLayout frameLayout3, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
        this.D = frameLayout;
        this.E = imageView3;
        this.F = frameLayout2;
        this.G = imageView4;
        this.H = frameLayout3;
        this.I = textView2;
    }

    public static r29 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static r29 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (r29) ViewDataBinding.G(layoutInflater, ovi.K, viewGroup, z, obj);
    }
}
