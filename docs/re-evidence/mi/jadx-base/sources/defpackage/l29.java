package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l29 extends ViewDataBinding {
    public final ImageView A;

    public l29(Object obj, View view, int i, ImageView imageView) {
        super(obj, view, i);
        this.A = imageView;
    }

    public static l29 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static l29 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l29) ViewDataBinding.G(layoutInflater, ovi.I, viewGroup, z, obj);
    }
}
