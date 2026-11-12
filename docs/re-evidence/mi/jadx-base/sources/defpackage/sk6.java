package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sk6 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;

    public sk6(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
    }

    public static sk6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static sk6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (sk6) ViewDataBinding.G(layoutInflater, eui.d1, viewGroup, z, obj);
    }
}
