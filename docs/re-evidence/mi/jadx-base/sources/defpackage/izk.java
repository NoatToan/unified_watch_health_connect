package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class izk extends ViewDataBinding {
    public final View A;
    public final TextView B;

    public izk(Object obj, View view, int i, View view2, TextView textView) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
    }

    public static izk A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static izk B0(LayoutInflater layoutInflater, Object obj) {
        return (izk) ViewDataBinding.G(layoutInflater, bvi.q, null, false, obj);
    }
}
