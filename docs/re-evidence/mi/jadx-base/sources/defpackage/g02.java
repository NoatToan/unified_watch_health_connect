package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g02 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final TextView D;

    public g02(Object obj, View view, int i, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = textView;
    }

    public static g02 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static g02 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (g02) ViewDataBinding.G(layoutInflater, cwi.f14803a, viewGroup, z, obj);
    }
}
