package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class opn extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;

    public opn(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
    }

    public static opn A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static opn B0(LayoutInflater layoutInflater, Object obj) {
        return (opn) ViewDataBinding.G(layoutInflater, dvi.F0, null, false, obj);
    }
}
