package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t1c extends ViewDataBinding {
    public final AppCompatImageView A;
    public final AppCompatImageView B;
    public final TextView C;

    public t1c(Object obj, View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = appCompatImageView2;
        this.C = textView;
    }

    public static t1c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static t1c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (t1c) ViewDataBinding.G(layoutInflater, jui.u5, viewGroup, z, obj);
    }
}
