package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class r1g extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;

    public r1g(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
    }

    public static r1g A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static r1g B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (r1g) ViewDataBinding.G(layoutInflater, rui.n, viewGroup, z, obj);
    }
}
