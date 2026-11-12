package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lqp extends ViewDataBinding {
    public final TextView A;

    public lqp(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public static lqp A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static lqp B0(View view, Object obj) {
        return (lqp) ViewDataBinding.k(obj, view, ivi.o2);
    }
}
