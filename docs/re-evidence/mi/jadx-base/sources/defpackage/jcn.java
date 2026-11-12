package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jcn extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;

    public jcn(Object obj, View view, int i, TextView textView, ImageView imageView) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
    }

    public static jcn A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static jcn B0(LayoutInflater layoutInflater, Object obj) {
        return (jcn) ViewDataBinding.G(layoutInflater, dvi.U, null, false, obj);
    }
}
