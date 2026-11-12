package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cpn extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;

    public cpn(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
    }

    public static cpn A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static cpn B0(LayoutInflater layoutInflater, Object obj) {
        return (cpn) ViewDataBinding.G(layoutInflater, dvi.w0, null, false, obj);
    }
}
