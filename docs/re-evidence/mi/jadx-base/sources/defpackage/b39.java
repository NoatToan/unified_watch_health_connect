package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b39 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;

    public b39(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
    }

    public static b39 A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static b39 B0(LayoutInflater layoutInflater, Object obj) {
        return (b39) ViewDataBinding.G(layoutInflater, ovi.Q, null, false, obj);
    }
}
