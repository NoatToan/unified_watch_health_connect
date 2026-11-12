package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class yzh extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;

    public yzh(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
    }

    public static yzh A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static yzh B0(LayoutInflater layoutInflater, Object obj) {
        return (yzh) ViewDataBinding.G(layoutInflater, kvi.c, null, false, obj);
    }
}
