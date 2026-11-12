package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wi6 extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;

    public wi6(Object obj, View view, int i, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
    }

    public static wi6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static wi6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wi6) ViewDataBinding.G(layoutInflater, eui.E0, viewGroup, z, obj);
    }
}
