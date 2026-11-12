package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bqp extends ViewDataBinding {
    public final View A;
    public final TextView B;

    public bqp(Object obj, View view, int i, View view2, TextView textView) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
    }

    public static bqp A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static bqp B0(View view, Object obj) {
        return (bqp) ViewDataBinding.k(obj, view, ivi.g2);
    }
}
