package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qpn extends ViewDataBinding {
    public final CheckedTextView A;
    public final TextView B;
    public final TextView C;

    public qpn(Object obj, View view, int i, CheckedTextView checkedTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = checkedTextView;
        this.B = textView;
        this.C = textView2;
    }

    public static qpn A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qpn B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qpn) ViewDataBinding.G(layoutInflater, dvi.G0, viewGroup, z, obj);
    }
}
