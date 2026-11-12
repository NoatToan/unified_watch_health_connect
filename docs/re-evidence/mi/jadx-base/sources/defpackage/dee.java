package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dee extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;

    public dee(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = textView;
        this.D = imageView3;
        this.E = textView2;
    }

    public static dee A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static dee B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (dee) ViewDataBinding.G(layoutInflater, uvi.d, viewGroup, z, obj);
    }
}
