package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class w9e extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;

    public w9e(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
    }

    public static w9e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static w9e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (w9e) ViewDataBinding.G(layoutInflater, eui.Q2, viewGroup, z, obj);
    }
}
