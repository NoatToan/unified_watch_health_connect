package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mnd extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;

    public mnd(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
        this.D = textView3;
    }

    public static mnd A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static mnd B0(LayoutInflater layoutInflater, Object obj) {
        return (mnd) ViewDataBinding.G(layoutInflater, jvi.O, null, false, obj);
    }
}
