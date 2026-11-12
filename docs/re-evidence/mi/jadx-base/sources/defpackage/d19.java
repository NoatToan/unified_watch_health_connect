package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d19 extends ViewDataBinding {
    public final ImageView A;

    public d19(Object obj, View view, int i, ImageView imageView) {
        super(obj, view, i);
        this.A = imageView;
    }

    public static d19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static d19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (d19) ViewDataBinding.G(layoutInflater, ovi.n, viewGroup, z, obj);
    }
}
