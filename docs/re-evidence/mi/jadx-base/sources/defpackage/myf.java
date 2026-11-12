package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class myf extends ViewDataBinding {
    public final AppCompatImageView A;
    public final TextView B;
    public final ConstraintLayout C;

    public myf(Object obj, View view, int i, AppCompatImageView appCompatImageView, TextView textView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = textView;
        this.C = constraintLayout;
    }

    public static myf A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static myf B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (myf) ViewDataBinding.G(layoutInflater, rui.g, viewGroup, z, obj);
    }
}
