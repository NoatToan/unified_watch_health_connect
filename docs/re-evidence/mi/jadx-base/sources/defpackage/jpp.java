package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jpp extends ViewDataBinding {
    public final TextView A;
    public final TextView B;

    public jpp(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
    }

    public static jpp A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static jpp B0(View view, Object obj) {
        return (jpp) ViewDataBinding.k(obj, view, ivi.X1);
    }
}
