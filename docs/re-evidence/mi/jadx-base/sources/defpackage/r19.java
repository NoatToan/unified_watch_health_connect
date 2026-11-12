package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r19 extends ViewDataBinding {
    public final ImageView A;

    public r19(Object obj, View view, int i, ImageView imageView) {
        super(obj, view, i);
        this.A = imageView;
    }

    public static r19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static r19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (r19) ViewDataBinding.G(layoutInflater, ovi.u, viewGroup, z, obj);
    }
}
