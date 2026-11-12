package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d29 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;

    public d29(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
    }

    public static d29 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static d29 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (d29) ViewDataBinding.G(layoutInflater, ovi.D, viewGroup, z, obj);
    }
}
