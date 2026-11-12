package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nnh extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;

    public nnh(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
        this.D = textView2;
    }

    public static nnh A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static nnh B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (nnh) ViewDataBinding.G(layoutInflater, uui.e, viewGroup, z, obj);
    }
}
