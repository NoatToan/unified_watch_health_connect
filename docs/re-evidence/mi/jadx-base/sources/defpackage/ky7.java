package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ky7 extends ViewDataBinding {
    public final CheckedTextView A;
    public final TextView B;
    public final TextView C;

    public ky7(Object obj, View view, int i, CheckedTextView checkedTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = checkedTextView;
        this.B = textView;
        this.C = textView2;
    }

    public static ky7 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ky7 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ky7) ViewDataBinding.G(layoutInflater, fvi.H, viewGroup, z, obj);
    }
}
