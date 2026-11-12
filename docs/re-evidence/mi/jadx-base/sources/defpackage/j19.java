package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j19 extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;

    public j19(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = imageView3;
    }

    public static j19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static j19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j19) ViewDataBinding.G(layoutInflater, ovi.q, viewGroup, z, obj);
    }
}
