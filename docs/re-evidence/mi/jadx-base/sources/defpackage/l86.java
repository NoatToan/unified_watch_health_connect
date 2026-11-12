package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l86 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;

    public l86(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
    }

    public static l86 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static l86 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l86) ViewDataBinding.G(layoutInflater, dui.J, viewGroup, z, obj);
    }
}
