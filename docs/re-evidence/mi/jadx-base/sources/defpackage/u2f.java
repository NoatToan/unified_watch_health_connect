package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u2f extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;

    public u2f(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
    }

    public static u2f A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static u2f B0(LayoutInflater layoutInflater, Object obj) {
        return (u2f) ViewDataBinding.G(layoutInflater, nui.e, null, false, obj);
    }
}
