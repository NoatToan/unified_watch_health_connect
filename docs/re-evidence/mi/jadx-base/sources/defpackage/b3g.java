package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b3g extends ViewDataBinding {
    public final AppCompatImageView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final View E;
    public final FrameLayout F;
    public final TextView G;
    public final TextView H;

    public b3g(Object obj, View view, int i, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, ImageView imageView, View view2, FrameLayout frameLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = textView;
        this.C = textView2;
        this.D = imageView;
        this.E = view2;
        this.F = frameLayout;
        this.G = textView3;
        this.H = textView4;
    }

    public static b3g A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static b3g B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (b3g) ViewDataBinding.G(layoutInflater, bvi.f, viewGroup, z, obj);
    }
}
