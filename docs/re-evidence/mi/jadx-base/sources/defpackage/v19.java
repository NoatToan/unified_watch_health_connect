package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v19 extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final LinearLayout C;
    public final ImageView D;

    public v19(Object obj, View view, int i, ImageView imageView, TextView textView, LinearLayout linearLayout, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = linearLayout;
        this.D = imageView2;
    }

    public static v19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static v19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (v19) ViewDataBinding.G(layoutInflater, ovi.w, viewGroup, z, obj);
    }
}
