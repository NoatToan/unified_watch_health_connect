package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ban extends ViewDataBinding {
    public final TextView A;

    public ban(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public static ban A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static ban B0(LayoutInflater layoutInflater, Object obj) {
        return (ban) ViewDataBinding.G(layoutInflater, dvi.P, null, false, obj);
    }
}
