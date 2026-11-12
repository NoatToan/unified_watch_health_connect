package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class amn extends ViewDataBinding {
    public final ImageView A;
    public final FrameLayout B;
    public final ImageView C;
    public final TextView D;

    public amn(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = frameLayout;
        this.C = imageView2;
        this.D = textView;
    }

    public static amn A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static amn B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (amn) ViewDataBinding.G(layoutInflater, dvi.e0, viewGroup, z, obj);
    }
}
