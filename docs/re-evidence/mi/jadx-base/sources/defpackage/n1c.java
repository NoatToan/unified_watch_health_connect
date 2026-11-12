package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class n1c extends ViewDataBinding {
    public final View A;
    public final AppCompatImageView B;
    public final TextView C;
    public final TextView D;

    public n1c(Object obj, View view, int i, View view2, AppCompatImageView appCompatImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = view2;
        this.B = appCompatImageView;
        this.C = textView;
        this.D = textView2;
    }

    public static n1c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static n1c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (n1c) ViewDataBinding.G(layoutInflater, jui.e5, viewGroup, z, obj);
    }
}
