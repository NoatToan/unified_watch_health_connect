package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fin extends ViewDataBinding {
    public final ImageView A;

    public fin(Object obj, View view, int i, ImageView imageView) {
        super(obj, view, i);
        this.A = imageView;
    }

    public static fin A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static fin B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (fin) ViewDataBinding.G(layoutInflater, ivi.y1, viewGroup, z, obj);
    }
}
